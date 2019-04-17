package demo.test.myseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageView.isClickable()){
                    imageView.setBackgroundResource(R.drawable.back_rec_blue);
                }else {
                    imageView.setBackgroundResource(R.drawable.back_rec_white);
                }
            }
        });
//        SeekBar seek = findViewById(R.id.seek);
//        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//                Log.d(TAG, "onProgressChanged: --------");
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//                seekBar.setThumb(getResources().getDrawable(R.drawable.circle2));
//                Log.d(TAG, "onStartTrackingTouch: --------");
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//                seekBar.setThumb(getResources().getDrawable(R.drawable.circle1));
//                Log.d(TAG, "onStopTrackingTouch: --------");
//            }
//        });
    }
}
