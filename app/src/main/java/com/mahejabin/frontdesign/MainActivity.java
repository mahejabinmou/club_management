package com.mahejabin.frontdesign;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private CardView Teacher;
    private CardView Students;
    private CardView Alumni;
    private CardView Events;
    private ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Teacher=(CardView) findViewById(R.id.t_teacher);
        Students=(CardView) findViewById(R.id.s_student);
        Alumni=(CardView) findViewById(R.id.a_alumni);
        Events=(CardView) findViewById(R.id.e_events);
        Image=(ImageView) findViewById(R.id.iv_image);
        Picasso.get().load("https://theworldofborealis.com/wp-content/uploads/2019/10/land-of-the-northern-lights-960x1149.jpg").into(Image);

    Teacher.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent Te= new Intent(MainActivity.this,TeacherActivity.class);
            startActivity(Te);

        }


    });

    Students.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent st= new Intent(MainActivity.this,StudentActivity.class);
            startActivity(st);
        }
    });

    Alumni.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent Al = new Intent(MainActivity.this,AlumniActivity.class);
            startActivity(Al);

        }
    });

    Events.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent Ev = new Intent(MainActivity.this,EventsActivity.class);
            startActivity(Ev);

        }
    });





    }
}