package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent intent5 =getIntent();
        String name = intent5.getStringExtra("name");
        String quantity1 = intent5.getStringExtra("quantity");
        TextView mark=findViewById(R.id.mark);
        TextView congratulations=findViewById(R.id.congratulations);
        Button retry=findViewById(R.id.retry);
        Button finsh=findViewById(R.id.finsh);
        mark.setText(quantity1+"/5");
        congratulations.setText("Congratulations "+name+"!");

        retry.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity7.this, MainActivity2.class);

                intent6.putExtra("quantity",quantity1);
                intent6.putExtra("name",name);
                startActivity(intent6);
                finish();
            }
        });

        finsh.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}