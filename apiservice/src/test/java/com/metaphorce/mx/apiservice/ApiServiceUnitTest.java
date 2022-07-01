package com.metaphorce.mx.apiservice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.metaphorce.mx.entity.Employee;
import com.metaphorce.mx.service.EmployeeServiceImpl;

@SpringBootTest
public class ApiServiceUnitTest {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Test
    public void test() {
        List<Employee> books = employeeService.getEmployees();
        System.out.println(books.toString());
               
    }
}