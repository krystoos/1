package Methods;

import java.util.Scanner;

public class ZarejestrujZaloguj extends metodaZarejestrujZaloguj {
    public static void main(String[] args) {


        System.out.println("Aby zarejestrować się jako użytkownik, na początku wprowadź swój e-mail:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        System.out.println("Wprowadź hasło, dzięki któremu później będziesz mógł się zalogować:" + "\n" +
                "Hasło musi posiadać:" + "\n" + "-conajmniej 8 znaków" + "\n" + "-conajmniej 1 dużą literę" + "\n" + "-conajmniej 1 cyfrę");
        String password = scanner.next();
        int passwordlenght = password.length();
        if (hasDigit(password)==true&&hasUpperCase(password)==true&&passwordlenght >= 8) {
                System.out.println("Hasło zaakceptowane");
                System.out.println("Pomyślnie utworzono konto użytkownia!");
                System.out.println("Wpisz e-mail aby zalogować:");
                String email1 = scanner.next();
                if (email1.equals(email)) {
                    System.out.println("Wpisz hasło:");
                } else System.out.println("Nie istnieje konto użytkownika z podanym e-mailem, spróbuj jeszcze raz");
                String password1 = scanner.next();
                if (password1.equals(password)) {
                    System.out.println("Pomyślnie zalogowano, Witamy!");
                } else System.out.println("Podane hasło jest niepoprawne, spróbuj jeszcze raz");
            } else {
            System.out.println("Hasło musi posiadać minimum 8znaków, 1cyfrę i 1 dużą literę");
            }


    }
}
