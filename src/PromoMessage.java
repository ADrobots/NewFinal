import java.util.List;
import java.util.Map;

public interface PromoMessage {

    Map<String,String> createMessage(List<Client> client);

}
