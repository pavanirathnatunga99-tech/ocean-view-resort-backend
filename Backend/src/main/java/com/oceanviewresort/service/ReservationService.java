package com.oceanviewresort.service;
import com.oceanviewresort.model.Reservation;
import com.oceanviewresort.repository.ReservationRepository;

import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;
@Service
public class ReservationService {
        private final ReservationRepository repo;

    public ReservationService(ReservationRepository repo) {
        this.repo = repo;
    }

    public Reservation addReservation(Reservation reservation) {
        return repo.save(reservation);
    }

    public Reservation getReservation(Long id) {
        return repo.findById(id).orElse(null);
    }

    public String generateBill(Long id) {
    Reservation r = getReservation(id);

    long nights = ChronoUnit.DAYS.between(r.getCheckIn(), r.getCheckOut());

    double rate = switch (r.getRoomType()) {
        case "Single" -> 8000;
        case "Double" -> 12000;
        case "Suite" -> 20000;
        default -> 0;
    };

    double total = nights * rate;

    return """
            ===== Ocean View Resort =====
            Reservation ID: %d
            Guest Name: %s
            Room Type: %s
            Check-in: %s
            Check-out: %s
            Nights: %d
            Rate per Night: LKR %.2f
            ------------------------------
            TOTAL BILL: LKR %.2f
            ==============================
            """
            .formatted(
                    r.getReservationId(),
                    r.getGuestName(),
                    r.getRoomType(),
                    r.getCheckIn(),
                    r.getCheckOut(),
                    nights,
                    rate,
                    total
            );
}
}