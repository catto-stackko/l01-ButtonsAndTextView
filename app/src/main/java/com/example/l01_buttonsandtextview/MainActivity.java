package com.example.l01_buttonsandtextview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button shakeButton;
    TextView titleDisplay;
    TextView responseDisplay;
    int rand = 0;
    String response = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shakeButton = findViewById(R.id.shake_button);
        titleDisplay = findViewById(R.id.ball_textview);
        responseDisplay = findViewById(R.id.response_textview);
        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rand = (int) (Math.random() * 20 + 1);

                switch(rand) {
                    case 1: response = "it is certain"; break;
                    case 2: response = "it is decidedly so"; break;
                    case 3: response = "without a doubt"; break;
                    case 4: response = "yes, definitely"; break;
                    case 5: response = "you may rely on it"; break;
                    case 6: response = "as I see it, yes"; break;
                    case 7: response = "most likely"; break;
                    case 8: response = "outlook good"; break;
                    case 9: response = "yes"; break;
                    case 10: response = "signs point to yes"; break;
                    case 11: response = "reply hazy, try again"; break;
                    case 12: response = "ask again later"; break;
                    case 13: response = "better not tell you now"; break;
                    case 14: response = "cannot predict you"; break;
                    case 15: response = "concentrate and ask again"; break;
                    case 16: response = "don't count on it"; break;
                    case 17: response = "my reply is no"; break;
                    case 18: response = "my sources say no"; break;
                    case 19: response = "outlook not so good"; break;
                    case 20: response = "very doubtful"; break;
                }

                System.out.println("The Magic 8 Ball tells you " + response);
                Log.i("The Magic 8 Ball tells you ", ""+ response);
                responseDisplay.setText("The Magic 8 Ball tells you "+ response);
            }
        } );
    }
}