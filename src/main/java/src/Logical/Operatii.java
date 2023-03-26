package src.Logical;

import src.DataModels.Polinom;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operatii {
    public static Polinom rest;

    public Polinom adunare(Polinom p1, Polinom p2) {
        Polinom rez = new Polinom();
        for (int p : p1.getPoly().keySet()) {
            double c = p1.getPoly().get(p);
            rez.getPoly().put(p, c);
        }
        for (int p : p2.getPoly().keySet()) {
            double c = p2.getPoly().get(p);
            if (rez.getPoly().containsKey(p)) {
                c += rez.getPoly().get(p);
            }
                rez.getPoly().put(p, c);
        }
        return rez;
    }

    public Polinom scadere(Polinom p1, Polinom p2) {
        Polinom rez = new Polinom();
        for (int p : p1.getPoly().keySet()) {
            double c = p1.getPoly().get(p);
            rez.getPoly().put(p, c);
        }
        for (int p : p2.getPoly().keySet()) {
            double c = p2.getPoly().get(p);
            if (rez.getPoly().containsKey(p)) {
                double c1=rez.getPoly().get(p)-c;
               rez.getPoly().put(p,c1);
            } else {
                rez.getPoly().put(p, -c);
            }
        }
        return rez;
    }

    public Polinom inmultire(Polinom p1, Polinom p2) {
        Polinom rez = new Polinom();

        for (Map.Entry<Integer, Double> i : p1.getPoly().entrySet()) {
            int putere = i.getKey();
            double coef = i.getValue();
            for (Map.Entry<Integer, Double> j : p2.getPoly().entrySet()) {
                int putere1 = j.getKey();
                double coef2 = j.getValue();
                int p3 = putere + putere1;
                double c = coef * coef2;
                if (rez.getPoly().containsKey(p3)) {
                    c += rez.getPoly().get(p3);
                }
                rez.getPoly().put(p3, c);
            }
        }
        return rez;
    }

    public Polinom derivare(Polinom p1) {
        Polinom rez = new Polinom();

        for (Map.Entry<Integer, Double> i : p1.getPoly().entrySet()) {
            if (!i.getKey().equals(0)) {
                int p = i.getKey();
                double c = i.getValue() * p;
                p--;
                rez.getPoly().put(p, c);
            }else
            rez.getPoly().put(0,0.0);
        }

        return rez;
    }

    public Polinom integrare(Polinom p1)
    {
        Polinom rez=new Polinom();

        for (Map.Entry<Integer, Double> i : p1.getPoly().entrySet())
        {
            int p=i.getKey();
            p++;
            double c=i.getValue();
            c=c/p;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String s = decimalFormat.format(c);
            double c1 = Double.parseDouble(s);
            rez.getPoly().put(p,c1);
        }

        return rez;
    }
    public Polinom impartire(Polinom p1,Polinom p2)
    {
        Polinom rez=new Polinom();
        int deimpartit = Collections.max(p1.getPoly().keySet());
        int impartitor = Collections.max(p2.getPoly().keySet());

        while(deimpartit>=impartitor)
        {
            double term1D = p1.getPoly().getOrDefault(deimpartit, 0.0);
            double term1I = p2.getPoly().getOrDefault(impartitor, 0.0);
            double term1R = term1D / term1I;
            rez.getPoly().put(deimpartit - impartitor, term1R);
            for (int i = 0; i <= deimpartit; i++) {
                double term2D = p1.getPoly().getOrDefault(deimpartit - impartitor + i, 0.0);
                double term2I = p2.getPoly().getOrDefault(i,0.0);
                double newTerm = term2D - term1R * term2I;
                if (newTerm != 0.0) {
                    p1.getPoly().put(deimpartit - impartitor + i, newTerm);
                } else {
                    p1.getPoly().remove(deimpartit - impartitor + i);
                }
            }
            if(p1.getPoly().isEmpty())
                deimpartit=0;
            else
            deimpartit = Collections.max(p1.getPoly().keySet());
        }
        rest=p1;
        return rez;
    }

    public Polinom matching(String s)
    {
        Polinom p=new Polinom();
        String regex = "(-?\\d+(?:\\.\\d+)?)\\*x\\^(\\d+)";
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            double coefficient = Double.parseDouble(mt.group(1));
            int power = Integer.parseInt(mt.group(2));
            p.getPoly().put(power, coefficient);
        }
        return p;

    }




}
