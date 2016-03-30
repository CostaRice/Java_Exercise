import javax.swing.JOptionPane;
/**
 * Created by CostaHu on 2016/3/1.
 */
public class Dialog {
    public static void main(String[] args) {

        int answer1 = JOptionPane.showConfirmDialog(null,"Is this a dialog?");
        System.out.println("The answer is " + answer1);

        JOptionPane.showMessageDialog(null,"This is a dialog that shows message",
                "This is the title",JOptionPane.INFORMATION_MESSAGE);

        String string2 = JOptionPane.showInputDialog(null,"Enter an input","This is the title"
                ,JOptionPane.QUESTION_MESSAGE);
        System.out.println("The string is " + string2);
    }
}
