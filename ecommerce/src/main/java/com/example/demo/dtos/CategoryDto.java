package com.example.demo.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.example.demo.constant.ValidationConstant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto  extends BaseEntityDto{
	
	private Long categoryId;

    @NotEmpty
    @Size(min=5,max = 50,message =ValidationConstant.TITLE_MSG)
    private String title;


    @NotEmpty
    @Size(min=5,max = 50,message =ValidationConstant.DESCRIPTION_MSG)
    private String description;


 //   @ImageNameValid
    private String coverImage;
	

}
