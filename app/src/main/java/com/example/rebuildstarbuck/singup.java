package com.example.rebuildstarbuck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rebuildstarbuck.R;
import com.example.rebuildstarbuck.login;

public class singup extends AppCompatActivity{
    private ImageButton signupButton;
    private ImageView loginHereButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        signupButton = findViewById(R.id.singupf4);
        loginHereButton = findViewById(R.id.logheref4);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mulai aktivitas login
                Intent intent = new Intent(singup.this, login.class);
                startActivity(intent);
            }
        });
        loginHereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mulai aktivitas login
                Intent intent = new Intent(singup.this, login.class);
                startActivity(intent);
            }
        });
    }
}
