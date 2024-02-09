package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private Tab_Adapter adapter;

    private ConstraintLayout cl_tutorial, cl_quiz;
    private ImageView iv_tutorial, iv_quiz, iv_tutorial_red, iv_quiz_red;
    private TextView tv_tutorial, tv_quiz;


    private ImageView iv_lessons_left, iv_faqs_right;
    private TextView tv_programs_mid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.tool_bar_read));
        }

        cl_tutorial=findViewById(R.id.Tutorial1);
        cl_quiz=findViewById(R.id.Quiz1);
        tv_tutorial=findViewById(R.id.tv_tutorial1);
        tv_quiz=findViewById(R.id.tv_quiz1);
        iv_tutorial=findViewById(R.id.iv_tutorial1);
        iv_quiz=findViewById(R.id.iv_quiz1);
        iv_tutorial_red=findViewById(R.id.iv_tutorial_red_1);
        iv_quiz_red=findViewById(R.id.iv_quiz_red_1);

        iv_lessons_left=findViewById(R.id.ivLessons_left);
        tv_programs_mid=findViewById(R.id.tvPrograms_mid);
        iv_faqs_right=findViewById(R.id.ivFaqs_right);






        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        int val_ori = preferences.getInt("sp_main_2_click_bottom_navigator", 11);
        if(val_ori==11 || val_ori==21){
            tv_tutorial.setTextColor(getResources().getColor(R.color.tool_bar_read));
            tv_quiz.setTextColor(getResources().getColor(R.color.gray_attr));

            iv_tutorial.setVisibility(View.GONE);
            iv_tutorial_red.setVisibility(View.VISIBLE);

            iv_quiz_red.setVisibility(View.GONE);
            iv_quiz.setVisibility(View.VISIBLE);
        }else{
            tv_tutorial.setTextColor(getResources().getColor(R.color.gray_attr));
            tv_quiz.setTextColor(getResources().getColor(R.color.tool_bar_read));

            iv_tutorial.setVisibility(View.VISIBLE);
            iv_tutorial_red.setVisibility(View.GONE);

            iv_quiz_red.setVisibility(View.VISIBLE);
            iv_quiz.setVisibility(View.GONE);

        }


        cl_tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_main_2_click_bottom_navigator",11);
                editor.apply();

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
                editor.putInt("sp_main_2_click_bottom_navigator",12);
                editor.apply();
                Intent intent=new Intent(MainActivity.this, QuizActivityOutside.class);
                startActivity(intent);
                tv_tutorial.setTextColor(getResources().getColor(R.color.gray_attr));
                tv_quiz.setTextColor(getResources().getColor(R.color.tool_bar_read));

                iv_tutorial.setVisibility(View.VISIBLE);
                iv_tutorial_red.setVisibility(View.GONE);

                iv_quiz_red.setVisibility(View.VISIBLE);
                iv_quiz.setVisibility(View.GONE);
            }
        });




        tabLayout=findViewById(R.id.tab_layout);
        viewPager2=findViewById(R.id.view_pager2);
        String tab_text_1=getText(R.string.tab_text_1).toString();
        String tab_text_2=getText(R.string.tab_text_2).toString();
        String tab_text_3=getText(R.string.tab_text_3).toString();
        tabLayout.addTab(tabLayout.newTab().setText( tab_text_1));
        tabLayout.addTab(tabLayout.newTab().setText( tab_text_2));
        tabLayout.addTab(tabLayout.newTab().setText( tab_text_3));
        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new Tab_Adapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);
        viewPager2.setOffscreenPageLimit(3);



//the intent would be "intent_viewPager" and its value ranges as: 1, 2, 3 ...
        //            question_tested_int_outside = preferences.getInt("intent_viewPager", 0);

        int intent_key_viewePagerNumber = preferences.getInt("intent_viewPager", 1);//0 is 1...., 1 is 2...., 2 is 3....
        if(intent_key_viewePagerNumber==1){
            viewPager2.setCurrentItem(0);
            tabLayout.selectTab(tabLayout.getTabAt(0));
        }
        if(intent_key_viewePagerNumber==2){
            viewPager2.setCurrentItem(1);
            tabLayout.selectTab(tabLayout.getTabAt(1));
        }
        if(intent_key_viewePagerNumber==3){
            viewPager2.setCurrentItem(2);
            tabLayout.selectTab(tabLayout.getTabAt(2));
        }
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                viewPager2.setCurrentItem(tab.getPosition());
                int tab_count = tab.getPosition();
                if(tab_count==0){
                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putInt("intent_viewPager", 1);
                    editor.apply();
                }
                if(tab_count==1){
                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putInt("intent_viewPager", 2);
                    editor.apply();
                }
                if(tab_count==2){
                    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putInt("intent_viewPager", 3);
                    editor.apply();
                }

//                question_tested_int_outside = preferences.getInt("sp_qc_n_o", 0);

//                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putInt("sp_latestscore", 3);
//                editor.putInt("sp_highscore", 4);
//                editor.apply();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab){

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab){

            }
        });
//        int key_back = getIntent().getExtras().getInt("back_intent_vp_page_2");
//        if(key_back==2){
//            viewPager2.setCurrentItem(2);
//        }
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(){
            @Override
            public void onPageSelected(int position){
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });



        TabLayout tab;

        iv_lessons_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager2.setCurrentItem(0);
                tabLayout.selectTab(tabLayout.getTabAt(0));

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("intent_viewPager", 1);
                editor.apply();
            }
        });
        tv_programs_mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager2.setCurrentItem(1);
                tabLayout.selectTab(tabLayout.getTabAt(1));

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("intent_viewPager", 2);
                editor.apply();
            }
        });
        iv_faqs_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager2.setCurrentItem(2);
                tabLayout.selectTab(tabLayout.getTabAt(2));

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("intent_viewPager", 3);
                editor.apply();
            }
        });



    }

}