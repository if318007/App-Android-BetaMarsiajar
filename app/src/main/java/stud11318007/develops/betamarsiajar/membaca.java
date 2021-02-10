package stud11318007.develops.betamarsiajar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hokagelab.www.yodu.R;


public class membaca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Membaca");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
