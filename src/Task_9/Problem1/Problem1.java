package Task_9.Problem1;

import java.io.File;

public class Problem1 {
    public static void main(String[] args) {
        FileOperations fo = new FileOperations("javafileOperation.txt");
        try {
//            fo.createOrUpdateFile();
//            fo.renameFile("fileTest.txt");
//            fo.countOfWords();
//            fo.copyToBackup();
            fo.deleteFiles();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
