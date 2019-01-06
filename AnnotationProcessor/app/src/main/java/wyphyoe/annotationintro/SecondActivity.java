package wyphyoe.annotationintro;

import android.os.Bundle;
import android.widget.TextView;

import com.example.annotation.Activity;
import com.example.annotation.Param;

import androidx.appcompat.app.AppCompatActivity;

@Activity
public class SecondActivity extends AppCompatActivity {

    private static final String BUNDLE_ID = "extra_key";
    private static final String BUNDLE_NAME = "extra_name";

    @Param(key = BUNDLE_ID)
    private int id;

    @Param(key = BUNDLE_NAME)
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            id = bundle.getInt(BUNDLE_ID);
            name = bundle.getString(BUNDLE_NAME);
        }

        TextView txvId = findViewById(R.id.txvId);
        txvId.setText(id + "");

        TextView txvName = findViewById(R.id.txvName);
        txvName.setText(name);
    }
}
