import java.io.File;
import java.util.ArrayList;

public class MyFiles {
    File file;
    ArrayList<String> tags;

    public MyFiles(File file){
        this.file = file;
    }
    public void setTags(ArrayList<String> tags){
        this.tags = tags;
    }

}