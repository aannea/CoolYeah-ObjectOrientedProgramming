public class Main {
    public static void main(String[] args) {
        Satpam S = new Satpam("Rendra", "0042", "Jl. Itik 15", 2000, 300000, 5);
        Sales T = new Sales("Wibisana", "0185", "Jl. Ayam 78", 2006, 500000, 10);
        Manager M = new Manager("Adi", "0005", "Jl. Angsa 56", 2000, 1500000, "Keuangan");

        System.out.println("== DISPLAY DATA KARYAWAN ==");
        S.cetakSatpam();
        T.cetakSales();
        M.cetakManager();
    }
}

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;
    protected int tahunMasukKerja;  
    
    public Pegawai(String nama, String nip, String alamat, int tahunMasukKerja){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.tahunMasukKerja = tahunMasukKerja;
    }
    
    public void cetakPegawai(){
        System.out.println("Nama                : " + this.nama);
        System.out.println("NIP                 : " + this.nip);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Tahun Masuk Kerja   : " + this. tahunMasukKerja);
    }
    
    public static String formatUang(double nilai) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return "Rp " + formatter.format(nilai);
    }
}

public class Satpam extends Pegawai{
    private int gajiPokok;
    private int jamLembur;
    
    public Satpam(String nama, String nip, String alamat, int tahunMasukKerja, int gajiPokok, int jamLembur){
        super(nama, nip, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }
    
    public double hitungGajiAkhir(){
        return gajiPokok + this.jamLembur * 10000;
    }
    
    public void cetakSatpam(){
        System.out.println("\n== DATA SATPAM ==");
        super.cetakPegawai();
        System.out.println("Jam lembur          : " + jamLembur + "/jam");
        System.out.println("Gaji Pokok          : " + formatUang(gajiPokok));
        System.out.println("Gaji Total Satpam   : " + formatUang(hitungGajiAkhir()));
    }
}

public class Sales extends Pegawai{
    private int gajiPokok;
    private int jumlahPelanggan;
    
    public Sales(String nama, String nip, String alamat, int tahunMasukKerja, int gajiPokok, int jumlahPelanggan){
        super(nama, nip, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.jumlahPelanggan = jumlahPelanggan;
    }
    
    public double hitungGajiAkhir(){
        return gajiPokok + this.jumlahPelanggan * 500000;
    }
    
    public void cetakSales(){
        System.out.println("\n== DATA SALES ==");
        super.cetakPegawai();
        System.out.println("Jumlah Pelanggan    : " + jumlahPelanggan + "/orang");
        System.out.println("Gaji Pokok          : " + formatUang(gajiPokok));
        System.out.println("Gaji Total Sales    : " + formatUang(hitungGajiAkhir()));
    }
}

public class Manager extends Pegawai{
    private int gajiPokok;
    private String divisi;
    private int tahunMasukKerja;
    
    public Manager(String nama, String nip, String alamat, int tahunMasukKerja, int gajiPokok, String divisi){
        super(nama, nip, alamat, tahunMasukKerja);
        this.tahunMasukKerja = tahunMasukKerja;
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
    }
    
    public double hitungGajiAkhir(){
        if(2015-this.tahunMasukKerja<5){
            return gajiPokok + (gajiPokok*0.05);
        }else{
            return gajiPokok + (gajiPokok*0.1);
        }
    }
    
    public void cetakManager(){
        System.out.println("\n== DATA MANAGER ==");
        super.cetakPegawai();
        System.out.println("Jam lembur          : " + divisi);
        System.out.println("Gaji Pokok          : " + formatUang(gajiPokok));
        System.out.println("Gaji Total Satpam   : " + formatUang(hitungGajiAkhir()));
    }
}
