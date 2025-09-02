package salas;

public class SalaTrabalhandoCommits extends Sala{

    public SalaTrabalhandoCommits() {
        super("Trabalhando com Commits", "Nesta sala, você aprenderá a registrar mudanças no repositório usando commits. Serão abordados conceitos como mensagens significativas, boas práticas e como acompanhar o histórico do projeto com clareza e organização.");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("___________________");
        System.out.println("Sala: " + getNome());
        System.out.println("Descrição: " + getDescricao());

        String codigo = """
                ____________________________________________________
                
                1. git add (arquivo ou pasta)
                
                Descrição: Adiciona arquivos modificados para serem incluídos no próximo commit (staging area).
               
                Exemplo:
                  git add index.html
                  git add . 
                  
                  Observação: O . (ponto) adiciona tudo
                 
                ____________________________________________________
                
                2. git commit -m "mensagem"
                
                Descrição: Registra as mudanças no repositório com uma mensagem explicativa.
                
                Exemplo:
                  git commit -m "Adiciona a estrutura HTML da página inicial"
                
                ____________________________________________________
                
                3. git commit --amend
                
                Descrição: Edita o último commit (mensagem ou arquivos).
                Quando usar: Quando você esqueceu de adicionar um arquivo ou quer mudar a mensagem do último commit.
                
                Exemplo:
                  git commit --amend
                  
                """;
    }
}
