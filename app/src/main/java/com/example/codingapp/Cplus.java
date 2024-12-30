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

public class Cplus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cplus);
        TextView topic1 = findViewById(R.id.cptopic1);
        TextView topic2 = findViewById(R.id.cptopic2);
        TextView topic3 = findViewById(R.id.cptopic3);
        TextView topic4 = findViewById(R.id.cptopic4);
        TextView topic5 = findViewById(R.id.cptopic5);
        TextView topic6 = findViewById(R.id.cptopic6);
        TextView notes = findViewById(R.id.cppnotes);

        topic1.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=McojvctVsUs"));
        topic2.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=zgutFVxOlTY"));
        topic3.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=kfZEZj1IOBE"));
        topic4.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=ASVB8KAFypk"));
        topic5.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=WpsLyYmYPbg"));
        topic6.setOnClickListener(view -> openUrl("https://www.youtube.com/watch?v=lfT5qAAZyfU"));
        notes.setOnClickListener(view -> openUrl("https://www.cet.edu.in/noticefiles/285_OOPS%20lecture%20notes%20Complete.pdf"));
    }

    // Method to open a URL in the browser
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
