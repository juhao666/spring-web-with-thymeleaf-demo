package com.juhao666.apilife;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Junit5Test {

    @Test
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testParameterized(int i){
        System.out.println(i);
    }
}
