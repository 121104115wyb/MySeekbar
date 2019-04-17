package demo.test.myseekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.SeekBar;

/**
 * Created by wyb on 2019-04-15.
 * 要指定seekbar的具体高度
 * <demo.test.myseekbar.MySeekBar
 android:layout_width="0dp"
 android:layout_weight="1"
 android:layout_height="20dp">

 </demo.test.myseekbar.MySeekBar>
 */


public class MySeekBar extends FrameLayout {

    public MySeekBar(Context context) {
        super(context);
    }

    public MySeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.custom_seekbar,this);
        SeekBar seekBar = findViewById(R.id.seekbar);
        seekBar.setThumb(getResources().getDrawable(R.drawable.circle1));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                seekBar.setThumb(getResources().getDrawable(R.drawable.circle2));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBar.setThumb(getResources().getDrawable(R.drawable.circle1));
            }
        });
    }

    public MySeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
