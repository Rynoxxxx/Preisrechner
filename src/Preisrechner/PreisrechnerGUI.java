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
    private JButton plusButton;
    private JTextField gesamtText;
    private JButton minusButton;
    private JButton malButton;
    private JButton geteiltButton;
    private JCheckBox checkBox1;

    private boolean aktion;
    public PreisrechnerGUI() {
        aktion=false;
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(checkBox1.isSelected()) {
                   aktion=true;
                }
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //werte bekommen
                double epreis = Double.valueOf(preisAnfangText.getText());
                int anzahl = Integer.valueOf(anzahlText.getText());

                double gpreis = anzahl + epreis;
                if (aktion = true) {
                    gesamtText.setText(String.valueOf(gpreis));
                }
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //werte bekommen
                double epreis = Double.valueOf(preisAnfangText.getText());
                int anzahl = Integer.valueOf(anzahlText.getText());

                double gpreis = epreis - anzahl;
                if (aktion = true) {
                gesamtText.setText(String.valueOf(gpreis));
            }}
        });
        malButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //werte bekommen
                double epreis = Double.valueOf(preisAnfangText.getText());
                int anzahl = Integer.valueOf(anzahlText.getText());

                double gpreis = anzahl * epreis;
                if (aktion = true) {
                gesamtText.setText(String.valueOf(gpreis));
            }}
        });
        geteiltButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //werte bekommen
                double epreis = Double.valueOf(preisAnfangText.getText());
                int anzahl = Integer.valueOf(anzahlText.getText());

                double gpreis = epreis / anzahl;
                if (aktion = true) {
                gesamtText.setText(String.valueOf(gpreis));
            }}
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
