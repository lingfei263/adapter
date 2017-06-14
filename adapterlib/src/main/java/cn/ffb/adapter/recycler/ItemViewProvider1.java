package cn.ffb.adapter.recycler;

import android.support.v7.widget.RecyclerView;

import cn.ffb.adapter.core.ItemView;

/**
 * Created by lingfei on 2017/5/12.
 */
public class ItemViewProvider1<T> extends ItemView<RecyclerView.Adapter<ViewHolder>>
        implements
        IItemViewProvider<T> {

    @Override
    public int getItemViewLayoutId() {
        return 0;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position, T entity) {

    }
}
