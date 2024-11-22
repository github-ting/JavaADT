/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

public class Student implements Serializable {
    private int stdID;
    private String stdName;
    private static int nextId = 1015;
    private int grpNo;

    public Student() {
    }

    public Student(String stdName) {
        this.stdName = stdName;
        this.stdID = nextId++;
    }

    public Student(int grpNo, int stdID, String stdName) {
        this.grpNo = grpNo;
        this.stdID = stdID;
        this.stdName = stdName;
    }

    public Student(int stdID, String stdName) {
        this.stdID = stdID;
        this.stdName = stdName;
    }

    public int getGrpNo() {
        return grpNo;
    }

    public void setGrpNo(int grpNo) {
        this.grpNo = grpNo;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }    

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }
    
}
