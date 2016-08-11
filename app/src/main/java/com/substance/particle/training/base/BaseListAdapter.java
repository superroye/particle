package com.substance.particle.training.base;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roye on 2016/3/7.
 */
public abstract class BaseListAdapter extends RecyclerView.Adapter {

    public List<ViewItemData> mItems = new ArrayList<>();

    public BaseListAdapter(List items) {
        if (items != null) {
            mItems.addAll(items);
        }
    }

    public List getItems() {
        return mItems;
    }

    public void resetItems(List items) {
        resetItems(items, true);
    }

    public void resetItems(List items, boolean notify) {
        if (items != null) {
            List list = new ArrayList<>();
            list.addAll(items);
            mItems = list;
            if(notify) {
                notifyDataSetChanged();
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mItems.get(position).key;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof BaseViewHolder) {
            ((BaseViewHolder) holder).bind(mItems.get(position).value);
        }
    }

    @Override
    public int getItemCount() {
        return mItems == null ? 0 : mItems.size();
    }

}
