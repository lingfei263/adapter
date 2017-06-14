package cn.ffb.adapter.core;

/**
 * itemview的选择器
 *
 * 判断entity或者position的item是否是当前的itemview
 *
 * Created by lingfei on 2017/5/20.
 */
public interface IItemViewSelector<T> {
    boolean isForItemView(T itemView);
}
