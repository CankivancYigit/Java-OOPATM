
import java.util.Scanner;

public class ATM {

    Scanner scanner = new Scanner(System.in);

    public void atmCalistir(Hesap hesap) {

        int giris_hakki = 3;

        Login login = new Login();

        System.out.println("Bankamıza Hoşgeldiniz..");
        System.out.println("Lütfen giriş yapınız");

        while (true) {

            if (login.login(hesap)) {
                System.out.println("Giriş yapılıyor...");
                break;
            } else {

                System.out.println("Kullanıcı adı veya parola yanlış.");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız :" + giris_hakki);

                if (giris_hakki == 0) {

                    return;

                }

            }

        }

        String islemler = "1.islem=Bakiye sorgulama\n"
                + "2.islem=Para çekme\n"
                + "3.islem=Para Yatırma\n"
                + "Çıkmak için q'ya basın";

        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");

        while (true) {
            System.out.print("Lütfen işlem seçiniz :");
            String secim = scanner.nextLine();

            if (secim.equals("q")) {

                break;

            } else if (secim.equals("1")) {

                System.out.println("Bakiyeniz :" + hesap.getBakiye());

            } else if (secim.equals("2")) {

                System.out.print("Çekmek istediğiniz tutarı giriniz :");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.ParaCek(tutar);

            } else if (secim.equals("3")) {

                System.out.print("Yatırmak istediğiniz tutarı giriniz :");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.ParaYatır(tutar);

            }
        }
    }
}


