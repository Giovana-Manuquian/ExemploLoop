package br.senai.jandira;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String [] carros = {"x1", "fusca", "ferrari", "uno"};

        System.out.println("---------------------------------");
        System.out.println("******* Seja Bem Vindo(a) *******");
        System.out.println("---------------------------------");

        for (int i = 0; i< carros.length; i++){
            System.out.println("Carro " + (i+1) + ": " + carros[i]);
        }

        System.out.print("Escolha seu carro: ");
        String opcaoUsuario = teclado.nextLine();

        boolean validaCar = false;

        for (int i = 0; i<carros.length; i++){

            if (opcaoUsuario.equalsIgnoreCase(carros[i])) {
                System.out.println("Essa opção está disponivel");
                validaCar = true;
            }
        }

        if (!validaCar){
            System.out.println("Infelizmente este veiculo não está disponivel");
        }





        for (int i = 10; i > 0; i--){
            System.out.println("java");
        }

        //Exemplo Loop doWhile
        boolean testeDo = false;

        do {
            System.out.println("java senai");
        } while (testeDo);

        // Exemplo While
        boolean testeWhile = true;

        while (testeWhile){
            System.out.println("Java");
            testeWhile = false;
        }

        // Exemplo For
        for (int i= 0; i<10; i++){
            System.out.println("Java");
        }

    }

}
