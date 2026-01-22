package edu.icet.saas.entity;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
public class TeacherEntity {
    private UUID id;
    private String name;
    private String nic;
    private String phone;
    private String email;
    private LocalDate dob;
    private String address;
    private Double salary;
}
