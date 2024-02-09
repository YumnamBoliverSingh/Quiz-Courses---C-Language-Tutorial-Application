package com.example.cprogrammingtutorial_easyconceptnoads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class Third_tab extends Fragment {
    public boolean bool_quesans1, bool_quesans2, bool_quesans3, bool_quesans4, bool_quesans5, bool_quesans6, bool_quesans7, bool_quesans8, bool_quesans9, bool_quesans10, bool_quesans11, bool_quesans12, bool_quesans13, bool_quesans14, bool_quesans15, bool_quesans16, bool_quesans17, bool_quesans18, bool_quesans19, bool_quesans20, bool_quesans21, bool_quesans22, bool_quesans23, bool_quesans24, bool_quesans25, bool_quesans26, bool_quesans27, bool_quesans28, bool_quesans29, bool_quesans30, bool_quesans31, bool_quesans32, bool_quesans33, bool_quesans34, bool_quesans35, bool_quesans36, bool_quesans37, bool_quesans38, bool_quesans39, bool_quesans40;
    ConstraintLayout container_ans1, container_ans2, container_ans3, container_ans4, container_ans5, container_ans6, container_ans7, container_ans8, container_ans9, container_ans10, container_ans11, container_ans12, container_ans13, container_ans14, container_ans15, container_ans16, container_ans17, container_ans18, container_ans19, container_ans20, container_ans21, container_ans22, container_ans23, container_ans24, container_ans25, container_ans26, container_ans27, container_ans28, container_ans29, container_ans30, container_ans31, container_ans32, container_ans33, container_ans34, container_ans35, container_ans36, container_ans37, container_ans38, container_ans39, container_ans40;
    ConstraintLayout question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12, question13, question14, question21, question15, question16, question17, question18, question19, question20, question22, question23, question24, question25, question26, question27, question28, question29, question30, question31, question32, question33, question34, question35, question36, question37, question38, question39, question40;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_third_tab, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        container_ans1=view.findViewById(R.id.container_faq1);
        container_ans2=view.findViewById(R.id.container_faq2);
        container_ans3=view.findViewById(R.id.container_faq3);
        container_ans4=view.findViewById(R.id.container_faq4);
        container_ans5=view.findViewById(R.id.container_faq5);
        container_ans6=view.findViewById(R.id.container_faq6);
        container_ans7=view.findViewById(R.id.container_faq7);
        container_ans8=view.findViewById(R.id.container_faq8);
        container_ans9=view.findViewById(R.id.container_faq9);
        container_ans10=view.findViewById(R.id.container_faq10);
        container_ans11=view.findViewById(R.id.container_faq11);
        container_ans12=view.findViewById(R.id.container_faq12);
        container_ans13=view.findViewById(R.id.container_faq13);
        container_ans14=view.findViewById(R.id.container_faq14);
        container_ans15=view.findViewById(R.id.container_faq15);
        container_ans16=view.findViewById(R.id.container_faq16);
        container_ans17=view.findViewById(R.id.container_faq17);
        container_ans18=view.findViewById(R.id.container_faq18);
        container_ans19=view.findViewById(R.id.container_faq19);
        container_ans20=view.findViewById(R.id.container_faq20);
        container_ans21=view.findViewById(R.id.container_faq21);
        container_ans22=view.findViewById(R.id.container_faq22);
        container_ans23=view.findViewById(R.id.container_faq23);
        container_ans24=view.findViewById(R.id.container_faq24);
        container_ans25=view.findViewById(R.id.container_faq25);
        container_ans26=view.findViewById(R.id.container_faq26);
        container_ans27=view.findViewById(R.id.container_faq27);
        container_ans28=view.findViewById(R.id.container_faq28);
        container_ans29=view.findViewById(R.id.container_faq29);
        container_ans30=view.findViewById(R.id.container_faq30);
        container_ans31=view.findViewById(R.id.container_faq31);
        container_ans32=view.findViewById(R.id.container_faq32);
        container_ans33=view.findViewById(R.id.container_faq33);
        container_ans34=view.findViewById(R.id.container_faq34);
        container_ans35=view.findViewById(R.id.container_faq35);
        container_ans36=view.findViewById(R.id.container_faq36);
        container_ans37=view.findViewById(R.id.container_faq37);
        container_ans38=view.findViewById(R.id.container_faq38);
        container_ans39=view.findViewById(R.id.container_faq39);
        container_ans40=view.findViewById(R.id.container_faq40);

        question1=view.findViewById(R.id.faq1);
        question2=view.findViewById(R.id.faq2);
        question3=view.findViewById(R.id.faq3);
        question4=view.findViewById(R.id.faq4);
        question5=view.findViewById(R.id.faq5);
        question6=view.findViewById(R.id.faq6);
        question7=view.findViewById(R.id.faq7);
        question8=view.findViewById(R.id.faq8);
        question9=view.findViewById(R.id.faq9);
        question10=view.findViewById(R.id.faq10);

        question11=view.findViewById(R.id.faq11);
        question12=view.findViewById(R.id.faq12);
        question13=view.findViewById(R.id.faq13);
        question14=view.findViewById(R.id.faq14);
        question15=view.findViewById(R.id.faq15);
        question16=view.findViewById(R.id.faq16);
        question17=view.findViewById(R.id.faq17);
        question18=view.findViewById(R.id.faq18);
        question19=view.findViewById(R.id.faq19);
        question20=view.findViewById(R.id.faq20);

        question21=view.findViewById(R.id.faq21);
        question22=view.findViewById(R.id.faq22);
        question23=view.findViewById(R.id.faq23);
        question24=view.findViewById(R.id.faq24);
        question25=view.findViewById(R.id.faq25);
        question26=view.findViewById(R.id.faq26);
        question27=view.findViewById(R.id.faq27);
        question28=view.findViewById(R.id.faq28);
        question29=view.findViewById(R.id.faq29);
        question30=view.findViewById(R.id.faq30);

        question31=view.findViewById(R.id.faq31);
        question32=view.findViewById(R.id.faq32);
        question33=view.findViewById(R.id.faq33);
        question34=view.findViewById(R.id.faq34);
        question35=view.findViewById(R.id.faq35);
        question36=view.findViewById(R.id.faq36);
        question37=view.findViewById(R.id.faq37);
        question38=view.findViewById(R.id.faq38);
        question39=view.findViewById(R.id.faq39);
        question40=view.findViewById(R.id.faq40);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        bool_quesans1=preferences.getBoolean("bool_quesans1", false);
        bool_quesans2=preferences.getBoolean("bool_quesans2", false);
        bool_quesans3=preferences.getBoolean("bool_quesans3", false);
        bool_quesans4=preferences.getBoolean("bool_quesans4", false);
        bool_quesans5=preferences.getBoolean("bool_quesans5", false);
        bool_quesans6=preferences.getBoolean("bool_quesans6", false);
        bool_quesans7=preferences.getBoolean("bool_quesans7", false);
        bool_quesans8=preferences.getBoolean("bool_quesans8", false);
        bool_quesans9=preferences.getBoolean("bool_quesans9", false);
        bool_quesans10=preferences.getBoolean("bool_quesans10", false);
        bool_quesans11=preferences.getBoolean("bool_quesans11", false);
        bool_quesans12=preferences.getBoolean("bool_quesans12", false);
        bool_quesans13=preferences.getBoolean("bool_quesans13", false);
        bool_quesans14=preferences.getBoolean("bool_quesans14", false);
        bool_quesans15=preferences.getBoolean("bool_quesans15", false);
        bool_quesans16=preferences.getBoolean("bool_quesans16", false);
        bool_quesans17=preferences.getBoolean("bool_quesans17", false);
        bool_quesans18=preferences.getBoolean("bool_quesans18", false);
        bool_quesans19=preferences.getBoolean("bool_quesans19", false);
        bool_quesans20=preferences.getBoolean("bool_quesans20", false);
        bool_quesans21=preferences.getBoolean("bool_quesans21", false);
        bool_quesans22=preferences.getBoolean("bool_quesans22", false);
        bool_quesans23=preferences.getBoolean("bool_quesans23", false);
        bool_quesans24=preferences.getBoolean("bool_quesans24", false);
        bool_quesans25=preferences.getBoolean("bool_quesans25", false);
        bool_quesans26=preferences.getBoolean("bool_quesans26", false);
        bool_quesans27=preferences.getBoolean("bool_quesans27", false);
        bool_quesans28=preferences.getBoolean("bool_quesans28", false);
        bool_quesans29=preferences.getBoolean("bool_quesans29", false);
        bool_quesans30=preferences.getBoolean("bool_quesans30", false);
        bool_quesans31=preferences.getBoolean("bool_quesans31", false);
        bool_quesans32=preferences.getBoolean("bool_quesans32", false);
        bool_quesans33=preferences.getBoolean("bool_quesans33", false);
        bool_quesans34=preferences.getBoolean("bool_quesans34", false);
        bool_quesans35=preferences.getBoolean("bool_quesans35", false);
        bool_quesans36=preferences.getBoolean("bool_quesans36", false);
        bool_quesans37=preferences.getBoolean("bool_quesans37", false);
        bool_quesans38=preferences.getBoolean("bool_quesans38", false);
        bool_quesans39=preferences.getBoolean("bool_quesans39", false);
        bool_quesans40=preferences.getBoolean("bool_quesans40", false);

//1-10
        if(bool_quesans1==true){
            container_ans1.setVisibility(View.VISIBLE);
        }else{
            container_ans1.setVisibility(View.GONE);
        }
        if(bool_quesans2==true){
            container_ans2.setVisibility(View.VISIBLE);
        }else{
            container_ans2.setVisibility(View.GONE);
        }
        if(bool_quesans3==true){
            container_ans3.setVisibility(View.VISIBLE);
        }else{
            container_ans3.setVisibility(View.GONE);
        }
        if(bool_quesans4==true){
            container_ans4.setVisibility(View.VISIBLE);
        }else{
            container_ans4.setVisibility(View.GONE);
        }
        if(bool_quesans5==true){
            container_ans5.setVisibility(View.VISIBLE);
        }else{
            container_ans5.setVisibility(View.GONE);
        }
        if(bool_quesans6==true){
            container_ans6.setVisibility(View.VISIBLE);
        }else{
            container_ans6.setVisibility(View.GONE);
        }
        if(bool_quesans7==true){
            container_ans7.setVisibility(View.VISIBLE);
        }else{
            container_ans7.setVisibility(View.GONE);
        }
        if(bool_quesans8==true){
            container_ans8.setVisibility(View.VISIBLE);
        }else{
            container_ans8.setVisibility(View.GONE);
        }
        if(bool_quesans9==true){
            container_ans9.setVisibility(View.VISIBLE);
        }else{
            container_ans9.setVisibility(View.GONE);
        }
        if(bool_quesans10==true){
            container_ans10.setVisibility(View.VISIBLE);
        }else{
            container_ans10.setVisibility(View.GONE);
        }
//11-20
        if(bool_quesans11==true){
            container_ans11.setVisibility(View.VISIBLE);
        }else{
            container_ans11.setVisibility(View.GONE);
        }
        if(bool_quesans12==true){
            container_ans12.setVisibility(View.VISIBLE);
        }else{
            container_ans12.setVisibility(View.GONE);
        }
        if(bool_quesans13==true){
            container_ans13.setVisibility(View.VISIBLE);
        }else{
            container_ans13.setVisibility(View.GONE);
        }
        if(bool_quesans14==true){
            container_ans14.setVisibility(View.VISIBLE);
        }else{
            container_ans14.setVisibility(View.GONE);
        }
        if(bool_quesans15==true){
            container_ans15.setVisibility(View.VISIBLE);
        }else{
            container_ans15.setVisibility(View.GONE);
        }
        if(bool_quesans16==true){
            container_ans16.setVisibility(View.VISIBLE);
        }else{
            container_ans16.setVisibility(View.GONE);
        }
        if(bool_quesans17==true){
            container_ans17.setVisibility(View.VISIBLE);
        }else{
            container_ans17.setVisibility(View.GONE);
        }
        if(bool_quesans18==true){
            container_ans18.setVisibility(View.VISIBLE);
        }else{
            container_ans18.setVisibility(View.GONE);
        }
        if(bool_quesans19==true){
            container_ans19.setVisibility(View.VISIBLE);
        }else{
            container_ans19.setVisibility(View.GONE);
        }
        if(bool_quesans20==true){
            container_ans20.setVisibility(View.VISIBLE);
        }else{
            container_ans20.setVisibility(View.GONE);
        }
//21-30
        if(bool_quesans21==true){
            container_ans21.setVisibility(View.VISIBLE);
        }else{
            container_ans21.setVisibility(View.GONE);
        }
        if(bool_quesans22==true){
            container_ans22.setVisibility(View.VISIBLE);
        }else{
            container_ans22.setVisibility(View.GONE);
        }
        if(bool_quesans23==true){
            container_ans23.setVisibility(View.VISIBLE);
        }else{
            container_ans23.setVisibility(View.GONE);
        }
        if(bool_quesans24==true){
            container_ans24.setVisibility(View.VISIBLE);
        }else{
            container_ans24.setVisibility(View.GONE);
        }
        if(bool_quesans25==true){
            container_ans25.setVisibility(View.VISIBLE);
        }else{
            container_ans25.setVisibility(View.GONE);
        }
        if(bool_quesans26==true){
            container_ans26.setVisibility(View.VISIBLE);
        }else{
            container_ans26.setVisibility(View.GONE);
        }
        if(bool_quesans27==true){
            container_ans27.setVisibility(View.VISIBLE);
        }else{
            container_ans27.setVisibility(View.GONE);
        }
        if(bool_quesans28==true){
            container_ans28.setVisibility(View.VISIBLE);
        }else{
            container_ans28.setVisibility(View.GONE);
        }
        if(bool_quesans29==true){
            container_ans29.setVisibility(View.VISIBLE);
        }else{
            container_ans29.setVisibility(View.GONE);
        }
        if(bool_quesans30==true){
            container_ans30.setVisibility(View.VISIBLE);
        }else{
            container_ans30.setVisibility(View.GONE);
        }

//31-40
        if(bool_quesans31==true){
            container_ans31.setVisibility(View.VISIBLE);
        }else{
            container_ans31.setVisibility(View.GONE);
        }
        if(bool_quesans32==true){
            container_ans32.setVisibility(View.VISIBLE);
        }else{
            container_ans32.setVisibility(View.GONE);
        }
        if(bool_quesans33==true){
            container_ans33.setVisibility(View.VISIBLE);
        }else{
            container_ans33.setVisibility(View.GONE);
        }
        if(bool_quesans34==true){
            container_ans34.setVisibility(View.VISIBLE);
        }else{
            container_ans34.setVisibility(View.GONE);
        }
        if(bool_quesans35==true){
            container_ans35.setVisibility(View.VISIBLE);
        }else{
            container_ans35.setVisibility(View.GONE);
        }
        if(bool_quesans36==true){
            container_ans36.setVisibility(View.VISIBLE);
        }else{
            container_ans36.setVisibility(View.GONE);
        }
        if(bool_quesans37==true){
            container_ans37.setVisibility(View.VISIBLE);
        }else{
            container_ans37.setVisibility(View.GONE);
        }
        if(bool_quesans38==true){
            container_ans38.setVisibility(View.VISIBLE);
        }else{
            container_ans38.setVisibility(View.GONE);
        }
        if(bool_quesans39==true){
            container_ans39.setVisibility(View.VISIBLE);
        }else{
            container_ans39.setVisibility(View.GONE);
        }
        if(bool_quesans40==true){
            container_ans40.setVisibility(View.VISIBLE);
        }else{
            container_ans40.setVisibility(View.GONE);
        }

/*

        if(bool_top1==false){
                    bool_top1=true;
                    editor.putBoolean("bool_topic1",true);
                    editor.apply();
                    container_sT1.setVisibility(View.VISIBLE);
                }else {
                    bool_top1=false;
                    editor.putBoolean("bool_topic1",false);
                    editor.apply();
                    container_sT1.setVisibility(View.GONE);
                }

 */






        SharedPreferences.Editor editor = preferences.edit();
//handle click events of The Questions for Answers
        question1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans1==false){
                    bool_quesans1=true;
                    editor.putBoolean("bool_quesans1",true);
                    editor.apply();
                    container_ans1.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans1=false;
                    editor.putBoolean("bool_quesans1",false);
                    editor.apply();
                    container_ans1.setVisibility(View.GONE);
                }
            }
        });
        question2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans2==false){
                    bool_quesans2=true;
                    editor.putBoolean("bool_quesans2",true);
                    editor.apply();
                    container_ans2.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans2=false;
                    editor.putBoolean("bool_quesans2",false);
                    editor.apply();
                    container_ans2.setVisibility(View.GONE);
                }
            }
        });
        question3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans3==false){
                    bool_quesans3=true;
                    editor.putBoolean("bool_quesans3",true);
                    editor.apply();
                    container_ans3.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans3=false;
                    editor.putBoolean("bool_quesans3",false);
                    editor.apply();
                    container_ans3.setVisibility(View.GONE);
                }
            }
        });
        question4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans4==false){
                    bool_quesans4=true;
                    editor.putBoolean("bool_quesans4",true);
                    editor.apply();
                    container_ans4.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans4=false;
                    editor.putBoolean("bool_quesans4",false);
                    editor.apply();
                    container_ans4.setVisibility(View.GONE);
                }
            }
        });
        question5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans5==false){
                    bool_quesans5=true;
                    editor.putBoolean("bool_quesans5",true);
                    editor.apply();
                    container_ans5.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans5=false;
                    editor.putBoolean("bool_quesans5",false);
                    editor.apply();
                    container_ans5.setVisibility(View.GONE);
                }
            }
        });
        question6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans6==false){
                    bool_quesans6=true;
                    editor.putBoolean("bool_quesans6",true);
                    editor.apply();
                    container_ans6.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans6=false;
                    editor.putBoolean("bool_quesans6",false);
                    editor.apply();
                    container_ans6.setVisibility(View.GONE);
                }
            }
        });
        question7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans7==false){
                    bool_quesans7=true;
                    editor.putBoolean("bool_quesans7",true);
                    editor.apply();
                    container_ans7.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans7=false;
                    editor.putBoolean("bool_quesans7",false);
                    editor.apply();
                    container_ans7.setVisibility(View.GONE);
                }
            }
        });
        question8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans8==false){
                    bool_quesans8=true;
                    editor.putBoolean("bool_quesans8",true);
                    editor.apply();
                    container_ans8.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans8=false;
                    editor.putBoolean("bool_quesans8",false);
                    editor.apply();
                    container_ans8.setVisibility(View.GONE);
                }
            }
        });
        question9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans9==false){
                    bool_quesans9=true;
                    editor.putBoolean("bool_quesans9",true);
                    editor.apply();
                    container_ans9.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans9=false;
                    editor.putBoolean("bool_quesans9",false);
                    editor.apply();
                    container_ans9.setVisibility(View.GONE);
                }
            }
        });
        question10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans10==false){
                    bool_quesans10=true;
                    editor.putBoolean("bool_quesans10",true);
                    editor.apply();
                    container_ans10.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans10=false;
                    editor.putBoolean("bool_quesans10",false);
                    editor.apply();
                    container_ans10.setVisibility(View.GONE);
                }
            }
        });

        question11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans11==false){
                    bool_quesans11=true;
                    editor.putBoolean("bool_quesans11",true);
                    editor.apply();
                    container_ans11.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans11=false;
                    editor.putBoolean("bool_quesans11",false);
                    editor.apply();
                    container_ans11.setVisibility(View.GONE);
                }
            }
        });
        question12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans12==false){
                    bool_quesans12=true;
                    editor.putBoolean("bool_quesans12",true);
                    editor.apply();
                    container_ans12.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans12=false;
                    editor.putBoolean("bool_quesans12",false);
                    editor.apply();
                    container_ans12.setVisibility(View.GONE);
                }
            }
        });
        question13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans13==false){
                    bool_quesans13=true;
                    editor.putBoolean("bool_quesans13",true);
                    editor.apply();
                    container_ans13.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans13=false;
                    editor.putBoolean("bool_quesans13",false);
                    editor.apply();
                    container_ans13.setVisibility(View.GONE);
                }
            }
        });
        question14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans14==false){
                    bool_quesans14=true;
                    editor.putBoolean("bool_quesans14",true);
                    editor.apply();
                    container_ans14.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans14=false;
                    editor.putBoolean("bool_quesans14",false);
                    editor.apply();
                    container_ans14.setVisibility(View.GONE);
                }
            }
        });
        question15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans15==false){
                    bool_quesans15=true;
                    editor.putBoolean("bool_quesans15",true);
                    editor.apply();
                    container_ans15.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans15=false;
                    editor.putBoolean("bool_quesans15",false);
                    editor.apply();
                    container_ans15.setVisibility(View.GONE);
                }
            }
        });
        question16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans16==false){
                    bool_quesans16=true;
                    editor.putBoolean("bool_quesans16",true);
                    editor.apply();
                    container_ans16.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans16=false;
                    editor.putBoolean("bool_quesans16",false);
                    editor.apply();
                    container_ans16.setVisibility(View.GONE);
                }
            }
        });
        question17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans17==false){
                    bool_quesans17=true;
                    editor.putBoolean("bool_quesans17",true);
                    editor.apply();
                    container_ans17.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans17=false;
                    editor.putBoolean("bool_quesans17",false);
                    editor.apply();
                    container_ans17.setVisibility(View.GONE);
                }
            }
        });
        question18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans18==false){
                    bool_quesans18=true;
                    editor.putBoolean("bool_quesans18",true);
                    editor.apply();
                    container_ans18.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans18=false;
                    editor.putBoolean("bool_quesans18",false);
                    editor.apply();
                    container_ans18.setVisibility(View.GONE);
                }
            }
        });
        question19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans19==false){
                    bool_quesans19=true;
                    editor.putBoolean("bool_quesans19",true);
                    editor.apply();
                    container_ans19.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans19=false;
                    editor.putBoolean("bool_quesans19",false);
                    editor.apply();
                    container_ans19.setVisibility(View.GONE);
                }
            }
        });
        question20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans20==false){
                    bool_quesans20=true;
                    editor.putBoolean("bool_quesans20",true);
                    editor.apply();
                    container_ans20.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans20=false;
                    editor.putBoolean("bool_quesans20",false);
                    editor.apply();
                    container_ans20.setVisibility(View.GONE);
                }
            }
        });

        question21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans21==false){
                    bool_quesans21=true;
                    editor.putBoolean("bool_quesans21",true);
                    editor.apply();
                    container_ans21.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans21=false;
                    editor.putBoolean("bool_quesans21",false);
                    editor.apply();
                    container_ans21.setVisibility(View.GONE);
                }
            }
        });
        question22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans22==false){
                    bool_quesans22=true;
                    editor.putBoolean("bool_quesans22",true);
                    editor.apply();
                    container_ans22.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans22=false;
                    editor.putBoolean("bool_quesans22",false);
                    editor.apply();
                    container_ans22.setVisibility(View.GONE);
                }
            }
        });
        question23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans23==false){
                    bool_quesans23=true;
                    editor.putBoolean("bool_quesans23",true);
                    editor.apply();
                    container_ans23.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans23=false;
                    editor.putBoolean("bool_quesans23",false);
                    editor.apply();
                    container_ans23.setVisibility(View.GONE);
                }
            }
        });
        question24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans24==false){
                    bool_quesans24=true;
                    editor.putBoolean("bool_quesans24",true);
                    editor.apply();
                    container_ans24.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans24=false;
                    editor.putBoolean("bool_quesans24",false);
                    editor.apply();
                    container_ans24.setVisibility(View.GONE);
                }
            }
        });
        question25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans25==false){
                    bool_quesans25=true;
                    editor.putBoolean("bool_quesans25",true);
                    editor.apply();
                    container_ans25.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans25=false;
                    editor.putBoolean("bool_quesans25",false);
                    editor.apply();
                    container_ans25.setVisibility(View.GONE);
                }
            }
        });
        question26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans26==false){
                    bool_quesans26=true;
                    editor.putBoolean("bool_quesans26",true);
                    editor.apply();
                    container_ans26.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans26=false;
                    editor.putBoolean("bool_quesans26",false);
                    editor.apply();
                    container_ans26.setVisibility(View.GONE);
                }
            }
        });
        question27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans27==false){
                    bool_quesans27=true;
                    editor.putBoolean("bool_quesans27",true);
                    editor.apply();
                    container_ans27.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans27=false;
                    editor.putBoolean("bool_quesans27",false);
                    editor.apply();
                    container_ans27.setVisibility(View.GONE);
                }
            }
        });
        question28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans28==false){
                    bool_quesans28=true;
                    editor.putBoolean("bool_quesans28",true);
                    editor.apply();
                    container_ans28.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans28=false;
                    editor.putBoolean("bool_quesans28",false);
                    editor.apply();
                    container_ans28.setVisibility(View.GONE);
                }
            }
        });
        question29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans29==false){
                    bool_quesans29=true;
                    editor.putBoolean("bool_quesans29",true);
                    editor.apply();
                    container_ans29.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans29=false;
                    editor.putBoolean("bool_quesans29",false);
                    editor.apply();
                    container_ans29.setVisibility(View.GONE);
                }
            }
        });
        question30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans30==false){
                    bool_quesans30=true;
                    editor.putBoolean("bool_quesans30",true);
                    editor.apply();
                    container_ans30.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans30=false;
                    editor.putBoolean("bool_quesans30",false);
                    editor.apply();
                    container_ans30.setVisibility(View.GONE);
                }
            }
        });

        question31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans31==false){
                    bool_quesans31=true;
                    editor.putBoolean("bool_quesans31",true);
                    editor.apply();
                    container_ans31.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans31=false;
                    editor.putBoolean("bool_quesans31",false);
                    editor.apply();
                    container_ans31.setVisibility(View.GONE);
                }
            }
        });
        question32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans32==false){
                    bool_quesans32=true;
                    editor.putBoolean("bool_quesans32",true);
                    editor.apply();
                    container_ans32.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans32=false;
                    editor.putBoolean("bool_quesans32",false);
                    editor.apply();
                    container_ans32.setVisibility(View.GONE);
                }
            }
        });
        question33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans33==false){
                    bool_quesans33=true;
                    editor.putBoolean("bool_quesans33",true);
                    editor.apply();
                    container_ans33.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans33=false;
                    editor.putBoolean("bool_quesans33",false);
                    editor.apply();
                    container_ans33.setVisibility(View.GONE);
                }
            }
        });
        question34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans34==false){
                    bool_quesans34=true;
                    editor.putBoolean("bool_quesans34",true);
                    editor.apply();
                    container_ans34.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans34=false;
                    editor.putBoolean("bool_quesans34",false);
                    editor.apply();
                    container_ans34.setVisibility(View.GONE);
                }
            }
        });
        question35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans35==false){
                    bool_quesans35=true;
                    editor.putBoolean("bool_quesans35",true);
                    editor.apply();
                    container_ans35.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans35=false;
                    editor.putBoolean("bool_quesans35",false);
                    editor.apply();
                    container_ans35.setVisibility(View.GONE);
                }
            }
        });
        question36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans36==false){
                    bool_quesans36=true;
                    editor.putBoolean("bool_quesans36",true);
                    editor.apply();
                    container_ans36.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans36=false;
                    editor.putBoolean("bool_quesans36",false);
                    editor.apply();
                    container_ans36.setVisibility(View.GONE);
                }
            }
        });
        question37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans37==false){
                    bool_quesans37=true;
                    editor.putBoolean("bool_quesans37",true);
                    editor.apply();
                    container_ans37.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans37=false;
                    editor.putBoolean("bool_quesans37",false);
                    editor.apply();
                    container_ans37.setVisibility(View.GONE);
                }
            }
        });
        question38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans38==false){
                    bool_quesans38=true;
                    editor.putBoolean("bool_quesans38",true);
                    editor.apply();
                    container_ans38.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans38=false;
                    editor.putBoolean("bool_quesans38",false);
                    editor.apply();
                    container_ans38.setVisibility(View.GONE);
                }
            }
        });
        question39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans39==false){
                    bool_quesans39=true;
                    editor.putBoolean("bool_quesans39",true);
                    editor.apply();
                    container_ans39.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans39=false;
                    editor.putBoolean("bool_quesans39",false);
                    editor.apply();
                    container_ans39.setVisibility(View.GONE);
                }
            }
        });
        question40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bool_quesans40==false){
                    bool_quesans40=true;
                    editor.putBoolean("bool_quesans40",true);
                    editor.apply();
                    container_ans40.setVisibility(View.VISIBLE);
                }else {
                    bool_quesans40=false;
                    editor.putBoolean("bool_quesans40",false);
                    editor.apply();
                    container_ans40.setVisibility(View.GONE);
                }
            }
        });



    }
}