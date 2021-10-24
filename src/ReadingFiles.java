import java.io.*;

public class ReadingFiles {

    public static void main(String[] args) throws IOException {

        //Connecting Streams

        File f = new File("C:\\fileWriting\\myTextFile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);

        //read text file
//        System.out.println(reader.readLine());
//        System.out.println(reader.readLine());

        while (reader.readLine()!=null){
            System.out.println(reader.readLine());
        }
        reader.close();

    }
}
