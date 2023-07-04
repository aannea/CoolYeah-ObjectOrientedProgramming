public class Mobil {
    String noPlat, merk;
    float pajak;
    
    //Default konstruktor
    public Mobil(){
        this.noPlat = "Tidak Tersedia";
        this.merk = "Tidak Tersedia";
        this.pajak = 0.0f;
    }
    
    //Konstruktor Buatan(dengan parameter)
    public Mobil(String noPlat, String merk, float pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }
    
    public static String formatUang(double nilai) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return "Rp " + formatter.format(nilai);
    }

    
    public void tampilInfo(){
        System.out.println("\nInformasi Kendaraan");
        System.out.println("-------------------");
        System.out.println("Nomor Plat              : " + this.noPlat);
        System.out.println("Merk Mobil              : " + this.merk);
        System.out.println("Pajak                   : " + formatUang(this.pajak));
    }
    
    public float hitungPajak(){
        return this.pajak;
    }
}

public class Bus extends Mobil{
    int kapasitasPenumpang, kapasitasBagasi;
    
    public Bus(){
        super("Tidak Tersedia", "Tidak Tersedia", 0.0f);
        this.kapasitasPenumpang = 0;
        this.kapasitasBagasi = 0;
    }
    
    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }
    
    public void infoBus(){
        System.out.println("Kapasitas Penumpang     : " + this.kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi        : " + this.kapasitasBagasi);
    }
    
    @Override
    public void tampilInfo(){
        super.tampilInfo();
        infoBus();
    }
    
    @Override
    public float hitungPajak(){
        return super.hitungPajak() + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005f);
    }
}

public class Sedan extends Mobil{
    String fasilitasKeamanan, fasilitasKenyamanan;
    int kapasitasCC;
    
    public Sedan(){
        super("Tidak Tersedia", "Tidak Tersedia", 0.0f);
        this.fasilitasKeamanan = "";
        this.fasilitasKenyamanan = "";
        this.kapasitasCC = 0;
    }
    
    public Sedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC){
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        this.kapasitasCC = kapasitasCC;
    }
    
    public void infoSedan(){
        System.out.println("Fasilitas Keamanan      : " + this.fasilitasKeamanan);
        System.out.println("Fasilitas kenyamanan    : " + this.fasilitasKenyamanan);
        System.out.println("Kapasitas CC            : " + this.kapasitasCC);
    }
    
    @Override
    public void tampilInfo(){
        super.tampilInfo();
        infoSedan();
    }
    
    @Override
    public float hitungPajak(){
        return super.hitungPajak() + (pajak * kapasitasCC * 0.00005f);
    }
}

public class MiniBus extends Bus {
    private String tipe;

    public MiniBus() {
        super();
        this.tipe = "Tidak Tersedia";
    }

    public MiniBus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi, String tipe) {
        super(noPlat, merk, pajak, kapasitasPenumpang, kapasitasBagasi);
        this.tipe = tipe;
    }

    public void infoMiniBus() {
        if (tipe.equals("Pribadi")) {
            System.out.println("Tipe MiniBus: Pribadi, digunakan sebagai kendaraan pribadi");
        } else if (tipe.equals("Wagon")) {
            System.out.println("Tipe MiniBus: Wagon, digunakan sebagai kendaraan angkut/travel");
        }
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoMiniBus();
    }

    @Override
    public float hitungPajak() {
        float pajakSedan = super.hitungPajak();
        float pajakBus = super.hitungPajak();

        if (tipe.equals("Pribadi")) {
            return (pajakSedan * 0.05f) + (pajakBus * 0.03f);
        } else if (tipe.equals("Wagon")) {
            return (pajakSedan * 0.03f) + (pajakBus * 0.05f);
        } else {
            return 0.0f;
        }
    }
}

public interface Kendaraan {
    void tampilInfo();
    float hitungPajak();
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil("B 1234 CD", "Honda", 2000000.0f);
        mobil.tampilInfo();

        // Membuat objek Bus
        Bus bus = new Bus("E 5678 FG", "Mercedes", 3000000.0f, 50, 200);
        bus.tampilInfo();

        // Membuat objek Sedan
        Sedan sedan = new Sedan("F 9012 HI", "Toyota", 1500000.0f, "ABS, Airbag", "AC", 1800);
        sedan.tampilInfo();

        // Membuat objek MiniBus
        MiniBus miniBus = new MiniBus("J 3456 KL", "Nissan", 4000000.0f, 20, 100, "Pribadi");
        miniBus.tampilInfo();
    }
}
