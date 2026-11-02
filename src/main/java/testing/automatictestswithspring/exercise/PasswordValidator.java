package testing.automatictestswithspring.exercise;

public class PasswordValidator {

    public boolean ItIsAStrongPassword(String password) {
        return password != null
                && password.length() >= 8
                && password.matches(".*\\d.*");
    }
}