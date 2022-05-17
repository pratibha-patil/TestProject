package com.junit.demo.tests;

import com.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    Student s=new Student("Joe","blow");
    @Test
    void testFname()
    {
        Assertions.assertEquals("Joe",s.getFName());
    }
    @Test
    void testLname()
    {
        Assertions.assertEquals("blow",s.getLName());
    }
}
