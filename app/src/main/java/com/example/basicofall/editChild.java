package com.example.basicofall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editChild extends AppCompatActivity {
    private EditText name;
    private  EditText age;
    private Button addChild;
    private Context context;
    private DBhandler dBhandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_child);

        name = findViewById(R.id.editTxtNameEdit);
        age = findViewById(R.id.edittxtDOB);
        addChild = findViewById(R.id.addbtnEdit);

        final int ID = Integer.parseInt( getIntent().getStringExtra("id") );

        context = this;
        dBhandler = new DBhandler(context);
        childModel c = dBhandler.getChild(ID);

        name.setText(c.getNAME_CHILD());
        age.setText(c.getDOB());


        addChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edited_name = name.getText().toString();
                String edited_age = age.getText().toString();

                childModel editedChild = new childModel();
                editedChild.setID(ID);
                editedChild.setDOB(edited_age);
                editedChild.setNAME_CHILD(edited_name);

                int status = dBhandler.updateChild(editedChild);
                System.out.println(status);
                startActivity(new Intent(context, Main2Activity.class));
            }
        });
    }
}