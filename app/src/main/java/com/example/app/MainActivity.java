package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputDecimal1;
    private EditText inputDecimal2;
    private TextView outputDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDecimal1 = findViewById(R.id.inputDecimal1);
        inputDecimal2 = findViewById(R.id.inputDecimal2);
        outputDecimal = findViewById(R.id.outputDecimal);
    }

    public void plusButton(View view) {
        try {
            float sum = Float.parseFloat(String.valueOf(inputDecimal1.getText())) +
                    Float.parseFloat(String.valueOf(inputDecimal2.getText()));
            StringBuilder sb = new StringBuilder(String.valueOf(sum));
            outputDecimal.setText(sb);
        } catch (Exception e) {
            outputDecimal.setText("Odottamaton virhe");
        }
    }

    public void minusButton(View view) {
        try {
            float sum = Float.parseFloat(String.valueOf(inputDecimal1.getText())) -
                    Float.parseFloat(String.valueOf(inputDecimal2.getText()));
            StringBuilder sb = new StringBuilder(String.valueOf(sum));
            outputDecimal.setText(sb);
        } catch (Exception e) {
            outputDecimal.setText("Odottamaton virhe");
        }
    }

    public void multiplyButton(View view) {
            try {
                float sum = Float.parseFloat(String.valueOf(inputDecimal1.getText())) *
                        Float.parseFloat(String.valueOf(inputDecimal2.getText()));
                StringBuilder sb = new StringBuilder(String.valueOf(sum));
                outputDecimal.setText(sb);
            } catch (Exception e) {
                outputDecimal.setText("Odottamaton virhe");
            }
    }

    public void divideButton(View view) {
                try {
                    if(Float.parseFloat(String.valueOf(inputDecimal2.getText()))==0) {
                        outputDecimal.setText("Nollalla jako");
                    } else {
                        float sum = Float.parseFloat(String.valueOf(inputDecimal1.getText())) /
                                Float.parseFloat(String.valueOf(inputDecimal2.getText()));
                        StringBuilder sb = new StringBuilder(String.valueOf(sum));
                        outputDecimal.setText(sb);
                    }
                } catch (Exception e) {
                    outputDecimal.setText("Odottamaton virhe");
                }
    }
}