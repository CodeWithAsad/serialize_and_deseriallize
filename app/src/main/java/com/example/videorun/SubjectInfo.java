package com.example.videorun;

import com.google.gson.annotations.SerializedName;

public class SubjectInfo {

    @SerializedName("name")
    private String subjectName;

    @SerializedName("credit")
    private int creditHours;

    public SubjectInfo(String subjectName, int creditHours) {
        this.subjectName = subjectName;
        this.creditHours = creditHours;
    }
}
