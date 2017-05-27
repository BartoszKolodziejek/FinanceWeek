package pl.org.progress.financeweek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anim();
    }

    public void anim(){
        Animation start = AnimationUtils.loadAnimation(this, R.anim.start);
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView1 = (TextView) findViewById(R.id.textview4);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        ImageView imageView = (ImageView) findViewById(R.id.plakat);
        textView.startAnimation(start);
        textView1.startAnimation(start);
        textView2.startAnimation(start);
        textView3.startAnimation(start);
        textView4.startAnimation(start);
        imageView.startAnimation(start);


    }
    public void szkolenia(View view){
        Intent intent = new Intent(this, Szkolenia.class);
        startActivity(intent);

    }
    public void prelekcja(View view){
        Intent intent = new Intent(this, Prelekcja.class);
        startActivity(intent);

    }
    public void logowanie(View view){
        Intent intent = new Intent(this, Logowanie.class);
        startActivity(intent);

    }
    public void rejestracja(View view){
        Intent intent = new Intent(this, Rejestracja.class);
        startActivity(intent);

    }
    public void partnerzy (View view){
        Intent intent = new Intent(this, Partnerzy.class);
        startActivity(intent);
    }



}
