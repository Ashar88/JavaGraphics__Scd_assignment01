import javax.swing.*;
import Jama.*;
import java.awt.*;
import java.awt.event.*;

public class QuadaraticFormulaGui {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("3-BY-3 MATRIX SOLVER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new quadaraticFormulaGuiPanel());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);        
    }
}