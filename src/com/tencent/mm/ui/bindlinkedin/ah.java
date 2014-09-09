package com.tencent.mm.ui.bindlinkedin;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.sdk.platformtools.z;

final class ah
  implements AbsListView.OnScrollListener
{
  ah(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 + paramInt2 >= paramInt3) && (!ListLinkedInFriendUI.a(this.jjM)))
    {
      ListLinkedInFriendUI.b(this.jjM);
      z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "[oneliang][onScroll] want to pull data.");
      if (ListLinkedInFriendUI.c(this.jjM))
      {
        z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "[oneliang][onScroll] has more data.");
        ListLinkedInFriendUI.d(this.jjM);
        ListLinkedInFriendUI.e(this.jjM);
      }
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.ah
 * JD-Core Version:    0.6.2
 */