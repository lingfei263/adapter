package cn.ffb.adapter.list;

import android.widget.BaseAdapter;

import cn.ffb.adapter.core.ItemView;

/**
 * 必须使用key注册的provider
 *
 * @param <T>
 */
public abstract class ItemViewProvider1<T> extends ItemView<BaseAdapter>
    implements
        IItemViewProvider<T> {

}
