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
tso.set_count(10)
tso.set_include_entities(False)

tweetstring = ''
for tweet in ts.search_tweets_iterable(tso):
    tweetstring = tweetstring + str(tweet['text'].encode("utf-8", errors = 'ignore'))

tweetstring = tweetstring.lower()
tweetstring = ' '.join(tweetstring.split())
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
tweetstring = tweetstring.replace('&mp;', '')
tweetstring = tweetstring.replace('at', '')
tweetstring = tweetstring.replace('me', '')
tweetstring = tweetstring.replace('out', '')
tweetstring = tweetstring.replace('just', '')
tweetstring = tweetstring.replace('bar', '')
tweetstring = tweetstring.replace('some', '')
tweetstring = tweetstring.replace('.', '')
tweetstring = tweetstring.replace(',', '')
tweetstring = tweetstring.replace('-', '')
tweetstring = tweetstring.replace('_', '')
tweetstring = ' '.join(tweetstring.split())
tweetstring = ' '.join([word for word in tweetstring.split() if len(word) < 5])
tweetstring = ' '.join([word for word in tweetstring.split() if len(word) > 1])

print(tweetstring)

re.sub(r'\b@\b', '', tweetstring)
re.sub(r'\bhttp\b', '', tweetstring)

wordcount = Counter(tweetstring.split()).most_common()

wordcount = wordcount[:20]

for x in wordcount:
    print(x)
