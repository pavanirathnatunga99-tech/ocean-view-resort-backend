package com.oceanviewresort.controller;
import com.oceanviewresort.model.Reservation;
import com.oceanviewresort.service.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
  // Service layer used to handle reservation business logic
  private final ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }
    // API endpoint to create a new reservation
    @PostMapping
    public Reservation add(@RequestBody Reservation reservation) {
        return service.addReservation(reservation);
    }
    // API endpoint to retrieve reservation details by ID
    @GetMapping("/{id}")
    public Reservation get(@PathVariable Long id) {
        return service.getReservation(id);
    }
   // API endpoint to generate and print the reservation bill
   @GetMapping("/{id}/print")
public String printBill(@PathVariable Long id) {
    return service.generateBill(id);
}

    }
  

