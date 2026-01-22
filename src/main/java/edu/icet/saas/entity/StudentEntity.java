package edu.icet.saas.entity;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class StudentEntity {
    private UUID id;
    private String name;
    private Integer age;
    private String address;
    private UUID cityId;
    private UUID genderId;
    private UUID classId;
    private UUID clubId;
    private UUID libraryId;
    private UUID schoolId;
    private UUID achievementId;
    private UUID mediumId;
    private UUID reportId;
}
