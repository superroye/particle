package com.substance.particle.training.base;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by Roye on 2016/4/9.
 */
public class AmahUtils {

    public static void loadBackground(String url, final View backgroundView) {
        ImageLoader.getInstance().loadImage(url, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {

            }

            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {

            }

            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                backgroundView.setBackgroundDrawable(new BitmapDrawable(bitmap));
            }

            @Override
            public void onLoadingCancelled(String s, View view) {

            }
        });
    }

    public static Object copyObject(Object source) {
        Object target = null;
        try {
            Class<?> clazz = source.getClass();
            Constructor<?> construtctor = clazz.getConstructor();
            target = construtctor.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            Field field = null;
            for (int i = 0; i < fields.length; i++) {
                field = fields[i];
                field.set(target, field.get(source));
            }
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return target;
    }
}
