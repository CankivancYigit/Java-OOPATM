
import java.util.Scanner;

public class Login {

    Scanner scanner = new Scanner(System.in);

    public boolean login(Hesap hesap) {
        System.out.print("Kullanıcı Adınızı giriniz :");
        String kullanıcı_adı = scanner.nextLine();
        System.out.print("Parolanızı giriniz :");
        String parola = scanner.nextLine();

        if (kullanıcı_adı.equals(hesap.getKullanıcı_adı()) && parola.equals(hesap.getParola())) {

            return true;

        }

        return false;
    }

}

