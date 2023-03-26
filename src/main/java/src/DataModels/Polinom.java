package src.DataModels;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Polinom{

    private HashMap<Integer, Double> poly;

    public Polinom()
    {
        poly=new HashMap<Integer, Double>();
    }

    public void adaugaPolinom(Monom m)
    {
        poly.put(m.getPutere(),m.getCoeficient());
    }

    public HashMap<Integer, Double> getPoly() {
        return poly;
    }

    public void setPoly(HashMap<Integer, Double> poly) {
        this.poly = poly;
    }

    public String afisare() {
        String s = "";
        Iterator<Map.Entry<Integer, Double>> i = this.getPoly().entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, Double> j = i.next();
            if (i.hasNext()) {
                if (j.getValue() >= 0 && j.getValue()!=0.0) {
                    s += j.getValue() + "*x^" + j.getKey() + " ";
                } else if(j.getValue()!=0.0){
                    s += j.getValue() + "*x^" + j.getKey() + " ";
                }
            }
            else if(j.getValue()!=0.0)
                s += j.getValue() + "*x^" + j.getKey();
            else
                s+="0";
        }
        return s;
    }


}

