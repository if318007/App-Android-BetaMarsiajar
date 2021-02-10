package stud11318007.develops.betamarsiajar;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.hokagelab.www.yodu.R;

public class MainActivity extends AppCompatActivity {
    private CardView alpha, angka, bentuk, hewan, buah, warna, membaca, menghitung, lagu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        alpha = (CardView) findViewById(R.id.alphabet);
        angka = (CardView) findViewById(R.id.angka);
        bentuk = (CardView) findViewById(R.id.bentuk);
        hewan = (CardView) findViewById(R.id.hewan);
        buah = (CardView) findViewById(R.id.buah);
        warna = (CardView) findViewById(R.id.warna);
        membaca = (CardView) findViewById(R.id.membaca);
        menghitung = (CardView) findViewById(R.id.menghitung);
        lagu = (CardView) findViewById (R.id.lagu);

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, alphabet.class));
            }
        });

        angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, angka.class));
            }
        });

        bentuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, bentuk.class));
            }
        });

        hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, hewan.class));
            }
        });

        buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, buah.class));
            }
        });

        warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, warna.class));
            }
        });

        membaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, membaca.class));
            }
        });

        menghitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, menghitung.class));
            }
        });

        lagu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, lagu.class));
            }
        });

        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, About.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
