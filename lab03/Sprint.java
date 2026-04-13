import java.util.Arrays;

public class Sprint {
    private final int timeCapacity;
    private final int ticketLimit;
    private final Ticket[] tickets;
    private int ticketCount;
    private int totalEstimate;

    public Sprint(int timeCapacity, int ticketLimit) {
        this.timeCapacity = timeCapacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new Ticket[ticketLimit];
        this.ticketCount = 0;
        this.totalEstimate = 0;
    }

    private boolean canAdd(Ticket ticket) {
        if (ticket == null) return false;
        if (ticket.isCompleted()) return false;
        if (ticketCount >= ticketLimit) return false;
        if (totalEstimate + ticket.getEstimate() > timeCapacity) return false;
        return true;
    }

    private boolean addTicket(Ticket ticket) {
        if (!canAdd(ticket)) return false;
        tickets[ticketCount++] = ticket;
        totalEstimate += ticket.getEstimate();
        return true;
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return addTicket(bugReport);
    }

    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, ticketCount);
    }

    public int getTotalEstimate() {
        return totalEstimate;
    }
}
