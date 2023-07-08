import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> integers = new ArrayList<Integer>();
    public static void addInteger(Integer value) throws IllegalArgumentException{
        if (integers.contains(value)){
            throw new IllegalArgumentException("Integer already added.");
        }
        integers.add(value);
    }
    public static void main(String[] args) {
        try {
            addInteger(1);
            addInteger(2);
            addInteger(3);
            addInteger(1);
        } catch (IllegalArgumentException iae) {
            System.out.println("Terjadi Kesalahan : " + iae);
        }
        for(int i=0; i<integers.size(); i++){
            System.out.println(integers.get(i) + " ");
        }
    }
}
