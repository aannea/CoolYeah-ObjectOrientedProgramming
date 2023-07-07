public class Engine {
    public int cc;
    public String merk;
    
    public void on(){
        System.out.println("Mesin Mobil " + this.merk + " dengan CC " + this.cc + " ON");
    }
    
    public void off(){
        System.out.println("Mesin Mobil " + this.merk + " dengan CC " + this.cc + " OFF");
    }
}

public class Mobil {
    public int status;
    private Engine mesin;
    
    public void setEngine(Engine Engine){
        this.mesin = Engine;
    }
    
    public void Start(){
        if(this.status != 1){
            System.out.println("=====================================");
            this.mesin.on();
            this.status = 1;
            System.out.println("Mobil Menyala");
            System.out.println("=====================================");
        }else{
            System.out.println("==============================");
            System.out.println("Mesin Sudah Menyala Sebelumnya");
            System.out.println("==============================");
        }
        System.out.println();
    }
    
    public void Run(){
        if(this.status == 1){
            System.out.println("==============");
            System.out.println("Mobil Berjalan");
            System.out.println("==============");
        }else{
            System.out.println("===================");
            System.out.println("Mobil Belum Menyala");
            System.out.println("===================");
        }
        System.out.println();
    }
    
    public void Stop(){
        if(status == 1){
            System.out.println("=====================================");
            this.mesin.off();
            this.status = 0;
            System.out.println("Mobil Berhasil Di Matikan");
            System.out.println("=====================================");
        }else{
            System.out.println("==============================");
            System.out.println("Mobil Belum Menyala Sebelumnya");
            System.out.println("==============================");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Engine Engine = new Engine();
        Engine.cc = 2000;
        Engine.merk = "Innova";
        
        Mobil Mobil = new Mobil();
        Mobil.setEngine(Engine);
        
        Mobil.Start();
        Mobil.Run();
        Mobil.Stop();
        
        Mobil.Start();
        Mobil.Start();
        Mobil.Stop();
        Mobil.Stop();
        Mobil.Run();
    }
}
