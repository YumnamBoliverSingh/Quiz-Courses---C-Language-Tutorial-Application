package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class QuizActivityOutside extends AppCompatActivity {
    CardView start_quiz_btn;
    RadioButton easyRB, mediumRB, hardRB;
    TextView high_score_tv, latests_score_tv, questions_tested_tv, correct_questions_TV;
    boolean true_or_false_if_have_given_option_for_level_easy_medium_hard;
    int high_Score;
    private ConstraintLayout cl_tutorial, cl_quiz;
    private ImageView iv_tutorial, iv_quiz, iv_tutorial_red, iv_quiz_red;
    private TextView tv_tutorial, tv_quiz;
    private TextView optionTV1, optionTV2, optionTV3;

    TextView tv_quiz_starting_in;
    ImageView backIV;

    private int option3s_indicating_levels;
    private int latest_score, highest_score, question_tested_int_inside, question_tested_int_outside, questionsCorrect_tested_int_inside, questionsCorrect_tested_int_outside;
    private TextView qc_n_tv;

    int TIME_OUT = 4500000; //90000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_outside);
        getSupportActionBar().hide();
        cl_tutorial=findViewById(R.id.Tutorial2);
        cl_quiz=findViewById(R.id.Quiz2);
        tv_tutorial=findViewById(R.id.tv_tutorial2);
        tv_quiz=findViewById(R.id.tv_quiz2);
        iv_tutorial=findViewById(R.id.iv_tutorial2);
        iv_quiz=findViewById(R.id.iv_quiz2);
        iv_tutorial_red=findViewById(R.id.iv_tutorial_red_2);
        iv_quiz_red=findViewById(R.id.iv_quiz_red_2);
        optionTV1=findViewById(R.id.quizTV1);
        optionTV2=findViewById(R.id.quizTV2);
        optionTV3=findViewById(R.id.quizTV3);

        backIV =findViewById(R.id.backQuizOutside);
        backIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivityOutside.this, MainActivity.class);
                startActivity(intent);
            }
        });

        easyRB=findViewById(R.id.quizRB1);
        mediumRB=findViewById(R.id.quizRB2);
        hardRB=findViewById(R.id.quizRB3);
        option3s_indicating_levels=0;

        high_score_tv=findViewById(R.id.tv2);
//        latests_score_tv=findViewById(R.id.tv4);
//        questions_tested_tv=findViewById(R.id.tv6);
//        correct_questions_TV=findViewById(R.id.tv8);

        tv_quiz_starting_in = findViewById(R.id.seconds_left_for_starting_quiz);
        new CountDownTimer(4500000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                long millis = (millisUntilFinished/10) % 60;
                tv_quiz_starting_in.setText(f.format(hour) + " : " + f.format(min)+" : "+ f.format(sec) );
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                tv_quiz_starting_in.setText("00 : 00 : 00");
            }
        }.start();
        //Redirecting in 1mins 30secs

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(getApplicationContext(), "Difficulty Level: Easy ..", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(QuizActivityOutside.this, QuizActivityInside.class);
                intent.putExtra("intent_level_option123", 1);
                startActivity(intent);
                finish();


            }
        },  TIME_OUT);



        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.tool_bar_read));
        }
// Latest Score
//Highest Score


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
//No of questions competed
        question_tested_int_outside = preferences.getInt("sp_qc_n_o", 0);
        question_tested_int_inside = preferences.getInt("sp_qc_n_i", 0);

        int total_completed_qs = question_tested_int_outside + question_tested_int_inside;
        editor.putInt("sp_qc_n_o", total_completed_qs);
        editor.apply();


//        questions_tested_tv.setText(String.valueOf(total_completed_qs));
//No. of questions correct
        questionsCorrect_tested_int_outside = preferences.getInt("sp_ac_n_o", 0);
        questionsCorrect_tested_int_inside = preferences.getInt("sp_ac_n_i", 0);


        int totalCorrect_completed_qs = question_tested_int_outside + question_tested_int_inside;
        editor.putInt("sp_ac_n_o", totalCorrect_completed_qs);
        editor.apply();

//        correct_questions_TV.setText(String.valueOf(totalCorrect_completed_qs));










        int val_nextori = preferences.getInt("sp_main_2_click_bottom_navigator", 22);
        latest_score=preferences.getInt("sp_latestscore", 0);
        highest_score=preferences.getInt("sp_highscore", 0);
        String high, latest;
        if(latest_score>highest_score){
            editor.putInt("sp_highscore", latest_score);
            editor.apply();
        }else{

            high = String.valueOf(highest_score);
            high_score_tv.setText(high);


        }
        latest = String.valueOf(latest_score);
//        latests_score_tv.setText(latest);

//        highest_score=preferences.getInt("sp_highscore", 0);






        if(val_nextori==22 || val_nextori==12){
            tv_quiz.setTextColor(getResources().getColor(R.color.tool_bar_read));
            tv_tutorial.setTextColor(getResources().getColor(R.color.gray_attr));

            iv_tutorial.setVisibility(View.VISIBLE);
            iv_tutorial_red.setVisibility(View.GONE);

            iv_quiz_red.setVisibility(View.VISIBLE);
            iv_quiz.setVisibility(View.GONE);
        }
        else{
            tv_quiz.setTextColor(getResources().getColor(R.color.gray_attr));
            tv_tutorial.setTextColor(getResources().getColor(R.color.tool_bar_read));

            iv_tutorial.setVisibility(View.GONE);
            iv_tutorial_red.setVisibility(View.VISIBLE);

            iv_quiz_red.setVisibility(View.GONE);
            iv_quiz.setVisibility(View.VISIBLE);
        }



        cl_tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_main_2_click_bottom_navigator",21);
                editor.apply();

                Intent intent=new Intent(QuizActivityOutside.this, MainActivity.class);
                startActivity(intent);
                tv_tutorial.setTextColor(getResources().getColor(R.color.tool_bar_read));
                tv_quiz.setTextColor(getResources().getColor(R.color.gray_attr));

                iv_tutorial.setVisibility(View.GONE);
                iv_tutorial_red.setVisibility(View.VISIBLE);

                iv_quiz_red.setVisibility(View.GONE);
                iv_quiz.setVisibility(View.VISIBLE);
            }
        });
        cl_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_main_2_click_bottom_navigator",22);
                editor.apply();

                tv_tutorial.setTextColor(getResources().getColor(R.color.gray_attr));
                tv_quiz.setTextColor(getResources().getColor(R.color.tool_bar_read));

                iv_tutorial.setVisibility(View.VISIBLE);
                iv_tutorial_red.setVisibility(View.GONE);

                iv_quiz_red.setVisibility(View.VISIBLE);
                iv_quiz.setVisibility(View.GONE);
            }
        });

        start_quiz_btn=findViewById(R.id.startQuizRealCardView);




        true_or_false_if_have_given_option_for_level_easy_medium_hard=false;


        optionTV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                true_or_false_if_have_given_option_for_level_easy_medium_hard=true;
                mediumRB.setChecked(false);
                hardRB.setChecked(false);
                easyRB.setChecked(true);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_level_option123", 1);
//                editor.apply();
                option3s_indicating_levels=1;

            }
        });
        optionTV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                true_or_false_if_have_given_option_for_level_easy_medium_hard=true;
                easyRB.setChecked(false);
                mediumRB.setChecked(true);
                hardRB.setChecked(false);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_level_option123", 2);
//                editor.apply();

                option3s_indicating_levels=2;
            }
        });
        optionTV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                true_or_false_if_have_given_option_for_level_easy_medium_hard=true;
                easyRB.setChecked(false);
                mediumRB.setChecked(false);
                hardRB.setChecked(true);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_level_option123", 3);
//                editor.apply();
                option3s_indicating_levels=3;
            }
        });


        easyRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                true_or_false_if_have_given_option_for_level_easy_medium_hard=true;
                mediumRB.setChecked(false);
                hardRB.setChecked(false);
                easyRB.setChecked(true);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_level_option123", 1);
//                editor.apply();
                option3s_indicating_levels=1;

            }
        });
        mediumRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                true_or_false_if_have_given_option_for_level_easy_medium_hard=true;
                easyRB.setChecked(false);
                mediumRB.setChecked(true);
                hardRB.setChecked(false);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_level_option123", 2);
//                editor.apply();

                option3s_indicating_levels=2;
            }
        });
        hardRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                true_or_false_if_have_given_option_for_level_easy_medium_hard=true;
                easyRB.setChecked(false);
                mediumRB.setChecked(false);
                hardRB.setChecked(true);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_level_option123", 3);
//                editor.apply();
                option3s_indicating_levels=3;
            }
        });


        start_quiz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(true_or_false_if_have_given_option_for_level_easy_medium_hard==false){
                    Toast.makeText(getApplicationContext(), "Choose a level", Toast.LENGTH_SHORT).show();
                }else{



                    Intent intent = new Intent(QuizActivityOutside.this, QuizActivityInside.class);
                    intent.putExtra("intent_level_option123", option3s_indicating_levels);
                    startActivity(intent);


                }
            }
        });


    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(QuizActivityOutside.this, MainActivity.class);
        startActivity(intent);
    }
}