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

public class SignUp extends AppCompatActivity {
    Button signup2;
    TextView loggedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sign_up_activity);

        signup2=findViewById(R.id.btnsignup);
        loggedin=findViewById(R.id.alreadyloggedin);

        signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "Registeration Completed", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignUp.this,SingIn.class);
                startActivity(intent);
            }
        });

        loggedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUp.this,SingIn.class);
                startActivity(intent);
            }
        });
    }
}