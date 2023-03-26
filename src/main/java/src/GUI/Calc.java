package src.GUI;

public class Calc {
    public static void main(String[] args) {
        View viz = new View();
        Model model1 = new Model();
        new Controller(viz, model1);
    }
}
