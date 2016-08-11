package com.substance.particle.training.base;

import java.io.Serializable;

/**
 * Created by Roye on 2016/3/1.
 */
public class ViewItemData implements Serializable {

    public int key;
    public Object value;

    public ViewItemData(int key, Object value) {
        this.key = key;
        this.value = value;
    }
}
