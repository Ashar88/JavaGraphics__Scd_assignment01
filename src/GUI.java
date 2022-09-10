
//package JavaGraphics__Scd_assignment01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0");
    private JFrame frame = new JFrame();
    JButton button;
	public int click;

    public GUI() {

        // the clickable button
        button = new JButton("Click me");
        button.addActionListener(new buttonListener());

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks

public class buttonListener implements ActionListener
{
    @Override
    public void actionPerformed (ActionEvent e)
    {            
//        aValue = Integer.parseInt(aText.getText());
//        bValue = Integer.parseInt(bText.getText());
//        cValue = Integer.parseInt(cText.getText());
//        
    	click++;
    	button.setText("hwllo ggggggg");
    }
}
    
    // create one Frame
    public static void main(String[] args) {
        new GUI();
    }
}