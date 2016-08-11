package com.substance.particle.training.framework.view;

import com.substance.particle.training.base.ViewItemData;

import java.util.List;

/**
 * Created by Roye on 2016/3/1.
 * UI层接口层，在ui层（activity，fragment或者其他UI widget）实现，在presenter层或者其他地方（非UI层）被调用
 */
public interface IView {
    public void renderToRecycleView(List<ViewItemData> items);
}
