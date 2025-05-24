package com.example.demo.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.example.demo.dtos.PagableResponse;
import com.example.demo.dtos.UserDto;

import net.sf.jasperreports.engine.JRException;

public interface UserService {
	
	
//  create
  UserDto createUser(UserDto user);
//  update

  UserDto updateUser(UserDto user,Long userid);

//  delete
  void deleteUser(Long userid);

//  getalluser

  PagableResponse getAllUsers(Integer pagenumber, Integer pagesize, String sortBy, String sortDir);

//  getsingleuser

  UserDto getSingleUser(Long userid);
//  get user by email
  UserDto getUserbyEmail(String email);
//  search user

  List<UserDto> searchUsers(String keyword);
//  other specific user
String exportrept(String reportformat) throws FileNotFoundException, JRException;
}


