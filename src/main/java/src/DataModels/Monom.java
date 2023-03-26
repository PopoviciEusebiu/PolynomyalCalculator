package src.DataModels;

public class Monom {
    private int putere;
    private double coeficient;


    public Monom(int putere,double coeficient)
    {
        this.coeficient=coeficient;
        this.putere=putere;
    }

    public double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }
}
