package bcccp.tickets.season;

public interface ISeasonTicketDAO {
	//checking getNumberOfTickets method - integration 
	public void registerTicket(ISeasonTicket ticket);
	public void deregisterTicket(ISeasonTicket ticket);
	public int getNumberOfTickets();
	///checking findTicketById method - integration
	public ISeasonTicket findTicketById(String ticketId);
	public void recordTicketEntry(String ticketId );
	public void recordTicketExit(String ticketId);
}
