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

