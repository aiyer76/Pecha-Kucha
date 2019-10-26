# Imports the Google Cloud client library
from google.cloud import language
from google.cloud.language import enums
from google.cloud.language import types
from google.oauth2 import service_account

def getNLP(text):
	# Instantiates a client (Set key manually)
	credentials = service_account.Credentials.from_service_account_file("pechakuchaKey.json")
	client = language.LanguageServiceClient(credentials=credentials)

	# The text to analyze
	document = types.Document(
		content=text,
		type=enums.Document.Type.PLAIN_TEXT)

	# Detects the sentiment of the text
	sentiment = client.analyze_sentiment(document=document).document_sentiment

	print('Text: {}'.format(text))
	print('Sentiment: {}, {}'.format(sentiment.score, sentiment.magnitude))

getNLP('Got to change this to something that doesn\'t curse')