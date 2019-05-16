package ex25;

public class person {
    protected String Name;
    protected String Address;
    protected String PhoneNumber;
    protected String Email;
    public person(String name, String address, String phone, String email) {
        this.Name = name;
        this.Address = address;
        this.PhoneNumber = phone;
        this.Email = email;
    }
    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setAddress(String address){
        this.Address=address;
    }
    public String getAddress(){
        return Address;
    }
    public void setPhoneNumber(String PhoneNumber){
        this.PhoneNumber=PhoneNumber;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    public String getEmail(){
        return Email;
    }
    public String toString(){
        return"Person"+" \nName: "+getName()+" \nPhone Number: "+getPhoneNumber()+" \nAddress: "+getAddress()+" \nEmail: "+getEmail();
    }
}
