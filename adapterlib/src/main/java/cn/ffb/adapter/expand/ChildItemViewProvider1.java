package cn.ffb.adapter.expand;

import android.widget.BaseExpandableListAdapter;

import cn.ffb.adapter.core.ItemView;
/**
 * Created by lingfei on 2017/5/12.
 */
public abstract class ChildItemViewProvider1<G, C> extends ItemView<BaseExpandableListAdapter>
    implements
        IChildItemViewProvider<G, C> {}
