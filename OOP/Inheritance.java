class Person{
    public String name,id,address,email;
    Person(String name,String email,String address){
        this.name=name;
        this.email=email;
        this.address=address;
    }
};

class User extends Person{
    public String name,id,address,email;
    private double bankBalance=0;
    User(String name,String id,String address,String email)
    {
        super(name,email,address);
        this.id=id;
    }
    
};

public class Inheritance{
    public static void main(String[] args) {
        
    }
}