package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.dtos.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;


@SpringBootTest
public class UserServiceTestCases {

	
	 @MockBean
	    private UserRepository repository;

	    @Autowired
	    private ModelMapper modelMapper;

	    @Autowired
	    private UserService userService;

	    User user;
	    @BeforeEach
	    public  void init()
	    {
	        user= User.builder()
	                .id(1l)
	                .name("Isha")
	                .about("Software Enginner")
	                .email("isha@gmil.com").gender("Female")
	                .imageName("abc.png").password("1234@12").build();
	    }

	    @Test
	    public void createuserTest()
	    {

	        Mockito.when(repository.save(Mockito.<User>any())).thenReturn(user);
	        UserDto user1 = userService.createUser(new UserDto());
	        System.out.println(user1.getName());
	        // Assertions.assertNotNull(user1);
	        Assertions.assertEquals(user.getName(),user1.getName());
//	        verify(repository).save(Mockito.<User>any());
	    }
	}


