package bcccp.tickets.adhoc;

public class AdhocTicketFactory implements IAdhocTicketFactory {

	@Override
	public IAdhocTicket make(String carparkId, int ticketNo) {
		String barcode = "A" + Integer.toHexString(ticketNo);
		return new AdhocTicket(carparkId, ticketNo, barcode);
	}
public static void main(String args[]) 
{

AdhocTicketFactory atf= new AddhocTicketFactory();
System.out.println("The carparkid is:+atf.make("11225", null);
System.out.println("the ticket number is:atf.make(null, 12345);


}
