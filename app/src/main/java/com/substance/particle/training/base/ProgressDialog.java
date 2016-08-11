package com.substance.particle.training.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.ouj.library.util.ToastUtils;
import com.substance.particle.R;

public class ProgressDialog extends Dialog {

    TextView msg;
    String completeTips = "已完成";

    public ProgressDialog(Context context) {
        this(context, R.layout.common_update_loading);
    }

    public ProgressDialog(Context context, int resId) {
        super(context);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(context).inflate(resId, null, false);
        setContentView(view);
        msg = (TextView) view.findViewById(R.id.msg);
        setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                if (!TextUtils.isEmpty(completeTips)) {
                    ToastUtils.showToast(completeTips);
                }
            }
        });
    }

    public ProgressDialog setCompleteTips(String str) {
        this.completeTips = str;
        return this;
    }

    public ProgressDialog setLoadingMsg(String str) {
        msg.setText(str);
        return this;
    }

    public void showProgressText(String textFormat, int progress) {
        msg.setText(String.format(textFormat, progress));

        if (progress >= 100) {
            dismiss();
        }
    }
}