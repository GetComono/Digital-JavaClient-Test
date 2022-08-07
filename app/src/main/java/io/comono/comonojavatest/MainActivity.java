package io.comono.comonojavatest;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import io.comono.comonojavalibrary.VerifyActivity;

public class MainActivity extends AppCompatActivity {

    // Declaring button variable
    Button verify_button;

    // Declaring variables and assigning values
    String str1 = "AO-095734358976187628-CO";
    String str2 = "Test Customer";
    String str3 = "boluwatobi@gmail.com";
    String str4 = "007";
    String str5 = "ADB";
    String str6 = "25";
    String str7 = "Pilot Crescent";
    String str8 = "Surulere";
    String str9 = "Shoprite";
    String str10 = "LG";
    String str11 = "694";
    String str12 ="RealMg";
    String str13 = "";
    String str14 = "6.4886218";
    String str15 = "3.3567333";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning value to button variable
        verify_button = (Button)findViewById(R.id.verify_button_id);

        // Declaring button action when clicked using Intent function
        verify_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VerifyActivity.class);

                intent.putExtra("workitemId", str1);
                intent.putExtra("customerName", str2);
                intent.putExtra("customerEmail", str3);
                intent.putExtra("branchCode", str4);
                intent.putExtra("segmentId", str5);
                intent.putExtra("houseNumber", str6);
                intent.putExtra("streetName", str7);
                intent.putExtra("areaName", str8);
                intent.putExtra("landmark", str9);
                intent.putExtra("state", str10);
                intent.putExtra("lga", str11);
                intent.putExtra("createdBy", str12);
                intent.putExtra("customerImage", str13);
                intent.putExtra("Latitude", str14);
                intent.putExtra("Longitude", str15);
                startActivity(intent);
                finish();
            }
        });
    }
}