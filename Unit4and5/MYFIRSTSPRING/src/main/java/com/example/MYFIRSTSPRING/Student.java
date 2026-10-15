package com.example.MYFIRSTSPRING;

public class Student {
private int SID;
private String name;
private String email;
private String branch;
private int year;
private int cgp;

Student(int SID, String name, String email, String branch, int year, int cgp) {
    this.SID = SID;
    this.name = name;
    this.email = email;
    this.branch = branch;
    this.year = year;
    this.cgp = cgp;
}

public int getSID() {
    return SID;
}

public void setSID(int SID) {
    this.SID = SID;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getBranch() {
    return branch;
}

public void setBranch(String branch) {
    this.branch = branch;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public int getCgp() {
    return cgp;
}

public void setCgp(int cgp) {
    this.cgp = cgp;
}

}
