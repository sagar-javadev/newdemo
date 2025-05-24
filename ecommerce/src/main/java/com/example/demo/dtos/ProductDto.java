package com.example.demo.dtos;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.constant.ValidationConstant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ProductDto extends BaseEntityDto {
	
	private Long pid;
    @NotEmpty
    @Size(min=3,max=15,message = ValidationConstant.CATEGORY )
    private String title;

    @NotEmpty
    @Size(min=10,max = 10000,message = "Please Enter at least 10 Character")
    private String description;
    @DecimalMin(value = "0.1", inclusive = false)
    private Double price;
//    @NotNull
//    @Size(min=10,max = 10000,message = "Please Enter at least 10 Character")
    private Integer quantity;

    @AssertTrue
    private  Boolean live;
    @AssertTrue
    private Boolean stock;

    @NotEmpty
    private String discount;

    @NotEmpty
    private String brand;
}


