package com.example.tito.temperatureconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.inputValue);
    }

    public void onClick(View view){
        RadioButton celsiusButton = findViewById(R.id.radio0);
        RadioButton fahrenheitButton = findViewById(R.id.radio1);
        RadioButton guaraniesButton = findViewById(R.id.radio2);

        if (text.getText().length() == 0) {
            Toast.makeText(this, "Please enter a valid number",
                    Toast.LENGTH_LONG).show();
            return;
        }

        float inputValue = Float.parseFloat(text.getText().toString());
        if (celsiusButton.isChecked()) {
            text.setText(String
                    .valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
        } else if (fahrenheitButton.isChecked()) {
            text.setText(String
                    .valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
        } else if (guaraniesButton.isChecked()){
            text.setText(String
                    .valueOf(ConverterUtil.convertGuaraniesToDolars(inputValue)));
        } else {
            text.setText(String
                    .valueOf(ConverterUtil.convertDolarsToGuaranies(inputValue)));
        }


    }

}
