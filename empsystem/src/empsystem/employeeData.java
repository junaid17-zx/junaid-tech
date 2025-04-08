/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemaaa;

import java.sql.Date;

/**
 *
 * @author junai
 */
public class employeeData {
    
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNum;
    private String position;
    private String image;
    private Date date;
    private Double salary;
    private String attendance;
    private Double fine;
    
//    public employeeData(int employeeId, String firstName, String lastName, String gender, String phoneNum, String position, String image, Date date, int attendance){
//        this.employeeId = employeeId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.phoneNum = phoneNum;
//        this.position = position;
//        this.image = image;
//        this.date = date;
//        this.attendance = attendance;
//    }
    
    public employeeData(Integer employeeId, String firstName, String lastName,String position, Double salary, Double fine){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.fine = fine;
    
}

    public employeeData(Integer employeeId, String firstName, String lastName, String gender, String phoneNum, String position, String image, Date date, String attendance) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.position = position;
        this.image = image;
        this.date = date;
        this.attendance = attendance;
    }

    
    public Integer getEmployeeId(){
        return employeeId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNum(){
        return phoneNum;
    }    
    public String getPosition(){
        return position;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
    public Double getSalary(){
        return salary;
    }
    public String getAttendance(){
        return attendance;
    }
    public Double getFine(){
        return fine;
    }
}
