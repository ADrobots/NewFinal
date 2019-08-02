public class Manager {

    public Manager() {
    }

    public Manager(int id, String name, int countClients) {
        setCountClients(countClients);
        setId(id);
        setName(name);
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountClients() {
        return countClients;
    }

    public void setCountClients(int countClients) {
        this.countClients = countClients;
    }

    private String name;
    private int countClients;


}
