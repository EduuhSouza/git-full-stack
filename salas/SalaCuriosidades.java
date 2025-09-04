package salas;

public class SalaCuriosidades extends Sala{
    public SalaCuriosidades() {
        super("Curiosidades", "Nesta sala você verá algumas curiosidades sobre o Git.");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("___________________");
        System.out.println("Sala: " + getNome());
        System.out.println("Descrição: " + getDescricao());

        String codigo = """
                __________________________________
                🧠 1. O nome “Git” foi uma escolha provocativa
                
                Linus Torvalds nomeou a ferramenta de forma irônica. Em inglês britânico, “git” é um xingamento leve, como "idiota" ou "babaca".
                
                Ele mesmo disse:
                "I'm an egotistical bastard, and I name all my projects after myself. First 'Linux', now 'Git'."
                Em português fica algo como: "Sou um babaca egoísta e dou meu próprio nome a todos os meus projetos. Primeiro "Linux", agora "Git".
                
                Mas também há versões mais brandas, como:
                "Global Information Tracker", em um contexto mais corporativo.
                
                __________________________________
                
                💻 2. Foi escrito em apenas algumas semanas
                Linus começou a programar o Git em abril de 2005.
                Em menos de um mês, o Git já estava sendo usado no desenvolvimento do kernel Linux.
                Isso mostra o foco e a urgência com que a ferramenta foi criada após a perda do BitKeeper.
                
                __________________________________
                
                🧪 3. O Git não salva arquivos — ele salva snapshots
                Diferente de outros sistemas de versionamento (como o SVN), o Git não salva apenas as diferenças (deltas).
                Ele tira uma “foto” completa (snapshot) de todos os arquivos cada vez que você faz um commit (otimizando os arquivos que não mudaram).
                Isso torna os dados mais seguros e os repositórios mais rápidos.
                
                __________________________________
                
                🔐 4. Cada commit é criptograficamente protegido
                Git usa SHA-1 (um algoritmo de hash) para identificar cada commit.
                Isso garante integridade dos dados — qualquer alteração maliciosa ou acidental no histórico é detectada.
                
                __________________________________
                
                🧑‍🚀 5. Você pode usar Git sem internet
                Como é um sistema distribuído, você pode clonar um repositório e trabalhar com ele completamente offline.
                Commits, branches e merges funcionam localmente — a conexão só é necessária para sincronizar com repositórios remotos.
                
                __________________________________
                
                🧩 6. Git permite criar hooks personalizados
                Você pode configurar scripts automáticos (chamados Git hooks) para rodarem em momentos específicos, como antes de um commit, depois de um push, etc.
                Muito usado para validar código, rodar testes, ou aplicar formatações automaticamente.
                
                __________________________________
                
                🕳️ 7. Você pode "reescrever a história" com Git
                Comandos como rebase, reset e filter-branch permitem alterar o histórico de commits.
                Isso pode ser útil para limpar o histórico antes de publicar um projeto… mas também pode causar confusões sérias se usado incorretamente.
               
                """;

        System.out.println(codigo);
    }
}
