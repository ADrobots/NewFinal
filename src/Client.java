import java.util.ArrayList;

public class Client {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrganization() {
        return organization;
    }

    public void setOrganization(boolean organization) {
        this.organization = organization;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    private ArrayList<Order> orders = new ArrayList<>();

    private String name;
    private boolean organization;
    private String telNumber;
    private String email;


}
