package com.example.basicofall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class addChild extends AppCompatActivity {

    private EditText name;
    private  EditText age;
    private Button addChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child);

        name = findViewById(R.id.editTxtName);
        age = findViewById(R.id.editTxtAge);
        addChild = findViewById(R.id.addbtn);


    }
}