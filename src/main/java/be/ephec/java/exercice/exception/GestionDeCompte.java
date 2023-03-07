package be.ephec.java.exercice.exception;

import java.util.Locale;

public class GestionDeCompte {
    public static void main(String[] args) {
        compte m = new compte(1000);
    }
    private boolean isValidIban(String iban){
        iban = iban.replaceAll("[^a-zA-Z0-9]", "");
        iban = iban.toUpperCase(Locale.ROOT);
        char char0 = iban.charAt(0);
        char char1 = iban.charAt(1);
        iban = ((int)char0 - 55) + ((int)char1 - 55) + iban.substring(2);

    }
}
