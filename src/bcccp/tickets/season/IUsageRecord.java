package bcccp.tickets.season;

public interface IUsageRecord {
	//unit testing1 checking get methods
	public void finalise(long endDateTime);
	public long getStartTime();
	public long getEndTime();
	public String getSeasonTicketId();

}
