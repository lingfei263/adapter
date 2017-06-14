package cn.ffb.adapter.expand;
/**
 * Created by lingfei on 2017/5/12.
 */

public interface IChildItemViewProviderKeyPolicy<G, C> {
  int getItemViewProviderKey(int groupPosition, G groupEntity, int childPosition, C childEntity);
}
