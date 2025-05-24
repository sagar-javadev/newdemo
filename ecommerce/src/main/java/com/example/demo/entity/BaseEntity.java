package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BaseEntity {
	
	 @Column(name="create_date",updatable = false)
	    @CreationTimestamp
	    private LocalDate createdate;

	    @Column(name="update_date",insertable = false)
	    @UpdateTimestamp
	    private LocalDate updatedate;

	    @Column(name="status")
	    private String isactive;

}
