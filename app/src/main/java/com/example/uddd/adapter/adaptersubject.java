package com.example.uddd.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.deitel.qlsv.R;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class adaptersubject extends BaseAdapter {
    private  ActivitySubject context;
    private ArrayList<Subject> ArrayListSubject;

    public adaptersubject(ArrayList<Subject> arrayListSubject) {
        this.context = context;
        ArrayListSubject = arrayListSubject;
    }



    @Override
    public int getCount() {
        return ArrayListSubject.size();
    }

    @Override
    public Object getItem(int position) {
        return ActivitySubject.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflater(R.layout.listsubject,null);
        TextView TextViewSubjectTitle = convertView.findViewById(R.id.TextViewSubjectTitle);
        TextView TextViewCredit = convertView.findViewById(R.id.TextViewCredit);
        ImageButton imageDelete = convertView.findViewById(R.id.subjectdelete);
        ImageButton imageInformation = convertView.findViewById(R.id.subjectinformation);
        ImageButton imageUpdate = convertView.findViewById(R.id.subjectupdate)
        Subject subject = ArrayListSubject.get(i);
        TextViewCredit.setText(subject.getNumber_of_credits());
        TextViewSubjectTitle.setText(subject.getSubject_title());

        int id = subject.getId();
        imageInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
