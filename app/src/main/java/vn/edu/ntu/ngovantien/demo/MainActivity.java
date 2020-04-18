package vn.edu.ntu.ngovantien.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("demo","onCreate called");
        txtTG=findViewById(R.id.txtTG);
        SimpleDateFormat   spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("demo","onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("demo","onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("demo","onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("demo","onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("demo","onDestroy called");
    }
}
