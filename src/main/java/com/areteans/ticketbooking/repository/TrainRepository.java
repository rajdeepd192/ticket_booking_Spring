package com.areteans.ticketbooking.repository;

import com.areteans.ticketbooking.models.TrainJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<TrainJPA, Long> {
}
