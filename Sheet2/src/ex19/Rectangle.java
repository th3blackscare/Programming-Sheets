package ex19;
/*
 * Author = Omar Sharif - Th3BlackScare
 */
public class Rectangle {
    double height = 1;
    double width = 1;
    Rectangle(){
    }
    Rectangle(double w, double h){
        width = w;
        height = h;
    }
    public double getArea(){
        return width* height;
    }
    double getPerimeter(){
        return (2*(width+height));
    }
    void display(){
        System.out.println("Width: "+width+" Height: "+height);
    }
    public static void main(String[] Args){
        Rectangle one = new Rectangle(4,40);
        Rectangle two = new Rectangle(3.5,35.9);
        one.display();
        System.out.println("Area : "+one.getArea()+" Perimeter: "+one.getPerimeter());
        two.display();
        System.out.println("Area : "+two.getArea()+" Perimeter: "+two.getPerimeter());
    }
}
