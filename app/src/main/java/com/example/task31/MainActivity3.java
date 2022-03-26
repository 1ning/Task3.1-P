package com.example.task31;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    boolean a;
    int choice=0;
    int quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button=findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Intent intent1 =getIntent();
        String name = intent1.getStringExtra("name");
        String quantity1 = intent1.getStringExtra("quantity");
        quantity= Integer.parseInt(quantity1);
        button.setOnClickListener(new View.OnClickListener()
        { @Override
            public void onClick(View view)
            {
                a = true;
                choice=1;
            }
        }) ;

        button2.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            a= false;
            choice=2;
        }
        }) ;

        button3.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View view)
        {
            a=false;
            choice=3;

        }
        }) ;

        button4.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View view) {
            if (choice != 0) {
                button2.setBackground(getResources().getDrawable(R.drawable.button_ture));
                switch (choice) {
                    case 1:
                        button.setBackground(getResources().getDrawable(R.drawable.button_flase));
                        break;
                    case 2:
                        quantity++;
                        break;
                    case 3:
                        button3.setBackground(getResources().getDrawable(R.drawable.button_flase));
                        break;
                }
                Intent intent2 = new Intent(MainActivity3.this, MainActivity4.class);
                String quantity1 = String.valueOf(quantity);
                intent2.putExtra("quantity", quantity1);
                intent2.putExtra("name", name);
                startActivity(intent2);
                finish();
            }
        }
        }) ;
    }
}