package com.example.helloworldandroidapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(Color.rgb(225,255,102));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Drawable image1 = (Drawable)getResources().getDrawable(R.drawable.fall);
                findViewById(R.id.rootView).setBackground(image1);
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView3)).setText("Android is Awesome!");
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                //reset text color, background and text.

                Drawable image = (Drawable)getResources().getDrawable(R.drawable.winter);
                ((TextView) findViewById(R.id.textView3)).setTextColor(Color.rgb(175,32,32));
                findViewById(R.id.rootView).setBackground(image);
                ((TextView) findViewById(R.id.textView3)).setText("Hello from Winter!");



            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //grab user input, change text to update
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from Winter!");

                } else {
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from " + newText);

                }


            }
        });
    }
}
