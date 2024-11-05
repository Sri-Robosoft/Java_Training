package Task_8.Problem3;
import java.io.*;

public class Problem3 {

    public static void fileOperations () throws IOException {
        BufferedReader bf = null;
        try {
            File f = new File("C:\\Users\\Srichandan\\IdeaProjects\\Java_Training\\src\\Task_8\\Problem3\\File-Operations.txt");
            bf = new BufferedReader(new FileReader(f));
            String str;
            while ((str = bf.readLine()) != null)
                System.out.println(str);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e.toString());
        }
        finally {
            if(bf != null)
                bf.close();
        }
    }

    public static void main(String[] args) {
        try {
            fileOperations();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
