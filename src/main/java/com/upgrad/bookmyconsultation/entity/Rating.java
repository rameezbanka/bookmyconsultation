package com.upgrad.bookmyconsultation.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Rating{


    @Id
    private String id;

    private String appointmentId ;

    private String doctorId;

    private Integer rating;

    private String comments;

    public Rating(String appointmentId, String doctorId, Integer rating, String comments) {
        this.id = UUID.randomUUID().toString();
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.rating = rating;
        this.comments = comments;
    }
}

//mark this class as an 'entity class'
//Use Data annotation to generate boilerplate code
//Use NoArgsConstructor annotation
//create a class name Rating
	//create a primary key called 'id' of type String
	//initialise id with a UUID using UUID.randomUUID
	//create appointmentId of type String
	//create doctorId of type String
	//create rating of type Integer
	//create comments of type String
	//Set access modifiers for all these members to 'private'
	
