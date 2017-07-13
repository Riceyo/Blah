import os

path = os.getcwd() # get current working directory

filenames = os.listdir(path)

for filename in filenames:
    os.rename(filename, filename.replace("1080p", "").lower())

filenames = os.listdir(path)
	
for filename in filenames:
    os.rename(filename, filename.replace("720p", "").lower())
	
