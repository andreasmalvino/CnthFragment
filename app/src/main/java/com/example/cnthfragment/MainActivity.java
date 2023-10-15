package com.example.cnthfragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tambahkan Fragment1 ke aktivitas
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Fragment1())
                .commit();
    }
}
