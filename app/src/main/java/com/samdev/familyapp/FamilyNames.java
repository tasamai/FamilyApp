package com.samdev.familyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FamilyNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_names);

    }

    public void members() {
        Button firstname = (Button) findViewById(R.id.firstname);
        Button secondname = (Button) findViewById(R.id.secondname);
        Button thirdname = (Button) findViewById(R.id.thirdname);
        Button fourthname = (Button) findViewById(R.id.fourthname);



            firstname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstNameActivity = new Intent(FamilyNames.this, First_Name.class);
                startActivity(firstNameActivity);
            }
        });

        secondname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondNameActivity = new Intent(FamilyNames.this, Second_Name.class);
                startActivity(secondNameActivity);
            }
        });

        thirdname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdNameActivity = new Intent(FamilyNames.this, Third_Name.class);
                startActivity(thirdNameActivity);
            }
        });

        fourthname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourthNameActivity = new Intent(FamilyNames.this, Fourth_Name.class);
                startActivity(fourthNameActivity);
                //thefrd
            }
        });

        }


}
