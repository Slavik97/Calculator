package com.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    public static int i = 0, j = 0;
    JFrame frame = new JFrame("Calculator");

    JButton [][] chisla = new JButton[4][4];
    JTextField tf = new JTextField();
    String [][] numbers = {{"%", "√", "²","1/x"},
            {"7", "8", "9"},
            {"4", "5", "6"},
            {"1", "2", "3"}};


    public void design(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        for (i = 0; i < chisla.length; i++) {
            for (j = 0; j < chisla.length; j++) {
                chisla[i][j] = new JButton();
                chisla[i][j].setBounds(25 + i * 80, 160 + j * 80, 50, 50);
                frame.add(chisla[i][j]);


                }
        }



        frame.add(tf);
        tf.setBounds(0,0, 500,100);
        chisla[0][0].setText("" + numbers[0][0]);
        chisla[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procent(665,65);
                tf.setText(chisla[0][0].getText());
            }
        });
        chisla[1][0].setText("" + numbers[0][1]);
        chisla[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                koren(658);
                tf.setText(chisla[1][0].getText() + "()");
            }
        });
        chisla[2][0].setText("" + numbers[0][2]);
        chisla[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(chisla[2][0].getText()+ "");
            }
        });

        chisla[3][0].setSize(65,50);
        chisla[3][0].setText("" + numbers[0][3]);
        chisla[3][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(chisla[3][0].getText());
            }
        });

        chisla[0][1].setText("" + numbers[1][0]);
        chisla[1][1].setText("" + numbers[1][1]);
        chisla[2][1].setText("" + numbers[1][2]);
//        chisla[3][1].setText("" + numbers[1][3]);

        chisla[0][2].setText("" + numbers[2][0]);
        chisla[1][2].setText("" + numbers[2][1]);
        chisla[2][2].setText("" + numbers[2][2]);

        chisla[0][3].setText("" + numbers[3][0]);
        chisla[1][3].setText("" + numbers[3][1]);
        chisla[2][3].setText("" + numbers[3][2]);
    }

    public void procent(float a, float b){
        float formmela = b*a/100;
        System.out.println(formmela);
    }
    public void koren(float a){
        double result = Math.sqrt(a);
        System.out.println(result);
    }

    public void init(){
        design();
        frame.setVisible(true);
    }
}
