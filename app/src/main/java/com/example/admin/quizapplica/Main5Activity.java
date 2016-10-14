package com.example.admin.quizapplica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    //RadioButton rbtrue,rbfalse;
    private RadioGroup rgOne;
    private RadioGroup rgTwo;
    private RadioGroup rgThree;
    private RadioGroup rgFour;
    private RadioGroup rgfive;

    int score;
    int score2;
    int score3;
    int score4;
    int score5;
    int totalscore;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tvDisplay = (TextView) findViewById(R.id.displayQ);

        rgOne = (RadioGroup) findViewById(R.id.radioGroup1);
        rgTwo= (RadioGroup) findViewById(R.id.radioGroup140);
        rgThree= (RadioGroup) findViewById(R.id.radioGroup1400);
        rgFour= (RadioGroup) findViewById(R.id.radioGroup14000);
        rgfive= (RadioGroup) findViewById(R.id.radioGroup1400000);
       // rgOne.setOnClickListener(this);

      rgOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioEE) {
                    //do work when radioButton1 is active
                    score = 3;
                } else
                    score = 0;
                }

        });



        rgTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioII) {
                    //do work when radioButton1 is active
                    score2 = 3;
                } else
                    score2 = 0;
            }

        });

        rgThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioKK) {
                    //do work when radioButton1 is active
                    score3 = 3;
                } else
                    score3 = 0;
            }

        });

        rgFour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioNON) {
                    //do work when radioButton1 is active
                    score4 = 3;
                } else
                    score4 = 0;
            }

        });


    rgfive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

            if (checkedId == R.id.radioRR) {
                //do work when radioButton1 is active
                score5= 3;
            } else
                score5 = 0;
        }

    });

}



    public void scoreQ(View view) {

        totalscore=  score + score2 + score3 + score4 +score5 ;
            if (totalscore<9) {
                tvDisplay.setText("Your total score = " + totalscore + " you didnt make it!!!");
            }
        else  if (totalscore == 9){
                tvDisplay.setText("Your tatal score = " + totalscore + " You made it");
            }
        else {
                tvDisplay.setText("Your tatal score = " + totalscore + " Excellent");
            }
    }


   // @Override
    /*  public void onClick(View v) {
        switch (R.id.radioGroup1)
        {
            case R.id.radioEE:
                score = 3;
                break;
        }

    }*/
}