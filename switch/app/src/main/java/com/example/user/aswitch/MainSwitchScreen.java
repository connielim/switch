package com.example.user.aswitch;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class MainSwitchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_switch_screen);
        Switch tempSwitch = (Switch) findViewById(R.id.switch1);
        final RelativeLayout mainSwitchScreen = (RelativeLayout) findViewById(R.id.mainScreen);
        tempSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                changeBackground(mainSwitchScreen);
            }
        });
    }


    public void changeBackground(View view){
        Switch tempSwitch = (Switch) findViewById(R.id.switch1);
        Resources res = getResources();
        Drawable backgroundimg;
        if(tempSwitch.isChecked()){
            backgroundimg = res.getDrawable(R.drawable.light_off);
        }
        else{
            backgroundimg = res.getDrawable(R.drawable.light_on);
        }
        setBackgroundImg(backgroundimg);
    }

    private void setBackgroundImg(Drawable src){
        RelativeLayout mainSwitchScreen = (RelativeLayout) findViewById(R.id.mainScreen);
        mainSwitchScreen.setBackground(src);
    }
}
