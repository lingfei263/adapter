package cn.ffb.adapter.expand;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IGroupItemViewProviderSelector<T> {
    boolean isForProvider(int position, T entity);
}
