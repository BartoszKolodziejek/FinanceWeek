package pl.org.progress.financeweek;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Prelekcja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelekcja);
    }
    public void facebook(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/events/173237046530457/"));
        startActivity(intent);
    }
    public void prelekcjaRejestracja(View view){
        TodoDbAdapter todoDbAdapter = new TodoDbAdapter(this);
        todoDbAdapter.open();
        todoDbAdapter.insertTodo("Prelekcja Zdzislaw Sokal");
        todoDbAdapter.close();
        Moje_szkolenia.k++;
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://fw.progress.org.pl/fwprogress/index.php?details=130"));
        startActivity(intent);
    }
}
