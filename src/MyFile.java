import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by okt on 12/13/16.
 */
public class MyFile implements MFile{
    String fileName;
    String content;

    public MyFile(String fileName) {
        this.fileName = fileName;

        this.content="";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
                content+=sCurrentLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @Override
    public void printContent() {
        System.out.println(content);
    }
}
