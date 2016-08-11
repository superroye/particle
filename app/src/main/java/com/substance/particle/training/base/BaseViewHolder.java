package com.substance.particle.training.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Roye on 2016/3/1.
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder implements View.OnClickListener {

    public T itemValue;
    public int parentPosition = -1;//用于嵌套的RecyclerView场景，保存父元素所在RecyclerView的adapterPosition;

    public BaseViewHolder(View itemView) {
        super(itemView);
        initView();
    }

    public BaseViewHolder(Context context, int layoutId, ViewGroup parent) {
        this(LayoutInflater.from(context).inflate(layoutId, parent, false));
    }

    public abstract void initView();

    public final void bind(T data) {
        itemValue = data;
        toView(data);
    }

    public abstract void toView(T data);

    @Override
    public void onClick(View v) {

    }

    public void onDestroy() {
        itemValue = null;
    }

}
