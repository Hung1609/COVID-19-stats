package com.hfad.something;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AffectedCountry extends AppCompatActivity {
    EditText edtSearch;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affected_country);
        edtSearch = findViewById(R.id.edtSearch);
        listView = findViewById(R.id.listView);

        };
    }
