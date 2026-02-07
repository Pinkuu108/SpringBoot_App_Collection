package in.pinku.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.pinku.request.Passengers;
import in.pinku.response.Ticket;

@RestController
public class RailwayRestController {
	
	private Map<Integer, Ticket> tickets=new  HashMap<Integer, Ticket>();
	@PostMapping(
			
			value = "/ticket",
			consumes = {"application/xml","application/json"},
			produces={"application/xml","application/json"}
			)
	
	
	public Ticket bookticket(@RequestBody Passengers passengers)
	{
		Random r=new Random();
		int ticketId = r.nextInt();
		Ticket t=new Ticket();
		
		t.setTicketId(ticketId);
		t.setFrom(passengers.getFrom());
		t.setTo(passengers.getTo());
		t.setTicketstatus("Confomed..");
		t.setTrainNum(passengers.getTrainNum());
		t.setTicketcost("1500.00INR");
		
		tickets.put(ticketId, t);
		return t;
	}
	@GetMapping(
			value = "/ticket/{ticketId}",		
			produces={"application/xml","application/json"}
			)
	public Ticket getticket(@PathVariable Integer ticketId)
	{
		if(tickets.containsKey(ticketId))
		{
			return tickets.get(ticketId);
		}
		return null;
	}

}
