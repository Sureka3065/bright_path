package com.example.codingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_java);
        TextView topic1 = findViewById(R.id.jtopic1);
        TextView topic2 = findViewById(R.id.jtopic2);
        TextView topic3 = findViewById(R.id.jtopic3);
        TextView topic4 = findViewById(R.id.jtopic4);
        TextView topic5 = findViewById(R.id.jtopic5);
        TextView topic6 = findViewById(R.id.jtopic6);
        TextView notes = findViewById(R.id.javanotes);

        topic1.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=mG4NLNZ37y4"));
        topic2.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=k0ZAkmYxVTQ"));
        topic3.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=emTgM58TLSw"));
        topic4.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=r0SewFmbCUI"));
        topic5.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=IUqKuGNasdM"));
        topic6.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=BqQ0qR8kmw8"));
        notes.setOnClickListener(view -> openUrl("https://mrcet.com/downloads/digital_notes/IT/Java%20Programming.pdf"));
    }

    // Method to open a URL in the browser
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}