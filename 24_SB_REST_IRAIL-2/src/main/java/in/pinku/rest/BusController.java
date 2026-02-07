package in.pinku.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.*;

import in.pinku.request.BusPassenger;
import in.pinku.response.BusTicket;

@RestController
public class BusController {

    private Map<Integer, BusTicket> ticket = new HashMap<>();

    @PostMapping(
            value = "/bus",
            consumes = {"application/xml", "application/json"},
            produces = {"application/xml", "application/json"}
    )
    public BusTicket bookticket(@RequestBody BusPassenger busPassenger) {

        int ticketno = new Random().nextInt(900000) + 100000;

        BusTicket b = new BusTicket();
        b.setTicketno(ticketno);
        b.setFrom(busPassenger.getFrom());
        b.setTo(busPassenger.getTo());
        b.setTicketstatus("confirmed");

        ticket.put(ticketno, b);
        return b;
    }

    @GetMapping(
            value = "/bus/{ticketno}",
            produces = {"application/xml", "application/json"}
    )
    public BusTicket out(@PathVariable Integer ticketno) {
        return ticket.getOrDefault(ticketno, null);
    }
}
