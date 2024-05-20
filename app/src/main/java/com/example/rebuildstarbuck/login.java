package com.example.rebuildstarbuck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.rebuildstarbuck.R;
import com.example.rebuildstarbuck.beranda;
import com.example.rebuildstarbuck.singup;

public class login extends AppCompatActivity {
    private ImageButton loginButton;
    private ImageView createAccButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.loginf3);
        createAccButton = findViewById(com.example.rebuildstarbuck.R.id.createaccf3);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mulai aktivitas beranda
                Intent intent = new Intent(login.this, beranda.class);
                startActivity(intent);
            }
        });
        createAccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, singup.class);
                startActivity(intent);
            }
        });
    }
}
