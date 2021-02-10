package stud11318007.develops.betamarsiajar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hokagelab.www.yodu.R;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tentang");

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
