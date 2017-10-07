package com.muzinda.switchexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.simpleSwitch)Switch simpleSwitch1;
    @BindView(R2.id.simpleSwitch2)Switch simpleSwitch2;
    @BindView(R2.id.submitButton) Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        submit();

    }

    @OnClick(R.id.submitButton) void submit(){
        String statusSwitchOne, statusSwitchTwo;
        if(simpleSwitch1.isChecked())
            statusSwitchOne = simpleSwitch1.getTextOn().toString();
        else statusSwitchOne = simpleSwitch1.getTextOff().toString();
        if(simpleSwitch2.isChecked())
            statusSwitchTwo = simpleSwitch2.getTextOn().toString();
        else statusSwitchTwo = simpleSwitch2.getTextOff().toString();

        //Display the current state of switches
        Toast.makeText(this, "Switch1: " + statusSwitchOne + "\n" + "Switch2: " + statusSwitchTwo, Toast.LENGTH_SHORT).show();
    }
}
