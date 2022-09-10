import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class quadaraticFormulaGuiPanel extends JPanel{
    
    private JLabel aLabel, bLabel, cLabel;
    private JTextField aText, bText, cText;
    private JButton calculate;
    private int aValue, bValue, cValue, oppositeB, bSquared, fourAC, twoA;
    
    public quadaraticFormulaGuiPanel()
    {    
        aLabel = new JLabel("A value:");
//        aLabel.setForeground(Color.WHITE);
        bLabel = new JLabel("B value:");
//        bLabel.setForeground(Color.WHITE);
        cLabel = new JLabel("C value:");
//        cLabel.setForeground(Color.WHITE);
        
        aText = new JTextField(4);
        bText = new JTextField(4);
        cText = new JTextField(4);
        
        calculate = new JButton("Show the steps");
        calculate.addActionListener(new buttonListener());
        
        add(aLabel);
        add(aText);
        add(bLabel);
        add(bText);
        add(cLabel);     
        add(cText);
        
        add(calculate);

//        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(350, 450));
    }
    
        
    public class buttonListener implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {            
            aValue = Integer.parseInt(aText.getText());
            bValue = Integer.parseInt(bText.getText());
            cValue = Integer.parseInt(cText.getText());
            
            oppositeB = bValue - (bValue * 2);
            bSquared = bValue * bValue;
            fourAC = 4 * aValue * cValue;
            twoA = 2 * aValue;
        }
    }    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        
        g.setColor(Color.WHITE);
        g.drawString("-(b) + ", 10, 90);
        g.drawString("-", 45, 100);
        g.drawString("_____________", 60, 68);
        g.drawString("|     2", 57, 84);
        g.drawString("| (b)   - 4 (a) (c)", 57, 100);
        g.drawString("__________________", 10, 110);
        g.drawString("2 (a)", 70, 140);
        g.drawString("( 1 )", 220, 110);
        
        g.drawString("-(" + bValue + ") + ", 10, 180);
        g.drawString("-", 45, 190);
        g.drawString("_____________", 60, 158);
        g.drawString("|     2", 57, 174);
        g.drawString("| (" + bValue + ")   - 4 (" + aValue + ")" + " (" + cValue + ")", 57, 190);
        g.drawString("__________________", 10, 200);
        g.drawString("2 (" + aValue + ")", 70, 230);
        g.drawString("( 2 )", 220, 200);
        
        g.drawString("" + oppositeB + " + ", 10, 270);
        g.drawString("-", 34, 280);
        g.drawString("_____________", 60, 248);
        g.drawString("|", 57, 264);
        g.drawString("| " + bSquared + " - " + fourAC, 57, 280);
        g.drawString("__________________", 10, 290);
        g.drawString("" + twoA, 70, 320);
        g.drawString("( 3 )", 220, 290);
        
        g.drawString("" + oppositeB + " + ", 10, 360);
        g.drawString("-", 34, 370);
        g.drawString("_____________", 60, 338);
        g.drawString("|", 57, 354);
        g.drawString("| " + (bSquared - fourAC) , 57, 370);
        g.drawString("__________________", 10, 380);
        g.drawString("" + twoA, 70, 410);
        g.drawString("( 4 )", 220, 380);

        g.drawString("Solve rest of equation . . . ", 10, 450);
               
        repaint();
    }

}