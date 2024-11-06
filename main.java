public class main {
    public static void main(String[] args) {
        // ineritance
        b_inheritance_2 inheritance1=new b_inheritance_2();
        System.out.println(inheritance1.sum(10,20,30));
        System.out.println(inheritance1.multiplication(10,20));// this multi function does not declare in child class
      //Override method 
      c_override_method_2 override1=new c_override_method_2(); 
      override1.output("Override");
      
    }
}
