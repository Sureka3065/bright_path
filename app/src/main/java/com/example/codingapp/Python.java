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

public class Python extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_python);
        TextView topic1 = findViewById(R.id.pytopic1);
        TextView topic2 = findViewById(R.id.pytopic2);
        TextView topic3 = findViewById(R.id.pytopic3);
        TextView topic4 = findViewById(R.id.pytopic4);
        TextView topic5 = findViewById(R.id.pytopic5);
        TextView topic6 = findViewById(R.id.pytopic6);
        TextView topic7 = findViewById(R.id.pytopic7);
        TextView topic8 = findViewById(R.id.pytopic8);
        TextView notes = findViewById(R.id.pynotes);

        topic1.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=xkZMUX_oQX4"));
        topic2.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=WbPf4MCIo_U"));
        topic6.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=Pm9FOpOwhlA"));
        topic3.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=5QlCw1_N6xk"));
        topic7.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=to_s1R14RNQ"));
        topic4.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=Dpnf8goamGY"));
        topic5.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=BVfCWuca9nw"));
        topic8.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=6a39OjkCN5I"));
        notes.setOnClickListener(view -> openUrl("https://mrcet.com/downloads/digital_notes/CSE/III%20Year/PYTHON%20PROGRAMMING%20NOTES.pdf"));

    }

    // Method to open a URL in the browser
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}