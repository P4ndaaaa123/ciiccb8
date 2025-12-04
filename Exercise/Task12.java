class Point{
    
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("(" + x + "," + y +")");
    }

    // Method to scale the point
    public void scale(double scaleX, double scaleY){
        this.x = this.x * scaleX;
        this.y = this.y * scaleY;
    }
}

public class Task12 {

    public static void main(String[] args) {
        
        Point p = new Point(64, 64);
        
        for(int i = 0; i < 5; i++){
            p.scale(0.5, 0.5);
            p.print();
        }
    }
}
