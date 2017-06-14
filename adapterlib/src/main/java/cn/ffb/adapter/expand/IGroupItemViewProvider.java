package cn.ffb.adapter.expand;

import cn.ffb.adapter.core.ViewHolder;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IGroupItemViewProvider<T> {

    /**
     * 组装View
     *
     * @param viewHolder
     * @param position
     * @param entity
     */
    void setupView(ViewHolder viewHolder, int position, T entity, boolean isExpanded);


    int getItemViewLayoutId();
}
