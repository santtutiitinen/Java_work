package com.example.demo.MyDataClass;

public class student {
    private String fname;
    private String lname;
    private String course;
    private String teacher;
    private String room; 

    public student (String fname, String lname,String course,
     String teacher, String room ){
         this.fname = fname;
         this.lname = lname;
         this.course = course;
         this.teacher = teacher;
         this.room = room;
    }

    public String getFname(){
        return this.fname;
    }
    public void setFname(String fname){
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    
}
