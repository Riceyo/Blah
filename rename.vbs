' this is very inefficient

on error resume next

str_path = "n:\downloads\"

set obj_fso = createobject("scripting.filesystemobject")

public sub sub_file_loop

	for each file in obj_fso.getfolder(str_path).files

		str_file_name = obj_fso.getfilename(file)

		obj_fso.movefile str_path & str_file_name, str_path & lcase(str_file_name)

		str_file_name = obj_fso.getfilename(file)
		str_file_name_base = obj_fso.getbasename(file)
		str_file_name_ext = obj_fso.getextensionname(file)
		
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " - s0", " s0")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, ".", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "_", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "(", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, ")", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "[", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "]", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "{", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "}", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2010", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2011", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2012", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2013", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2014", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2015", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2016", " ")
		'call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2017", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " brrip", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " webrip", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " hdrip", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " bluray", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " dvdscr", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " dvdrip", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " web-dl", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " aac", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " ac3", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " mp3", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " mp4", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " xvid", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " hdtv", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " x264", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " x265", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " h264", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 480p", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 720p", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 1080p", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " hc", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 900mb", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 750mb", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 850mb", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -fum", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -dimension", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -msd", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -killers", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -w4f", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -2hd", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -lol", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -excellence", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -river", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -bajskorv", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -ftp", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -afg", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -c4tv", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -barge", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -tla", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -kingdom", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -evo", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -etrg", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -vyto", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -ositv", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -dukes", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -bwb", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -fleet", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -sem", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -fs", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -deflate", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " mkvcage", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 6ch", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " hevc", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " rmteam", " ")		
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " mvgroup org", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " hq hive-cm8", " ")	
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " shaanig", " ")	
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " eztv", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " yify", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " ettv", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 5 1 - shdb", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " dd5 1 h 264-ctrlhd", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 2 0 h 264-ctrlhd", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " phr0sty", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 712x480", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " 1920x1080", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -jhonny2", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " avc-jhonny2", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -filmhd", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " -shortbrehd", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, " uncensored 2 0 h 264-ntb", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "  ", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "  ", " ")
		call sub_rename(str_file_name, str_file_name_base, str_file_name_ext, "  ", " ")
		
		if right(str_file_name_base, 1) = " " then			
			obj_fso.movefile str_path & str_file_name, str_path & left(str_file_name_base, len(str_file_name_base) -1) & "." & str_file_name_ext			
		end if

	next

end sub

public sub sub_rename(str_file_name, str_file_name_base, str_file_name_ext, change_from, change_to)

	if instr(str_file_name_base, change_from) > 0 then
		obj_fso.movefile str_path & str_file_name, str_path & replace(str_file_name_base, change_from, change_to) & "." & str_file_name_ext
		call sub_file_loop
	end if

end sub

if msgbox("go?", vbyesno) = vbyes then	
	obj_fso.deletefile("s:\# sort\*.torrent")
	obj_fso.deletefile("s:\# sort\*.nzb")
	call sub_file_loop
	msgbox "done"
end if

set obj_fso = nothing
