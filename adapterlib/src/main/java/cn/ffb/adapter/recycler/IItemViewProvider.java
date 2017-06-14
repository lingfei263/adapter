package cn.ffb.adapter.recycler;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IItemViewProvider<T> {

    int getItemViewLayoutId();

    /**
     * 组装View
     *
     * @param viewHolder
     * @param position
     * @param entity
     */
    void onBindViewHolder(ViewHolder viewHolder, int position, T entity);


}
