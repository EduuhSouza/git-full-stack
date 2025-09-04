import salas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SALAS
        SalaHistoriaCriacao sala1 = new SalaHistoriaCriacao();
        SalaEvolucao sala2 = new SalaEvolucao();
        SalaComandoBasicos sala3 = new SalaComandoBasicos();
        SalaTrabalhandoCommits sala4 = new SalaTrabalhandoCommits();
        SalaCuriosidades sala5 = new SalaCuriosidades();

//        VISITANTE
        Visitante visitante = new Visitante();


        System.out.println("Seja bem-vindo ao Hub de Informações do Git");

//        OPÇOES
        int opcao;

        do {
            System.out.println("___________ Hub de informações sobre Git ___________");
            System.out.println("1 - " + sala1.getNome());
            System.out.println("2 - " + sala2.getNome());
            System.out.println("3 - " + sala3.getNome());
            System.out.println("4 - " + sala4.getNome());
            System.out.println("4 - " + sala5.getNome());
            System.out.println("0 - Sair");

            System.out.println("Escolha uma sala para saber mais: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> visitante.explorarSala(sala1);
                case 2 -> visitante.explorarSala(sala2);
                case 3 -> visitante.explorarSala(sala3);
                case 4 -> visitante.explorarSala(sala4);
                case 5 -> visitante.explorarSala(sala5);
                case 0 -> System.out.println("Obrigado por explorar o Hub de informações sobre Git");
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);




    }
}