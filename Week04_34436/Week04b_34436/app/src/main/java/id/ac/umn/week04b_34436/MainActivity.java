package id.ac.umn.week04b_34436;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonChange1, buttonChange2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChange1 = findViewById(R.id.main_button_change_1);
        buttonChange2 = findViewById(R.id.main_button_change_2);

        buttonChange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, secondActivity.class);
                startActivity(intent2);
            }
        });

        buttonChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, ThirdActivity .class);
                startActivity(intent3);
            }
        });
    }
}