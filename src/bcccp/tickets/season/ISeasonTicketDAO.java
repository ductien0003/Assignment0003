package bcccp.tickets.season;

public interface ISeasonTicketDAO {
	//checking getNumberOfTickets method
	public void registerTicket(ISeasonTicket ticket);
	public void deregisterTicket(ISeasonTicket ticket);
	public int getNumberOfTickets();
	///checking findTicketById method
	public ISeasonTicket findTicketById(String ticketId);
	public void recordTicketEntry(String ticketId );
	public void recordTicketExit(String ticketId);
}
