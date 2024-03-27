package com.springapps.bookingapp.repositories;

import com.springapps.bookingapp.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findAllByCheckInAfterAndCheckOutBefore(LocalDate start, LocalDate end);
}
