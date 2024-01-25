package com.adarsh.SpringJdbcExample;

import com.adarsh.SpringJdbcExample.model.Student;
import com.adarsh.SpringJdbcExample.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExampleApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJdbcExampleApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(104);
        s.setName("Max");
        s.setMarks(56);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students = service.getStudents();
        System.out.println(students);

    }

}
