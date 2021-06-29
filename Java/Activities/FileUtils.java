package Activities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtils {

	public static void main(String[] args) {
		
		        try {
		            //Using FileUtils
		            usingFileUtils();
		        } catch(IOException e) {
		            System.out.println(e.getMessage());
		        }
		    }

		    public static void usingFileUtils() throws IOException {
		        //get the file object
		        File file = FileUtils.getFile("input.txt");

		        //get the temp directory
		        File tmpDir = FileUtils.getTempDirectory();

		        System.out.println(tmpDir.getName());

		        //copy file to temp directory
		        FileUtils.copyFileToDirectory(file, tmpDir);

		        //create a new file
		        File newTempFile = FileUtils.getFile(tmpDir, file.getName());

		        //get the content
		        String data = FileUtils.readFileToString(newTempFile, Charset.defaultCharset());

		        //print the content
		        System.out.println(data);
		    }

			public static File getFile(String string) {
				// TODO Auto-generated method stub
				return null;
			}

			public static String readFileToString(File fileUtil, String string) {
				// TODO Auto-generated method stub
				return null;
			}

			public static void copyFileToDirectory(File file, File destDir) {
				// TODO Auto-generated method stub
				
			}

			public static File getFile(File destDir, String string) {
				// TODO Auto-generated method stub
				return null;
			}
		

	}


