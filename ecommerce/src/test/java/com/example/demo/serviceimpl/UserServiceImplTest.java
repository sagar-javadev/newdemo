package com.example.demo.serviceimpl;

import java.time.LocalDate;
import java.util.Optional;

	import org.junit.jupiter.api.Disabled;

	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.Mockito;
	import org.mockito.junit.jupiter.MockitoExtension;
	import org.modelmapper.ModelMapper;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.mock.mockito.MockBean;
	import org.springframework.test.context.ContextConfiguration;
	import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.dtos.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.shruteekatech.electronicStore.service.serviceimpl.UserServiceimpl;

	@ContextConfiguration(classes = {UserServiceimpl.class})
	@ExtendWith(MockitoExtension.class)
	class UserServiceimplTest {
	    @MockBean
	    private ModelMapper modelMapper;

	    @MockBean
	    private UserRepository userRepository;

	    @Autowired
	    private UserServiceimpl userServiceimpl;

	    /**
	     * Method under test: {@link UserServiceimpl#createUser(UserDto)}
	     */
	    @Test
	    void testCreateUser() {
	        User user = new User();
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("hi");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        when(userRepository.save(Mockito.<User>any())).thenReturn(user);
	        UserDto actualCreateUserResult = userServiceimpl.createUser(new UserDto());
	        assertEquals("About", actualCreateUserResult.getAbout());
	        assertEquals("hi", actualCreateUserResult.getPassword());
	        assertEquals("Name", actualCreateUserResult.getName());
	        assertEquals("Image Name", actualCreateUserResult.getImageName());
	        assertEquals(1L, actualCreateUserResult.getId().longValue());
	        assertEquals("Gender", actualCreateUserResult.getGender());
	        assertEquals("jane.doe@example.org", actualCreateUserResult.getEmail());
	        verify(userRepository).save(Mockito.<User>any());
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#createUser(UserDto)}
	     */
	    @Test
	    void testCreateUser2() {
	        User user = mock(User.class);
	        when(user.getId()).thenReturn(1L);
	        when(user.getAbout()).thenReturn("About");
	        when(user.getEmail()).thenReturn("jane.doe@example.org");
	        when(user.getGender()).thenReturn("Gender");
	        when(user.getImageName()).thenReturn("Image Name");
	        when(user.getName()).thenReturn("Name");
	        when(user.getPassword()).thenReturn("hi");
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("hi");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        when(userRepository.save(Mockito.<User>any())).thenReturn(user);
	        UserDto actualCreateUserResult = userServiceimpl.createUser(new UserDto());
	        assertEquals("About", actualCreateUserResult.getAbout());
	        assertEquals("hi", actualCreateUserResult.getPassword());
	        assertEquals("Name", actualCreateUserResult.getName());
	        assertEquals("Image Name", actualCreateUserResult.getImageName());
	        assertEquals(1L, actualCreateUserResult.getId().longValue());
	        assertEquals("Gender", actualCreateUserResult.getGender());
	        assertEquals("jane.doe@example.org", actualCreateUserResult.getEmail());
	        verify(userRepository).save(Mockito.<User>any());
	        verify(user).getId();
	        verify(user).getAbout();
	        verify(user).getEmail();
	        verify(user).getGender();
	        verify(user).getImageName();
	        verify(user).getName();
	        verify(user).getPassword();
	        verify(user).setCreatedate(Mockito.<LocalDate>any());
	        verify(user).setIsactive(Mockito.<String>any());
	        verify(user).setUpdatedate(Mockito.<LocalDate>any());
	        verify(user).setAbout(Mockito.<String>any());
	        verify(user).setEmail(Mockito.<String>any());
	        verify(user).setGender(Mockito.<String>any());
	        verify(user).setId(Mockito.<Long>any());
	        verify(user).setImageName(Mockito.<String>any());
	        verify(user).setName(Mockito.<String>any());
	        verify(user).setPassword(Mockito.<String>any());
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#createUser(UserDto)}
	     */
	    @Test
	    @Disabled("TODO: Complete this test")
	    void testCreateUser3() {
	        // TODO: Complete this test.
	        //   Reason: R013 No inputs found that don't throw a trivial exception.
	        //   Diffblue Cover tried to run the arrange/act section, but the method under
	        //   test threw
	        //   java.lang.NullPointerException: Cannot invoke "com.shruteekatech.electronicStore.dtos.UserDto.getId()" because "userDto" is null
	        //       at com.shruteekatech.electronicStore.service.serviceimpl.UserServiceimpl.dtotoentity(UserServiceimpl.java:209)
	        //       at com.shruteekatech.electronicStore.service.serviceimpl.UserServiceimpl.createUser(UserServiceimpl.java:69)
	        //   See https://diff.blue/R013 to resolve this issue.

	        User user = mock(User.class);
	        when(user.getId()).thenReturn(1L);
	        when(user.getAbout()).thenReturn("About");
	        when(user.getEmail()).thenReturn("jane.doe@example.org");
	        when(user.getGender()).thenReturn("Gender");
	        when(user.getImageName()).thenReturn("Image Name");
	        when(user.getName()).thenReturn("Name");
	        when(user.getPassword()).thenReturn("hi");
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("hi");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        when(userRepository.save(Mockito.<User>any())).thenReturn(user);
	        userServiceimpl.createUser(null);
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#createUser(UserDto)}
	     */
	    @Test
	    void testCreateUser4() {
	        User user = mock(User.class);
	        when(user.getId()).thenReturn(1L);
	        when(user.getAbout()).thenReturn("About");
	        when(user.getEmail()).thenReturn("jane.doe@example.org");
	        when(user.getGender()).thenReturn("Gender");
	        when(user.getImageName()).thenReturn("Image Name");
	        when(user.getName()).thenReturn("Name");
	        when(user.getPassword()).thenReturn("hi");
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("hi");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        when(userRepository.save(Mockito.<User>any())).thenReturn(user);
	        UserDto userdto = mock(UserDto.class);
	        when(userdto.getId()).thenReturn(1L);
	        when(userdto.getAbout()).thenReturn("About");
	        when(userdto.getEmail()).thenReturn("jane.doe@example.org");
	        when(userdto.getGender()).thenReturn("Gender");
	        when(userdto.getImageName()).thenReturn("Image Name");
	        when(userdto.getName()).thenReturn("Name");
	        when(userdto.getPassword()).thenReturn("hi");
	        UserDto actualCreateUserResult = userServiceimpl.createUser(userdto);
	        assertEquals("About", actualCreateUserResult.getAbout());
	        assertEquals("hi", actualCreateUserResult.getPassword());
	        assertEquals("Name", actualCreateUserResult.getName());
	        assertEquals("Image Name", actualCreateUserResult.getImageName());
	        assertEquals(1L, actualCreateUserResult.getId().longValue());
	        assertEquals("Gender", actualCreateUserResult.getGender());
	        assertEquals("jane.doe@example.org", actualCreateUserResult.getEmail());
	        verify(userRepository).save(Mockito.<User>any());
	        verify(user).getId();
	        verify(user).getAbout();
	        verify(user).getEmail();
	        verify(user).getGender();
	        verify(user).getImageName();
	        verify(user).getName();
	        verify(user).getPassword();
	        verify(user).setCreatedate(Mockito.<LocalDate>any());
	        verify(user).setIsactive(Mockito.<String>any());
	        verify(user).setUpdatedate(Mockito.<LocalDate>any());
	        verify(user).setAbout(Mockito.<String>any());
	        verify(user).setEmail(Mockito.<String>any());
	        verify(user).setGender(Mockito.<String>any());
	        verify(user).setId(Mockito.<Long>any());
	        verify(user).setImageName(Mockito.<String>any());
	        verify(user).setName(Mockito.<String>any());
	        verify(user).setPassword(Mockito.<String>any());
	        verify(userdto).getId();
	        verify(userdto).getAbout();
	        verify(userdto).getEmail();
	        verify(userdto).getGender();
	        verify(userdto).getImageName();
	        verify(userdto).getName();
	        verify(userdto).getPassword();
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#updateUser(UserDto, Long)}
	     */
	    @Test
	    void testUpdateUser() {
	        UserDto userDto = new UserDto();
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any())).thenReturn(userDto);

	        User user = new User();
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("iloveyou");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        Optional<User> ofResult = Optional.of(user);

	        User user2 = new User();
	        user2.setAbout("About");
	        user2.setCreatedate(LocalDate.of(1970, 1, 1));
	        user2.setEmail("jane.doe@example.org");
	        user2.setGender("Gender");
	        user2.setId(1L);
	        user2.setImageName("Image Name");
	        user2.setIsactive("Isactive");
	        user2.setName("Name");
	        user2.setPassword("iloveyou");
	        user2.setUpdatedate(LocalDate.of(1970, 1, 1));
	        when(userRepository.save(Mockito.<User>any())).thenReturn(user2);
	        when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
	        assertSame(userDto, userServiceimpl.updateUser(new UserDto(), 1L));
	        verify(modelMapper).map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any());
	        verify(userRepository).save(Mockito.<User>any());
	        verify(userRepository).findById(Mockito.<Long>any());
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#updateUser(UserDto, Long)}
	     */
	    @Test
	    void testUpdateUser2() {
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Map");
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any())).thenReturn(new UserDto());

	        User user = new User();
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("iloveyou");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        Optional<User> ofResult = Optional.of(user);
	        when(userRepository.save(Mockito.<User>any())).thenThrow(
	                new EmailNotFoundException("An error occurred", "Initiating dao call to update the user data with userId:{}",
	                        "Initiating dao call to update the user data with userId:{}"));
	        when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
	        assertThrows(EmailNotFoundException.class, () -> userServiceimpl.updateUser(new UserDto(), 1L));
	        verify(modelMapper).map(Mockito.<Object>any(), Mockito.<Class<Object>>any());
	        verify(userRepository).save(Mockito.<User>any());
	        verify(userRepository).findById(Mockito.<Long>any());
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#updateUser(UserDto, Long)}
	     */
	    @Test
	    void testUpdateUser3() {
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Map");
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any())).thenReturn(new UserDto());
	        User user = mock(User.class);
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("iloveyou");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        Optional<User> ofResult = Optional.of(user);
	        when(userRepository.save(Mockito.<User>any())).thenThrow(
	                new EmailNotFoundException("An error occurred", "Initiating dao call to update the user data with userId:{}",
	                        "Initiating dao call to update the user data with userId:{}"));
	        when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
	        assertThrows(EmailNotFoundException.class, () -> userServiceimpl.updateUser(new UserDto(), 1L));
	        verify(modelMapper).map(Mockito.<Object>any(), Mockito.<Class<Object>>any());
	        verify(userRepository).save(Mockito.<User>any());
	        verify(userRepository).findById(Mockito.<Long>any());
	        verify(user).setCreatedate(Mockito.<LocalDate>any());
	        verify(user).setIsactive(Mockito.<String>any());
	        verify(user).setUpdatedate(Mockito.<LocalDate>any());
	        verify(user, atLeast(1)).setAbout(Mockito.<String>any());
	        verify(user, atLeast(1)).setEmail(Mockito.<String>any());
	        verify(user, atLeast(1)).setGender(Mockito.<String>any());
	        verify(user).setId(Mockito.<Long>any());
	        verify(user, atLeast(1)).setImageName(Mockito.<String>any());
	        verify(user, atLeast(1)).setName(Mockito.<String>any());
	        verify(user, atLeast(1)).setPassword(Mockito.<String>any());
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#updateUser(UserDto, Long)}
	     */
	    @Test
	    void testUpdateUser4() {
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Map");
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any())).thenReturn(new UserDto());
	        when(userRepository.save(Mockito.<User>any())).thenThrow(
	                new EmailNotFoundException("An error occurred", "Initiating dao call to update the user data with userId:{}",
	                        "Initiating dao call to update the user data with userId:{}"));
	        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
	        User user = mock(User.class);
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("iloveyou");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        assertThrows(ResourcenotFoundException.class, () -> userServiceimpl.updateUser(new UserDto(), 1L));
	        verify(modelMapper).map(Mockito.<Object>any(), Mockito.<Class<Object>>any());
	        verify(userRepository).findById(Mockito.<Long>any());
	        verify(user).setCreatedate(Mockito.<LocalDate>any());
	        verify(user).setIsactive(Mockito.<String>any());
	        verify(user).setUpdatedate(Mockito.<LocalDate>any());
	        verify(user).setAbout(Mockito.<String>any());
	        verify(user).setEmail(Mockito.<String>any());
	        verify(user).setGender(Mockito.<String>any());
	        verify(user).setId(Mockito.<Long>any());
	        verify(user).setImageName(Mockito.<String>any());
	        verify(user).setName(Mockito.<String>any());
	        verify(user).setPassword(Mockito.<String>any());
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#updateUser(UserDto, Long)}
	     */
	    @Test
	    @Disabled("TODO: Complete this test")
	    void testUpdateUser5() {
	        // TODO: Complete this test.
	        //   Reason: R013 No inputs found that don't throw a trivial exception.
	        //   Diffblue Cover tried to run the arrange/act section, but the method under
	        //   test threw
	        //   java.lang.NullPointerException: Cannot invoke "com.shruteekatech.electronicStore.dtos.UserDto.getName()" because "userdto" is null
	        //       at com.shruteekatech.electronicStore.service.serviceimpl.UserServiceimpl.updateUser(UserServiceimpl.java:83)
	        //   See https://diff.blue/R013 to resolve this issue.

	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Map");
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any())).thenReturn(new UserDto());
	        User user = mock(User.class);
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("iloveyou");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        Optional<User> ofResult = Optional.of(user);
	        when(userRepository.save(Mockito.<User>any())).thenThrow(
	                new EmailNotFoundException("An error occurred", "Initiating dao call to update the user data with userId:{}",
	                        "Initiating dao call to update the user data with userId:{}"));
	        when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
	        userServiceimpl.updateUser(null, 1L);
	    }

	    /**
	     * Method under test: {@link UserServiceimpl#updateUser(UserDto, Long)}
	     */
	    @Test
	    void testUpdateUser6() {
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<Object>>any())).thenReturn("Map");
	        when(modelMapper.map(Mockito.<Object>any(), Mockito.<Class<UserDto>>any())).thenReturn(new UserDto());
	        User user = mock(User.class);
	        doNothing().when(user).setCreatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setIsactive(Mockito.<String>any());
	        doNothing().when(user).setUpdatedate(Mockito.<LocalDate>any());
	        doNothing().when(user).setAbout(Mockito.<String>any());
	        doNothing().when(user).setEmail(Mockito.<String>any());
	        doNothing().when(user).setGender(Mockito.<String>any());
	        doNothing().when(user).setId(Mockito.<Long>any());
	        doNothing().when(user).setImageName(Mockito.<String>any());
	        doNothing().when(user).setName(Mockito.<String>any());
	        doNothing().when(user).setPassword(Mockito.<String>any());
	        user.setAbout("About");
	        user.setCreatedate(LocalDate.of(1970, 1, 1));
	        user.setEmail("jane.doe@example.org");
	        user.setGender("Gender");
	        user.setId(1L);
	        user.setImageName("Image Name");
	        user.setIsactive("Isactive");
	        user.setName("Name");
	        user.setPassword("iloveyou");
	        user.setUpdatedate(LocalDate.of(1970, 1, 1));
	        Optional<User> ofResult = Optional.of(user);
	        when(userRepository.save(Mockito.<User>any())).thenThrow(
	                new EmailNotFoundException("An error occurred", "Initiating dao call to update the user data with userId:{}",
	                        "Initiating dao call to update the user data with userId:{}"));
	        when(userRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
	        UserDto userdto = mock(UserDto.class);
	        when(userdto.getAbout()).thenReturn("About");
	        when(userdto.getEmail()).thenReturn("jane.doe@example.org");
	        when(userdto.getGender()).thenReturn("Gender");
	        when(userdto.getImageName()).thenReturn("Image Name");
	        when(userdto.getName()).thenReturn("Name");
	        when(userdto.getPassword()).thenReturn("iloveyou");
	        assertThrows(EmailNotFoundException.class, () -> userServiceimpl.updateUser(userdto, 1L));
	        verify(modelMapper).map(Mockito.<Object>any(), Mockito.<Class<Object>>any());
	        verify(userRepository).save(Mockito.<User>any());
	        verify(userRepository).findById(Mockito.<Long>any());
	        verify(user).setCreatedate(Mockito.<LocalDate>any());
	        verify(user).setIsactive(Mockito.<String>any());
	        verify(user).setUpdatedate(Mockito.<LocalDate>any());
	        verify(user, atLeast(1)).setAbout(Mockito.<String>any());
	        verify(user, atLeast(1)).setEmail(Mockito.<String>any());
	        verify(user, atLeast(1)).setGender(Mockito.<String>any());
	        verify(user).setId(Mockito.<Long>any());
	        verify(user, atLeast(1)).setImageName(Mockito.<String>any());
	        verify(user, atLeast(1)).setName(Mockito.<String>any());
	        verify(user, atLeast(1)).setPassword(Mockito.<String>any());
	        verify(userdto).getAbout();
	        verify(userdto).getEmail();
	        verify(userdto).getGender();
	        verify(userdto).getImageName();
	        verify(userdto).getName();
	        verify(userdto).getPassword();
	    }
	}


	
}
