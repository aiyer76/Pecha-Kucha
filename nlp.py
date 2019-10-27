# Imports the Google Cloud client library
from google.cloud import language
from google.cloud.language import enums
from google.cloud.language import types
from google.oauth2 import service_account
#Import the paralleldots emotion analysis api
import paralleldots
paralleldots.set_api_key ("xHIpuPtc7o1qaeoOWYaWiPetLQxjQTNY4Sky7rX99fM")

# Instantiates a client (Set key manually)
credentials = service_account.Credentials.from_service_account_file("pechakuchaKey.json")
client = language.LanguageServiceClient(credentials=credentials)
count = 0


def getNLP(text, entities = {}):
	global client
	global count
	count += 1
	
	emotionResponse = paralleldots.emotion(text)
	emotions = emotionResponse['emotion']
	print(emotions)
	maxEmotion = ''
	maxEmotionMag = 0
	for emotion in emotions:
		if maxEmotionMag < emotions[emotion]:
			maxEmotionMag = emotions[emotion]
			maxEmotion = emotion
	print(maxEmotion)
	
	# The text to analyze
	document = types.Document(
		content=text,
		type=enums.Document.Type.PLAIN_TEXT)
	
	#Overall sentiment of the text
	documentSentiment = sentiment.score
	
	#Get a subject
	entitiyIterator = client.analyze_entities(document = document)
	highest = 0
	subject = ''
	for key in entities:
		entities[key] /= 2
	for entity in entitiyIterator.entities:
		name = entity.name
		salience = entity.salience
		if name in entities:
			entities[name] += salience
		else:
			entities[name] = salience
		if (entities[name] >= 0.1) and (count >= 3):
			highest = max(entities[name], highest)
			print(name)
	print(entities)

getNLP('I want the entities from this sentence to win')
getNLP('Why does the algorithm not cooperate with me!')
getNLP('One of the entities better win this time')
