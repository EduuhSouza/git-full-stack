package salas;

public class SalaComandoBasicos extends Sala {

    public SalaComandoBasicos() {
        super("Comandos Básicos do Git", "Nesta sala, você será introduzido aos comandos essenciais do Git, como git init, git clone e git add. É o primeiro passo para começar a versionar seus projetos de forma eficiente.");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("___________________");
        System.out.println("Sala: " + getNome());
        System.out.println("Descrição: " + getDescricao());

        String codigo = """
                ____________________________________________________
                
                1. git init
                
                Descrição: Cria um repositório Git vazio no diretório atual.
                Quando usar: Ao começar um novo projeto local e querer versionar os arquivos com Git.
               
                Exemplo:
                  git init
                  
                ____________________________________________________
                  2. git clone (url)
                
                  Descrição: Cria uma cópia local de um repositório remoto.
                  Quando usar: Ao colaborar em um projeto existente hospedado em plataformas como GitHub.
                  
                  Exemplo:
                    git clone https://github.com/usuario/repositorio.git
                   
                ____________________________________________________
                  3. git remote add origin (url)
                
                  Descrição: Conecta seu repositório local a um repositório remoto.
                  Quando usar: Após criar um repositório com git init, use esse comando para configurar onde os arquivos serão enviados (git push).
                  
                  Exemplo:
                    git remote add origin https://github.com/usuario/repositorio.git
                """;

        System.out.println(codigo);
    }
}
