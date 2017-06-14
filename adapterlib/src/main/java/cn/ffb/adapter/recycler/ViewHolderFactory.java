package cn.ffb.adapter.recycler;

import android.view.View;

/**
 * Created by lingfei on 2017/5/12.
 */

public interface ViewHolderFactory<T extends ViewHolder> {

    T createViewHolder(View itemView, int viewType);

}
