package com.example.videorun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.videorun.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

//        Student student = new Student("Ali",1);
//        String json = gson.toJson(student);

      String json  = "{\"nameOfStudent\":\"Ali\" \"rollOfStudent\":10\"}";
      Student  student = gson.fromJson(json, Student.class);

    }
}
