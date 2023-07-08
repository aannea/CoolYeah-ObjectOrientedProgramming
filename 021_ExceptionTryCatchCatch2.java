public class Main {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Ada Kesalahan : Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ada Kesalahan : Array Index Out of Bounds Exception");
        }
        System.out.println("Setelah Exception");
    }
}
