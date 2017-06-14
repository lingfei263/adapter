package cn.ffb.adapter.expand;

import cn.ffb.adapter.core.ViewHolder;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IChildItemViewProvider<G, C> {

  /**
   * 获取视图id
   *
   * @return
   */
  int getItemViewLayoutId();

  /**
   * 组装View
   *
   * @param viewHolder
   * @param groupPosition
   * @param groupEntity
   * @param childPosition
   * @param childEntity
   */
  void setupView(ViewHolder viewHolder, int groupPosition, G groupEntity, int childPosition,
                 C childEntity);


}
