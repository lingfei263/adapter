package cn.ffb.adapter.expand;

/**
 * Created by lingfei on 2017/5/12.
 */
public interface IChildItemViewProviderSelector<G, C> {
    boolean isForProvider(int groupPosition, G groupEntity, int childPosition, C childEntity);
}
