import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainM {

    public static void main(String[] args) {
	    WorkWithFile workWithFile = new FileForPromoMessage(); //реализовываем методы чтения из файла и записи в файл, интерфейса WorkWithFile создавая объект типа FileForPromoMessage
	    PromoMessage promoMessage = new OfferMessage();
	    Parse parser = new ParseOrders();

        List<String> orderText;
        String messageOut;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажить путь до файла с заказами");
        orderText=workWithFile.readFile(Paths.get(scanner.nextLine()));

        System.out.println("Укажить путь для сохранения предложений");
        messageOut=scanner.nextLine();

        Map<String,Client> mapClients = parser.parse(orderText);
        ArrayList<Client> listClient = new ArrayList<>(mapClients.values());
        Map<String,String> listMes = promoMessage.createMessage(listClient);

        if(workWithFile.writeFile(listMes,messageOut))
            System.out.println("Успешно сформировано и записано");
        else
            System.out.println("Ошибка");


    }

}
