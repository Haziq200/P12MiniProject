package sg.edu.rp.dmsd.p12miniproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Spinner spnWebsite;
    WebView wvPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnWebsite = findViewById(R.id.spinnerWebsite);
        wvPage = findViewById(R.id.webView);
        wvPage.setWebViewClient(new WebViewClient());



        spnWebsite.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        String url = "https://www.google.com";
                        wvPage.loadUrl(url);
                    break;
                    case 1:

                    String url1 = "https://www.rp.edu.sg/";
                    wvPage.loadUrl(url1);
                    break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
