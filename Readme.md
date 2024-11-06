# Java
# <a href="https://arannamoy-mondal.github.io/Java/">https://arannamoy-mondal.github.io/Java/</a>

`Inheritance:`
`Parent class:`
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

