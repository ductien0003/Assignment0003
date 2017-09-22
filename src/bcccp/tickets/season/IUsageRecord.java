package bcccp.tickets.season;

public interface IUsageRecord {
	//UAT testing2 checking get methods
	public void finalise(long endDateTime);
	public long getStartTime();
	public long getEndTime();
	public String getSeasonTicketId();

}
