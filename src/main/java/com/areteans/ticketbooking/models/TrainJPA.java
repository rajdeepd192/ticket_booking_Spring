package com.areteans.ticketbooking.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name = "train")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainJPA{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long train_no;
    private String train_name;
    private String start_city;
    private String end_city;
    private Long total_seats;
    private Long fare;

}
