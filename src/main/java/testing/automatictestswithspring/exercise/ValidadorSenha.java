package testing.automatictestswithspring.exercise;

public class ValidadorSenha {

    public boolean ehSenhaForte(String senha) {
        return senha != null
                && senha.length() >= 8
                && senha.matches(".*\\d.*");
    }
}