package tns.college.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="college18")

public class College {

@Id
@GeneratedValue
long id;
String collegeadmin;
String collegename;
String location; 
public College() {
super();
// TODO Auto-generated constructor stub
}
public College(long id,String collegeadmin,String collegename,String location) {
super();
this.id = id;
this.collegeadmin = collegeadmin;
this.collegename = collegename;
this.location = location;
}
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}
public String getCollegeadmin() {
return collegeadmin;
}
public void setCollegeadmin(String collegeadmin) {
this.collegeadmin = collegeadmin;
}
public String getCollegename() {
return collegename;
}
public void setCollegename(String collegename) {
this.collegename = collegename;
}
public String getLocation() {
return location;
}
public void setLocation(String location) {
this.location = location;
}
}