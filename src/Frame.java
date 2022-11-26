
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Frame {
    private String currentCurrency = "USD";
    private double SGD = 41.36, KWD = 184.38, AUD = 38.30, BND = 41.34, NZD = 35.44, USD = 56.73;
    private JFrame frame;
    private JTextField txtField1, txtField2;
    private JButton convertBtn, nzdBtn, phpBtn, usdBtn, audBtn, sgdBtn, bndBtn;

    public Frame() {

        DecimalFormat f = new DecimalFormat("##.##");
        frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtField1 = new JTextField("");
        txtField1.setBounds(10, 30, 100, 30);

        txtField2 = new JTextField("");
        txtField2.setBounds(290, 30, 100, 30);

        convertBtn = new JButton("Convert");
        convertBtn.setBounds(150, 30, 100, 30);

        convertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(currentCurrency);

                if(currentCurrency == "USD"){
                    double temp = Double.parseDouble(txtField1.getText()) * USD;
                    txtField2.setText(f.format(temp));
                } else if (currentCurrency == "SGD") {
                    double temp = Double.parseDouble(txtField1.getText()) * SGD;
                    txtField2.setText(f.format(temp));
                }else if (currentCurrency == "KWD") {
                    double temp = Double.parseDouble(txtField1.getText()) * KWD;
                    txtField2.setText(f.format(temp));
                }else if (currentCurrency == "AUD") {
                    double temp = Double.parseDouble(txtField1.getText()) * AUD;
                    txtField2.setText(f.format(temp));
                }else if (currentCurrency == "BND") {
                    double temp = Double.parseDouble(txtField1.getText()) * BND;
                    txtField2.setText(f.format(temp));
                }else if (currentCurrency == "NZD") {
                    double temp = Double.parseDouble(txtField1.getText()) * NZD;
                    txtField2.setText(f.format(temp));
                }
            }
        });

        nzdBtn = new JButton("NZD");
        nzdBtn.setBounds(10, 100, 65, 20);

        nzdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCurrency("NZD");
            }
        });

        usdBtn = new JButton("USD");
        usdBtn.setBounds(90, 100, 65, 20);

        usdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCurrency("USD");
            }
        });

        audBtn = new JButton("AUD");
        audBtn.setBounds(170, 100, 65, 20);

        audBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCurrency("AUD");
            }
        });

        sgdBtn = new JButton("SGD");
        sgdBtn.setBounds(250, 100, 65, 20);

        sgdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCurrency("SGD");
            }
        });

        phpBtn = new JButton("PHP");
        phpBtn.setBounds(325, 100, 65, 20);

        phpBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCurrency("PHP");
            }
        });

        bndBtn = new JButton("BND");
        bndBtn.setBounds(10, 130, 65, 20);

        bndBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCurrency("BND");
            }
        });

        frame.add(txtField1);
        frame.add(txtField2);
        frame.add(convertBtn);
        frame.add(nzdBtn);
        frame.add(phpBtn);
        frame.add(usdBtn);
        frame.add(audBtn);
        frame.add(sgdBtn);
        frame.add(bndBtn);

        frame.setSize(420, 230);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void addCurrency(String currency) {
        currentCurrency = currency;
    }

}