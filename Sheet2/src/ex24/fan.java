package ex24;

public class fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double Radius;
    String Color;
    fan(){
        speed = SLOW;
        on = false;
        Radius = 5;
        Color="blue";
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public String getSpeed(){
        String s= "";
        switch (speed){
            case SLOW : s="SLOW"; break;
            case MEDIUM : s="MEDIUM"; break;
            case FAST: s= "FAST";
        }
        return s;
    }
    public void seton(){
        on = true;
    }
    public void setoff(){
        on = false;
    }
    public boolean iSon(){
        return on;
    }
    public void setRadius(double radius){
        this.Radius = radius;
    }
    public double getRadius(){
        return Radius;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public String getColor(){
        return Color;
    }
    public String toString(){
        if(on==true){
            return"\nFan Speed: "+getSpeed()+"\nColor: "+getColor()+"\nRadius: "+getRadius()+"\n";
        }
        else
            return "\nFan Color: "+getColor()+"\nRadius: "+getRadius()+"\nFan is OFF\n";
    }
    public static void main(String[] args){
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        fan obj1 = new fan();
        fan obj2 = new fan();
        obj1.setSpeed(FAST);
        obj1.setRadius(10);
        obj1.setColor("yellow");
        obj1.seton();
        System.out.println(obj1.toString());
        obj2.setSpeed(MEDIUM);
        obj2.setRadius(5);
        obj2.setColor("blue");
        obj2.setoff();
        System.out.println(obj2.toString());
    }
}
