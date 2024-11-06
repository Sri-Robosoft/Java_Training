package Task_9.Problem1;

import java.io.*;

public class FileOperations {
    File file1;
    File file2;
    File file3 = new File("wordcount.txt");
    File file4 = new File("backup.txt");

    public FileOperations(String str) {
        file1 = new File(str);
    }

    public void writeToFile(String str) throws IOException{
        FileWriter fr = new FileWriter(file1);
        fr.write(str);
        fr.close();
    }

    public void createOrUpdateFile() throws IOException {
        if(file1.createNewFile()) {
            System.out.println("File is created: " +file1.getName());
            writeToFile("Hi Hello");

        } else {
            writeToFile("Hey How are you?");
        }
    }

    public void renameFile(String name) throws IOException {
        file2 = new File(name);
        if(file2.exists()) {
           throw new IOException("File already Exists");
        }

        boolean success = file1.renameTo(file2);
        System.out.println(file1);
        System.out.println(file2);
        if(success) {
            System.out.println("File Renamed successfully");
        }
    }

    public void countOfWords() throws IOException {
        System.out.println(file2);
        String line;
        int count =0;
        BufferedReader br = new BufferedReader(new FileReader("fileTest.txt"));
        while((line = br.readLine()) != null) {
            String[] words = line.split("");
            count+= words.length;
        }

        boolean success = file3.createNewFile();
        if(success) {
            FileWriter fr = new FileWriter(file3);
            fr.write(Integer.toString(count));
            fr.close();
        }
    }

    public void copyToBackup() throws IOException{
        boolean success = file4.createNewFile();
        BufferedWriter br = new BufferedWriter(new FileWriter(file4));
        if(success) {
            BufferedReader input1 = new BufferedReader(new FileReader("fileTest.txt"));
            String str;
            while ((str = input1.readLine()) != null) {
                br.write(str);
                br.newLine();
            }
            BufferedReader input2 = new BufferedReader(new FileReader("wordcount.txt"));
            while ((str = input2.readLine()) != null) {
                br.write(str);
            }
            br.close();
        }
    }
}
