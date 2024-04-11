package br.ufrn.imd;

public class Gerente extends Funcionario {

    protected enum Nivel{
        JUNIOR, PLENO, SERIOR;

        private double bonus;

        private Nivel(double bonus){
        this.bonus = bonus;
        }

    }
    Gerente(int chMensal, double hh, Nivel nivel){
     super(chMensal,
             hh);


    }
}
