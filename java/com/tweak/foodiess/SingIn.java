package com.tweak.foodiess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SingIn extends AppCompatActivity {
    Button signin;
    TextView newU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sing_in);

        newU=findViewById(R.id.newuser);
        signin=findViewById(R.id.btnsignin);

        newU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SingIn.this,SignUp.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SingIn.this, "Successfully Logged In", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SingIn.this,HomePage.class);
                startActivity(intent);
            }
        });

    }
}