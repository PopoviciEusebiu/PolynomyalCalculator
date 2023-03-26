package src.GUI;
import src.DataModels.Polinom;
import src.Logical.Operatii;

import javax.swing.*;
import java.util.Collections;

public class Model {
    private Polinom result;



    public void add(String poly1, String poly2){
        String reg="^([+-]?\\d*(\\.\\d+)?\\*x\\^\\d+)*$";
        if((poly1.matches(reg) && poly2.matches(reg)) && (!poly1.equals("") || !poly2.equals(""))) {
            String s = poly1;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
            String s1 = poly2;
            Polinom p1 = o.matching(s1);
            result  = o.adunare(p, p1);

        }
        else {
            JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");
        }

    }
    public void sub(String poly1,String poly2)
    {
        String reg="^([+-]?\\d*(\\.\\d+)?\\*x\\^\\d+)*$";
        if((poly1.matches(reg) && poly2.matches(reg)) && (!poly1.equals("") || !poly2.equals(""))) {
            String s = poly1;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
            String s1 = poly2;
            Polinom p1 = o.matching(s1);
            result  = o.scadere(p, p1);

        }
        else {
            JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");
        }
    }
    public void mul(String poly1,String poly2)
    {
        String reg="^([+-]?\\d*(\\.\\d+)?\\*x\\^\\d+)*$";
        if((poly1.matches(reg) && poly2.matches(reg)) && (!poly1.equals("") || !poly2.equals(""))) {
            String s = poly1;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
            String s1 = poly2;
            Polinom p1 = o.matching(s1);
            result  = o.inmultire(p, p1);

        }
        else {
            JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");
        }
    }
    public void div(String poly1,String poly2)
    {
        String reg="^([+-]?\\d*(\\.\\d+)?\\*x\\^\\d+)*$";
        if((poly1.matches(reg) && poly2.matches(reg)) && (!poly1.equals("") || !poly2.equals(""))) {
            String s = poly1;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
            String s1 = poly2;
            Polinom p1 = o.matching(s1);
            int power1= Collections.max(p.getPoly().keySet());
            int power2=Collections.max(p1.getPoly().keySet());
            if(power1>power2)
            {
                result = o.impartire(p, p1);
            }
            else {
                result=o.impartire(p1,p);
            }

        }
        else {
            JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");
        }
    }
    public void deriv(String poly1,String poly2)
    {
        String reg="^([+-]?\\d*(\\.\\d+)?\\*x\\^\\d+)*$";
        if((!poly1.equals("") && poly2.equals("")) && poly1.matches(reg)) {
            String s = poly1;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
             result = o.derivare(p);

        }
        else if(poly1.equals("") && !poly2.equals("") && poly2.matches(reg) )
        {
            String s = poly2;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
             result = o.derivare(p);

        }
        else if(poly1.equals("") || poly2.equals(""))
        { JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");

        }
        else {
            JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");

        }
    }
    public void integr(String poly1,String poly2)
    {
        String reg="^([+-]?\\d*(\\.\\d+)?\\*x\\^\\d+)*$";
        if((!poly1.equals("") && poly2.equals("")) && poly1.matches(reg)) {
            String s = poly1;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
            result = o.integrare(p);

        }
        else if(poly1.equals("") && !poly2.equals("") && poly2.matches(reg) )
        {
            String s = poly2;
            Operatii o = new Operatii();
            Polinom p = o.matching(s);
            result = o.integrare(p);

        }
        else if(poly1.equals("") || poly2.equals(""))
        { JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");

        }
        else {
            JOptionPane.showMessageDialog(new JButton("OK!"), "Expresia nu este valida");

        }
    }
    public Polinom getResult() {
        return result;
    }
}
