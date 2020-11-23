package com.areteans.ticketbooking.repository;

import com.areteans.ticketbooking.models.PassengerJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerJPA, Long> {
}
