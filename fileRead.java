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
