import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuadaraticFormulaGui {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Quadratic formula");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new quadaraticFormulaGuiPanel());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);        
    }
}