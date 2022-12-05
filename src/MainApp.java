public class MainApp {
    
    public static void main(String[] args) {
        TransportasiAir transportasiAirr = new TransportasiAir(10, 100000);
        transportasiAirr.informasi();
        transportasiAirr.berlayar();
        transportasiAirr.berlabuh();

        Sampan sampann = new Sampan(20, 20000);
        sampann.informasi();
        sampann.berlayar();
        sampann.berlabuh();
        sampann.berlabuh(2);

        Kapal Kapall = new Kapal(10000, 90000);
        Kapall.informasi();
        Kapall.berlayar();
        Kapall.berlabuh();
    
    }
}
