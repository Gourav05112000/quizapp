package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        TextView t=(TextView)findViewById((R.id.textView));
        MainActivity x=new MainActivity();
        int ss=x.score;
        t.setText("score="+ss);

    }
}
