package Preisrechner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreisrechnerGUI {
    private JPanel MainPanel;
    private JLabel PreisrechnerLabel;
    private JLabel preisAnfangFeld;
    private JLabel anzahlFeld;
    private JTextField preisAnfangText;
    private JTextField anzahlText;
    private JLabel gesamtFeld;
    private JButton ausführenButton;
    private JTextField gesamtText;

    public PreisrechnerGUI() {
        ausführenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //werte bekommen
                double epreis = Double.valueOf(preisAnfangText.getText());
                int anzahl = Integer.valueOf(anzahlText.getText());

                double gpreis = anzahl * epreis;

                gesamtText.setText(String.valueOf(gpreis));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PreisrechnerGUI");
        frame.setContentPane(new PreisrechnerGUI().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
