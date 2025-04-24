import java.util.ArrayList;
import java.util.List;

public class TicketSystem {
    private List<Ticket> tickets;
    private int ticketCounter;

    // Construtor
    public TicketSystem() {
        tickets = new ArrayList<>();
        ticketCounter = 1;  // Iniciar o contador de tickets
    }

    // Método para criar um novo ticket
    public Ticket criarTicket(String descricao) {
        Ticket ticket = new Ticket(ticketCounter++, descricao);
        tickets.add(ticket);
        return ticket;
    }

    // Método para listar todos os tickets
    public void listarTickets() {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    // Método para fechar um ticket
    public void fecharTicket(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                ticket.fechar();
                break;
            }
        }
    }
}
