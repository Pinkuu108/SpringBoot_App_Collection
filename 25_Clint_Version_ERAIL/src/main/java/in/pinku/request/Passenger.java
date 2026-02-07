package in.pinku.request;




public class Passenger {
	
	private String doj;
	private String fname;
	private String from;
	private String to;
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
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
	@Override
	public String toString() {
		return "Passenger [doj=" + doj + ", fname=" + fname + ", from=" + from + ", to=" + to + "]";
	}
	
	
		  
		}


