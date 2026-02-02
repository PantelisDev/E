package default_package;
import java.io.File;

public class DeleteFile {

    public static void deleteFile(String file) {
        try {    
            File f = new File(file);

            if (!f.exists())
                throw new Exception("File does not exist");

            if (f.delete())
                System.out.format("File deleted", file);
            else
                throw new Exception("File deletion failed");

        } catch(Exception x) {
            System.err.format("Error", x.getMessage());
        }
    }
}
