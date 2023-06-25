Main.java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Buku novel, fiksi;
        
        novel = new Buku();
        fiksi = new Buku();
        
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            // novel
            System.out.print("Masukkan Judul Buku   : ");
            novel.setJudul(br.readLine().toString());
            System.out.print("Masukkan Pengarang    : ");
            novel.setPengarang(br.readLine().toString());
            novel.setInfo(0.2f, 45000);
            System.out.print("Masukkan Jumlah Halaman   : ");
            novel.setJmlhHalaman(Integer.parseInt(br.readLine().toString()));
            novel.cetak();
            System.out.println();
            
            //fiksi
            System.out.print("Masukkan Judul Buku   : ");
            fiksi.setJudul(br.readLine().toString());
            System.out.print("Masukkan Pengarang    : ");
            fiksi.setPengarang(br.readLine().toString());
            fiksi.setInfo(45000);
            System.out.print("Masukkan Jumlah Halaman   : ");
            fiksi.setJmlhHalaman(Integer.parseInt(br.readLine().toString()));
            fiksi.cetak();
            //selama gak eroro menjalankan atas
        }catch(Exception ex){
            //jika ada eror akan menampilkan exceptin
            System.out.println(ex);
        }
    }
}
Buku.java

public class Buku {
    //atributes
    private String pengarang;
    private String judul;
    
    private int jmlh_Halaman;
    private float diskon;
    private double harga;
    
    //methods Constructor
    public Buku(){
        System.out.println("Konstruktor buku dijalankan...");
    }
    
    //fungsi-fungsi mutator
    public void setPengarang(String Pengarang){
        this.pengarang = Pengarang;
    }
    
    public void setJudul(String Judul){
        this.judul = Judul;
    }
    
    public void setJmlhHalaman(int JmlhHalaman){
        this.jmlh_Halaman = JmlhHalaman;
    }
    
    //fungsi-fungsi accessor
    public String getPengarang(){
        return pengarang;
    }
    
    public String getJudul(){
        return judul;
    }
    public int getJmlhHalaman(){
        return jmlh_Halaman;
    }
    
    // method overloading
    public void setInfo(float dskn, double HargaBuku){
        this.diskon = dskn;
        this.harga = HargaBuku - (HargaBuku * diskon);
    }
    
    public void setInfo(double HargaBuku){
        this.diskon = 0.1f;
        this.harga = HargaBuku - (HargaBuku * diskon);
    }
    
    public void cetak(){
        System.out.println("Judul Buku  : " + getJudul());
        System.out.println("Pengarang Buku  : " + getPengarang());
        System.out.println("Jumlah halaman Buku : " + getJmlhHalaman() + " halaman");
        System.out.println("Diskon Buku         : " + diskon);
        System.out.println("Harga Buku          : " + harga);
        System.out.println("");
    }
}
