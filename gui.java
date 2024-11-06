
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
