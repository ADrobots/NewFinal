import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferMessage implements PromoMessage {

    private Map<String,String> offer = new HashMap<>();

    @Override
    public Map<String,String> createMessage(List<Client> listClient) {
        for(Client client: listClient) {
            StringBuilder offerBuild = new StringBuilder();
            offerBuild.append("Добрый день, ")
                    .append(client.getName())
                    .append("!").append(System.lineSeparator())
                    .append("Вы покупали у нас ");
            for (Order order: client.getOrders())
                offerBuild.append(order.getProduct().getBrand())
                    .append(" ").append(order.getProduct().getArticle())
                    .append("(").append(order.getProduct().getType()).append("),");
            offerBuild.deleteCharAt(offerBuild.lastIndexOf(","));
            offerBuild.append(".").append(System.lineSeparator())
                    .append("Мы всегда будем рады оказавать Вам обслуживание Вашей техники.").append(System.lineSeparator())
                    .append("Рекомендуется производить обслуживание 1 раз в год для того, чтобы Ваша техника работала Безупречно.");
            offer.put(client.getEmail(),offerBuild.toString());
        }

        return offer;
    }

}
