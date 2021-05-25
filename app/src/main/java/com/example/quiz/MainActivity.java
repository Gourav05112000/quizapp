package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button a1,a2,a3,a4;
TextView q,sc;
private question que=new question();
private String ans;
private int s;
private int length=que.s.length ;
public int score;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // r=new Random();


        a1=(Button) findViewById((R.id.button));
        a2=(Button) findViewById((R.id.button2));
        a3=(Button) findViewById((R.id.button3));
        a4=(Button) findViewById((R.id.button4));

        q=(TextView) findViewById((R.id.textView3));
        sc=(TextView) findViewById((R.id.textView5));
        sc.setText("score="+score);
        update(i++);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1.getText()==ans){
                score++;
                    sc.setText("score="+score);}
                update(i++);

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a2.getText()==ans){
                    score++;
                    sc.setText("score="+score);}
                    update(i++);

            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a3.getText()==ans){
                    score++;
                    sc.setText("score="+score);}
                    update(i++);


            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a4.getText()==ans){
                    score++;
                    sc.setText("score="+score);}
                    update(i++);

            }
        });

    }
    private void update(int n){
        if(n==10){
            update((n-1));
            sc.setText("score="+score);

        }
else{
        a1.setText(que.getc1(n));
        a2.setText(que.getc2(n));
        q.setText(que.getq(n));
        a3.setText(que.getc3(n));
        a4.setText(que.getc4(n));
        ans=que.answer(n);}
    }
    public int ss(){
        return score;
    }
}
