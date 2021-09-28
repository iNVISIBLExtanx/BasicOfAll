package com.example.basicofall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class addChild extends AppCompatActivity {

    private EditText name;
    private  EditText dob;
    private Button addChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child);

        name = findViewById(R.id.editTxtName);
        dob = findViewById(R.id.txtDOB);
        addChild = findViewById(R.id.addbtn);

        Context context = this;
        DBhandler db = new DBhandler(context);
        
        addChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string_name = name.getText().toString();
                String doB = dob.getText().toString();

                childModel c = new childModel(string_name, doB);
                db.addNewChild(c);

                // back to the main ui
                startActivity(new Intent(context, Main2Activity.class));

            }
        });

    }
}