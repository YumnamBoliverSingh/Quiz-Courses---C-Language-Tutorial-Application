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

public class TopicsBriefingActivity extends AppCompatActivity {
    private ImageView back;
    private TextView tv_body, tv_topic;
    private ImageView iv_the_only_image;
    private CardView cl_previous, cl_next;
    private CardView cv_prev_top, cv_next_top;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics_briefing);
        getSupportActionBar().hide();
        back=findViewById(R.id.backTBA);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TopicsBriefingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        tv_topic=findViewById(R.id.tv_topicNameTBA);
        tv_body=findViewById(R.id.textViewBodyTBA);
        iv_the_only_image=findViewById(R.id.imageViewTBA);
        cl_previous=findViewById(R.id.prevTBA);
        cl_next=findViewById(R.id.nextTBA);

        cv_prev_top=findViewById(R.id.prevTBA_top);
        cv_next_top=findViewById(R.id.nextTBA_top);

        Bundle extras = getIntent().getExtras();
        int value1 = extras.getInt("int_subChapterKey");


        cv_prev_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(value1==21){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 14);
                    startActivity(intent);
                }
                if(value1==22){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 21);
                    startActivity(intent);
                }
                if(value1==41){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 37);
                    startActivity(intent);
                }
                if(value1==51){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 44);
                    startActivity(intent);
                }
                if(value1==131){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 125);
                    startActivity(intent);
                }
                if(value1==141){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 131);
                    startActivity(intent);
                }


            }
        });
        cv_next_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (value1==11){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 12);
                    startActivity(intent);
                }
                if (value1==21){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 22);
                    startActivity(intent);
                }
                if (value1==22){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 23);
                    startActivity(intent);
                }
                if (value1==41){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 42);
                    startActivity(intent);
                }
                if (value1==51){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 52);
                    startActivity(intent);
                }
                if (value1==131){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 141);
                    startActivity(intent);
                }
                if (value1==141){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 142);
                    startActivity(intent);
                }

            }
        });
//        String str1 = "printf(\"\\n\");";
//        String str2 = "echo \"\\\\n\";";
//        String str3 = "printf('\\n');";
//        String str4 = "printf(\"\\\\n\");";



        iv_the_only_image.setImageResource(R.drawable.img_sexy);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TopicsBriefingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        zoomControls = findViewById(R.id.zoom_controls_TBA);
        zoomControls.hide();
        iv_the_only_image.setOnTouchListener(new View.OnTouchListener(){
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
                iv_the_only_image.setScaleX((float) (x+1));
                iv_the_only_image.setScaleY((float) (y+1));
                zoomControls.hide();

            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = view.getScaleX();
                float y = view.getScaleY();
                if ( x== 1 && y==1){
                    iv_the_only_image.setScaleX(x);
                    iv_the_only_image.setScaleY(y);
                }else{
                    iv_the_only_image.setScaleX((float) (x+1));
                    iv_the_only_image.setScaleY((float) (y-1));
                    zoomControls.hide();
                }
            }
        });


        if(value1==11){
            iv_the_only_image.setImageResource(R.drawable.img_subtops11s);
            tv_topic.setText(R.string.string_sCs11);
            tv_body.setText(R.string.string_body11);
            //iv_the_only_image.setImageResource(R.drawable.img_subtops);
            cv_prev_top.setVisibility(View.GONE);
            cv_next_top.setVisibility(View.VISIBLE);


            cl_next.setVisibility(View.VISIBLE);
            cl_previous.setVisibility(View.GONE);
        }
        if(value1==21){
            iv_the_only_image.setImageResource(R.drawable.img_subtops21);

            tv_topic.setText(R.string.string_sCs21);
            tv_body.setText(R.string.string_body21);
            //iv_the_only_image.setImageResource(R.drawable.img_subtops10);

            cl_previous.setVisibility(View.VISIBLE);
            cl_next.setVisibility(View.VISIBLE);
        }
        if(value1==22){
            iv_the_only_image.setImageResource(R.drawable.img_subtops22);

            tv_topic.setText(R.string.string_sCs22);
            tv_body.setText(R.string.string_body22);
            //iv_the_only_image.setImageResource(R.drawable.img_subtops14);

            cl_previous.setVisibility(View.VISIBLE);
            cl_next.setVisibility(View.VISIBLE);
        }
        if(value1==41){
            iv_the_only_image.setImageResource(R.drawable.img_subtops44);

            tv_topic.setText(R.string.string_sCs41);
            tv_body.setText(R.string.string_body41);
            // iv_the_only_image.setImageResource(R.drawable.img_subtops12);

            cl_previous.setVisibility(View.VISIBLE);
            cl_next.setVisibility(View.VISIBLE);
        }
        if(value1==51){
            iv_the_only_image.setImageResource(R.drawable.img_subtops52);

            tv_topic.setText(R.string.string_sCs51);
            tv_body.setText(R.string.string_body51);
            //iv_the_only_image.setImageResource(R.drawable.img_subtops);

            cl_previous.setVisibility(View.VISIBLE);
            cl_next.setVisibility(View.VISIBLE);
        }
        if(value1==131){
            iv_the_only_image.setImageResource(R.drawable.img_subtops1315);

            tv_topic.setText(R.string.string_sCs13x);
            tv_body.setText(R.string.string_body131);
            // iv_the_only_image.setImageResource(R.drawable.img_subtops54);

            cl_previous.setVisibility(View.VISIBLE);
            cl_next.setVisibility(View.VISIBLE);
        }
        if(value1==141){
            iv_the_only_image.setImageResource(R.drawable.img_subtops14);

            tv_topic.setText(R.string.string_sCs141);
            tv_body.setText(R.string.string_body141);
            // iv_the_only_image.setImageResource(R.drawable.img_subtops45);

            cl_previous.setVisibility(View.VISIBLE);
            cl_next.setVisibility(View.VISIBLE);
        }




        cl_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(value1==21){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 14);
                    startActivity(intent);
                }
                if(value1==22){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 21);
                    startActivity(intent);
                }
                if(value1==41){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 37);
                    startActivity(intent);
                }
                if(value1==51){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 44);
                    startActivity(intent);
                }
                if(value1==131){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 125);
                    startActivity(intent);
                }
                if(value1==141){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 131);
                    startActivity(intent);
                }


            }
        });
        cl_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (value1==11){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 12);
                    startActivity(intent);
                }
                if (value1==21){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 22);
                    startActivity(intent);
                }
                if (value1==22){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 23);
                    startActivity(intent);
                }
                if (value1==41){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 42);
                    startActivity(intent);
                }
                if (value1==51){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 52);
                    startActivity(intent);
                }
                if (value1==131){
                    Intent intent = new Intent(TopicsBriefingActivity.this, TopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 141);
                    startActivity(intent);
                }
                if (value1==141){
                    Intent intent = new Intent(TopicsBriefingActivity.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("int_subChapterKey", 142);
                    startActivity(intent);
                }

            }
        });







    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(TopicsBriefingActivity.this, MainActivity.class);
        startActivity(intent);
    }
}