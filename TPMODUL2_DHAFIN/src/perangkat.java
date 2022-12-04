public class perangkat{
    protected String drive;
    protected int ram;
    protected float processor;

    perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    void Informasi(){
        System.out.println("\nPerangkat tidak diketahui memiliki drive tipe " + this.drive +" dengan ram sebesar "  
        + this.ram + " GB dan processor secepat " + this.processor + " Ghz " );
    }
}



        
   
