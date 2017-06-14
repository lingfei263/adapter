package cn.ffb.adapter.list;

import cn.ffb.adapter.core.ViewHolder;

/**
 * Created by lingfei on 2017/5/12.
 */

public interface IItemViewProvider<T> {

    /**
     * 获取视图id
     *
     * @return
     */
    int getItemViewLayoutId();

    /**
     * 组装View
     *
     * @param viewHolder
     * @param position
     * @param entity
     */
    void setupView(ViewHolder viewHolder, int position, T entity);


}
