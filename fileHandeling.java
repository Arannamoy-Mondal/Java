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
