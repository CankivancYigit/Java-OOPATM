
public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap = new Hesap("Cankivanc", "12345", 2000);
        
        atm.atmCalistir(hesap);

        System.out.println("Sistemden Çıkılıyor...");
        
    }
}

