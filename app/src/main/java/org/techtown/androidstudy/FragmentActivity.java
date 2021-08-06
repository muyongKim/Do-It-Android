package org.techtown.androidstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity {
    MainFragment mainFragment;
    MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        menuFragment = new MenuFragment();
    }

    public void onFragmentChanged(int index) {
        if (index == 0 ){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        } else if (index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
        }
    }
}