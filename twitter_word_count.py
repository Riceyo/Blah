import datetime
import re
from TwitterSearch import *
from collections import *

ts = TwitterSearch(
    consumer_key = '',
    consumer_secret = '',
    access_token = '',
    access_token_secret = ''
)

tso = TwitterSearchOrder()
tso.set_keywords(['$crypto', '#crypto', 'crypto', 'cryptocurrency'])
tso.set_language('en')
tso.set_count(100)
tso.set_include_entities(False)

tweetstring = ''
for tweet in ts.search_tweets_iterable(tso):
    tweetstring = tweetstring + str(tweet['text'].encode("utf-8", errors = 'ignore'))

tweetstring = tweetstring.lower()
tweetstring = ' '.join(tweetstring.split())
tweetstring = tweetstring.replace('.', '')
tweetstring = tweetstring.replace(',', '')
tweetstring = tweetstring.replace("'", '')
tweetstring = tweetstring.replace('-', '')
tweetstring = tweetstring.replace('_', '')
tweetstring = tweetstring.replace('the', '')
tweetstring = tweetstring.replace('is', '')
tweetstring = tweetstring.replace('you', '')
tweetstring = tweetstring.replace('why', '')
tweetstring = tweetstring.replace('this', '')
tweetstring = tweetstring.replace('are', '')
tweetstring = tweetstring.replace('in', '')
tweetstring = tweetstring.replace('of', '')
tweetstring = tweetstring.replace('or', '')
tweetstring = tweetstring.replace('th', '')
tweetstring = tweetstring.replace('to', '')
tweetstring = tweetstring.replace('when', '')
tweetstring = tweetstring.replace('and', '')
tweetstring = tweetstring.replace('hodl', '')
tweetstring = tweetstring.replace('on', '')
tweetstring = tweetstring.replace('huge', '')
tweetstring = tweetstring.replace('new', '')
tweetstring = tweetstring.replace('old', '')
tweetstring = tweetstring.replace('gas', '')
tweetstring = tweetstring.replace('weed', '')
tweetstring = tweetstring.replace('by', '')
tweetstring = tweetstring.replace('my', '')
tweetstring = tweetstring.replace(':p', '')
tweetstring = tweetstring.replace('term', '')
tweetstring = tweetstring.replace('will', '')
tweetstring = tweetstring.replace('&mp;', '')
tweetstring = tweetstring.replace('at', '')
tweetstring = tweetstring.replace('me', '')
tweetstring = tweetstring.replace('tax', '')
tweetstring = tweetstring.replace('up', '')
tweetstring = tweetstring.replace('so', '')
tweetstring = tweetstring.replace('week', '')
tweetstring = tweetstring.replace('have', '')
tweetstring = tweetstring.replace('its', '')
tweetstring = tweetstring.replace('an', '')
tweetstring = tweetstring.replace('cryp', '')
tweetstring = tweetstring.replace('be', '')
tweetstring = tweetstring.replace('loss', '')
tweetstring = tweetstring.replace('high', '')
tweetstring = tweetstring.replace('me', '')
tweetstring = tweetstring.replace('far', '')
tweetstring = tweetstring.replace('down', '')
tweetstring = tweetstring.replace('not', '')
tweetstring = tweetstring.replace('it', '')
tweetstring = tweetstring.replace('year', '')
tweetstring = tweetstring.replace('from', '')
tweetstring = tweetstring.replace('put', '')
tweetstring = tweetstring.replace('our', '')
tweetstring = tweetstring.replace('like', '')
tweetstring = tweetstring.replace('look', '')
tweetstring = tweetstring.replace('sht', '')
tweetstring = tweetstring.replace('get', '')
tweetstring = tweetstring.replace('out', '')
tweetstring = tweetstring.replace('wow', '')
tweetstring = tweetstring.replace('now', '')
tweetstring = tweetstring.replace('just', '')
tweetstring = tweetstring.replace('nice', '')
tweetstring = tweetstring.replace('big', '')
tweetstring = tweetstring.replace('bar', '')
tweetstring = tweetstring.replace('some', '')
tweetstring = ' '.join(tweetstring.split())
tweetstring = ' '.join([word for word in tweetstring.split() if len(word) < 5])
tweetstring = ' '.join([word for word in tweetstring.split() if len(word) > 1])

re.sub(r'\b@\b', '', tweetstring)
re.sub(r'\bhttp\b', '', tweetstring)

wordcount = Counter(tweetstring.split()).most_common()

wordcount = wordcount[:50]

for word in wordcount:
    print(word)
