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


public class discover_fragment2 extends Fragment {

    private static discover_fragment2 instance = null;

    // Create fragment view when paginated.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_discover_assessment, container, false);

        TextView title = (TextView) v.findViewById(R.id.discoverTxt);
        title.setText(getResources().getString(R.string.DiscoverAsssessment_categoryName2));


        ImageView imageView = (ImageView) v.findViewById(R.id.discoverImg);
        imageView.setImageResource(R.drawable.image);

        TextView textView2 = (TextView) v.findViewById(R.id.describe_assessment);
        textView2.setText(getResources().getString(R.string.about_assessment));

        Button go = (Button)v.findViewById(R.id.goTo_category);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), assessment_cat1.class);
                startActivity(i);
            }
        });
        return v;
    }


    // Returns new instance.

    public static discover_fragment2 newInstance(String title , String desc , int imgID){

        if(instance == null){
            // new instance
            instance = new discover_fragment2();

            // sets data to bundle
            Bundle bundle = new Bundle();
            bundle.putString("msg", title);
            bundle.putString("msg", desc);
            bundle.putInt("1", imgID);

            // set data to fragment
            instance.setArguments(bundle);

            return instance;
        } else {

            return instance;
        }

    }
}