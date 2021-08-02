package org.techtown.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_intent);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent를 통해 다른 액티비티와 데이터 교환
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
                //startActivity(intent);

                /*
                Intent intent = new Intent();
                ComponentName name = new ComponentName("org.techtown.MyAndroidStudy", "org.techtown.androidstudy.CallIntentActivity");
                intent.setComponent(name);
                startActivityForResult(intent, 101);
                 */
            }
        });
    }
}