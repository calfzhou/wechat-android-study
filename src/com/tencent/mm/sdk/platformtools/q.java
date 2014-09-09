package com.tencent.mm.sdk.platformtools;

import android.os.Build.VERSION;
import android.view.View;

public final class q
{
  public static void J(View paramView)
  {
    if (paramView == null);
    do
    {
      do
        return;
      while (Build.VERSION.SDK_INT < 11);
      new u();
    }
    while (paramView.getLayerType() == 1);
    paramView.setLayerType(1, null);
  }

  public static void d(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == null);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 11)
      {
        new u();
        if ((paramInt1 >= 2048) || (paramInt2 >= 2048));
        for (int i = 1; paramView.getLayerType() != i; i = 2)
        {
          paramView.setLayerType(i, null);
          return;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.q
 * JD-Core Version:    0.6.2
 */