package in.pinku.response;


public class Ticket {

	private String ticketno;
	private String from;
	private String to;
	private String ticketstatus;
	public String getTicketno() {
		return ticketno;
	}
	public void setTicketno(String ticketno) {
		this.ticketno = ticketno;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketno=" + ticketno + ", from=" + from + ", to=" + to + ", ticketstatus=" + ticketstatus
				+ "]";
	}

	
}
