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
import javax.swing.border.EmptyBorder;
import java.util.Random;

import Jama.*;
import Jama.Matrix;


public class LinearEquationSystems extends JPanel{
    
    private JLabel[] var_labels;
    private JLabel title;
    private JTextField[] var_Texts;
    private Random rand = new Random();
    
    private JButton calculate;
    private double[][] mat;
    private double x=-10,y=-10,z=-1;
    private JLabel t1,t2,t3;
    
    public LinearEquationSystems()
    {   
    	set_var_labels();
    	set_var_Texts();
    	
        calculate = new JButton("Solve Equations ");
        calculate.addActionListener(new buttonListener());
        
        setTitle();
        add__var_labels_and_text();
        add(calculate);
        set_ans___();    
        
        
//        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(320, 450));
    }
    
     
    private void set_ans___() {
    	t1 =  new JLabel("X: "+x);
    	t1.setFont(new Font("Verdana", Font.CENTER_BASELINE, 20));
        t1.setBorder(new EmptyBorder(10, 70, 10, 50));
    	
    	t2 =  new JLabel("Y: "+y);
    	t2.setFont(new Font("Verdana", Font.CENTER_BASELINE, 20));
    	t2.setBorder(new EmptyBorder(10, 70, 10, 50));

    	t3 =  new JLabel("Z: "+z); 
    	t3.setFont(new Font("Verdana", Font.CENTER_BASELINE, 20));
    	t3.setBorder(new EmptyBorder(10, 70, 10, 50));
    	
    	add(t1);
    	add(t2);
    	add(t3);
	}

    private void set_ans____() {
    	t1.setText("X: "+x);
    	t2.setText("Y: "+y);
    	t3.setText("Z: "+z);
    }

	public void setTitle() {
	    // adding title label
    	title = new JLabel("LINEAR EQUATIONS:      ");
    	title.setBorder(new EmptyBorder(10, 100, 10, 50));
//	    title.setBounds(20,20, 20, 30);
	    title.setFont(new Font("Verdana", Font.CENTER_BASELINE, 20));
	    title.setForeground(Color.red);
	    add(title);
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
        	mat = new double[3][3];
        	
        	mat[0][0] = Double.parseDouble( var_Texts[0].getText() );
        	mat[1][0] = Double.parseDouble( var_Texts[4].getText() );
        	mat[2][0] = Double.parseDouble( var_Texts[8].getText() );
            
        	mat[0][1] = Double.parseDouble( var_Texts[1].getText() );
        	mat[1][1] = Double.parseDouble( var_Texts[5].getText() );
        	mat[2][1] = Double.parseDouble( var_Texts[9].getText() );
            
            
        	mat[0][2] = Double.parseDouble( var_Texts[2].getText() );
        	mat[1][2] = Double.parseDouble( var_Texts[6].getText() );
        	mat[2][2] = Double.parseDouble( var_Texts[10].getText() );
        	
        	double[] mat2 = new double[3];
        	double xyz=x = rand.nextDouble();
        	double mnfo=y = rand.nextDouble();
        	double fjjdo=z = rand.nextDouble();
        	x = Math.ceil(x*10);  y = Math.ceil(y*10);  z = Math.ceil(z*10); set_ans____();
        	
            
        	mat2[0] = Double.parseDouble( var_Texts[3].getText() );
        	mat2[1] = Double.parseDouble( var_Texts[7].getText() );
        	mat2[2] = Double.parseDouble( var_Texts[11].getText() );
            
            
//        	for(int i=0; i<3; i++) {
//        		for(int j=0; j<3; j++)
////        			System.out.println(mat[i][j]);        		
//        	}
            
      	    Matrix matrix1 = new Matrix(mat);
      	    Matrix matrix2 = new Matrix(mat2,3);
      	    
      	    Matrix ans = matrix1.solve(matrix2);
      	    
      	    
        }
    }    
    
   
}