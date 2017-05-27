package pl.org.progress.financeweek;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

import java.util.ArrayList;
import java.util.List;

public class Partnerzy extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    GestureDetectorCompat gestureDetector;
    private TextView textView;
    public List<Integer> glowni = new ArrayList<>();
    public List<Integer> medialni = new ArrayList<>();
    public List<Integer> balonowy = new ArrayList<>();
    public List<Integer> honorowi = new ArrayList<>();
    public List<Integer> merytoryczni = new ArrayList<>();
    public List<Integer> wspierajacy = new ArrayList<>();
    public List<List> partnerzy = new ArrayList<>();
    public ImageView i1;
    Animation animation;
    int b =0;
    public List<String> s = new ArrayList<>();
    int i = 0;
    boolean a = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partnerzy);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);
        textView = (TextView) findViewById(R.id.textView5);
        i1 = (ImageView) findViewById(R.id.image2);

        glowni.add(R.drawable.logo_bzwbk2);
        glowni.add(R.drawable.nordea);

        balonowy.add(R.drawable.bnpparibas);

        honorowi.add(R.drawable.marszalek);
        honorowi.add(R.drawable.prezydent);
        honorowi.add(R.drawable.logo_ul_h_pl_rgb_apla);
        honorowi.add(R.drawable.logo_eksoc);
        honorowi.add(R.drawable.logo_wz_ul_h_pl_rgb_apla);
        honorowi.add(R.drawable.fundacja);

        medialni.add(R.drawable.dlastudentapllogo);
        medialni.add(R.drawable.ksiegowosc);
        medialni.add(R.drawable.kwf);
        medialni.add(R.drawable.logo_mlodzi_w_lodzi);
        medialni.add(R.drawable.logozak);
        medialni.add(R.drawable.magiel);
        medialni.add(R.drawable.outsourcing_portal);
        medialni.add(R.drawable.plaster);
        medialni.add(R.drawable.rachunkowosc);
        medialni.add(R.drawable.studentniews);

        merytoryczni.add(R.drawable.csk);
        merytoryczni.add(R.drawable.philips);
        merytoryczni.add(R.drawable.twoj_start_up);

        wspierajacy.add(R.drawable.difin);
        wspierajacy.add(R.drawable.edukey);
        wspierajacy.add(R.drawable.onepress);
        wspierajacy.add(R.drawable.supermemo);
        wspierajacy.add(R.drawable.wydawnictwo);
        wspierajacy.add(R.drawable.preston);

        partnerzy.add(glowni);
        partnerzy.add(balonowy);
        partnerzy.add(honorowi);
        partnerzy.add(medialni);
        partnerzy.add(merytoryczni);
        partnerzy.add(wspierajacy);
        s.add("Partnerzy główni: ");
        s.add("Partnerem balonowego deszczu jest: ");
        s.add("Partnerzy honorowi:");
        s.add("Partnerzy medialni: ");
        s.add("Partnerzy merytoryczni: ");
        s.add("Partnerzy wspierający: ");
        animation = AnimationUtils.loadAnimation(this, R.anim.partnerzy);
        anim(partnerzy.get(i));
    }

public void next(View view){
  b++;
        anim(partnerzy.get(i));
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }


    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        if (-63.7 > distanceX) {
            i++;
            if (i > s.size() - 1) {
                i = s.size() - 1;
            } else if (i < 0) {
                i = 0;
            } else {
                b=-1;
                textView.setText(s.get(i));


            }

        } else if(distanceX > 63.7){
            i--;
            if (i > s.size() - 1) {
                i = s.size() - 1;
            } else if (i < 0) {
                i = 0;
            } else {
                b=-1;
                textView.setText(s.get(i));


            }
        }

        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }


    void anim(List<Integer> list){
if(b==list.size()){
    b=0;
}
        for (;b<=list.size();) {
            i1.setImageResource(list.get(b));
        i1.startAnimation(animation);
            break;


        }



    }


}


