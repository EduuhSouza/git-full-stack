package salas;

public class SalaComandoBasicos extends Sala {

    public SalaComandoBasicos() {
        super("Comandos Básicos do Git", "Nesta sala teremos algumas informações para você aprender mais sobre o Git");
    }

    @Override
    public void exibirConteudo() {
        System.out.println("___________________");
        System.out.println("Sala: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        String codigo =  """
                Código:
                
                """;
        System.out.println(codigo);
    }
}
