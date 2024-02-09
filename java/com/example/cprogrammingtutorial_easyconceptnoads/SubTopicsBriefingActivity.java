package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

public class SubTopicsBriefingActivity extends AppCompatActivity {
    private ImageView back;
    private TextView tv_body, tv_topic;
    private ImageView iv_the_only_image;
    private CardView cl_previous, cl_next;
    private CardView cv_prev_top, cv_next_top;
    private TextView example, output;
    private ImageView image_view;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_topics_briefing);
        getSupportActionBar().hide();


        Bundle extras = getIntent().getExtras();
        int val = extras.getInt("int_subChapterKey");
        back=findViewById(R.id.backSTBA);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubTopicsBriefingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        tv_body=findViewById(R.id.textViewBodySTBA);
        tv_topic=findViewById(R.id.tv_topicNameSTBA);
        image_view = findViewById(R.id.imageViewSTBA); // get reference to root activity view
        example=findViewById(R.id.textViewStringExampleProgramSTBA);
        output=findViewById(R.id.textViewStringOutputProgramSTBA);

        cl_previous=findViewById(R.id.prevSTBA);
        cl_next=findViewById(R.id.nextSTBA);

        cv_prev_top=findViewById(R.id.prevSTBA_top);
        cv_next_top=findViewById(R.id.nextSTBA_top);

        cv_prev_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(val==12){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 11);
                    startActivity(intent);
                }
                if(val==13){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 12);
                    startActivity(intent);
                }
                if(val==14){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 13);
                    startActivity(intent);
                }
                if(val==23){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 22);
                    startActivity(intent);
                }
                if(val==24){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 23);
                    startActivity(intent);
                }
                if(val==25){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 24);
                    startActivity(intent);
                }
                if(val==26){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 25);
                    startActivity(intent);
                }
                if(val==27){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 26);
                    startActivity(intent);
                }
                if(val==28){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 27);
                    startActivity(intent);
                }
                if(val==31){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 28);
                    startActivity(intent);
                }
                if(val==32){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 31);
                    startActivity(intent);
                }
                if(val==33){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 32);
                    startActivity(intent);
                }
                if(val==34){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 33);
                    startActivity(intent);
                }
                if(val==35){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 34);
                    startActivity(intent);
                }
                if(val==36){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 35);
                    startActivity(intent);
                }
                if(val==37){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 36);
                    startActivity(intent);
                }
                if(val==42){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 41);
                    startActivity(intent);
                }
                if(val==43){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 42);
                    startActivity(intent);
                }
                if(val==44){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 43);
                    startActivity(intent);
                }
                if(val==52){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 51);
                    startActivity(intent);
                }
                if(val==53){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 52);
                    startActivity(intent);
                }
                if(val==54){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 53);
                    startActivity(intent);
                }
                if(val==61){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 54);
                    startActivity(intent);
                }
                if(val==62){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 61);
                    startActivity(intent);
                }
                if(val==63){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 62);
                    startActivity(intent);
                }
                if(val==64){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 63);
                    startActivity(intent);
                }
                if(val==71){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 64);
                    startActivity(intent);
                }
                if(val==72){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 71);
                    startActivity(intent);
                }
                if(val==73){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 72);
                    startActivity(intent);
                }
                if(val==81){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 73);
                    startActivity(intent);
                }
                if(val==91){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 81);
                    startActivity(intent);
                }
                if(val==92){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 91);
                    startActivity(intent);
                }
                if(val==93){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 92);
                    startActivity(intent);
                }
                if(val==101){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 93);
                    startActivity(intent);
                }
                if(val==102){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 101);
                    startActivity(intent);
                }
                if(val==103){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 102);
                    startActivity(intent);
                }
                if(val==104){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 103);
                    startActivity(intent);
                }
                if(val==105){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 104);
                    startActivity(intent);
                }
                if(val==106){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 105);
                    startActivity(intent);
                }
                if(val==107){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 106);
                    startActivity(intent);
                }
                if(val==108){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 107);
                    startActivity(intent);
                }
                if(val==111){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 108);
                    startActivity(intent);
                }
                if(val==112){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 111);
                    startActivity(intent);
                }
                if(val==113){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 112);
                    startActivity(intent);
                }
                if(val==114){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 113);
                    startActivity(intent);
                }
                if(val==121){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 114);
                    startActivity(intent);
                }
                if(val==122){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 121);
                    startActivity(intent);
                }
                if(val==123){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 122);
                    startActivity(intent);
                }
                if(val==124){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 123);
                    startActivity(intent);
                }
                if(val==125){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 124);
                    startActivity(intent);
                }
                if(val==142){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 141);
                    startActivity(intent);
                }
                if(val==143){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 142);
                    startActivity(intent);
                }
                if(val==144){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 143);
                    startActivity(intent);
                }
                if(val==145){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 144);
                    startActivity(intent);
                }
                if(val==146){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 145);
                    startActivity(intent);
                }

            }
        });
        cv_next_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(val==12){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 13);
                    startActivity(intent);
                }
                if(val==13){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 14);
                    startActivity(intent);
                }
                if(val==14){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 21);
                    startActivity(intent);
                }
                if(val==23){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 24);
                    startActivity(intent);
                }
                if(val==24){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 25);
                    startActivity(intent);
                }
                if(val==25){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 26);
                    startActivity(intent);
                }
                if(val==26){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 27);
                    startActivity(intent);
                }
                if(val==27){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 28);
                    startActivity(intent);
                }
                if(val==28){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 31);
                    startActivity(intent);
                }
                if(val==31){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 32);
                    startActivity(intent);
                }
                if(val==32){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 33);
                    startActivity(intent);
                }
                if(val==33){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 34);
                    startActivity(intent);
                }
                if(val==34){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 35);
                    startActivity(intent);
                }
                if(val==35){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 36);
                    startActivity(intent);
                }
                if(val==36){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 37);
                    startActivity(intent);
                }
                if(val==37){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 41);
                    startActivity(intent);
                }
                if(val==42){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 43);
                    startActivity(intent);
                }
                if(val==43){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 44);
                    startActivity(intent);
                }
                if(val==44){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 51);
                    startActivity(intent);
                }
                if(val==52){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 53);
                    startActivity(intent);
                }
                if(val==53){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 54);
                    startActivity(intent);
                }
                if(val==54){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 61);
                    startActivity(intent);
                }
                if(val==61){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 62);
                    startActivity(intent);
                }
                if(val==62){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 63);
                    startActivity(intent);
                }
                if(val==63){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 64);
                    startActivity(intent);
                }
                if(val==64){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 71);
                    startActivity(intent);
                }
                if(val==71){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 72);
                    startActivity(intent);
                }
                if(val==72){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 73);
                    startActivity(intent);
                }
                if(val==73){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 81);
                    startActivity(intent);
                }
                if(val==81){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 91);
                    startActivity(intent);
                }
                if(val==91){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 92);
                    startActivity(intent);
                }
                if(val==92){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 93);
                    startActivity(intent);
                }
                if(val==93){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 101);
                    startActivity(intent);
                }
                if(val==101){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 102);
                    startActivity(intent);
                }
                if(val==102){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 103);
                    startActivity(intent);
                }
                if(val==103){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 104);
                    startActivity(intent);
                }
                if(val==104){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 105);
                    startActivity(intent);
                }
                if(val==105){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 106);
                    startActivity(intent);
                }
                if(val==106){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 107);
                    startActivity(intent);
                }
                if(val==107){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 108);
                    startActivity(intent);
                }
                if(val==108){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 111);
                    startActivity(intent);
                }
                if(val==111){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 112);
                    startActivity(intent);
                }
                if(val==112){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 113);
                    startActivity(intent);
                }
                if(val==113){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 114);
                    startActivity(intent);
                }
                if(val==114){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 121);
                    startActivity(intent);
                }
                if(val==121){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 122);
                    startActivity(intent);
                }
                if(val==122){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 123);
                    startActivity(intent);
                }
                if(val==123){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 124);
                    startActivity(intent);
                }
                if(val==124){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 125);
                    startActivity(intent);
                }
                if(val==125){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 131);
                    startActivity(intent);
                }
                if(val==142){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 143);
                    startActivity(intent);
                }
                if(val==143){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, Internet_std_library.class);
                    intent.putExtra("internet_no", 144);
                    startActivity(intent);
                }
//                if(val==144){
//                    Intent intent = new Intent(SubTopicsBriefingActivity.this, Internet_std_library.class);
//                    intent.putExtra("internet_no", 145);
//                    startActivity(intent);
//                }
//                if(val==145){
//                    Intent intent = new Intent(SubTopicsBriefingActivity.this, Internet_std_library.class);
//                    intent.putExtra("internet_no", 146);
//                    startActivity(intent);
//                }
//                if(val==146){
//                    //Code not important ..
//                    //hide/GONE the NExt
//                }
            }
        });

        if(val==12){
            tv_body.setText(R.string.string_body12);
            tv_topic.setText(R.string.string_sCs12);
            example.setText("#include <stdio.h>\n\tint main() {\n\t\t //printf() displays the string inside quotation\n\t\tprintf(\"Hello, World!\");\n\t\treturn 0;\n\t}.");
            output.setText(R.string.string_output1);
            image_view.setImageResource(R.drawable.img_subtops2x);
        }


        zoomControls = findViewById(R.id.zoom_controls);
        zoomControls.hide();
        image_view.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                zoomControls.show();
                return false;
            }
        });
        zoomControls.setOnZoomInClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                float x = view.getScaleX();
                float y = view.getScaleY();
                image_view.setScaleX((float) (x+1));
                image_view.setScaleY((float) (y+1));
                zoomControls.hide();

            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = view.getScaleX();
                float y = view.getScaleY();
                if ( x== 1 && y==1){
                    image_view.setScaleX(x);
                    image_view.setScaleY(y);
                }else{
                    image_view.setScaleX((float) (x+1));
                    image_view.setScaleY((float) (y-1));
                    zoomControls.hide();
                }
            }
        });


        if(val==13){
            tv_body.setText(R.string.string_body13);
            tv_topic.setText(R.string.string_sCs13);
            example.setText("#include<stdio.h>\n\t\n\tint main(){\n\t\tint a, b, sum;\n\t\tprintf(\"Enter two integers: \");\n\t\tscanf(\"%d %d\", &amp;a, &amp;b);\n\t\n\t// calculating sum\n\t\tsum = a + b; \n\t\tprintf(\"%d + %d = %d\", a, b, sum);\n\t\treturn 0;\n\t}.");
            output.setText(R.string.string_output2);
            image_view.setImageResource(R.drawable.img_subtops3);

        }
        if(val==14){
            tv_body.setText(R.string.string_body14);
            tv_topic.setText(R.string.string_sCs14);
            example.setText("#include<stdio.h>\n\t\n\tint main(){\n\t\tint a, b, sum;\n\t\tprintf(\"Enter two integers: \");\n\t\tscanf(\"%d %d\", &amp;a, &amp;b);\n\t\n\t\t// calculating sum\n\t\tsum = a + b; \n\t\tprintf(\"%d + %d = %d\", a, b, sum);\n\t\treturn 0;\n\t}.");
            output.setText(R.string.string_output3);
            image_view.setImageResource(R.drawable.img_subtops4);

        }

        if(val==23){
            tv_body.setText(R.string.string_body23);
            tv_topic.setText(R.string.string_sCs23);
            example.setText("#include<stdio.h>\n\tint main(){\n\tconst float PI=3.14;\n\tprintf(\"The value of PI is: %f\",PI);\n\treturn 0;\n\t}     .");
            output.setText(R.string.string_output110);
            image_view.setImageResource(R.drawable.img_subtops5);

        }
        if(val==24){
            tv_body.setText(R.string.string_body24);
            tv_topic.setText(R.string.string_sCs24);
            example.setText("// Program to illustrate the declaration of variables in C\n\t#include <stdio.h>\n\tint main()\n\t{\n\t// declaring alpha variable with value 10.\n\tint alpha = 10;\n\t// declaring beta variable with value 20.\n\tint beta = 20;\n\t// declaring c variable without initializing it.\n\tint c=0;\n\t// Checking the initial value of c variable.\n\tprintf(\"The initial value of c is %d\n\t\", c);\n\tc= alpha + beta;\n\t// printing C variable value.\n\tprintf(\"The sum of alpha and beta is %d\", c);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output111);
            image_view.setImageResource(R.drawable.img_subtops6);

        }
        if(val==25){
            tv_body.setText(R.string.string_body25);
            tv_topic.setText(R.string.string_sCs25);
            example.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint n, i, sum = 0;\n\t\n\tprintf(\"Enter a positive integer: \");\n\tscanf(\"%d\", &n);\n\t\n\tfor (i = 1; i <= n; ++i) {\n\tsum += i;\n\t}\n\t\n\tprintf(\"Sum = %d\", sum);\n\treturn 0;\n\t}\n\t.");
            output.setText(R.string.string_output58);
            image_view.setImageResource(R.drawable.img_subtops7);

        }
        if(val==26){
            tv_body.setText(R.string.string_body26);
            tv_topic.setText(R.string.string_sCs26);
            example.setText("#include<stdio.h>\n\t#include<stdlib.h>\n\t\n\tint main(){\n\tint a[10][10],b[10][10],mul[10][10],r,c,i,j,k;\n\tsystem(\"cls\");\n\tprintf(\"enter the number of row=\");\n\tscanf(\"%d\",&r);\n\tprintf(\"enter the number of column=\");\n\tscanf(\"%d\",&c);\n\tprintf(\"enter the first matrix element=\n\t\");\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tscanf(\"%d\",&a[i][j]);\n\t}\n\t}\n\tprintf(\"enter the second matrix element=\n\t\");\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tscanf(\"%d\",&b[i][j]);\n\t}\n\t}\n\t\n\tprintf(\"multiply of the matrix=\n\t\");\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tmul[i][j]=0;\n\tfor(k=0;k<c;k++)\n\t{\n\tmul[i][j]+=a[i][k]*b[k][j];\n\t}\n\t}\n\t}\n\t\n\t//for printing result\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tprintf(\"%d\t\",mul[i][j]);\n\t}\n\tprintf(\"\n\t\");\n\t}\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output3);
            image_view.setImageResource(R.drawable.img_subtops8);

        }
        if(val==27){
            tv_body.setText(R.string.string_body27);
            tv_topic.setText(R.string.string_sCs27);
            example.setText("#include <stdio.h>\n\t\n\tmain() {\n\t\n\tint a = 21;\n\tint c ;\n\t\n\tc =  a;\n\tprintf(\"Line 1 - =  Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc +=  a;\n\tprintf(\"Line 2 - += Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc -=  a;\n\tprintf(\"Line 3 - -= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc *=  a;\n\tprintf(\"Line 4 - *= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc /=  a;\n\tprintf(\"Line 5 - /= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc  = 200;\n\tc %=  a;\n\tprintf(\"Line 6 - %= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc <<=  2;\n\tprintf(\"Line 7 - <<= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc >>=  2;\n\tprintf(\"Line 8 - >>= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc &=  2;\n\tprintf(\"Line 9 - &= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc ^=  2;\n\tprintf(\"Line 10 - ^= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc |=  2;\n\tprintf(\"Line 11 - |= Operator Example, Value of c = %d\n\t\", c );\n\t}.");
            output.setText(R.string.string_output45);
            image_view.setImageResource(R.drawable.img_subtops9);

        }
        if(val==28){
            tv_body.setText(R.string.string_body28);
            tv_topic.setText(R.string.string_sCs28);
            example.setText("#include <stdio.h>\n\t\n\t/* function declaration */\n\tvoid swap(int x, int y);\n\t\n\tint main () {\n\t\n\t/* local variable definition */n\n\tint a = 100;\n\tint b = 200;\n\t\n\tprintf(\"Before swap, value of a : %d\n\t\", a );\n\tprintf(\"Before swap, value of b : %d\n\t\", b );\n\t\n\t/* calling a function to swap the values */\n\tswap(a, b);\n\t\n\tprintf(\"After swap, value of a : %d\n\t\", a );\n\tprintf(\"After swap, value of b : %d\n\t\", b );\n\t\n\treturn 0;\n\t}\n\tvoid swap(int x, int y) {\n\t\n\tint temp;\n\t\n\ttemp = x; /* save the value of x */\n\tx = y;    /* put y into x */\n\ty = temp; /* put temp into y */\n\t\n\treturn;\n\t}.");
            output.setText(R.string.string_output37);
            image_view.setImageResource(R.drawable.img_subtops10);

        }

        if(val==31){
            tv_body.setText(R.string.string_body31);
            tv_topic.setText(R.string.string_sCs31);
            example.setText("   #include <stdio.h>\n\t#include <stdlib.h>\n\t#include <string.h>\n\t\n\t#define MAX_LINE_LENGTH 80\n\t\n\tint main(int argc, char **argv)\n\t{\n\tchar *path;\n\tchar line[MAX_LINE_LENGTH] = {0};\n\tunsigned int line_count = 0;\n\t\n\tif (argc < 1)\n\treturn EXIT_FAILURE;\n\tpath = argv[1];\n\t\n\t/* Open file */\n\tFILE *file = fopen(path, \"r\");\n\t\n\tif (!file)\n\t{\n\tperror(path);\n\treturn EXIT_FAILURE;\n\t}\n\t\n\t/* Get each line until there are none left */\n\twhile (fgets(line, MAX_LINE_LENGTH, file))\n\t{\n\t/* Print each line */\n\tprintf(\"line[%06d]: %s\", ++line_count, line);\n\t\n\t/* Add a trailing newline to lines that don't already have one */\n\tif (line[strlen(line) - 1] != '\n\t')\n\t\n\tprintf(\"\n\t\");\n\t\n\t}\n\t\n\t/* Close file */\n\tif (fclose(file))\n\t{\n\treturn EXIT_FAILURE;\n\tperror(path);\n\t}\n\t}.");
            output.setText(R.string.string_output12);
            image_view.setImageResource(R.drawable.img_subtops11s);

        }
        if(val==32){
            tv_body.setText(R.string.string_body32);
            tv_topic.setText(R.string.string_sCs32);
            example.setText("   #include <stdio.h>\n\t#include <stdlib.h>\n\t#include <string.h>\n\t\n\t#define MAX_LINE_LENGTH 80\n\t\n\tint main(int argc, char **argv)\n\t{\n\tchar *path;\n\tchar line[MAX_LINE_LENGTH] = {0};\n\tunsigned int line_count = 0;\n\t\n\tif (argc < 1)\n\treturn EXIT_FAILURE;\n\tpath = argv[1];\n\t\n\t/* Open file */\n\tFILE *file = fopen(path, \"r\");\n\t\n\tif (!file)\n\t{\n\tperror(path);\n\treturn EXIT_FAILURE;\n\t}\n\t\n\t/* Get each line until there are none left */\n\twhile (fgets(line, MAX_LINE_LENGTH, file))\n\t{\n\t/* Print each line */\n\tprintf(\"line[%06d]: %s\", ++line_count, line);\n\t\n\t/* Add a trailing newline to lines that don't already have one */\n\tif (line[strlen(line) - 1] != '\n\t')\n\t\n\tprintf(\"\n\t\");\n\t\n\t}\n\t\n\t/* Close file */\n\tif (fclose(file))\n\t{\n\treturn EXIT_FAILURE;\n\tperror(path);\n\t}\n\t}.");
            output.setText(R.string.string_output12);
            image_view.setImageResource(R.drawable.img_subtops12);

        }
        if(val==33){
            tv_body.setText(R.string.string_body33);
            tv_topic.setText(R.string.string_sCs33);
            example.setText("#include <stdio.h>\n\t\n\tint main() {\n\t\n\t variables to store the three numbers\n\t\n\tint a, b, c;\n\t\n\t//take input from the user\n\tscanf(\"%d %d %d\",&a, &b, &c);\n\t\n\t//if else condition to check whether first two numbers are equal\n\tif (a == b) {\n\t//nested if else condition to check if c is equal to a and b\n\tif (a == c) {\t        \n\t//all are equal\n\tprintf(\"Yes\");\n\t} else {\n\t//all are not equal\n\tprintf(\"No\");\n\t}\n\t} else {\n\t//the first two numbers are not equal, so they are not equal\n\tprintf(\"No\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output7);
            image_view.setImageResource(R.drawable.img_subtops1315);

        }
        if(val==34){
            tv_body.setText(R.string.string_body34);
            tv_topic.setText(R.string.string_sCs34);
            example.setText("#include <stdbool.h> // Header-file for boolean data-type.\n\tint main() {\n\tbool x=false;  // Declaration and initialization of boolean variable.\n\tif (x==true) {  // Conditional statement.\n\tprintf(\"The value of x is true\");\n\t} else {\n\tprintf(\"The value of x is false\");\n\t}\n\t\n\treturn 0;\n\t// Output: The value of x is false\n\t}.");
            output.setText(R.string.string_output112);
            image_view.setImageResource(R.drawable.img_subtops14);

        }
        if(val==35){
            tv_body.setText(R.string.string_body35);
            tv_topic.setText(R.string.string_sCs35);
            example.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint i=0;for(i=1;i<=10;i++){\n\tprintf(\"%d \n\t\",i);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output9);
            image_view.setImageResource(R.drawable.img_subtops16);

        }
        if(val==36){
            tv_body.setText(R.string.string_body36);
            tv_topic.setText(R.string.string_sCs36);
            example.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint i=0;for(i=1;i<=10;i++){\n\tprintf(\"%d \n\t\",i);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output8);
            image_view.setImageResource(R.drawable.img_subtops17);

        }
        if(val==37){
            tv_body.setText(R.string.string_body37);
            tv_topic.setText(R.string.string_sCs37);
            example.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint i;\n\t\n\tprintf(\"Break code: \n\t\");\n\tfor (i = 0; i < 10; i++) {\n\tif (i == 4) {\n\tbreak;\n\t}\n\tprintf(\"%d\n\t\", i);\n\t}\n\tprintf(\"\n\tContinue code:\n\t\");\n\tfor (i = 0; i < 10; i++) {\n\tif (i == 4) {\n\tcontinue;\n\t}\n\tprintf(\"%d\n\t\", i);\n\t}\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output113);
            image_view.setImageResource(R.drawable.img_subtops19);

        }

        if(val==42){
            tv_body.setText(R.string.string_body42);
            tv_topic.setText(R.string.string_sCs42);
            example.setText("#include <stdio.h>\n\t// variable with file scope\n\tint x = 10;\n\t\n\tvoid func() {\n\t// x is available in func() function,\n\t// x now equals 10 + 10 = 20\n\tx += 10;\n\tprintf(\"Value of x is %d\n\t\", x);\n\t}\n\t\n\tint main() {\n\tfunc();\n\t// x is also available in main() function\n\tx += 30; // x now equals 20 + 30 = 50\n\tprintf(\"Value of x is %d\", x);\n\treturn 0;\n\t}\n\t.");
            output.setText(R.string.string_output114);
            image_view.setImageResource(R.drawable.img_subtops21);

        }
        if(val==43){
            tv_body.setText(R.string.string_body43);
            tv_topic.setText(R.string.string_sCs43);
            example.setText("#include <stdio.h>\n\tint main() {\n\tstatic int a;\n\tint b;\n\tprintf(\"Default value of static variable : %d\n\t\", a);\n\tprintf(\"Default value of non-static variable : %d\n\t\", b);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output115);
            image_view.setImageResource(R.drawable.img_subtops22);

        }
        if(val==44){
            tv_body.setText(R.string.string_body44);
            tv_topic.setText(R.string.string_sCs44);
            example.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint n, i, sum = 0;\n\t\n\tprintf(\"Enter a positive integer: \");\n\tscanf(\"%d\", &n);\n\t\n\tfor (i = 1; i <= n; ++i) {\n\tsum += i;\n\t}\n\t\n\tprintf(\"Sum = %d\", sum);\n\treturn 0;\n\t}\n\t.");
            output.setText(R.string.string_output58);
            image_view.setImageResource(R.drawable.img_subtops23);

        }


        if(val==52){
            tv_body.setText(R.string.string_body52);
            tv_topic.setText(R.string.string_sCs52);
            example.setText("#include <stdio.h>\n\tint add (int,int); /* function prototype for add */\n\t\n\tvoid main()\n\t{\n\tprintf(\"%d\n\t\",add(3,5));\n\t}\n\t\n\tint add(int i, int j)\n\t{\n\treturn i+j;\n\t}.");
            output.setText(R.string.string_output116);
            image_view.setImageResource(R.drawable.img_subtops24);
        }
        if(val==53){
            tv_body.setText(R.string.string_body53);
            tv_topic.setText(R.string.string_sCs53);
            example.setText("/* Basic philosophy of function pointer in callback */\n\t#include<stdio.h>\n\t#include<string.h>\n\t\n\tint func(char *s)\n\t{\n\tprintf(\"Callback recieved : %s\",s);\n\treturn 0;\n\t}\n\t\n\tfloat divide(unsigned int a, unsigned int b, int(*status_callback)(char*))\n\t{\n\tstatus_callback(\"\n\t Recieved values...validating\n\t\");\n\tif(b == 0)\n\t{\n\tstatus_callback(\"\n\t b = 0 detected, aborting....\n\t\");\n\treturn -1;\n\t}\n\tstatus_callback(\"\n\t Validation complete, performing division\n\t\");\n\tfloat ret = a/b;\n\tstatus_callback(\"\n\t Division complete, returning value\n\t\");\n\treturn ret;\n\t}\n\t\n\t\n\tint main(void)\n\t{\n\tint(*func_ptr)(char*);\n\tunsigned int a = 6, b = 3;\n\tprintf(\"\n\t This is a prgram to find a/b\n\t\");\n\t\n\tfunc_ptr = func;\n\t\n\tfloat ret = divide(a,b,func_ptr);\n\tprintf(\"\n\t divide returned [%f]\n\t\",ret);\n\t\n\treturn 0;\n\t\n\t}.");
            output.setText(R.string.string_output117);
            image_view.setImageResource(R.drawable.img_subtops25);

        }
        if(val==54){
            tv_body.setText(R.string.string_body54);
            tv_topic.setText(R.string.string_sCs54);
            example.setText("Separate Compilation Program Unavailable.");
            output.setText(R.string.string_output118);
            image_view.setImageResource(R.drawable.img_subtops26);

        }

        if(val==61){
            tv_body.setText(R.string.string_body61);
            tv_topic.setText(R.string.string_sCs61);
            example.setText("#include<stdio.h>\n\t\n\tint main()\n\t\n\t{ float b ,h, area;\n\t\n\tb= 5;\n\t\n\th= 13;\n\t\n\tarea = (b*h) / 2 ;\n\t\n\t\n\tprintf(\"\n\t\n\t Area of Triangle is: %f\",area);\n\t\n\treturn (0);\n\t}  .");
            output.setText(R.string.string_output57);
            image_view.setImageResource(R.drawable.img_subtops27);

        }
        if(val==62){
            tv_body.setText(R.string.string_body62);
            tv_topic.setText(R.string.string_sCs62);
            example.setText("#include <stdio.h>\n\tint main( ) {\n\t\n\tchar str[100];\n\tint i;\n\t\n\tprintf( \"Enter a value :\");\n\tscanf(\"%s %d\", str, &i);\n\t\n\tprintf( \"\n\tYou entered: %s %d \", str, i);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output119);
            image_view.setImageResource(R.drawable.img_subtops28);

        }
        if(val==63){
            tv_body.setText(R.string.string_body63);
            tv_topic.setText(R.string.string_sCs63);
            example.setText("   #include <stdio.h>\n\t#include <stdlib.h>\n\t#include <string.h>\n\t\n\t#define MAX_LINE_LENGTH 80\n\t\n\tint main(int argc, char **argv)\n\t{\n\tchar *path;\n\tchar line[MAX_LINE_LENGTH] = {0};\n\tunsigned int line_count = 0;\n\t\n\tif (argc < 1)\n\treturn EXIT_FAILURE;\n\tpath = argv[1];\n\t\n\t/* Open file */\n\tFILE *file = fopen(path, \"r\");\n\t\n\tif (!file)\n\t{\n\tperror(path);\n\treturn EXIT_FAILURE;\n\t}\n\t\n\t/* Get each line until there are none left */\n\twhile (fgets(line, MAX_LINE_LENGTH, file))\n\t{\n\t/* Print each line */\n\tprintf(\"line[%06d]: %s\", ++line_count, line);\n\t\n\t/* Add a trailing newline to lines that don't already have one */\n\tif (line[strlen(line) - 1] != '\n\t')\n\t\n\tprintf(\"\n\t\");\n\t\n\t}\n\t\n\t/* Close file */\n\tif (fclose(file))\n\t{\n\treturn EXIT_FAILURE;\n\tperror(path);\n\t}\n\t}.");
            output.setText(R.string.string_output120);
            image_view.setImageResource(R.drawable.img_subtops29);

        }
        if(val==64){
            tv_body.setText(R.string.string_body64);
            tv_topic.setText(R.string.string_sCs64);
            example.setText("#include <stdio.h>\n\tint main()\n\t{\n\tint a;\n\tfloat b;\n\tint x = scanf(\"%d%f\", &a, &b);\n\tprintf(\"Decimal Number is : %d\n\t\",a);\n\tprintf(\"Floating-Point Number is : %f\n\t\",b);\n\tprintf(\"Return Value: %d\",x);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output121);
            image_view.setImageResource(R.drawable.img_subtops30);

        }

        if(val==71){
            tv_body.setText(R.string.string_body71);
            tv_topic.setText(R.string.string_sCs71);
            example.setText("#include <stdio.h>\n\t\n\tmain() {\n\t\n\tint a = 21;\n\tint c ;\n\t\n\tc =  a;\n\tprintf(\"Line 1 - =  Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc +=  a;\n\tprintf(\"Line 2 - += Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc -=  a;\n\tprintf(\"Line 3 - -= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc *=  a;\n\tprintf(\"Line 4 - *= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc /=  a;\n\tprintf(\"Line 5 - /= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc  = 200;\n\tc %=  a;\n\tprintf(\"Line 6 - %= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc <<=  2;\n\tprintf(\"Line 7 - <<= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc >>=  2;\n\tprintf(\"Line 8 - >>= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc &=  2;\n\tprintf(\"Line 9 - &= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc ^=  2;\n\tprintf(\"Line 10 - ^= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc |=  2;\n\tprintf(\"Line 11 - |= Operator Example, Value of c = %d\n\t\", c );\n\t}.");
            output.setText(R.string.string_output45);
            image_view.setImageResource(R.drawable.img_subtops31);

        }
        if(val==72){
            tv_body.setText(R.string.string_body72);
            tv_topic.setText(R.string.string_sCs72);
            example.setText("#include <stdio.h>\n\t#include <conio.h>\n\tint main ()\n\t{\n\t// declare integer variables\n\tint x, y, z;\n\tprintf (\" Input the value of X: \");\n\tscanf (\" %d\", &x);\n\tprintf (\"  Input the value of Y: \");\n\tscanf (\" %d\", &y);\n\tprintf (\" Input the value of Z: \");\n\tscanf (\" %d\", &z);\n\t// use pre increment operator to update the value by 1\n\t++x;\n\t++y;\n\t++z;\n\t\n\tprintf (\" \n\t The updated value of the X: %d \", x);\n\tprintf (\" \n\t The updated value of the Y: %d \", y);\n\tprintf (\" \n\t The updated value of the Z: %d \", z);\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output143);
            image_view.setImageResource(R.drawable.img_subtops32);

        }
        if(val==73){
            tv_body.setText(R.string.string_body73);
            tv_topic.setText(R.string.string_sCs73);
            example.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint answer_1 = 0; // stores order evaluated answer\n\tint answer_2 = 0; // stores left to right evaluation\n\t\n\tanswer_1 = 2 * 3 + 4 / 2;\n\tanswer_2 = 2 * (3 + 4) / 2;\n\t\n\tprintf(\"Answer with order of evaluation: %d\n\t\", answer_1);\n\tprintf(\"Answer without order of evaluation: %d\n\t\", answer_2);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output122);
            image_view.setImageResource(R.drawable.img_subtops33);

        }

        if(val==81){
            tv_body.setText(R.string.string_body81);
            tv_topic.setText(R.string.string_sCs8x);
            example.setText("#include <stdio.h>\n\tint main()\n\t{\n\tint a = 1;\n\tchar b = 'G';\n\tdouble c = 3.14;\n\tprintf(\"Hello World!\n\t\");\n\t\n\t// printing the variables defined\n\t// above along with their sizes\n\tprintf(\"Hello! I am a character. My value is %c and \"\n\t\n\t\"my size is %lu byte.\n\t\",\n\t\n\tb, sizeof(char));\n\t// can use sizeof(b) above as well\n\t\n\tprintf(\"Hello! I am an integer. My value is %d and \"\n\t\n\t\"my size is %lu  bytes.\n\t\",\n\t\n\ta, sizeof(int));\n\t// can use sizeof(a) above as well\n\t\n\tprintf(\"Hello! I am a double floating point variable.\"\n\t\n\t\" My value is %lf and my size is %lu bytes.\n\t\",\n\t\n\tc, sizeof(double));\n\t// can use sizeof(c) above as well\n\t\n\tprintf(\"Bye! See you soon. :)\n\t\");\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output123);
            image_view.setImageResource(R.drawable.img_subtops34);

        }

        if(val==91){
            tv_body.setText(R.string.string_body91);
            tv_topic.setText(R.string.string_sCs91);
            example.setText("#include<stdio.h>\n\t#include \"circle.c\"\n\t#include \"circle.h\"\n\t\n\t#define PI 3.14159265358979323846\n\tdouble circle_area(float, float);\n\t\n\tint main()\n\t{\n\tfloat r = 4.0;\n\tprintf(\"%.2f\", circle_area(r, PI));\n\treturn 0;\n\t}\n\t\n\tdouble circle_area(float r, float PI){\n\treturn (PI * r * r);\n\t}.");
            output.setText(R.string.string_output124);
            image_view.setImageResource(R.drawable.img_subtops35);

        }
        if(val==92){
            tv_body.setText(R.string.string_body92);
            tv_topic.setText(R.string.string_sCs92);
            example.setText("#include<stdio.h>\n\t#define square(a) a*a;\n\tint main(){\n\tint b,c;\n\tprintf(\"enter b element:\");\n\tscanf(\"%d\",&b);\n\tc=square(b);//replaces c=b*b before execution of program\n\tprintf(\"%d\",c);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output125);
            image_view.setImageResource(R.drawable.img_subtops36);

        }
        if(val==93){
            tv_body.setText(R.string.string_body93);
            tv_topic.setText(R.string.string_sCs93);
            example.setText("# include <stdio.h>\n\t# define a 10;\n\tvoid main(){\n\t#ifdef a\n\tprintf(\"\n\t Hello I am here..\");\n\t#endif\n\t#ifndef a\n\tprintf(\"\n\t Not defined \");\n\t#else\n\tprintf(\"\n\t R u There \");\n\t#endif\n\t}.");
            output.setText(R.string.string_output126);
            image_view.setImageResource(R.drawable.img_subtops37);

        }

        if(val==101){
            tv_body.setText(R.string.string_body101);
            tv_topic.setText(R.string.string_sCs101);
            example.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint number=50;\n\tint *p;\n\tp=&number;//stores the address of number variable\n\tprintf(\"Address of p variable is %x \n\t\",p); // p contains the address of the number therefore printing p gives the address of number.\n\tprintf(\"Value of p variable is %d \n\t\",*p); // As we know that * is used to dereference a pointer therefore if we print *p, we will get the value stored at the address contained by p.\n\treturn 0;\n\t}    .");
            output.setText(R.string.string_output52);
            image_view.setImageResource(R.drawable.img_subtops38);

        }
        if(val==102){
            tv_body.setText(R.string.string_body102);
            tv_topic.setText(R.string.string_sCs102);
            example.setText("#include <stdio.h>\n\t\n\tint main () {\n\tint *arr[3];\n\tint *a;\n\tprintf( \"Value of array pointer variable : %d\n\t\", arr);\n\tprintf( \"Value of pointer variable : %d\n\t\", &a);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output23);
            image_view.setImageResource(R.drawable.img_subtops39);

        }
        if(val==103){
            tv_body.setText(R.string.string_body103);
            tv_topic.setText(R.string.string_sCs103);
            example.setText("// C program to illustrate\n\t// pointer increment//decrement\n\t\n\t#include <stdio.h>\n\t\n\t// Driver Code\n\tint main()\n\t{\n\t// Integer variable\n\tint N = 4;\n\t\n\t// Pointer to an integer\n\tint *ptr1, *ptr2;\n\t// Pointer stores\n\t// the address of N\n\tptr1 = &N;\n\tptr2 = &N;\n\t\n\tprintf(\"Pointer ptr1 \"\n\t\n\t\"before Increment: \");\n\tprintf(\"%p \n\t\", ptr1);\n\t\n\t// Incrementing pointer ptr1;\n\tptr1++;\n\t\n\tprintf(\"Pointer ptr1 after\"\n\t\n\t\" Increment: \");\n\tprintf(\"%p \n\t\n\t\", ptr1);\n\t\n\tprintf(\"Pointer ptr1 before\"\n\t\n\t\" Decrement: \");\n\tprintf(\"%p \n\t\", ptr1);\n\t\n\t// Decrementing pointer ptr1;\n\tptr1--;\n\t\n\tprintf(\"Pointer ptr1 after\"\n\t\n\t\" Decrement: \");\n\tprintf(\"%p \n\t\n\t\", ptr1);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output127);
            image_view.setImageResource(R.drawable.img_subtops40);

        }
        if(val==104){
            tv_body.setText(R.string.string_body104);
            tv_topic.setText(R.string.string_sCs104);
            example.setText("#include <stdio.h>  \n\tint main()  \n\t{  \n\t    int *ptr;  \n\t    ptr=(int*)malloc(4*sizeof(int));  \n\t    if(ptr==NULL)  \n\t    {  \n\t        printf(\"Memory is not allocated\");  \n\t    }  \n\t    else  \n\t    {  \n\t        printf(\"Memory is allocated\");  \n\t    }  \n\t    return 0;  \n\t}  ");
            output.setText(R.string.string_output93);
            image_view.setImageResource(R.drawable.img_subtops41);

        }
        if(val==105){
            tv_body.setText(R.string.string_body105);
            tv_topic.setText(R.string.string_sCs105);
            example.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tchar arr[] = \"don't panic\n\t\";\n\tchar* ptr = arr;\n\t\n\tprintf(\"%c %c\n\t\", arr[4], ptr[4]);\n\tprintf(\"%c %c\n\t\", *(arr+2), *(ptr+2));\n\t\n\treturn 0;\n\t\n\t}.");
            output.setText(R.string.string_output128);
            image_view.setImageResource(R.drawable.img_subtops42);

        }
        if(val==106){
            tv_body.setText(R.string.string_body106);
            tv_topic.setText(R.string.string_sCs106);
            example.setText("#include <stdio.h>\n\t\n\tvoid getarray(int arr[])\n\t{\n\tprintf(\"Elements of array are : \");\n\tfor(int i=0;i<5;i++)\n\t{\n\tprintf(\"%d \", arr[i]);\n\t}\n\t}\n\tint main()\n\t{\n\tint arr[5]={45,67,34,78,90};\n\tgetarray(arr);\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output21);
            image_view.setImageResource(R.drawable.img_subtops43);

        }
        if(val==107){
            tv_body.setText(R.string.string_body107);
            tv_topic.setText(R.string.string_sCs107);
            example.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tchar z[100] = \"I am learning C programming language.\";\n\t\n\tprintf(\"%s\", z); / %s is format specifier\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output69);
            image_view.setImageResource(R.drawable.img_subtops44);

        }
        if(val==108){
            tv_body.setText(R.string.string_body108);
            tv_topic.setText(R.string.string_sCs108);
            example.setText("#include <stdio.h>\n\t#include <string.h>\n\tint main()\n\t{\n\tchar str1[100];\n\tchar newString[10][10];\n\tint i,j,ctr;\n\tprintf(\"\n\t\n\t Split string by space into words :\n\t\");\n\tprintf(\"---------------------------------------\n\t\");\n\t\n\tprintf(\" Input  a string : \");\n\tfgets(str1, sizeof str1, stdin);\n\t\n\tj=0; ctr=0;\n\tfor(i=0;i<=(strlen(str1));i++)\n\t{\n\t// if space or NULL found, assign NULL into newString[ctr]\n\tif(str1[i]==' '||str1[i]=='\0')\n\t{\n\t\n\tnewString[ctr][j]='\0';\n\t\n\tctr++;  //for next word\n\t\n\tj=0;    //for next word, init index to 0\n\t}\n\telse\n\t{\n\t\n\tnewString[ctr][j]=str1[i];\n\t\n\tj++;\n\t}\n\t}\n\tprintf(\"\n\t Strings or words after split by space are :\n\t\");\n\tfor(i=0;i < ctr;i++)\n\tprintf(\" %s\n\t\",newString[i]);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output130);
            image_view.setImageResource(R.drawable.img_subtops45);

        }

        if(val==111){
            tv_body.setText(R.string.string_body111);
            tv_topic.setText(R.string.string_sCs111);
            example.setText("#include <stdlib.h>\n\tint main(){\n\tint *ptr;\n\tptr = malloc(15 * sizeof(*ptr)); /* a block of 15 integers */\n\tif (ptr != NULL) {\n\t*(ptr + 5) = 480; /* assign 480 to sixth integer */\n\tprintf(\"Value of the 6th integer is %d\",*(ptr + 5));\n\t}\n\t}.");
            output.setText(R.string.string_output131);
            image_view.setImageResource(R.drawable.img_subtops46);

        }
        if(val==112){
            tv_body.setText(R.string.string_body112);
            tv_topic.setText(R.string.string_sCs112);
            example.setText("// Program to calculate the sum of n numbers entered by the user\n\t\n\t#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\tint main() {\n\tint n, i, *ptr, sum = 0;\n\t\n\tprintf(\"Enter number of elements: \");\n\tscanf(\"%d\", &n);\n\t\n\tptr = (int*) malloc(n * sizeof(int));\n\t\n\t// if memory cannot be allocated\n\tif(ptr == NULL) {\n\tprintf(\"Error! memory not allocated.\");\n\texit(0);\n\t}\n\t\n\tprintf(\"Enter elements: \");\n\tfor(i = 0; i < n; ++i) {\n\tscanf(\"%d\", ptr + i);\n\tsum += *(ptr + i);\n\t}\n\t\n\tprintf(\"Sum = %d\", sum);\n\t\n\t// deallocating the memory\n\tfree(ptr);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output132);
            image_view.setImageResource(R.drawable.img_subtops47);

        }
        if(val==113){
            tv_body.setText(R.string.string_body113);
            tv_topic.setText(R.string.string_sCs113);
            example.setText("#include <stdio.h>\n\t#include <stdlib.h>\n\tint main() {\n\tint n = 4, i, *p, s = 0;\n\tp = (int*) calloc(n, sizeof(int));\n\tif(p == NULL) {\n\tprintf(\"\n\tError! memory not allocated.\");\n\texit(0);\n\t}\n\tprintf(\"\n\tEnter elements of array : \");\n\tfor(i = 0; i < n; ++i) {\n\tscanf(\"%d\", p + i);\n\ts += *(p + i);\n\t}\n\tprintf(\"\n\tSum : %d\", s);p = (int*) realloc(p, 6);\n\tprintf(\"\n\tEnter elements of array : \");\n\tfor(i = 0; i < n; ++i) {\n\tscanf(\"%d\", p + i);\n\ts += *(p + i);\n\t}\n\tprintf(\"\n\tSum : %d\", s);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output133);
            image_view.setImageResource(R.drawable.img_subtops48);

        }
        if(val==114){
            tv_body.setText(R.string.string_body114);
            tv_topic.setText(R.string.string_sCs114);
            example.setText("#include <stdio.h>\n\t\n\tint main() {\n\t// Block\n\t{\n\t//Variables within the block\n\tint a = 8;\n\tint b = 10;\n\tprintf (\"The values are: %d, %d\n\t\", a, b);\n\t}\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output134);
            image_view.setImageResource(R.drawable.img_subtops49);

        }

        if(val==121){
            tv_body.setText(R.string.string_body121);
            tv_topic.setText(R.string.string_sCs121);
            example.setText("\n\t// C program to illustrate fopen()\n\t\n\t#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\tint main()\n\t{\n\t\n\t// pointer demo to FILE\n\tFILE* demo;\n\t\n\t// Creates a file \"demo_file\"\n\t// with file access as write-plus mode\n\tdemo = fopen(\"demo_file.txt\", \"w+\");\n\t\n\t// adds content to the file\n\tfprintf(demo, \"%s %s %s\", \"Welcome\",\n\t\n\t\"to\", \"GeeksforGeeks\");\n\t\n\t// closes the file pointed by demo\n\tfclose(demo);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output135);
            image_view.setImageResource(R.drawable.img_subtops50);

        }
        if(val==122){
            tv_body.setText(R.string.string_body122);
            tv_topic.setText(R.string.string_sCs122);
            example.setText("#include <stdio.h>\n\t/* Read one line from fp, */\n\t/* copying it to line array (but no more than max chars). */\n\t/* Does not place terminating \n\t in line array. */\n\t/* Returns line length, or 0 for empty line, or EOF for end-of-file. */\n\t\n\tint fgetline(FILE *fp, char line[], int max)\n\t{\n\tint nch = 0;\n\tint c;\n\tmax = max - 1;\t\t\t/* leave room for '\0' */\n\t\n\twhile((c = getc(fp)) != EOF)\n\t{\n\tif(c == '\n\t')\n\tbreak;\n\t\n\tif(nch < max)\n\t{\n\tline[nch] = c;\n\tnch = nch + 1;\n\t}\n\t}\n\t\n\tif(c == EOF && nch == 0)\n\treturn EOF;\n\t\n\tline[nch] = '\0';\n\treturn nch;\n\t}.");
            output.setText(R.string.string_output136);
            image_view.setImageResource(R.drawable.img_subtops51);

        }
        if(val==123){
            tv_body.setText(R.string.string_body123);
            tv_topic.setText(R.string.string_sCs123);
            example.setText("Not Available.");
            output.setText(R.string.string_output137);
            image_view.setImageResource(R.drawable.img_subtops52);

        }
        if(val==124){
            tv_body.setText(R.string.string_body124);
            tv_topic.setText(R.string.string_sCs124);
            example.setText("Not Available.");
            output.setText(R.string.string_output138);
            image_view.setImageResource(R.drawable.img_subtops53);

        }
        if(val==125){
            tv_body.setText(R.string.string_body125);
            tv_topic.setText(R.string.string_sCs125);
            example.setText("#include<stdio.h>\nint main(){\n\tclrscr();\n\tprintf(\"GeeksforGeeks | A computer science portal for geeks\n\n//Output    \n\n   C:\\Users\\Rashi\\Desktop>gcc  fgetcexp.c -o fgetcexp\n\nC:\\USers\\Rashi\\Desktop>fgetcexp\ncontent of this file are\nGeeksforGeeks | A computer science portal for geeks\");\n\tgetch();\n\treturn 0;");
            output.setText(R.string.string_output139);
            image_view.setImageResource(R.drawable.img_subtops54);

        }




        if(val==142){
            tv_body.setText(R.string.string_body142);
            tv_topic.setText(R.string.string_sCs142);
            example.setText("// C program to implement\n\t// the above approach\n\t#include <stdio.h>\n\t#include <stdlib.h>\n\t#include <string.h>\n\t\n\t// Driver code\n\tint main()\n\t{\n\tFILE* ptr;\n\tchar ch;\n\t\n\t// Opening file in reading mode\n\tptr = fopen(\"test.txt\", \"r\");\n\t\n\tif (NULL == ptr) {\n\tprintf(\"file can't be opened \n\t\");\n\t}\n\t\n\tprintf(\"content of this file are \n\t\");\n\t\n\t// Printing what is written in file\n\t// character by character using loop.\n\tdo {\n\tch = fgetc(ptr);\n\tprintf(\"%c\", ch);\n\t\n\t// Checking if character is not EOF.\n\t// If it is EOF stop eading.\n\t} while (ch != EOF);\n\t\n\t// Closing the file\n\tfclose(ptr);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output140);
            image_view.setImageResource(R.drawable.img_subtops14);

        }
        if(val==143){
            tv_body.setText(R.string.string_body143);
            tv_topic.setText(R.string.string_sCs143);
            example.setText("#include<stdio.h>\n\t\n\tint main() {\n\tint gross_salary, basic, da, ta;\n\t\n\tprintf(\"Enter basic salary : \");\n\tscanf(\"%d\", &basic);\n\t\n\tda = (10 * basic) / 100;\n\tta = (12 * basic) / 100;\n\t\n\tgross_salary = basic + da + ta;\n\t\n\tprintf(\"\n\tGross salary : %d\", gross_salary);\n\treturn (0);\n\t}.");
            output.setText(R.string.string_output80);
            image_view.setImageResource(R.drawable.img_subtops24);

        }


        cl_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(val==12){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 11);
                    startActivity(intent);
                }
                if(val==13){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 12);
                    startActivity(intent);
                }
                if(val==14){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 13);
                    startActivity(intent);
                }
                if(val==23){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 22);
                    startActivity(intent);
                }
                if(val==24){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 23);
                    startActivity(intent);
                }
                if(val==25){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 24);
                    startActivity(intent);
                }
                if(val==26){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 25);
                    startActivity(intent);
                }
                if(val==27){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 26);
                    startActivity(intent);
                }
                if(val==28){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 27);
                    startActivity(intent);
                }
                if(val==31){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 28);
                    startActivity(intent);
                }
                if(val==32){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 31);
                    startActivity(intent);
                }
                if(val==33){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 32);
                    startActivity(intent);
                }
                if(val==34){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 33);
                    startActivity(intent);
                }
                if(val==35){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 34);
                    startActivity(intent);
                }
                if(val==36){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 35);
                    startActivity(intent);
                }
                if(val==37){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 36);
                    startActivity(intent);
                }
                if(val==42){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 41);
                    startActivity(intent);
                }
                if(val==43){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 42);
                    startActivity(intent);
                }
                if(val==44){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 43);
                    startActivity(intent);
                }
                if(val==52){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 51);
                    startActivity(intent);
                }
                if(val==53){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 52);
                    startActivity(intent);
                }
                if(val==54){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 53);
                    startActivity(intent);
                }
                if(val==61){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 54);
                    startActivity(intent);
                }
                if(val==62){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 61);
                    startActivity(intent);
                }
                if(val==63){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 62);
                    startActivity(intent);
                }
                if(val==64){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 63);
                    startActivity(intent);
                }
                if(val==71){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 64);
                    startActivity(intent);
                }
                if(val==72){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 71);
                    startActivity(intent);
                }
                if(val==73){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 72);
                    startActivity(intent);
                }
                if(val==81){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 73);
                    startActivity(intent);
                }
                if(val==91){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 81);
                    startActivity(intent);
                }
                if(val==92){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 91);
                    startActivity(intent);
                }
                if(val==93){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 92);
                    startActivity(intent);
                }
                if(val==101){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 93);
                    startActivity(intent);
                }
                if(val==102){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 101);
                    startActivity(intent);
                }
                if(val==103){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 102);
                    startActivity(intent);
                }
                if(val==104){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 103);
                    startActivity(intent);
                }
                if(val==105){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 104);
                    startActivity(intent);
                }
                if(val==106){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 105);
                    startActivity(intent);
                }
                if(val==107){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 106);
                    startActivity(intent);
                }
                if(val==108){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 107);
                    startActivity(intent);
                }
                if(val==111){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 108);
                    startActivity(intent);
                }
                if(val==112){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 111);
                    startActivity(intent);
                }
                if(val==113){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 112);
                    startActivity(intent);
                }
                if(val==114){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 113);
                    startActivity(intent);
                }
                if(val==121){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 114);
                    startActivity(intent);
                }
                if(val==122){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 121);
                    startActivity(intent);
                }
                if(val==123){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 122);
                    startActivity(intent);
                }
                if(val==124){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 123);
                    startActivity(intent);
                }
                if(val==125){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 124);
                    startActivity(intent);
                }
                if(val==142){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 141);
                    startActivity(intent);
                }
                if(val==143){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 142);
                    startActivity(intent);
                }
                if(val==144){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 143);
                    startActivity(intent);
                }
                if(val==145){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 144);
                    startActivity(intent);
                }
                if(val==146){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 145);
                    startActivity(intent);
                }

            }
        });
        cl_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(val==12){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 13);
                    startActivity(intent);
                }
                if(val==13){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 14);
                    startActivity(intent);
                }
                if(val==14){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 21);
                    startActivity(intent);
                }
                if(val==23){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 24);
                    startActivity(intent);
                }
                if(val==24){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 25);
                    startActivity(intent);
                }
                if(val==25){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 26);
                    startActivity(intent);
                }
                if(val==26){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 27);
                    startActivity(intent);
                }
                if(val==27){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 28);
                    startActivity(intent);
                }
                if(val==28){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 31);
                    startActivity(intent);
                }
                if(val==31){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 32);
                    startActivity(intent);
                }
                if(val==32){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 33);
                    startActivity(intent);
                }
                if(val==33){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 34);
                    startActivity(intent);
                }
                if(val==34){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 35);
                    startActivity(intent);
                }
                if(val==35){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 36);
                    startActivity(intent);
                }
                if(val==36){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 37);
                    startActivity(intent);
                }
                if(val==37){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 41);
                    startActivity(intent);
                }
                if(val==42){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 43);
                    startActivity(intent);
                }
                if(val==43){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 44);
                    startActivity(intent);
                }
                if(val==44){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 51);
                    startActivity(intent);
                }
                if(val==52){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 53);
                    startActivity(intent);
                }
                if(val==53){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 54);
                    startActivity(intent);
                }
                if(val==54){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 61);
                    startActivity(intent);
                }
                if(val==61){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 62);
                    startActivity(intent);
                }
                if(val==62){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 63);
                    startActivity(intent);
                }
                if(val==63){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 64);
                    startActivity(intent);
                }
                if(val==64){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 71);
                    startActivity(intent);
                }
                if(val==71){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 72);
                    startActivity(intent);
                }
                if(val==72){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 73);
                    startActivity(intent);
                }
                if(val==73){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 81);
                    startActivity(intent);
                }
                if(val==81){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 91);
                    startActivity(intent);
                }
                if(val==91){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 92);
                    startActivity(intent);
                }
                if(val==92){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 93);
                    startActivity(intent);
                }
                if(val==93){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 101);
                    startActivity(intent);
                }
                if(val==101){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 102);
                    startActivity(intent);
                }
                if(val==102){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 103);
                    startActivity(intent);
                }
                if(val==103){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 104);
                    startActivity(intent);
                }
                if(val==104){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 105);
                    startActivity(intent);
                }
                if(val==105){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 106);
                    startActivity(intent);
                }
                if(val==106){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 107);
                    startActivity(intent);
                }
                if(val==107){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 108);
                    startActivity(intent);
                }
                if(val==108){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 111);
                    startActivity(intent);
                }
                if(val==111){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 112);
                    startActivity(intent);
                }
                if(val==112){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 113);
                    startActivity(intent);
                }
                if(val==113){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 114);
                    startActivity(intent);
                }
                if(val==114){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 121);
                    startActivity(intent);
                }
                if(val==121){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 122);
                    startActivity(intent);
                }
                if(val==122){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 123);
                    startActivity(intent);
                }
                if(val==123){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 124);
                    startActivity(intent);
                }
                if(val==124){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 125);
                    startActivity(intent);
                }
                if(val==125){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 131);
                    startActivity(intent);
                }
                if(val==142){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 143);
                    startActivity(intent);
                }
                if(val==143){
                    Intent intent = new Intent(SubTopicsBriefingActivity.this, Internet_std_library.class);
                    intent.putExtra("internet_no", 144);
                    startActivity(intent);
                }
//                if(val==144){
//                    Intent intent = new Intent(SubTopicsBriefingActivity.this, Internet_std_library.class);
//                    intent.putExtra("internet_no", 145);
//                    startActivity(intent);
//                }
//                if(val==145){
//                    Intent intent = new Intent(SubTopicsBriefingActivity.this, Internet_std_library.class);
//                    intent.putExtra("internet_no", 146);
//                    startActivity(intent);
//                }
//                if(val==146){
//                    //Code not important ..
//                    //hide/GONE the NExt
//                }
            }
        });


    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(SubTopicsBriefingActivity.this, MainActivity.class);
        startActivity(intent);
    }

//
//    @Override
//    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        //Zoom Activity Manipulation
//
//        View view =getLayoutInflater().inflate(R.layout.activity_main,null); // get reference to root activity view
//        setContentView(view);
//
//        view.setOnClickListener(new View.OnClickListener() {
//            float zoomFactor = 2f;
//            boolean zoomedOut = false;
//
//            @Override
//            public void onClick(View v) {
//                if(zoomedOut) {
//                    v.setScaleX(1);
//                    v.setScaleY(1);
//                    zoomedOut = false;
//                }
//                else {
//                    v.setScaleX(zoomFactor);
//                    v.setScaleY(zoomFactor);
//                    zoomedOut = true;
//                }
//            }
//        });
//
//    }
}