package salas;

public class SalaEvolucao extends Sala{
    public SalaEvolucao() {
        super("Evolução do Git", "Nesta sala exploraremos mais e evolução do Git do mercado");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("___________________");
        System.out.println("Sala: " + getNome());
        System.out.println("Descrição: " + getDescricao());

        String codigo = """
                __________________________________
                Início e Adoção Inicial (2005–2008)
                
                Criado por Linus Torvalds em 2005, para gerenciar o código do kernel do Linux.
                Ganhou rapidamente a confiança da comunidade de código aberto por ser rápido, confiável e distribuído.
                Inicialmente, o uso era mais técnico e limitado a projetos open source avançados.
                
                __________________________________
                🌍 Expansão e Popularização (2008–2012)
                - Com o surgimento do GitHub em 2008, o Git ficou muito mais acessível e amigável.
                - GitHub trouxe funcionalidades sociais (como pull requests, issues e forks), tornando o Git mais atrativo e colaborativo.
                - Começou a ser adotado por startups e pequenas empresas.
                
                __________________________________
                🏢 Adoção Corporativa e Consolidação (2012–2018)
                - Gigantes como Google, Facebook, Microsoft, e Netflix passaram a usar Git internamente.
                - Empresas migraram de ferramentas como Subversion (SVN) e Mercurial para o Git.
                - Ferramentas como GitLab e Bitbucket surgiram como alternativas ao GitHub.
                - O Git se consolidou como o padrão de fato para controle de versão.
                
                __________________________________
                🤝 Aquisição e Maturidade (2018–2022)
                - Em 2018, a Microsoft comprou o GitHub, mostrando o quanto a tecnologia se tornou estratégica.
                - Git passou a ser integrado a plataformas de CI/CD, DevOps e gestão de projetos.
                - Ferramentas gráficas, editores (como VS Code) e IDEs passaram a oferecer suporte nativo ao Git.
                
                __________________________________
                🔄 Atualidade e Futuro (2023 em diante)
                
                - Git continua sendo a base para o desenvolvimento colaborativo global.
                - Projetos de qualquer escala, de apps simples a sistemas de inteligência artificial, usam Git.
                - Integrações com IA, automação de merges e melhorias em usabilidade têm sido foco recente.
                - A comunidade continua ativa, e o Git evolui com foco em performance, usabilidade e integração com novas tecnologias.
                
                __________________________________
                📊 Conclusão:
                O Git passou de uma ferramenta técnica para um pilar da engenharia de software moderna. 
                Hoje, é essencial não só para desenvolvedores, mas para equipes inteiras que trabalham com tecnologia, documentação e produto.
                """;

        System.out.println(codigo);
    }
}
