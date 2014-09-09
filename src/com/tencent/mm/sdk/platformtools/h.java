package com.tencent.mm.sdk.platformtools;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class h
{
  public static void a(ListView paramListView)
  {
    if (paramListView == null);
    do
    {
      return;
      if (Build.VERSION.SDK_INT < 8)
        break;
      new cp();
      if (paramListView.getFirstVisiblePosition() > 10)
        paramListView.setSelection(10);
    }
    while (Build.VERSION.SDK_INT < 8);
    paramListView.smoothScrollToPosition(0);
    return;
    new co();
    paramListView.setSelection(0);
  }

  public static void a(ListView paramListView, int paramInt)
  {
    if (paramListView == null);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 8)
        break;
      new cp();
      int i = paramListView.getFirstVisiblePosition();
      if ((i > paramInt) && (i - paramInt > 10))
        paramListView.setSelection(paramInt + 10);
      while (Build.VERSION.SDK_INT >= 8)
      {
        paramListView.smoothScrollToPosition(paramInt);
        return;
        if ((i < paramInt) && (paramInt - i > 10))
          paramListView.setSelection(paramInt - 10);
      }
    }
    new co();
    paramListView.setSelection(paramInt);
  }

  public static void b(ListView paramListView, int paramInt)
  {
    if (paramListView == null);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 11)
        break;
      new cp();
      int i = paramListView.getFirstVisiblePosition();
      if ((i < paramInt) && (i + 10 < paramInt))
        paramListView.setSelectionFromTop(paramInt - 10, 0);
      while (Build.VERSION.SDK_INT >= 11)
      {
        paramListView.smoothScrollToPositionFromTop(paramInt, 0);
        return;
        if ((i > paramInt) && (i - 10 > paramInt))
          paramListView.setSelectionFromTop(paramInt + 10, 0);
      }
    }
    new co();
    paramListView.setSelectionFromTop(paramInt, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.h
 * JD-Core Version:    0.6.2
 */