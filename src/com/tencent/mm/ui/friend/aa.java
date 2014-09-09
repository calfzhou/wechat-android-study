package com.tencent.mm.ui.friend;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.ei;

final class aa
  implements AdapterView.OnItemLongClickListener
{
  aa(FMessageConversationUI paramFMessageConversationUI, ei paramei)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < FMessageConversationUI.a(this.jIq).getHeaderViewsCount())
    {
      z.w("!44@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9aK8589UnHWs=", "on header view long click, ignore");
      return true;
    }
    this.ekT.a(paramView, paramInt, paramLong, this.jIq, FMessageConversationUI.c(this.jIq));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.aa
 * JD-Core Version:    0.6.2
 */