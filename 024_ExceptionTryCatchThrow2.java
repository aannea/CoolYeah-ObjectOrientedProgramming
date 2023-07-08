public class Main {
    public static void main(String[] args) {
        try {
            int nilai = -5;
            if(nilai<0){
                throw new Exception("Nilai Berisi Angka Negatif!!, Silahkan masukkan Angka Positif");
            }
        } catch (Exception e) {
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
            System.out.println("!!!Tolong Berikan Nilai yang berisikan Angka Positif!!!");
        }
    }
}
