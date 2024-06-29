package Business;

public class Business {
    private String id;
    private String name;
    private String adress;
    private String city;
    private String state;

    public Business(String id, String name, String adress, String city, String state) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
