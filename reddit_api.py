import os
import dotenv
import praw

dotenv.load_dotenv(".env")

reddit = praw.Reddit(client_id=os.getenv("client_id"),
                     client_secret=os.getenv("client_secret"),
                     user_agent="testscript by /u/ricey")

subreddits = "news+worldnews+politics+unitedkingdom+ukpolitics+nottheonion" + \
             "+reddevils+soccer++sports+gaming+games+pcgaming" + \
             "+askreddit+iama+showerthoughts+todayilearned+explainlikeimfive" + \
             "+programming+science+bitcoin" + \
             "+funny+gifs+pics+aww+jokes"


def downvoted():
    downvoted_list = []
    for submission in reddit.subreddit(subreddits).new(limit=9999):
        if submission.upvote_ratio < 0.25:
            downvoted_list.append(str(submission.upvote_ratio) + " " + "http://reddit.com" + submission.permalink)
            # print("http://reddit.com" + submission.permalink)
    downvoted_list.sort()
    print(*downvoted_list, sep="\n")


def upvoted():
    upvoted_list = []
    for submission in reddit.subreddit("all").hot(limit=1000):
        if submission.upvote_ratio > 0.75:
            upvoted_list.append(str(submission.score) + " " + "http://reddit.com" + submission.permalink)
            # print("http://reddit.com" + submission.permalink)
    upvoted_list.sort()
    print(*upvoted_list, sep="\n")


# downvoted()

# upvoted()
