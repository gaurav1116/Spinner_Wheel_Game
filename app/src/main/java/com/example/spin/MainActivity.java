package com.example.spin;

import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
        //initializing buttons,textview,imageview used in design

        Button btnSpin;
        ImageView wheelImage;
        EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mapping buttons,textviews using id in xml file
        btnSpin = findViewById(R.id.spin);
        wheelImage = findViewById(R.id.image);
        input = findViewById(R.id.point);

        //Using onlicklistener to get trigger from button for spinning the wheel

        btnSpin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                //Initializing variable and taking input from edittext and passing it into Switch case key
                String finalValue = input.getText().toString();
                int value = Integer.parseInt(finalValue);

                switch (value)
                {
                    //casees for every part of wheel and its angle conditions for exact pointing
                    //Spin Wheel image is divided in 10 parts of 36 degree and angles in Rotate Animation
                    //parameters are given according to 36 degree gaps between one another

                    case 0:
                        RotateAnimation zero = new RotateAnimation(0, 702,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        zero.setFillAfter(true);
                        zero.setDuration(2000);
                        zero.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(zero);
                        break;


                    case 1:
                        RotateAnimation one = new RotateAnimation(0, 666,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        one.setFillAfter(true);
                        one.setDuration(2000);          //Spinning wheel is set to rotate for 2sec
                        one.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(one);
                        break;

                    case 2:
                        RotateAnimation two = new RotateAnimation(0, 630,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        two.setFillAfter(true);
                        two.setDuration(2000);
                        two.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(two);
                    case 3:
                        RotateAnimation three = new RotateAnimation(0, 594,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        three.setFillAfter(true);
                        three.setDuration(2000);
                        three.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(three);
                        break;

                    case 4:
                        RotateAnimation four = new RotateAnimation(0, 558,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        four.setFillAfter(true);
                        four.setDuration(2000);
                        four.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(four);
                        break;

                    case 5:
                        RotateAnimation five = new RotateAnimation(0, 522,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        five.setFillAfter(true);
                        five.setDuration(2000);
                        five.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(five);
                        break;

                    case 6:
                        RotateAnimation six = new RotateAnimation(0, 486,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        six.setFillAfter(true);
                        six.setDuration(2000);
                        six.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(six);
                        break;

                    case 7:
                        RotateAnimation seven = new RotateAnimation(0, 450,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        seven.setFillAfter(true);
                        seven.setDuration(2000);
                        seven.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(seven);
                        break;

                    case 8:
                        RotateAnimation eight = new RotateAnimation(0, 414,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        eight.setFillAfter(true);
                        eight.setDuration(2000);
                        eight.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(eight);
                        break;

                    case 9:
                        RotateAnimation nine = new RotateAnimation(0, 378,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                        nine.setFillAfter(true);
                        nine.setDuration(2000);
                        nine.setInterpolator(new DecelerateInterpolator());

                        wheelImage.startAnimation(nine);
                        break;

                    default:

                        break;

                }


            }

        });

    }

}