package pl.org.progress.financeweek;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OSzkoleniach extends AppCompatActivity {
    List<String> list;
    List<String> nazwa;

    int i;
    TextView textView;

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    list = new ArrayList<>();
        nazwa = new ArrayList<>();
        textView = (TextView) findViewById(R.id.textView);
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=119");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=120");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=122");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=123");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=124");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=125");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=127");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=126");
        list.add("http://fw.progress.org.pl/fwprogress/index.php?details=128");
        list.add("http://www.fw.progress.org.pl/");
        nazwa.add("The future of Finance: Robots, Artificial Intelligence and other topics");
        nazwa.add("Anatomia funduszy inwestycyjnych");
        nazwa.add("Sankcje – przyczyny i wpływ na gospodarkę");
        nazwa.add("Zapraszamy do udziału w warsztacie Assessment Centre!");
        nazwa.add("Umowy na warsztacie – czyli umowa o pracę, umowa zlecenia i umowa o dzieło w praktyce");
        nazwa.add("Administracja funduszami inwestycyjnymi w praktyce!");
        nazwa.add("Płatności międzynarodowe w teorii i praktyce");
        nazwa.add("Praca agenta trasnferowego - transakcje sprzedaży i zakupu funduszy inwestycyjnych");
        nazwa.add("Formy organizacji firmy w Polsce");
        nazwa.add("Balonowy Deszcz Nagród z firmą BNP PARIBAS SECURITIES SERVICES");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oszkoleniach);


    }
    public void pdf (View view){

        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("Szkolenia.PDF").load();
        pdfView.enableSwipe(true);
        pdfView.enableAntialiasing(true);
        pdfView.enableRenderDuringScale(true);
      pdfView.fitToWidth();

    }
    public void rejeracja(View view){


        TodoDbAdapter todoDbAdapter = new TodoDbAdapter(this);
        todoDbAdapter.open();

        i = pdfView.getCurrentPage();
        todoDbAdapter.insertTodo(nazwa.get(i));
        todoDbAdapter.close();
Moje_szkolenia.k++;
        Intent intent = new Intent(this, Rejestracja_na_szkolenia.class);
        Rejestracja_na_szkolenia.s = list.get(i);
        startActivity(intent);

    }

}
