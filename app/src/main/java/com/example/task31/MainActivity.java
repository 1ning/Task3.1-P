package com.example.task31;

import static android.content.Intent.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    String name1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name=findViewById(R.id.name);
        Button submit1=findViewById(R.id.submit1);
        submit1.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View view)
         {
             name1=name.getText().toString();
             Intent intent=new Intent(MainActivity.this, MainActivity2.class);
             intent.putExtra("name",name1);
             startActivity(intent);
             finish();
         }
        }) ;

    }
}