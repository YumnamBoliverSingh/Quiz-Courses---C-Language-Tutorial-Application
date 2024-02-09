package com.example.cprogrammingtutorial_easyconceptnoads;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class First_tab extends Fragment {
    private TextView tv11, tv12, tv13, tv14, tv21, tv22, tv23, tv24, tv25, tv26, tv27, tv28, tv31, tv32, tv33, tv34, tv35, tv36, tv37, tv41, tv42, tv43, tv44, tv51, tv52, tv53, tv54, tv61, tv62, tv63, tv64, tv71, tv72, tv73, tv81, tv91, tv92, tv93;
    private TextView tv101, tv102, tv103, tv104, tv105, tv106, tv107, tv108, tv111, tv112, tv113, tv114, tv121, tv122, tv123, tv124, tv125, tv131, tv141, tv142, tv143, tv144, tv145, tv146;
    private boolean bool_top1, bool_top2, bool_top3, bool_top4, bool_top5, bool_top6, bool_top7, bool_top8, bool_top9, bool_top10, bool_top11, bool_top12, bool_top13, bool_top14;
    private ConstraintLayout container_sT1, container_sT2, container_sT3, container_sT4, container_sT5, container_sT6, container_sT7, container_sT8, container_sT9, container_sT10, container_sT11, container_sT12, container_sT13, container_sT14;
    private ConstraintLayout topic1, topic2, topic3, topic4, topic5, topic6, topic7, topic8, topic9, topic10, topic11, topic12, topic13, topic14;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_first_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

        tv11=view.findViewById(R.id.tv_subTops11);
        tv12=view.findViewById(R.id.tv_subTops12);
        tv13=view.findViewById(R.id.tv_subTops13);
        tv14=view.findViewById(R.id.tv_subTops14);

        tv21=view.findViewById(R.id.tv_subTops21);
        tv22=view.findViewById(R.id.tv_subTops22);
        tv23=view.findViewById(R.id.tv_subTops23);
        tv24=view.findViewById(R.id.tv_subTops24);
        tv25=view.findViewById(R.id.tv_subTops25);
        tv26=view.findViewById(R.id.tv_subTops26);
        tv27=view.findViewById(R.id.tv_subTops27);
        tv28=view.findViewById(R.id.tv_subTops28);

        tv31=view.findViewById(R.id.tv_subTops31);
        tv32=view.findViewById(R.id.tv_subTops32);
        tv33=view.findViewById(R.id.tv_subTops33);
        tv34=view.findViewById(R.id.tv_subTops34);
        tv35=view.findViewById(R.id.tv_subTops35);
        tv36=view.findViewById(R.id.tv_subTops36);
        tv37=view.findViewById(R.id.tv_subTops37);

        tv41=view.findViewById(R.id.tv_subTops41);
        tv42=view.findViewById(R.id.tv_subTops42);
        tv43=view.findViewById(R.id.tv_subTops43);
        tv44=view.findViewById(R.id.tv_subTops44);


        tv51=view.findViewById(R.id.tv_subTops51);
        tv52=view.findViewById(R.id.tv_subTops52);
        tv53=view.findViewById(R.id.tv_subTops53);
        tv54=view.findViewById(R.id.tv_subTops54);

        tv61=view.findViewById(R.id.tv_subTops61);
        tv62=view.findViewById(R.id.tv_subTops62);
        tv63=view.findViewById(R.id.tv_subTops63);
        tv64=view.findViewById(R.id.tv_subTops64);

        tv71=view.findViewById(R.id.tv_subTops71);
        tv72=view.findViewById(R.id.tv_subTops72);
        tv73=view.findViewById(R.id.tv_subTops73);

        tv81=view.findViewById(R.id.tv_subTops81);

        tv91=view.findViewById(R.id.tv_subTops91);
        tv92=view.findViewById(R.id.tv_subTops92);
        tv93=view.findViewById(R.id.tv_subTops93);

        tv101=view.findViewById(R.id.tv_subTops101);
        tv102=view.findViewById(R.id.tv_subTops102);
        tv103=view.findViewById(R.id.tv_subTops103);
        tv104=view.findViewById(R.id.tv_subTops104);
        tv105=view.findViewById(R.id.tv_subTops105);
        tv106=view.findViewById(R.id.tv_subTops106);
        tv107=view.findViewById(R.id.tv_subTops107);
        tv108=view.findViewById(R.id.tv_subTops108);

        tv111=view.findViewById(R.id.tv_subTops111);
        tv112=view.findViewById(R.id.tv_subTops112);
        tv113=view.findViewById(R.id.tv_subTops113);
        tv114=view.findViewById(R.id.tv_subTops114);

        tv121=view.findViewById(R.id.tv_subTops121);
        tv122=view.findViewById(R.id.tv_subTops122);
        tv123=view.findViewById(R.id.tv_subTops123);
        tv124=view.findViewById(R.id.tv_subTops124);
        tv125=view.findViewById(R.id.tv_subTops125);

        tv131=view.findViewById(R.id.tv_subTops131);

        tv141=view.findViewById(R.id.tv_subTops141);
        tv142=view.findViewById(R.id.tv_subTops142);
        tv143=view.findViewById(R.id.tv_subTops143);
        tv144=view.findViewById(R.id.tv_subTops144);
        tv145=view.findViewById(R.id.tv_subTops145);
        tv146=view.findViewById(R.id.tv_subTops146);





        container_sT1=view.findViewById(R.id.container_subTopics1);
        container_sT2=view.findViewById(R.id.container_subTopics2);
        container_sT3=view.findViewById(R.id.container_subTopics3);
        container_sT4=view.findViewById(R.id.container_subTopics4);
        container_sT5=view.findViewById(R.id.container_subTopics5);
        container_sT6=view.findViewById(R.id.container_subTopics6);
        container_sT7=view.findViewById(R.id.container_subTopics7);
        container_sT8=view.findViewById(R.id.container_subTopics8);
        container_sT9=view.findViewById(R.id.container_subTopics9);
        container_sT10=view.findViewById(R.id.container_subTopics10);
        container_sT11=view.findViewById(R.id.container_subTopics11);
        container_sT12=view.findViewById(R.id.container_subTopics12);
        container_sT13=view.findViewById(R.id.container_subTopics13);
        container_sT14=view.findViewById(R.id.container_subTopics14);

        topic1=view.findViewById(R.id.topic1);
        topic2=view.findViewById(R.id.topic2);
        topic3=view.findViewById(R.id.topic3);
        topic4=view.findViewById(R.id.topic4);
        topic5=view.findViewById(R.id.topic5);
        topic6=view.findViewById(R.id.topic6);
        topic7=view.findViewById(R.id.topic7);
        topic8=view.findViewById(R.id.topic8);
        topic9=view.findViewById(R.id.topic9);
        topic10=view.findViewById(R.id.topic10);
        topic11=view.findViewById(R.id.topic11);
        topic12=view.findViewById(R.id.topic12);
        topic13=view.findViewById(R.id.topic13);
        topic14=view.findViewById(R.id.topic14);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        bool_top1=preferences.getBoolean("bool_topic1", false);
        bool_top2=preferences.getBoolean("bool_topic2", false);
        bool_top3=preferences.getBoolean("bool_topic3", false);
        bool_top4=preferences.getBoolean("bool_topic4", false);
        bool_top5=preferences.getBoolean("bool_topic5", false);
        bool_top6=preferences.getBoolean("bool_topic6", false);
        bool_top7=preferences.getBoolean("bool_topic7", false);
        bool_top8=preferences.getBoolean("bool_topic8", false);
        bool_top9=preferences.getBoolean("bool_topic9", false);
        bool_top10=preferences.getBoolean("bool_topic10", false);
        bool_top11=preferences.getBoolean("bool_topic11", false);
        bool_top12=preferences.getBoolean("bool_topic12", false);
        bool_top13=preferences.getBoolean("bool_topic13", false);
        bool_top14=preferences.getBoolean("bool_topic14", false);



        if(bool_top1){
            container_sT1.setVisibility(View.VISIBLE);
        }else{
            container_sT1.setVisibility(View.GONE);
        }

        if(bool_top2){
            container_sT2.setVisibility(View.VISIBLE);
        }else{
            container_sT2.setVisibility(View.GONE);
        }

        if(bool_top3){
            container_sT3.setVisibility(View.VISIBLE);
        }else{
            container_sT3.setVisibility(View.GONE);
        }

        if(bool_top4){
            container_sT4.setVisibility(View.VISIBLE);
        }else{
            container_sT4.setVisibility(View.GONE);
        }

        if(bool_top5){
            container_sT5.setVisibility(View.VISIBLE);
        }else{
            container_sT5.setVisibility(View.GONE);
        }

        if(bool_top6){
            container_sT6.setVisibility(View.VISIBLE);
        }else{
            container_sT6.setVisibility(View.GONE);
        }

        if(bool_top7){
            container_sT7.setVisibility(View.VISIBLE);
        }else{
            container_sT7.setVisibility(View.GONE);
        }

        if(bool_top8){
            container_sT8.setVisibility(View.VISIBLE);
        }else{
            container_sT8.setVisibility(View.GONE);
        }

        if(bool_top9){
            container_sT9.setVisibility(View.VISIBLE);
        }else{
            container_sT9.setVisibility(View.GONE);
        }

        if(bool_top10){
            container_sT10.setVisibility(View.VISIBLE);
        }else{
            container_sT10.setVisibility(View.GONE);
        }

        if(bool_top11){
            container_sT11.setVisibility(View.VISIBLE);
        }else{
            container_sT11.setVisibility(View.GONE);
        }

        if(bool_top12){
            container_sT12.setVisibility(View.VISIBLE);
        }else{
            container_sT12.setVisibility(View.GONE);
        }

        if(bool_top13){
            container_sT13.setVisibility(View.VISIBLE);
        }else{
            container_sT13.setVisibility(View.GONE);
        }

        if(bool_top14){
            container_sT14.setVisibility(View.VISIBLE);
        }else{
            container_sT14.setVisibility(View.GONE);
        }

//        container_sT1.setVisibility(View.GONE);
//        container_sT2.setVisibility(View.GONE);
//        container_sT3.setVisibility(View.GONE);
//        container_sT4.setVisibility(View.GONE);
//        container_sT5.setVisibility(View.GONE);
//        container_sT6.setVisibility(View.GONE);
//        container_sT7.setVisibility(View.GONE);
//        container_sT8.setVisibility(View.GONE);
//        container_sT9.setVisibility(View.GONE);
//        container_sT10.setVisibility(View.GONE);
//        container_sT11.setVisibility(View.GONE);
//        container_sT12.setVisibility(View.GONE);
//        container_sT13.setVisibility(View.GONE);
//        container_sT14.setVisibility(View.GONE);

        SharedPreferences.Editor editor = preferences.edit();
        topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(bool_top2==false){
                    bool_top2=true;
                    editor.putBoolean("bool_topic2",true);
                    editor.apply();
                    container_sT2.setVisibility(View.VISIBLE);
                }else {
                    bool_top2=false;
                    editor.putBoolean("bool_topic2",false);
                    editor.apply();
                    container_sT2.setVisibility(View.GONE);
                }
            }
        });
        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(bool_top3==false){
                    bool_top3=true;
                    editor.putBoolean("bool_topic3",true);
                    editor.apply();
                    container_sT3.setVisibility(View.VISIBLE);
                }else {
                    bool_top3=false;
                    editor.putBoolean("bool_topic3",false);
                    editor.apply();
                    container_sT3.setVisibility(View.GONE);
                }
            }
        });
        topic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(bool_top4==false){
                    bool_top4=true;
                    editor.putBoolean("bool_topic4",true);
                    editor.apply();
                    container_sT4.setVisibility(View.VISIBLE);
                }else {
                    bool_top4=false;
                    editor.putBoolean("bool_topic4",false);
                    editor.apply();
                    container_sT4.setVisibility(View.GONE);
                }
            }
        });
        topic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(bool_top5==false){
                    bool_top5=true;
                    editor.putBoolean("bool_topic5",true);
                    editor.apply();
                    container_sT5.setVisibility(View.VISIBLE);
                }else {
                    bool_top5=false;
                    editor.putBoolean("bool_topic5",false);
                    editor.apply();
                    container_sT5.setVisibility(View.GONE);
                }
            }
        });
        topic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top6==false){
                    bool_top6=true;
                    editor.putBoolean("bool_topic6",true);
                    editor.apply();
                    container_sT6.setVisibility(View.VISIBLE);
                }else {
                    bool_top6=false;
                    editor.putBoolean("bool_topic6",false);
                    editor.apply();
                    container_sT6.setVisibility(View.GONE);
                }
            }
        });
        topic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top7==false){
                    bool_top7=true;
                    editor.putBoolean("bool_topic7",true);
                    editor.apply();
                    container_sT7.setVisibility(View.VISIBLE);
                }else {
                    bool_top7=false;
                    editor.putBoolean("bool_topic7",false);
                    editor.apply();
                    container_sT7.setVisibility(View.GONE);
                }
            }
        });
        topic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top8==false){
                    bool_top8=true;
                    editor.putBoolean("bool_topic8",true);
                    editor.apply();
                    container_sT8.setVisibility(View.VISIBLE);
                }else {
                    bool_top8=false;
                    editor.putBoolean("bool_topic8",false);
                    editor.apply();
                    container_sT8.setVisibility(View.GONE);
                }
            }
        });
        topic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
                SharedPreferences.Editor editor = preferences.edit();


                if(bool_top9==false){
                    bool_top9=true;
                    editor.putBoolean("bool_topic9",true);
                    editor.apply();
                    container_sT9.setVisibility(View.VISIBLE);
                }else {
                    bool_top9=false;
                    editor.putBoolean("bool_topic9",false);
                    editor.apply();
                    container_sT9.setVisibility(View.GONE);
                }
            }
        });
        topic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top10==false){
                    bool_top10=true;
                    editor.putBoolean("bool_topic10",true);
                    editor.apply();
                    container_sT10.setVisibility(View.VISIBLE);
                }else {
                    bool_top10=false;
                    editor.putBoolean("bool_topic10",false);
                    editor.apply();
                    container_sT10.setVisibility(View.GONE);
                }
            }
        });
        topic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top11==false){
                    bool_top11=true;
                    editor.putBoolean("bool_topic11",true);
                    editor.apply();
                    container_sT11.setVisibility(View.VISIBLE);
                }else {
                    bool_top11=false;
                    editor.putBoolean("bool_topic11",false);
                    editor.apply();
                    container_sT11.setVisibility(View.GONE);
                }
            }
        });
        topic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(bool_top12==false){
                    bool_top12=true;
                    editor.putBoolean("bool_topic12",true);
                    editor.apply();
                    container_sT12.setVisibility(View.VISIBLE);
                }else {
                    bool_top12=false;
                    editor.putBoolean("bool_topic12",false);
                    editor.apply();
                    container_sT12.setVisibility(View.GONE);
                }
            }
        });
        topic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top13==false){
                    bool_top13=true;
                    editor.putBoolean("bool_topic13",true);
                    editor.apply();
                    container_sT13.setVisibility(View.VISIBLE);
                }else {
                    bool_top13=false;
                    editor.putBoolean("bool_topic13",false);
                    editor.apply();
                    container_sT13.setVisibility(View.GONE);
                }
            }
        });
        topic14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bool_top14==false){
                    bool_top14=true;
                    editor.putBoolean("bool_topic14",true);
                    editor.apply();
                    container_sT14.setVisibility(View.VISIBLE);
                }else {
                    bool_top14=false;
                    editor.putBoolean("bool_topic14",false);
                    editor.apply();
                    container_sT14.setVisibility(View.GONE);
                }
            }
        });




        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 11);
                startActivity(intent);
            }
        });
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 12);
                startActivity(intent);
            }
        });
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 13);
                startActivity(intent);
            }
        });
        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 14);
                startActivity(intent);
            }
        });

        tv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 21);
                startActivity(intent);
            }
        });
        tv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 22);
                startActivity(intent);
            }
        });
        tv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 23);
                startActivity(intent);
            }
        });
        tv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 24);
                startActivity(intent);
            }
        });
        tv25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 25);
                startActivity(intent);
            }
        });
        tv26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 26);
                startActivity(intent);
            }
        });
        tv27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 27);
                startActivity(intent);
            }
        });
        tv28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 28);
                startActivity(intent);
            }
        });

        tv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 31);
                startActivity(intent);
            }
        });
        tv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 32);
                startActivity(intent);
            }
        });
        tv33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 33);
                startActivity(intent);
            }
        });
        tv34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 34);
                startActivity(intent);
            }
        });
        tv35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 35);
                startActivity(intent);
            }
        });
        tv36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 36);
                startActivity(intent);
            }
        });
        tv37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 37);
                startActivity(intent);
            }
        });

        tv41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 41);
                startActivity(intent);
            }
        });
        tv42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 42);
                startActivity(intent);
            }
        });
        tv43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 43);
                startActivity(intent);
            }
        });
        tv44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 44);
                startActivity(intent);
            }
        });

        tv51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 51);
                startActivity(intent);
            }
        });
        tv52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 52);
                startActivity(intent);
            }
        });
        tv53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 53);
                startActivity(intent);
            }
        });
        tv54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 54);
                startActivity(intent);
            }
        });

        tv61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 61);
                startActivity(intent);
            }
        });
        tv62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 62);
                startActivity(intent);
            }
        });
        tv63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 63);
                startActivity(intent);
            }
        });
        tv64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 64);
                startActivity(intent);
            }
        });

        tv71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 71);
                startActivity(intent);
            }
        });
        tv72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 72);
                startActivity(intent);
            }
        });
        tv73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 73);
                startActivity(intent);
            }
        });

        tv81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 81);
                startActivity(intent);
            }
        });

        tv91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 91);
                startActivity(intent);
            }
        });
        tv92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 92);
                startActivity(intent);
            }
        });
        tv93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 93);
                startActivity(intent);
            }
        });

        tv101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 101);
                startActivity(intent);
            }
        });
        tv102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 102);
                startActivity(intent);
            }
        });
        tv103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 103);
                startActivity(intent);
            }
        });
        tv104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 104);
                startActivity(intent);
            }
        });
        tv105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 105);
                startActivity(intent);
            }
        });
        tv106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 106);
                startActivity(intent);
            }

        });
        tv107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 107);
                startActivity(intent);
            }
        });
        tv108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 108);
                startActivity(intent);
            }
        });

        tv111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 111);
                startActivity(intent);
            }
        });
        tv112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 112);
                startActivity(intent);
            }
        });
        tv113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 113);
                startActivity(intent);
            }
        });
        tv114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 114);
                startActivity(intent);
            }
        });

        tv121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 121);
                startActivity(intent);
            }
        });
        tv122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 122);
                startActivity(intent);
            }
        });
        tv123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 123);
                startActivity(intent);
            }
        });
        tv124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 124);
                startActivity(intent);
            }
        });
        tv125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 125);
                startActivity(intent);
            }
        });

        tv131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 131);
                startActivity(intent);
            }
        });


        tv141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 141);
                startActivity(intent);
            }
        });
        tv142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 142);
                startActivity(intent);
            }
        });
        tv143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 143);
                startActivity(intent);
            }
        });
        tv144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 144);
                startActivity(intent);
            }
        });
        tv145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 145);
                startActivity(intent);
            }
        });
        tv146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubTopicsBriefingActivity.class);
                intent.putExtra("int_subChapterKey", 146);
                startActivity(intent);
            }
        });

    }

}