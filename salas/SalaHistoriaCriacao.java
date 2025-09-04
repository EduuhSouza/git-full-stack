package salas;

public class SalaHistoriaCriacao extends Sala{

    public SalaHistoriaCriacao() {
        super("História e Criação do Git", "Nesta sala veremos mais sobre a história e a criação do Git");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("___________________");
        System.out.println("Sala: " + getNome());
        System.out.println("Descrição: " + getDescricao());

        String codigo = """
                O Git é um sistema de controle de versão distribuído criado por Linus Torvalds em 2005, o mesmo criador do Linux.
                Ele foi desenvolvido inicialmente para gerenciar o código-fonte do kernel do Linux, após a comunidade do projeto deixar de usar o sistema proprietário BitKeeper por questões de licenciamento.
                
                Linus queria um sistema que fosse:
                
                - Rápido
                
                - Seguro contra corrupções de dados
                
                - Distribuído, ou seja, cada desenvolvedor teria uma cópia completa do repositório
                
                - Capaz de lidar com projetos grandes
                
                Em apenas algumas semanas, o Git estava funcionando com as principais funcionalidades básicas. 
                Logo em seguida, outros desenvolvedores (como Junio Hamano, atual mantenedor do projeto) começaram a contribuir e melhorar a ferramenta.
            
                Hoje, o Git é o sistema de controle de versão mais usado no mundo, sendo a base de plataformas como o GitHub, GitLab e Bitbucket.
                """;

        System.out.println(codigo);

    }
}
