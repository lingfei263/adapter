package cn.ffb.adapter.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lingfei on 2017/5/12.
 */

public class ViewHolderFactoryImpl implements ViewHolderFactory<ViewHolder> {

    @Override
    public ViewHolder createViewHolder(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        return ViewHolder.get(context, convertView, parent, layoutId, position);
    }

}
