import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

    public static void main(String[] args) throws IOException {

        //Stream Connectivity

       // File f = new File("C:\\fileWriting\\myTextFile.txt");
        //File f = new File("C:\\fileWriting\\myTextFile.csv");
        File f = new File("C:\\fileWriting\\myTextFile.html");

        FileWriter fw = new FileWriter(f, false);
        BufferedWriter writer = new BufferedWriter(fw);

        //Writing inside the file

//        for(int i = 0; i < 4; i++){
//            for(int j = 0;j < 3; j++){
//                int num = (int) (Math.random() * 100);
//               // writer.write(num + "\t");
//                writer.write(num + ",");
//
//            }
//            writer.newLine();
//        }

        writer.write("<html> <body> <title> Way 2 Automation </title><h1>Learning Java from Way2Automation.com</h1> </body>.");

//        writer.write("Second Line");
//        writer.newLine();
//        writer.write("Brazil");
//        writer.newLine();
//        writer.write("Way2Automation Brazil");
//        writer.newLine();
//        writer.write("Anne");

        //Closing stream

        writer.close();

        System.out.println("File Created!");

    }
}
