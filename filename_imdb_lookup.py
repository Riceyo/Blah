import os
import imdb

def main():
	dlpath = "N:\\media\\#\\"	
	objimdb = imdb.IMDb()
	filenames = os.listdir(dlpath)
	for filename in filenames:
		filenamebase = os.path.splitext(os.path.basename(filename))[0].lower()
		search = objimdb.search_movie(filenamebase)
		res = search[0]
		objimdb.update(res)		
		outstr = res['long imdb title'] + "\t"
		outstr += str(res['rating']) + "\t"
		outstr += str(res['votes']) + "\t"
		blah = res['runtime']
		outstr += str(blah[0])	+ "\t"
		#outstr = outstr + res['director']
		#outstr = outstr + res['cast']
		#outstr = outstr + res['genres']		
		print(outstr)

if __name__ == '__main__':
    main()
