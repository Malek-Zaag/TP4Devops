package com.example.tp4;


import com.example.tp4.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentServiceTest {

    @Mock
    private StudentService studentService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testCheckEmailMethod() {
        Mockito.when(studentService.checkEmail("zaag.malek1@gmail.com")).thenReturn(true);
        assertEquals(studentService.checkEmail("zaag.malek1@gmail.com"), true);
    }

    @Test
    public void testCheckFirstnameMethod() {
        Mockito.when(studentService.checkFirstname("MK")).thenReturn(false);
        assertEquals(studentService.checkFirstname("MK"), false);
    }
}
