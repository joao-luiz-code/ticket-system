
public class Ticket {
    private int id;
    private String descricao;
    private String status;

    // Construtor
    public Ticket(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.status = "Aberto";  // Status inicial do ticket
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public void fechar() {
        this.status = "Fechado";  // Alterar o status para "Fechado"
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao + ", Status: " + status;
    }
}


