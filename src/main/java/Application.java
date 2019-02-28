import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String args[]) {
        File file = null;
        List<Image> listOfImages = new ArrayList<Image>();
        try {

            String fileName = "a_example.txt";
            ClassLoader classLoader = new Application().getClass().getClassLoader();
            file = new File(classLoader.getResource(fileName).getFile());
            Scanner sc = new Scanner(file);
            int nPhotos = Integer.parseInt(sc.next());
            int count = 0;
            while(count < nPhotos) {
                String photo = sc.next();
                String[] values = photo.split(" ");
                int len = values.length;
                boolean isVertical = values[0] == "V"? true:false;
                List<String> tags = new ArrayList<String>();
                for(int i=2; i< len;i++) {
                    tags.add(values[i]);
                }
                Image img = new Image(isVertical, tags, len-2, count);
                listOfImages.add(img);
                count++;
            }
        } catch (Exception e) {
            file = null;
        }
    }
}
