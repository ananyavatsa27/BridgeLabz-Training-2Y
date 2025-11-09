class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

class Login {
    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals("admin") || !pass.equals("1234"))
            throw new InvalidCredentialsException("Invalid username or password!");
    }
}

public class q3_Logicsytem {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.validate("user", "0000");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again.");
        }
    }
}
