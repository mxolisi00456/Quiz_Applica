

package com.example.admin.quizapplica;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main4);

        tvDisplay = (TextView) findViewById(R.id.displayR);

        rgOne = (RadioGroup) findViewById(R.id.radioGroup1);
        rgTwo= (RadioGroup) findViewById(R.id.radioGroup2);
        rgThree= (RadioGroup) findViewById(R.id.radioGroup3);
        rgFour= (RadioGroup) findViewById(R.id.radioGroup4);
        rgfive= (RadioGroup) findViewById(R.id.radioGroup5);
        // rgOne.setOnClickListener(this);

        rgOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioP) {
                    //do work when radioButton1 is active
                    score = 3;
                } else
                    score = 0;
            }

        });



        rgTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioU) {
                    //do work when radioButton1 is active
                    score2 = 3;
                } else
                    score2 = 0;
            }

        });

        rgThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioV) {
                    //do work when radioButton1 is active
                    score3 = 3;
                } else
                    score3 = 0;
            }

        });

        rgFour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioY) {
                    //do work when radioButton1 is active
                    score4 = 3;
                } else
                    score4 = 0;
            }

        });


        rgfive.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioBB) {
                    //do work when radioButton1 is active
                    score5= 3;
                } else
                    score5 = 0;
            }

        });

    }



    public void scoreR(View view) {

        totalscore=  score + score2 + score3 + score4 +score5 ;
        if (totalscore<9) {
            tvDisplay.setText("Your total score = " + totalscore + " you didnt make it!!!");
        }
        else  if (totalscore == 9){
            tvDisplay.setText("Your total score = " + totalscore + " You made it");
        }
        else {
            tvDisplay.setText("Your total score = " + totalscore + " Excellent");
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