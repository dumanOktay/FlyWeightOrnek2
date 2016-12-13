import java.util.HashMap;

/**
 * Created by okt on 12/13/16.
 */
public class FileFactory {
    private static HashMap<String,MFile> myFileHashMap = new HashMap<>();

    public static MyFile getMyFile(String key){
        MyFile myFile;
        myFile = (MyFile) myFileHashMap.get(key);

        if (myFile== null){
            myFile = new MyFile(key);
            myFileHashMap.put(key, myFile);

        }
        return myFile;
    }
}
