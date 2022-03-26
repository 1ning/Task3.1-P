package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    boolean a;
    int choice;
    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView welcome=findViewById(R.id.welcome);
        Button button=findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Intent intent =getIntent();
        String name = intent.getStringExtra("name");
        welcome.setText("welcome "+name);
        button.setOnClickListener( new View.OnClickListener()
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
                button.setBackground(getResources().getDrawable(R.drawable.button_ture));
                switch (choice) {
                    case 1:
                        quantity++;
                        break;
                    case 2:
                        button2.setBackground(getResources().getDrawable(R.drawable.button_flase));

                        break;
                    case 3:
                        button3.setBackground(getResources().getDrawable(R.drawable.button_flase));
                        break;
                }
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                String quantity1 = String.valueOf(quantity);
                intent1.putExtra("quantity", quantity1);
                intent1.putExtra("name", name);
                startActivity(intent1);
                finish();
            }
        }
        }) ;
    }
}