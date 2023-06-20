public class UnguidedArimatika {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        boolean lagi = true;
        do{
            System.out.println("Menu");
            System.out.println("1. Luas Segitiga");
            System.out.println("2. Luas Lingkaran");
            System.out.println("3. Luas Persegi");
            System.out.println("4. Luas Persegi panjang");
            System.out.println("5. Keluar");
            System.out.print("Pilih   : ");
            int pilih = input.nextInt();
            
            switch (pilih) {
                case 1:
                    System.out.print("Alas Segitiga   : ");
                    float alasSegitiga = input.nextFloat();

                    System.out.print("Tinggi Segitiga : ");
                    float tinggiSegitiga = input.nextFloat();

                    float luasSegitiga = 0.5f * alasSegitiga * tinggiSegitiga;
                    System.out.println("Luas Segitiga   : " + luasSegitiga);
                    break;
                case 2:
                    System.out.print("Jari-Jari Lingkaran   : ");
                    float jariLingkaran = input.nextFloat();
                    
                    float luasLingkaran = (float) (Math.PI * Math.pow(jariLingkaran, 2));
                    System.out.println("Luas Lingkaran          : " + luasLingkaran);
                    break;
                case 3:
                    System.out.print("Sisi          : ");
                    float sisiPersegi = input.nextFloat();
                    
                    float luasPersegi = (float) Math.pow(sisiPersegi, 2);
                    System.out.println("Luas Persegi    : " + luasPersegi);
                    break;
                case 4:
                    System.out.print("Panjang Persegi Panjang   : ");
                    float panjangPersegiPanjang = input.nextFloat();

                    System.out.print("Lebar Persegi Panjang     : ");
                    float lebarPersegiPanjang = input.nextFloat();

                    float luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
                    System.out.println("Luas Persegi Panjang    : " + luasPersegiPanjang);
                    break;
                default:
                    System.out.print("Good Bye");
                    lagi = false;
            }
        }while(lagi);
    }
}
