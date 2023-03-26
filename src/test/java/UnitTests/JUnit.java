package UnitTests;
import org.junit.jupiter.api.Test;
import src.DataModels.Polinom;
import src.Logical.Operatii;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit{
    @Test
    public void addTestCorrect(){
        Polinom p1=new Polinom();
        p1.getPoly().put(5,4.0);
        p1.getPoly().put(4,-3.0);
        p1.getPoly().put(2,1.0);
        p1.getPoly().put(1,-8.0);
        p1.getPoly().put(0,1.0);

        Polinom p2=new Polinom();
        p2.getPoly().put(4,3.0);
        p2.getPoly().put(3,-1.0);
        p2.getPoly().put(2,1.0);
        p2.getPoly().put(1,2.0);
        p2.getPoly().put(0,-1.0);

        Operatii o=new Operatii();
        Polinom exp=o.adunare(p1,p2);
        String rez="-6.0*x^1 2.0*x^2 -1.0*x^3 4.0*x^5";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void addTestFail(){
        Polinom p1=new Polinom();
        p1.getPoly().put(5,4.0);
        p1.getPoly().put(4,-3.0);
        p1.getPoly().put(2,1.0);
        p1.getPoly().put(1,-8.0);
        p1.getPoly().put(0,1.0);

        Polinom p2=new Polinom();
        p2.getPoly().put(4,3.0);
        p2.getPoly().put(3,-1.0);
        p2.getPoly().put(2,1.0);
        p2.getPoly().put(1,2.0);
        p2.getPoly().put(0,-1.0);

        Operatii o=new Operatii();
        Polinom exp=o.adunare(p1,p2);
        String rez="-8.0*x^1 3.0*x^2 -1.0*x^3 4.0*x^6";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void subTestCorrect(){
        Polinom p1=new Polinom();
        p1.getPoly().put(5,4.0);
        p1.getPoly().put(4,-3.0);
        p1.getPoly().put(2,1.0);
        p1.getPoly().put(1,-8.0);
        p1.getPoly().put(0,1.0);

        Polinom p2=new Polinom();
        p2.getPoly().put(4,3.0);
        p2.getPoly().put(3,-1.0);
        p2.getPoly().put(2,1.0);
        p2.getPoly().put(1,2.0);
        p2.getPoly().put(0,-1.0);

        Operatii o=new Operatii();
        Polinom exp=o.scadere(p1,p2);
        String rez="2.0*x^0 -10.0*x^1 1.0*x^3 -6.0*x^4 4.0*x^5";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void subTestFail(){
        Polinom p1=new Polinom();
        p1.getPoly().put(5,4.0);
        p1.getPoly().put(4,-3.0);
        p1.getPoly().put(2,1.0);
        p1.getPoly().put(1,-8.0);
        p1.getPoly().put(0,1.0);

        Polinom p2=new Polinom();
        p2.getPoly().put(4,3.0);
        p2.getPoly().put(3,-1.0);
        p2.getPoly().put(2,1.0);
        p2.getPoly().put(1,2.0);
        p2.getPoly().put(0,-1.0);

        Operatii o=new Operatii();
        Polinom exp=o.adunare(p1,p2);
        String rez="-2.0*x^0 -10.0*x^3 8.0*x^3 -6.0*x^4 45.0*x^5";
        assertEquals(rez,exp.afisare());
    }

    @Test
    public void mulTestCorrect(){
        Polinom p1=new Polinom();
        p1.getPoly().put(2,3.0);
        p1.getPoly().put(1,-1.0);
        p1.getPoly().put(0,1.0);


        Polinom p2=new Polinom();
        p2.getPoly().put(1,1.0);
        p2.getPoly().put(0,-2.0);

        Operatii o=new Operatii();
        Polinom exp=o.inmultire(p1,p2);
        String rez="-2.0*x^0 3.0*x^1 -7.0*x^2 3.0*x^3";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void mulTestFail(){
        Polinom p1=new Polinom();
        p1.getPoly().put(2,3.0);
        p1.getPoly().put(1,-1.0);
        p1.getPoly().put(0,1.0);


        Polinom p2=new Polinom();
        p2.getPoly().put(1,1.0);
        p2.getPoly().put(0,-2.0);

        Operatii o=new Operatii();
        Polinom exp=o.inmultire(p1,p2);
        String rez="-4.0*x^0 6.0*x^1 -7.0*x^2 3.0*x^2";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void divideTestCorrect(){
        Polinom p1=new Polinom();
        p1.getPoly().put(3,1.0);
        p1.getPoly().put(2,-2.0);
        p1.getPoly().put(1,6.0);
        p1.getPoly().put(0,-5.0);

        Polinom p2=new Polinom();
        p2.getPoly().put(2,1.0);
        p2.getPoly().put(0,-1.0);

        Operatii o=new Operatii();
        Polinom exp=o.impartire(p1,p2);
        String rez="-2.0*x^0 1.0*x^1";
        String rest="-7.0*x^0 7.0*x^1";
        assertEquals(rez,exp.afisare());
        assertEquals(rest,Operatii.rest.afisare());
    }
    @Test
    public void divideTestFail(){
        Polinom p1=new Polinom();
        p1.getPoly().put(3,1.0);
        p1.getPoly().put(2,-2.0);
        p1.getPoly().put(1,6.0);
        p1.getPoly().put(0,-5.0);

        Polinom p2=new Polinom();
        p2.getPoly().put(2,1.0);
        p2.getPoly().put(0,-1.0);

        Operatii o=new Operatii();
        Polinom exp=o.impartire(p1,p2);
        String rez="-2.0*x^0 1.0*x^1";
        String rest="-7.0*x^0 3.0*x^1";
        assertEquals(rez,exp.afisare());
        assertEquals(rest,Operatii.rest.afisare());
    }
    @Test
    public void derivateTestCorrect(){
        Polinom p1=new Polinom();
        p1.getPoly().put(3,1.0);
        p1.getPoly().put(2,-2.0);
        p1.getPoly().put(1,6.0);
        p1.getPoly().put(0,-5.0);

        Operatii o=new Operatii();
        Polinom exp=o.derivare(p1);
        String rez="6.0*x^0 -4.0*x^1 3.0*x^2";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void derivateTestFail(){
        Polinom p1=new Polinom();
        p1.getPoly().put(3,1.0);
        p1.getPoly().put(2,-2.0);
        p1.getPoly().put(1,6.0);
        p1.getPoly().put(0,-5.0);

        Operatii o=new Operatii();
        Polinom exp=o.derivare(p1);
        String rez="6.0*x^1 -4.0*x^2 3.0*x^3";
        assertEquals(rez,exp.afisare());
    }
    @Test
    public void integrateTestCorrect(){
        Polinom p1=new Polinom();
        p1.getPoly().put(3,1.0);
        p1.getPoly().put(2,4.0);
        p1.getPoly().put(0,5.0);

        Operatii o=new Operatii();
        Polinom exp=o.integrare(p1);
        String rez="5.0*x^1 1.33*x^3 0.25*x^4 +C";
        assertEquals(rez,exp.afisare()+" +C");
    }
    @Test
    public void integrateTestFail(){
        Polinom p1=new Polinom();
        p1.getPoly().put(3,1.0);
        p1.getPoly().put(2,4.0);
        p1.getPoly().put(0,5.0);

        Operatii o=new Operatii();
        Polinom exp=o.integrare(p1);
        String rez="5.0*x^1 1.33*x^3 0.25*x^4";
        assertEquals(rez,exp.afisare()+" +C");
    }

}
