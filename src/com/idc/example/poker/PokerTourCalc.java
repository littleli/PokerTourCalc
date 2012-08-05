package com.idc.example.poker;

import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class PokerTourCalc extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/demo1.html");
    }
}
