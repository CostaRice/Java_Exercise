import java.io.File;

/**
 * Created by CostaHu on 2016/5/10.
 */
public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("image/us.gif");
        System.out.println("Does this file image exist? "+file.exists());
        System.out.println("Last modified on "+file.lastModified());
    }
}
