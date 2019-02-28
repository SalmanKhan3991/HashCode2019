import java.util.ArrayList;
import java.util.List;

public class Image {

    boolean isVertical;
    List<String> Tags = new ArrayList<String>();
    int numOfTags, index;

    public Image(boolean isVertical, List<String> T, int Tn, int index) {
        this.isVertical = isVertical;
        Tags = T;
        numOfTags = Tn;
        this.index = index;
    }

    public int getNumOfTags(){return numOfTags;}

    public boolean isVertical(){return isVertical;}
}
