package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		this.ticketId = ticketId;
		this.carparkId =carparkId;
		this.startValidPeriod = startValidPeriod;
		this.endValidPeriod = endValidPeriod;
		
		usages = new ArrayList<IUsageRecord>();
	}


	@Override
	public String getId() {
		return ticketId;
	}
public static void main(String args[]) 
{
SeasonTicket st=new SeasonTicket("12345", "1122",11.setp.2017,11.sep.2018)
System.out.println("The carparkid of the Car is:"+st.getId());
System.out.println("The carparkid of the Car is:"+st.getCarparkId());
System.out.println("The valid time of the Car is:"+st.getStartValiedPeriod());

System.out.println("The valid time end periode of the Car is:"+st.endValidPeriode());

}



	@Override
	public String getCarparkId() {
		return carparkId;
	}


	@Override
	public long getStartValidPeriod() {
		return startValidPeriod;
	}


	@Override
	public long getEndValidPeriod() {
		return endValidPeriod;
	}


	@Override
	public boolean inUse() {
		return currentUsage != null;
	}


	@Override
	public void recordUsage(IUsageRecord record) {
		currentUsage = record;
		if (!usages.contains(record) ) {
			usages.add(record);
		}
		
	}


	@Override
	public IUsageRecord getCurrentUsageRecord() {
		return currentUsage;
	}


	@Override
	public List<IUsageRecord> getUsageRecords() {
		return Collections.unmodifiableList(usages);
	}


	@Override
	public void endUsage(long dateTime) {
		if (currentUsage == null) throw new RuntimeException("SeasonTicket.endUsage : ticket is not in use");
		
		currentUsage.finalise(dateTime);
		currentUsage = null;
		
	}


	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carpark    : " + carparkId + "\n" +
		       "Ticket No  : " + ticketId + "\n" );
		for (IUsageRecord usage : usages) {
			builder.append(usage.toString() + "\n");
		}
		return builder.toString();
	}


}
