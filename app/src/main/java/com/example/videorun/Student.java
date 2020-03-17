package com.example.videorun;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("name")
    private String nameOfStudent;
    @SerializedName("roll")
    private int rollOfStudent;

    public Student(String nameOfStudent, int rollOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.rollOfStudent = rollOfStudent;
    }



  }

