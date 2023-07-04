public class Buku {
    String judul, pengarang;
    long hargaBuku;
    public Buku(String judul, String pengarang, long hargaBuku){
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
    }
    public void cetakBuku(){
        System.out.println("\nJudul       : " + this.judul);
        System.out.println("Pengarang   : " + this.pengarang);
        System.out.println("Harga Buku  : " + this.hargaBuku);
        System.out.println();
    }
}

public interface InterfaceCD {
    void cetakCD();
    long getHargaCD();
}

public class CD {
    String ukuran;
    long hargaCD;
    public CD(String ukuran, long hargaCD){
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
    }
    public long getHargaCD(){
        return hargaCD;
    }
    public void cetakCD(){
        System.out.println("Ukuran CD   : " + this.ukuran);
        System.out.println("Harga CD    : " + this.hargaCD);
        System.out.println();
    }
}

public class ChildCD extends CD implements InterfaceCD{
    public ChildCD(String ukuran, long hargaCD){
        super(ukuran, hargaCD);
    }
}

public class Paket extends Buku implements InterfaceCD{
    long hargaPaket;
    InterfaceCD interfaceCD;
    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD){
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
    }
    
    public void hitungHargaPaket(){
        hargaPaket = super.hargaBuku + getHargaCD();
    }
    
    @Override
    public void cetakCD(){
        interfaceCD.cetakCD();
    }
    
    @Override
    public long getHargaCD(){
        return(interfaceCD.getHargaCD());
    }
    
    public void cetakPaket(){
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket buku dan CD : " + this.hargaPaket + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Paket a = new Paket("Pemrograman Berorientasi Objek", "Beyamin langgu Sinaga", 60000, "700 MB", 50000);
        a.hitungHargaPaket();
        a.cetakPaket();
    }
}
