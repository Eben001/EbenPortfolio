package com.ebenezer.gana.ebenportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

import com.ebenezer.gana.ebenportfolio.controller.PopTransformation;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ViewPager viewPager;
    private PagerAdapter adapter;
    private TabLayout tabs;
    private CardView cvGetInTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabs= findViewById(R.id.tabLayout);
        cvGetInTouch = findViewById(R.id.cvGetInTouch);

        adapter = new com.ebenezer.gana.ebenportfolio.controller.PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new PopTransformation());
        
        tabs.setupWithViewPager(viewPager);

        tabs.setTabTextColors(Color.CYAN, Color.parseColor("white"));

        cvGetInTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: called");
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" +getString(R.string.phoneNumber)));
                startActivity(intent);

                /*




                 */

            }
        });








    }
}