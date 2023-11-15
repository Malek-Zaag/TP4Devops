package com.example.tp4;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Data
@AllArgsConstructor
class Tp4ApplicationTests {
    //    @MockBean
//    private final Student student;
//    @InjectMocks
//    private final StudentService studentService;


    @Test
    public void test() {

        assertEquals("hello world", "t");
    }

}
