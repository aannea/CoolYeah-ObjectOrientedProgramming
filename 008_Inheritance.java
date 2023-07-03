public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6.5f,8.2f, 1.9f);
        circle1.cetakPoint();
        System.out.println(" ");
        Circle circle2 = new Circle(10, 5, 5);
        circle2.cetakPoint();
    }
}

public class Point {
    protected float x, y;
    public Point(float a, float b){
        System.out.println("Konstruktor point dijalankan");
        this.x = a;
        this.y = b;
    }
    public void cetakPoint(){
        System.out.println("Point :["+x+", "+y+"] ");
    }
}

public class Circle extends Point{
    private float radius;
    public Circle(float r, float a, float b){
        super(a,b);
        this.radius = r;
        System.out.println("Konstruktor Circle dijalankan");
    }
    
    @Override
    public void cetakPoint(){
        super.cetakPoint();
        System.out.println("Radius : ["+radius+"] ");
    }
}
