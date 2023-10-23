import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example01 extends JFrame {


    private javax.swing.JPanel JPanel;
    private JTextField wartoscC;
    private JButton zamienButton;
    private JLabel JLabelScore;
    private JButton wyjscieButton;

    double tempC , score;

    public static void main(String[] args) {
        Example01 example01 = new Example01();
        example01.setVisible(true);
    }
    public Example01(){
        super("Konwersja temperatury");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //int width = 400, height = 400;
        //this.setSize(width,height);
        this.pack();

        zamienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            tempC = Double.parseDouble(wartoscC.getText());
            score = tempC * 9/5 + 32;
            JLabelScore.setText(String.valueOf(tempC) + " stopni Celsjusza to " +score + " stopni Fahrenheit'a");

            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
