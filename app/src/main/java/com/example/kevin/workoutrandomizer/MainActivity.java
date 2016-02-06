package com.example.kevin.workoutrandomizer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.*;
import java.math.*;
import android.widget.*;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myMessage";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creating the layout and setting its properties
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.rgb(0, 100, 0));

        //The TExt Box and its properties
        final TextView workOuts = new TextView(this);
        workOuts.setTextColor(Color.WHITE);
        workOuts.setText("");

        //Text Box 2
        final TextView workOuts2 = new TextView(this);
        workOuts2.setTextColor(Color.WHITE);
        workOuts2.setText("");

        //Text Box 3
        final TextView workOuts3 = new TextView(this);
        workOuts3.setTextColor(Color.WHITE);
        workOuts3.setText("");

        //Creating Button and its properties
        Button mainButton = new Button(this);
        mainButton.setBackgroundColor(Color.WHITE);
        mainButton.setTextColor(Color.rgb(0,100,0));
        mainButton.setText("Arms");


        //Creating the abbs button
        Button abbsButton = new Button(this);
        abbsButton.setBackgroundColor(Color.WHITE);
        abbsButton.setTextColor(Color.rgb(0, 100, 0));
        abbsButton.setText("Abs");



        mainButton.setId(R.id.button_one);
        abbsButton.setId(R.id.button_two);
        workOuts.setId(R.id.text_view_one);
        workOuts2.setId(R.id.text_view_two);
        workOuts3.setId(R.id.text_view_three);


        Button imaginaryButton = new Button(this);
        imaginaryButton.setBackgroundColor(Color.rgb(0, 100, 0));
        imaginaryButton.setVisibility(View.INVISIBLE);
        imaginaryButton.setId(R.id.button_three);
        //imaginary button
        RelativeLayout.LayoutParams imaginarySpotLocal = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        imaginarySpotLocal.addRule(RelativeLayout.BELOW, workOuts.getId());
        imaginarySpotLocal.addRule(RelativeLayout.CENTER_HORIZONTAL);
        imaginarySpotLocal.setMargins(50,0,50,0);


        //Arms Button Location
        RelativeLayout.LayoutParams mainButtonLocal = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        mainButtonLocal.addRule(RelativeLayout.BELOW, workOuts.getId());
        mainButtonLocal.addRule(RelativeLayout.ALIGN_RIGHT, imaginaryButton.getId());
        mainButtonLocal.setMargins(0,100,100,0);

        //Abbs Button Location
        RelativeLayout.LayoutParams abbsButtonLocal = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        abbsButtonLocal.addRule(RelativeLayout.BELOW, workOuts.getId());
        abbsButtonLocal.addRule(RelativeLayout.ALIGN_LEFT, imaginaryButton.getId());
        abbsButtonLocal.setMargins(100,100,0,0);

        //Text Box Location
        RelativeLayout.LayoutParams workOutsLocal = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        workOutsLocal.addRule(RelativeLayout.CENTER_HORIZONTAL);
        workOutsLocal.addRule(RelativeLayout.CENTER_VERTICAL);

        //text Box 2 Location
        RelativeLayout.LayoutParams workOuts2Local = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        workOuts2Local.addRule(RelativeLayout.CENTER_HORIZONTAL);
        workOuts2Local.addRule(RelativeLayout.ABOVE, workOuts.getId());
        workOuts2Local.setMargins(0, 0, 0, 50);

        //Text Box 3 Location
        RelativeLayout.LayoutParams workOuts3Local = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        workOuts3Local.addRule(RelativeLayout.CENTER_HORIZONTAL);
        workOuts3Local.addRule(RelativeLayout.ABOVE, workOuts2.getId());
        workOuts3Local.setMargins(0, 0, 0, 50);


        //Adds widgets to layout
        myLayout.addView(mainButton, mainButtonLocal);
        myLayout.addView(workOuts, workOutsLocal);
        myLayout.addView(workOuts2, workOuts2Local);
        myLayout.addView(workOuts3, workOuts3Local);
        myLayout.addView(abbsButton, abbsButtonLocal);
        myLayout.addView(imaginaryButton, imaginarySpotLocal);

        //Sets the layout we want to see
        setContentView(myLayout);


        //Event Listener For button press
        mainButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        String[] arms = {"30 Pushups","10,10,10,10","8 Wolf Ups", "2 Sleds","10 HandStand Push Ups", "20 Dips", "Plance with Feet Supported","3,2,1 Push up count"};

                        int chooser = (int)(Math.random()*arms.length);
                        workOuts.setText(arms[chooser]);
                        chooser = (int)(Math.random()*arms.length);
                        workOuts2.setText(arms[chooser]);
                        chooser = (int)(Math.random()*arms.length);
                        workOuts3.setText(arms[chooser]);

                    }
                }
        );

        abbsButton.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick(View v){
                            String[] abbs = {"30 hollow rocks","10,20,30,40,50,60","20 V-Ups", "Pyrimid from 10","2 min Plank hold", "3 sets of 10 sec Flutter kicks and scissors", "30 Side arches with side plank"};

                            int chooser = (int)(Math.random()*abbs.length);
                            workOuts.setText(abbs[chooser]);
                            chooser = (int)(Math.random()*abbs.length);
                            workOuts2.setText(abbs[chooser]);
                            chooser = (int)(Math.random()*abbs.length);
                            workOuts3.setText(abbs[chooser]);
                        }

                    });
    }



    @Override
    protected void onStart() {
        super.onStart();
    }



    @Override
    protected void onResume(){
        super.onResume();
    }
}
