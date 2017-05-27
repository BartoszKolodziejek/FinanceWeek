package pl.org.progress.financeweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Moje_szkolenia extends AppCompatActivity {
String text;
    TextView textView;
   static long k = -1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moje_szkolenia);
        textView = (TextView) findViewById(R.id.moje);
        text = textView.getText().toString();
    }
    public void mojeSzkolenia(View view){
        TodoDbAdapter t = new TodoDbAdapter(this);
        t.open();
        for (long i = 0; i<=k; i++ ){
            text = text + "\n" +"\n"+ t.getTodo(i+1).getDescription();
            textView.setText(text);
        }
        t.close();
    }
}
