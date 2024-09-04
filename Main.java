class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    //Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;

    }

    // métodos Get e Set
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}



public class Main{

    public static void main(String[] args)  {
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar conceitos de classes e objetos", "04-09-2004", 1);
        System.out.println("Título:" + tarefa1.getTitulo());
        }
}