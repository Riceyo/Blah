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
			fmt.Println(replaceitem)
			strings.Replace(fileitem.Name(), replaceitem, "", 0)
			fmt.Println(fileitem.Name())
		}
		fmt.Println(fileitem.Name())
	}
}
