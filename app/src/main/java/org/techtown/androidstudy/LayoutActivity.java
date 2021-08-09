package org.techtown.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// 21.08.10 layout customizing
public class LayoutActivity extends AppCompatActivity {
    Layout1 layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        layout1 = findViewById(R.id.layout1);
        layout1.setImage(R.drawable.ic_launcher_foreground);
        layout1.setName("김미누");
        layout1.setMobile("010-0000-0000");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setImage(R.drawable.minu);
            }
        });
    }
}