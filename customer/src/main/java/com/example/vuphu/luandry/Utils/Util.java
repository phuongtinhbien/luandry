package com.example.vuphu.luandry.Utils;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {


    public static void showHideCursor(final EditText edt){

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    edt.setFocusable(true);
                    edt.setCursorVisible(true);
            }
        };
        edt.setOnClickListener(clickListener);
        if (edt.hasFocus()){
            edt.setCursorVisible(true);
        }
        else {
            edt.setCursorVisible(false);
        }
    }

    public static boolean isEmptyorNull(String s){
        if (s.isEmpty() || s == null)
            return false;
        return true;
    }

    public static String formatDate (String format, Date date){
        String returnValue = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        returnValue = simpleDateFormat.format(date);
        return returnValue;
    }


}
