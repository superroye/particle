package com.substance.particle.training.framework.presenter;

import android.content.Context;

import com.substance.particle.training.framework.view.IView;

/**
 * Created by Roye on 2016/3/1.
 *  1 presenter层的存在直接目的是隔离UI和model的交互
 *  2 处理UI逻辑和模型（或者业务逻辑）的交互，一般业务逻辑简单的，无需抽取业务逻辑，直接在presenter层实现
 */
public abstract class BasePresenter<V extends IView> {

    protected V mView;
    protected Context mContext;

    public BasePresenter(Context context, V view) {
        mContext = context;
        mView = view;
    }

    public void onDestroy() {
        mView = null;
        mContext = null;
    }

}
