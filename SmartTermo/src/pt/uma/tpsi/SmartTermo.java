package pt.uma.tpsi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SmartTermo extends JFrame{

    //Panels
    private JPanel mainPanel;
    private JPanel statusPanel;
    private JPanel tempPanel;
    private JPanel humdPanel;
    private JPanel changeTempFormatPanel;
    private JPanel actualTempPanel;
    private JPanel desireTempPanel;

    //Labels
    private JLabel actualTempLabel;
    private JLabel desireTempLabel;


    //Scroll
    private JScrollPane logScrollPanel;


    //TextFields
    private JTextField actualTempTextField;
    private JTextField desireTempTextField;
    //Buttons
    private JButton increaseTempButton;
    private JButton changeTempFormatButton;
    private JButton reduceTempButton;


    //atributes
    private float actualTemp;
    private float desiredTemp;
    private float tempFormat;

    //constructor
    public SmartTermo(String title){
        super(title);
        this.setContentPane(mainPanel);
        this.pack();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //initializations
        actualTemp=22;  //represents in C
        desiredTemp=22; //represents in C
        tempFormat=0; // 0=celcius / 1=Fareheith
        updateTextFields();


        //button actions
        changeTempFormatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tempFormat == 0)
                    tempFormat = 1;
                else{
                    tempFormat = 0;
                }
                updateTextFields();
            }
        });
        increaseTempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualTemp+=0.5;
                desiredTemp+=0.5;
                updateTextFields();
            }
        });
        reduceTempButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualTemp-=0.5;
                desiredTemp-=0.5;
                updateTextFields();
            }
        });
    }

    //methods
    private void updateTextFields(){
        if (tempFormat==0){
            //celcius
            actualTempTextField.setText(String.valueOf(actualTemp)+"Cº");
            desireTempTextField.setText(String.valueOf(desiredTemp)+"Cº");
        }
        else{
            //Fareheith
            actualTempTextField.setText(String.valueOf(actualTemp*9/5+32)+"Cº");
            desireTempTextField.setText(String.valueOf(desiredTemp*9/5+32)+"Cº");
        }
    }

    //main
    public static void main(String[] args) {

        JFrame smartTermo = new SmartTermo("TPSI");
        smartTermo.setVisible(true);
    }

}
