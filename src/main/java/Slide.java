import java.util.ArrayList;
import java.util.List;

public class Slide {
    List<Image> slideImg = new ArrayList();

    Slide(List<Image> img) {
        slideImg.addAll(img);
    }

}
