package com.example.basicofall;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "test";
    private ListView listView;
    private Button addchild;
    private Context context;
    private DBhandler db;
    private List<childModel> children;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "onCreate");
        listView = findViewById(R.id.teiList);
        addchild = findViewById(R.id.addChild);

        context = this;
        db = new DBhandler(context);

        // Get all children
        children = new ArrayList<>();
        children = db.getAllChildren();


        addchild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, addChild.class));

            }
        });

        childrenAdapter adapter = new childrenAdapter(context, R.layout.single_tei, children);
        listView.setAdapter(adapter);

        Toast t = Toast.makeText(this, String.valueOf(db.countTEI()), Toast.LENGTH_LONG);
        t.show();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                childModel c = children.get(i);
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(c.getNAME_CHILD());
                builder.setMessage(c.getDOB());


                builder.setPositiveButton("Finished", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(context, Main2Activity.class));

                    }
                });

                builder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        db.deleteChild(c.getID());
                        startActivity(new Intent(context, Main2Activity.class));

                    }
                });

                builder.setNeutralButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(context, editChild.class);
                        intent.putExtra("id", String.valueOf(c.getID()) );
                        startActivity(intent);
                    }
                });

                builder.show();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume");
    }


}