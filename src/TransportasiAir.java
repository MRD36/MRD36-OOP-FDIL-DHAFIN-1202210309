public class TransportasiAir {
    protected int jumlah_kursi, biaya;

    public TransportasiAir (int jumlah_kursi, int biaya){
        this.jumlah_kursi = jumlah_kursi;
        this.biaya = biaya; 
    }
public void informasi(){
    System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah"+ this.jumlah_kursi+ " ditetapkan denganbiaya sebesar Rp." + this.biaya);
}
public void berlayar(){
    System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
}
public void berlabuh(){
    System.out.println("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai");
}
}