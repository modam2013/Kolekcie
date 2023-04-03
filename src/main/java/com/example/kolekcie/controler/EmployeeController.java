package com.example.kolekcie.controler;

import com.example.kolekcie.model.Employee;
import com.example.kolekcie.servis.EmployeeServis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServis employeeServis;

    public EmployeeController(EmployeeServis employeeServis) {
        this.employeeServis = employeeServis;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String firsName,@RequestParam String lestName){
        return employeeServis.add(firsName,lestName);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String firsName,@RequestParam String lestName){
        return employeeServis.add(firsName,lestName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String firsName,@RequestParam String lestName){
        return employeeServis.add(firsName,lestName);
    }
    @GetMapping
    public List<Employee>list(){
        return employeeServis.list();
    }

}
