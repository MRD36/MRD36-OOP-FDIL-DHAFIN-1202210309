public class Sampan extends TransportasiAir{
    protected int layar;

public Sampan (int jumlah_kursi, int biaya){
    super (jumlah_kursi, biaya);
    this.layar = layar;
}
@Override
public void informasi(){
    System.out.println("\nTransportasi Air jenis Sampan dengan kursi berjumlah"+ this.jumlah_kursi+ " ditetapkan denganbiaya sebesar Rp." + this.biaya);
}
@Override
public void berlayar(){
    System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+ this.layar + " layar");
}

public void berlabuh(){
    System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai tanpa jangkar");
}
public void berlabuh(int berlabuh){
    this.layar = berlabuh;
    System.out.println("Transportasi Air jenis Sampan sedang berlabuh di pantai menggunakan"+ berlabuh + " jangkar");
}
}
