package com.tencent.mm.ui.chatting;

import android.annotation.TargetApi;
import android.widget.ListView;

@TargetApi(11)
public final class md
{
  public static void a(ListView paramListView, int paramInt1, int paramInt2)
  {
    if (paramListView == null)
      return;
    paramListView.setItemChecked(paramInt1, true);
    paramListView.setSelectionFromTop(paramInt1, paramInt2);
  }

  public static void c(ListView paramListView, int paramInt)
  {
    if (paramListView == null)
      return;
    paramListView.setItemChecked(paramInt, true);
    paramListView.setSelection(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.md
 * JD-Core Version:    0.6.2
 */