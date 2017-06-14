package cn.ffb.adapter.recycler;

import android.view.View;


/**
 * Created by lingfei on 2017/5/12.
 */

public class ViewHolderFactoryImpl implements ViewHolderFactory<ViewHolder> {

    @Override
    public ViewHolder createViewHolder(View itemView, int viewType) {
        return new ViewHolder(itemView);
    }

}
