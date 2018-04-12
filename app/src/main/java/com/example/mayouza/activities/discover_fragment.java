package com.example.mayouza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class discover_fragment extends Fragment  {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_discover_assessment, null);

        TextView textView1 = (TextView) v.findViewById(R.id.discoverTxt);
        textView1.setText("first assessment");

        ImageView imageView = (ImageView) v.findViewById(R.id.discoverImg);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.image));

        TextView textView2 = (TextView) v.findViewById(R.id.describe_assessment);
        textView2.setText("here we have description about the assessment");

        return v;
    }
}
