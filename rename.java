import java.io.*;

public class rename
{
	public static void main(String args[])
	{
		String[] replacewithspace = {".", ",", "-", "_", "(", ")", "[", "]", "{", "}"}; // array of strings to replace with a space in the filename.
		String[] replacewithnothing = {"1080p", "720p", "480p", "brrip", "hdrip", "webrip", "dvdrip", "dvdscr"}; // array of strings to replace with nothing in the filename.
		String dlpath = "N:\\downloads\\test\\"; // path of the directory to work on.
		File dir = new File(dlpath); // create file object.
		File[] dirfiles = dir.listFiles(); // array of files in the directory.
		for(File file:dirfiles) // loop through the files.
		{
			if(file.isDirectory() == false) // only work on the files, ignore the directories.
			{
				String filename = file.getName(); // get the filename.
				filename = filename.toLowerCase(); // make whole filename lower case.
				String filenamebase = filename.replaceAll("[.][^.]+$", ""); // get the filename without the extension.
				String filenameext = filename.replaceAll("^.*\\.(.*)$", "$1"); // get the filename extension.
				for(int loop = 0; loop < replacewithspace.length; loop++) // loop through the array of strings to replace with a space.
				{
					filenamebase = filenamebase.replace(replacewithspace[loop], " "); // replace any found strings in the filename with a space.
				}
				for(int loop = 0; loop < replacewithnothing.length; loop++) // loop through the array of strings to replace with nothing.
				{
					filenamebase = filenamebase.replace(replacewithnothing[loop], ""); // replace any found strings in the filename with nothing.
				}
				filenamebase = filenamebase.replaceAll("\\s{2,}", " ").trim(); // replace double spaces with a single space, and trim.
				File newname = new File(dlpath + filenamebase + "." + filenameext); // create the new filename.
				file.renameTo(newname); // rename the file.
			}
		}
	}
}

// rename.bat - java -classpath ...\workspace\project\bin\ rename
