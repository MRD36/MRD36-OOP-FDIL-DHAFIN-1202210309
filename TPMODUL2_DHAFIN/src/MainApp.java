

public class MainApp {

    public static void main(String[] args) {
        perangkat perangkat1 = new perangkat ("Adata", 2, (float) 1.88);
        perangkat1.Informasi();

        Laptop laptop1 = new Laptop("Seagate", 8, 2.44f, true);
        laptop1.Informasi();
        Game game1 = new Game("Dota 2");
        game1.Permainan();
        Email email1 = new Email("niceyuk@gmail.com", "aanarji@gmail.com");
        email1.kirimEmail();
        
        Handphone handphone1= new Handphone("Sandisk", 3, 2.22f, false);
        handphone1.Informasi();
        nomor nomor1 = new nomor(8219031);
        nomor1.telfon();
        nomor1.kirimSMS();
        SMS sms1 = new SMS(8219031, 12456);
        sms1.kirimSMS();

        
    }
}
