public class Main {
    public static void main(String[] args) {
        System.out.println("Sebelum Pembagian");
        try {
            System.out.println("Hasil Bagi : " + 5/0);
        } catch (Exception e) {
            System.out.println("Ada Kesalahan : " + e);
        } finally {
            System.out.println("Hi... Finaly");
        }
        System.out.println("Setelah Pembagian");
    }
}
