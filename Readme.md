<h1>Java</h1>
<ol>
    <li><a href="#gui">Graphical User Interface</a></li>
    <li><a href="#dateTime">Date Time</a></li>
    <li><a href="#fileHandeling">File Handeling</a></li>
    <li><a href="#stringFormat">String format & Random Generate</a></li>
    <li><a href="">Access Modifiers</a></li>
    <li><a href="#constructor">Class & Constructor</a></li>
    <li><a href="">Static Method</a></li>
    <li><a href="">Getter Setter</a></li>
    <li><a href="#inheritance">Inheritance</a></li>
    <li><a href="">Interface</a></li>
    <li><a href="">Encapsulation</a></li>
    <li><a href="">Abstract Class & Abstract Method</a></li>
    <li><a href="">Polymorphism</a></li>
    <li><a href="">Overriding Method</a></li>
    <li><a href="">Overloading Method</a></li>
    <li><a href=""></a></li>
</ol>


<div id="stringFormat">

`String Format and Random Generate`:

```java
import java.util.*;
public class stringFormat {
    public static void main(String[] args) {
        int a=10;
        String s=String.format("%d",a);
        System.out.println(s.length());
        Random rand=new Random();
        System.out.println(String.format("%d",rand.nextInt(10000)));

    }    
}

```
</div>
<!-- GUI -->

<div id="gui">

`Graphical User Interface:`

```java
    
import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
        String s=JOptionPane.showInputDialog("Enter name");
        JOptionPane.showMessageDialog(null, s);

        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter a integer number"));
        JOptionPane.showMessageDialog(null,a);
        float f=Float.parseFloat(JOptionPane.showInputDialog("Enter a float number:"));
        JOptionPane.showMessageDialog(null,f);
        
    }
}

```

</div>

<!-- DateTime -->

<div id="dateTime">

`DateTime:`

```java
import java.time.*;
import java.time.format.DateTimeFormatter;
public class dateTime {
    public static void main(String[] args) {
        /*
         4 type of data in dateTime:
         1.LocalDate
         2.LocalTime
         3.LocalDateTime
         4.DateTimeFormatter 
        */

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        DateTimeFormatter dateTimeFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(dateTimeFormat));
    }
    
}

```

</div>




<!-- Inheritance div start-->

<div id="inheritance">
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

</div>

<!-- Inheritance div end -->

<!-- file handeling -->

<div id="fileHandeling">

`File Handeling:`
<br>
 
`File Create:`

```java

import java.io.*;
public class fileHandeling {
    public static void main(String[] args) {
        File myFile=new File("input.txt");

        try {
            if(myFile.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch(IOException e){
            System.out.println("An error catch");
            e.printStackTrace();
        }
    }
}

```
<br>

`File read:`

```java

import java.io.File;
import java.io.IOException;
import java.util.*;

public class fileRead {
    public static void main(String[] args) {
        File myFile=new File("input.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("SuccessFully create this file.");
                Scanner scan=new Scanner(myFile); // myFile instead of System.in
                while(scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }
                scan.close();
            }
        } 
        catch (IOException e) {
            System.out.println("An error occur.");
            e.printStackTrace();
        }
    }
    
}

```

`File Delete`


```java


import java.io.File;
import java.io.IOException;
public class fileDelete{

    public static void main(String[] args) {
        File myFile = new File("Input.txt");
        // try 
        {
            
            if (myFile.delete()) {
                System.out.println("Successfully deleted");
            }
            else{
                System.out.println("Already deleted");
            }
        }
        // catch (IOException e) {
        //     System.out.println("An error occur.");
        //     e.printStackTrace();
        // }
    }
}


```

</div>