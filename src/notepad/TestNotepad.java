package notepad;

import java.io.*;

public class TestNotepad {

    public static void main(String[] args) throws IOException {


        //Creating a file and writing into them

        File file = new File("C:\\fileWriting\\test.txt");
        file.createNewFile();

//        FileWriter fw = new FileWriter(file);
//        BufferedWriter fileWriter = new BufferedWriter(fw);
//
//        fileWriter.write("Please write inside this file");
//
//        fileWriter.newLine();
//
//        fileWriter.write("My name is Anne ");
//
//        fileWriter.flush();

        //Reading a file

        FileReader reader = new FileReader(file);
        BufferedReader fileReader = new BufferedReader(reader);

//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());

        String i = "";
        while ((i = fileReader.readLine()) != null){
            System.out.println(i);
        }

    }
}
