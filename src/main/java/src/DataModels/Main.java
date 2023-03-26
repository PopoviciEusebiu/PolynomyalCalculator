package src.DataModels;

import src.DataModels.Monom;
import src.DataModels.Polinom;
import src.Logical.Operatii;

public class Main {
    public static void main(String[] args) {

        Polinom p1=new Polinom();
        Monom m1=new Monom(5,4);
        Monom m2=new Monom(4,-3);
        Monom m3=new Monom(2,1);
        Monom m4=new Monom(1,-8);
        Monom m5=new Monom(0,1);
        p1.adaugaPolinom(m1);
        p1.adaugaPolinom(m2);
        p1.adaugaPolinom(m3);
        p1.adaugaPolinom(m4);
        p1.adaugaPolinom(m5);

        Polinom p2=new Polinom();
        Monom m6=new Monom(4,3);
        Monom m7=new Monom(3,-1);
        Monom m8=new Monom(2,1);
        Monom m9=new Monom(1,2);
        Monom m10=new Monom(0,-1);
        p2.adaugaPolinom(m6);
        p2.adaugaPolinom(m7);
        p2.adaugaPolinom(m8);
        p2.adaugaPolinom(m9);
        p2.adaugaPolinom(m10);

        Polinom p3=new Polinom();
        Monom n=new Monom(2,3);
        Monom n1=new Monom(1,-1);
        Monom n2=new Monom(0,1);
        p3.adaugaPolinom(n);
        p3.adaugaPolinom(n1);
        p3.adaugaPolinom(n2);

        Polinom p4=new Polinom();
        Monom n3=new Monom(1,1);
        Monom n4=new Monom(0,-2);
        p4.adaugaPolinom(n3);
        p4.adaugaPolinom(n4);


        Polinom p6=new Polinom();
        Monom n5=new Monom(3,1);
        Monom n6=new Monom(2,-2);
        Monom n7=new Monom(1,6);
        Monom n8=new Monom(0,-5);

        p6.adaugaPolinom(n5);
        p6.adaugaPolinom(n6);
        p6.adaugaPolinom(n7);
        p6.adaugaPolinom(n8);

        Polinom p7=new Polinom();
        Monom q=new Monom(3,1);
        Monom q1=new Monom(2,4);
        Monom q2=new Monom(0,5);
        p7.adaugaPolinom(q);
        p7.adaugaPolinom(q1);
        p7.adaugaPolinom(q2);


        Operatii o1=new Operatii();
        Polinom p5;

        //Adunare/Scadere
        //System.out.println(p1.afisare(p1));
        //System.out.println(p2.afisare(p2));
        //p5=o1.adunare(p1,p2);
        //p5=o1.scadere(p1,p2);

        //Inmultire
        //System.out.println(p3.afisare(p3));
        //System.out.println(p4.afisare(p4));
        //p5=o1.inmultire(p3,p4);

        //Derivare
       //System.out.println(p6.afisare(p6));
        //p5=o1.derivare(p6);


        //Integrare
        System.out.println(p7.afisare());
        p5=o1.integrare(p7);

        System.out.println(p5.afisare()+" +C");

        Polinom p8=new Polinom();
        Monom x=new Monom(3,1);
        Monom x1=new Monom(2,-2);
        Monom x2=new Monom(1,6);
        Monom x3=new Monom(0,-5);
        p8.adaugaPolinom(x);
        p8.adaugaPolinom(x1);
        p8.adaugaPolinom(x2);
        p8.adaugaPolinom(x3);


        Polinom p9=new Polinom();
        Monom x4=new Monom(2,1);
        Monom x5=new Monom(0,-1);
        p9.adaugaPolinom(x4);
        p9.adaugaPolinom(x5);
        p5=o1.impartire(p8,p9);
        System.out.println(p5.afisare());
    }
}