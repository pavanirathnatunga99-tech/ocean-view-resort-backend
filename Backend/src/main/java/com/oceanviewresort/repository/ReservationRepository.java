package com.oceanviewresort.repository;
import com.oceanviewresort.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ReservationRepository extends JpaRepository<Reservation, Long>  {
   
}

