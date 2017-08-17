import os

dlpath = "N:\\downloads\\test\\"
replacewithspace = {".", ",", "-", "_", "(", ")", "[", "]", "{", "}"}
replacewithnothing = {"1080p", "720p", "480p", "brrip", "hdrip", "webrip", "dvdrip", "dvdscr"}
filenames = os.listdir(dlpath)
for filename in filenames:
    filenamebase = os.path.splitext(os.path.basename(filename))[0]
    filenameext = os.path.splitext(os.path.basename(filename))[1]
    for loop in replacewithspace:
        filenamebase = filenamebase.replace(loop, " ")
    for loop in replacewithnothing:
        filenamebase = filenamebase.replace(loop, "")
    filenamebase = " ".join(filenamebase.split()).strip().lower()
    filenameext = filenameext.lower()    
    os.rename(os.path.join(dlpath, filename), os.path.join(dlpath, filenamebase + filenameext))
