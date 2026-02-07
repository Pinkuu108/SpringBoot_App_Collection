package in.pinku.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
	
	private Integer ticketId;
	private String from;
	private String to;
	private String trainNum;
	private String ticketcost;
	private String ticketstatus;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
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
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketcost() {
		return ticketcost;
	}
	public void setTicketcost(String ticketcost) {
		this.ticketcost = ticketcost;
	}
	public String getTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	

}
