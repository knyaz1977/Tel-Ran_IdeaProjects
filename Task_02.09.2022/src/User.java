public class User {
    private String user;

    private String name;
    private String Email;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String user, String name, String email, String address) {
        this.user = user;
        this.name = name;
        Email = email;
        this.address = address;
    }

    public User(String address) {
        this.address = address;
    }

    public User(String user, String s, String aaa1) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(String name, String email) {
        this.name = name;
        Email = email;
    }
}
