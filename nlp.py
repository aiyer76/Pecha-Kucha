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

	print('\n\nSTATEMENT:')
	print(text)

	global client
	global count
	count += 1
	
	emotionResponse = paralleldots.emotion(text)
	emotions = emotionResponse['emotion']
	print('\nEMOTIONS:')
	print(emotions)
	maxEmotion = ''
	maxEmotionMag = 0
	for emotion in emotions:
		if maxEmotionMag < emotions[emotion]:
			maxEmotionMag = emotions[emotion]
			maxEmotion = emotion
	print('\nWINNING EMOTION')
	print(maxEmotion)
	
	# The text to analyze
	document = types.Document(
		content=text,
		type=enums.Document.Type.PLAIN_TEXT)
	
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
		if (entities[name] >= 1) and (count >= 3):
			highest = max(entities[name], highest)
			print('\nSUBJECT')
			print(name)
	print('\nENTITIES')
	print(entities)
'''
getNLP('I just failed my tests, I fel miserable right now')
getNLP('I am concerned about losing financial aid')
getNLP('My professor is is so inconsiderate, they put all their tests on the same day')
getNLP('There no support for me')
'''
getNLP('THe quick brown fox jumps over the lazy dog')
