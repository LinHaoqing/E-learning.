package com.zjgsu.linhaoqing.e_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTeachers();
        TeacherAdapter adapter = new TeacherAdapter(MainActivity.this, R.layout.teacher_item, teacherList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter((ListAdapter) adapter);
    }
    private  void initTeachers(){
        for (int i =0;i<2;i++){
            Teacher huanglaoshi = new Teacher("黄老师",R.drawable.teacher1);
            teacherList.add(huanglaoshi);
            Teacher jinlaoshi = new Teacher("金老师",R.drawable.teacher2);
            teacherList.add(jinlaoshi);
            Teacher wanglaoshi = new Teacher("王老师",R.drawable.teacher3);
            teacherList.add(wanglaoshi);
            Teacher xulaoshi = new Teacher("徐老师",R.drawable.teacher4);
            teacherList.add(xulaoshi);

        }
    }

    public class Teacher {
        private String name;
        private int imageId;
        public Teacher(String name,int imageId){
            this.name = name;
            this.imageId = imageId;
        }
        public String getName(){
            return name;
        }
        public int getImageId(){
            return imageId;
        }
    }
    }
