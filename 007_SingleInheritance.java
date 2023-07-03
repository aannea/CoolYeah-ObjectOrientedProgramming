public class Main {
    public static void main(String[] args) {
        AnakLaki boy = new AnakLaki();
        System.out.println("Nama        : " + boy.nama + " " + boy.marga);
        System.out.print("Karakter    : ");
        boy.sifatBapak();
        
        AnakCewe girl = new AnakCewe();
        System.out.println("Nama        : " + girl.nama + " " + girl.marga);
        System.out.print("Karakter    : ");
        girl.sifatBapak();
    }
    
}

public class OrangTua {
    public String marga = "Bebas";
    public void sifatBapak(){
        System.out.println("Pemberani");
    }
    public void sifatIbu(){
        System.out.println("Penyayang");
    }
}

public class AnakCewe extends OrangTua{
    String nama = "Queen";
}

public class AnakLaki extends OrangTua{
    String nama = "King";
}
