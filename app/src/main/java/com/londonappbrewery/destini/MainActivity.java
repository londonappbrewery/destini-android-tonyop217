package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView storyTextView;
    private Button ans1TextView;
    private Button ans2TextView;
    private int index = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        ans1TextView = (Button) findViewById(R.id.buttonTop);
        ans2TextView = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        ans1TextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkAnswer(1);

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        ans2TextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                checkAnswer(2);
            }
        });

    }

    private void checkAnswer(int ans) {
        if (index == 1 && ans == 1 || index == 2 && ans == 1) {
            storyTextView.setText(R.string.T3_Story);
            ans1TextView.setText(R.string.T3_Ans1);
            ans2TextView.setText(R.string.T3_Ans2);
            index = 3;
        } else if (index == 1 && ans == 2){
            storyTextView.setText(R.string.T2_Story);
            ans1TextView.setText(R.string.T2_Ans1);
            ans2TextView.setText(R.string.T2_Ans2);
            index = 2;
        } else if (index == 2 && ans == 2) {
            storyTextView.setText(R.string.T4_End);
            ans1TextView.setVisibility(View.GONE);
            ans2TextView.setVisibility(View.GONE);
        } else if (index == 3 && ans == 1){
            storyTextView.setText(R.string.T6_End);
            ans1TextView.setVisibility(View.GONE);
            ans2TextView.setVisibility(View.GONE);
        } else if (index == 3 && ans == 2) {
            storyTextView.setText(R.string.T5_End);
            ans1TextView.setVisibility(View.GONE);
            ans2TextView.setVisibility(View.GONE);
        }
    }
}
