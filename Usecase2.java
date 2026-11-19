abstract class Shape{
    abstract double area();

    public void displayArea(){
        System.out.println("Area = "+ area());
    }

}
class Circle extends Shape{
    double r;

    Circle(double r){
       this.r = r;    // Construction 
    }
   @Override 
    double area(){   //Method
        return 22/7.0*r*r;
    }
    
}
class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length,double width){
       this.length = length;
       this.width = width;
    }
    @Override 
    double area(){
        return length*width;
    }

}

public class Usecase2 {
        public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}

