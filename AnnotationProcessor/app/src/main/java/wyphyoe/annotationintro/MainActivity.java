package wyphyoe.annotationintro;

import android.os.Bundle;
import android.view.View;

import com.example.annotation.Activity;

import androidx.appcompat.app.AppCompatActivity;

@Activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGoNext(View view) {
        final int id = 1;
        final String name = "John";
        startActivity(IntentFactory.newIntentForSecondActivity(MainActivity.this,id,name));
    }
}
