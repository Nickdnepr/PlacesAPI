import com.nickdnepr.places.api.PlacesRestController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestClass {

    PlacesRestController controller = new PlacesRestController();

    @Test
    public void startupTest(){
        System.out.println(controller.helloWorld());
        System.out.println(controller.getTypes());
        System.out.println(controller.getCategories());
    }

}
