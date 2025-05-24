package com.example.demo.dtos;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.constant.ValidationConstant;
import com.example.demo.validation.ImageNameValid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto  extends BaseEntityDto{
	
	 private Long id;

	    @NotEmpty
	    @Size(min=3,max=15,message = ValidationConstant.USER )
	    private String name;

	    @NotEmpty
	    @Email(message = ValidationConstant.EMAIL)
	    private String email;

	    @NotEmpty
	    @Pattern(regexp = ValidationConstant.PASSWORD_PATTERN,message= ValidationConstant.PASSWORD)
	    private String password;

	    @NotEmpty
	    @Size(min = 4,max = 6,message = ValidationConstant.GENDER_MSG)
	    private String gender;

	    @NotEmpty
	    @Size(min = 10,max = 100,message = ValidationConstant.ABOUT)
	    private String about;

	    @NotEmpty
	    //@ImageNameValid
	    private String imageName;


}
