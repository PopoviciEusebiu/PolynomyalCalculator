package src.GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View {
    private JFrame frame;
    private JTextField poly1;
    private JTextField poly2;

    private JButton add;
    private JButton sub;
    private JButton multiply;
    private JButton divide;
    private JButton derivate;
    private JButton integrate;
    private JButton clear;

    private JTextArea rez = new JTextArea();
    private JLabel titlu;
    private JLabel exemplu;

    View() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 415);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        poly1 = new JTextField();
        poly1.setBounds(60, 62, 280, 29);
        poly1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        frame.getContentPane().add(poly1);


        poly2 = new JTextField();
        poly2.setBounds(60, 114, 280, 29);
        poly2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        frame.getContentPane().add(poly2);


        rez.setBounds(60, 316, 280, 45);
        rez.setFont(new Font("Tahoma", Font.PLAIN, 16));
        frame.getContentPane().add(rez);



         add = new JButton("Add");
        add.setBounds(75, 166, 110, 23);
        frame.getContentPane().add(add);

        sub = new JButton("Sub");
        sub.setBounds(215, 166, 110, 23);
        frame.getContentPane().add(sub);

        multiply = new JButton("Multiply");
        multiply.setBounds(75, 200, 110, 23);
        frame.getContentPane().add(multiply);

        divide = new JButton("Divide");
        divide.setBounds(215, 200, 110, 23);
        frame.getContentPane().add(divide);

         derivate = new JButton("Derivate");
        derivate.setBounds(75, 236, 110, 23);
        frame.getContentPane().add(derivate);

        integrate = new JButton("Integrate");
        integrate.setBounds(215, 236, 110, 23);
        frame.getContentPane().add(integrate);

        clear = new JButton("Clear");
        clear.setBounds(140, 281, 110, 23);
        frame.getContentPane().add(clear);

         titlu = new JLabel("Polynomial Calculator");
        titlu.setFont(new Font("Tahoma", Font.BOLD, 16));
        titlu.setBounds(112, 11, 182, 14);
        frame.getContentPane().add(titlu);

         exemplu = new JLabel("Exemplu: 3*x^2-1*x^1+5*x^0");
        exemplu.setFont(new Font("Tahoma", Font.PLAIN, 15));
        exemplu.setBounds(96, 35, 300, 14);
        frame.getContentPane().add(exemplu);
        frame.setVisible(true);
    }

    public void addAction(ActionListener add){
        this.add.addActionListener(add);
    }
    public void subAction(ActionListener sub){
        this.sub.addActionListener(sub);
    }
    public void mulAction(ActionListener multiply){
        this.multiply.addActionListener(multiply);
    }
    public void divAction(ActionListener divide){
        this.divide.addActionListener(divide);
    }
    public void derivAction(ActionListener derivate){
        this.derivate.addActionListener(derivate);
    }
    public void integrAction(ActionListener integrate){
        this.integrate.addActionListener(integrate);
    }
    public void clearAction(ActionListener clear){
        this.clear.addActionListener(clear);
    }

    public JTextField getPoly1() {
        return poly1;
    }

    public JTextField getPoly2() {
        return poly2;
    }

    public JTextArea getRez() {
        return rez;
    }

    public void setResultText(String tbs){
        this.rez.setText(tbs);
    }
    public void setPoly1(String s)
    {
        this.poly1.setText(s);
    }
    public void setPoly2(String s)
    {
        this.poly2.setText(s);
    }
}
