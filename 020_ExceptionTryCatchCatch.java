public class Main {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("Ada Kesalahan : Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ada Kesalahan : Array Index Out of Bounds Exception");
        }
        System.out.println("Setelah Exception");
    }
}
