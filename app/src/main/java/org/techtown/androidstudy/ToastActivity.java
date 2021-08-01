package org.techtown.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastView = Toast.makeText(getApplicationContext(),"토스트 메세지",Toast.LENGTH_LONG);
                toastView.setGravity(Gravity.TOP|Gravity.LEFT, 400, 1000);      // 토스트 메세지 위치 설정
                toastView.show();
            }
        });
    }
}