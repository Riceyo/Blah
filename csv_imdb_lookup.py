from imdb import IMDb


def main():
    spacer = " ; "
    imdbobj = IMDb()

    with open('blah.csv') as movies:
        lines = [line.rstrip() for line in movies]

    for line in lines:
        try:
            search = imdbobj.search_movie(line)
            res = search[0]
            imdbobj.update(res)
            outputstr = res['long imdb title'] + spacer
            outputstr += str(res['rating'])
            outputstr += " (" + str(res['votes']) + ")" + spacer
            tmp = res['genres']
            outputstr += str(tmp[0]) + spacer
            tmp = res['runtime']
            outputstr += str(tmp[0]) + spacer
            # tmp = res['director']
            # outputstr += str(tmp[0]) + spacer
            tmp = res['cast']
            outputstr += str(tmp[0])
            # outputstr += ", " + str(tmp[1])
            print(outputstr)
            f = open("res.csv", "a")
            f.write(outputstr + "\n")
            f.close()
        except:
            pass


if __name__ == '__main__':
    main()
