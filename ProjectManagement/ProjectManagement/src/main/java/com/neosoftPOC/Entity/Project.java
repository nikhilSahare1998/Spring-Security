package com.neosoftPOC.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
@Table(name="Project")
public class Project {


    @Id
    @GeneratedValue()
    private Long projId;

    @Column(name ="ProjName",nullable = false)
    private String projectName;

    @Column(name="ProStartDate",nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate proStartDate;

    @Column(name="ProEndDate",nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate proEndDate;

    @ManyToOne
    private Users users;


}



