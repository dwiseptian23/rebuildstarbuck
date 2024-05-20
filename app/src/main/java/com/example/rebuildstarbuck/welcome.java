package com.example.rebuildstarbuck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rebuildstarbuck.R;
import com.example.rebuildstarbuck.login;
import com.example.rebuildstarbuck.singup;

public class welcome extends AppCompatActivity {
    private ImageButton loginButton;
    private ImageView createAccountButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        loginButton = findViewById(R.id.loginf2);
        createAccountButton = findViewById(R.id.createaccf2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcome.this, login.class);
                startActivity(intent);
            }
        });
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(welcome.this, singup.class);
                startActivity(intent);
            }
        });
    }
}
