package com.inca.administrator.opensourcelibrary.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/12/14.
 */

public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    private static Toast toast;
    public static void showToast(Context context,String text){
        if(toast==null){
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        }else {
            toast.setText(text);
        }
        toast.show();
    }
}
