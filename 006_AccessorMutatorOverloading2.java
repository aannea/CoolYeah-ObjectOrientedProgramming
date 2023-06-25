Main.java

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Karyawan karyawan = new Karyawan(21102059, "Farhan Aryo Pangestu", "Purwokerto", 25000000, 15);
        
        karyawan.hitungTotalGaji();
        System.out.println("NIP         : " + karyawan.getNip());
        System.out.println("Nama        : " + karyawan.getNama());
        System.out.println("Alamat      : " + karyawan.getAlamat());
        System.out.println("Gaji Pokok  : " + formatUang(karyawan.getGajiPokok()));
        System.out.println("Total Gaji  : " + formatUang(karyawan.getTotalGaji()));

        System.out.println("");
        System.out.print("NIP                   : ");
        karyawan.setNip(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nama                  : ");
        karyawan.setNama(scanner.nextLine());
        System.out.print("Alamat                : ");
        karyawan.setAlamat(scanner.nextLine());
        System.out.print("Lama Lembur           : ");
        karyawan.setJumlahHariLembur(scanner.nextInt());
        System.out.print("Gaji Pokok            : ");
        double gajiPokok = scanner.nextDouble();
        karyawan.setGajiPokok(gajiPokok);// ini lupa nambahin
        System.out.print("Tahunan(true/false)   : ");
        boolean tahunan = scanner.nextBoolean();
        karyawan.setGajiPokok(gajiPokok, tahunan);
        karyawan.hitungTotalGaji();
        
        System.out.println("");
        System.out.println("NIP         : " + karyawan.getNip());
        System.out.println("Nama        : " + karyawan.getNama());
        System.out.println("Alamat      : " + karyawan.getAlamat());
        System.out.println("Gaji Pokok  : " + formatUang(karyawan.getGajiPokok()));
        System.out.println("Total Gaji  : " + formatUang(karyawan.getTotalGaji()));

        scanner.close();
    }
    public static String formatUang(double nilai) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return "Rp " + formatter.format(nilai);
    }
}
Karyawan.java

public class Karyawan {
    //atribute
    private int nip;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private double gajiPokok;
    private double totalGaji;
    
    //constructor
    public Karyawan(int nip, String nama, String alamat, double gajiPokok, double jumlahHariLibur){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.gajiPokok = gajiPokok;
        this.jumlahHariLembur = jumlahHariLembur;
    }
    
    //accessor
    public int getNip(){
        return this.nip;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public int getJumlahHariLembur(){
        return this.jumlahHariLembur;
    }
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    public double getTotalGaji(){
        return this.totalGaji;
    }
    
    //mutator methods
    public void setNip(int nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setJumlahHariLembur(int jumlahHariLembur){
        this.jumlahHariLembur = jumlahHariLembur;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    //overloading
    public void setGajiPokok(double gajiPokok, boolean tahunan){
        if(tahunan){
            this.gajiPokok = gajiPokok / 12;
        }else{
            this.gajiPokok = gajiPokok;
        }
    }
    public void hitungTotalGaji(){
        totalGaji = gajiPokok + (gajiPokok*jumlahHariLembur*0.01);
    }
}
