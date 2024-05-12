package com.example.pdd;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView nameTV;
    CheckBox checkBoxCB;
    TextView textTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTV = findViewById(R.id.nameTV);
        checkBoxCB = findViewById(R.id.checkBoxCB);
        textTV = findViewById(R.id.textTV);

        checkBoxCB.setOnClickListener(v -> {
            if (checkBoxCB.isChecked()){
                nameTV.setText("Правила дорожного движения");
                textTV.setText(R.string.rules);
            } else {
                nameTV.setText("Информация");
                textTV.setText("");
            }
        });
    }
}