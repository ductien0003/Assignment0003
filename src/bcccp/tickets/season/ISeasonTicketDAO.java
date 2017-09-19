package bcccp.tickets.season;

public interface ISeasonTicketDAO {
	//checking getNumberOfTickets method - UAT
	public void registerTicket(ISeasonTicket ticket);
	public void deregisterTicket(ISeasonTicket ticket);
	public int getNumberOfTickets();
	///checking findTicketById method - UAT
	public ISeasonTicket findTicketById(String ticketId);
	public void recordTicketEntry(String ticketId );
	public void recordTicketExit(String ticketId);
}
