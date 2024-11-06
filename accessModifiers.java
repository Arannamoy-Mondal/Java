public class accessModifiers {
    public static void main(String[] args) {
        baseClass myClass=new baseClass("Hi",500.00,"email.com","Maryland");
        System.out.println(myClass.getName());// here, name attribute of myClass can not return value because it is a private attribute, so use getter method
        String s="Hello"; // default modifier
    }
}

