import javax.swing.JOptionPane;

public class FirstGUI{
    public static void main (String[] args){

        String name = JOptionPane.showInputDialog("Please enter your name buddy");
        JOptionPane.showMessageDialog(null, "Nice to meet you " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you by the way? "));
        JOptionPane.showMessageDialog(null, "Oh cool. You are " + age + " Years old!");
        double GPA = Double.parseDouble(JOptionPane.showInputDialog("What's your current GPA? "));
        JOptionPane.showMessageDialog(null, "Your GPA is a " + GPA + " ?" + " Not bad at all!");
    }
}