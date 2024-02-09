package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramNOutput extends AppCompatActivity {
    TextView program, output;
    ImageView backPno;

    private CardView prev_cv, next_cv;

    private TextView programNAme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_noutput);
        getSupportActionBar().hide();
        int val_key_from_intent = getIntent().getIntExtra("intent_program_no", 1);

        prev_cv=findViewById(R.id.prevPNO_top);
        next_cv=findViewById(R.id.nextPNO_top);
        programNAme=findViewById(R.id.programNAme);

        programNAme.setText(R.string.string_pTops137);

        prev_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(val_key_from_intent==2){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 1);
                    startActivity(intent);
                }
                if(val_key_from_intent==3){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 2);
                    startActivity(intent);
                }
                if(val_key_from_intent==4){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 3);
                    startActivity(intent);
                }
                if(val_key_from_intent==5){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 4);
                    startActivity(intent);
                }
                if(val_key_from_intent==6){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 5);
                    startActivity(intent);
                }
                if(val_key_from_intent==7){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 6);
                    startActivity(intent);
                }
                if(val_key_from_intent==8){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 7);
                    startActivity(intent);
                }
                if(val_key_from_intent==9){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 8);
                    startActivity(intent);
                }
                if(val_key_from_intent==10){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 9);
                    startActivity(intent);
                }
                if(val_key_from_intent==11){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 10);
                    startActivity(intent);
                }
                if(val_key_from_intent==12){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 11);
                    startActivity(intent);}
                if(val_key_from_intent==13){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 12);
                    startActivity(intent);
                }
                if(val_key_from_intent==14){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 13);
                    startActivity(intent);
                }
                if(val_key_from_intent==15){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 14);
                    startActivity(intent);
                }
                if(val_key_from_intent==16){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 15);
                    startActivity(intent);}
                if(val_key_from_intent==17){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 16);
                    startActivity(intent);
                }
                if(val_key_from_intent==18){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 17);
                    startActivity(intent);
                }
                if(val_key_from_intent==19){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 18);
                    startActivity(intent);
                }
                if(val_key_from_intent==20){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 19);
                    startActivity(intent);
                }
                if(val_key_from_intent==21){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 20);
                    startActivity(intent);}
                if(val_key_from_intent==22){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 21);
                    startActivity(intent);
                }
                if(val_key_from_intent==23){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 22);
                    startActivity(intent);
                }
                if(val_key_from_intent==24){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 23);
                    startActivity(intent);
                }
                if(val_key_from_intent==25){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 24);
                    startActivity(intent);
                }
                if(val_key_from_intent==26){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 25);
                    startActivity(intent);
                }
                if(val_key_from_intent==27){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 26);
                    startActivity(intent);
                }
                if(val_key_from_intent==28){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 27);
                    startActivity(intent);
                }
                if(val_key_from_intent==29){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 28);
                    startActivity(intent);
                }
                if(val_key_from_intent==30){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 29);
                    startActivity(intent);
                }
                if(val_key_from_intent==31){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 30);
                    startActivity(intent);
                }
                if(val_key_from_intent==32){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 31);
                    startActivity(intent);
                }
                if(val_key_from_intent==33){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 32);
                    startActivity(intent);
                }
                if(val_key_from_intent==34){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 33);
                    startActivity(intent);
                }
                if(val_key_from_intent==35){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 34);
                    startActivity(intent);
                }
                if(val_key_from_intent==36){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 35);
                    startActivity(intent);
                }
                if(val_key_from_intent==37){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 36);
                    startActivity(intent);
                }
                if(val_key_from_intent==38){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 37);
                    startActivity(intent);
                }
                if(val_key_from_intent==39){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 38);
                    startActivity(intent);
                }
                if(val_key_from_intent==40){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 39);startActivity(intent);
                }
                if(val_key_from_intent==41){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 40);
                    startActivity(intent);
                }
                if(val_key_from_intent==42){Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 41);
                    startActivity(intent);
                }
                if(val_key_from_intent==43){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 42);
                    startActivity(intent);
                }
                if(val_key_from_intent==44){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 43);
                    startActivity(intent);
                }
                if(val_key_from_intent==45){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 44);
                    startActivity(intent);
                }
                if(val_key_from_intent==46){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 45);
                    startActivity(intent);
                }
                if(val_key_from_intent==47){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 46);
                    startActivity(intent);
                }if(val_key_from_intent==48){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 47);
                    startActivity(intent);
                }
                if(val_key_from_intent==49){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 48);
                    startActivity(intent);}
                if(val_key_from_intent==50){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 49);
                    startActivity(intent);
                }
                if(val_key_from_intent==51){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 50);
                    startActivity(intent);
                }
                if(val_key_from_intent==52){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 51);
                    startActivity(intent);}
                if(val_key_from_intent==53){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 52);
                    startActivity(intent);
                }
                if(val_key_from_intent==54){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 53);
                    startActivity(intent);
                }
                if(val_key_from_intent==55){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 54);
                    startActivity(intent);}
                if(val_key_from_intent==56){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 55);
                    startActivity(intent);
                }
                if(val_key_from_intent==57){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 56);
                    startActivity(intent);
                }
                if(val_key_from_intent==58){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 57);
                    startActivity(intent);
                }
                if(val_key_from_intent==59){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 58);
                    startActivity(intent);
                }
                if(val_key_from_intent==60){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 59);
                    startActivity(intent);
                }
                if(val_key_from_intent==61){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 60);
                    startActivity(intent);
                }
                if(val_key_from_intent==62){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 61);
                    startActivity(intent);
                }
                if(val_key_from_intent==63){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 62);
                    startActivity(intent);
                }
                if(val_key_from_intent==64){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 63);
                    startActivity(intent);
                }
                if(val_key_from_intent==65){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 64);
                    startActivity(intent);
                }
                if(val_key_from_intent==66){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 65);
                    startActivity(intent);
                }
                if(val_key_from_intent==67){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 66);
                    startActivity(intent);
                }
                if(val_key_from_intent==68){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 67);
                    startActivity(intent);
                }
                if(val_key_from_intent==69){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 68);startActivity(intent);
                }
                if(val_key_from_intent==70){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 69);
                    startActivity(intent);
                }
                if(val_key_from_intent==71){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 70);startActivity(intent);
                }
                if(val_key_from_intent==72){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 71);
                    startActivity(intent);
                }
                if(val_key_from_intent==73){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 72);
                    startActivity(intent);}
                if(val_key_from_intent==74){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 73);
                    startActivity(intent);
                }
                if(val_key_from_intent==75){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 74);startActivity(intent);
                }
                if(val_key_from_intent==76){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 75);
                    startActivity(intent);
                }
                if(val_key_from_intent==77){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 76);
                    startActivity(intent);
                }
                if(val_key_from_intent==78){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 77);
                    startActivity(intent);
                }
                if(val_key_from_intent==79){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 78);
                    startActivity(intent);
                }
                if(val_key_from_intent==80){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 79);
                    startActivity(intent);
                }
                if(val_key_from_intent==81){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 80);
                    startActivity(intent);}
                if(val_key_from_intent==82){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 81);
                    startActivity(intent);
                }
                if(val_key_from_intent==83){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 82);startActivity(intent);
                }
                if(val_key_from_intent==84){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 83);
                    startActivity(intent);
                }
                if(val_key_from_intent==85){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 84);
                    startActivity(intent);
                }
                if(val_key_from_intent==86){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 85);
                    startActivity(intent);
                }
                if(val_key_from_intent==87){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 86);
                    startActivity(intent);
                }
                if(val_key_from_intent==88){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 87);
                    startActivity(intent);
                }
                if(val_key_from_intent==89){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 88);
                    startActivity(intent);
                }
                if(val_key_from_intent==90){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 89);
                    startActivity(intent);
                }
                if(val_key_from_intent==91){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 90);
                    startActivity(intent);
                }
                if(val_key_from_intent==92){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 91);
                    startActivity(intent);
                }
                if(val_key_from_intent==93){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 92);
                    startActivity(intent);
                }
                if(val_key_from_intent==94){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 93);
                    startActivity(intent);
                }
                if(val_key_from_intent==95){Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 94);
                    startActivity(intent);
                }
                if(val_key_from_intent==96){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 95);
                    startActivity(intent);
                }
                if(val_key_from_intent==97){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 96);
                    startActivity(intent);
                }
                if(val_key_from_intent==98){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 97);
                    startActivity(intent);
                }
                if(val_key_from_intent==99){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 98);
                    startActivity(intent);
                }
                if(val_key_from_intent==100){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 99);
                    startActivity(intent);
                }
                if(val_key_from_intent==101){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 100);
                    startActivity(intent);
                }
                if(val_key_from_intent==102){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 101);startActivity(intent);
                }
                if(val_key_from_intent==103){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 102);
                    startActivity(intent);
                }

//110 starts
                if(val_key_from_intent==110){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 103);
                    startActivity(intent);
                }
                if(val_key_from_intent==111){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 110);
                    startActivity(intent);}
                if(val_key_from_intent==112){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 111);
                    startActivity(intent);
                }
                if(val_key_from_intent==113){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 112);
                    startActivity(intent);
                }
                if(val_key_from_intent==114){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 113);
                    startActivity(intent);
                }
                if(val_key_from_intent==115){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 114);
                    startActivity(intent);
                }
                if(val_key_from_intent==116){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 115);
                    startActivity(intent);
                }
                if(val_key_from_intent==117){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 116);
                    startActivity(intent);
                }
                if(val_key_from_intent==118){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 117);
                    startActivity(intent);}
                if(val_key_from_intent==119){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 118);
                    startActivity(intent);
                }
                if(val_key_from_intent==120){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 119);
                    startActivity(intent);
                }
                if(val_key_from_intent==121){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 120);startActivity(intent);
                }
                if(val_key_from_intent==122){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 121);
                    startActivity(intent);
                }
                if(val_key_from_intent==123){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 122);
                    startActivity(intent);
                }
                if(val_key_from_intent==124){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 123);
                    startActivity(intent);
                }
                if(val_key_from_intent==125){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 124);
                    startActivity(intent);
                }
                if(val_key_from_intent==126){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 125);
                    startActivity(intent);
                }
                if(val_key_from_intent==127){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 126);
                    startActivity(intent);
                }
                if(val_key_from_intent==128){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 127);
                    startActivity(intent);
                }
                if(val_key_from_intent==129){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 128);
                    startActivity(intent);}
                if(val_key_from_intent==130){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 129);
                    startActivity(intent);
                }
                if(val_key_from_intent==131){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 130);startActivity(intent);
                }
                if(val_key_from_intent==132){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 131);
                    startActivity(intent);
                }
                if(val_key_from_intent==133){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 132);
                    startActivity(intent);
                }
                if(val_key_from_intent==134){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 133);
                    startActivity(intent);
                }
                if(val_key_from_intent==135){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 134);
                    startActivity(intent);
                }
                if(val_key_from_intent==136){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 135);
                    startActivity(intent);
                }
                if(val_key_from_intent==137){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 136);
                    startActivity(intent);
                }
                if(val_key_from_intent==138){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 137);
                    startActivity(intent);
                }
                if(val_key_from_intent==139){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 138);
                    startActivity(intent);
                }
                if(val_key_from_intent==140){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 139);
                    startActivity(intent);
                }
                if(val_key_from_intent==141){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 140);
                    startActivity(intent);
                }
                if(val_key_from_intent==142){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 141);
                    startActivity(intent);
                }
                if(val_key_from_intent==143){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 142);
                    startActivity(intent);
                }



            }
        });
        next_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(val_key_from_intent==1){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 2);
                    startActivity(intent);
                }
                if(val_key_from_intent==2){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 3);
                    startActivity(intent);
                }
                if(val_key_from_intent==3){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 4);
                    startActivity(intent);
                }
                if(val_key_from_intent==4){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 5);
                    startActivity(intent);
                }
                if(val_key_from_intent==5){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 6);
                    startActivity(intent);
                }
                if(val_key_from_intent==6){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 7);
                    startActivity(intent);
                }
                if(val_key_from_intent==7){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 8);
                    startActivity(intent);
                }
                if(val_key_from_intent==8){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 9);
                    startActivity(intent);
                }
                if(val_key_from_intent==9){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 10);
                    startActivity(intent);
                }
                if(val_key_from_intent==10){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 11);
                    startActivity(intent);
                }
                if(val_key_from_intent==11){Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 12);
                    startActivity(intent);
                }
                if(val_key_from_intent==12){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 13);
                    startActivity(intent);
                }
                if(val_key_from_intent==13){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 14);
                    startActivity(intent);
                }
                if(val_key_from_intent==14){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 15);startActivity(intent);
                }
                if(val_key_from_intent==15){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 16);
                    startActivity(intent);
                }
                if(val_key_from_intent==16){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 17);
                    startActivity(intent);
                }
                if(val_key_from_intent==17){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 18);
                    startActivity(intent);
                }if(val_key_from_intent==18){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 19);
                    startActivity(intent);
                }
                if(val_key_from_intent==19){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 20);
                    startActivity(intent);
                }
                if(val_key_from_intent==20){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 21);
                    startActivity(intent);
                }
                if(val_key_from_intent==21){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 22);
                    startActivity(intent);
                }
                if(val_key_from_intent==22){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 23);
                    startActivity(intent);
                }
                if(val_key_from_intent==23){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 24);
                    startActivity(intent);
                }if(val_key_from_intent==24){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 25);
                    startActivity(intent);
                }
                if(val_key_from_intent==25){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 26);
                    startActivity(intent);
                }
                if(val_key_from_intent==26){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 27);
                    startActivity(intent);
                }
                if(val_key_from_intent==27){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 28);
                    startActivity(intent);
                }
                if(val_key_from_intent==28){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 29);
                    startActivity(intent);
                }
                if(val_key_from_intent==29){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 30);
                    startActivity(intent);
                }
                if(val_key_from_intent==30){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 31);
                    startActivity(intent);
                }
                if(val_key_from_intent==31){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 32);
                    startActivity(intent);
                }
                if(val_key_from_intent==32){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 33);
                    startActivity(intent);
                }
                if(val_key_from_intent==33){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 34);
                    startActivity(intent);
                }
                if(val_key_from_intent==34){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 35);
                    startActivity(intent);
                }
                if(val_key_from_intent==35){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 36);
                    startActivity(intent);
                }
                if(val_key_from_intent==36){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 37);
                    startActivity(intent);
                }
                if(val_key_from_intent==37){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 38);
                    startActivity(intent);
                }
                if(val_key_from_intent==38){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 39);
                    startActivity(intent);
                }
                if(val_key_from_intent==39){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 40);
                    startActivity(intent);
                }
                if(val_key_from_intent==40){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 41);
                    startActivity(intent);
                }if(val_key_from_intent==41){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 42);
                    startActivity(intent);
                }
                if(val_key_from_intent==42){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 43);
                    startActivity(intent);
                }
                if(val_key_from_intent==43){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 44);
                    startActivity(intent);
                }
                if(val_key_from_intent==44){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 45);
                    startActivity(intent);
                }if(val_key_from_intent==45){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 46);
                    startActivity(intent);
                }
                if(val_key_from_intent==46){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 47);
                    startActivity(intent);}
                if(val_key_from_intent==47){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 48);
                    startActivity(intent);
                }
                if(val_key_from_intent==48){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 49);startActivity(intent);
                }
                if(val_key_from_intent==49){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 50);
                    startActivity(intent);
                }
                if(val_key_from_intent==50){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 51);startActivity(intent);
                }
                if(val_key_from_intent==51){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 52);
                    startActivity(intent);
                }
                if(val_key_from_intent==52){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 53);startActivity(intent);
                }
                if(val_key_from_intent==53){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 54);
                    startActivity(intent);
                }
                if(val_key_from_intent==54){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 55);
                    startActivity(intent);
                }
                if(val_key_from_intent==55){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 56);
                    startActivity(intent);
                }
                if(val_key_from_intent==56){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 57);
                    startActivity(intent);
                }
                if(val_key_from_intent==57){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 58);
                    startActivity(intent);
                }
                if(val_key_from_intent==58){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 59);
                    startActivity(intent);
                }
                if(val_key_from_intent==59){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 60);
                    startActivity(intent);
                }
                if(val_key_from_intent==60){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 61);
                    startActivity(intent);
                }
                if(val_key_from_intent==61){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 62);
                    startActivity(intent);
                }
                if(val_key_from_intent==62){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 63);
                    startActivity(intent);
                }
                if(val_key_from_intent==63){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 64);
                    startActivity(intent);
                }
                if(val_key_from_intent==64){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 65);startActivity(intent);
                }
                if(val_key_from_intent==65){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 66);
                    startActivity(intent);
                }
                if(val_key_from_intent==66){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 67);
                    startActivity(intent);
                }
                if(val_key_from_intent==67){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 68);
                    startActivity(intent);
                }
                if(val_key_from_intent==68){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 69);
                    startActivity(intent);
                }
                if(val_key_from_intent==69){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 70);
                    startActivity(intent);
                }
                if(val_key_from_intent==70){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 71);
                    startActivity(intent);
                }
                if(val_key_from_intent==71){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 72);
                    startActivity(intent);
                }
                if(val_key_from_intent==72){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 73);
                    startActivity(intent);
                }
                if(val_key_from_intent==73){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 74);
                    startActivity(intent);
                }
                if(val_key_from_intent==74){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 75);
                    startActivity(intent);
                }
                if(val_key_from_intent==75){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 76);
                    startActivity(intent);
                }
                if(val_key_from_intent==76){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 77);
                    startActivity(intent);
                }
                if(val_key_from_intent==77){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 78);
                    startActivity(intent);
                }
                if(val_key_from_intent==78){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 79);
                    startActivity(intent);
                }
                if(val_key_from_intent==79){Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 80);
                    startActivity(intent);
                }
                if(val_key_from_intent==80){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 81);
                    startActivity(intent);
                }
                if(val_key_from_intent==81){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 82);
                    startActivity(intent);
                }
                if(val_key_from_intent==82){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 83);
                    startActivity(intent);
                }
                if(val_key_from_intent==83){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 84);
                    startActivity(intent);
                }
                if(val_key_from_intent==84){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 85);
                    startActivity(intent);
                }
                if(val_key_from_intent==85){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 86);
                    startActivity(intent);
                }
                if(val_key_from_intent==86){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 87);
                    startActivity(intent);
                }
                if(val_key_from_intent==87){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 88);
                    startActivity(intent);
                }
                if(val_key_from_intent==88){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 89);
                    startActivity(intent);
                }
                if(val_key_from_intent==89){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 90);
                    startActivity(intent);
                }
                if(val_key_from_intent==90){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 91);
                    startActivity(intent);
                }
                if(val_key_from_intent==91){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 92);
                    startActivity(intent);
                }
                if(val_key_from_intent==92){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 93);
                    startActivity(intent);
                }
                if(val_key_from_intent==93){Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 94);
                    startActivity(intent);
                }
                if(val_key_from_intent==94){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 95);
                    startActivity(intent);
                }if(val_key_from_intent==95){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 96);
                    startActivity(intent);
                }
                if(val_key_from_intent==96){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 97);
                    startActivity(intent);
                }
                if(val_key_from_intent==97){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 98);
                    startActivity(intent);
                }
                if(val_key_from_intent==98){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 99);
                    startActivity(intent);
                }
                if(val_key_from_intent==99){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 100);
                    startActivity(intent);}
                if(val_key_from_intent==100){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 101);
                    startActivity(intent);
                }
                if(val_key_from_intent==101){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 102);
                    startActivity(intent);
                }
                if(val_key_from_intent==102){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 103);
                    startActivity(intent);
                }
                if(val_key_from_intent==103){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 110);
                    startActivity(intent);
                }
                if(val_key_from_intent==110){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 111);
                    startActivity(intent);
                }
                if(val_key_from_intent==111){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 112);
                    startActivity(intent);
                }
                if(val_key_from_intent==112){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 113);
                    startActivity(intent);
                }
                if(val_key_from_intent==113){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 114);
                    startActivity(intent);
                }
                if(val_key_from_intent==114){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 115);
                    startActivity(intent);
                }
                if(val_key_from_intent==115){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);intent.putExtra("intent_program_no", 116);
                    startActivity(intent);
                }
                if(val_key_from_intent==116){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 117);
                    startActivity(intent);
                }
                if(val_key_from_intent==117){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 118);
                    startActivity(intent);
                }
                if(val_key_from_intent==118){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 119);
                    startActivity(intent);
                }
                if(val_key_from_intent==119){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 120);
                    startActivity(intent);
                }
                if(val_key_from_intent==120){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 121);
                    startActivity(intent);}
                if(val_key_from_intent==121){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 122);
                    startActivity(intent);
                }
                if(val_key_from_intent==122){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 123);
                    startActivity(intent);
                }
                if(val_key_from_intent==123){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 124);
                    startActivity(intent);
                }
                if(val_key_from_intent==124){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 125);
                    startActivity(intent);
                }
                if(val_key_from_intent==125){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 126);startActivity(intent);
                }
                if(val_key_from_intent==126){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 127);
                    startActivity(intent);
                }
                if(val_key_from_intent==127){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 128);
                    startActivity(intent);
                }
                if(val_key_from_intent==128){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 129);
                    startActivity(intent);
                }
                if(val_key_from_intent==129){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 130);
                    startActivity(intent);
                }
                if(val_key_from_intent==130){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 131);
                    startActivity(intent);
                }
                if(val_key_from_intent==131){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 132);
                    startActivity(intent);
                }
                if(val_key_from_intent==132){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 133);
                    startActivity(intent);
                }
                if(val_key_from_intent==133){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 134);
                    startActivity(intent);
                }
                if(val_key_from_intent==134){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 135);
                    startActivity(intent);
                }
                if(val_key_from_intent==135){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 136);
                    startActivity(intent);
                }
                if(val_key_from_intent==136){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 137);
                    startActivity(intent);
                }
                if(val_key_from_intent==137){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 138);
                    startActivity(intent);
                }
                if(val_key_from_intent==138){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 139);
                    startActivity(intent);
                }
                if(val_key_from_intent==139){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 140);
                    startActivity(intent);
                }
                if(val_key_from_intent==140){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 141);
                    startActivity(intent);
                }
                if(val_key_from_intent==141){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 142);
                    startActivity(intent);
                }
                if(val_key_from_intent==142){
                    Intent intent = new Intent(ProgramNOutput.this, ProgramNOutput.class);
                    intent.putExtra("intent_program_no", 143);
                    startActivity(intent);
                }



            }
        });



        program = findViewById(R.id.textView_program_stringPNO);
        output = findViewById(R.id.textView_output_stringPNO);
        backPno=findViewById(R.id.backPNO);
        backPno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProgramNOutput.this, MainActivity.class);
                startActivity(intent);
            }
        });



//1-10


//        if(val_key_from_intent==1){
//            program.setText("#include <stdio.h>\nint main() {\n\t //printf() displays the string inside quotation\n\tprintf(\"Hello, World!\");\n\treturn 0;\n}.");
//            output.setText(R.string.string_output1);
//        }
//        if(val_key_from_intent==2){
//            program.setText("#include<stdio.h>\n\nint main(){\n\tint a, b, sum;\n\tprintf(\"Enter two integers: \");\n\tscanf(\"%d %d\", &amp;a, &amp;b);\n\n// calculating sum\n\tsum = a + b; \n\tprintf(\"%d + %d = %d\", a, b, sum);\n\treturn 0;\n}.");
//            output.setText(R.string.string_output2);
//        }
//        if(val_key_from_intent==3){
//            program.setText("#include<stdio.h>\n\nint main(){\n\tint a, b, sum;\n\tprintf(\"Enter two integers: \");\n\tscanf(\"%d %d\", &amp;a, &amp;b);\n\n\t// calculating sum\n\tsum = a + b; \n\tprintf(\"%d + %d = %d\", a, b, sum);\n\treturn 0;\n}.");
//            output.setText(R.string.string_output3);
//        }
//        if(val_key_from_intent==4){
//            program.setText("#include<stdio.h>\nint main(){\nint number=0;\nprintf(\"Enter a number:\");\nscanf(\"%d\",&number);\nif(number%2==0){\nprintf(\"%d is even number\",number);\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output4);
//        }
//        if(val_key_from_intent==5){
//            program.setText("#include<stdio.h>\nint main(){\nint number=0;\nprintf(\"Enter a number:\");\nscanf(\"%d\",&number);\nif(number%2==0){\nprintf(\"%d is even number\",number);\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output5);
//        }
//        if(val_key_from_intent==6){
//            program.setText("#include <stdio.h>\n\nint main() {\n\n variables to store the three numbers\n\nint a, b, c;\n\n//take input from the user\nscanf(\"%d %d %d\",&a, &b, &c);\n\n//if else condition to check whether first two numbers are equal\nif (a == b) {\n//nested if else condition to check if c is equal to a and b\nif (a == c) {\t        \n//all are equal\nprintf(\"Yes\");\n} else {\n//all are not equal\nprintf(\"No\");\n}\n} else {\n//the first two numbers are not equal, so they are not equal\nprintf(\"No\");\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output6);
//        }
//        if(val_key_from_intent==7){
//            program.setText("#include <stdio.h>\n\nint main() {\n\n variables to store the three numbers\n\nint a, b, c;\n\n//take input from the user\nscanf(\"%d %d %d\",&a, &b, &c);\n\n//if else condition to check whether first two numbers are equal\nif (a == b) {\n//nested if else condition to check if c is equal to a and b\nif (a == c) {\t        \n//all are equal\nprintf(\"Yes\");\n} else {\n//all are not equal\nprintf(\"No\");\n}\n} else {\n//the first two numbers are not equal, so they are not equal\nprintf(\"No\");\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output7);
//        }
//        if(val_key_from_intent==8){
//            program.setText("#include<stdio.h>\n\nint main(){\nint i=0;for(i=1;i<=10;i++){\nprintf(\"%d \n\",i);\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output8);
//        }
//        if(val_key_from_intent==9){
//            program.setText("#include<stdio.h>\n\nint main(){\nint i=0;for(i=1;i<=10;i++){\nprintf(\"%d \n\",i);\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output9);
//        }
//        if(val_key_from_intent==10){
//            program.setText("// Program to add numbers until the user enters zero\n\n#include <stdio.h>\nint main() {\ndouble number, sum = 0;\n// the body of the loop is executed at least once\ndo {\nprintf(\"Enter a number: \");\nscanf(\"%lf\", &number);\nsum += number;\n}\nwhile(number != 0.0);\n\nprintf(\"Sum = %.2lf\",sum);\nreturn 0;}.");
//            output.setText(R.string.string_output10);
//        }
////11 - 20
//        if(val_key_from_intent==11){
//            program.setText("#include <stdio.h>\nint main() {\nint i, n;\n\n// initialize first and second terms\nint t1 = 0, t2 = 1;\n\n// initialize the next term (3rd term)\n\nint nextTerm = t1 + t2;\n\n// get no. of terms from user\n\nprintf(\"Enter the number of terms: \");\n\nscanf(\"%d\", &n);\n\n// print the first two terms t1 and t2\n\nprintf(\"Fibonacci Series: %d, %d, \", t1, t2);\n\n// print 3rd to nth terms\nfor (i = 3; i <= n; ++i) {\nprintf(\"%d, \", nextTerm);\nt1 = t2;\nt2 = nextTerm;\nnextTerm = t1 + t2;\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output11);
//        }
//        if(val_key_from_intent==12){
//            program.setText("#include <stdio.h>\nint main() {\n declare and initialize an array with an\n\n// initializer list\n\nint a[4] = {10, 20, 30, 40};\n\n print the elements\nprintf(\"%d %d %d %d\n\", a[0], a[1], a[2], a[3]);\nreturn 0;\n}.");
//            output.setText(R.string.string_output12);
//        }
//        if(val_key_from_intent==13){
//            program.setText("#include<stdio.h>\nint main(){\nint i=0,j=0;\nint arr[4][3]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};\n//traversing 2D array\nfor(i=0;i<4;i++){\nfor(j=0;j<3;j++){\nprintf(\"arr[%d] [%d] = %d \n\",i,j,arr[i][j]);\n}//end of j\n}\n//end of i\nreturn 0;\n}   . ");
//            output.setText(R.string.string_output13);
//        }
//        if(val_key_from_intent==14){
//            program.setText("#include <stdio.h>\n\nint main()\n{\n//Initialize array\n\nint arr[] = {25, 11, 7, 75, 56};\n\n//Calculate length of array arr\nint length = sizeof(arr)/sizeof(arr[0]);\n//Initialize min with first element of array.\nint min = arr[0];\n\n//Loop through the array\nfor (int i = 0; i < length; i++) {\n//Compare elements of array with min\nif(arr[i] < min)\nmin = arr[i];\n}\nprintf(\"Smallest element present in given array: %d\n\", min);\nreturn 0;\n}    .");
//            output.setText(R.string.string_output14);
//        }
//        if(val_key_from_intent==15){
//            program.setText("#include <stdio.h>\nint main() {\nint n;\ndouble arr[100];\nprintf(\"Enter the number of elements (1 to 100): \");\nscanf(\"%d\", &n);\n\nfor (int i = 0; i < n; ++i) {\nprintf(\"Enter number%d: \", i + 1);\nscanf(\"%lf\", &arr[i]);\n}\n// storing the largest number to arr[0]\nfor (int i = 1; i < n; ++i) {\nif (arr[0] < arr[i]) {\narr[0] = arr[i];\n}\n}\nprintf(\"Largest element = %.2lf\", arr[0]);\nreturn 0;\n}.");
//            output.setText(R.string.string_output15);
//        }
//        if(val_key_from_intent==16){
//            program.setText("#include<stdio.h>\nint main(){\nint student[40],pos,i,size,value;\nprintf(\"enter no of elements in array of students:\");\nscanf(\"%d\",&size);\nprintf(\"enter %d elements are:\n\",size);\nfor(i=0;i<size;i++)\nscanf(\"%d\",&student[i]);\nprintf(\"enter the position where you want to insert the element:\");\nscanf(\"%d\",&pos);\nprintf(\"enter the value into that poition:\");\nscanf(\"%d\",&value);\nfor(i=size-1;i>=pos-1;i--)\nstudent[i+1]=student[i];\nstudent[pos-1]= value;\nprintf(\"final array after inserting the value is\n\");\nfor(i=0;i<=size;i++)\nprintf(\"%d\n\",student[i]);\nreturn 0;\n}.");
//            output.setText(R.string.string_output16);
//        }
//        if(val_key_from_intent==17){
//            program.setText("#include <stdio.h>\n\nint main()\n{\nint n1,n2,n3;            //Array Size Declaration\nprintf(\"\nEnter the size of first array \");\nscanf(\"%d\",&n1);\nprintf(\"\nEnter the size of second array \");\nscanf(\"%d\",&n2);\n\nn3=n1+n2;\nprintf(\"\nEnter the sorted array elements\");\nint a[n1],b[n2],c[n3];     //Array Declaration\nfor(int i=0;i<n1;i++)      //Array Initialized\n{\nscanf(\"%d\",&a[i]);\nc[i]=a[i];\n}\nint k=n1;\nprintf(\"\nEnter the sorted array elements\");\nfor(int i=0;i<n2;i++)      //Array Initialized\n{\nscanf(\"%d\",&b[i]);\nc[k]=b[i];\nk++;\n}\nprintf(\"\nThe merged array..\n\");\nfor(int i=0;i<n3;i++)\nprintf(\"%d \",c[i]);        //Print the merged array\n\nprintf(\"\nAfter sorting...\n\");\nfor(int i=0;i<n3;i++)         //Sorting Array\n{\nint temp;\nfor(int j=i+1; j<n3 ;j++)\n{\nif(c[i]<c[j])\n{\ntemp=c[i];\nc[i]=c[j];\nc[j]=temp;\n}\n}\n}\n\nfor(int i=0 ; i<n3 ; i++)       //Print the sorted Array\n{\nprintf(\" %d \",c[i]);\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output17);
//        }
//        if(val_key_from_intent==18){
//            program.setText("#include<stdio.h>\n\nint minarray(int arr[],int size){\nint min=arr[0];\nint i=0;\nfor(i=1;i<size;i++){\nif(min>arr[i]){\nmin=arr[i];\n}\n}//end of for\nreturn min;\n}//end of function\n\nint main(){\nint i=0,min=0;\nint numbers[]={4,5,7,3,8,9};//declaration of array\n\nmin=minarray(numbers,6);//passing array with size\nprintf(\"minimum number is %d \n\",min);\nreturn 0;\n}    .");
//            output.setText(R.string.string_output18);
//        }
//        if(val_key_from_intent==19){
//            program.setText("#include <stdio.h>\n#include <stdlib.h>\n\n#define n 6\nint main(){\nint arr[n] = {9, 8, 7, 2, 4, 3};\nint temp;\nfor(int i = 0; i<n/2; i++){\ntemp = arr[i];\narr[i] = arr[n-i-1];\narr[n-i-1] = temp;\n}\nfor(int i = 0; i < n; i++){\nprintf(\"%d,\", arr[i]);\n}\n}.");
//            output.setText(R.string.string_output19);
//        }
//        if(val_key_from_intent==20){
//            program.setText("#include <stdio.h>\n#include <stdlib.h>\n\n#define n 6\nint main(){\nint arr[n] = {9, 8, 7, 2, 4, 3};\nint temp;\nfor(int i = 0; i<n/2; i++){\ntemp = arr[i];\narr[i] = arr[n-i-1];\narr[n-i-1] = temp;\n}\nfor(int i = 0; i < n; i++){\nprintf(\"%d,\", arr[i]);\n}\n}.");
//            output.setText(R.string.string_output20);
//        }
////21-30
//        if(val_key_from_intent==21){
//            program.setText("#include <stdio.h>\n\nvoid getarray(int arr[])\n{\nprintf(\"Elements of array are : \");\nfor(int i=0;i<5;i++)\n{\nprintf(\"%d \", arr[i]);\n}\n}\nint main()\n{\nint arr[5]={45,67,34,78,90};\ngetarray(arr);\nreturn 0;\n}  .");
//            output.setText(R.string.string_output21);
//        }
//        if(val_key_from_intent==22){
//            program.setText("#include <stdio.h>\n\nconst int MAX = 3;\n\nint main () {\n\nint  var[] = {10, 100, 200};\nint i;\n\nfor (i = 0; i < MAX; i++) {\nprintf(\"Value of var[%d] = %d\n\", i, var[i] );\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output22);
//        }
//        if(val_key_from_intent==23){
//            program.setText("#include <stdio.h>\n\nint main () {\nint *arr[3];\nint *a;\nprintf( \"Value of array pointer variable : %d\n\", arr);\nprintf( \"Value of pointer variable : %d\n\", &a);\nreturn 0;\n}.");
//            output.setText(R.string.string_output23);
//        }
//        if(val_key_from_intent==24){
//            program.setText("#include <stdio.h>\n\nint main () {\nint *arr[3];\nint *a;\nprintf( \"Value of array pointer variable : %d\n\", arr);\nprintf( \"Value of pointer variable : %d\n\", &a);\nreturn 0;\n}.");
//            output.setText(R.string.string_output24);
//        }
//        if(val_key_from_intent==25){
//            program.setText("#include <stdio.h>\nint main() {\nint arr[10]={6,12,0,18,11,99,55,45,34,2};\nint n=10;\nint i, j, position, swap;\nfor (i = 0; i < (n - 1); i++) {\nposition = i;\nfor (j = i + 1; j < n; j++) {\nif (arr[position] > arr[j])\nposition = j;\n}\nif (position != i) {\nswap = arr[i];\narr[i] = arr[position];\narr[position] = swap;\n}\n}\nfor (i = 0; i < n; i++)\nprintf(\"%d\t\", arr[i]);\nreturn 0;\n}.");
//            output.setText(R.string.string_output25);
//        }
//        if(val_key_from_intent==26){
//            program.setText("// C program for insertion sort\n\n#include <math.h>\n#include <stdio.h>\n\n\n/* Function to sort an array\nusing insertion sort*/\nvoid insertionSort(int arr[], int n)\n{\nint i, key, j;\nfor (i = 1; i < n; i++)\n{\nkey = arr[i];\nj = i - 1;\n/* Move elements of arr[0..i-1],\nthat are greater than key,\nto one position ahead of \ntheir current position */\nwhile (j >= 0 && arr[j] > key)\n{\n\narr[j + 1] = arr[j];\n\nj = j - 1;\n}\narr[j + 1] = key;\n}\n}\n\n// A utility function to print\n// an array of size n\nvoid printArray(int arr[], int n)\n{\nint i;\nfor (i = 0; i < n; i++)\nprintf(\"%d \", arr[i]);\nprintf(\"\n\");\n}\n\n// Driver code\nint main()\n{\nint arr[] = {12, 11, 13, 5, 6};\nint n = sizeof(arr) // sizeof(arr[0]);\n\ninsertionSort(arr, n);\nprintArray(arr, n);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output26);
//        }
//        if(val_key_from_intent==27){
//            program.setText("#include<stdlib.h>\n#include<stdio.h>\n\n\n// Merge Function\nvoid merge(int arr[], int l, int m, int r)\n{\nint i, j, k;\nint n1 = m - l + 1;\nint n2 = r - m;\nint L[n1], R[n2];\nfor (i = 0; i < n1; i++)\n\nL[i] = arr[l + i];\nfor (j = 0; j < n2; j++)\nR[j] = arr[m + 1+ j];\ni = 0;\nj = 0;\nk = l;\nwhile (i < n1 && j < n2)\n{\nif (L[i] <= R[j])\n{\narr[k] = L[i];\ni++;\n}\nelse\n{\narr[k] = R[j];\nj++;\n}\nk++;\n}\nwhile (i < n1)\n{\narr[k] = L[i];\ni++;\nk++;\n}\nwhile (j < n2)\n{\narr[k] = R[j];\nj++;\nk++;\n}\n}.");
//            output.setText(R.string.string_output27);
//        }
//        if(val_key_from_intent==28){
//            program.setText("#include<stdlib.h>\n#include<stdio.h>\n\n\n// Merge Function\nvoid merge(int arr[], int l, int m, int r)\n{\nint i, j, k;\nint n1 = m - l + 1;\nint n2 = r - m;\nint L[n1], R[n2];\nfor (i = 0; i < n1; i++)\n\nL[i] = arr[l + i];\nfor (j = 0; j < n2; j++)\nR[j] = arr[m + 1+ j];\ni = 0;\nj = 0;\nk = l;\nwhile (i < n1 && j < n2)\n{\nif (L[i] <= R[j])\n{\narr[k] = L[i];\ni++;\n}\nelse\n{\narr[k] = R[j];\nj++;\n}\nk++;\n}\nwhile (i < n1)\n{\narr[k] = L[i];\ni++;\nk++;\n}\nwhile (j < n2)\n{\narr[k] = R[j];\nj++;\nk++;\n}\n}.");
//            output.setText(R.string.string_output28);
//        }
//        if(val_key_from_intent==29){
//            program.setText("#include <stdio.h>\n\nint main()\n{\nint m, n, c, d, first[10][10], second[10][10], sum[10][10];\n\nprintf(\"Enter the number of rows and columns of matrix\n\");\nscanf(\"%d%d\", &m, &n);\nprintf(\"Enter the elements of first matrix\n\");\nfor (c = 0; c < m; c++)\nfor (d = 0; d < n; d++)\nscanf(\"%d\", &first[c][d]);\nprintf(\"Enter the elements of second matrix\n\");\nfor (c = 0; c < m; c++)\nfor (d = 0 ; d < n; d++)\nscanf(\"%d\", &second[c][d]);\nprintf(\"Sum of entered matrices:-\n\");\n\nfor (c = 0; c < m; c++) {\nfor (d = 0 ; d < n; d++) {\nsum[c][d] = first[c][d] + second[c][d];\nprintf(\"%d\t\", sum[c][d]);\n}\nprintf(\"\n\");\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output29);
//        }
//        if(val_key_from_intent==30){
//            program.setText("#include <stdio.h>\n\nint main()\n{\nint m, n, c, d, first[10][10], second[10][10], sum[10][10];\n\nprintf(\"Enter the number of rows and columns of matrix\n\");\nscanf(\"%d%d\", &m, &n);\nprintf(\"Enter the elements of first matrix\n\");\nfor (c = 0; c < m; c++)\nfor (d = 0; d < n; d++)\nscanf(\"%d\", &first[c][d]);\nprintf(\"Enter the elements of second matrix\n\");\nfor (c = 0; c < m; c++)\nfor (d = 0 ; d < n; d++)\nscanf(\"%d\", &second[c][d]);\nprintf(\"Sum of entered matrices:-\n\");\n\nfor (c = 0; c < m; c++) {\nfor (d = 0 ; d < n; d++) {\nsum[c][d] = first[c][d] + second[c][d];\nprintf(\"%d\t\", sum[c][d]);\n}\nprintf(\"\n\");\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output30);
//        }
////31-40
//        if(val_key_from_intent==31){
//            program.setText("#include<stdio.h>\n#include<stdlib.h>\n\nint main(){\nint a[10][10],b[10][10],mul[10][10],r,c,i,j,k;\nsystem(\"cls\");\nprintf(\"enter the number of row=\");\nscanf(\"%d\",&r);\nprintf(\"enter the number of column=\");\nscanf(\"%d\",&c);\nprintf(\"enter the first matrix element=\n\");\nfor(i=0;i<r;i++)\n{\nfor(j=0;j<c;j++)\n{\nscanf(\"%d\",&a[i][j]);\n}\n}\nprintf(\"enter the second matrix element=\n\");\nfor(i=0;i<r;i++)\n{\nfor(j=0;j<c;j++)\n{\nscanf(\"%d\",&b[i][j]);\n}\n}\n\nprintf(\"multiply of the matrix=\n\");\nfor(i=0;i<r;i++)\n{\nfor(j=0;j<c;j++)\n{\nmul[i][j]=0;\nfor(k=0;k<c;k++)\n{\nmul[i][j]+=a[i][k]*b[k][j];\n}\n}\n}\n\n//for printing result\nfor(i=0;i<r;i++)\n{\nfor(j=0;j<c;j++)\n{\nprintf(\"%d\t\",mul[i][j]);\n}\nprintf(\"\n\");\n}\nreturn 0;\n}  .");
//            output.setText(R.string.string_output31);
//        }
//        if(val_key_from_intent==32){
//            program.setText("#include <stdio.h>\n\nint main() {\nint a[10][10], transpose[10][10], r, c;\nprintf(\"Enter rows and columns: \");\nscanf(\"%d %d\", &r, &c);\n\n// asssigning elements to the matrix\nprintf(\"\nEnter matrix elements:\n\");\nfor (int i = 0; i < r; ++i)\nfor (int j = 0; j < c; ++j) {\nprintf(\"Enter element a%d%d: \", i + 1, j + 1);\nscanf(\"%d\", &a[i][j]);\n}\n\n// printing the matrix a[][]\nprintf(\"\nEntered matrix: \n\");\nfor (int i = 0; i < r; ++i)\nfor (int j = 0; j < c; ++j) {\nprintf(\"%d  \", a[i][j]);\nif (j == c - 1)\nprintf(\"\n\");\n}\n\n// computing the transpose\nfor (int i = 0; i < r; ++i)\nfor (int j = 0; j < c; ++j) {\ntranspose[j][i] = a[i][j];\n}\n\n// printing the transpose\nprintf(\"\nTranspose of the matrix:\n\");\nfor (int i = 0; i < c; ++i)\nfor (int j = 0; j < r; ++j) {\nprintf(\"%d  \", transpose[i][j]);\nif (j == r - 1)\nprintf(\"\n\");\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output32);
//        }
//        if(val_key_from_intent==33){
//            program.setText("#include <stdio.h>\ntypedef struct complex {\nfloat real;\nfloat imag;\n} complex;\n\ncomplex add(complex n1, complex n2);\n\nint main() {\ncomplex n1, n2, result;\n\nprintf(\"For 1st complex number \n\");\nprintf(\"Enter the real and imaginary parts: \");\nscanf(\"%f %f\", &n1.real, &n1.imag);\nprintf(\"\nFor 2nd complex number \n\");\nprintf(\"Enter the real and imaginary parts: \");\nscanf(\"%f %f\", &n2.real, &n2.imag);\n\nresult = add(n1, n2);\n\nprintf(\"Sum = %.1f + %.1fi\", result.real, result.imag);\nreturn 0;\n}\n\ncomplex add(complex n1, complex n2) {\ncomplex temp;\ntemp.real = n1.real + n2.real;\ntemp.imag = n1.imag + n2.imag;\nreturn (temp);\n}.");
//            output.setText(R.string.string_output33);
//        }
//        if(val_key_from_intent==34){
//            program.setText("#include<stdio.h>\n\nint main()\n{\nint a[20],i,x,n;\nprintf(\"How many elements?\");\nscanf(\"%d\",&n);\n\nprintf(\"Enter array elements:n\");\nfor(i=0;i<n;++i)\nscanf(\"%d\",&a[i]);\n\nprintf(\"nEnter element to search:\");\nscanf(\"%d\",&x);\n\nfor(i=0;i<n;++i)\nif(a[i]==x)\nbreak;\n\nif(i<n)\nprintf(\"Element found at index %d\",i);\nelse\nprintf(\"Element not found\");\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output34);
//        }
//        if(val_key_from_intent==35){
//            program.setText("#include <stdio.h>\nint main()\n{\nint i, low, high, mid, n, key, array[100];\nprintf(\"Enter number of elementsn\");\nscanf(\"%d\",&n);\nprintf(\"Enter %d integersn\", n);\nfor(i = 0; i < n; i++)\nscanf(\"%d\",&array[i]);\nprintf(\"Enter value to findn\");\nscanf(\"%d\", &key);\nlow = 0;\nhigh = n - 1;\nmid = (low+high)/2;\nwhile (low <= high) {\nif(array[mid] < key)\nlow = mid + 1;\nelse if (array[mid] == key) {\nprintf(\"%d found at location %d.n\", key, mid+1);\nbreak;\n}\nelse\nhigh = mid - 1;\nmid = (low + high)/2;\n}\nif(low > high)\nprintf(\"Not found! %d isn't present in the list.n\", key);\nreturn 0;\n}.");
//            output.setText(R.string.string_output35);
//        }
//        if(val_key_from_intent==36){
//            program.setText("#include <stdio.h>\nint iterativeBinarySearch(int array[], int start_index, int end_index, int element){\nwhile (start_index <= end_index){\nint middle = start_index + (end_index- start_index )/2;\nif (array[middle] == element)\n\nreturn middle;\nif (array[middle] < element)\n\nstart_index = middle + 1;\nelse\n\nend_index = middle - 1;\n}\nreturn -1;\n}\nint main(void){\nint array[] = {1, 4, 7, 9, 16, 56, 70};\nint n = 7;\nint element = 16;\nint found_index = iterativeBinarySearch(array, 0, n-1, element);\nif(found_index == -1 ) {\nprintf(\"Element not found in the array \");\n}\nelse {\nprintf(\"Element found at index : %d\",found_index);\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output36);
//        }
//        if(val_key_from_intent==37){
//            program.setText("#include <stdio.h>\n\n/* function declaration */\nvoid swap(int x, int y);\n\nint main () {\n\n/* local variable definition */n\nint a = 100;\nint b = 200;\n\nprintf(\"Before swap, value of a : %d\n\", a );\nprintf(\"Before swap, value of b : %d\n\", b );\n\n/* calling a function to swap the values */\nswap(a, b);\n\nprintf(\"After swap, value of a : %d\n\", a );\nprintf(\"After swap, value of b : %d\n\", b );\n\nreturn 0;\n}\nvoid swap(int x, int y) {\n\nint temp;\n\ntemp = x; /* save the value of x */\nx = y;    /* put y into x */\ny = temp; /* put temp into y */\n\nreturn;\n}.");
//            output.setText(R.string.string_output37);
//        }
//        if(val_key_from_intent==38){
//            program.setText("#include <stdio.h>\n\nint main () {\n\n/* local variable definition */\nint a = 100;\nint b = 200;\n\nprintf(\"Before swap, value of a : %d\n\", a );\nprintf(\"Before swap, value of b : %d\n\", b );\n\n/* calling a function to swap the values */\nswap(&a, &b);\n\nprintf(\"After swap, value of a : %d\n\", a );\nprintf(\"After swap, value of b : %d\n\", b );\n\nreturn 0;\n}\nvoid swap(int *x, int *y) {\n\nint temp;\n\ntemp = *x; /* save the value of x */\n*x = *y;    /* put y into x */\n*y = temp; /* put temp into y */\n\nreturn;\n}.");
//            output.setText(R.string.string_output38);
//        }
//        if(val_key_from_intent==39){
//            program.setText("#include <stdio.h>\n\nvoid salaryhike(int  *var, int b)\n{\n*var = *var+b;\n}\nint main()\n{\nint salary=0, bonus=0;\nprintf(\"Enter the employee current salary:\");\nscanf(\"%d\", &salary);\nprintf(\"Enter bonus:\");\nscanf(\"%d\", &bonus);\nsalaryhike(&salary, bonus);\nprintf(\"Final salary: %d\", salary);\nreturn 0;\n}.");
//            output.setText(R.string.string_output39);
//        }
//        if(val_key_from_intent==40){
//            program.setText("#include<stdio.h>\n\nvoid printFibonacci(int m){\n\nstatic int m1=0,m2=1,m3;\n\nif(m>0){\n\nm3 = m1 + m2;\n\nm1 = m2;\n\nm2 = m3;\n\nprintf(“%d “,m3);\n\nprintFibonacci(m-1);\n\n}\n\n}\n\nint main(){\n\nint m;\n\nprintf(“Please enter your preferred number of elements here: “);\n\nscanf(“%d”,&m);\n\nprintf(“The Fibonacci Series will be: “);\n\nprintf(“%d %d “,0,1);\n\nprintFibonacci(m-2); //We have used m-2 because we have 2 numbers already printed here\n\nreturn 0;\n\n}.");
//            output.setText(R.string.string_output40);
//        }
////41-50
//        if(val_key_from_intent==41){
//            program.setText("#include<stdio.h>\n\nint main()\n{\nint i,fact=1,number;\nprintf(\"Enter a number: \");\nscanf(\"%d\", &number);\n for(i=1;i<=number;i++){\nfact=fact*i;\n}\nprintf(\"Factorial of %d is: %d\",number,fact);\nreturn 0;\n}   .");
//            output.setText(R.string.string_output41);
//        }
//        if(val_key_from_intent==42){
//            program.setText("Object Oriented Features are not available in C Program\nas C Program is a Procedural Oriented Language.");
//            output.setText(R.string.string_output42);
//        }
//        if(val_key_from_intent==43){
//            program.setText("Object Oriented Features are not available in C Program\nas C Program is a Procedural Oriented Language.");
//            output.setText(R.string.string_output43);
//        }
//        if(val_key_from_intent==44){
//            program.setText("Object Oriented Features are not available in C Program\nas C Program is a Procedural Oriented Language.");
//            output.setText(R.string.string_output44);
//        }
//        if(val_key_from_intent==45){
//            program.setText("#include <stdio.h>\n\nmain() {\n\nint a = 21;\nint c ;\n\nc =  a;\nprintf(\"Line 1 - =  Operator Example, Value of c = %d\n\", c );\n\nc +=  a;\nprintf(\"Line 2 - += Operator Example, Value of c = %d\n\", c );\n\nc -=  a;\nprintf(\"Line 3 - -= Operator Example, Value of c = %d\n\", c );\n\nc *=  a;\nprintf(\"Line 4 - *= Operator Example, Value of c = %d\n\", c );\n\nc /=  a;\nprintf(\"Line 5 - /= Operator Example, Value of c = %d\n\", c );\n\nc  = 200;\nc %=  a;\nprintf(\"Line 6 - %= Operator Example, Value of c = %d\n\", c );\n\nc <<=  2;\nprintf(\"Line 7 - <<= Operator Example, Value of c = %d\n\", c );\n\nc >>=  2;\nprintf(\"Line 8 - >>= Operator Example, Value of c = %d\n\", c );\n\nc &=  2;\nprintf(\"Line 9 - &= Operator Example, Value of c = %d\n\", c );\n\nc ^=  2;\nprintf(\"Line 10 - ^= Operator Example, Value of c = %d\n\", c );\n\nc |=  2;\nprintf(\"Line 11 - |= Operator Example, Value of c = %d\n\", c );\n}.");
//            output.setText("Line 1 - = Operator Example, Value of c = 21\nLine 2 - += Operator Example, Value of c = 42\nLine 3 - -= Operator Example, Value of c = 21Line 4 - *= Operator Example, Value of c = 441\nLine 5 - /= Operator Example, Value of c = 21\nLine 6 - %= Operator Example, Value of c = 11\nLine 7 - <<= Operator Example, Value of c = 44\nLine 8 - >>= Operator Example, Value of c = 11\nLine 9 - &= Operator Example, Value of c = 2\nLine 10 - ^= Operator Example, Value of c = 0\nLine 11 - |= Operator Example, Value of c = 2.");
//        }
//        if(val_key_from_intent==46){
//            program.setText("#include <stdio.h>\n\nmain() {\n\nint a = 21;\nint b = 10;\nint c ;\n\nif( a == b ) {\nprintf(\"Line 1 - a is equal to b\n\" );\n} else {\nprintf(\"Line 1 - a is not equal to b\n\" );\n}\n\nif ( a < b ) {\nprintf(\"Line 2 - a is less than b\n\" );\n} else {\nprintf(\"Line 2 - a is not less than b\n\" );\n}\n\nif ( a > b ) {\nprintf(\"Line 3 - a is greater than b\n\" );\n} else {\nprintf(\"Line 3 - a is not greater than b\n\" );\n}\n\n/* Lets change value of a and b */\na = 5;\nb = 20;\n\nif ( a <= b ) {\nprintf(\"Line 4 - a is either less than or equal to  b\n\" );\n}\n\nif ( b >= a ) {\nprintf(\"Line 5 - b is either greater than  or equal to b\n\" );\n}\n}.");
//            output.setText(R.string.string_output46);
//        }
//        if(val_key_from_intent==47){
//            program.setText("#include<stdio.h>\n\nint stack[100],choice,n,top,x,i;\nvoid push(void);\nvoid pop(void);\nvoid display(void);\nint main()\n{\nclrscr();\ntop=-1;\nprintf(\"\n Enter the size of STACK[MAX=100]:\");\nscanf(\"%d\",&n);\nprintf(\"\n\t STACK OPERATIONS USING ARRAY\");\nprintf(\"\n\t--------------------------------\");\nprintf(\"\n\t 1.PUSH\n\t 2.POP\n\t 3.DISPLAY\n\t 4.EXIT\");\ndo\n{\nprintf(\"\n Enter the Choice:\");\nscanf(\"%d\",&choice);\nswitch(choice)\n{\n\ncase 1:\n\n{\n\npush();\nbreak;\n\n}\n\ncase 2:\n\n{\n\npop();\n\nbreak;\n\n}\n\ncase 3:\n\n{\n\ndisplay();\n\nbreak;\n}\n\ncase 4:\n\n{\n\nprintf(\"\n\t EXIT POINT \");\n\nbreak;\n\n}\n\ndefault: \n\n{n\nn\nprintf (\"\n\t Please Enter a Valid Choice(1/2/3/4)\");\n\n}\n\n}\n}\nwhile(choice!=4);\nreturn 0;\n}\nvoid push()\n{\nif(top>=n-1)\n{\nprintf(\"\n\tSTACK is over flow\");\n\n}\nelse\n{\nprintf(\" Enter a value to be pushed:\");\nscanf(\"%d\",&x);\ntop++;\nstack[top]=x;\n}\n}\nvoid pop()\n{\nif(top<=-1)\n{\nprintf(\"\n\t Stack is under flow\");\n}\nelse\n{\nprintf(\"\n\t The popped elements is %d\",stack[top]);\ntop--;\n}\n}\nvoid display()\n{\nif(top>=0)\n{\nprintf(\"\n The elements in STACK \n\");\nfor(i=top; i>=0; i--)\n\nprintf(\"\n%d\",stack[i]);\nprintf(\"\n Press Next Choice\");\n}\nelse\n{\nprintf(\"\n The STACK is empty\");\n}\n\n}.");
//            output.setText(R.string.string_output47);
//        }
//        if(val_key_from_intent==48){
//            program.setText("/*\n* C Program to Implement a Queue using an Array\n*/\n#include <stdio.h>\n\n#define MAX 50\n\nvoid insert();\nvoid delete();\nvoid display();\nint queue_array[MAX];\nint rear = - 1;\nint front = - 1;\nmain()\n{\nint choice;\nwhile (1){\nprintf(\"1.Insert element to queue \n\");\nprintf(\"2.Delete element from queue \n\");\nprintf(\"3.Display all elements of queue \n\");\nprintf(\"4.Quit \n\");\nprintf(\"Enter your choice : \");\nscanf(\"%d\", &choice);\nswitch (choice)\n{\ncase 1:\ninsert();\nbreak;\ncase 2:\ndelete();\nbreak;\ncase 3:\ndisplay();\nbreak;\ncase 4:\n\nexit(1);\ndefault:\n\nprintf(\"Wrong choice \n\");\n} /* End of switch */\n} /* End of while */\n} /* End of main() */\n\nvoid insert()\n{\nint add_item;\nif (rear == MAX - 1)\nprintf(\"Queue Overflow \n\");\nelse\n{if (front == - 1)\n/*If queue is initially empty */\nfront = 0;\nprintf(\"Inset the element in queue : \");\nscanf(\"%d\", &add_item);\nrear = rear + 1;\nqueue_array[rear] = add_item;\n}\n} /* End of insert() */\n\nvoid delete()\n{\nif (front == - 1 || front > rear)\n{\nprintf(\"Queue Underflow \n\");\nreturn ;\n}\nelse\n{\nprintf(\"Element deleted from queue is : %d\n\", queue_array[front]);\nfront = front + 1;\n}\n} /* End of delete() */\n\nvoid display()\n{\nint i;\nif (front == - 1)\nprintf(\"Queue is empty \n\");\nelse\n{\nprintf(\"Queue is : \n\");\nfor (i = front; i <= rear; i++)\n\nprintf(\"%d \", queue_array[i]);\nprintf(\"\n\");\n}\n} /* End of display() */.");
//            output.setText(R.string.string_output48);
//        }
//        if(val_key_from_intent==49){
//            program.setText("#include <stdio.h>\n#include <stdlib.h>\n\n// Structure to create a node with data and next pointer\nstruct Node {\nint data;\nstruct Node *next;\n};\nNode* top = NULL;\n\n// Push() operation on a  stack\nvoid push(int value) {\nstruct Node *newNode;\nnewNode = (struct Node *)malloc(sizeof(struct Node));\nnewNode->data = value; // assign value to the node\nif (top == NULL) {\nnewNode->next = NULL;\n} else {\nnewNode->next = top; // Make the node as top\n}\ntop = newNode; // top always points to the newly created node\nprintf(\"Node is Inserted\n\n\");\n}\n\nint pop() {\nif (top == NULL) {\nprintf(\"\nStack Underflow\n\");\n} else {\nstruct Node *temp = top;\nint temp_data = top->data;\ntop = top->next;\nfree(temp);\nreturn temp_data;\n}\n}\n\nvoid display() {\n// Display the elements of the stack\nif (top == NULL) {\nprintf(\"\nStack Underflow\n\");\n} else {\nprintf(\"The stack is \n\");\nstruct Node *temp = top;\nwhile (temp->next != NULL) {\n\nprintf(\"%d--->\", temp->data);\n\ntemp = temp->next;\n}\nprintf(\"%d--->NULL\n\n\", temp->data);\n}\n}\n\nint main() {\nint choice, value;\nprintf(\"\nImplementaion of Stack using Linked List\n\");\nwhile (1) {\nprintf(\"1. Push\n2. Pop\n3. Display\n4. Exit\n\");\nprintf(\"\nEnter your choice : \");\nscanf(\"%d\", &choice);\nswitch (choice) {\ncase 1:\n\nprintf(\"\nEnter the value to insert: \");\n\nscanf(\"%d\", &value);\n\npush(value);\n\nbreak;\ncase 2:\n\nprintf(\"Popped element is :%d\n\", pop());\n\nbreak;\ncase 3:\n\ndisplay();\n\nbreak;\ncase 4:\n\nexit(0);\n\nbreak;\ndefault:\n\nprintf(\"\nWrong Choice\n\");\n}\n}\n}.");
//            output.setText(R.string.string_output49);
//        }
//        if(val_key_from_intent==50){
//            program.setText("#include <stdio.h>\n#include <stdlib.h>\n\nstruct node {\nint data;\nstruct node* next;\n};\n\nstruct node* front;\nstruct node* rear;\n\n\nvoid insert(struct node *ptr, int item) {\n\nptr = (struct node *) malloc (sizeof(struct node));\n\nif (ptr == NULL) {\nprintf(\"\nOVERFLOW\n\");\nreturn;\n} else {\nptr -> data = item;\nif (front == NULL) {\n\nfront = ptr;\n\nrear = ptr;\n\nfront -> next = NULL;\n\nrear -> next = NULL;\n} else {\n\nrear -> next = ptr;\n\nrear = ptr;\n\nrear->next = NULL;\n}\n}\n}\n\nint main() {\nstruct node* head = NULL;\ninsert(head, 10);\ninsert(head, 20);\n\nprintf(\"front element: %d\", front->data);\nreturn 0;\n}     .");
//            output.setText(R.string.string_output50);
//        }
////51-60
//        if(val_key_from_intent==51){
//            program.setText("#include <stdio.h>\n\nint main () {\n\n/* local variable definition */\nint a = 100;\nint b = 200;\n\nprintf(\"Before swap, value of a : %d\n\", a );\nprintf(\"Before swap, value of b : %d\n\", b );\n\n/* calling a function to swap the values */\nswap(&a, &b);\n\nprintf(\"After swap, value of a : %d\n\", a );\nprintf(\"After swap, value of b : %d\n\", b );\n\nreturn 0;\n}\nvoid swap(int *x, int *y) {\n\nint temp;\n\ntemp = *x; /* save the value of x */\n*x = *y;    /* put y into x */\n*y = temp; /* put temp into y */\n\nreturn;\n}.");
//            output.setText(R.string.string_output51);
//        }
//        if(val_key_from_intent==52){
//            program.setText("#include<stdio.h>\n\nint main(){\nint number=50;\nint *p;\np=&number;//stores the address of number variable\nprintf(\"Address of p variable is %x \n\",p); // p contains the address of the number therefore printing p gives the address of number.\nprintf(\"Value of p variable is %d \n\",*p); // As we know that * is used to dereference a pointer therefore if we print *p, we will get the value stored at the address contained by p.\nreturn 0;\n}    .");
//            output.setText(R.string.string_output52);
//        }
//        if(val_key_from_intent==53){
//            program.setText("#include <stdio.h>\nlong factorial(int);\nlong find_ncr(int, int);\nlong find_npr(int, int);\n\nint main()\n{\nint n, r;\nlong ncr, npr;\n\nprintf(\"Enter the value of n and r\n\");\nscanf(\"%d%d\",&n,&r);\n\nncr = find_ncr(n, r);\nnpr = find_npr(n, r);\n\nprintf(\"%dC%d = %ld\n\", n, r, ncr);\nprintf(\"%dP%d = %ld\n\", n, r, npr);\n\nreturn 0;\n}\n\nlong find_ncr(int n, int r) {\nlong result;\n\nresult = factorial(n)/(factorial(r)*factorial(n-r));\n\nreturn result;\n}\n\nlong find_npr(int n, int r) {\nlong result;\n\nresult = factorial(n)/factorial(n-r);\n\nreturn result;\n}\n\nlong factorial(int n) {\nint c;\nlong result = 1;\n\nfor (c = 1; c <= n; c++)\nresult = result*c;\n\nreturn result;\n}.");
//            output.setText(R.string.string_output53);
//        }
//        if(val_key_from_intent==54){
//            program.setText("#include <stdio.h>\nint main() {\nint a, b, x, y, t, gcd, lcm;\nprintf(\"Enter two integers\n\");\nscanf(\"%d%d\", &x, &y);\na = x;\nb = y;\nwhile (b != 0) {\nt = b;\nb = a % b;\na = t;\n}\ngcd = a;\nlcm = (x*y)/gcd;\nprintf(\"Greatest common divisor of %d and %d = %d\n\", x, y, gcd);\nprintf(\"Least common multiple of %d and %d = %d\n\", x, y, lcm);\nreturn 0;\n}.");
//            output.setText(R.string.string_output54);
//        }
//        if(val_key_from_intent==55){
//            program.setText("#include<stdio.h>\n\nint main()\n{\nint n,r,sum=0,temp;\nprintf(\"enter the number=\");\nscanf(\"%d\",&n);\ntemp=n;\nwhile(n>0)\n{\nr=n%10;\nsum=sum+(r*r*r);\nn=n/10;\n}\nif(temp==sum)\nprintf(\"armstrong  number \");\nelse\nprintf(\"not armstrong number\");\nreturn 0;\n} .");
//            output.setText(R.string.string_output5);
//        }
//        if(val_key_from_intent==56){
//            program.setText("#include<stdio.h>\n#include <math.h>\n\nint main(){\nprintf(\"\n%f\",ceil(3.6));\nprintf(\"\n%f\",ceil(3.3));\nprintf(\"\n%f\",floor(3.6));\nprintf(\"\n%f\",floor(3.2));\nprintf(\"\n%f\",sqrt(16));\nprintf(\"\n%f\",sqrt(7));\nprintf(\"\n%f\",pow(2,4));\nprintf(\"\n%f\",pow(3,3));\nprintf(\"\n%d\",abs(-12));\nreturn 0;\n}   . ");
//            output.setText(R.string.string_output56);
//        }
//        if(val_key_from_intent==57){
//            program.setText("#include<stdio.h>\n\nint main()\n\n{ float b ,h, area;\n\nb= 5;\n\nh= 13;\n\narea = (b*h) / 2 ;\n\n\nprintf(\"\n\n Area of Triangle is: %f\",area);\n\nreturn (0);\n}  .");
//            output.setText(R.string.string_output57);
//        }
//        if(val_key_from_intent==58){
//            program.setText("#include <stdio.h>\n\nint main() {\nint n, i, sum = 0;\n\nprintf(\"Enter a positive integer: \");\nscanf(\"%d\", &n);\n\nfor (i = 1; i <= n; ++i) {\nsum += i;\n}\n\nprintf(\"Sum = %d\", sum);\nreturn 0;\n}\n.");
//            output.setText(R.string.string_output58);
//        }
//        if(val_key_from_intent==59){
//            program.setText("#include <stdio.h>\nvoid increment(int  *var)\n{\n    /* Although we are performing the increment on variable\n     * var, however the var is a pointer that holds the address\n     * of variable num, which means the increment is actually done\n     * on the address where value of num is stored.\n     */\n    *var = *var+1;\n}\nint main()\n{\n     int num=20;\n     /* This way of calling the function is known as call by\n      * reference. Instead of passing the variable num, we are\n      * passing the address of variable num\n      */\n     increment(&num);\n     printf(\"Value of num is: %d\", num);\n   return 0;\n}");
//            output.setText(R.string.string_output59);
//        }
//        if(val_key_from_intent==60){
//            program.setText("#include <stdio.h>\n#include <conio.h>\n\ninline int mul (int a, int b) //inline function declaration\n{\nreturn (a * b);\n}\nint main ()\n{\nint p;\np = mul(3 , 6);\nprintf (“ The product of the numbers = %d \n”, p);\nreturn 0;\n} .");
//            output.setText(R.string.string_output60);
//        }
////61-70
//        if(val_key_from_intent==61){
//            program.setText("#include<stdio.h>\n\nvoid printName();\nvoid main ()\n{\nprintf(\"Hello \");\nprintName();\n}\nvoid printName()\n{\nprintf(\"Javatpoint\");\n}  .");
//            output.setText(R.string.string_output61);
//        }
//        if(val_key_from_intent==62){
//            program.setText("#include<stdio.h>\n\nvoid printName();\nvoid main ()\n{\nprintf(\"Hello \");\nprintName();\n}\nvoid printName()\n{\nprintf(\"Javatpoint\");\n}  .");
//            output.setText(R.string.string_output62);
//        }
//        if(val_key_from_intent==63){
//            program.setText("#include<stdio.h>\n#include<stdlib.h>\n\n\nint main(){int a[10],n,i;\nsystem (\"cls\");\nprintf(\"Enter the number to convert: \");\nscanf(\"%d\",&n);\nfor(i=0;n>0;i++)\n{\na[i]=n%2;\nn=n/2;\n}\nprintf(\"\nBinary of Given Number is=\");\nfor(i=i-1;i>=0;i--)\n{\nprintf(\"%d\",a[i]);\n}\nreturn 0;\n}  .");
//            output.setText(R.string.string_output63);
//        }
//        if(val_key_from_intent==64){
//            program.setText("/* C Program to Convert Decimal to Octal Number */\n\n#include <stdio.h>\n\nint main()\n{\nint number;\nprintf(\"\n Please Enter the Number You want to Convert  :  \");\nscanf(\"%d\", &number);\n\nprintf(\"\n Octal Number of a Given Number =  %o\", number);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output64);
//        }
//        if(val_key_from_intent==65){
//            program.setText("#include<stdio.h>\n#include<conio.h>\n\nvoid main()\n{\nunsigned int mask;\nclrscr();\nprintf(\"Memory Required : %d butes\",sizeof(mask));\ngetch();\n}.");
//            output.setText(R.string.string_output65);
//        }
//        if(val_key_from_intent==66){
//            program.setText("#include <stdio.h>\n#include <conio.h>\n\nvoid main()\n{\n// declaration of variables\nint num, binary_num, decimal_num = 0, base = 1, rem;\nprintf (\" Enter a binary number with the combination of 0s and 1s \n\");\nscanf (\" %d\", &num); // accept the binary number (0s and 1s)\n\nbinary_num = num; // assign the binary number to the binary_num variable\n\n\nwhile ( num > 0)\n{\nrem = num % 10; /* divide the binary number by 10 and store the remainder in rem variable. */\ndecimal_num = decimal_num + rem * base;\nnum = num / 10; // divide the number with quotient\nbase = base * 2;\n}\n\nprintf ( \" The binary number is %d \t\", binary_num); // print the binary number\nprintf (\" \n The decimal number is %d \t\", decimal_num); // print the decimal\ngetch();\n}  .");
//            output.setText(R.string.string_output66);
//        }
//        if(val_key_from_intent==67){
//            program.setText("#include <stdio.h>\n#include <math.h>\n\nint binary_to_octal(long int binary)\n{\n\nint octal = 0, decimal = 0, i = 0;\nwhile(binary != 0)\n{\ndecimal += (binary%10) * pow(2,i);\n++i;\nbinary/=10;\n}\n\ni = 1;\n\nwhile (decimal != 0)\n{\noctal += (decimal % 8) * i;\ndecimal /= 8;\ni *= 10;\n}\n\nreturn octal;\n}\n\nint main()\n{\nlong int binary;\n\nprintf(“\nEnter a binary number: “);\nscanf(“%lld”, &binary);\n\nprintf(“\nOctal Equivalent : %d\n”, binary_to_octal(binary));\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output67);
//        }
//        if(val_key_from_intent==68){
//            program.setText("/*\n* C Program to Convert Binary to Hexadecimal\n*/\n#include <stdio.h>\n\nint main()\n{\nlong int binaryval, hexadecimalval = 0, i = 1, remainder;\n\nprintf(\"Enter the binary number: \");\nscanf(\"%ld\", &binaryval);\nwhile (binaryval != 0)\n{\nremainder = binaryval % 10;\nhexadecimalval = hexadecimalval + remainder * i;\ni = i * 2;\nbinaryval = binaryval / 10;\n}\nprintf(\"Equivalent hexadecimal value: %lX\", hexadecimalval);\nreturn 0;\n}.");
//            output.setText(R.string.string_output68);
//        }
//        if(val_key_from_intent==69){
//            program.setText("#include <stdio.h>\n\nint main()\n{\nchar z[100] = \"I am learning C programming language.\";\n\nprintf(\"%s\", z); / %s is format specifier\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output69);
//        }
//        if(val_key_from_intent==70){
//            program.setText("#include<stdio.h>\n#include<conio.h>\n\nint string_ln(char*);\n\nvoid main() {\nchar str[20];\nint length;\nclrscr();\n\nprintf(\"\nEnter any string : \");\ngets(str);\n\nlength = string_ln(str);\nprintf(\"The length of the given string %s is : %d\", str, length);\ngetch();\n}\n\nint string_ln(char*p) /* p=&str[0] */\n{\nint count = 0;\nwhile (*p != '\0') {\ncount++;\np++;\n}\nreturn count;\n}.");
//            output.setText(R.string.string_output70);
//        }
////71-80
//        if(val_key_from_intent==71){
//            program.setText("#include<stdio.h>\n#include<conio.h>\n\nint string_ln(char*);\n\nvoid main() {\nchar str[20];\nint length;\nclrscr();\n\nprintf(\"\nEnter any string : \");\ngets(str);\n\nlength = string_ln(str);\nprintf(\"The length of the given string %s is : %d\", str, length);\ngetch();\n}\n\nint string_ln(char*p) /* p=&str[0] */\n{\nint count = 0;\nwhile (*p != '\0') {\ncount++;\np++;\n}\nreturn count;\n}.");
//            output.setText(R.string.string_output71);
//        }
//        if(val_key_from_intent==72){
//            program.setText("#include <stdio.h>\nint main()\n{\nchar first_string[20]; // declaration of char array variable\nchar second_string[20]; // declaration of char array variable\nint i;  // integer variable declaration\nprintf(\"Enter the first string\");\nscanf(\"%s\",first_string);\nprintf(\"\nEnter the second string\");\nscanf(\"%s\",second_string);\nfor(i=0;first_string[i]!='\0';i++);\n\n\nfor(int j=0;second_string[j]!='\0';j++)\n{\n\nfirst_string[i]=second_string[j];\ni++;\n}\nfirst_string[i]='\0';\nprintf(\"After concatenation, the string would look like: %s\", first_string);\nreturn 0;\n}.");
//            output.setText(R.string.string_output72);
//        }
//        if(val_key_from_intent==73){
//            program.setText("#include <stdio.h>\nint stringcompare(char*,char*);\nint main()\n{\nchar str1[20]; // declaration of char array\nchar str2[20]; // declaration of char array\nprintf(\"Enter the first string : \");\nscanf(\"%s\",str1);\nprintf(\"\nEnter the second string : \");\nscanf(\"%s\",str2);\nint compare=stringcompare(str1,str2); // calling stringcompare() function.\nif(compare==0)\nprintf(\"strings are equal\");\nelse\nprintf(\"strings are not equal\");\nreturn 0;\n}\n// Comparing both the strings using pointers\nint stringcompare(char *a,char *b)\n{\nint flag=0;\nwhile(*a!='\0' && *b!='\0')  // while loop\n{\nif(*a!=*b)\n{\n\nflag=1;\n}\na++;\nb++;\n}\n\nif(flag==0)\nreturn 0;\nelse\nreturn 1;\n}  .");
//            output.setText(R.string.string_output73);
//        }
//        if(val_key_from_intent==74){
//            program.setText("/*\n* C program to find the length of a string without using the\n* built-in function\n*/\n#include <stdio.h>\n\nvoid main()\n{\nchar string[50];\nint i, length = 0;\n\nprintf(\"Enter a string \n\");\ngets(string);\n/*  keep going through each character of the string till its end */\nfor (i = 0; string[i] != '\0'; i++)\n{\nlength++;\n}\nprintf(\"The length of a string is the number of characters in it \n\");\nprintf(\"So, the length of %s = %d\n\", string, length);\n}.");
//            output.setText(R.string.string_output74);
//        }
//        if(val_key_from_intent==75){
//            program.setText("#include <stdio.h>\n#include <string.h>\n\nint main()\n{\nchar a[100];\nint length;\n\nprintf(\"Enter a string to calculate its length\n\");\ngets(a);\n\nlength = strlen(a);\n\nprintf(\"Length of the string = %d\n\", length);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output75);
//        }
//        if(val_key_from_intent==76){
//            program.setText("#include <stdio.h>  \n" +
//                    "#include <string.h>  \n" +
//                    "int main()  \n" +
//                    "{  \n" +
//                    "    char str[40]; // declare the size of character string  \n" +
//                    "    printf (\" \n Enter a string to be reversed: \");  \n" +
//                    "    scanf (\"%s\", str);  \n" +
//                    "      \n" +
//                    "    // use strrev() function to reverse a string  \n" +
//                    "    printf (\"\n After the reverse of a string: %s \", strrev(str));  \n" +
//                    "    return 0;  \n" +
//                    "} ");
//            output.setText(R.string.string_output76);
//        }
//        if(val_key_from_intent==77){
//            program.setText("#include <stdio.h>\n#include <string.h>\n\nint main()\n{\nchar str[40]; // declare the size of character string\nprintf (\" \n Enter a string to be reversed: \");\nscanf (\"%s\", str);\n\n// use strrev() function to reverse a string\nprintf (\" \n After the reverse of a string: %s \", strrev(str));\nreturn 0;\n}  .");
//            output.setText(R.string.string_output77);
//        }
//        if(val_key_from_intent==78){
//            program.setText("#include <stdio.h>\n#include <string.h>\n\nint main() {\nchar s[100];\nint i;\nprintf(\"\nEnter a string : \");\ngets(s);\nfor (i = 0; s[i]!='\0'; i++) {\nif(s[i] >= 'a' && s[i] <= 'z') {\n\ns[i] = s[i] -32;\n}\n}\nprintf(\"\nString in Upper Case = %s\", s);\nreturn 0;\n}.");
//            output.setText(R.string.string_output78);
//        }
//        if(val_key_from_intent==79){
//            program.setText("#include <stdio.h>\n\nint main() {\nfloat percentage;\nint total_marks = 1200;\nint scored = 1122;\n\npercentage = (float)scored / total_marks * 100.0;\n\nprintf(\"Percentage = %.2f%%\", percentage);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output79);
//        }
//        if(val_key_from_intent==80){
//            program.setText("#include<stdio.h>\n\nint main() {\nint gross_salary, basic, da, ta;\n\nprintf(\"Enter basic salary : \");\nscanf(\"%d\", &basic);\n\nda = (10 * basic) / 100;\nta = (12 * basic) / 100;\n\ngross_salary = basic + da + ta;\n\nprintf(\"\nGross salary : %d\", gross_salary);\nreturn (0);\n}.");
//            output.setText(R.string.string_output80);
//        }
////81-90
//        if(val_key_from_intent==81){
//            program.setText("#include <stdio.h>\n\nint main()\n{\nfloat celsius, fahrenheit;\nprintf(\"Enter temperature in Celsius: \");\nscanf(\"%f\", &celsius);\n//celsius to fahrenheit conversion formula\nfahrenheit = (celsius * 9 / 5) + 32;\nprintf(\"%.2f Celsius = %.2f Fahrenheit\", celsius, fahrenheit);\nreturn 0;\n}.");
//            output.setText(R.string.string_output81);
//        }
//        if(val_key_from_intent==82){
//            program.setText("#include <stdio.h>\n\nint main() {\n\nint digit;\n\nprintf(\"Enter digit:\");\nscanf(\"%d\",&digit); //Input digit\n\nswitch (digit) { //Writing a case for every digit in 0-9\n\ncase 1:\n\nprintf(\"One\n\");\n\n\nbreak;\ncase 2:\n\nprintf(\"Two\n\");\nbreak;\ncase 3:\n\nprintf(\"Three\n\");\n\n\nbreak;\ncase 4:\n\nprintf(\"Four\n\");\n\nbreak;\ncase 5:\n\nprintf(\"Five\n\");\n\nbreak;\ncase 6:\n\nprintf(\"Six\n\");\n\nbreak;\ncase 7:\n\nprintf(\"Seven\n\");\n\nbreak;\ncase 8:\n\nprintf(\"Eight\n\");\n\nbreak;\ncase 9:\n\nprintf(\"Nine\n\");\n\nbreak;\ncase 0:\n\nprintf(\"Zero\n\");\n\nbreak;\ndefault:\n\nprintf(\"Invalid Digit\n\");\n}\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output82);
//        }
//        if(val_key_from_intent==83){
//            program.setText("#include <stdio.h>\n\nint main () {\n\n/* local variable definition */\nint a = 100;\nint b = 200;\n\nswitch(a) {\n\ncase 100:\n\nprintf(\"This is part of outer switch\n\", a );\n\n\nswitch(b) {\n\ncase 200:\n\nprintf(\"This is part of inner switch\n\", a );\n\n}\n}\n\nprintf(\"Exact value of a is : %d\n\", a );\nprintf(\"Exact value of b is : %d\n\", b );\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output83);
//        }
//        if(val_key_from_intent==84){
//            program.setText("#include <stdio.h>\n#include <conio.h>\n\nvoid main()\n{\nint num, i, j, k = 1;\n\nprintf( \" Enter a number to define the rows in Floyd's triangle: \n\");\nscanf( \"%d\", &num);\n// use nested for loop\n// outer for loop define the rows and check rows condition\nfor (i = 1; i <= num; i++)\n{\n// inner loop check j should be less than equal to 1 and print the data.\nfor (j = 1; j <= i; j++)\n{\n\nprintf(\" %2d\", k++); // print the number\n}\nprintf( \"\n\");\n}\n\ngetch();\n}  .");
//            output.setText(R.string.string_output84);
//        }
//        if(val_key_from_intent==85){
//            program.setText("#include <stdio.h>\n\nint main() {\nint n, n1, rev = 0, rem;\n\nprintf(\"Enter any number: \");\nscanf(\"%d\", &n);\nn1 = n;\n\n//logic\nwhile (n > 0){n\nrem = n % 10;n\rev = rev * 10 + rem;\nn = n / 10;\n}\n\nif (n1 == rev){\nprintf(\"Given number is a palindromic number\");\n}\nelse{\nprintf(\"Given number is not a palindromic number\");\n}\nreturn 0;\n}.");
//            output.setText(R.string.string_output85);
//        }
//        if(val_key_from_intent==86){
//            program.setText("#include<stdio.h>\n\nvoid main( )\n{\nFILE *fp ;\nchar ch ;\nfp = fopen(\"file_handle.c\",\"r\") ;\nwhile ( 1 )\n{\nch = fgetc ( fp ) ;\nif ( ch == EOF )\nbreak ;\nprintf(\"%c\",ch) ;\n}\nfclose (fp ) ;\n}  .");
//            output.setText(R.string.string_output86);
//        }
//        if(val_key_from_intent==87){
//            program.setText("#include <stdio.h>\n\n/* global variable declaration */\nint g = 20;\nint main ()\n{\n/* local variable declaration */\nint g = 10;\nprintf (\"value of g = %d\n\", g);\nreturn 0;\n}.");
//            output.setText(R.string.string_output87);
//        }
//        if(val_key_from_intent==88){
//            program.setText("#include <stdio.h>\n#include <conio.h>\n#include <stdlib.h>\n\nvoid main()\n{\n// use rand() function to generate the number\nprintf (\" The random number is: %d\", rand());\nprintf (\"\n The random number is: %d\", rand());\n\nprintf (\" \n The random number is: %d\", rand());\nprintf (\"\n The random number is: %d\", rand());\ngetch();\n}  .");
//            output.setText(R.string.string_output88);
//        }
//        if(val_key_from_intent==89){
//            program.setText("#include < stdio.h >\n\nlong factorial(int);\nint main()\n{\nint i, n, c;\nprintf(\"Enter the number of rows you wish to see in pascal triangle\n\");\nscanf(\"%d\", & n);\nfor (i = 0; i < n; i++) {\nfor (c = 0; c <= (n - i - 2); c++) printf(\" \");\nfor (c = 0; c <= i; c++) printf(\"%ld \", factorial(i) / (factorial(c) * factorial(i - c)));\nprintf(\"\n\");\n}\nreturn 0;\n}\nlong factorial(int n) {\nint c;\nlong result = 1;\nfor (c = 1; c <= n; c++) result = result * c;\nreturn result;\n} .");
//            output.setText(R.string.string_output89);
//        }
//        if(val_key_from_intent==90){
//            program.setText("#include <stdio.h>\n\nvoid main() {\nint a = 17;\nint b = 35;\nint sum;\nsum = a + b;\nprintf(\"Sum of the given two numbers  = %d\n\", sum);\n}.");
//            output.setText(R.string.string_output90);
//        }
////91-100
//        if(val_key_from_intent==91){
//            program.setText("#include<stdio.h>\n\nint main(){\nint n,i,m=0,flag=0;\nprintf(\"Enter the number to check prime:\");\nscanf(\"%d\",&n);\nm=n/2;\nfor(i=2;i<=m;i++)\n{\nif(n%i==0)\n{\nprintf(\"Number is not prime\");\nflag=1;\nbreak;\n}\n}\nif(flag==0)\nprintf(\"Number is prime\");\nreturn 0;\n}    .");
//            output.setText(R.string.string_output91);
//        }
//        if(val_key_from_intent==92){
//            program.setText("C language Doesn't support Classes.\nContent Included if this would contribute to your Understanding.");
//            output.setText(R.string.string_output92);
//        }
//        if(val_key_from_intent==93){
//            program.setText("#include <stdio.h>  \nint main()  \n{  \n    int *ptr;  \n    ptr=(int*)malloc(4*sizeof(int));  \n    if(ptr==NULL)  \n    {  \n        printf(\"Memory is not allocated\");  \n    }  \n    else  \n    {  \n        printf(\"Memory is allocated\");  \n    }  \n    return 0;  \n}  ");
//            output.setText(R.string.string_output93);
//        }
//        if(val_key_from_intent==94){
//            program.setText("#include <stdio.h>\n\n#define MIN(x,y) ((x<y)?x:y)\n\nint main()\n{\nint a,b,min;\n\nprintf(\"Enter first number: \");\nscanf(\"%d\",&a);\nprintf(\"Enter second number: \");\nscanf(\"%d\",&b);\n\nmin=MIN(a,b);\nprintf(\"Minimum number is: %d\n\",min);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output94);
//        }
//        if(val_key_from_intent==95){
//            program.setText("#include<stdio.h>\n#include<conio.h>\n\nvoid main() {\nint year;\nprintf(\"Enter a year: \");\nscanf(\"%d\", &year);\nif(((year%4==0) && ((year%400==0) || (year%100!==0))\n{\nprintf(\"%d is a leap year\", &year);\n} else {\nprintf(\"%d is not a leap year\", &year);\n}\ngetch();\n}  .");
//            output.setText(R.string.string_output95);
//        }
//        if(val_key_from_intent==96){
//            program.setText("this pointer is not available in static member functions as static member functions can be called without any object (with class name)");
//            output.setText(R.string.string_output96);
//        }
//        if(val_key_from_intent==97){
//            program.setText("#include <stdio.h>\n\nint main()\n{\nint var1, var2, temp;\nprintf(\"Enter two integersn\");\nscanf(\"%d%d\", &var1, &var2);\nprintf(\"Before SwappingnFirst variable = %dnSecond variable = %dn\", var1, var2);\ntemp = var1;\nvar1 = var2;\nvar2 = temp;\nprintf(\"After SwappingnFirst variable = %dnSecond variable = %dn\", var1, var2);\nreturn 0;\n}.");
//            output.setText(R.string.string_output97);
//        }
//        if(val_key_from_intent==98){
//            program.setText("#include<stdio.h>\nint main()\n{\nint a=10, b=20;\nprintf(\"Before swap a=%d b=%d\",a,b);\na=a+b;//a=30 (10+20)\nb=a-b;//b=10 (30-20)\na=a-b;//a=20 (30-10)\nprintf(\"\nAfter swap a=%d b=%d\",a,b);\nreturn 0;\n}   .");
//            output.setText(R.string.string_output98);
//        }
//        if(val_key_from_intent==99){
//            program.setText("#include<stdio.h>\n\nint main()\n{\nfloat P , R , T , SI ;\nP =34000; R =30;  T = 5;\nSI  = (P*R*T)/100;\nprintf(\"\n\n Simple Interest is : %f\", SI);\nreturn (0);\n}  .");
//            output.setText(R.string.string_output99);
//        }
//        if(val_key_from_intent==100){
//            program.setText("/* C program to remove spaces from a string */\n\n#include<stdio.h>\n\nchar *remove_white_spaces(char *str)\n{\nint i = 0, j = 0;\nwhile (str[i])\n{\nif (str[i] != ‘ ‘)\n\nstr[j++] = str[i];\ni++;\n}\nstr[j] = ‘\0’;\nreturn str;\n}\n\nint main()\n{\nchar str[50];\nprintf(\"\n\t Enter a string : \");\ngets(str);\nremove_white_spaces(str);\nprintf(“%s”,str);\nreturn 0;\n}.");
//            output.setText(R.string.string_output100);
//        }
////101-103
//        if(val_key_from_intent==101){
//            program.setText("#include<stdio.h>\n\nint main()\n{\nint n, reverse=0, rem;\nprintf(\"Enter a number: \");\nscanf(\"%d\", &n);\nwhile(n!=0)\n{\nrem=n%10;\nreverse=reverse*10+rem;\n\n=10;\n}\nprintf(\"Reversed Number: %d\",reverse);\nreturn 0;\n}   .");
//            output.setText(R.string.string_output101);
//        }
//        if(val_key_from_intent==102){
//            program.setText("#include<stdio.h>\n\n\nvoid change(int *num) {\nprintf(\"Before adding value inside function num=%d \n\",*num);\n(*num) += 100;\nprintf(\"After adding value inside function num=%d \n\", *num);\n}\nint main() {\nint x=100;\nprintf(\"Before function call x=%d \n\", x);\nchange(&x);//passing reference in function\nprintf(\"After function call x=%d \n\", x);\nreturn 0;\n}    .");
//            output.setText(R.string.string_output102);
//        }
//        if(val_key_from_intent==103){
//            program.setText("#include <stdio.h>\n#include <time.h>\n\nint main(void) {\n\ntime_t now = time(NULL);\n\nif (now == -1) {\n\nputs(\"The time() function failed\");\n}\n\nprintf(\"%ld\n\", now);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output103);
//        }
//
//        //New ones sssssssssssssssssssssssss..................
//
//        if(val_key_from_intent==110) {
//            program.setText("#include<stdio.h>\nint main(){\nconst float PI=3.14;\nprintf(\"The value of PI is: %f\",PI);\nreturn 0;\n}     .");
//            output.setText(R.string.string_output110);
//        }
//        if(val_key_from_intent==111) {
//            program.setText("// Program to illustrate the declaration of variables in C\n#include <stdio.h>\nint main()\n{\n// declaring alpha variable with value 10.\nint alpha = 10;\n// declaring beta variable with value 20.\nint beta = 20;\n// declaring c variable without initializing it.\nint c=0;\n// Checking the initial value of c variable.\nprintf(\"The initial value of c is %d\n\", c);\nc= alpha + beta;\n// printing C variable value.\nprintf(\"The sum of alpha and beta is %d\", c);\nreturn 0;\n}.");
//            output.setText(R.string.string_output111);
//        }
//
//        if(val_key_from_intent==112) {
//            program.setText("#include <stdbool.h> // Header-file for boolean data-type.\nint main() {\nbool x=false;  // Declaration and initialization of boolean variable.\nif (x==true) {  // Conditional statement.\nprintf(\"The value of x is true\");\n} else {\nprintf(\"The value of x is false\");\n}\n\nreturn 0;\n// Output: The value of x is false\n}.");
//            output.setText(R.string.string_output112);
//        }
//
//        if(val_key_from_intent==113) {
//            program.setText("#include <stdio.h>\n\nint main() {\nint i;\n\nprintf(\"Break code: \n\");\nfor (i = 0; i < 10; i++) {\nif (i == 4) {\nbreak;\n}\nprintf(\"%d\n\", i);\n}\nprintf(\"\nContinue code:\n\");\nfor (i = 0; i < 10; i++) {\nif (i == 4) {\ncontinue;\n}\nprintf(\"%d\n\", i);\n}\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output113);
//        }
//
//        if(val_key_from_intent==114) {
//            program.setText("#include <stdio.h>\n// variable with file scope\nint x = 10;\n\nvoid func() {\n// x is available in func() function,\n// x now equals 10 + 10 = 20\nx += 10;\nprintf(\"Value of x is %d\n\", x);\n}\n\nint main() {\nfunc();\n// x is also available in main() function\nx += 30; // x now equals 20 + 30 = 50\nprintf(\"Value of x is %d\", x);\nreturn 0;\n}\n.");
//            output.setText(R.string.string_output114);
//        }
//
//        if(val_key_from_intent==115) {
//            program.setText("#include <stdio.h>\nint main() {\nstatic int a;\nint b;\nprintf(\"Default value of static variable : %d\n\", a);\nprintf(\"Default value of non-static variable : %d\n\", b);\nreturn 0;\n}.");
//            output.setText(R.string.string_output115);
//        }
//
//        if(val_key_from_intent==116) {
//            program.setText("#include <stdio.h>\nint add (int,int); /* function prototype for add */\n\nvoid main()\n{\nprintf(\"%d\n\",add(3,5));\n}\n\nint add(int i, int j)\n{\nreturn i+j;\n}.");
//            output.setText(R.string.string_output116);
//        }
//
//        if(val_key_from_intent==117) {
//            program.setText("/* Basic philosophy of function pointer in callback */\n#include<stdio.h>\n#include<string.h>\n\nint func(char *s)\n{\nprintf(\"Callback recieved : %s\",s);\nreturn 0;\n}\n\nfloat divide(unsigned int a, unsigned int b, int(*status_callback)(char*))\n{\nstatus_callback(\"\n Recieved values...validating\n\");\nif(b == 0)\n{\nstatus_callback(\"\n b = 0 detected, aborting....\n\");\nreturn -1;\n}\nstatus_callback(\"\n Validation complete, performing division\n\");\nfloat ret = a/b;\nstatus_callback(\"\n Division complete, returning value\n\");\nreturn ret;\n}\n\n\nint main(void)\n{\nint(*func_ptr)(char*);\nunsigned int a = 6, b = 3;\nprintf(\"\n This is a prgram to find a/b\n\");\n\nfunc_ptr = func;\n\nfloat ret = divide(a,b,func_ptr);\nprintf(\"\n divide returned [%f]\n\",ret);\n\nreturn 0;\n\n}.");
//            output.setText(R.string.string_output117);
//        }
//
//        if(val_key_from_intent==118) {
//            program.setText("Separate Compilation Program Unavailable.");
//            output.setText(R.string.string_output118);
//        }
//
//        if(val_key_from_intent==119) {
//            program.setText("#include <stdio.h>\nint main( ) {\n\nchar str[100];\nint i;\n\nprintf( \"Enter a value :\");\nscanf(\"%s %d\", str, &i);\n\nprintf( \"\nYou entered: %s %d \", str, i);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output119);
//        }
//
//        if(val_key_from_intent==120) {
//            program.setText("   #include <stdio.h>\n#include <stdlib.h>\n#include <string.h>\n\n#define MAX_LINE_LENGTH 80\n\nint main(int argc, char **argv)\n{\nchar *path;\nchar line[MAX_LINE_LENGTH] = {0};\nunsigned int line_count = 0;\n\nif (argc < 1)\nreturn EXIT_FAILURE;\npath = argv[1];\n\n/* Open file */\nFILE *file = fopen(path, \"r\");\n\nif (!file)\n{\nperror(path);\nreturn EXIT_FAILURE;\n}\n\n/* Get each line until there are none left */\nwhile (fgets(line, MAX_LINE_LENGTH, file))\n{\n/* Print each line */\nprintf(\"line[%06d]: %s\", ++line_count, line);\n\n/* Add a trailing newline to lines that don't already have one */\nif (line[strlen(line) - 1] != '\n')\n\nprintf(\"\n\");\n\n}\n\n/* Close file */\nif (fclose(file))\n{\nreturn EXIT_FAILURE;\nperror(path);\n}\n}.");
//            output.setText(R.string.string_output120);
//        }
//        if(val_key_from_intent==121) {
//            program.setText("#include <stdio.h>\nint main()\n{\nint a;\nfloat b;\nint x = scanf(\"%d%f\", &a, &b);\nprintf(\"Decimal Number is : %d\n\",a);\nprintf(\"Floating-Point Number is : %f\n\",b);\nprintf(\"Return Value: %d\",x);\nreturn 0;\n}.");
//            output.setText(R.string.string_output121);
//        }
//
//        if(val_key_from_intent==122) {
//            program.setText("#include <stdio.h>\n\nint main() {\nint answer_1 = 0; // stores order evaluated answer\nint answer_2 = 0; // stores left to right evaluation\n\nanswer_1 = 2 * 3 + 4 / 2;\nanswer_2 = 2 * (3 + 4) / 2;\n\nprintf(\"Answer with order of evaluation: %d\n\", answer_1);\nprintf(\"Answer without order of evaluation: %d\n\", answer_2);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output122);
//        }
//
//        if(val_key_from_intent==123) {
//            program.setText("#include <stdio.h>\nint main()\n{\nint a = 1;\nchar b = 'G';\ndouble c = 3.14;\nprintf(\"Hello World!\n\");\n\n// printing the variables defined\n// above along with their sizes\nprintf(\"Hello! I am a character. My value is %c and \"\n\n\"my size is %lu byte.\n\",\n\nb, sizeof(char));\n// can use sizeof(b) above as well\n\nprintf(\"Hello! I am an integer. My value is %d and \"\n\n\"my size is %lu  bytes.\n\",\n\na, sizeof(int));\n// can use sizeof(a) above as well\n\nprintf(\"Hello! I am a double floating point variable.\"\n\n\" My value is %lf and my size is %lu bytes.\n\",\n\nc, sizeof(double));\n// can use sizeof(c) above as well\n\nprintf(\"Bye! See you soon. :)\n\");\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output123);
//        }
//
//        if(val_key_from_intent==124) {
//            program.setText("#include<stdio.h>\n#include \"circle.c\"\n#include \"circle.h\"\n\n#define PI 3.14159265358979323846\ndouble circle_area(float, float);\n\nint main()\n{\nfloat r = 4.0;\nprintf(\"%.2f\", circle_area(r, PI));\nreturn 0;\n}\n\ndouble circle_area(float r, float PI){\nreturn (PI * r * r);\n}.");
//            output.setText(R.string.string_output124);
//        }
//
//        if(val_key_from_intent==125) {
//            program.setText("#include<stdio.h>\n#define square(a) a*a;\nint main(){\nint b,c;\nprintf(\"enter b element:\");\nscanf(\"%d\",&b);\nc=square(b);//replaces c=b*b before execution of program\nprintf(\"%d\",c);\nreturn 0;\n}.");
//            output.setText(R.string.string_output125);
//        }
//
//        if(val_key_from_intent==126) {
//            program.setText("# include <stdio.h>\n# define a 10;\nvoid main(){\n#ifdef a\nprintf(\"\n Hello I am here..\");\n#endif\n#ifndef a\nprintf(\"\n Not defined \");\n#else\nprintf(\"\n R u There \");\n#endif\n}.");
//            output.setText(R.string.string_output126);
//        }
//
//        if(val_key_from_intent==127) {
//            program.setText("// C program to illustrate\n// pointer increment//decrement\n\n#include <stdio.h>\n\n// Driver Code\nint main()\n{\n// Integer variable\nint N = 4;\n\n// Pointer to an integer\nint *ptr1, *ptr2;\n// Pointer stores\n// the address of N\nptr1 = &N;\nptr2 = &N;\n\nprintf(\"Pointer ptr1 \"\n\n\"before Increment: \");\nprintf(\"%p \n\", ptr1);\n\n// Incrementing pointer ptr1;\nptr1++;\n\nprintf(\"Pointer ptr1 after\"\n\n\" Increment: \");\nprintf(\"%p \n\n\", ptr1);\n\nprintf(\"Pointer ptr1 before\"\n\n\" Decrement: \");\nprintf(\"%p \n\", ptr1);\n\n// Decrementing pointer ptr1;\nptr1--;\n\nprintf(\"Pointer ptr1 after\"\n\n\" Decrement: \");\nprintf(\"%p \n\n\", ptr1);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output127);
//        }
//
//        if(val_key_from_intent==128) {
//            program.setText("#include <stdio.h>\n\nint main()\n{\nchar arr[] = \"don't panic\n\";\nchar* ptr = arr;\n\nprintf(\"%c %c\n\", arr[4], ptr[4]);\nprintf(\"%c %c\n\", *(arr+2), *(ptr+2));\n\nreturn 0;\n\n}.");
//            output.setText(R.string.string_output128);
//        }
//
//        if(val_key_from_intent==129) {
//            program.setText("#include <stdio.h>\n\nvoid swap(int *a, int *b);\n\nint main()\n{\nint m = 10, n = 20;\nprintf(\"m = %d\n\", m);\nprintf(\"n = %d\n\n\", n);\n\nswap(&m, &n);    //passing address of m and n to the swap function\nprintf(\"After Swapping:\n\n\");\nprintf(\"m = %d\n\", m);\nprintf(\"n = %d\", n);\nreturn 0;\n}\n\n/*\npointer 'a' and 'b' holds and\npoints to the address of 'm' and 'n'\n*/\nvoid swap(int *a, int *b)\n{\nint temp;\ntemp = *a;\n*a = *b;\n*b = temp;\n}.");
//            output.setText(R.string.string_output129);
//        }
//
//        if(val_key_from_intent==130) {
//            program.setText("#include <stdio.h>\n#include <string.h>\nint main()\n{\nchar str1[100];\nchar newString[10][10];\nint i,j,ctr;\nprintf(\"\n\n Split string by space into words :\n\");\nprintf(\"---------------------------------------\n\");\n\nprintf(\" Input  a string : \");\nfgets(str1, sizeof str1, stdin);\n\nj=0; ctr=0;\nfor(i=0;i<=(strlen(str1));i++)\n{\n// if space or NULL found, assign NULL into newString[ctr]\nif(str1[i]==' '||str1[i]=='\0')\n{\n\nnewString[ctr][j]='\0';\n\nctr++;  //for next word\n\nj=0;    //for next word, init index to 0\n}\nelse\n{\n\nnewString[ctr][j]=str1[i];\n\nj++;\n}\n}\nprintf(\"\n Strings or words after split by space are :\n\");\nfor(i=0;i < ctr;i++)\nprintf(\" %s\n\",newString[i]);\nreturn 0;\n}.");
//            output.setText(R.string.string_output130);
//        }
//        if(val_key_from_intent==131) {
//            program.setText("#include <stdlib.h>\nint main(){\nint *ptr;\nptr = malloc(15 * sizeof(*ptr)); /* a block of 15 integers */\nif (ptr != NULL) {\n*(ptr + 5) = 480; /* assign 480 to sixth integer */\nprintf(\"Value of the 6th integer is %d\",*(ptr + 5));\n}\n}.");
//            output.setText(R.string.string_output131);
//        }
//
//        if(val_key_from_intent==132) {
//            program.setText("// Program to calculate the sum of n numbers entered by the user\n\n#include <stdio.h>\n#include <stdlib.h>\n\nint main() {\nint n, i, *ptr, sum = 0;\n\nprintf(\"Enter number of elements: \");\nscanf(\"%d\", &n);\n\nptr = (int*) malloc(n * sizeof(int));\n\n// if memory cannot be allocated\nif(ptr == NULL) {\nprintf(\"Error! memory not allocated.\");\nexit(0);\n}\n\nprintf(\"Enter elements: \");\nfor(i = 0; i < n; ++i) {\nscanf(\"%d\", ptr + i);\nsum += *(ptr + i);\n}\n\nprintf(\"Sum = %d\", sum);\n\n// deallocating the memory\nfree(ptr);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output132);
//        }
//
//        if(val_key_from_intent==133) {
//            program.setText("#include <stdio.h>\n#include <stdlib.h>\nint main() {\nint n = 4, i, *p, s = 0;\np = (int*) calloc(n, sizeof(int));\nif(p == NULL) {\nprintf(\"\nError! memory not allocated.\");\nexit(0);\n}\nprintf(\"\nEnter elements of array : \");\nfor(i = 0; i < n; ++i) {\nscanf(\"%d\", p + i);\ns += *(p + i);\n}\nprintf(\"\nSum : %d\", s);p = (int*) realloc(p, 6);\nprintf(\"\nEnter elements of array : \");\nfor(i = 0; i < n; ++i) {\nscanf(\"%d\", p + i);\ns += *(p + i);\n}\nprintf(\"\nSum : %d\", s);\nreturn 0;\n}.");
//            output.setText(R.string.string_output133);
//        }
//
//        if(val_key_from_intent==134) {
//            program.setText("#include <stdio.h>\n\nint main() {\n// Block\n{\n//Variables within the block\nint a = 8;\nint b = 10;\nprintf (\"The values are: %d, %d\n\", a, b);\n}\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output134);
//        }
//
//        if(val_key_from_intent==135) {
//            program.setText("\n// C program to illustrate fopen()\n\n#include <stdio.h>\n#include <stdlib.h>\n\nint main()\n{\n\n// pointer demo to FILE\nFILE* demo;\n\n// Creates a file \"demo_file\"\n// with file access as write-plus mode\ndemo = fopen(\"demo_file.txt\", \"w+\");\n\n// adds content to the file\nfprintf(demo, \"%s %s %s\", \"Welcome\",\n\n\"to\", \"GeeksforGeeks\");\n\n// closes the file pointed by demo\nfclose(demo);\n\nreturn 0;\n}.");
//            output.setText(R.string.string_output135);
//        }
//
//        if(val_key_from_intent==136) {
//            program.setText("#include <stdio.h>\n/* Read one line from fp, */\n/* copying it to line array (but no more than max chars). */\n/* Does not place terminating \n in line array. */\n/* Returns line length, or 0 for empty line, or EOF for end-of-file. */\n\nint fgetline(FILE *fp, char line[], int max)\n{\nint nch = 0;\nint c;\nmax = max - 1;\t\t\t/* leave room for '\0' */\n\nwhile((c = getc(fp)) != EOF)\n{\nif(c == '\n')\nbreak;\n\nif(nch < max)\n{\nline[nch] = c;\nnch = nch + 1;\n}\n}\n\nif(c == EOF && nch == 0)\nreturn EOF;\n\nline[nch] = '\0';\nreturn nch;\n}.");
//            output.setText(R.string.string_output136);
//        }
//
//        if(val_key_from_intent==137) {
//            program.setText("Not Available.");
//            output.setText(R.string.string_output137);
//        }
//
//        if(val_key_from_intent==138) {
//            program.setText("Not Available.");
//            output.setText(R.string.string_output138);
//        }
//
//        if(val_key_from_intent==139) {
//            program.setText();
//            output.setText(R.string.string_output139);
//        }
//
//        if(val_key_from_intent==140) {
//            program.setText("// C program to implement\n// the above approach\n#include <stdio.h>\n#include <stdlib.h>\n#include <string.h>\n\n// Driver code\nint main()\n{\nFILE* ptr;\nchar ch;\n\n// Opening file in reading mode\nptr = fopen(\"test.txt\", \"r\");\n\nif (NULL == ptr) {\nprintf(\"file can't be opened \n\");\n}\n\nprintf(\"content of this file are \n\");\n\n// Printing what is written in file\n// character by character using loop.\ndo {\nch = fgetc(ptr);\nprintf(\"%c\", ch);\n\n// Checking if character is not EOF.\n// If it is EOF stop eading.\n} while (ch != EOF);\n\n// Closing the file\nfclose(ptr);\nreturn 0;\n}.");
//            output.setText(R.string.string_output140);
//        }
//        if(val_key_from_intent==141) {
//            program.setText("#include <stdio.h>\n\nint main() {\n\nprintf(\"File :%s\n\", __FILE__ );\nprintf(\"Date :%s\n\", __DATE__ );\nprintf(\"Time :%s\n\", __TIME__ );\nprintf(\"Line :%d\n\", __LINE__ );\nprintf(\"ANSI :%d\n\", __STDC__ );\n\n}.");
//            output.setText(R.string.string_output141);
//        }
//
//        if(val_key_from_intent==142) {
//            program.setText("#include <stdio.h>\n#include <math.h>\n\nint main()\n{\nfloat num, root;\nprintf(\"Enter a number: \");\nscanf(\"%f\", &num);\n\n// Computes the square root of num and stores in root.\nroot = sqrt(num);\n\nprintf(\"Square root of %.2f = %.2f\", num, root);\nreturn 0;\n}.");
//            output.setText(R.string.string_output142);
//        }
//
//        if(val_key_from_intent==143) {
//            program.setText("#include <stdio.h>\n#include <conio.h>\nint main ()\n{\n// declare integer variables\nint x, y, z;\nprintf (\" Input the value of X: \");\nscanf (\" %d\", &x);\nprintf (\"  Input the value of Y: \");\nscanf (\" %d\", &y);\nprintf (\" Input the value of Z: \");\nscanf (\" %d\", &z);\n// use pre increment operator to update the value by 1\n++x;\n++y;\n++z;\n\nprintf (\" \n The updated value of the X: %d \", x);\nprintf (\" \n The updated value of the Y: %d \", y);\nprintf (\" \n The updated value of the Z: %d \", z);\nreturn 0;\n}  .");
//            output.setText(R.string.string_output143);
//        }
//









































































































//1-10


        if(val_key_from_intent==1){
            prev_cv.setVisibility(View.GONE);
            program.setText("#include <stdio.h>\n\tint main() {\n\t\t //printf() displays the string inside quotation\n\t\tprintf(\"Hello, World!\");\n\t\treturn 0;\n\t}.");
            output.setText(R.string.string_output1);
            programNAme.setText(R.string.string_pTops1);
        }
        if(val_key_from_intent==2){
            program.setText("#include<stdio.h>\n\t\n\tint main(){\n\t\tint a, b, sum;\n\t\tprintf(\"Enter two integers: \");\n\t\tscanf(\"%d %d\", &amp;a, &amp;b);\n\t\n\t// calculating sum\n\t\tsum = a + b; \n\t\tprintf(\"%d + %d = %d\", a, b, sum);\n\t\treturn 0;\n\t}.");
            output.setText(R.string.string_output2);
            programNAme.setText(R.string.string_pTops2);
        }
        if(val_key_from_intent==3){
            program.setText("#include<stdio.h>\n\t\n\tint main(){\n\t\tint a, b, sum;\n\t\tprintf(\"Enter two integers: \");\n\t\tscanf(\"%d %d\", &amp;a, &amp;b);\n\t\n\t\t// calculating sum\n\t\tsum = a + b; \n\t\tprintf(\"%d + %d = %d\", a, b, sum);\n\t\treturn 0;\n\t}.");
            output.setText(R.string.string_output3);
            programNAme.setText(R.string.string_pTops3);
        }
        if(val_key_from_intent==4){
            program.setText("#include<stdio.h>\n\tint main(){\n\tint number=0;\n\tprintf(\"Enter a number:\");\n\tscanf(\"%d\",&number);\n\tif(number%2==0){\n\tprintf(\"%d is even number\",number);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output4);
            programNAme.setText(R.string.string_pTops4);
        }
        if(val_key_from_intent==5){
            program.setText("#include<stdio.h>\n\tint main(){\n\tint number=0;\n\tprintf(\"Enter a number:\");\n\tscanf(\"%d\",&number);\n\tif(number%2==0){\n\tprintf(\"%d is even number\",number);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output5);
            programNAme.setText(R.string.string_pTops5);
        }
        if(val_key_from_intent==6){
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\t\n\t variables to store the three numbers\n\t\n\tint a, b, c;\n\t\n\t//take input from the user\n\tscanf(\"%d %d %d\",&a, &b, &c);\n\t\n\t//if else condition to check whether first two numbers are equal\n\tif (a == b) {\n\t//nested if else condition to check if c is equal to a and b\n\tif (a == c) {\t        \n\t//all are equal\n\tprintf(\"Yes\");\n\t} else {\n\t//all are not equal\n\tprintf(\"No\");\n\t}\n\t} else {\n\t//the first two numbers are not equal, so they are not equal\n\tprintf(\"No\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output6);
            programNAme.setText(R.string.string_pTops6);
        }
        if(val_key_from_intent==7){
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\t\n\t variables to store the three numbers\n\t\n\tint a, b, c;\n\t\n\t//take input from the user\n\tscanf(\"%d %d %d\",&a, &b, &c);\n\t\n\t//if else condition to check whether first two numbers are equal\n\tif (a == b) {\n\t//nested if else condition to check if c is equal to a and b\n\tif (a == c) {\t        \n\t//all are equal\n\tprintf(\"Yes\");\n\t} else {\n\t//all are not equal\n\tprintf(\"No\");\n\t}\n\t} else {\n\t//the first two numbers are not equal, so they are not equal\n\tprintf(\"No\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output7);
            programNAme.setText(R.string.string_pTops7);
        }
        if(val_key_from_intent==8){
            program.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint i=0;for(i=1;i<=10;i++){\n\tprintf(\"%d \n\t\",i);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output8);
            programNAme.setText(R.string.string_pTops8);
        }
        if(val_key_from_intent==9){
            program.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint i=0;for(i=1;i<=10;i++){\n\tprintf(\"%d \n\t\",i);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output9);
            programNAme.setText(R.string.string_pTops9);
        }
        if(val_key_from_intent==10){
            program.setText("// Program to add numbers until the user enters zero\n\t\n\t#include <stdio.h>\n\tint main() {\n\tdouble number, sum = 0;\n\t// the body of the loop is executed at least once\n\tdo {\n\tprintf(\"Enter a number: \");\n\tscanf(\"%lf\", &number);\n\tsum += number;\n\t}\n\twhile(number != 0.0);\n\t\n\tprintf(\"Sum = %.2lf\",sum);\n\treturn 0;}.");
            output.setText(R.string.string_output10);
            programNAme.setText(R.string.string_pTops10);
        }
//11 - 20
        if(val_key_from_intent==11){
            program.setText("#include <stdio.h>\n\tint main() {\n\tint i, n;\n\t\n\t// initialize first and second terms\n\tint t1 = 0, t2 = 1;\n\t\n\t// initialize the next term (3rd term)\n\t\n\tint nextTerm = t1 + t2;\n\t\n\t// get no. of terms from user\n\t\n\tprintf(\"Enter the number of terms: \");\n\t\n\tscanf(\"%d\", &n);\n\t\n\t// print the first two terms t1 and t2\n\t\n\tprintf(\"Fibonacci Series: %d, %d, \", t1, t2);\n\t\n\t// print 3rd to nth terms\n\tfor (i = 3; i <= n; ++i) {\n\tprintf(\"%d, \", nextTerm);\n\tt1 = t2;\n\tt2 = nextTerm;\n\tnextTerm = t1 + t2;\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output11);
            programNAme.setText(R.string.string_pTops11);
        }
        if(val_key_from_intent==12){
            program.setText("#include <stdio.h>\n\tint main() {\n\t declare and initialize an array with an\n\t\n\t// initializer list\n\t\n\tint a[4] = {10, 20, 30, 40};\n\t\n\t print the elements\n\tprintf(\"%d %d %d %d\n\t\", a[0], a[1], a[2], a[3]);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output12);
            programNAme.setText(R.string.string_pTops12);
        }
        if(val_key_from_intent==13){
            program.setText("#include<stdio.h>\n\tint main(){\n\tint i=0,j=0;\n\tint arr[4][3]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};\n\t//traversing 2D array\n\tfor(i=0;i<4;i++){\n\tfor(j=0;j<3;j++){\n\tprintf(\"arr[%d] [%d] = %d \n\t\",i,j,arr[i][j]);\n\t}//end of j\n\t}\n\t//end of i\n\treturn 0;\n\t}   . ");
            output.setText(R.string.string_output13);
            programNAme.setText(R.string.string_pTops13);
        }
        if(val_key_from_intent==14){
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\t//Initialize array\n\t\n\tint arr[] = {25, 11, 7, 75, 56};\n\t\n\t//Calculate length of array arr\n\tint length = sizeof(arr)/sizeof(arr[0]);\n\t//Initialize min with first element of array.\n\tint min = arr[0];\n\t\n\t//Loop through the array\n\tfor (int i = 0; i < length; i++) {\n\t//Compare elements of array with min\n\tif(arr[i] < min)\n\tmin = arr[i];\n\t}\n\tprintf(\"Smallest element present in given array: %d\n\t\", min);\n\treturn 0;\n\t}    .");
            output.setText(R.string.string_output14);
            programNAme.setText(R.string.string_pTops14);
        }
        if(val_key_from_intent==15){
            program.setText("#include <stdio.h>\n\tint main() {\n\tint n;\n\tdouble arr[100];\n\tprintf(\"Enter the number of elements (1 to 100): \");\n\tscanf(\"%d\", &n);\n\t\n\tfor (int i = 0; i < n; ++i) {\n\tprintf(\"Enter number%d: \", i + 1);\n\tscanf(\"%lf\", &arr[i]);\n\t}\n\t// storing the largest number to arr[0]\n\tfor (int i = 1; i < n; ++i) {\n\tif (arr[0] < arr[i]) {\n\tarr[0] = arr[i];\n\t}\n\t}\n\tprintf(\"Largest element = %.2lf\", arr[0]);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output15);
            programNAme.setText(R.string.string_pTops15);
        }
        if(val_key_from_intent==16){
            program.setText("#include<stdio.h>\n\tint main(){\n\tint student[40],pos,i,size,value;\n\tprintf(\"enter no of elements in array of students:\");\n\tscanf(\"%d\",&size);\n\tprintf(\"enter %d elements are:\n\t\",size);\n\tfor(i=0;i<size;i++)\n\tscanf(\"%d\",&student[i]);\n\tprintf(\"enter the position where you want to insert the element:\");\n\tscanf(\"%d\",&pos);\n\tprintf(\"enter the value into that poition:\");\n\tscanf(\"%d\",&value);\n\tfor(i=size-1;i>=pos-1;i--)\n\tstudent[i+1]=student[i];\n\tstudent[pos-1]= value;\n\tprintf(\"final array after inserting the value is\n\t\");\n\tfor(i=0;i<=size;i++)\n\tprintf(\"%d\n\t\",student[i]);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output16);
            programNAme.setText(R.string.string_pTops16);
        }
        if(val_key_from_intent==17){
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tint n1,n2,n3;            //Array Size Declaration\n\tprintf(\"\n\tEnter the size of first array \");\n\tscanf(\"%d\",&n1);\n\tprintf(\"\n\tEnter the size of second array \");\n\tscanf(\"%d\",&n2);\n\t\n\tn3=n1+n2;\n\tprintf(\"\n\tEnter the sorted array elements\");\n\tint a[n1],b[n2],c[n3];     //Array Declaration\n\tfor(int i=0;i<n1;i++)      //Array Initialized\n\t{\n\tscanf(\"%d\",&a[i]);\n\tc[i]=a[i];\n\t}\n\tint k=n1;\n\tprintf(\"\n\tEnter the sorted array elements\");\n\tfor(int i=0;i<n2;i++)      //Array Initialized\n\t{\n\tscanf(\"%d\",&b[i]);\n\tc[k]=b[i];\n\tk++;\n\t}\n\tprintf(\"\n\tThe merged array..\n\t\");\n\tfor(int i=0;i<n3;i++)\n\tprintf(\"%d \",c[i]);        //Print the merged array\n\t\n\tprintf(\"\n\tAfter sorting...\n\t\");\n\tfor(int i=0;i<n3;i++)         //Sorting Array\n\t{\n\tint temp;\n\tfor(int j=i+1; j<n3 ;j++)\n\t{\n\tif(c[i]<c[j])\n\t{\n\ttemp=c[i];\n\tc[i]=c[j];\n\tc[j]=temp;\n\t}\n\t}\n\t}\n\t\n\tfor(int i=0 ; i<n3 ; i++)       //Print the sorted Array\n\t{\n\tprintf(\" %d \",c[i]);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output17);
            programNAme.setText(R.string.string_pTops17);
        }
        if(val_key_from_intent==18){
            program.setText("#include<stdio.h>\n\t\n\tint minarray(int arr[],int size){\n\tint min=arr[0];\n\tint i=0;\n\tfor(i=1;i<size;i++){\n\tif(min>arr[i]){\n\tmin=arr[i];\n\t}\n\t}//end of for\n\treturn min;\n\t}//end of function\n\t\n\tint main(){\n\tint i=0,min=0;\n\tint numbers[]={4,5,7,3,8,9};//declaration of array\n\t\n\tmin=minarray(numbers,6);//passing array with size\n\tprintf(\"minimum number is %d \n\t\",min);\n\treturn 0;\n\t}    .");
            output.setText(R.string.string_output18);
            programNAme.setText(R.string.string_pTops18);
        }
        if(val_key_from_intent==19){
            program.setText("#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\t#define n 6\n\tint main(){\n\tint arr[n] = {9, 8, 7, 2, 4, 3};\n\tint temp;\n\tfor(int i = 0; i<n/2; i++){\n\ttemp = arr[i];\n\tarr[i] = arr[n-i-1];\n\tarr[n-i-1] = temp;\n\t}\n\tfor(int i = 0; i < n; i++){\n\tprintf(\"%d,\", arr[i]);\n\t}\n\t}.");
            output.setText(R.string.string_output19);
            programNAme.setText(R.string.string_pTops19);
        }
        if(val_key_from_intent==20){
            program.setText("#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\t#define n 6\n\tint main(){\n\tint arr[n] = {9, 8, 7, 2, 4, 3};\n\tint temp;\n\tfor(int i = 0; i<n/2; i++){\n\ttemp = arr[i];\n\tarr[i] = arr[n-i-1];\n\tarr[n-i-1] = temp;\n\t}\n\tfor(int i = 0; i < n; i++){\n\tprintf(\"%d,\", arr[i]);\n\t}\n\t}.");
            output.setText(R.string.string_output20);
            programNAme.setText(R.string.string_pTops20);
        }
//21-30
        if(val_key_from_intent==21){
            program.setText("#include <stdio.h>\n\t\n\tvoid getarray(int arr[])\n\t{\n\tprintf(\"Elements of array are : \");\n\tfor(int i=0;i<5;i++)\n\t{\n\tprintf(\"%d \", arr[i]);\n\t}\n\t}\n\tint main()\n\t{\n\tint arr[5]={45,67,34,78,90};\n\tgetarray(arr);\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output21);
            programNAme.setText(R.string.string_pTops21);
        }
        if(val_key_from_intent==22){
            program.setText("#include <stdio.h>\n\t\n\tconst int MAX = 3;\n\t\n\tint main () {\n\t\n\tint  var[] = {10, 100, 200};\n\tint i;\n\t\n\tfor (i = 0; i < MAX; i++) {\n\tprintf(\"Value of var[%d] = %d\n\t\", i, var[i] );\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output22);
            programNAme.setText(R.string.string_pTops22);
        }
        if(val_key_from_intent==23){
            program.setText("#include <stdio.h>\n\t\n\tint main () {\n\tint *arr[3];\n\tint *a;\n\tprintf( \"Value of array pointer variable : %d\n\t\", arr);\n\tprintf( \"Value of pointer variable : %d\n\t\", &a);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output23);
            programNAme.setText(R.string.string_pTops23);
        }
        if(val_key_from_intent==24){
            program.setText("#include <stdio.h>\n\t\n\tint main () {\n\tint *arr[3];\n\tint *a;\n\tprintf( \"Value of array pointer variable : %d\n\t\", arr);\n\tprintf( \"Value of pointer variable : %d\n\t\", &a);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output24);
            programNAme.setText(R.string.string_pTops24);
        }
        if(val_key_from_intent==25){
            program.setText("#include <stdio.h>\n\tint main() {\n\tint arr[10]={6,12,0,18,11,99,55,45,34,2};\n\tint n=10;\n\tint i, j, position, swap;\n\tfor (i = 0; i < (n - 1); i++) {\n\tposition = i;\n\tfor (j = i + 1; j < n; j++) {\n\tif (arr[position] > arr[j])\n\tposition = j;\n\t}\n\tif (position != i) {\n\tswap = arr[i];\n\tarr[i] = arr[position];\n\tarr[position] = swap;\n\t}\n\t}\n\tfor (i = 0; i < n; i++)\n\tprintf(\"%d\t\", arr[i]);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output25);
            programNAme.setText(R.string.string_pTops25);
        }
        if(val_key_from_intent==26){
            programNAme.setText(R.string.string_pTops26);
            program.setText("// C program for insertion sort\n\t\n\t#include <math.h>\n\t#include <stdio.h>\n\t\n\t\n\t/* Function to sort an array\n\tusing insertion sort*/\n\tvoid insertionSort(int arr[], int n)\n\t{\n\tint i, key, j;\n\tfor (i = 1; i < n; i++)\n\t{\n\tkey = arr[i];\n\tj = i - 1;\n\t/* Move elements of arr[0..i-1],\n\tthat are greater than key,\n\tto one position ahead of \n\ttheir current position */\n\twhile (j >= 0 && arr[j] > key)\n\t{\n\t\n\tarr[j + 1] = arr[j];\n\t\n\tj = j - 1;\n\t}\n\tarr[j + 1] = key;\n\t}\n\t}\n\t\n\t// A utility function to print\n\t// an array of size n\n\tvoid printArray(int arr[], int n)\n\t{\n\tint i;\n\tfor (i = 0; i < n; i++)\n\tprintf(\"%d \", arr[i]);\n\tprintf(\"\n\t\");\n\t}\n\t\n\t// Driver code\n\tint main()\n\t{\n\tint arr[] = {12, 11, 13, 5, 6};\n\tint n = sizeof(arr) // sizeof(arr[0]);\n\t\n\tinsertionSort(arr, n);\n\tprintArray(arr, n);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output26);
        }
        if(val_key_from_intent==27){
            programNAme.setText(R.string.string_pTops27);
            program.setText("#include<stdlib.h>\n\t#include<stdio.h>\n\t\n\t\n\t// Merge Function\n\tvoid merge(int arr[], int l, int m, int r)\n\t{\n\tint i, j, k;\n\tint n1 = m - l + 1;\n\tint n2 = r - m;\n\tint L[n1], R[n2];\n\tfor (i = 0; i < n1; i++)\n\t\n\tL[i] = arr[l + i];\n\tfor (j = 0; j < n2; j++)\n\tR[j] = arr[m + 1+ j];\n\ti = 0;\n\tj = 0;\n\tk = l;\n\twhile (i < n1 && j < n2)\n\t{\n\tif (L[i] <= R[j])\n\t{\n\tarr[k] = L[i];\n\ti++;\n\t}\n\telse\n\t{\n\tarr[k] = R[j];\n\tj++;\n\t}\n\tk++;\n\t}\n\twhile (i < n1)\n\t{\n\tarr[k] = L[i];\n\ti++;\n\tk++;\n\t}\n\twhile (j < n2)\n\t{\n\tarr[k] = R[j];\n\tj++;\n\tk++;\n\t}\n\t}.");
            output.setText(R.string.string_output27);
        }
        if(val_key_from_intent==28){
            programNAme.setText(R.string.string_pTops28);
            program.setText("#include<stdlib.h>\n\t#include<stdio.h>\n\t\n\t\n\t// Merge Function\n\tvoid merge(int arr[], int l, int m, int r)\n\t{\n\tint i, j, k;\n\tint n1 = m - l + 1;\n\tint n2 = r - m;\n\tint L[n1], R[n2];\n\tfor (i = 0; i < n1; i++)\n\t\n\tL[i] = arr[l + i];\n\tfor (j = 0; j < n2; j++)\n\tR[j] = arr[m + 1+ j];\n\ti = 0;\n\tj = 0;\n\tk = l;\n\twhile (i < n1 && j < n2)\n\t{\n\tif (L[i] <= R[j])\n\t{\n\tarr[k] = L[i];\n\ti++;\n\t}\n\telse\n\t{\n\tarr[k] = R[j];\n\tj++;\n\t}\n\tk++;\n\t}\n\twhile (i < n1)\n\t{\n\tarr[k] = L[i];\n\ti++;\n\tk++;\n\t}\n\twhile (j < n2)\n\t{\n\tarr[k] = R[j];\n\tj++;\n\tk++;\n\t}\n\t}.");
            output.setText(R.string.string_output28);
        }
        if(val_key_from_intent==29){
            programNAme.setText(R.string.string_pTops29);
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tint m, n, c, d, first[10][10], second[10][10], sum[10][10];\n\t\n\tprintf(\"Enter the number of rows and columns of matrix\n\t\");\n\tscanf(\"%d%d\", &m, &n);\n\tprintf(\"Enter the elements of first matrix\n\t\");\n\tfor (c = 0; c < m; c++)\n\tfor (d = 0; d < n; d++)\n\tscanf(\"%d\", &first[c][d]);\n\tprintf(\"Enter the elements of second matrix\n\t\");\n\tfor (c = 0; c < m; c++)\n\tfor (d = 0 ; d < n; d++)\n\tscanf(\"%d\", &second[c][d]);\n\tprintf(\"Sum of entered matrices:-\n\t\");\n\t\n\tfor (c = 0; c < m; c++) {\n\tfor (d = 0 ; d < n; d++) {\n\tsum[c][d] = first[c][d] + second[c][d];\n\tprintf(\"%d\t\", sum[c][d]);\n\t}\n\tprintf(\"\n\t\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output29);
        }
        if(val_key_from_intent==30){
            programNAme.setText(R.string.string_pTops30);
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tint m, n, c, d, first[10][10], second[10][10], sum[10][10];\n\t\n\tprintf(\"Enter the number of rows and columns of matrix\n\t\");\n\tscanf(\"%d%d\", &m, &n);\n\tprintf(\"Enter the elements of first matrix\n\t\");\n\tfor (c = 0; c < m; c++)\n\tfor (d = 0; d < n; d++)\n\tscanf(\"%d\", &first[c][d]);\n\tprintf(\"Enter the elements of second matrix\n\t\");\n\tfor (c = 0; c < m; c++)\n\tfor (d = 0 ; d < n; d++)\n\tscanf(\"%d\", &second[c][d]);\n\tprintf(\"Sum of entered matrices:-\n\t\");\n\t\n\tfor (c = 0; c < m; c++) {\n\tfor (d = 0 ; d < n; d++) {\n\tsum[c][d] = first[c][d] + second[c][d];\n\tprintf(\"%d\t\", sum[c][d]);\n\t}\n\tprintf(\"\n\t\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output30);
        }
//31-40
        if(val_key_from_intent==31){
            programNAme.setText(R.string.string_pTops31);
            program.setText("#include<stdio.h>\n\t#include<stdlib.h>\n\t\n\tint main(){\n\tint a[10][10],b[10][10],mul[10][10],r,c,i,j,k;\n\tsystem(\"cls\");\n\tprintf(\"enter the number of row=\");\n\tscanf(\"%d\",&r);\n\tprintf(\"enter the number of column=\");\n\tscanf(\"%d\",&c);\n\tprintf(\"enter the first matrix element=\n\t\");\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tscanf(\"%d\",&a[i][j]);\n\t}\n\t}\n\tprintf(\"enter the second matrix element=\n\t\");\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tscanf(\"%d\",&b[i][j]);\n\t}\n\t}\n\t\n\tprintf(\"multiply of the matrix=\n\t\");\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tmul[i][j]=0;\n\tfor(k=0;k<c;k++)\n\t{\n\tmul[i][j]+=a[i][k]*b[k][j];\n\t}\n\t}\n\t}\n\t\n\t//for printing result\n\tfor(i=0;i<r;i++)\n\t{\n\tfor(j=0;j<c;j++)\n\t{\n\tprintf(\"%d\t\",mul[i][j]);\n\t}\n\tprintf(\"\n\t\");\n\t}\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output31);
        }
        if(val_key_from_intent==32){
            programNAme.setText(R.string.string_pTops32);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint a[10][10], transpose[10][10], r, c;\n\tprintf(\"Enter rows and columns: \");\n\tscanf(\"%d %d\", &r, &c);\n\t\n\t// asssigning elements to the matrix\n\tprintf(\"\n\tEnter matrix elements:\n\t\");\n\tfor (int i = 0; i < r; ++i)\n\tfor (int j = 0; j < c; ++j) {\n\tprintf(\"Enter element a%d%d: \", i + 1, j + 1);\n\tscanf(\"%d\", &a[i][j]);\n\t}\n\t\n\t// printing the matrix a[][]\n\tprintf(\"\n\tEntered matrix: \n\t\");\n\tfor (int i = 0; i < r; ++i)\n\tfor (int j = 0; j < c; ++j) {\n\tprintf(\"%d  \", a[i][j]);\n\tif (j == c - 1)\n\tprintf(\"\n\t\");\n\t}\n\t\n\t// computing the transpose\n\tfor (int i = 0; i < r; ++i)\n\tfor (int j = 0; j < c; ++j) {\n\ttranspose[j][i] = a[i][j];\n\t}\n\t\n\t// printing the transpose\n\tprintf(\"\n\tTranspose of the matrix:\n\t\");\n\tfor (int i = 0; i < c; ++i)\n\tfor (int j = 0; j < r; ++j) {\n\tprintf(\"%d  \", transpose[i][j]);\n\tif (j == r - 1)\n\tprintf(\"\n\t\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output32);
        }
        if(val_key_from_intent==33){
            programNAme.setText(R.string.string_pTops33);
            program.setText("#include <stdio.h>\n\ttypedef struct complex {\n\tfloat real;\n\tfloat imag;\n\t} complex;\n\t\n\tcomplex add(complex n1, complex n2);\n\t\n\tint main() {\n\tcomplex n1, n2, result;\n\t\n\tprintf(\"For 1st complex number \n\t\");\n\tprintf(\"Enter the real and imaginary parts: \");\n\tscanf(\"%f %f\", &n1.real, &n1.imag);\n\tprintf(\"\n\tFor 2nd complex number \n\t\");\n\tprintf(\"Enter the real and imaginary parts: \");\n\tscanf(\"%f %f\", &n2.real, &n2.imag);\n\t\n\tresult = add(n1, n2);\n\t\n\tprintf(\"Sum = %.1f + %.1fi\", result.real, result.imag);\n\treturn 0;\n\t}\n\t\n\tcomplex add(complex n1, complex n2) {\n\tcomplex temp;\n\ttemp.real = n1.real + n2.real;\n\ttemp.imag = n1.imag + n2.imag;\n\treturn (temp);\n\t}.");
            output.setText(R.string.string_output33);
        }
        if(val_key_from_intent==34){
            programNAme.setText(R.string.string_pTops34);
            program.setText("#include<stdio.h>\n\t\n\tint main()\n\t{\n\tint a[20],i,x,n;\n\tprintf(\"How many elements?\");\n\tscanf(\"%d\",&n);\n\t\n\tprintf(\"Enter array elements:n\");\n\tfor(i=0;i<n;++i)\n\tscanf(\"%d\",&a[i]);\n\t\n\tprintf(\"nEnter element to search:\");\n\tscanf(\"%d\",&x);\n\t\n\tfor(i=0;i<n;++i)\n\tif(a[i]==x)\n\tbreak;\n\t\n\tif(i<n)\n\tprintf(\"Element found at index %d\",i);\n\telse\n\tprintf(\"Element not found\");\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output34);
        }
        if(val_key_from_intent==35){
            programNAme.setText(R.string.string_pTops35);
            program.setText("#include <stdio.h>\n\tint main()\n\t{\n\tint i, low, high, mid, n, key, array[100];\n\tprintf(\"Enter number of elementsn\");\n\tscanf(\"%d\",&n);\n\tprintf(\"Enter %d integersn\", n);\n\tfor(i = 0; i < n; i++)\n\tscanf(\"%d\",&array[i]);\n\tprintf(\"Enter value to findn\");\n\tscanf(\"%d\", &key);\n\tlow = 0;\n\thigh = n - 1;\n\tmid = (low+high)/2;\n\twhile (low <= high) {\n\tif(array[mid] < key)\n\tlow = mid + 1;\n\telse if (array[mid] == key) {\n\tprintf(\"%d found at location %d.n\", key, mid+1);\n\tbreak;\n\t}\n\telse\n\thigh = mid - 1;\n\tmid = (low + high)/2;\n\t}\n\tif(low > high)\n\tprintf(\"Not found! %d isn't present in the list.n\", key);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output35);
        }
        if(val_key_from_intent==36){
            programNAme.setText(R.string.string_pTops36);
            program.setText("#include <stdio.h>\n\tint iterativeBinarySearch(int array[], int start_index, int end_index, int element){\n\twhile (start_index <= end_index){\n\tint middle = start_index + (end_index- start_index )/2;\n\tif (array[middle] == element)\n\t\n\treturn middle;\n\tif (array[middle] < element)\n\t\n\tstart_index = middle + 1;\n\telse\n\t\n\tend_index = middle - 1;\n\t}\n\treturn -1;\n\t}\n\tint main(void){\n\tint array[] = {1, 4, 7, 9, 16, 56, 70};\n\tint n = 7;\n\tint element = 16;\n\tint found_index = iterativeBinarySearch(array, 0, n-1, element);\n\tif(found_index == -1 ) {\n\tprintf(\"Element not found in the array \");\n\t}\n\telse {\n\tprintf(\"Element found at index : %d\",found_index);\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output36);
        }
        if(val_key_from_intent==37){
            programNAme.setText(R.string.string_pTops37);
            program.setText("#include <stdio.h>\n\t\n\t/* function declaration */\n\tvoid swap(int x, int y);\n\t\n\tint main () {\n\t\n\t/* local variable definition */n\n\tint a = 100;\n\tint b = 200;\n\t\n\tprintf(\"Before swap, value of a : %d\n\t\", a );\n\tprintf(\"Before swap, value of b : %d\n\t\", b );\n\t\n\t/* calling a function to swap the values */\n\tswap(a, b);\n\t\n\tprintf(\"After swap, value of a : %d\n\t\", a );\n\tprintf(\"After swap, value of b : %d\n\t\", b );\n\t\n\treturn 0;\n\t}\n\tvoid swap(int x, int y) {\n\t\n\tint temp;\n\t\n\ttemp = x; /* save the value of x */\n\tx = y;    /* put y into x */\n\ty = temp; /* put temp into y */\n\t\n\treturn;\n\t}.");
            output.setText(R.string.string_output37);
        }
        if(val_key_from_intent==38){
            programNAme.setText(R.string.string_pTops38);
            program.setText("#include <stdio.h>\n\t\n\tint main () {\n\t\n\t/* local variable definition */\n\tint a = 100;\n\tint b = 200;\n\t\n\tprintf(\"Before swap, value of a : %d\n\t\", a );\n\tprintf(\"Before swap, value of b : %d\n\t\", b );\n\t\n\t/* calling a function to swap the values */\n\tswap(&a, &b);\n\t\n\tprintf(\"After swap, value of a : %d\n\t\", a );\n\tprintf(\"After swap, value of b : %d\n\t\", b );\n\t\n\treturn 0;\n\t}\n\tvoid swap(int *x, int *y) {\n\t\n\tint temp;\n\t\n\ttemp = *x; /* save the value of x */\n\t*x = *y;    /* put y into x */\n\t*y = temp; /* put temp into y */\n\t\n\treturn;\n\t}.");
            output.setText(R.string.string_output38);
        }
        if(val_key_from_intent==39){
            programNAme.setText(R.string.string_pTops39);
            program.setText("#include <stdio.h>\n\t\n\tvoid salaryhike(int  *var, int b)\n\t{\n\t*var = *var+b;\n\t}\n\tint main()\n\t{\n\tint salary=0, bonus=0;\n\tprintf(\"Enter the employee current salary:\");\n\tscanf(\"%d\", &salary);\n\tprintf(\"Enter bonus:\");\n\tscanf(\"%d\", &bonus);\n\tsalaryhike(&salary, bonus);\n\tprintf(\"Final salary: %d\", salary);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output39);
        }
        if(val_key_from_intent==40){
            programNAme.setText(R.string.string_pTops40);
            program.setText("#include<stdio.h>\n\t\n\tvoid printFibonacci(int m){\n\t\n\tstatic int m1=0,m2=1,m3;\n\t\n\tif(m>0){\n\t\n\tm3 = m1 + m2;\n\t\n\tm1 = m2;\n\t\n\tm2 = m3;\n\t\n\tprintf(“%d “,m3);\n\t\n\tprintFibonacci(m-1);\n\t\n\t}\n\t\n\t}\n\t\n\tint main(){\n\t\n\tint m;\n\t\n\tprintf(“Please enter your preferred number of elements here: “);\n\t\n\tscanf(“%d”,&m);\n\t\n\tprintf(“The Fibonacci Series will be: “);\n\t\n\tprintf(“%d %d “,0,1);\n\t\n\tprintFibonacci(m-2); //We have used m-2 because we have 2 numbers already printed here\n\t\n\treturn 0;\n\t\n\t}.");
            output.setText(R.string.string_output40);
        }
//41-50
        if(val_key_from_intent==41){
            programNAme.setText(R.string.string_pTops41);
            program.setText("#include<stdio.h>\n\t\n\tint main()\n\t{\n\tint i,fact=1,number;\n\tprintf(\"Enter a number: \");\n\tscanf(\"%d\", &number);\n\t for(i=1;i<=number;i++){\n\tfact=fact*i;\n\t}\n\tprintf(\"Factorial of %d is: %d\",number,fact);\n\treturn 0;\n\t}   .");
            output.setText(R.string.string_output41);
        }
        if(val_key_from_intent==42){
            programNAme.setText(R.string.string_pTops42);
            program.setText("Object Oriented Features are not available in C Program\n\tas C Program is a Procedural Oriented Language.");
            output.setText(R.string.string_output42);
        }
        if(val_key_from_intent==43){
            programNAme.setText(R.string.string_pTops43);
            program.setText("Object Oriented Features are not available in C Program\n\tas C Program is a Procedural Oriented Language.");
            output.setText(R.string.string_output43);
        }
        if(val_key_from_intent==44){
            programNAme.setText(R.string.string_pTops44);
            program.setText("Object Oriented Features are not available in C Program\n\tas C Program is a Procedural Oriented Language.");
            output.setText(R.string.string_output44);
        }
        if(val_key_from_intent==45){
            programNAme.setText(R.string.string_pTops45);
            program.setText("#include <stdio.h>\n\t\n\tmain() {\n\t\n\tint a = 21;\n\tint c ;\n\t\n\tc =  a;\n\tprintf(\"Line 1 - =  Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc +=  a;\n\tprintf(\"Line 2 - += Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc -=  a;\n\tprintf(\"Line 3 - -= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc *=  a;\n\tprintf(\"Line 4 - *= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc /=  a;\n\tprintf(\"Line 5 - /= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc  = 200;\n\tc %=  a;\n\tprintf(\"Line 6 - %= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc <<=  2;\n\tprintf(\"Line 7 - <<= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc >>=  2;\n\tprintf(\"Line 8 - >>= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc &=  2;\n\tprintf(\"Line 9 - &= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc ^=  2;\n\tprintf(\"Line 10 - ^= Operator Example, Value of c = %d\n\t\", c );\n\t\n\tc |=  2;\n\tprintf(\"Line 11 - |= Operator Example, Value of c = %d\n\t\", c );\n\t}.");
            output.setText("Line 1 - = Operator Example, Value of c = 21\n\tLine 2 - += Operator Example, Value of c = 42\n\tLine 3 - -= Operator Example, Value of c = 21Line 4 - *= Operator Example, Value of c = 441\n\tLine 5 - /= Operator Example, Value of c = 21\n\tLine 6 - %= Operator Example, Value of c = 11\n\tLine 7 - <<= Operator Example, Value of c = 44\n\tLine 8 - >>= Operator Example, Value of c = 11\n\tLine 9 - &= Operator Example, Value of c = 2\n\tLine 10 - ^= Operator Example, Value of c = 0\n\tLine 11 - |= Operator Example, Value of c = 2.");
        }
        if(val_key_from_intent==46){
            programNAme.setText(R.string.string_pTops46);
            program.setText("#include <stdio.h>\n\t\n\tmain() {\n\t\n\tint a = 21;\n\tint b = 10;\n\tint c ;\n\t\n\tif( a == b ) {\n\tprintf(\"Line 1 - a is equal to b\n\t\" );\n\t} else {\n\tprintf(\"Line 1 - a is not equal to b\n\t\" );\n\t}\n\t\n\tif ( a < b ) {\n\tprintf(\"Line 2 - a is less than b\n\t\" );\n\t} else {\n\tprintf(\"Line 2 - a is not less than b\n\t\" );\n\t}\n\t\n\tif ( a > b ) {\n\tprintf(\"Line 3 - a is greater than b\n\t\" );\n\t} else {\n\tprintf(\"Line 3 - a is not greater than b\n\t\" );\n\t}\n\t\n\t/* Lets change value of a and b */\n\ta = 5;\n\tb = 20;\n\t\n\tif ( a <= b ) {\n\tprintf(\"Line 4 - a is either less than or equal to  b\n\t\" );\n\t}\n\t\n\tif ( b >= a ) {\n\tprintf(\"Line 5 - b is either greater than  or equal to b\n\t\" );\n\t}\n\t}.");
            output.setText(R.string.string_output46);
        }
        if(val_key_from_intent==47){
            programNAme.setText(R.string.string_pTops47);
            program.setText("#include<stdio.h>\n\t\n\tint stack[100],choice,n,top,x,i;\n\tvoid push(void);\n\tvoid pop(void);\n\tvoid display(void);\n\tint main()\n\t{\n\tclrscr();\n\ttop=-1;\n\tprintf(\"\n\t Enter the size of STACK[MAX=100]:\");\n\tscanf(\"%d\",&n);\n\tprintf(\"\n\t\t STACK OPERATIONS USING ARRAY\");\n\tprintf(\"\n\t\t--------------------------------\");\n\tprintf(\"\n\t\t 1.PUSH\n\t\t 2.POP\n\t\t 3.DISPLAY\n\t\t 4.EXIT\");\n\tdo\n\t{\n\tprintf(\"\n\t Enter the Choice:\");\n\tscanf(\"%d\",&choice);\n\tswitch(choice)\n\t{\n\t\n\tcase 1:\n\t\n\t{\n\t\n\tpush();\n\tbreak;\n\t\n\t}\n\t\n\tcase 2:\n\t\n\t{\n\t\n\tpop();\n\t\n\tbreak;\n\t\n\t}\n\t\n\tcase 3:\n\t\n\t{\n\t\n\tdisplay();\n\t\n\tbreak;\n\t}\n\t\n\tcase 4:\n\t\n\t{\n\t\n\tprintf(\"\n\t\t EXIT POINT \");\n\t\n\tbreak;\n\t\n\t}\n\t\n\tdefault: \n\t\n\t{n\n\tn\n\tprintf (\"\n\t\t Please Enter a Valid Choice(1/2/3/4)\");\n\t\n\t}\n\t\n\t}\n\t}\n\twhile(choice!=4);\n\treturn 0;\n\t}\n\tvoid push()\n\t{\n\tif(top>=n-1)\n\t{\n\tprintf(\"\n\t\tSTACK is over flow\");\n\t\n\t}\n\telse\n\t{\n\tprintf(\" Enter a value to be pushed:\");\n\tscanf(\"%d\",&x);\n\ttop++;\n\tstack[top]=x;\n\t}\n\t}\n\tvoid pop()\n\t{\n\tif(top<=-1)\n\t{\n\tprintf(\"\n\t\t Stack is under flow\");\n\t}\n\telse\n\t{\n\tprintf(\"\n\t\t The popped elements is %d\",stack[top]);\n\ttop--;\n\t}\n\t}\n\tvoid display()\n\t{\n\tif(top>=0)\n\t{\n\tprintf(\"\n\t The elements in STACK \n\t\");\n\tfor(i=top; i>=0; i--)\n\t\n\tprintf(\"\n\t%d\",stack[i]);\n\tprintf(\"\n\t Press Next Choice\");\n\t}\n\telse\n\t{\n\tprintf(\"\n\t The STACK is empty\");\n\t}\n\t\n\t}.");
            output.setText(R.string.string_output47);
        }
        if(val_key_from_intent==48){
            programNAme.setText(R.string.string_pTops48);
            program.setText("/*\n\t* C Program to Implement a Queue using an Array\n\t*/\n\t#include <stdio.h>\n\t\n\t#define MAX 50\n\t\n\tvoid insert();\n\tvoid delete();\n\tvoid display();\n\tint queue_array[MAX];\n\tint rear = - 1;\n\tint front = - 1;\n\tmain()\n\t{\n\tint choice;\n\twhile (1){\n\tprintf(\"1.Insert element to queue \n\t\");\n\tprintf(\"2.Delete element from queue \n\t\");\n\tprintf(\"3.Display all elements of queue \n\t\");\n\tprintf(\"4.Quit \n\t\");\n\tprintf(\"Enter your choice : \");\n\tscanf(\"%d\", &choice);\n\tswitch (choice)\n\t{\n\tcase 1:\n\tinsert();\n\tbreak;\n\tcase 2:\n\tdelete();\n\tbreak;\n\tcase 3:\n\tdisplay();\n\tbreak;\n\tcase 4:\n\t\n\texit(1);\n\tdefault:\n\t\n\tprintf(\"Wrong choice \n\t\");\n\t} /* End of switch */\n\t} /* End of while */\n\t} /* End of main() */\n\t\n\tvoid insert()\n\t{\n\tint add_item;\n\tif (rear == MAX - 1)\n\tprintf(\"Queue Overflow \n\t\");\n\telse\n\t{if (front == - 1)\n\t/*If queue is initially empty */\n\tfront = 0;\n\tprintf(\"Inset the element in queue : \");\n\tscanf(\"%d\", &add_item);\n\trear = rear + 1;\n\tqueue_array[rear] = add_item;\n\t}\n\t} /* End of insert() */\n\t\n\tvoid delete()\n\t{\n\tif (front == - 1 || front > rear)\n\t{\n\tprintf(\"Queue Underflow \n\t\");\n\treturn ;\n\t}\n\telse\n\t{\n\tprintf(\"Element deleted from queue is : %d\n\t\", queue_array[front]);\n\tfront = front + 1;\n\t}\n\t} /* End of delete() */\n\t\n\tvoid display()\n\t{\n\tint i;\n\tif (front == - 1)\n\tprintf(\"Queue is empty \n\t\");\n\telse\n\t{\n\tprintf(\"Queue is : \n\t\");\n\tfor (i = front; i <= rear; i++)\n\t\n\tprintf(\"%d \", queue_array[i]);\n\tprintf(\"\n\t\");\n\t}\n\t} /* End of display() */.");
            output.setText(R.string.string_output48);
        }
        if(val_key_from_intent==49){
            programNAme.setText(R.string.string_pTops49);
            program.setText("#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\t// Structure to create a node with data and next pointer\n\tstruct Node {\n\tint data;\n\tstruct Node *next;\n\t};\n\tNode* top = NULL;\n\t\n\t// Push() operation on a  stack\n\tvoid push(int value) {\n\tstruct Node *newNode;\n\tnewNode = (struct Node *)malloc(sizeof(struct Node));\n\tnewNode->data = value; // assign value to the node\n\tif (top == NULL) {\n\tnewNode->next = NULL;\n\t} else {\n\tnewNode->next = top; // Make the node as top\n\t}\n\ttop = newNode; // top always points to the newly created node\n\tprintf(\"Node is Inserted\n\t\n\t\");\n\t}\n\t\n\tint pop() {\n\tif (top == NULL) {\n\tprintf(\"\n\tStack Underflow\n\t\");\n\t} else {\n\tstruct Node *temp = top;\n\tint temp_data = top->data;\n\ttop = top->next;\n\tfree(temp);\n\treturn temp_data;\n\t}\n\t}\n\t\n\tvoid display() {\n\t// Display the elements of the stack\n\tif (top == NULL) {\n\tprintf(\"\n\tStack Underflow\n\t\");\n\t} else {\n\tprintf(\"The stack is \n\t\");\n\tstruct Node *temp = top;\n\twhile (temp->next != NULL) {\n\t\n\tprintf(\"%d--->\", temp->data);\n\t\n\ttemp = temp->next;\n\t}\n\tprintf(\"%d--->NULL\n\t\n\t\", temp->data);\n\t}\n\t}\n\t\n\tint main() {\n\tint choice, value;\n\tprintf(\"\n\tImplementaion of Stack using Linked List\n\t\");\n\twhile (1) {\n\tprintf(\"1. Push\n\t2. Pop\n\t3. Display\n\t4. Exit\n\t\");\n\tprintf(\"\n\tEnter your choice : \");\n\tscanf(\"%d\", &choice);\n\tswitch (choice) {\n\tcase 1:\n\t\n\tprintf(\"\n\tEnter the value to insert: \");\n\t\n\tscanf(\"%d\", &value);\n\t\n\tpush(value);\n\t\n\tbreak;\n\tcase 2:\n\t\n\tprintf(\"Popped element is :%d\n\t\", pop());\n\t\n\tbreak;\n\tcase 3:\n\t\n\tdisplay();\n\t\n\tbreak;\n\tcase 4:\n\t\n\texit(0);\n\t\n\tbreak;\n\tdefault:\n\t\n\tprintf(\"\n\tWrong Choice\n\t\");\n\t}\n\t}\n\t}.");
            output.setText(R.string.string_output49);
        }
        if(val_key_from_intent==50){
            programNAme.setText(R.string.string_pTops50);
            program.setText("#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\tstruct node {\n\tint data;\n\tstruct node* next;\n\t};\n\t\n\tstruct node* front;\n\tstruct node* rear;\n\t\n\t\n\tvoid insert(struct node *ptr, int item) {\n\t\n\tptr = (struct node *) malloc (sizeof(struct node));\n\t\n\tif (ptr == NULL) {\n\tprintf(\"\n\tOVERFLOW\n\t\");\n\treturn;\n\t} else {\n\tptr -> data = item;\n\tif (front == NULL) {\n\t\n\tfront = ptr;\n\t\n\trear = ptr;\n\t\n\tfront -> next = NULL;\n\t\n\trear -> next = NULL;\n\t} else {\n\t\n\trear -> next = ptr;\n\t\n\trear = ptr;\n\t\n\trear->next = NULL;\n\t}\n\t}\n\t}\n\t\n\tint main() {\n\tstruct node* head = NULL;\n\tinsert(head, 10);\n\tinsert(head, 20);\n\t\n\tprintf(\"front element: %d\", front->data);\n\treturn 0;\n\t}     .");
            output.setText(R.string.string_output50);
        }
//51-60
        if(val_key_from_intent==51){
            programNAme.setText(R.string.string_pTops51);
            program.setText("#include <stdio.h>\n\t\n\tint main () {\n\t\n\t/* local variable definition */\n\tint a = 100;\n\tint b = 200;\n\t\n\tprintf(\"Before swap, value of a : %d\n\t\", a );\n\tprintf(\"Before swap, value of b : %d\n\t\", b );\n\t\n\t/* calling a function to swap the values */\n\tswap(&a, &b);\n\t\n\tprintf(\"After swap, value of a : %d\n\t\", a );\n\tprintf(\"After swap, value of b : %d\n\t\", b );\n\t\n\treturn 0;\n\t}\n\tvoid swap(int *x, int *y) {\n\t\n\tint temp;\n\t\n\ttemp = *x; /* save the value of x */\n\t*x = *y;    /* put y into x */\n\t*y = temp; /* put temp into y */\n\t\n\treturn;\n\t}.");
            output.setText(R.string.string_output51);
        }
        if(val_key_from_intent==52){
            programNAme.setText(R.string.string_pTops52);
            program.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint number=50;\n\tint *p;\n\tp=&number;//stores the address of number variable\n\tprintf(\"Address of p variable is %x \n\t\",p); // p contains the address of the number therefore printing p gives the address of number.\n\tprintf(\"Value of p variable is %d \n\t\",*p); // As we know that * is used to dereference a pointer therefore if we print *p, we will get the value stored at the address contained by p.\n\treturn 0;\n\t}    .");
            output.setText(R.string.string_output52);
        }
        if(val_key_from_intent==53){
            programNAme.setText(R.string.string_pTops53);
            program.setText("#include <stdio.h>\n\tlong factorial(int);\n\tlong find_ncr(int, int);\n\tlong find_npr(int, int);\n\t\n\tint main()\n\t{\n\tint n, r;\n\tlong ncr, npr;\n\t\n\tprintf(\"Enter the value of n and r\n\t\");\n\tscanf(\"%d%d\",&n,&r);\n\t\n\tncr = find_ncr(n, r);\n\tnpr = find_npr(n, r);\n\t\n\tprintf(\"%dC%d = %ld\n\t\", n, r, ncr);\n\tprintf(\"%dP%d = %ld\n\t\", n, r, npr);\n\t\n\treturn 0;\n\t}\n\t\n\tlong find_ncr(int n, int r) {\n\tlong result;\n\t\n\tresult = factorial(n)/(factorial(r)*factorial(n-r));\n\t\n\treturn result;\n\t}\n\t\n\tlong find_npr(int n, int r) {\n\tlong result;\n\t\n\tresult = factorial(n)/factorial(n-r);\n\t\n\treturn result;\n\t}\n\t\n\tlong factorial(int n) {\n\tint c;\n\tlong result = 1;\n\t\n\tfor (c = 1; c <= n; c++)\n\tresult = result*c;\n\t\n\treturn result;\n\t}.");
            output.setText(R.string.string_output53);
        }
        if(val_key_from_intent==54){
            programNAme.setText(R.string.string_pTops54);
            program.setText("#include <stdio.h>\n\tint main() {\n\tint a, b, x, y, t, gcd, lcm;\n\tprintf(\"Enter two integers\n\t\");\n\tscanf(\"%d%d\", &x, &y);\n\ta = x;\n\tb = y;\n\twhile (b != 0) {\n\tt = b;\n\tb = a % b;\n\ta = t;\n\t}\n\tgcd = a;\n\tlcm = (x*y)/gcd;\n\tprintf(\"Greatest common divisor of %d and %d = %d\n\t\", x, y, gcd);\n\tprintf(\"Least common multiple of %d and %d = %d\n\t\", x, y, lcm);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output54);
        }
        if(val_key_from_intent==55){
            programNAme.setText(R.string.string_pTops55);
            program.setText("#include<stdio.h>\n\t\n\tint main()\n\t{\n\tint n,r,sum=0,temp;\n\tprintf(\"enter the number=\");\n\tscanf(\"%d\",&n);\n\ttemp=n;\n\twhile(n>0)\n\t{\n\tr=n%10;\n\tsum=sum+(r*r*r);\n\tn=n/10;\n\t}\n\tif(temp==sum)\n\tprintf(\"armstrong  number \");\n\telse\n\tprintf(\"not armstrong number\");\n\treturn 0;\n\t} .");
            output.setText(R.string.string_output5);
        }
        if(val_key_from_intent==56){

            programNAme.setText(R.string.string_pTops56);
            program.setText("#include<stdio.h>\n\t#include <math.h>\n\t\n\tint main(){\n\tprintf(\"\n\t%f\",ceil(3.6));\n\tprintf(\"\n\t%f\",ceil(3.3));\n\tprintf(\"\n\t%f\",floor(3.6));\n\tprintf(\"\n\t%f\",floor(3.2));\n\tprintf(\"\n\t%f\",sqrt(16));\n\tprintf(\"\n\t%f\",sqrt(7));\n\tprintf(\"\n\t%f\",pow(2,4));\n\tprintf(\"\n\t%f\",pow(3,3));\n\tprintf(\"\n\t%d\",abs(-12));\n\treturn 0;\n\t}   . ");
            output.setText(R.string.string_output56);
        }
        if(val_key_from_intent==57){
            programNAme.setText(R.string.string_pTops57);
            program.setText("#include<stdio.h>\n\t\n\tint main()\n\t\n\t{ float b ,h, area;\n\t\n\tb= 5;\n\t\n\th= 13;\n\t\n\tarea = (b*h) / 2 ;\n\t\n\t\n\tprintf(\"\n\t\n\t Area of Triangle is: %f\",area);\n\t\n\treturn (0);\n\t}  .");
            output.setText(R.string.string_output57);
        }
        if(val_key_from_intent==58){
            programNAme.setText(R.string.string_pTops58);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint n, i, sum = 0;\n\t\n\tprintf(\"Enter a positive integer: \");\n\tscanf(\"%d\", &n);\n\t\n\tfor (i = 1; i <= n; ++i) {\n\tsum += i;\n\t}\n\t\n\tprintf(\"Sum = %d\", sum);\n\treturn 0;\n\t}\n\t.");
            output.setText(R.string.string_output58);
        }
        if(val_key_from_intent==59){
            programNAme.setText(R.string.string_pTops59);
            program.setText("#include <stdio.h>\n\tvoid increment(int  *var)\n\t{\n\t    /* Although we are performing the increment on variable\n\t     * var, however the var is a pointer that holds the address\n\t     * of variable num, which means the increment is actually done\n\t     * on the address where value of num is stored.\n\t     */\n\t    *var = *var+1;\n\t}\n\tint main()\n\t{\n\t     int num=20;\n\t     /* This way of calling the function is known as call by\n\t      * reference. Instead of passing the variable num, we are\n\t      * passing the address of variable num\n\t      */\n\t     increment(&num);\n\t     printf(\"Value of num is: %d\", num);\n\t   return 0;\n\t}");
            output.setText(R.string.string_output59);
        }
        if(val_key_from_intent==60){
            programNAme.setText(R.string.string_pTops60);
            program.setText("#include <stdio.h>\n\t#include <conio.h>\n\t\n\tinline int mul (int a, int b) //inline function declaration\n\t{\n\treturn (a * b);\n\t}\n\tint main ()\n\t{\n\tint p;\n\tp = mul(3 , 6);\n\tprintf (“ The product of the numbers = %d \n\t”, p);\n\treturn 0;\n\t} .");
            output.setText(R.string.string_output60);
        }
//61-70
        if(val_key_from_intent==61){
            programNAme.setText(R.string.string_pTops61);
            program.setText("#include<stdio.h>\n\t\n\tvoid printName();\n\tvoid main ()\n\t{\n\tprintf(\"Hello \");\n\tprintName();\n\t}\n\tvoid printName()\n\t{\n\tprintf(\"Javatpoint\");\n\t}  .");
            output.setText(R.string.string_output61);
        }
        if(val_key_from_intent==62){
            programNAme.setText(R.string.string_pTops62);
            program.setText("#include<stdio.h>\n\t\n\tvoid printName();\n\tvoid main ()\n\t{\n\tprintf(\"Hello \");\n\tprintName();\n\t}\n\tvoid printName()\n\t{\n\tprintf(\"Javatpoint\");\n\t}  .");
            output.setText(R.string.string_output62);
        }
        if(val_key_from_intent==63){
            programNAme.setText(R.string.string_pTops63);
            program.setText("#include<stdio.h>\n\t#include<stdlib.h>\n\t\n\t\n\tint main(){int a[10],n,i;\n\tsystem (\"cls\");\n\tprintf(\"Enter the number to convert: \");\n\tscanf(\"%d\",&n);\n\tfor(i=0;n>0;i++)\n\t{\n\ta[i]=n%2;\n\tn=n/2;\n\t}\n\tprintf(\"\n\tBinary of Given Number is=\");\n\tfor(i=i-1;i>=0;i--)\n\t{\n\tprintf(\"%d\",a[i]);\n\t}\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output63);
        }
        if(val_key_from_intent==64){
            programNAme.setText(R.string.string_pTops64);
            program.setText("/* C Program to Convert Decimal to Octal Number */\n\t\n\t#include <stdio.h>\n\t\n\tint main()\n\t{\n\tint number;\n\tprintf(\"\n\t Please Enter the Number You want to Convert  :  \");\n\tscanf(\"%d\", &number);\n\t\n\tprintf(\"\n\t Octal Number of a Given Number =  %o\", number);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output64);
        }
        if(val_key_from_intent==65){
            programNAme.setText(R.string.string_pTops65);
            program.setText("#include<stdio.h>\n\t#include<conio.h>\n\t\n\tvoid main()\n\t{\n\tunsigned int mask;\n\tclrscr();\n\tprintf(\"Memory Required : %d butes\",sizeof(mask));\n\tgetch();\n\t}.");
            output.setText(R.string.string_output65);
        }
        if(val_key_from_intent==66){
            programNAme.setText(R.string.string_pTops66);
            program.setText("#include <stdio.h>\n\t#include <conio.h>\n\t\n\tvoid main()\n\t{\n\t// declaration of variables\n\tint num, binary_num, decimal_num = 0, base = 1, rem;\n\tprintf (\" Enter a binary number with the combination of 0s and 1s \n\t\");\n\tscanf (\" %d\", &num); // accept the binary number (0s and 1s)\n\t\n\tbinary_num = num; // assign the binary number to the binary_num variable\n\t\n\t\n\twhile ( num > 0)\n\t{\n\trem = num % 10; /* divide the binary number by 10 and store the remainder in rem variable. */\n\tdecimal_num = decimal_num + rem * base;\n\tnum = num / 10; // divide the number with quotient\n\tbase = base * 2;\n\t}\n\t\n\tprintf ( \" The binary number is %d \t\", binary_num); // print the binary number\n\tprintf (\" \n\t The decimal number is %d \t\", decimal_num); // print the decimal\n\tgetch();\n\t}  .");
            output.setText(R.string.string_output66);
        }
        if(val_key_from_intent==67){
            programNAme.setText(R.string.string_pTops67);
            program.setText("#include <stdio.h>\n\t#include <math.h>\n\t\n\tint binary_to_octal(long int binary)\n\t{\n\t\n\tint octal = 0, decimal = 0, i = 0;\n\twhile(binary != 0)\n\t{\n\tdecimal += (binary%10) * pow(2,i);\n\t++i;\n\tbinary/=10;\n\t}\n\t\n\ti = 1;\n\t\n\twhile (decimal != 0)\n\t{\n\toctal += (decimal % 8) * i;\n\tdecimal /= 8;\n\ti *= 10;\n\t}\n\t\n\treturn octal;\n\t}\n\t\n\tint main()\n\t{\n\tlong int binary;\n\t\n\tprintf(“\n\tEnter a binary number: “);\n\tscanf(“%lld”, &binary);\n\t\n\tprintf(“\n\tOctal Equivalent : %d\n\t”, binary_to_octal(binary));\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output67);
        }
        if(val_key_from_intent==68){
            programNAme.setText(R.string.string_pTops68);
            program.setText("/*\n\t* C Program to Convert Binary to Hexadecimal\n\t*/\n\t#include <stdio.h>\n\t\n\tint main()\n\t{\n\tlong int binaryval, hexadecimalval = 0, i = 1, remainder;\n\t\n\tprintf(\"Enter the binary number: \");\n\tscanf(\"%ld\", &binaryval);\n\twhile (binaryval != 0)\n\t{\n\tremainder = binaryval % 10;\n\thexadecimalval = hexadecimalval + remainder * i;\n\ti = i * 2;\n\tbinaryval = binaryval / 10;\n\t}\n\tprintf(\"Equivalent hexadecimal value: %lX\", hexadecimalval);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output68);
        }
        if(val_key_from_intent==69){
            programNAme.setText(R.string.string_pTops69);
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tchar z[100] = \"I am learning C programming language.\";\n\t\n\tprintf(\"%s\", z); / %s is format specifier\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output69);
        }
        if(val_key_from_intent==70){
            programNAme.setText(R.string.string_pTops70);
            program.setText("#include<stdio.h>\n\t#include<conio.h>\n\t\n\tint string_ln(char*);\n\t\n\tvoid main() {\n\tchar str[20];\n\tint length;\n\tclrscr();\n\t\n\tprintf(\"\n\tEnter any string : \");\n\tgets(str);\n\t\n\tlength = string_ln(str);\n\tprintf(\"The length of the given string %s is : %d\", str, length);\n\tgetch();\n\t}\n\t\n\tint string_ln(char*p) /* p=&str[0] */\n\t{\n\tint count = 0;\n\twhile (*p != '\0') {\n\tcount++;\n\tp++;\n\t}\n\treturn count;\n\t}.");
            output.setText(R.string.string_output70);
        }
//71-80
        if(val_key_from_intent==71){
            programNAme.setText(R.string.string_pTops71);
            program.setText("#include<stdio.h>\n\t#include<conio.h>\n\t\n\tint string_ln(char*);\n\t\n\tvoid main() {\n\tchar str[20];\n\tint length;\n\tclrscr();\n\t\n\tprintf(\"\n\tEnter any string : \");\n\tgets(str);\n\t\n\tlength = string_ln(str);\n\tprintf(\"The length of the given string %s is : %d\", str, length);\n\tgetch();\n\t}\n\t\n\tint string_ln(char*p) /* p=&str[0] */\n\t{\n\tint count = 0;\n\twhile (*p != '\0') {\n\tcount++;\n\tp++;\n\t}\n\treturn count;\n\t}.");
            output.setText(R.string.string_output71);
        }
        if(val_key_from_intent==72){
            programNAme.setText(R.string.string_pTops72);
            program.setText("#include <stdio.h>\n\tint main()\n\t{\n\tchar first_string[20]; // declaration of char array variable\n\tchar second_string[20]; // declaration of char array variable\n\tint i;  // integer variable declaration\n\tprintf(\"Enter the first string\");\n\tscanf(\"%s\",first_string);\n\tprintf(\"\n\tEnter the second string\");\n\tscanf(\"%s\",second_string);\n\tfor(i=0;first_string[i]!='\0';i++);\n\t\n\t\n\tfor(int j=0;second_string[j]!='\0';j++)\n\t{\n\t\n\tfirst_string[i]=second_string[j];\n\ti++;\n\t}\n\tfirst_string[i]='\0';\n\tprintf(\"After concatenation, the string would look like: %s\", first_string);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output72);
        }
        if(val_key_from_intent==73){
            programNAme.setText(R.string.string_pTops73);
            program.setText("#include <stdio.h>\n\tint stringcompare(char*,char*);\n\tint main()\n\t{\n\tchar str1[20]; // declaration of char array\n\tchar str2[20]; // declaration of char array\n\tprintf(\"Enter the first string : \");\n\tscanf(\"%s\",str1);\n\tprintf(\"\n\tEnter the second string : \");\n\tscanf(\"%s\",str2);\n\tint compare=stringcompare(str1,str2); // calling stringcompare() function.\n\tif(compare==0)\n\tprintf(\"strings are equal\");\n\telse\n\tprintf(\"strings are not equal\");\n\treturn 0;\n\t}\n\t// Comparing both the strings using pointers\n\tint stringcompare(char *a,char *b)\n\t{\n\tint flag=0;\n\twhile(*a!='\0' && *b!='\0')  // while loop\n\t{\n\tif(*a!=*b)\n\t{\n\t\n\tflag=1;\n\t}\n\ta++;\n\tb++;\n\t}\n\t\n\tif(flag==0)\n\treturn 0;\n\telse\n\treturn 1;\n\t}  .");
            output.setText(R.string.string_output73);
        }
        if(val_key_from_intent==74){
            programNAme.setText(R.string.string_pTops74);
            program.setText("/*\n\t* C program to find the length of a string without using the\n\t* built-in function\n\t*/\n\t#include <stdio.h>\n\t\n\tvoid main()\n\t{\n\tchar string[50];\n\tint i, length = 0;\n\t\n\tprintf(\"Enter a string \n\t\");\n\tgets(string);\n\t/*  keep going through each character of the string till its end */\n\tfor (i = 0; string[i] != '\0'; i++)\n\t{\n\tlength++;\n\t}\n\tprintf(\"The length of a string is the number of characters in it \n\t\");\n\tprintf(\"So, the length of %s = %d\n\t\", string, length);\n\t}.");
            output.setText(R.string.string_output74);
        }
        if(val_key_from_intent==75){
            programNAme.setText(R.string.string_pTops75);
            program.setText("#include <stdio.h>\n\t#include <string.h>\n\t\n\tint main()\n\t{\n\tchar a[100];\n\tint length;\n\t\n\tprintf(\"Enter a string to calculate its length\n\t\");\n\tgets(a);\n\t\n\tlength = strlen(a);\n\t\n\tprintf(\"Length of the string = %d\n\t\", length);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output75);
        }
        if(val_key_from_intent==76){
            programNAme.setText(R.string.string_pTops76);
            program.setText("#include <stdio.h>  \n" +
                    "#include <string.h>  \n\t" +
                    "int main()  \n\t" +
                    "{  \n\t" +
                    "    char str[40]; // declare the size of character string  \n\t" +
                    "    printf (\" \n\t Enter a string to be reversed: \");  \n\t" +
                    "    scanf (\"%s\", str);  \n\t" +
                    "      \n\t" +
                    "    // use strrev() function to reverse a string  \n\t" +
                    "    printf (\"\n\t After the reverse of a string: %s \", strrev(str));  \n\t" +
                    "    return 0;  \n\t" +
                    "} ");
            output.setText(R.string.string_output76);
        }
        if(val_key_from_intent==77){
            programNAme.setText(R.string.string_pTops77);
            program.setText("#include <stdio.h>\n\t#include <string.h>\n\t\n\tint main()\n\t{\n\tchar str[40]; // declare the size of character string\n\tprintf (\" \n\t Enter a string to be reversed: \");\n\tscanf (\"%s\", str);\n\t\n\t// use strrev() function to reverse a string\n\tprintf (\" \n\t After the reverse of a string: %s \", strrev(str));\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output77);
        }
        if(val_key_from_intent==78){
            programNAme.setText(R.string.string_pTops78);
            program.setText("#include <stdio.h>\n\t#include <string.h>\n\t\n\tint main() {\n\tchar s[100];\n\tint i;\n\tprintf(\"\n\tEnter a string : \");\n\tgets(s);\n\tfor (i = 0; s[i]!='\0'; i++) {\n\tif(s[i] >= 'a' && s[i] <= 'z') {\n\t\n\ts[i] = s[i] -32;\n\t}\n\t}\n\tprintf(\"\n\tString in Upper Case = %s\", s);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output78);
        }
        if(val_key_from_intent==79){
            programNAme.setText(R.string.string_pTops79);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\tfloat percentage;\n\tint total_marks = 1200;\n\tint scored = 1122;\n\t\n\tpercentage = (float)scored / total_marks * 100.0;\n\t\n\tprintf(\"Percentage = %.2f%%\", percentage);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output79);
        }
        if(val_key_from_intent==80){
            programNAme.setText(R.string.string_pTops80);
            program.setText("#include<stdio.h>\n\t\n\tint main() {\n\tint gross_salary, basic, da, ta;\n\t\n\tprintf(\"Enter basic salary : \");\n\tscanf(\"%d\", &basic);\n\t\n\tda = (10 * basic) / 100;\n\tta = (12 * basic) / 100;\n\t\n\tgross_salary = basic + da + ta;\n\t\n\tprintf(\"\n\tGross salary : %d\", gross_salary);\n\treturn (0);\n\t}.");
            output.setText(R.string.string_output80);
        }
//81-90
        if(val_key_from_intent==81){
            programNAme.setText(R.string.string_pTops81);
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tfloat celsius, fahrenheit;\n\tprintf(\"Enter temperature in Celsius: \");\n\tscanf(\"%f\", &celsius);\n\t//celsius to fahrenheit conversion formula\n\tfahrenheit = (celsius * 9 / 5) + 32;\n\tprintf(\"%.2f Celsius = %.2f Fahrenheit\", celsius, fahrenheit);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output81);
        }
        if(val_key_from_intent==82){
            programNAme.setText(R.string.string_pTops82);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\t\n\tint digit;\n\t\n\tprintf(\"Enter digit:\");\n\tscanf(\"%d\",&digit); //Input digit\n\t\n\tswitch (digit) { //Writing a case for every digit in 0-9\n\t\n\tcase 1:\n\t\n\tprintf(\"One\n\t\");\n\t\n\t\n\tbreak;\n\tcase 2:\n\t\n\tprintf(\"Two\n\t\");\n\tbreak;\n\tcase 3:\n\t\n\tprintf(\"Three\n\t\");\n\t\n\t\n\tbreak;\n\tcase 4:\n\t\n\tprintf(\"Four\n\t\");\n\t\n\tbreak;\n\tcase 5:\n\t\n\tprintf(\"Five\n\t\");\n\t\n\tbreak;\n\tcase 6:\n\t\n\tprintf(\"Six\n\t\");\n\t\n\tbreak;\n\tcase 7:\n\t\n\tprintf(\"Seven\n\t\");\n\t\n\tbreak;\n\tcase 8:\n\t\n\tprintf(\"Eight\n\t\");\n\t\n\tbreak;\n\tcase 9:\n\t\n\tprintf(\"Nine\n\t\");\n\t\n\tbreak;\n\tcase 0:\n\t\n\tprintf(\"Zero\n\t\");\n\t\n\tbreak;\n\tdefault:\n\t\n\tprintf(\"Invalid Digit\n\t\");\n\t}\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output82);
        }
        if(val_key_from_intent==83){
            programNAme.setText(R.string.string_pTops83);
            program.setText("#include <stdio.h>\n\t\n\tint main () {\n\t\n\t/* local variable definition */\n\tint a = 100;\n\tint b = 200;\n\t\n\tswitch(a) {\n\t\n\tcase 100:\n\t\n\tprintf(\"This is part of outer switch\n\t\", a );\n\t\n\t\n\tswitch(b) {\n\t\n\tcase 200:\n\t\n\tprintf(\"This is part of inner switch\n\t\", a );\n\t\n\t}\n\t}\n\t\n\tprintf(\"Exact value of a is : %d\n\t\", a );\n\tprintf(\"Exact value of b is : %d\n\t\", b );\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output83);
        }
        if(val_key_from_intent==84){
            programNAme.setText(R.string.string_pTops84);
            program.setText("#include <stdio.h>\n\t#include <conio.h>\n\t\n\tvoid main()\n\t{\n\tint num, i, j, k = 1;\n\t\n\tprintf( \" Enter a number to define the rows in Floyd's triangle: \n\t\");\n\tscanf( \"%d\", &num);\n\t// use nested for loop\n\t// outer for loop define the rows and check rows condition\n\tfor (i = 1; i <= num; i++)\n\t{\n\t// inner loop check j should be less than equal to 1 and print the data.\n\tfor (j = 1; j <= i; j++)\n\t{\n\t\n\tprintf(\" %2d\", k++); // print the number\n\t}\n\tprintf( \"\n\t\");\n\t}\n\t\n\tgetch();\n\t}  .");
            output.setText(R.string.string_output84);
        }
        if(val_key_from_intent==85){
            programNAme.setText(R.string.string_pTops85);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint n, n1, rev = 0, rem;\n\t\n\tprintf(\"Enter any number: \");\n\tscanf(\"%d\", &n);\n\tn1 = n;\n\t\n\t//logic\n\twhile (n > 0){n\n\trem = n % 10;n\rev = rev * 10 + rem;\n\tn = n / 10;\n\t}\n\t\n\tif (n1 == rev){\n\tprintf(\"Given number is a palindromic number\");\n\t}\n\telse{\n\tprintf(\"Given number is not a palindromic number\");\n\t}\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output85);
        }
        if(val_key_from_intent==86){
            programNAme.setText(R.string.string_pTops86);
            program.setText("#include<stdio.h>\n\t\n\tvoid main( )\n\t{\n\tFILE *fp ;\n\tchar ch ;\n\tfp = fopen(\"file_handle.c\",\"r\") ;\n\twhile ( 1 )\n\t{\n\tch = fgetc ( fp ) ;\n\tif ( ch == EOF )\n\tbreak ;\n\tprintf(\"%c\",ch) ;\n\t}\n\tfclose (fp ) ;\n\t}  .");
            output.setText(R.string.string_output86);
        }
        if(val_key_from_intent==87){
            programNAme.setText(R.string.string_pTops87);
            program.setText("#include <stdio.h>\n\t\n\t/* global variable declaration */\n\tint g = 20;\n\tint main ()\n\t{\n\t/* local variable declaration */\n\tint g = 10;\n\tprintf (\"value of g = %d\n\t\", g);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output87);
        }
        if(val_key_from_intent==88){
            programNAme.setText(R.string.string_pTops88);
            program.setText("#include <stdio.h>\n\t#include <conio.h>\n\t#include <stdlib.h>\n\t\n\tvoid main()\n\t{\n\t// use rand() function to generate the number\n\tprintf (\" The random number is: %d\", rand());\n\tprintf (\"\n\t The random number is: %d\", rand());\n\t\n\tprintf (\" \n\t The random number is: %d\", rand());\n\tprintf (\"\n\t The random number is: %d\", rand());\n\tgetch();\n\t}  .");
            output.setText(R.string.string_output88);
        }
        if(val_key_from_intent==89){
            programNAme.setText(R.string.string_pTops89);
            program.setText("#include < stdio.h >\n\t\n\tlong factorial(int);\n\tint main()\n\t{\n\tint i, n, c;\n\tprintf(\"Enter the number of rows you wish to see in pascal triangle\n\t\");\n\tscanf(\"%d\", & n);\n\tfor (i = 0; i < n; i++) {\n\tfor (c = 0; c <= (n - i - 2); c++) printf(\" \");\n\tfor (c = 0; c <= i; c++) printf(\"%ld \", factorial(i) / (factorial(c) * factorial(i - c)));\n\tprintf(\"\n\t\");\n\t}\n\treturn 0;\n\t}\n\tlong factorial(int n) {\n\tint c;\n\tlong result = 1;\n\tfor (c = 1; c <= n; c++) result = result * c;\n\treturn result;\n\t} .");
            output.setText(R.string.string_output89);
        }
        if(val_key_from_intent==90){
            programNAme.setText(R.string.string_pTops9);
            program.setText("#include <stdio.h>\n\t\n\tvoid main() {\n\tint a = 17;\n\tint b = 35;\n\tint sum;\n\tsum = a + b;\n\tprintf(\"Sum of the given two numbers  = %d\n\t\", sum);\n\t}.");
            output.setText(R.string.string_output90);
        }
//91-100
        if(val_key_from_intent==91){
            programNAme.setText(R.string.string_pTops91);
            program.setText("#include<stdio.h>\n\t\n\tint main(){\n\tint n,i,m=0,flag=0;\n\tprintf(\"Enter the number to check prime:\");\n\tscanf(\"%d\",&n);\n\tm=n/2;\n\tfor(i=2;i<=m;i++)\n\t{\n\tif(n%i==0)\n\t{\n\tprintf(\"Number is not prime\");\n\tflag=1;\n\tbreak;\n\t}\n\t}\n\tif(flag==0)\n\tprintf(\"Number is prime\");\n\treturn 0;\n\t}    .");
            output.setText(R.string.string_output91);
        }
        if(val_key_from_intent==92){
            programNAme.setText(R.string.string_pTops92);
            program.setText("C language Doesn't support Classes.\n\tContent Included if this would contribute to your Understanding.");
            output.setText(R.string.string_output92);
        }
        if(val_key_from_intent==93){
            programNAme.setText(R.string.string_pTops93);
            program.setText("#include <stdio.h>  \n\tint main()  \n\t{  \n\t    int *ptr;  \n\t    ptr=(int*)malloc(4*sizeof(int));  \n\t    if(ptr==NULL)  \n\t    {  \n\t        printf(\"Memory is not allocated\");  \n\t    }  \n\t    else  \n\t    {  \n\t        printf(\"Memory is allocated\");  \n\t    }  \n\t    return 0;  \n\t}  ");
            output.setText(R.string.string_output93);
        }
        if(val_key_from_intent==94){
            programNAme.setText(R.string.string_pTops94);
            program.setText("#include <stdio.h>\n\t\n\t#define MIN(x,y) ((x<y)?x:y)\n\t\n\tint main()\n\t{\n\tint a,b,min;\n\t\n\tprintf(\"Enter first number: \");\n\tscanf(\"%d\",&a);\n\tprintf(\"Enter second number: \");\n\tscanf(\"%d\",&b);\n\t\n\tmin=MIN(a,b);\n\tprintf(\"Minimum number is: %d\n\t\",min);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output94);
        }
        if(val_key_from_intent==95){
            programNAme.setText(R.string.string_pTops95);
            program.setText("#include<stdio.h>\n\t#include<conio.h>\n\t\n\tvoid main() {\n\tint year;\n\tprintf(\"Enter a year: \");\n\tscanf(\"%d\", &year);\n\tif(((year%4==0) && ((year%400==0) || (year%100!==0))\n\t{\n\tprintf(\"%d is a leap year\", &year);\n\t} else {\n\tprintf(\"%d is not a leap year\", &year);\n\t}\n\tgetch();\n\t}  .");
            output.setText(R.string.string_output95);
        }
        if(val_key_from_intent==96){
            programNAme.setText(R.string.string_pTops96);
            program.setText("this pointer is not available in static member functions as static member functions can be called without any object (with class name)");
            output.setText(R.string.string_output96);
        }
        if(val_key_from_intent==97){
            programNAme.setText(R.string.string_pTops97);
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tint var1, var2, temp;\n\tprintf(\"Enter two integersn\");\n\tscanf(\"%d%d\", &var1, &var2);\n\tprintf(\"Before SwappingnFirst variable = %dnSecond variable = %dn\", var1, var2);\n\ttemp = var1;\n\tvar1 = var2;\n\tvar2 = temp;\n\tprintf(\"After SwappingnFirst variable = %dnSecond variable = %dn\", var1, var2);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output97);
        }
        if(val_key_from_intent==98){
            programNAme.setText(R.string.string_pTops98);
            program.setText("#include<stdio.h>\n\tint main()\n\t{\n\tint a=10, b=20;\n\tprintf(\"Before swap a=%d b=%d\",a,b);\n\ta=a+b;//a=30 (10+20)\n\tb=a-b;//b=10 (30-20)\n\ta=a-b;//a=20 (30-10)\n\tprintf(\"\n\tAfter swap a=%d b=%d\",a,b);\n\treturn 0;\n\t}   .");
            output.setText(R.string.string_output98);
        }
        if(val_key_from_intent==99){
            programNAme.setText(R.string.string_pTops99);
            program.setText("#include<stdio.h>\n\t\n\tint main()\n\t{\n\tfloat P , R , T , SI ;\n\tP =34000; R =30;  T = 5;\n\tSI  = (P*R*T)/100;\n\tprintf(\"\n\t\n\t Simple Interest is : %f\", SI);\n\treturn (0);\n\t}  .");
            output.setText(R.string.string_output99);
        }
        if(val_key_from_intent==100){
            programNAme.setText(R.string.string_pTops100);
            program.setText("/* C program to remove spaces from a string */\n\t\n\t#include<stdio.h>\n\t\n\tchar *remove_white_spaces(char *str)\n\t{\n\tint i = 0, j = 0;\n\twhile (str[i])\n\t{\n\tif (str[i] != ‘ ‘)\n\t\n\tstr[j++] = str[i];\n\ti++;\n\t}\n\tstr[j] = ‘\0’;\n\treturn str;\n\t}\n\t\n\tint main()\n\t{\n\tchar str[50];\n\tprintf(\"\n\t\t Enter a string : \");\n\tgets(str);\n\tremove_white_spaces(str);\n\tprintf(“%s”,str);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output100);
        }
//101-103
        if(val_key_from_intent==101){
            programNAme.setText(R.string.string_pTops101);
            program.setText("#include<stdio.h>\n\t\n\tint main()\n\t{\n\tint n, reverse=0, rem;\n\tprintf(\"Enter a number: \");\n\tscanf(\"%d\", &n);\n\twhile(n!=0)\n\t{\n\trem=n%10;\n\treverse=reverse*10+rem;\n\t\n\t=10;\n\t}\n\tprintf(\"Reversed Number: %d\",reverse);\n\treturn 0;\n\t}   .");
            output.setText(R.string.string_output101);
        }
        if(val_key_from_intent==102){
            programNAme.setText(R.string.string_pTops102);
            program.setText("#include<stdio.h>\n\t\n\t\n\tvoid change(int *num) {\n\tprintf(\"Before adding value inside function num=%d \n\t\",*num);\n\t(*num) += 100;\n\tprintf(\"After adding value inside function num=%d \n\t\", *num);\n\t}\n\tint main() {\n\tint x=100;\n\tprintf(\"Before function call x=%d \n\t\", x);\n\tchange(&x);//passing reference in function\n\tprintf(\"After function call x=%d \n\t\", x);\n\treturn 0;\n\t}    .");
            output.setText(R.string.string_output102);
        }
        if(val_key_from_intent==103){
            programNAme.setText(R.string.string_pTops103);
            program.setText("#include <stdio.h>\n\t#include <time.h>\n\t\n\tint main(void) {\n\t\n\ttime_t now = time(NULL);\n\t\n\tif (now == -1) {\n\t\n\tputs(\"The time() function failed\");\n\t}\n\t\n\tprintf(\"%ld\n\t\", now);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output103);
        }

        //New ones sssssssssssssssssssssssss..................

        if(val_key_from_intent==110) {
            programNAme.setText(R.string.string_pTops110);
            program.setText("#include<stdio.h>\n\tint main(){\n\tconst float PI=3.14;\n\tprintf(\"The value of PI is: %f\",PI);\n\treturn 0;\n\t}     .");
            output.setText(R.string.string_output110);
        }
        if(val_key_from_intent==111) {
            programNAme.setText(R.string.string_pTops111);
            program.setText("// Program to illustrate the declaration of variables in C\n\t#include <stdio.h>\n\tint main()\n\t{\n\t// declaring alpha variable with value 10.\n\tint alpha = 10;\n\t// declaring beta variable with value 20.\n\tint beta = 20;\n\t// declaring c variable without initializing it.\n\tint c=0;\n\t// Checking the initial value of c variable.\n\tprintf(\"The initial value of c is %d\n\t\", c);\n\tc= alpha + beta;\n\t// printing C variable value.\n\tprintf(\"The sum of alpha and beta is %d\", c);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output111);
        }
        if(val_key_from_intent==112) {
            programNAme.setText(R.string.string_pTops112);
            program.setText("#include <stdbool.h> // Header-file for boolean data-type.\n\tint main() {\n\tbool x=false;  // Declaration and initialization of boolean variable.\n\tif (x==true) {  // Conditional statement.\n\tprintf(\"The value of x is true\");\n\t} else {\n\tprintf(\"The value of x is false\");\n\t}\n\t\n\treturn 0;\n\t// Output: The value of x is false\n\t}.");
            output.setText(R.string.string_output112);
        }
        if(val_key_from_intent==113) {
            programNAme.setText(R.string.string_pTops113);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint i;\n\t\n\tprintf(\"Break code: \n\t\");\n\tfor (i = 0; i < 10; i++) {\n\tif (i == 4) {\n\tbreak;\n\t}\n\tprintf(\"%d\n\t\", i);\n\t}\n\tprintf(\"\n\tContinue code:\n\t\");\n\tfor (i = 0; i < 10; i++) {\n\tif (i == 4) {\n\tcontinue;\n\t}\n\tprintf(\"%d\n\t\", i);\n\t}\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output113);
        }
        if(val_key_from_intent==114) {
            programNAme.setText(R.string.string_pTops114);
            program.setText("#include <stdio.h>\n\t// variable with file scope\n\tint x = 10;\n\t\n\tvoid func() {\n\t// x is available in func() function,\n\t// x now equals 10 + 10 = 20\n\tx += 10;\n\tprintf(\"Value of x is %d\n\t\", x);\n\t}\n\t\n\tint main() {\n\tfunc();\n\t// x is also available in main() function\n\tx += 30; // x now equals 20 + 30 = 50\n\tprintf(\"Value of x is %d\", x);\n\treturn 0;\n\t}\n\t.");
            output.setText(R.string.string_output114);
        }
        if(val_key_from_intent==115) {
            programNAme.setText(R.string.string_pTops115);
            program.setText("#include <stdio.h>\n\tint main() {\n\tstatic int a;\n\tint b;\n\tprintf(\"Default value of static variable : %d\n\t\", a);\n\tprintf(\"Default value of non-static variable : %d\n\t\", b);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output115);
        }
        if(val_key_from_intent==116) {
            programNAme.setText(R.string.string_pTops116);
            program.setText("#include <stdio.h>\n\tint add (int,int); /* function prototype for add */\n\t\n\tvoid main()\n\t{\n\tprintf(\"%d\n\t\",add(3,5));\n\t}\n\t\n\tint add(int i, int j)\n\t{\n\treturn i+j;\n\t}.");
            output.setText(R.string.string_output116);
        }
        if(val_key_from_intent==117) {
            programNAme.setText(R.string.string_pTops117);
            program.setText("/* Basic philosophy of function pointer in callback */\n\t#include<stdio.h>\n\t#include<string.h>\n\t\n\tint func(char *s)\n\t{\n\tprintf(\"Callback recieved : %s\",s);\n\treturn 0;\n\t}\n\t\n\tfloat divide(unsigned int a, unsigned int b, int(*status_callback)(char*))\n\t{\n\tstatus_callback(\"\n\t Recieved values...validating\n\t\");\n\tif(b == 0)\n\t{\n\tstatus_callback(\"\n\t b = 0 detected, aborting....\n\t\");\n\treturn -1;\n\t}\n\tstatus_callback(\"\n\t Validation complete, performing division\n\t\");\n\tfloat ret = a/b;\n\tstatus_callback(\"\n\t Division complete, returning value\n\t\");\n\treturn ret;\n\t}\n\t\n\t\n\tint main(void)\n\t{\n\tint(*func_ptr)(char*);\n\tunsigned int a = 6, b = 3;\n\tprintf(\"\n\t This is a prgram to find a/b\n\t\");\n\t\n\tfunc_ptr = func;\n\t\n\tfloat ret = divide(a,b,func_ptr);\n\tprintf(\"\n\t divide returned [%f]\n\t\",ret);\n\t\n\treturn 0;\n\t\n\t}.");
            output.setText(R.string.string_output117);
        }
        if(val_key_from_intent==118) {
            programNAme.setText(R.string.string_pTops118);
            program.setText("Separate Compilation Program Unavailable.");
            output.setText(R.string.string_output118);
        }
        if(val_key_from_intent==119) {
            programNAme.setText(R.string.string_pTops119);
            program.setText("#include <stdio.h>\n\tint main( ) {\n\t\n\tchar str[100];\n\tint i;\n\t\n\tprintf( \"Enter a value :\");\n\tscanf(\"%s %d\", str, &i);\n\t\n\tprintf( \"\n\tYou entered: %s %d \", str, i);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output119);
        }
        if(val_key_from_intent==120) {
            programNAme.setText(R.string.string_pTops120);
            program.setText("   #include <stdio.h>\n\t#include <stdlib.h>\n\t#include <string.h>\n\t\n\t#define MAX_LINE_LENGTH 80\n\t\n\tint main(int argc, char **argv)\n\t{\n\tchar *path;\n\tchar line[MAX_LINE_LENGTH] = {0};\n\tunsigned int line_count = 0;\n\t\n\tif (argc < 1)\n\treturn EXIT_FAILURE;\n\tpath = argv[1];\n\t\n\t/* Open file */\n\tFILE *file = fopen(path, \"r\");\n\t\n\tif (!file)\n\t{\n\tperror(path);\n\treturn EXIT_FAILURE;\n\t}\n\t\n\t/* Get each line until there are none left */\n\twhile (fgets(line, MAX_LINE_LENGTH, file))\n\t{\n\t/* Print each line */\n\tprintf(\"line[%06d]: %s\", ++line_count, line);\n\t\n\t/* Add a trailing newline to lines that don't already have one */\n\tif (line[strlen(line) - 1] != '\n\t')\n\t\n\tprintf(\"\n\t\");\n\t\n\t}\n\t\n\t/* Close file */\n\tif (fclose(file))\n\t{\n\treturn EXIT_FAILURE;\n\tperror(path);\n\t}\n\t}.");
            output.setText(R.string.string_output120);
        }

        if(val_key_from_intent==121) {
            programNAme.setText(R.string.string_pTops121);
            program.setText("#include <stdio.h>\n\tint main()\n\t{\n\tint a;\n\tfloat b;\n\tint x = scanf(\"%d%f\", &a, &b);\n\tprintf(\"Decimal Number is : %d\n\t\",a);\n\tprintf(\"Floating-Point Number is : %f\n\t\",b);\n\tprintf(\"Return Value: %d\",x);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output121);
        }
        if(val_key_from_intent==122) {
            programNAme.setText(R.string.string_pTops122);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\tint answer_1 = 0; // stores order evaluated answer\n\tint answer_2 = 0; // stores left to right evaluation\n\t\n\tanswer_1 = 2 * 3 + 4 / 2;\n\tanswer_2 = 2 * (3 + 4) / 2;\n\t\n\tprintf(\"Answer with order of evaluation: %d\n\t\", answer_1);\n\tprintf(\"Answer without order of evaluation: %d\n\t\", answer_2);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output122);
        }
        if(val_key_from_intent==123) {
            programNAme.setText(R.string.string_pTops123);
            program.setText("#include <stdio.h>\n\tint main()\n\t{\n\tint a = 1;\n\tchar b = 'G';\n\tdouble c = 3.14;\n\tprintf(\"Hello World!\n\t\");\n\t\n\t// printing the variables defined\n\t// above along with their sizes\n\tprintf(\"Hello! I am a character. My value is %c and \"\n\t\n\t\"my size is %lu byte.\n\t\",\n\t\n\tb, sizeof(char));\n\t// can use sizeof(b) above as well\n\t\n\tprintf(\"Hello! I am an integer. My value is %d and \"\n\t\n\t\"my size is %lu  bytes.\n\t\",\n\t\n\ta, sizeof(int));\n\t// can use sizeof(a) above as well\n\t\n\tprintf(\"Hello! I am a double floating point variable.\"\n\t\n\t\" My value is %lf and my size is %lu bytes.\n\t\",\n\t\n\tc, sizeof(double));\n\t// can use sizeof(c) above as well\n\t\n\tprintf(\"Bye! See you soon. :)\n\t\");\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output123);
        }
        if(val_key_from_intent==124) {
            programNAme.setText(R.string.string_pTops124);
            program.setText("#include<stdio.h>\n\t#include \"circle.c\"\n\t#include \"circle.h\"\n\t\n\t#define PI 3.14159265358979323846\n\tdouble circle_area(float, float);\n\t\n\tint main()\n\t{\n\tfloat r = 4.0;\n\tprintf(\"%.2f\", circle_area(r, PI));\n\treturn 0;\n\t}\n\t\n\tdouble circle_area(float r, float PI){\n\treturn (PI * r * r);\n\t}.");
            output.setText(R.string.string_output124);
        }
        if(val_key_from_intent==125) {
            programNAme.setText(R.string.string_pTops125);
            program.setText("#include<stdio.h>\n\t#define square(a) a*a;\n\tint main(){\n\tint b,c;\n\tprintf(\"enter b element:\");\n\tscanf(\"%d\",&b);\n\tc=square(b);//replaces c=b*b before execution of program\n\tprintf(\"%d\",c);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output125);
        }
        if(val_key_from_intent==126) {
            program.setText("# include <stdio.h>\n\t# define a 10;\n\tvoid main(){\n\t#ifdef a\n\tprintf(\"\n\t Hello I am here..\");\n\t#endif\n\t#ifndef a\n\tprintf(\"\n\t Not defined \");\n\t#else\n\tprintf(\"\n\t R u There \");\n\t#endif\n\t}.");
            output.setText(R.string.string_output126);
        }
        if(val_key_from_intent==127) {
            programNAme.setText(R.string.string_pTops127);
            program.setText("// C program to illustrate\n\t// pointer increment//decrement\n\t\n\t#include <stdio.h>\n\t\n\t// Driver Code\n\tint main()\n\t{\n\t// Integer variable\n\tint N = 4;\n\t\n\t// Pointer to an integer\n\tint *ptr1, *ptr2;\n\t// Pointer stores\n\t// the address of N\n\tptr1 = &N;\n\tptr2 = &N;\n\t\n\tprintf(\"Pointer ptr1 \"\n\t\n\t\"before Increment: \");\n\tprintf(\"%p \n\t\", ptr1);\n\t\n\t// Incrementing pointer ptr1;\n\tptr1++;\n\t\n\tprintf(\"Pointer ptr1 after\"\n\t\n\t\" Increment: \");\n\tprintf(\"%p \n\t\n\t\", ptr1);\n\t\n\tprintf(\"Pointer ptr1 before\"\n\t\n\t\" Decrement: \");\n\tprintf(\"%p \n\t\", ptr1);\n\t\n\t// Decrementing pointer ptr1;\n\tptr1--;\n\t\n\tprintf(\"Pointer ptr1 after\"\n\t\n\t\" Decrement: \");\n\tprintf(\"%p \n\t\n\t\", ptr1);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output127);
        }
        if(val_key_from_intent==128) {
            programNAme.setText(R.string.string_pTops128);
            program.setText("#include <stdio.h>\n\t\n\tint main()\n\t{\n\tchar arr[] = \"don't panic\n\t\";\n\tchar* ptr = arr;\n\t\n\tprintf(\"%c %c\n\t\", arr[4], ptr[4]);\n\tprintf(\"%c %c\n\t\", *(arr+2), *(ptr+2));\n\t\n\treturn 0;\n\t\n\t}.");
            output.setText(R.string.string_output128);
        }
        if(val_key_from_intent==129) {
            programNAme.setText(R.string.string_pTops129);
            program.setText("#include <stdio.h>\n\t\n\tvoid swap(int *a, int *b);\n\t\n\tint main()\n\t{\n\tint m = 10, n = 20;\n\tprintf(\"m = %d\n\t\", m);\n\tprintf(\"n = %d\n\t\n\t\", n);\n\t\n\tswap(&m, &n);    //passing address of m and n to the swap function\n\tprintf(\"After Swapping:\n\t\n\t\");\n\tprintf(\"m = %d\n\t\", m);\n\tprintf(\"n = %d\", n);\n\treturn 0;\n\t}\n\t\n\t/*\n\tpointer 'a' and 'b' holds and\n\tpoints to the address of 'm' and 'n'\n\t*/\n\tvoid swap(int *a, int *b)\n\t{\n\tint temp;\n\ttemp = *a;\n\t*a = *b;\n\t*b = temp;\n\t}.");
            output.setText(R.string.string_output129);
        }
        if(val_key_from_intent==130) {
            programNAme.setText(R.string.string_pTops130);
            program.setText("#include <stdio.h>\n\t#include <string.h>\n\tint main()\n\t{\n\tchar str1[100];\n\tchar newString[10][10];\n\tint i,j,ctr;\n\tprintf(\"\n\t\n\t Split string by space into words :\n\t\");\n\tprintf(\"---------------------------------------\n\t\");\n\t\n\tprintf(\" Input  a string : \");\n\tfgets(str1, sizeof str1, stdin);\n\t\n\tj=0; ctr=0;\n\tfor(i=0;i<=(strlen(str1));i++)\n\t{\n\t// if space or NULL found, assign NULL into newString[ctr]\n\tif(str1[i]==' '||str1[i]=='\0')\n\t{\n\t\n\tnewString[ctr][j]='\0';\n\t\n\tctr++;  //for next word\n\t\n\tj=0;    //for next word, init index to 0\n\t}\n\telse\n\t{\n\t\n\tnewString[ctr][j]=str1[i];\n\t\n\tj++;\n\t}\n\t}\n\tprintf(\"\n\t Strings or words after split by space are :\n\t\");\n\tfor(i=0;i < ctr;i++)\n\tprintf(\" %s\n\t\",newString[i]);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output130);
        }

        if(val_key_from_intent==131) {
            programNAme.setText(R.string.string_pTops131);
            program.setText("#include <stdlib.h>\n\tint main(){\n\tint *ptr;\n\tptr = malloc(15 * sizeof(*ptr)); /* a block of 15 integers */\n\tif (ptr != NULL) {\n\t*(ptr + 5) = 480; /* assign 480 to sixth integer */\n\tprintf(\"Value of the 6th integer is %d\",*(ptr + 5));\n\t}\n\t}.");
            output.setText(R.string.string_output131);
        }
        if(val_key_from_intent==132) {
            programNAme.setText(R.string.string_pTops132);
            program.setText("// Program to calculate the sum of n numbers entered by the user\n\t\n\t#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\tint main() {\n\tint n, i, *ptr, sum = 0;\n\t\n\tprintf(\"Enter number of elements: \");\n\tscanf(\"%d\", &n);\n\t\n\tptr = (int*) malloc(n * sizeof(int));\n\t\n\t// if memory cannot be allocated\n\tif(ptr == NULL) {\n\tprintf(\"Error! memory not allocated.\");\n\texit(0);\n\t}\n\t\n\tprintf(\"Enter elements: \");\n\tfor(i = 0; i < n; ++i) {\n\tscanf(\"%d\", ptr + i);\n\tsum += *(ptr + i);\n\t}\n\t\n\tprintf(\"Sum = %d\", sum);\n\t\n\t// deallocating the memory\n\tfree(ptr);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output132);
        }
        if(val_key_from_intent==133) {
            programNAme.setText(R.string.string_pTops133);
            program.setText("#include <stdio.h>\n\t#include <stdlib.h>\n\tint main() {\n\tint n = 4, i, *p, s = 0;\n\tp = (int*) calloc(n, sizeof(int));\n\tif(p == NULL) {\n\tprintf(\"\n\tError! memory not allocated.\");\n\texit(0);\n\t}\n\tprintf(\"\n\tEnter elements of array : \");\n\tfor(i = 0; i < n; ++i) {\n\tscanf(\"%d\", p + i);\n\ts += *(p + i);\n\t}\n\tprintf(\"\n\tSum : %d\", s);p = (int*) realloc(p, 6);\n\tprintf(\"\n\tEnter elements of array : \");\n\tfor(i = 0; i < n; ++i) {\n\tscanf(\"%d\", p + i);\n\ts += *(p + i);\n\t}\n\tprintf(\"\n\tSum : %d\", s);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output133);
        }
        if(val_key_from_intent==134) {
            programNAme.setText(R.string.string_pTops134);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\t// Block\n\t{\n\t//Variables within the block\n\tint a = 8;\n\tint b = 10;\n\tprintf (\"The values are: %d, %d\n\t\", a, b);\n\t}\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output134);
        }
        if(val_key_from_intent==135) {
            programNAme.setText(R.string.string_pTops135);
            program.setText("\n\t// C program to illustrate fopen()\n\t\n\t#include <stdio.h>\n\t#include <stdlib.h>\n\t\n\tint main()\n\t{\n\t\n\t// pointer demo to FILE\n\tFILE* demo;\n\t\n\t// Creates a file \"demo_file\"\n\t// with file access as write-plus mode\n\tdemo = fopen(\"demo_file.txt\", \"w+\");\n\t\n\t// adds content to the file\n\tfprintf(demo, \"%s %s %s\", \"Welcome\",\n\t\n\t\"to\", \"GeeksforGeeks\");\n\t\n\t// closes the file pointed by demo\n\tfclose(demo);\n\t\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output135);
        }
        if(val_key_from_intent==136) {
            programNAme.setText(R.string.string_pTops136);
            program.setText("#include <stdio.h>\n\t/* Read one line from fp, */\n\t/* copying it to line array (but no more than max chars). */\n\t/* Does not place terminating \n\t in line array. */\n\t/* Returns line length, or 0 for empty line, or EOF for end-of-file. */\n\t\n\tint fgetline(FILE *fp, char line[], int max)\n\t{\n\tint nch = 0;\n\tint c;\n\tmax = max - 1;\t\t\t/* leave room for '\0' */\n\t\n\twhile((c = getc(fp)) != EOF)\n\t{\n\tif(c == '\n\t')\n\tbreak;\n\t\n\tif(nch < max)\n\t{\n\tline[nch] = c;\n\tnch = nch + 1;\n\t}\n\t}\n\t\n\tif(c == EOF && nch == 0)\n\treturn EOF;\n\t\n\tline[nch] = '\0';\n\treturn nch;\n\t}.");
            output.setText(R.string.string_output136);
        }
        if(val_key_from_intent==137) {
            programNAme.setText(R.string.string_pTops137);
            program.setText("Not Available.");
            output.setText(R.string.string_output137);
        }
        if(val_key_from_intent==138) {
            programNAme.setText(R.string.string_pTops138);
            program.setText("Not Available.");
            output.setText(R.string.string_output138);
        }
        if(val_key_from_intent==139) {
            programNAme.setText(R.string.string_pTops139);
            program.setText("#include<stdio.h>\nint main(){\n\tclrscr();\n\tprintf(\"GeeksforGeeks | A computer science portal for geeks\n\n//Output    \n\n   C:\\Users\\Rashi\\Desktop>gcc  fgetcexp.c -o fgetcexp\n\nC:\\USers\\Rashi\\Desktop>fgetcexp\ncontent of this file are\nGeeksforGeeks | A computer science portal for geeks\");\n\tgetch();\n\treturn 0;");
            output.setText(R.string.string_output139);
        }
        if(val_key_from_intent==140) {
            programNAme.setText(R.string.string_pTops140);
            program.setText("// C program to implement\n\t// the above approach\n\t#include <stdio.h>\n\t#include <stdlib.h>\n\t#include <string.h>\n\t\n\t// Driver code\n\tint main()\n\t{\n\tFILE* ptr;\n\tchar ch;\n\t\n\t// Opening file in reading mode\n\tptr = fopen(\"test.txt\", \"r\");\n\t\n\tif (NULL == ptr) {\n\tprintf(\"file can't be opened \n\t\");\n\t}\n\t\n\tprintf(\"content of this file are \n\t\");\n\t\n\t// Printing what is written in file\n\t// character by character using loop.\n\tdo {\n\tch = fgetc(ptr);\n\tprintf(\"%c\", ch);\n\t\n\t// Checking if character is not EOF.\n\t// If it is EOF stop eading.\n\t} while (ch != EOF);\n\t\n\t// Closing the file\n\tfclose(ptr);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output140);
        }

        if(val_key_from_intent==141) {
            programNAme.setText(R.string.string_pTops141);
            program.setText("#include <stdio.h>\n\t\n\tint main() {\n\t\n\tprintf(\"File :%s\n\t\", __FILE__ );\n\tprintf(\"Date :%s\n\t\", __DATE__ );\n\tprintf(\"Time :%s\n\t\", __TIME__ );\n\tprintf(\"Line :%d\n\t\", __LINE__ );\n\tprintf(\"ANSI :%d\n\t\", __STDC__ );\n\t\n\t}.");
            output.setText(R.string.string_output141);
        }
        if(val_key_from_intent==142) {
            programNAme.setText(R.string.string_pTops142);
            program.setText("#include <stdio.h>\n\t#include <math.h>\n\t\n\tint main()\n\t{\n\tfloat num, root;\n\tprintf(\"Enter a number: \");\n\tscanf(\"%f\", &num);\n\t\n\t// Computes the square root of num and stores in root.\n\troot = sqrt(num);\n\t\n\tprintf(\"Square root of %.2f = %.2f\", num, root);\n\treturn 0;\n\t}.");
            output.setText(R.string.string_output142);
        }
        if(val_key_from_intent==143) {
            programNAme.setText(R.string.string_pTops143);
            next_cv.setVisibility(View.GONE);
            program.setText("#include <stdio.h>\n\t#include <conio.h>\n\tint main ()\n\t{\n\t// declare integer variables\n\tint x, y, z;\n\tprintf (\" Input the value of X: \");\n\tscanf (\" %d\", &x);\n\tprintf (\"  Input the value of Y: \");\n\tscanf (\" %d\", &y);\n\tprintf (\" Input the value of Z: \");\n\tscanf (\" %d\", &z);\n\t// use pre increment operator to update the value by 1\n\t++x;\n\t++y;\n\t++z;\n\t\n\tprintf (\" \n\t The updated value of the X: %d \", x);\n\tprintf (\" \n\t The updated value of the Y: %d \", y);\n\tprintf (\" \n\t The updated value of the Z: %d \", z);\n\treturn 0;\n\t}  .");
            output.setText(R.string.string_output143);
        }









    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(ProgramNOutput.this, MainActivity.class);
        int val = 2;
        intent.putExtra("back_intent_vp_page_2", val);
        startActivity(intent);
    }
}