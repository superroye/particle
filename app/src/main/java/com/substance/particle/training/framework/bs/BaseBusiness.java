package com.substance.particle.training.framework.bs;

import android.content.Context;

/**
 * Created by Roye on 2016/4/7.
 *   1 业务逻辑处理类，多模块有共同的业务逻辑部分，会抽取出来作为业务逻辑类
 *   2 一般业务逻辑简单的，无需抽取业务逻辑，直接在presenter层实现
 */
public class BaseBusiness {

    public Context mContext;

    public BaseBusiness(Context context) {
        mContext = context;
    }

    public void onDestroy() {
        mContext = null;
    }
}
