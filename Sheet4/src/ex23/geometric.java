package ex23;

public class geometric {



    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    public geometric(){
        dateCreated = new java.util.Date();
    }
    public geometric(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(String color){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on " + dateCreated + "/ncolor:" + color + "and filled : " + filled;
    }

}
