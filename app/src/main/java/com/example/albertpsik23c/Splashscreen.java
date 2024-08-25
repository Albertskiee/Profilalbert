package com.example.albertpsik23c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splashscreen extends AppCompatActivity {
    // Membuat timer 3 detik
    private static final int SPLASH_TIMER = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen); // Pastikan nama layout sesuai dengan XML yang Anda gunakan

        // Menyesuaikan padding sesuai dengan inset sistem  status bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return WindowInsetsCompat.CONSUMED;
        });

        // Handler untuk mengatur splash screen selama 3 detik
        new Handler().postDelayed(() -> {
            // Setelah splash screen habis, lanjut ke Main activity
            Intent intent = new Intent(Splashscreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIMER);
    }
}
