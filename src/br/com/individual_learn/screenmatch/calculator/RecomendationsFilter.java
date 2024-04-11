package br.com.individual_learn.screenmatch.calculator;

public class RecomendationsFilter {

    public void filter(Classification classify) {
        if (classify.getClassification() >= 4) {
            System.out.println("queridinho do momento");
        } else if (classify.getClassification() >=2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Assista depois");
        }
    }
}
