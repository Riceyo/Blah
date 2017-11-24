import os
import imdb
def main():
	moviepath = "N:\\media\\#\\"
	spacer = " ; "
	imdbobj = imdb.IMDb()
	filenames = os.listdir(moviepath)
	for filename in filenames:
		filenamebase = os.path.splitext(os.path.basename(filename))[0]
		search = imdbobj.search_movie(filenamebase)
		res = search[0]
		imdbobj.update(res)
		outputstr = res['long imdb title'] + spacer
		outputstr += str(res['rating'])
		outputstr += " (" + str(res['votes']) + ")" + spacer
		tmp = res['genres']
		outputstr += str(tmp[0]) + spacer
		tmp = res['runtime']
		outputstr += str(tmp[0]) + spacer
		tmp = res['director']
		outputstr += str(tmp[0]) + spacer
		tmp = res['cast']
		outputstr += str(tmp[0])
		outputstr += ", " + str(tmp[1])
		print(outputstr)
if __name__ == '__main__':
    main()
