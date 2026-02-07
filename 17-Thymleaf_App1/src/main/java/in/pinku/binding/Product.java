package in.pinku.binding;

import jakarta.validation.constraints.NotNull;

public class Product {
	
	@NotNull(message = "ID is Not Null")
	private Integer pid;                                                                                                 
 	private String pname;                                                                                               
 	private Long price;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}                                                                                               
 	                     
 	

}
