package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class QuizActivityInside extends AppCompatActivity {
    private TextView tv_question, tv_option1, tv_option2, tv_option3, tv_option4;
    private Button btn_confirm, btn_next;
    private RadioButton rb_option1, rb_option2, rb_option3, rb_option4;
    private int score;
    private int level123;
    private int n;
    private ImageView backBtnonTheTop;
    private int eooof4;
    private TextView levelTV, scoreTV;
    private  String scorez, levelz;

    private TextView marks_scheme_tv;
    private TextView completeAns_tv, correctAns_tv;
    private int completedAns/* replaced with "n", So no need to use this "completedAns" variable */, correctAns;

    private TextView countdown_tv;
    int TIME_OUT = 90000; //90000;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_inside);
        getSupportActionBar().hide();
        eooof4=0;
        n=1;
        correctAns=0;

        Toast.makeText(getApplicationContext(), "Quiz Started!!", Toast.LENGTH_SHORT).show();

        tv_question=findViewById(R.id.textViewQuizQuestion);
        tv_option1=findViewById(R.id.quizinsideTV1);
        tv_option2=findViewById(R.id.quizinsideTV2);
        tv_option3=findViewById(R.id.quizinsideTV3);
        tv_option4=findViewById(R.id.quizinsideTV4);

        rb_option1=findViewById(R.id.quizinsideRB1);
        rb_option2=findViewById(R.id.quizinsideRB2);
        rb_option3=findViewById(R.id.quizinsideRB3);
        rb_option4=findViewById(R.id.quizinsideRB4);

        btn_confirm=findViewById(R.id.buttonConfirmFinishQuiz);
        btn_next=findViewById(R.id.buttonNextFinishQuiz);

        btn_confirm.setVisibility(View.VISIBLE);
        btn_next.setVisibility(View.GONE);
        levelTV=findViewById(R.id.levelQuizInside);
        scoreTV=findViewById(R.id.scoreQuizInside);
        backBtnonTheTop = findViewById(R.id.backQuizInside);

        marks_scheme_tv=findViewById(R.id.mpk_n_tv);
        completeAns_tv=findViewById(R.id.qc_n_tv);
        correctAns_tv=findViewById(R.id.ac_n_tv);

        countdown_tv=findViewById(R.id.tvCountDown);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putInt("sp_qc_n_i", 0);
        editor.putInt("sp_ac_n_i", 0);
        editor.apply();

        backBtnonTheTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogBoxQuitQuiz();
            }

        });
        Bundle extras = getIntent().getExtras();
        level123 = extras.getInt("intent_level_option123");
        score = 0;
        levelz = String.valueOf(level123);
        if(level123==1){
            levelTV.setText("Easy");
            marks_scheme_tv.setText("3/1Q");
        }
        if(level123==2){
            levelTV.setText("Medium");
            marks_scheme_tv.setText("5/1Q");

        }
        if(level123==3){
            levelTV.setText("Hard");
            marks_scheme_tv.setText("10/1Q");

        }

//        level123 = preferences.getInt("", 1);
//        int latest_score = preferences.getInt("sp_latestscore", 0);
//        int highest_score = preferences.getInt("sp_highscore", 0);


//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_latestscore", 3);
//                editor.putInt("sp_highscore", 4);
//                editor.apply();



//1st round.. set the question and the 4 options for the 1st round
        if(level123==1){
            tv_question.setText(R.string.question_easy1);
            tv_option1.setText(R.string.Eoption1_1);
            tv_option2.setText(R.string.Eoption2_1);
            tv_option3.setText(R.string.Eoption3_1);
            tv_option4.setText(R.string.Eoption4_1);

        }
        if(level123==2){
            tv_question.setText(R.string.question_medium1);
            tv_option1.setText(R.string.Moption1_1);
            tv_option2.setText(R.string.Moption2_1);
            tv_option3.setText(R.string.Moption3_1);
            tv_option4.setText(R.string.Moption4_1);
        }
        if(level123==3){
            tv_question.setText(R.string.question_hard1);
            tv_option1.setText(R.string.Hoption1_1);
            tv_option2.setText(R.string.Hoption2_1);
            tv_option3.setText(R.string.Hoption3_1);
            tv_option4.setText(R.string.Hoption4_1);
        }

        rb_option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eooof4=1;
                rb_option1.setChecked(true);
                rb_option2.setChecked(false);
                rb_option4.setChecked(false);
                rb_option3.setChecked(false);

                tv_option1.setTextColor(getResources().getColor(R.color.red));
                tv_option2.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option3.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option4.setTextColor(getResources().getColor(R.color.gray_text_normal));
            }
        });
        rb_option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eooof4=2;
                rb_option1.setChecked(false);
                rb_option2.setChecked(true);
                rb_option4.setChecked(false);
                rb_option3.setChecked(false);

                tv_option1.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option2.setTextColor(getResources().getColor(R.color.red));
                tv_option3.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option4.setTextColor(getResources().getColor(R.color.gray_text_normal));
            }
        });
        rb_option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eooof4=3;
                rb_option1.setChecked(false);
                rb_option2.setChecked(false);
                rb_option3.setChecked(true);
                rb_option4.setChecked(false);

                tv_option1.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option2.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option3.setTextColor(getResources().getColor(R.color.red));
                tv_option4.setTextColor(getResources().getColor(R.color.gray_text_normal));
            }
        });
        rb_option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eooof4=4;
                rb_option1.setChecked(false);
                rb_option2.setChecked(false);
                rb_option4.setChecked(true);
                rb_option3.setChecked(false);

                tv_option1.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option2.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option3.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option4.setTextColor(getResources().getColor(R.color.red));
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //increase question number
                n=n+1;

                String copltd_ans_string = String.valueOf(n);
                completeAns_tv.setText(copltd_ans_string);
                editor.putInt("sp_qc_n_i", n);
                editor.apply();


                btn_next.setVisibility(View.GONE);
                btn_confirm.setVisibility(View.VISIBLE);

                eooof4=0;
                rb_option1.setChecked(false);
                rb_option2.setChecked(false);
                rb_option3.setChecked(false);
                rb_option4.setChecked(false);

//Setting Question, option1, option2, option3, option4.. the below




//Start of the Quiz Program:  Setting of the TextView(s)........... QUESTION & 4-OPTIONS
                if(level123==1){
                    switch(n){

                        case 2:
                        {
                            tv_question.setText(R.string.question_easy2);
                            tv_option1.setText(R.string.Eoption1_2);
                            tv_option2.setText(R.string.Eoption2_2);
                            tv_option3.setText(R.string.Eoption3_2);
                            tv_option4.setText(R.string.Eoption4_2);
                            break;
                        }
                        case 3:
                        {
                            tv_question.setText(R.string.question_easy3);
                            tv_option1.setText(R.string.Eoption1_3);
                            tv_option2.setText(R.string.Eoption2_3);
                            tv_option3.setText(R.string.Eoption3_3);
                            tv_option4.setText(R.string.Eoption4_3);
                            break;
                        }
                        case 4:
                        {
                            tv_question.setText(R.string.question_easy4);
                            tv_option1.setText(R.string.Eoption1_4);
                            tv_option2.setText(R.string.Eoption2_4);
                            tv_option3.setText(R.string.Eoption3_4);
                            tv_option4.setText(R.string.Eoption4_4);
                            break;
                        }
                        case 5:
                        {
                            tv_question.setText(R.string.question_easy5);
                            tv_option1.setText(R.string.Eoption1_5);
                            tv_option2.setText(R.string.Eoption2_5);
                            tv_option3.setText(R.string.Eoption3_5);
                            tv_option4.setText(R.string.Eoption4_5);
                            break;
                        }
                        case 6:
                        {
                            tv_question.setText(R.string.question_easy6);
                            tv_option1.setText(R.string.Eoption1_6);
                            tv_option2.setText(R.string.Eoption2_6);
                            tv_option3.setText(R.string.Eoption3_6);
                            tv_option4.setText(R.string.Eoption4_6);
                            break;
                        }
                        case 7:
                        {
                            tv_question.setText(R.string.question_easy7);
                            tv_option1.setText(R.string.Eoption1_7);
                            tv_option2.setText(R.string.Eoption2_7);
                            tv_option3.setText(R.string.Eoption3_7);
                            tv_option4.setText(R.string.Eoption4_7);
                            break;
                        }
                        case 8:
                        {
                            tv_question.setText(R.string.question_easy8);
                            tv_option1.setText(R.string.Eoption1_8);
                            tv_option2.setText(R.string.Eoption2_8);
                            tv_option3.setText(R.string.Eoption3_8);
                            tv_option4.setText(R.string.Eoption4_8);
                            break;
                        }
                        case 9:
                        {
                            tv_question.setText(R.string.question_easy9);
                            tv_option1.setText(R.string.Eoption1_9);
                            tv_option2.setText(R.string.Eoption2_9);
                            tv_option3.setText(R.string.Eoption3_9);
                            tv_option4.setText(R.string.Eoption4_9);
                            break;
                        }
                        case 10:
                        {
                            tv_question.setText(R.string.question_easy10);
                            tv_option1.setText(R.string.Eoption1_10);
                            tv_option2.setText(R.string.Eoption2_10);
                            tv_option3.setText(R.string.Eoption3_10);
                            tv_option4.setText(R.string.Eoption4_10);
                            break;
                        }
                        case 11:
                        {
                            tv_question.setText(R.string.question_easy11);
                            tv_option1.setText(R.string.Eoption1_11);
                            tv_option2.setText(R.string.Eoption2_11);
                            tv_option3.setText(R.string.Eoption3_11);
                            tv_option4.setText(R.string.Eoption4_11);
                            break;
                        }
                        case 12:
                        {
                            tv_question.setText(R.string.question_easy12);
                            tv_option1.setText(R.string.Eoption1_12);
                            tv_option2.setText(R.string.Eoption2_12);
                            tv_option3.setText(R.string.Eoption3_12);
                            tv_option4.setText(R.string.Eoption4_12);
                            break;
                        }
                        case 13:
                        {
                            tv_question.setText(R.string.question_easy13);
                            tv_option1.setText(R.string.Eoption1_13);
                            tv_option2.setText(R.string.Eoption2_13);
                            tv_option3.setText(R.string.Eoption3_13);
                            tv_option4.setText(R.string.Eoption4_13);
                            break;
                        }
                        case 14:
                        {
                            tv_question.setText(R.string.question_easy14);
                            tv_option1.setText(R.string.Eoption1_14);
                            tv_option2.setText(R.string.Eoption2_14);
                            tv_option3.setText(R.string.Eoption3_14);
                            tv_option4.setText(R.string.Eoption4_14);
                            break;
                        }
                        case 15:
                        {
                            tv_question.setText(R.string.question_easy15);
                            tv_option1.setText(R.string.Eoption1_15);
                            tv_option2.setText(R.string.Eoption2_15);
                            tv_option3.setText(R.string.Eoption3_15);
                            tv_option4.setText(R.string.Eoption4_15);
                            break;
                        }
                        case 16:
                        {
                            tv_question.setText(R.string.question_easy16);
                            tv_option1.setText(R.string.Eoption1_16);
                            tv_option2.setText(R.string.Eoption2_16);
                            tv_option3.setText(R.string.Eoption3_16);
                            tv_option4.setText(R.string.Eoption4_16);
                            break;
                        }
                        case 17:
                        {
                            tv_question.setText(R.string.question_easy17);
                            tv_option1.setText(R.string.Eoption1_17);
                            tv_option2.setText(R.string.Eoption2_17);
                            tv_option3.setText(R.string.Eoption3_17);
                            tv_option4.setText(R.string.Eoption4_17);
                            break;
                        }
                        case 18:
                        {
                            tv_question.setText(R.string.question_easy18);
                            tv_option1.setText(R.string.Eoption1_18);
                            tv_option2.setText(R.string.Eoption2_18);
                            tv_option3.setText(R.string.Eoption3_18);
                            tv_option4.setText(R.string.Eoption4_18);
                            break;
                        }
                        case 19:
                        {
                            tv_question.setText(R.string.question_easy19);
                            tv_option1.setText(R.string.Eoption1_19);
                            tv_option2.setText(R.string.Eoption2_19);
                            tv_option3.setText(R.string.Eoption3_19);
                            tv_option4.setText(R.string.Eoption4_19);
                            break;
                        }
                        case 20:
                        {
                            tv_question.setText(R.string.question_easy20);
                            tv_option1.setText(R.string.Eoption1_20);
                            tv_option2.setText(R.string.Eoption2_20);
                            tv_option3.setText(R.string.Eoption3_20);
                            tv_option4.setText(R.string.Eoption4_20);
                            break;
                        }
                        case 21:
                        {
                            tv_question.setText(R.string.question_easy21);
                            tv_option1.setText(R.string.Eoption1_21);
                            tv_option2.setText(R.string.Eoption2_21);
                            tv_option3.setText(R.string.Eoption3_21);
                            tv_option4.setText(R.string.Eoption4_21);
                            break;
                        }
                        case 22:
                        {
                            tv_question.setText(R.string.question_easy22);
                            tv_option1.setText(R.string.Eoption1_22);
                            tv_option2.setText(R.string.Eoption2_22);
                            tv_option3.setText(R.string.Eoption3_22);
                            tv_option4.setText(R.string.Eoption4_22);
                            break;
                        }
                        case 23:
                        {
                            tv_question.setText(R.string.question_easy23);
                            tv_option1.setText(R.string.Eoption1_23);
                            tv_option2.setText(R.string.Eoption2_23);
                            tv_option3.setText(R.string.Eoption3_23);
                            tv_option4.setText(R.string.Eoption4_23);
                            break;
                        }
                        case 24:
                        {
                            tv_question.setText(R.string.question_easy24);
                            tv_option1.setText(R.string.Eoption1_24);
                            tv_option2.setText(R.string.Eoption2_24);
                            tv_option3.setText(R.string.Eoption3_24);
                            tv_option4.setText(R.string.Eoption4_24);
                            break;
                        }
                        case 25:
                        {
                            tv_question.setText(R.string.question_easy25);
                            tv_option1.setText(R.string.Eoption1_25);
                            tv_option2.setText(R.string.Eoption2_25);
                            tv_option3.setText(R.string.Eoption3_25);
                            tv_option4.setText(R.string.Eoption4_25);
                            completedAns = n;
                            editor.putInt("sp_qc_n_i", completedAns);
                            editor.apply();
                            break;
                        }
                        case 26:{
                            // Get instance of Vibrator from current Context
                            android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            // Vibrate for 400 milliseconds
                            v.vibrate(1200);
                            Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                            startActivity(intent);
                        }
                    }
                }//end of if(level==1)
                if(level123==2){
                    switch(n){


                        case 2:
                        {
                            tv_question.setText(R.string.question_medium2);
                            tv_option1.setText(R.string.Moption1_2);
                            tv_option2.setText(R.string.Moption2_2);
                            tv_option3.setText(R.string.Moption3_2);
                            tv_option4.setText(R.string.Moption4_2);break;
                        }
                        case 3:
                        {
                            tv_question.setText(R.string.question_medium3);
                            tv_option1.setText(R.string.Moption1_3);
                            tv_option2.setText(R.string.Moption2_3);
                            tv_option3.setText(R.string.Moption3_3);
                            tv_option4.setText(R.string.Moption4_3);break;
                        }
                        case 4:
                        {
                            tv_question.setText(R.string.question_medium4);
                            tv_option1.setText(R.string.Moption1_4);
                            tv_option2.setText(R.string.Moption2_4);
                            tv_option3.setText(R.string.Moption3_4);
                            tv_option4.setText(R.string.Moption4_4);break;
                        }
                        case 5:
                        {
                            tv_question.setText(R.string.question_medium5);
                            tv_option1.setText(R.string.Moption1_5);
                            tv_option2.setText(R.string.Moption2_5);
                            tv_option3.setText(R.string.Moption3_5);
                            tv_option4.setText(R.string.Moption4_5);break;
                        }
                        case 6:
                        {
                            tv_question.setText(R.string.question_medium6);
                            tv_option1.setText(R.string.Moption1_6);
                            tv_option2.setText(R.string.Moption2_6);
                            tv_option3.setText(R.string.Moption3_6);
                            tv_option4.setText(R.string.Moption4_6);break;
                        }
                        case 7:
                        {
                            tv_question.setText(R.string.question_medium7);
                            tv_option1.setText(R.string.Moption1_7);
                            tv_option2.setText(R.string.Moption2_7);
                            tv_option3.setText(R.string.Moption3_7);
                            tv_option4.setText(R.string.Moption4_7);break;
                        }
                        case 8:
                        {
                            tv_question.setText(R.string.question_medium8);
                            tv_option1.setText(R.string.Moption1_8);
                            tv_option2.setText(R.string.Moption2_8);
                            tv_option3.setText(R.string.Moption3_8);
                            tv_option4.setText(R.string.Moption4_8);break;
                        }
                        case 9:
                        {
                            tv_question.setText(R.string.question_medium9);
                            tv_option1.setText(R.string.Moption1_9);
                            tv_option2.setText(R.string.Moption2_9);
                            tv_option3.setText(R.string.Moption3_9);
                            tv_option4.setText(R.string.Moption4_9);break;
                        }
                        case 10:
                        {
                            tv_question.setText(R.string.question_medium10);
                            tv_option1.setText(R.string.Moption1_10);
                            tv_option2.setText(R.string.Moption2_10);
                            tv_option3.setText(R.string.Moption3_10);
                            tv_option4.setText(R.string.Moption4_10);break;
                        }
                        case 11:
                        {
                            tv_question.setText(R.string.question_medium11);
                            tv_option1.setText(R.string.Moption1_11);
                            tv_option2.setText(R.string.Moption2_11);
                            tv_option3.setText(R.string.Moption3_11);
                            tv_option4.setText(R.string.Moption4_11);break;
                        }
                        case 12:
                        {
                            tv_question.setText(R.string.question_medium12);
                            tv_option1.setText(R.string.Moption1_12);
                            tv_option2.setText(R.string.Moption2_12);
                            tv_option3.setText(R.string.Moption3_12);
                            tv_option4.setText(R.string.Moption4_12);break;
                        }
                        case 13:
                        {
                            tv_question.setText(R.string.question_medium13);
                            tv_option1.setText(R.string.Moption1_13);
                            tv_option2.setText(R.string.Moption2_13);
                            tv_option3.setText(R.string.Moption3_13);
                            tv_option4.setText(R.string.Moption4_13);break;
                        }
                        case 14:
                        {
                            tv_question.setText(R.string.question_medium14);
                            tv_option1.setText(R.string.Moption1_14);
                            tv_option2.setText(R.string.Moption2_14);
                            tv_option3.setText(R.string.Moption3_14);
                            tv_option4.setText(R.string.Moption4_14);break;
                        }
                        case 15:
                        {
                            tv_question.setText(R.string.question_medium15);
                            tv_option1.setText(R.string.Moption1_15);
                            tv_option2.setText(R.string.Moption2_15);
                            tv_option3.setText(R.string.Moption3_15);
                            tv_option4.setText(R.string.Moption4_15);break;
                        }
                        case 16:
                        {
                            tv_question.setText(R.string.question_medium16);
                            tv_option1.setText(R.string.Moption1_16);
                            tv_option2.setText(R.string.Moption2_16);
                            tv_option3.setText(R.string.Moption3_16);
                            tv_option4.setText(R.string.Moption4_16);break;
                        }
                        case 17:
                        {
                            tv_question.setText(R.string.question_medium17);
                            tv_option1.setText(R.string.Moption1_17);
                            tv_option2.setText(R.string.Moption2_17);
                            tv_option3.setText(R.string.Moption3_17);
                            tv_option4.setText(R.string.Moption4_17);break;
                        }
                        case 18:
                        {
                            tv_question.setText(R.string.question_medium18);
                            tv_option1.setText(R.string.Moption1_18);
                            tv_option2.setText(R.string.Moption2_18);
                            tv_option3.setText(R.string.Moption3_18);
                            tv_option4.setText(R.string.Moption4_18);break;
                        }
                        case 19:
                        {
                            tv_question.setText(R.string.question_medium19);
                            tv_option1.setText(R.string.Moption1_19);
                            tv_option2.setText(R.string.Moption2_19);
                            tv_option3.setText(R.string.Moption3_19);
                            tv_option4.setText(R.string.Moption4_19);break;
                        }
                        case 20:
                        {
                            tv_question.setText(R.string.question_medium20);
                            tv_option1.setText(R.string.Moption1_20);
                            tv_option2.setText(R.string.Moption2_20);
                            tv_option3.setText(R.string.Moption3_20);
                            tv_option4.setText(R.string.Moption4_20);
                            completedAns = n;
                            editor.putInt("sp_qc_n_i", completedAns);
                            editor.apply();
                            break;
                        }
                        case 21:{
                            // Get instance of Vibrator from current Context
                            android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            // Vibrate for 400 milliseconds
                            v.vibrate(1200);
                            Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                            startActivity(intent);
                            break;
                        }

                    }
                }//end of if(level==1)
                if(level123==3){
                    switch(n){


                        case 2:
                        {
                            tv_question.setText(R.string.question_hard2);
                            tv_option1.setText(R.string.Hoption1_2);
                            tv_option2.setText(R.string.Hoption2_2);
                            tv_option3.setText(R.string.Hoption3_2);
                            tv_option4.setText(R.string.Hoption4_2);break;
                        }
                        case 3:
                        {
                            tv_question.setText(R.string.question_hard3);
                            tv_option1.setText(R.string.Hoption1_3);
                            tv_option2.setText(R.string.Hoption2_3);
                            tv_option3.setText(R.string.Hoption3_3);
                            tv_option4.setText(R.string.Hoption4_3);break;
                        }
                        case 4:
                        {
                            tv_question.setText(R.string.question_hard4);
                            tv_option1.setText(R.string.Hoption1_4);
                            tv_option2.setText(R.string.Hoption2_4);
                            tv_option3.setText(R.string.Hoption3_4);
                            tv_option4.setText(R.string.Hoption4_4);break;
                        }
                        case 5:
                        {
                            tv_question.setText(R.string.question_hard5);
                            tv_option1.setText(R.string.Hoption1_5);
                            tv_option2.setText(R.string.Hoption2_5);
                            tv_option3.setText(R.string.Hoption3_5);
                            tv_option4.setText(R.string.Hoption4_5);break;
                        }
                        case 6:
                        {
                            tv_question.setText(R.string.question_hard6);
                            tv_option1.setText(R.string.Hoption1_6);
                            tv_option2.setText(R.string.Hoption2_6);
                            tv_option3.setText(R.string.Hoption3_6);
                            tv_option4.setText(R.string.Hoption4_6);break;
                        }
                        case 7:
                        {
                            tv_question.setText(R.string.question_hard7);
                            tv_option1.setText(R.string.Hoption1_7);
                            tv_option2.setText(R.string.Hoption2_7);
                            tv_option3.setText(R.string.Hoption3_7);
                            tv_option4.setText(R.string.Hoption4_7);break;
                        }
                        case 8:
                        {
                            tv_question.setText(R.string.question_hard8);
                            tv_option1.setText(R.string.Hoption1_8);
                            tv_option2.setText(R.string.Hoption2_8);
                            tv_option3.setText(R.string.Hoption3_8);
                            tv_option4.setText(R.string.Hoption4_8);break;
                        }
                        case 9:
                        {
                            tv_question.setText(R.string.question_hard9);
                            tv_option1.setText(R.string.Hoption1_9);
                            tv_option2.setText(R.string.Hoption2_9);
                            tv_option3.setText(R.string.Hoption3_9);
                            tv_option4.setText(R.string.Hoption4_9);break;
                        }
                        case 10:
                        {
                            tv_question.setText(R.string.question_hard10);
                            tv_option1.setText(R.string.Hoption1_10);
                            tv_option2.setText(R.string.Hoption2_10);
                            tv_option3.setText(R.string.Hoption3_10);
                            tv_option4.setText(R.string.Hoption4_10);break;
                        }
                        case 11:
                        {
                            tv_question.setText(R.string.question_hard11);
                            tv_option1.setText(R.string.Hoption1_11);
                            tv_option2.setText(R.string.Hoption2_11);
                            tv_option3.setText(R.string.Hoption3_11);
                            tv_option4.setText(R.string.Hoption4_11);break;
                        }
                        case 12:
                        {
                            tv_question.setText(R.string.question_hard12);
                            tv_option1.setText(R.string.Hoption1_12);
                            tv_option2.setText(R.string.Hoption2_12);
                            tv_option3.setText(R.string.Hoption3_12);
                            tv_option4.setText(R.string.Hoption4_12);break;
                        }
                        case 13:
                        {
                            tv_question.setText(R.string.question_hard13);
                            tv_option1.setText(R.string.Hoption1_13);
                            tv_option2.setText(R.string.Hoption2_13);
                            tv_option3.setText(R.string.Hoption3_13);
                            tv_option4.setText(R.string.Hoption4_13);break;
                        }
                        case 14:
                        {
                            tv_question.setText(R.string.question_hard14);
                            tv_option1.setText(R.string.Hoption1_14);
                            tv_option2.setText(R.string.Hoption2_14);
                            tv_option3.setText(R.string.Hoption3_14);
                            tv_option4.setText(R.string.Hoption4_14);break;
                        }
                        case 15:
                        {
                            tv_question.setText(R.string.question_hard15);
                            tv_option1.setText(R.string.Hoption1_15);
                            tv_option2.setText(R.string.Hoption2_15);
                            tv_option3.setText(R.string.Hoption3_15);
                            tv_option4.setText(R.string.Hoption4_15);break;
                        }
                        case 16:
                        {
                            tv_question.setText(R.string.question_hard16);
                            tv_option1.setText(R.string.Hoption1_16);
                            tv_option2.setText(R.string.Hoption2_16);
                            tv_option3.setText(R.string.Hoption3_16);
                            tv_option4.setText(R.string.Hoption4_16);break;
                        }
                        case 17:
                        {
                            tv_question.setText(R.string.question_hard17);
                            tv_option1.setText(R.string.Hoption1_17);
                            tv_option2.setText(R.string.Hoption2_17);
                            tv_option3.setText(R.string.Hoption3_17);
                            tv_option4.setText(R.string.Hoption4_17);break;
                        }
                        case 18:
                        {
                            tv_question.setText(R.string.question_hard18);
                            tv_option1.setText(R.string.Hoption1_18);
                            tv_option2.setText(R.string.Hoption2_18);
                            tv_option3.setText(R.string.Hoption3_18);
                            tv_option4.setText(R.string.Hoption4_18);
                            completedAns = n;
                            editor.putInt("sp_qc_n_i", completedAns);
                            editor.apply();
                            break;
                        }
                        case 19:{
                            // Get instance of Vibrator from current Context
                            android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            // Vibrate for 400 milliseconds
                            v.vibrate(1200);
                            Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                            startActivity(intent);
                        }





                    }
                }//end of if(level==1)
//End of the Quiz Program:  Setting of the TextView(s)

//Setting


                //Go to next Activity: QuizCompleted activity should be opened up on LEvel Completion
                //The app has three level  ...
                //Level 1: 25
                //level 2: 20
                //level 3: 18


                tv_option1.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option2.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option3.setTextColor(getResources().getColor(R.color.gray_text_normal));
                tv_option4.setTextColor(getResources().getColor(R.color.gray_text_normal));
            }
        });
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.buzzerwav_quiz);
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(eooof4==0){
                    Toast.makeText(QuizActivityInside.this, "Please select the answer", Toast.LENGTH_SHORT).show();
                    // Get instance of Vibrator from current Context
                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    // Vibrate for 400 milliseconds
                    v.vibrate(280);

                    dialogBox4ChooseAnOption();
                }else
                {
                    //Set the color: Green for the correct
                    //Score up
                    //Toast for being correct or for false
                    if(level123==1){
                        switch(n){
                            case 1:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore", score);
                                    editor.apply();

                                    correctAns=correctAns+1;
                                    editor.putInt("sp_latestscore", score);
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();

                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    mp.start();
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 2:{
                                if(eooof4==3){
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);

                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 3:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);


                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 4:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);

                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 5:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);

                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 6:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);

                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 7:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 8:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();


                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 9:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 10:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();




                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 11:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 12:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 13:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 14:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 15:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 16:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 17:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 18:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 19:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 20:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 21:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 22:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 23:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 24:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 25:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+3;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                        }
                    }
                    if(level123==2){
                        switch(n){
                            case 1:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 2:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 3:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 4:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 5:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 6:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 7:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 8:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 9:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 10:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 11:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 12:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 13:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 14:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 15:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 16:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 17:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 18:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 19:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 20:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+5;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }


                        }
                    }
                    if(level123==3){
                        switch(n){
                            case 1:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 2:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 3:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 4:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 5:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 6:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 7:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 8:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 9:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 10:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 11:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 12:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 13:{
                                if(eooof4==2){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 14:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 15:{
                                if(eooof4==3){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 2", Toast.LENGTH_SHORT).show();
                                    tv_option2.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 16:{
                                if(eooof4==4){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 1", Toast.LENGTH_SHORT).show();
                                    tv_option1.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 17:{
                                if(eooof4==1){
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(80);
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 4", Toast.LENGTH_SHORT).show();
                                    tv_option4.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                            case 18:{
                                // Get instance of Vibrator from current Context
                                android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                // Vibrate for 400 milliseconds
                                v.vibrate(80);
                                if(eooof4==1){
                                    //code for being correct
                                    //score up
                                    //Toast for being correct
                                    score=score+10;
                                    String bababa=String.valueOf(score);
                                    scoreTV.setText(bababa);
                                    editor.putInt("sp_latestscore",score);
                                    correctAns=correctAns+1;
                                    editor.putInt("sp_ac_n_i", correctAns);
                                    editor.apply();
                                    correctAns_tv.setText(String.valueOf(correctAns));
                                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }else{
                                    mp.start();
                                    //highlight for being incorrect
                                    //Toast the correct option
                                    Toast.makeText(getApplicationContext(), "Correct Ans: 3", Toast.LENGTH_SHORT).show();
                                    tv_option3.setTextColor(getResources().getColor(R.color.green));
                                }
                                break;
                            }
                        }

                    }

                    btn_confirm.setVisibility(View.GONE);
                    btn_next.setVisibility(View.VISIBLE);




                }
            }
        });
//Redirecting in 1mins 30secs
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                Toast.makeText(getApplicationContext(), "Time Over ..", Toast.LENGTH_LONG).show();
//
//                Intent i = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
//                startActivity(i);
//                finish();
//
//
//            }
//        },  TIME_OUT);

//Just show the timer running in Running Thread
        // Time is in millisecond so 50sec = 50000 I have used
        // countdown Interveal is 1sec = 1000 I have used
        new CountDownTimer(90000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                long hour = (millisUntilFinished / 3600000) % 24;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                //  long millis = (millisUntilFinished/100) % 10;
                countdown_tv.setText(f.format(min) + " min : " + f.format(sec)+" secs" );
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                countdown_tv.setText("00 : 00 : 00");
            }
        }.start();





    }
    @Override
    public void onBackPressed(){
        dialogBoxQuitQuiz();
    }




    public void dialogBox4ChooseAnOption(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit Current Question ?");
        alertDialogBuilder.setMessage("You can skip this Question and move on to the next round. Do you Agree?");
        alertDialogBuilder.setPositiveButton("Yeah",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //increase question number
                        n=n+1;
                        btn_next.setVisibility(View.GONE);
                        btn_confirm.setVisibility(View.VISIBLE);

                        eooof4=0;
                        rb_option1.setChecked(false);
                        rb_option2.setChecked(false);
                        rb_option3.setChecked(false);
                        rb_option4.setChecked(false);

//Setting Question, option1, option2, option3, option4.. the below




//Start of the Quiz Program:  Setting of the TextView(s)........... QUESTION & 4-OPTIONS
                        if(level123==1){
                            switch(n){

                                case 2:
                                {
                                    tv_question.setText(R.string.question_easy2);
                                    tv_option1.setText(R.string.Eoption1_2);
                                    tv_option2.setText(R.string.Eoption2_2);
                                    tv_option3.setText(R.string.Eoption3_2);
                                    tv_option4.setText(R.string.Eoption4_2);
                                    break;
                                }
                                case 3:
                                {
                                    tv_question.setText(R.string.question_easy3);
                                    tv_option1.setText(R.string.Eoption1_3);
                                    tv_option2.setText(R.string.Eoption2_3);
                                    tv_option3.setText(R.string.Eoption3_3);
                                    tv_option4.setText(R.string.Eoption4_3);
                                    break;
                                }
                                case 4:
                                {
                                    tv_question.setText(R.string.question_easy4);
                                    tv_option1.setText(R.string.Eoption1_4);
                                    tv_option2.setText(R.string.Eoption2_4);
                                    tv_option3.setText(R.string.Eoption3_4);
                                    tv_option4.setText(R.string.Eoption4_4);
                                    break;
                                }
                                case 5:
                                {
                                    tv_question.setText(R.string.question_easy5);
                                    tv_option1.setText(R.string.Eoption1_5);
                                    tv_option2.setText(R.string.Eoption2_5);
                                    tv_option3.setText(R.string.Eoption3_5);
                                    tv_option4.setText(R.string.Eoption4_5);
                                    break;
                                }
                                case 6:
                                {
                                    tv_question.setText(R.string.question_easy6);
                                    tv_option1.setText(R.string.Eoption1_6);
                                    tv_option2.setText(R.string.Eoption2_6);
                                    tv_option3.setText(R.string.Eoption3_6);
                                    tv_option4.setText(R.string.Eoption4_6);
                                    break;
                                }
                                case 7:
                                {
                                    tv_question.setText(R.string.question_easy7);
                                    tv_option1.setText(R.string.Eoption1_7);
                                    tv_option2.setText(R.string.Eoption2_7);
                                    tv_option3.setText(R.string.Eoption3_7);
                                    tv_option4.setText(R.string.Eoption4_7);
                                    break;
                                }
                                case 8:
                                {
                                    tv_question.setText(R.string.question_easy8);
                                    tv_option1.setText(R.string.Eoption1_8);
                                    tv_option2.setText(R.string.Eoption2_8);
                                    tv_option3.setText(R.string.Eoption3_8);
                                    tv_option4.setText(R.string.Eoption4_8);
                                    break;
                                }
                                case 9:
                                {
                                    tv_question.setText(R.string.question_easy9);
                                    tv_option1.setText(R.string.Eoption1_9);
                                    tv_option2.setText(R.string.Eoption2_9);
                                    tv_option3.setText(R.string.Eoption3_9);
                                    tv_option4.setText(R.string.Eoption4_9);
                                    break;
                                }
                                case 10:
                                {
                                    tv_question.setText(R.string.question_easy10);
                                    tv_option1.setText(R.string.Eoption1_10);
                                    tv_option2.setText(R.string.Eoption2_10);
                                    tv_option3.setText(R.string.Eoption3_10);
                                    tv_option4.setText(R.string.Eoption4_10);
                                    break;
                                }
                                case 11:
                                {
                                    tv_question.setText(R.string.question_easy11);
                                    tv_option1.setText(R.string.Eoption1_11);
                                    tv_option2.setText(R.string.Eoption2_11);
                                    tv_option3.setText(R.string.Eoption3_11);
                                    tv_option4.setText(R.string.Eoption4_11);
                                    break;
                                }
                                case 12:
                                {
                                    tv_question.setText(R.string.question_easy12);
                                    tv_option1.setText(R.string.Eoption1_12);
                                    tv_option2.setText(R.string.Eoption2_12);
                                    tv_option3.setText(R.string.Eoption3_12);
                                    tv_option4.setText(R.string.Eoption4_12);
                                    break;
                                }
                                case 13:
                                {
                                    tv_question.setText(R.string.question_easy13);
                                    tv_option1.setText(R.string.Eoption1_13);
                                    tv_option2.setText(R.string.Eoption2_13);
                                    tv_option3.setText(R.string.Eoption3_13);
                                    tv_option4.setText(R.string.Eoption4_13);
                                    break;
                                }
                                case 14:
                                {
                                    tv_question.setText(R.string.question_easy14);
                                    tv_option1.setText(R.string.Eoption1_14);
                                    tv_option2.setText(R.string.Eoption2_14);
                                    tv_option3.setText(R.string.Eoption3_14);
                                    tv_option4.setText(R.string.Eoption4_14);
                                    break;
                                }
                                case 15:
                                {
                                    tv_question.setText(R.string.question_easy15);
                                    tv_option1.setText(R.string.Eoption1_15);
                                    tv_option2.setText(R.string.Eoption2_15);
                                    tv_option3.setText(R.string.Eoption3_15);
                                    tv_option4.setText(R.string.Eoption4_15);
                                    break;
                                }
                                case 16:
                                {
                                    tv_question.setText(R.string.question_easy16);
                                    tv_option1.setText(R.string.Eoption1_16);
                                    tv_option2.setText(R.string.Eoption2_16);
                                    tv_option3.setText(R.string.Eoption3_16);
                                    tv_option4.setText(R.string.Eoption4_16);
                                    break;
                                }
                                case 17:
                                {
                                    tv_question.setText(R.string.question_easy17);
                                    tv_option1.setText(R.string.Eoption1_17);
                                    tv_option2.setText(R.string.Eoption2_17);
                                    tv_option3.setText(R.string.Eoption3_17);
                                    tv_option4.setText(R.string.Eoption4_17);
                                    break;
                                }
                                case 18:
                                {
                                    tv_question.setText(R.string.question_easy18);
                                    tv_option1.setText(R.string.Eoption1_18);
                                    tv_option2.setText(R.string.Eoption2_18);
                                    tv_option3.setText(R.string.Eoption3_18);
                                    tv_option4.setText(R.string.Eoption4_18);
                                    break;
                                }
                                case 19:
                                {
                                    tv_question.setText(R.string.question_easy19);
                                    tv_option1.setText(R.string.Eoption1_19);
                                    tv_option2.setText(R.string.Eoption2_19);
                                    tv_option3.setText(R.string.Eoption3_19);
                                    tv_option4.setText(R.string.Eoption4_19);
                                    break;
                                }
                                case 20:
                                {
                                    tv_question.setText(R.string.question_easy20);
                                    tv_option1.setText(R.string.Eoption1_20);
                                    tv_option2.setText(R.string.Eoption2_20);
                                    tv_option3.setText(R.string.Eoption3_20);
                                    tv_option4.setText(R.string.Eoption4_20);
                                    break;
                                }
                                case 21:
                                {
                                    tv_question.setText(R.string.question_easy21);
                                    tv_option1.setText(R.string.Eoption1_21);
                                    tv_option2.setText(R.string.Eoption2_21);
                                    tv_option3.setText(R.string.Eoption3_21);
                                    tv_option4.setText(R.string.Eoption4_21);
                                    break;
                                }
                                case 22:
                                {
                                    tv_question.setText(R.string.question_easy22);
                                    tv_option1.setText(R.string.Eoption1_22);
                                    tv_option2.setText(R.string.Eoption2_22);
                                    tv_option3.setText(R.string.Eoption3_22);
                                    tv_option4.setText(R.string.Eoption4_22);
                                    break;
                                }
                                case 23:
                                {
                                    tv_question.setText(R.string.question_easy23);
                                    tv_option1.setText(R.string.Eoption1_23);
                                    tv_option2.setText(R.string.Eoption2_23);
                                    tv_option3.setText(R.string.Eoption3_23);
                                    tv_option4.setText(R.string.Eoption4_23);
                                    break;
                                }
                                case 24:
                                {
                                    tv_question.setText(R.string.question_easy24);
                                    tv_option1.setText(R.string.Eoption1_24);
                                    tv_option2.setText(R.string.Eoption2_24);
                                    tv_option3.setText(R.string.Eoption3_24);
                                    tv_option4.setText(R.string.Eoption4_24);
                                    break;
                                }
                                case 25:
                                {
                                    tv_question.setText(R.string.question_easy25);
                                    tv_option1.setText(R.string.Eoption1_25);
                                    tv_option2.setText(R.string.Eoption2_25);
                                    tv_option3.setText(R.string.Eoption3_25);
                                    tv_option4.setText(R.string.Eoption4_25);
                                    break;
                                }
                                case 26:{
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(1200);
                                    Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                                    startActivity(intent);
                                }
                            }
                        }//end of if(level==1)
                        if(level123==2){
                            switch(n){


                                case 2:
                                {
                                    tv_question.setText(R.string.question_medium2);
                                    tv_option1.setText(R.string.Moption1_2);
                                    tv_option2.setText(R.string.Moption2_2);
                                    tv_option3.setText(R.string.Moption3_2);
                                    tv_option4.setText(R.string.Moption4_2);break;
                                }
                                case 3:
                                {
                                    tv_question.setText(R.string.question_medium3);
                                    tv_option1.setText(R.string.Moption1_3);
                                    tv_option2.setText(R.string.Moption2_3);
                                    tv_option3.setText(R.string.Moption3_3);
                                    tv_option4.setText(R.string.Moption4_3);break;
                                }
                                case 4:
                                {
                                    tv_question.setText(R.string.question_medium4);
                                    tv_option1.setText(R.string.Moption1_4);
                                    tv_option2.setText(R.string.Moption2_4);
                                    tv_option3.setText(R.string.Moption3_4);
                                    tv_option4.setText(R.string.Moption4_4);break;
                                }
                                case 5:
                                {
                                    tv_question.setText(R.string.question_medium5);
                                    tv_option1.setText(R.string.Moption1_5);
                                    tv_option2.setText(R.string.Moption2_5);
                                    tv_option3.setText(R.string.Moption3_5);
                                    tv_option4.setText(R.string.Moption4_5);break;
                                }
                                case 6:
                                {
                                    tv_question.setText(R.string.question_medium6);
                                    tv_option1.setText(R.string.Moption1_6);
                                    tv_option2.setText(R.string.Moption2_6);
                                    tv_option3.setText(R.string.Moption3_6);
                                    tv_option4.setText(R.string.Moption4_6);break;
                                }
                                case 7:
                                {
                                    tv_question.setText(R.string.question_medium7);
                                    tv_option1.setText(R.string.Moption1_7);
                                    tv_option2.setText(R.string.Moption2_7);
                                    tv_option3.setText(R.string.Moption3_7);
                                    tv_option4.setText(R.string.Moption4_7);break;
                                }
                                case 8:
                                {
                                    tv_question.setText(R.string.question_medium8);
                                    tv_option1.setText(R.string.Moption1_8);
                                    tv_option2.setText(R.string.Moption2_8);
                                    tv_option3.setText(R.string.Moption3_8);
                                    tv_option4.setText(R.string.Moption4_8);break;
                                }
                                case 9:
                                {
                                    tv_question.setText(R.string.question_medium9);
                                    tv_option1.setText(R.string.Moption1_9);
                                    tv_option2.setText(R.string.Moption2_9);
                                    tv_option3.setText(R.string.Moption3_9);
                                    tv_option4.setText(R.string.Moption4_9);break;
                                }
                                case 10:
                                {
                                    tv_question.setText(R.string.question_medium10);
                                    tv_option1.setText(R.string.Moption1_10);
                                    tv_option2.setText(R.string.Moption2_10);
                                    tv_option3.setText(R.string.Moption3_10);
                                    tv_option4.setText(R.string.Moption4_10);break;
                                }
                                case 11:
                                {
                                    tv_question.setText(R.string.question_medium11);
                                    tv_option1.setText(R.string.Moption1_11);
                                    tv_option2.setText(R.string.Moption2_11);
                                    tv_option3.setText(R.string.Moption3_11);
                                    tv_option4.setText(R.string.Moption4_11);break;
                                }
                                case 12:
                                {
                                    tv_question.setText(R.string.question_medium12);
                                    tv_option1.setText(R.string.Moption1_12);
                                    tv_option2.setText(R.string.Moption2_12);
                                    tv_option3.setText(R.string.Moption3_12);
                                    tv_option4.setText(R.string.Moption4_12);break;
                                }
                                case 13:
                                {
                                    tv_question.setText(R.string.question_medium13);
                                    tv_option1.setText(R.string.Moption1_13);
                                    tv_option2.setText(R.string.Moption2_13);
                                    tv_option3.setText(R.string.Moption3_13);
                                    tv_option4.setText(R.string.Moption4_13);break;
                                }
                                case 14:
                                {
                                    tv_question.setText(R.string.question_medium14);
                                    tv_option1.setText(R.string.Moption1_14);
                                    tv_option2.setText(R.string.Moption2_14);
                                    tv_option3.setText(R.string.Moption3_14);
                                    tv_option4.setText(R.string.Moption4_14);break;
                                }
                                case 15:
                                {
                                    tv_question.setText(R.string.question_medium15);
                                    tv_option1.setText(R.string.Moption1_15);
                                    tv_option2.setText(R.string.Moption2_15);
                                    tv_option3.setText(R.string.Moption3_15);
                                    tv_option4.setText(R.string.Moption4_15);break;
                                }
                                case 16:
                                {
                                    tv_question.setText(R.string.question_medium16);
                                    tv_option1.setText(R.string.Moption1_16);
                                    tv_option2.setText(R.string.Moption2_16);
                                    tv_option3.setText(R.string.Moption3_16);
                                    tv_option4.setText(R.string.Moption4_16);break;
                                }
                                case 17:
                                {
                                    tv_question.setText(R.string.question_medium17);
                                    tv_option1.setText(R.string.Moption1_17);
                                    tv_option2.setText(R.string.Moption2_17);
                                    tv_option3.setText(R.string.Moption3_17);
                                    tv_option4.setText(R.string.Moption4_17);break;
                                }
                                case 18:
                                {
                                    tv_question.setText(R.string.question_medium18);
                                    tv_option1.setText(R.string.Moption1_18);
                                    tv_option2.setText(R.string.Moption2_18);
                                    tv_option3.setText(R.string.Moption3_18);
                                    tv_option4.setText(R.string.Moption4_18);break;
                                }
                                case 19:
                                {
                                    tv_question.setText(R.string.question_medium19);
                                    tv_option1.setText(R.string.Moption1_19);
                                    tv_option2.setText(R.string.Moption2_19);
                                    tv_option3.setText(R.string.Moption3_19);
                                    tv_option4.setText(R.string.Moption4_19);break;
                                }
                                case 20:
                                {
                                    tv_question.setText(R.string.question_medium20);
                                    tv_option1.setText(R.string.Moption1_20);
                                    tv_option2.setText(R.string.Moption2_20);
                                    tv_option3.setText(R.string.Moption3_20);
                                    tv_option4.setText(R.string.Moption4_20);break;
                                }
                                case 21:{
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(1200);
                                    Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                                    startActivity(intent);
                                }

                            }
                        }//end of if(level==1)
                        if(level123==3){
                            switch(n){


                                case 2:
                                {
                                    tv_question.setText(R.string.question_hard2);
                                    tv_option1.setText(R.string.Hoption1_2);
                                    tv_option2.setText(R.string.Hoption2_2);
                                    tv_option3.setText(R.string.Hoption3_2);
                                    tv_option4.setText(R.string.Hoption4_2);break;
                                }
                                case 3:
                                {
                                    tv_question.setText(R.string.question_hard3);
                                    tv_option1.setText(R.string.Hoption1_3);
                                    tv_option2.setText(R.string.Hoption2_3);
                                    tv_option3.setText(R.string.Hoption3_3);
                                    tv_option4.setText(R.string.Hoption4_3);break;
                                }
                                case 4:
                                {
                                    tv_question.setText(R.string.question_hard4);
                                    tv_option1.setText(R.string.Hoption1_4);
                                    tv_option2.setText(R.string.Hoption2_4);
                                    tv_option3.setText(R.string.Hoption3_4);
                                    tv_option4.setText(R.string.Hoption4_4);break;
                                }
                                case 5:
                                {
                                    tv_question.setText(R.string.question_hard5);
                                    tv_option1.setText(R.string.Hoption1_5);
                                    tv_option2.setText(R.string.Hoption2_5);
                                    tv_option3.setText(R.string.Hoption3_5);
                                    tv_option4.setText(R.string.Hoption4_5);break;
                                }
                                case 6:
                                {
                                    tv_question.setText(R.string.question_hard6);
                                    tv_option1.setText(R.string.Hoption1_6);
                                    tv_option2.setText(R.string.Hoption2_6);
                                    tv_option3.setText(R.string.Hoption3_6);
                                    tv_option4.setText(R.string.Hoption4_6);break;
                                }
                                case 7:
                                {
                                    tv_question.setText(R.string.question_hard7);
                                    tv_option1.setText(R.string.Hoption1_7);
                                    tv_option2.setText(R.string.Hoption2_7);
                                    tv_option3.setText(R.string.Hoption3_7);
                                    tv_option4.setText(R.string.Hoption4_7);break;
                                }
                                case 8:
                                {
                                    tv_question.setText(R.string.question_hard8);
                                    tv_option1.setText(R.string.Hoption1_8);
                                    tv_option2.setText(R.string.Hoption2_8);
                                    tv_option3.setText(R.string.Hoption3_8);
                                    tv_option4.setText(R.string.Hoption4_8);break;
                                }
                                case 9:
                                {
                                    tv_question.setText(R.string.question_hard9);
                                    tv_option1.setText(R.string.Hoption1_9);
                                    tv_option2.setText(R.string.Hoption2_9);
                                    tv_option3.setText(R.string.Hoption3_9);
                                    tv_option4.setText(R.string.Hoption4_9);break;
                                }
                                case 10:
                                {
                                    tv_question.setText(R.string.question_hard10);
                                    tv_option1.setText(R.string.Hoption1_10);
                                    tv_option2.setText(R.string.Hoption2_10);
                                    tv_option3.setText(R.string.Hoption3_10);
                                    tv_option4.setText(R.string.Hoption4_10);break;
                                }
                                case 11:
                                {
                                    tv_question.setText(R.string.question_hard11);
                                    tv_option1.setText(R.string.Hoption1_11);
                                    tv_option2.setText(R.string.Hoption2_11);
                                    tv_option3.setText(R.string.Hoption3_11);
                                    tv_option4.setText(R.string.Hoption4_11);break;
                                }
                                case 12:
                                {
                                    tv_question.setText(R.string.question_hard12);
                                    tv_option1.setText(R.string.Hoption1_12);
                                    tv_option2.setText(R.string.Hoption2_12);
                                    tv_option3.setText(R.string.Hoption3_12);
                                    tv_option4.setText(R.string.Hoption4_12);break;
                                }
                                case 13:
                                {
                                    tv_question.setText(R.string.question_hard13);
                                    tv_option1.setText(R.string.Hoption1_13);
                                    tv_option2.setText(R.string.Hoption2_13);
                                    tv_option3.setText(R.string.Hoption3_13);
                                    tv_option4.setText(R.string.Hoption4_13);break;
                                }
                                case 14:
                                {
                                    tv_question.setText(R.string.question_hard14);
                                    tv_option1.setText(R.string.Hoption1_14);
                                    tv_option2.setText(R.string.Hoption2_14);
                                    tv_option3.setText(R.string.Hoption3_14);
                                    tv_option4.setText(R.string.Hoption4_14);break;
                                }
                                case 15:
                                {
                                    tv_question.setText(R.string.question_hard15);
                                    tv_option1.setText(R.string.Hoption1_15);
                                    tv_option2.setText(R.string.Hoption2_15);
                                    tv_option3.setText(R.string.Hoption3_15);
                                    tv_option4.setText(R.string.Hoption4_15);break;
                                }
                                case 16:
                                {
                                    tv_question.setText(R.string.question_hard16);
                                    tv_option1.setText(R.string.Hoption1_16);
                                    tv_option2.setText(R.string.Hoption2_16);
                                    tv_option3.setText(R.string.Hoption3_16);
                                    tv_option4.setText(R.string.Hoption4_16);break;
                                }
                                case 17:
                                {
                                    tv_question.setText(R.string.question_hard17);
                                    tv_option1.setText(R.string.Hoption1_17);
                                    tv_option2.setText(R.string.Hoption2_17);
                                    tv_option3.setText(R.string.Hoption3_17);
                                    tv_option4.setText(R.string.Hoption4_17);break;
                                }
                                case 18:
                                {
                                    tv_question.setText(R.string.question_hard18);
                                    tv_option1.setText(R.string.Hoption1_18);
                                    tv_option2.setText(R.string.Hoption2_18);
                                    tv_option3.setText(R.string.Hoption3_18);
                                    tv_option4.setText(R.string.Hoption4_18);break;
                                }
                                case 19:{
                                    // Get instance of Vibrator from current Context
                                    android.os.Vibrator v = (android.os.Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                    // Vibrate for 400 milliseconds
                                    v.vibrate(1200);
                                    Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                                    startActivity(intent);
                                }





                            }
                        }//end of if(level==1)
//End of the Quiz Program:  Setting of the TextView(s)

//Setting


                        //Go to next Activity: QuizCompleted activity should be opened up on LEvel Completion
                        //The app has three level  ...
                        //Level 1: 25
                        //level 2: 20
                        //level 3: 18


                        tv_option1.setTextColor(getResources().getColor(R.color.gray_text_normal));
                        tv_option2.setTextColor(getResources().getColor(R.color.gray_text_normal));
                        tv_option3.setTextColor(getResources().getColor(R.color.gray_text_normal));
                        tv_option4.setTextColor(getResources().getColor(R.color.gray_text_normal));
                    }
                });

        alertDialogBuilder.setNegativeButton("I'll try another Level",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent = new Intent(QuizActivityInside.this, QuizActivityOutside.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public void dialogBoxQuitQuiz(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("Exit Quiz ?");
        alertDialogBuilder.setMessage("Your current progress will be lost");
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent = new Intent(QuizActivityInside.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}