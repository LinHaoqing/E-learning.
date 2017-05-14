package com.zjgsu.linhaoqing.e_learning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/5/14.
 */


    public class TeacherAdapter extends ArrayAdapter<MainActivity.Teacher> {
        private int resourceId;
        public TeacherAdapter(Context context, int textViewResourceId, List<MainActivity.Teacher> objects){
            super(context,textViewResourceId,objects);
            resourceId = textViewResourceId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            MainActivity.Teacher Teacher = getItem(position);
            View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            ImageView TeacherImage = (ImageView) view.findViewById(R.id.Teacher_image);
            TextView TeacherName = (TextView) view.findViewById(R.id.Teacher_name);
            TeacherImage.setImageResource(Teacher.getImageId());
            TeacherName.setText(Teacher.getName());
            return view;

        }

    }


