package cn.ffb.adapter.list;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IItemViewProviderKeyPolicy<T> {
    int getItemViewProviderKey(int position, T entity);
}
