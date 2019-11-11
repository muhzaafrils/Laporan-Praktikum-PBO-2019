/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author WINDOWS 10
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720123Zaafril extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;
    
    public MyInputForm1841720123Zaafril(){
        createTextFieldZaafril();
        createButtonZaafril();
        createPanelZaafril();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createTextFieldZaafril(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Nilai C: ");
        dLabel = new JLabel("Hasil Penambahan : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButtonZaafril(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a*b;
                cLabel.setText("Hasil: " + c);
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void createButton1Zaafril(){
        button = new JButton("Addition");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int d = a+b;
                cLabel.setText("Hasil Penambahan : " + d);
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createPanelZaafril() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        panel.add(button1);
        panel.add(dLabel);
        add(panel);
    }
    
    public static void main(String[] args){
        JFrame frame = new MyInputForm1841720123Zaafril();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
