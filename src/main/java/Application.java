import java.io.File;
import java.util.*;

public class Application {

    public static void main(String args[]) {
        File file = null;
        List<Image> listOfImages = new ArrayList<Image>();
        try {

            String fileName = "a_example.txt";
            ClassLoader classLoader = new Application().getClass().getClassLoader();
            file = new File(classLoader.getResource(fileName).getFile());
            Scanner sc = new Scanner(file);
            int nPhotos = Integer.parseInt(sc.nextLine());
            int count = 0;
            while(count < nPhotos) {
                String photo = sc.nextLine();
                String[] values = photo.split(" ");
                int len = values.length;
                boolean isVertical = values[0] == "V"?true:false;
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

        Set<String> tags = new TreeSet<String>();
        
        for(int i=0; i<listOfImages.size(); i++) {
            tags.addAll(listOfImages.get(i).Tags);
        }
    }
}
