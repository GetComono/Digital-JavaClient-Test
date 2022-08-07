package io.comono.comonojavalibrary;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        // Declaring variables and assigning values
        String hosturl = "https://ecocomonoreact.azurewebsites.net/customer-details?";

        // Still declaring variables and assigning data values received from MainActivity
        String param1 = getIntent().getStringExtra("workitemId");
        String param2 = getIntent().getStringExtra("customerName");
        String param3 = getIntent().getStringExtra("customerEmail");
        String param4 = getIntent().getStringExtra("branchCode");
        String param5 = getIntent().getStringExtra("segmentId");
        String param6 = getIntent().getStringExtra("houseNumber");
        String param7 = getIntent().getStringExtra("streetName");
        String param8 = getIntent().getStringExtra("areaName");
        String param9 = getIntent().getStringExtra("landmark");
        String param10 = getIntent().getStringExtra("state");
        String param11 = getIntent().getStringExtra("lga");
        String param12 = getIntent().getStringExtra("createdBy");
        String param13 = getIntent().getStringExtra("customerImage");
        String param14 = getIntent().getStringExtra("Latitude");
        String param15 = getIntent().getStringExtra("Longitude");

        // Concatenating data values as strings to become a single URL
        String postparams = hosturl + "workitemId=" + param1 + "&customerName=" + param2 + "&customerEmail=" + param3 + "&branchCode=" + param4 + "&segmentId=" + param5 + "&houseNumber=" + param6 + "&streetName=" + param7 + "&areaName=" + param8 + "&landmark=" + param9 + "&state=" + param10 + "&lga=" + param11 + "&createdBy=" + param12 + "&customerImage=" + param13 + "&Latitude=" + param14 + "&Longitude=" + param15;

        //Calling WebView function
        WebView w = findViewById(R.id.web_view);
        w.setWebViewClient(new WebViewClient());

        WebSettings webSettings = w.getSettings();
        webSettings.setJavaScriptEnabled(true);

        w.canGoForward();
        w.canGoBack();

        w.loadUrl(postparams);
    }
}