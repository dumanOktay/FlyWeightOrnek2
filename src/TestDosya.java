import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by okt on 12/13/16.
 */
public class TestDosya {


    private static String fileNames[] = {
            "java.txt", "c.txt", "python.txt"
    };

    public static void main(String a[]) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {

            for (String fileName : fileNames) {


              /*  String content = "";
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

                    String sCurrentLine;

                    while ((sCurrentLine = br.readLine()) != null) {
                        content += sCurrentLine;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(content);
*/
/*
                MyFile myFile = new MyFile(fileName);
                myFile.printContent();*/



                //Flyweight
                MyFile myFile = FileFactory.getMyFile(fileName);
                myFile.printContent();

            }



        }
        long stop = System.currentTimeMillis();

        System.out.println("Time  " + (stop - start));
    }
}
