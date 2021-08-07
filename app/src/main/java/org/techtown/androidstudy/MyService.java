package org.techtown.androidstudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

// 21.08.07 service
public class MyService extends Service {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate 호출됨");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand 호출됨");

        if (intent != null)
            processCommand(intent);

        return super.onStartCommand(intent, flags, startId);
    }

    public void processCommand (Intent intent) {
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");

        Log.d(TAG, "command: " + command + ", name: "+name);

        try {
            Thread.sleep(5000);
        } catch(Exception e) {
            e.printStackTrace();
        }

        Intent showIntent = new Intent(getApplicationContext(), ServiceActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                Intent.FLAG_ACTIVITY_CLEAR_TOP);
        showIntent.putExtra("command", "show");
        showIntent.putExtra("name", name + " from service");
        startActivity(showIntent);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy 호출됨");

        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}