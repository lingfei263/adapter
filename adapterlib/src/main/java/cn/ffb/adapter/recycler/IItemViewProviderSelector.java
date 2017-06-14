package cn.ffb.adapter.recycler;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IItemViewProviderSelector<T> {
    boolean isForProvider(int position, T entity);
}
