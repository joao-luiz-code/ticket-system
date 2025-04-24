
public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        // Criando tickets
        Ticket ticket1 = ticketSystem.criarTicket("Problema com o servidor");
        Ticket ticket2 = ticketSystem.criarTicket("Erro no login");

        // Listando tickets
        System.out.println("Tickets Criados:");
        ticketSystem.listarTickets();

        // Fechando o primeiro ticket
        ticketSystem.fecharTicket(ticket1.getId());

        // Listando novamente após o fechamento de um ticket
        System.out.println("\nTickets Após Fechar o Primeiro:");
        ticketSystem.listarTickets();
    }
}

