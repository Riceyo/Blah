set fso = createobject("scripting.filesystemobject")
for each file in fso.getfolder("n:\downloads\").files
	outputstream = outputstream & file.name & vbcrlf
	next
fso.createtextfile("output.txt", True).write outputstream
msgbox "done"
set fso = nothing
