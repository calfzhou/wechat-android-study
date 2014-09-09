package com.tencent.mm.ui.bindlinkedin;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.modelfriend.bi;
import com.tencent.mm.sdk.platformtools.z;

final class al
  implements AdapterView.OnItemClickListener
{
  al(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "onItemClick position:%d,", arrayOfObject);
    if (ListLinkedInFriendUI.f(this.jjM) != null)
    {
      int i = paramInt - ListLinkedInFriendUI.g(this.jjM).getHeaderViewsCount();
      ListLinkedInFriendUI.a(this.jjM, (bi)ListLinkedInFriendUI.f(this.jjM).getItem(i));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.al
 * JD-Core Version:    0.6.2
 */