
import java.util.*;

public class baseClass {

    private String name;
    private String id;
    private double bankBalance;
    private String email, address;

    baseClass(String name, double bankBalance, String email, String address) {
        this.name = name;
        this.id = String.format("%d", new Random().nextInt(10000));
        this.bankBalance = bankBalance;
        this.email = email;
        this.address = address;
    }

    // class method. just use static keyword
    public static int sumFunction(int... args) {
        int res = 0;
        for (int it : args) {
            res += it;
        }
        return res;
    }

    // Getter Method
    public String getName() {
        return name;
    }

    // Getter Method
    public String getId() {
        return id;
    }

    // Getter Method
    public double getBankBalance() {
        return bankBalance;
    }

    // Setter method
    public void setName(String newName){
        name=newName;
    }

    // Setter method
    public void setAddress(String newAddress){
        address=newAddress;
    }

}
