class Laptop {
    protected boolean webcam;
    String drive;
    int ram;
    float processor;
    

    Laptop(String drive, int ram, float processor, boolean webcam){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.webcam = webcam;
    }
    void Informasi(){
        if (this.webcam == false);
            System.out.println("\nLaptop ini memiliki drive "+ this.drive + " dengan ram sebesar "  
            + this.ram + " GB dan processor secepat " + this.processor + " Ghz. Selain itu laptop ini juga "
             +" memiliki webcam ");
    }   
}
class Game{
    String nama_game;
    Game(String nama_game){
        this.nama_game = nama_game;
    }
    void Permainan(){
        System.out.println("Laptop berhasil membuka "+ this.nama_game);
    }

}
class Email{
    String email1;
    String email2;
    Email(String email1, String email2){
        this.email1 = email1;
        this.email2 = email2;
    }
    void kirimEmail(){
        System.out.println("Laptop berhasil mengirim Email ke "+ this.email1);
        System.out.println("Laptop berhasil mengirim Email ke "+ this.email1 + "dan ke "+ this.email2);
    }
}
