import salas.SalaComandoBasicos;
import salas.SalaTrabalhandoCommits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SALAS
        SalaComandoBasicos sala1 = new SalaComandoBasicos();
        SalaTrabalhandoCommits sala2 = new SalaTrabalhandoCommits();


//        VISITANTE
        Visitante visitante = new Visitante();


        System.out.println("Seja bem-vindo ao Hub de Informações do Git");

//        OPÇOES
        int opcao;

        do {
            System.out.println("___________ Hub de informações sobre Git ___________");
            System.out.println("1 - " + sala1.getNome());
            System.out.println("2 - " + sala2.getNome());
//            System.out.println("3 - " + sala1.getNome());
//            System.out.println("4 - " + sala1.getNome());
            System.out.println("0 - Sair");

            System.out.println("Escolha uma sala para saber mais: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> visitante.explorarSala(sala1);
                case 2 -> visitante.explorarSala(sala2);
                case 0 -> System.out.println("Obrigado por explorar a sala");
                default -> System.out.println("Opção inválida");

            }

        } while (opcao != 0);




    }
}