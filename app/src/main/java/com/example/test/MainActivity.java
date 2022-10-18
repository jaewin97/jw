package com.example.test;

import static java.lang.Double.sum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private static final String ACTIVITY_TAG = "ch4_4_MainActivity";
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.ACTIVITY_TAG, "This is Verbose.");
        Log.d(MainActivity.ACTIVITY_TAG, "This is Debug.");
        Log.i(MainActivity.ACTIVITY_TAG, "This is Information");
        Log.w(MainActivity.ACTIVITY_TAG, "This is Warnning.");
        Log.e(MainActivity.ACTIVITY_TAG, "This is Error.");
        System.out.println("This is println");
        TextView tv=findViewById(R.id.textview);
        tv.setText(String.valueOf(sum(100)));
        }
        public int sum(int n) {
                int s = 0;
                int i = 1;
                while (i <= n) {
                        s += i;
                        i++;
                        }
                System.out.println("1到n累加的和为：" + s);
                return  s;
                }

}
