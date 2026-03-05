package com.oceanviewresort.controller;
import com.oceanviewresort.model.Reservation;
import com.oceanviewresort.service.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
  private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }

    @PostMapping
    public Reservation add(@RequestBody Reservation reservation) {
        return service.addReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation get(@PathVariable Long id) {
        return service.getReservation(id);
    }

   @GetMapping("/{id}/print")
public String printBill(@PathVariable Long id) {
    return service.generateBill(id);
}

    }
  

