public class Main {
    public static void cetak(String kata) throws NullPointerException{
        if (kata == null){
            throw new NullPointerException("Kata tidak diperbolehkan bernilai Null!!!");
        }
        System.out.println("Panjang Kata" + kata.length());
    }
    
    public static void main(String[] args) {
        try {
            String kata = null;
            cetak(kata);
        } catch (NullPointerException e) {
            System.out.println("Terdapat kesalahan : " + e.getMessage());
            System.out.println("Berikan kata, Tidak boleh Null!!!");
        }
    }
}
