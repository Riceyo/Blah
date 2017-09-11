import os

dlpath = "N:\\downloads\\"
replacearray = (".", ",", "-", "_", "(", ")", "[", "]", "{", "}", \
				"1080p", "720p", "480p", "brrip", "hdrip", "webrip", "dvdrip", "dvdscr", "hdtv", "h264", "x265", "xvid", "ac3", "800mb", \
				"x264", "batv", "ettv", "webtube", "hevc", "megusta", "qpel", "mkvcage", "etrg", "bluray", "yify", "aac", \
				"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017")
filenames = os.listdir(dlpath)
for filename in filenames:
    filenamebase = os.path.splitext(os.path.basename(filename))[0].lower()
    filenameext = os.path.splitext(os.path.basename(filename))[1].lower()
    for loop in replacearray:
        filenamebase = filenamebase.replace(loop, " ")
    filenamebase = " ".join(filenamebase.split()).strip()
    filenameext = filenameext.lower()    
    os.rename(os.path.join(dlpath, filename), os.path.join(dlpath, filenamebase + filenameext))
