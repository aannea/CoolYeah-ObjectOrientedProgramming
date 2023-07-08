public class Main {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Tidak berhak melakukan to vote");
        }else{
            System.out.println("Berhak melakukan vote!!");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("sisa code...");
    }
}
