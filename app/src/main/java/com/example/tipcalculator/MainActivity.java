package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // this is where the functionality for you app goes
    // we are declaring an object to manipulate
    TextView tipTotalTextView;
    TextView totalTextView;
    EditText billTotalEditText;
    Button percentButton10;
    Button percentButton15;
    Button percentButton20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the object is being set to an object on the layout
        tipTotalTextView = (TextView) findViewById(R.id.tipTotalTextView);
        // modifying the object
        // tipTotalTextView.setText("Why, hello there!");

        totalTextView = (TextView) findViewById(R.id.totalTextView);

        billTotalEditText = (EditText) findViewById(R.id.billTotalEditText);

        percentButton10 = (Button) findViewById(R.id.percentButton10);
        percentButton15 = (Button) findViewById(R.id.percentButton15);
        percentButton20 = (Button) findViewById(R.id.percentButton20);

        // on-click listener gives the functionality to respond to user actions
        percentButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // much more efficient way of using code
                calcTheTip(.1);

                /*
                // get the number of the EditText
                Double billTotal = Double.valueOf(billTotalEditText.getText().toString());

                // determine the tip
                Double tipTotal = billTotal * 0.1;

                // display the tip
                tipTotalTextView.setText("Tip - $" + tipTotal.toString());

                // display the total
                Double total = billTotal + tipTotal;

                totalTextView.setText("Total - $" + total.toString());

                 */
            }
        });

        // on-click listener gives the functionality to respond to user actions
        percentButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTheTip(.15);

                /*
                // get the number of the EditText
                Double billTotal = Double.valueOf(billTotalEditText.getText().toString());

                // determine the tip
                Double tipTotal = billTotal * 0.15;

                // display the tip
                tipTotalTextView.setText("Tip - $" + tipTotal.toString());

                // display the total
                Double total = billTotal + tipTotal;

                totalTextView.setText("Total - $" + total.toString());

                 */
            }
        });

        // on-click listener gives the functionality to respond to user actions
        percentButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTheTip(.2);

                /*
                // get the number of the EditText
                Double billTotal = Double.valueOf(billTotalEditText.getText().toString());

                // determine the tip
                Double tipTotal = billTotal * 0.2;

                // display the tip
                tipTotalTextView.setText("Tip - $" + tipTotal.toString());

                // display the total
                Double total = billTotal + tipTotal;

                totalTextView.setText("Total - $" + total.toString());

                 */
            }
        });
    }

    // we are creating a function that will calculate the tip percentage by having
    // the percentage passed in as an argument
    // this is part of the coding philosophy of not repeating yourself
    void calcTheTip(Double tipPercentage) {
        // get the number of the EditText
        Double billTotal = Double.valueOf(billTotalEditText.getText().toString());

        // determine the tip
        Double tipTotal = billTotal * tipPercentage;

        // display the tip
        // this is how we get better accuracy when calculating doubles
        String.format("%.2f", tipTotal);
        tipTotalTextView.setText("Tip - $" + String.format("%.2f", tipTotal));

        // display the total
        Double total = billTotal + tipTotal;

        totalTextView.setText("Total - $" + String.format("%.2f", tipTotal));

    }
}