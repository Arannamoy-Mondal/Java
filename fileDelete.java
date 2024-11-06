
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
