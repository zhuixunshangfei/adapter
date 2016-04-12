package com.pacific.adapter;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.View;

final public class RecyclerAdapterHelper extends BaseAdapterHelper<RecyclerAdapterHelper> {

    protected ViewHolder viewHolder;

    private RecyclerAdapterHelper(ViewHolder viewHolder) {
        this.viewHolder = viewHolder;
        this.views = new SparseArray<>();
    }

    static RecyclerAdapterHelper get(ViewHolder viewHolder) {
        RecyclerAdapterHelper helper;
        if (viewHolder.itemView.getTag() == null) {
            helper = new RecyclerAdapterHelper(viewHolder);
            viewHolder.itemView.setTag(helper);
        } else {
            helper = (RecyclerAdapterHelper) viewHolder.itemView.getTag();
        }
        return helper;
    }

    @Override
    public View getItemView() {
        return viewHolder.itemView;
    }

    public int getItemViewType() {
        return viewHolder.getItemViewType();
    }

    public int getAdapterPosition() {
        return viewHolder.getAdapterPosition();
    }

    public int getLayoutPosition() {
        return viewHolder.getLayoutPosition();
    }

    public int getOldPosition() {
        return viewHolder.getOldPosition();
    }

    public boolean isRecyclable() {
        return viewHolder.isRecyclable();
    }

    public RecyclerAdapterHelper setIsRecyclable(boolean recyclable) {
        viewHolder.setIsRecyclable(recyclable);
        return this;
    }
}
