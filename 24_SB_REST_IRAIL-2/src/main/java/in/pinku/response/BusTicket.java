package in.pinku.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BusTicket {

    private Integer ticketno;
    private String from;
    private String to;
    private String ticketstatus;

    public Integer getTicketno() {
        return ticketno;
    }
    public void setTicketno(Integer ticketno) {
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
}
