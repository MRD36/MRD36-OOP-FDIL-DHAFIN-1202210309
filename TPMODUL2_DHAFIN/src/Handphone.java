class Handphone {
    protected boolean fingerprint;
    String drive;
    int ram;
    float processor;
    

    Handphone(String drive, int ram, float processor, boolean fingerprint){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
        this.fingerprint = fingerprint;
    }
   void Informasi(){
        if (this.fingerprint == false);
            System.out.println("\nHandphone ini memiliki drive tipe " + this.drive +" dengan ram sebesar "  
            + this.ram + " GB dan processor secepat " + this.processor + " Ghz. Selain itu handphone ini "
            + "TIDAK" +" memiliki fingerprint " );
    } 
}
class nomor{
    int no_hp;
        
    nomor(int nohp){
        this.no_hp = nohp; 
    }
    void telfon(){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+ this.no_hp);
    }
    void kirimSMS(){   
        System.out.println("Handphone berhasil mengirim SMS ke No"+ this.no_hp);
    }
}
class SMS{
    int no_hp1;
    int no_hp2;
    SMS(int no_hp1, int no_hp2){
        this.no_hp1 = no_hp1;
        this.no_hp2 = no_hp2;
    }
    void kirimSMS(){
        System.out.println("Handphone berhasil mengirim SMS ke No "+ this.no_hp1 + "dan ke No "+ this.no_hp2);
    }
    

}



   
    





        





