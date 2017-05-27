package pl.org.progress.financeweek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Szkolenia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szkolenia);
    }

    public void oszkoleniach(View view) {
        Intent intent = new Intent(this, OSzkoleniach.class);
        startActivity(intent);
}
    public void rejestracja(View view) {
        Intent intent = new Intent(this, Rejestracja_na_szkolenia.class);
        startActivity(intent);
    }
    public void moje(View view) {
        Intent intent = new Intent(this, Moje_szkolenia.class);
        startActivity(intent);
    }
}