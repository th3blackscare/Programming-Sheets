package ex23;

public class triangle  extends geometric {
    private double side1, side2, side3;
    public triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getside1(){
        return side1;
    }
    public double getside2(){
        return side2;
    }
    public double getside3(){
        return side3;
    }
    public double getper(){
        return (side1+side2+side3);
    }
    public double getarea(){
        double S = this.getper()/2;
        return Math.sqrt((S*(S-side1)*(S-side2)*(S-side3)));
    }
    @Override
    public String toString(){
        return super.toString() + "side1" + side1 + "side2" + side2 + "side3" + side3;
    }
}
