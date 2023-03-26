package src.GUI;

import src.Logical.Operatii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    public View view;
    public Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.addAction(new addActiune());
        view.subAction(new subActiune());
        view.mulAction(new mulActiune());
        view.divAction(new divActiune());
        view.derivAction(new derivActiune());
        view.integrAction(new integrActiune());
        view.clearAction(new clearActiune());
    }

    public class addActiune implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.add(view.getPoly1().getText(), view.getPoly2().getText());
            if (model.getResult() != null) {
                view.setResultText(model.getResult().afisare());

            }
            else {
                view.setPoly1("");
                view.setPoly2("");
            }
        }
    }

        public class subActiune implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.sub(view.getPoly1().getText(), view.getPoly2().getText());
                if(model.getResult()!=null){
                view.setResultText(model.getResult().afisare());
            }
                else
                {
                    view.setPoly1("");
                    view.setPoly2("");
                }
            }
        }

        public class mulActiune implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.mul(view.getPoly1().getText(), view.getPoly2().getText());
                if(model.getResult()!=null) {
                    view.setResultText(model.getResult().afisare());
                }
                else {
                    view.setPoly1("");
                    view.setPoly2("");
                }
            }
        }

        public class divActiune implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.div(view.getPoly1().getText(), view.getPoly2().getText());
                if (model.getResult() != null) {
                    view.setResultText("Q: " + model.getResult().afisare() + System.lineSeparator() + "R: " + Operatii.rest.afisare());
                }
                else
                {
                    view.setPoly1("");
                    view.setPoly2("");
                }
            }
        }

            public class derivActiune implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.deriv(view.getPoly1().getText(), view.getPoly2().getText());
                    if (model.getResult() != null) {
                        view.setResultText(model.getResult().afisare());
                    }
                    else
                    {
                        view.setPoly1("");
                        view.setPoly2("");
                    }
                }
            }

            public class integrActiune implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.integr(view.getPoly1().getText(), view.getPoly2().getText());
                    if (model.getResult() != null) {
                        view.setResultText(model.getResult().afisare() + "+C");
                    }
                    else
                    {
                        view.setPoly1("");
                        view.setPoly2("");
                    }
                }
            }

            public class clearActiune implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent e) {
                    view.setResultText("");
                    view.setPoly1("");
                    view.setPoly2("");
                }
            }
        }


