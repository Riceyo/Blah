set fso = createobject("scripting.filesystemobject")
set output = fso.createtextfile("output.txt", True)
for each file in fso.getfolder("n:\downloads\").files
	outputstream = outputstream & file.name & vbcrlf
	next
output.write outputstream
msgbox "done"
