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
    
    private JLabel[] var_labels;
    private JLabel title;
    private JTextField[] var_Texts;
    
    private JButton calculate;
    private int [][] matrix;
    
    public quadaraticFormulaGuiPanel()
    {   
    	set_var_labels();
    	set_var_Texts();
    	
        calculate = new JButton("Solve Equations ");
        calculate.addActionListener(new buttonListener());
        
        setTitle();
        add__var_labels_and_text();
        add(calculate);

        
//        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(320, 450));
    }
    
     
    public void setTitle() {
	    // adding title label
    	title = new JLabel("LINEAR EQUATIONS: "); 
	    title.setBounds(150,20, 600, 30);
	    title.setFont(new Font("Verdana", Font.CENTER_BASELINE, 20));
	    title.setForeground(Color.red);
	}
    
    private void set_var_Texts() {
    	var_Texts = new JTextField[12];
    	for(int i=0; i<var_Texts.length; i++) {
    		var_Texts[i]=new JTextField(4);
    	}}
    
    private void add__var_labels_and_text() {

    	for(int i=0; i<var_labels.length; i++) {
    		add(var_Texts[i]);
    		add(var_labels[i]);
    	}}


    
	private void set_var_labels() {
    	var_labels = new JLabel[12];
    	
		String names[] = {"x+   ", "y+   ","z= ", " "};
		for(int i=0; i<4; i++) {
			String curr = names[i];
			
			var_labels[i]=new JLabel(curr);
			var_labels[i+4]=new JLabel(curr);
			var_labels[i+8]=new JLabel(curr);
		}
		
	}


	public class buttonListener implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {  
        	matrix = new int[3][4];
        	
        	matrix[0][0] = Integer.parseInt( var_Texts[0].getText() );
        	matrix[1][0] = Integer.parseInt( var_Texts[4].getText() );
        	matrix[2][0] = Integer.parseInt( var_Texts[8].getText() );
            
        	matrix[0][1] = Integer.parseInt( var_Texts[1].getText() );
        	matrix[1][1] = Integer.parseInt( var_Texts[5].getText() );
        	matrix[2][1] = Integer.parseInt( var_Texts[9].getText() );
            
            
        	matrix[0][2] = Integer.parseInt( var_Texts[2].getText() );
        	matrix[1][2] = Integer.parseInt( var_Texts[6].getText() );
        	matrix[2][2] = Integer.parseInt( var_Texts[10].getText() );
            
        	matrix[0][3] = Integer.parseInt( var_Texts[3].getText() );
        	matrix[1][3] = Integer.parseInt( var_Texts[7].getText() );
        	matrix[2][3] = Integer.parseInt( var_Texts[11].getText() );
            
            
        	for(int i=0; i<3; i++) {
        		for(int j=0; j<4; j++)
        			System.out.println(matrix[i][j]);        		
        	}
            
            
        }
    }    
    
    @Override
    public void paintComponent(Graphics g)
    {
//        super.paintComponent(g);
//        
//        g.setFont(new Font("Serif", Font.PLAIN, 18));
//        
//        g.setColor(Color.WHITE);
//        g.drawString("-(b) + ", 10, 90);
//        g.drawString("-", 45, 100);
//        g.drawString("_____________", 60, 68);
//        g.drawString("|     2", 57, 84);
//        g.drawString("| (b)   - 4 (a) (c)", 57, 100);
//        g.drawString("__________________", 10, 110);
//        g.drawString("2 (a)", 70, 140);
//        g.drawString("( 1 )", 220, 110);
//        
//        g.drawString("-(" + bValue + ") + ", 10, 180);
//        g.drawString("-", 45, 190);
//        g.drawString("_____________", 60, 158);
//        g.drawString("|     2", 57, 174);
//        g.drawString("| (" + bValue + ")   - 4 (" + aValue + ")" + " (" + cValue + ")", 57, 190);
//        g.drawString("__________________", 10, 200);
//        g.drawString("2 (" + aValue + ")", 70, 230);
//        g.drawString("( 2 )", 220, 200);
//        
//        g.drawString("" + oppositeB + " + ", 10, 270);
//        g.drawString("-", 34, 280);
//        g.drawString("_____________", 60, 248);
//        g.drawString("|", 57, 264);
//        g.drawString("| " + bSquared + " - " + fourAC, 57, 280);
//        g.drawString("__________________", 10, 290);
//        g.drawString("" + twoA, 70, 320);
//        g.drawString("( 3 )", 220, 290);
//        
//        g.drawString("" + oppositeB + " + ", 10, 360);
//        g.drawString("-", 34, 370);
//        g.drawString("_____________", 60, 338);
//        g.drawString("|", 57, 354);
//        g.drawString("| " + (bSquared - fourAC) , 57, 370);
//        g.drawString("__________________", 10, 380);
//        g.drawString("" + twoA, 70, 410);
//        g.drawString("( 4 )", 220, 380);
//
//        g.drawString("Solve rest of equation . . . ", 10, 450);
//               
//        repaint();
    }

}