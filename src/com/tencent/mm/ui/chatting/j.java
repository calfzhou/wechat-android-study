package com.tencent.mm.ui.chatting;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

final class j
  implements AbsListView.OnScrollListener
{
  j(AppAttachFileListUI paramAppAttachFileListUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (!AppAttachFileListUI.b(this.jlM)) && (AppAttachFileListUI.c(this.jlM)) && (paramAbsListView.getLastVisiblePosition() == AppAttachFileListUI.d(this.jlM).getCount()))
    {
      z.d("!44@/B4Tb64lLpKndQxFPEClvZ8VNQkxuaR5yXnPRtm8QDc=", "need to add item");
      int i = AppAttachFileListUI.a(this.jlM).size();
      k localk = new k(this.jlM, (byte)0);
      Integer[] arrayOfInteger = new Integer[2];
      arrayOfInteger[0] = Integer.valueOf(i);
      arrayOfInteger[1] = Integer.valueOf(20);
      localk.execute(arrayOfInteger);
      AppAttachFileListUI.e(this.jlM);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j
 * JD-Core Version:    0.6.2
 */