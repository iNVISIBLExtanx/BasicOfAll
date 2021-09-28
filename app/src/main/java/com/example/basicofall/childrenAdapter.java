package com.example.basicofall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class childrenAdapter extends ArrayAdapter<childModel> {
    private Context context;
    private int resource;
    private List<childModel> children;

    childrenAdapter(Context context, int resource, List<childModel> children){
        super(context, resource, children);
        this.context = context;
        this.resource = resource;
        this.children = children;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(resource, parent, false);

        TextView name = row.findViewById(R.id.nameTxt);
        TextView age = row.findViewById(R.id.ageTxt);

        childModel c = children.get(position);
        name.setText(c.getNAME_CHILD());
        age.setText(c.getDOB());

        return row;
    }
}
