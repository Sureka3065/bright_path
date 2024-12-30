package com.example.codingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cprogram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cprogram);
        TextView topic1 = findViewById(R.id.ctopic1);
        TextView topic2 = findViewById(R.id.ctopic2);
        TextView topic3 = findViewById(R.id.ctopic3);
        TextView topic4 = findViewById(R.id.ctopic4);
        TextView topic5 = findViewById(R.id.ctopic5);
        TextView topic6 = findViewById(R.id.ctopic6);
        TextView topic7 = findViewById(R.id.ctopic7);
        TextView topic8 = findViewById(R.id.ctopic8);
        TextView notes = findViewById(R.id.cnotes);

        topic1.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=dTp0c41XnrQ"));
        topic2.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=WK5qChJFPDs"));
        topic3.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=YiPoFeWrSYY"));
        topic4.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=2wZIEij1eDk"));
        topic5.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=y1Q8VfgDX4c"));
        topic6.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=fBjnrtwVZG0"));
        topic7.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=9cX5wJq3LXE"));
        topic8.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=7Fz7JSvlr9g"));
        notes.setOnClickListener(view -> openUrl("https://www.vssut.ac.in/lecture_notes/lecture1424354156.pdf"));
    }

    // Method to open a URL in the browser
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
