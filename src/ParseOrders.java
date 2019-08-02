import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseOrders implements Parse {



    private Map<String,Client> clientMap = new HashMap<>();
    private Map<String, Product> productMap= new HashMap<>();



    @Override
    public Map<String,Client> parse(List<String> list) {
        String[] parsedLine=null;
        list.remove(0);
        for(String line:list){
            parsedLine = line.split(";");


        Client client=null;
        if (!clientMap.containsKey(parsedLine[1])){
            client = new Client();
             client.setName(parsedLine[1]);
            client.setTelNumber(parsedLine[2]);
            client.setEmail(parsedLine[3]);
            clientMap.put(client.getName(),client);
        }
        else{
            client= clientMap.get(parsedLine[1]);
        }

        Order order = new Order();
        client.getOrders().add(order);
        order.setNumber(Integer.valueOf(parsedLine[0]));
        order.setCountProduct(Integer.valueOf(parsedLine[7]));
        order.setSumm(Double.valueOf(parsedLine[9]));
        order.setDate(parsedLine[10]);

        Product product;
        if (!productMap.containsKey(parsedLine[6]))
            product = new Product();
        else
            product = productMap.get(parsedLine[6]);
        order.setProduct(product);
        product.setBrand(parsedLine[5]);
        product.setArticle(parsedLine[6]);
        product.setType(parsedLine[4]);
        product.setCost(Double.valueOf(parsedLine[8]));
        }
       return clientMap;
    }
}
