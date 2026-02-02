package default_package;
import java.io.*;

public class createOneFile {
	public static void createOneFile(String file) throws Exception{
		File f = new File(file);
		try {
		
			if(f.exists())
				throw new Exception("File exists");
			
			if(f.createNewFile())
				System.out.println("File" + file + " created");
			else 
				throw new Exception("File creation failed");
			}
		catch (Exception x) {
			System.err.format(x.getMessage());
			}
		}
}
