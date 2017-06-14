package cn.ffb.adapter.list;

/**
 * itemviewprovider的选择器
 *
 * 判断entity或者position的item provider是否是当前的provider
 *
 * Created by lingfei on 2017/5/20.
 */
public interface IItemViewProviderSelector<T> {
    boolean isForProvider(int position, T entity);
}
