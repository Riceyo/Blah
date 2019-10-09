file2lock = "C:\#\test.csv"
Set fso = CreateObject("Scripting.FileSystemObject")
Set file = fso.OpenTextFile(file2lock , 8, True)
MsgBox("unlock " + file2lock)
