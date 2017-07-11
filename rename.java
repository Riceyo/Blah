import java.io.*;

public class rename
{
	public static void main(String args[])
	{
		String[] crap = {"1080p", "720p", "480p", "brrip", "hdrip"}; // array of strings to remove from the filename.
		String dlpath = "N:\\downloads\\"; // path of the directory to work on.
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
				for(int loop = 0; loop < crap.length; loop++) // loop through the array of strings to remove from the filename.
				{
					filenamebase = filenamebase.replace(crap[loop], ""); // replace any found strings in the filename with nothing.
				}
				filenamebase = filenamebase.replaceAll(".", " "); // replace full stops with a single space, and trim.
				filenamebase = filenamebase.replaceAll("-", " "); // replace hyphens with a single space, and trim.
				filenamebase = filenamebase.replaceAll("_", " "); // replace underscores with a single space, and trim.
				filenamebase = filenamebase.replaceAll("\\s{2,}", " ").trim(); // replace double spaces with a single space, and trim.
				File newname = new File(dlpath + filenamebase + "." + filenameext); // create the new filename.
				file.renameTo(newname); // rename the file.
			}
		}
	}
}
