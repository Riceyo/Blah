package main

import (
	"fmt"
	"io/ioutil"
	"log"
	"strings"
)

func main() {
	var dlpath = "C:\\testfiles"
	replacearray := [...]string{"720p", "1080p"}
	files, err := ioutil.ReadDir(dlpath)
	if err != nil {
		log.Fatal(err)
	}
	for _, fileitem := range files {
		for _, replaceitem := range replacearray {
			fmt.Println("replaceitem: " + replaceitem)
			fmt.Println("old fileitem: " + fileitem.Name())
			var test = strings.Replace(fileitem.Name(), replaceitem, "", -1)
			fmt.Println("new fileitem: " + fileitem.Name())
			fmt.Println("test: " + test)
		}
		fmt.Println("new new fileitem: " + fileitem.Name())
	}
}
