package com.roi.snow.util;

import android.content.Context;
import android.content.Intent;

import com.roi.snow.MainActivity;
import com.roi.snow.MovieActivity;

/**
 * Created by imac27 on 16. 7. 31..
 */
public class NavigationUtil {
    public static void gotoMovie(Context context) {
        Intent intent = new Intent(context, MovieActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static void gotoMain(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}