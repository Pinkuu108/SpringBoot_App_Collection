package in.pinku.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BusPassenger {

    private String fname;
    private String from;
    private String to;
    private String doj;

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
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
    public String getDoj() {
        return doj;
    }
    public void setDoj(String doj) {
        this.doj = doj;
    }
}
