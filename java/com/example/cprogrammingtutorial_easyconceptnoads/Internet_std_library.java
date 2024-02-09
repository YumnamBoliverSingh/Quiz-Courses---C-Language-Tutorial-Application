package com.example.cprogrammingtutorial_easyconceptnoads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Internet_std_library extends AppCompatActivity {
    WebView webView;
    CardView prevInternet, nextInternet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_std_library);
        webView = findViewById(R.id.webView);
        int value_keyzz = getIntent().getIntExtra("internet_no", 144);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        getSupportActionBar().hide();
        prevInternet=findViewById(R.id.prevInternet);
        nextInternet=findViewById(R.id.nextInternet);

        if(value_keyzz==144){
            Toast.makeText(getApplicationContext(), "Chapter: 14.4\n\nLoaded!", Toast.LENGTH_SHORT).show();
            webView.loadUrl("https://beginnersbook.com/2014/01/c-functions-examples/");
        }
        if(value_keyzz==145){
            Toast.makeText(getApplicationContext(), "Chapter: 14.5\n\nLoaded!", Toast.LENGTH_SHORT).show();
            webView.loadUrl("https://www.geeksforgeeks.org/cc-preprocessors/");
        }
        if(value_keyzz==146){
            Toast.makeText(getApplicationContext(), "Chapter: 14.6\n\nLoaded!", Toast.LENGTH_SHORT).show();
            webView.loadUrl("https://www.geeksforgeeks.org/c-library-functions/");
            nextInternet.setVisibility(View.GONE);
        }


        prevInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value_keyzz==144){
                    Intent intent = new Intent(Internet_std_library.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("internet_no", 143);
                    startActivity(intent);
                }
                if(value_keyzz==145){
                    Toast.makeText(getApplicationContext(), "Chapter: 14.4", Toast.LENGTH_SHORT).show();
                    webView.loadUrl("https://beginnersbook.com/2014/01/c-functions-examples/");
                }
                if(value_keyzz==146){
                    Toast.makeText(getApplicationContext(), "Chapter: 14.5", Toast.LENGTH_SHORT).show();
                    webView.loadUrl("https://www.geeksforgeeks.org/cc-preprocessors/");
                }
            }
        });
        nextInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value_keyzz==144){
                    Intent intent = new Intent(Internet_std_library.this, SubTopicsBriefingActivity.class);
                    intent.putExtra("internet_no", 145);
                    startActivity(intent);
                }
                if(value_keyzz==145){
                    Toast.makeText(getApplicationContext(), "Chapter: 14.4", Toast.LENGTH_SHORT).show();
                    webView.loadUrl("https://www.geeksforgeeks.org/c-library-functions/");
                }
                if(value_keyzz==146){
                    Toast.makeText(getApplicationContext(), "Congrats!\nYou've Reached the End of this Tutorials.\nTry solving Problems using Algorithm and C-Programs", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}