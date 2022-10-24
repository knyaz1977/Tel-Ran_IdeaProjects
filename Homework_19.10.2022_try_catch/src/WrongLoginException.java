public class WrongLoginException {
    String login;

    public WrongLoginException(String login) {
        this.login = login;
    }

    public WrongLoginException(boolean r) {
        if (r == true) {
            System.out.println("Correct Login");
        } else {
            System.out.println("WrongLoginException");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "login='" + login + '\'' +
                '}';
    }
}
