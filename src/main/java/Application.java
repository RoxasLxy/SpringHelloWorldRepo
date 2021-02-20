import com.leapcode.service.SpeakerService;
import com.leapcode.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args){
        // this is eddited by xiangyu li 20200219
        //142345664644464
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());
    }
}
