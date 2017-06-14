package cn.ffb.adapter.recycler;

/**
 * Created by lingfei on 2017/5/12.
 */

public interface IItemViewProviderKeyPolicy<T> {
    int getItemViewProviderKey(int position, T entity);
}
