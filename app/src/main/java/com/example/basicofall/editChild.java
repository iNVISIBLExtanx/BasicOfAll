package com.example.basicofall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editChild extends AppCompatActivity {
    private EditText name;
    private  EditText age;
    private Button addChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_child);

        name = findViewById(R.id.editTxtNameEdit);
        age = findViewById(R.id.edittxtDOB);
        addChild = findViewById(R.id.addbtnEdit);
    }
}