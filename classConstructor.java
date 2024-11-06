import  java.util.*;
public class classConstructor {
    String name;
    int age;
    double balance;
    String id;
    public void classConstructor(String name,int age,double balance){
        this.name=name;
        this.age=age;
        this.balance=balance;
        this.id=String.format("%d",new Random().nextInt(1000));
    }

    // toString method works like overloading method
    public String toString(){
        return "Name: "+name+", id: "+id+", age: "+", balance: "+balance;
    }
}
