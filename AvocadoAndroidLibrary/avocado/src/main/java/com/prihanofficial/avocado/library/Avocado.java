package com.prihanofficial.avocado.library;


import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.prihanofficial.avocado.R;

/**
 * Created by Prihan Nimsara on 6/21/2017.
 **/

public final class Avocado {
    private static Context avocadoContext;
    private static Avocado avocado;
    private static String avocadoText;
    private static String avocadoTime;
    private static String avocadoLayoutName;

    public static Avocado setContext(Context context) {
        avocadoContext = context.getApplicationContext();
        if (avocado == null) {
            avocado = new Avocado();
        }
        return avocado;
    }

    public static Avocado setText(String text){
          avocadoText =text;
        return avocado;
    }

    public static Avocado setTime(String time){
        avocadoTime = time;
        return avocado;
    }

    public static Avocado setCustomeLayout(String layoutName){
        avocadoLayoutName = layoutName;
        return avocado;
    }

    public void showAvocado(){

        Avocado.makeToast(avocadoContext,avocadoText,avocadoTime);
    }

    private static void makeToast(Context context, String text, String time){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();

    }
}
