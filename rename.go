package main

import (
	"io/ioutil"
	"log"
	"os"
	"path/filepath"
	"strings"
)

func main() {
	var dlpath = "C:\\testfiles\\"
	replacearray := [...]string{"720p", "1080p"}
	files, err := ioutil.ReadDir(dlpath)
	if err != nil {
		log.Fatal(err)
	}
	for _, fileitem := range files {
		var filename = strings.ToLower(fileitem.Name())
		var filenameext = filepath.Ext(filename)
		var filenamebase = strings.TrimSuffix(filename, filepath.Ext(filename))
		for _, replaceitem := range replacearray {
			filenamebase = strings.Replace(filenamebase, replaceitem, "", -1)
		}
		if _, err := os.Stat(dlpath + strings.Trim(filenamebase, " ") + filenameext); err == nil {
		} else {
			err := os.Rename(dlpath+fileitem.Name(), dlpath+strings.Trim(filenamebase, " ")+filenameext)
			if err != nil {
				log.Fatal(err)
			}
		}
	}
}
