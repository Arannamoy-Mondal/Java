<h1>Java</h1>
<ol>
    <li><a href="#constructor">Constructor</a></li>
    <li><a href="#inheritance">Inheritance</a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
    <li><a href=""></a></li>
</ol>


<div id="inheritance">
    <pre>
    # Java
<!-- # <a href="https://arannamoy-mondal.github.io/Java/">https://arannamoy-mondal.github.io/Java/</a> -->

`Inheritance:`
<br>
`Base class:`

```java

abstract public class a_inheritance_1 {

    public int sum(int ... args) {
        int res = 0;
        for (int it : args) {
            res += it;
        }
        return res;
    }

    public int multiplication(int ...args){
        int res=1;
        for(int it:args){
            res*=it;
        }
        return res;
    }
}

```

`Child class:`

```java
public class b_inheritance_2 extends a_inheritance_1 {
    @Override
    public int sum(int ...args){
        return super.sum(args)+10;
    }
}

```

`main class:`

```java

public class main {
    public static void main(String[] args) {
        // ineritance
        b_inheritance_2 inheritance1=new b_inheritance_2();
        System.out.println(inheritance1.sum(10,20,30));
        System.out.println(inheritance1.multiplication(10,20));// this multi function does not call in child class
    }
}

```


`Override Method:`

<br>

`Base class:`

```java
abstract public class c_override_method {
    void output(){

    }
}
```
`Child class:`

```java
public class c_override_method_2 extends c_override_method{
    void output(String a){
        System.out.println(a);
    }
} 
```

`main class`

```java

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

```

`output:`

```java
70
200
Override
```

`DRY Nature:`
<br>
`Do not repeat code.`

`Base Class:`

```java
import java.util.*;
public class baseClass {
    private String name;
    private String id;
    private double bankBalance;
    private String email,address;
    public void baseClasse(String name,double bankBalance,String email,String address){
        this.name=name;
        this.id=String.format("%d",new Random().nextInt(10000));
        this.bankBalance=bankBalance;
        this.email=email;
        this.address=address;
    }


    // class method. just use static keyword
    public static int sumFunction(int ...args){
        int res=0;
        for(int it:args){
            res+=it;
        }
        return res;
    }
}
```

`Child Class:`

```java
public class d_dry_inheritance extends baseClass{
    public static void main(String[] args) {
        multplicationAndSum(10,20,30,40);
    }

    public static void multplicationAndSum(int ...args){
        System.out.println(baseClass.sumFunction(args));// dry nature. sumFunction is inherited from baseClass
        int res=1;
        for(int it:args){
            res*=it;
        }
        System.out.println(res);
    }
}

```

```java

100
240000

```

</pre>
</div>