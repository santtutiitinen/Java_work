package com.example.demo.StudentService;
import com.example.demo.MyDataClass.student;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<student> students = new ArrayList<>();

    public void addStudent(student member){
        students.add(member);
        
    }
    public List<student> getStudents(){
        return new ArrayList<>(students);
    }
}