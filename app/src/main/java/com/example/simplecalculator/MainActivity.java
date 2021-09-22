package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private EditText editTextNumber2;
    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = Integer.parseInt(editTextNumber.getText().toString()) + Integer.parseInt(editTextNumber2.getText().toString());
                textView.setText("जोड़ परिणाम = "+sum);
                Toast.makeText(MainActivity.this, "आप जोड़ रहे है", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = Integer.parseInt(editTextNumber.getText().toString()) - Integer.parseInt(editTextNumber2.getText().toString());
                textView.setText("घटा परिणाम = "+sum);
                Toast.makeText(MainActivity.this, "आप घटा रहे है", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = Integer.parseInt(editTextNumber.getText().toString()) * Integer.parseInt(editTextNumber2.getText().toString());
                textView.setText("गुणा परिणाम = "+sum);
                Toast.makeText(MainActivity.this, "आप गुणा कर रहे है", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float sum = Integer.parseInt(editTextNumber.getText().toString()) / Integer.parseInt(editTextNumber2.getText().toString());
                textView.setText("विभाजन परिणाम = "+sum);
                Toast.makeText(MainActivity.this, "आप विभाजन कर रहे है", Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextNumber.getText().clear();
                editTextNumber2.getText().clear();
                textView.setText("");
                Toast.makeText(MainActivity.this, "सब साफ हो गया", Toast.LENGTH_SHORT).show();
            }
        });

    }
}