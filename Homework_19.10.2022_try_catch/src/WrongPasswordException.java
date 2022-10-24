public class WrongPasswordException {
    String password;
    String confirmPassword;

    public WrongPasswordException(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public WrongPasswordException(boolean r) {
        if (r == true) {
//            System.out.println("Correct Password");
        } else {
            System.out.println("WrongPasswordException");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
