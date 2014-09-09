package com.tencent.mm.ui.d;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public final class a
{
  private static b jJL;
  private static b jJM;

  @TargetApi(11)
  public static void c(Activity paramActivity, View paramView)
  {
    View localView = paramActivity.getWindow().getDecorView();
    jJL = b.cA(paramActivity);
    jJM = b.cA(paramActivity);
    int[] arrayOfInt1 = new int[2];
    paramView.getLocationOnScreen(arrayOfInt1);
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    TypedValue localTypedValue = new TypedValue();
    int j;
    if (Build.VERSION.SDK_INT >= 11)
      j = paramActivity.getActionBar().getHeight();
    while (true)
    {
      int k = arrayOfInt1[1] - i - j;
      jJL.setHeight(k);
      int[] arrayOfInt2 = new int[2];
      if ((paramActivity instanceof Activity))
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((Activity)paramActivity).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        arrayOfInt2[0] = localDisplayMetrics.widthPixels;
        arrayOfInt2[1] = localDisplayMetrics.heightPixels;
      }
      while (true)
      {
        int m = arrayOfInt2[1] - arrayOfInt1[1] - paramView.getHeight();
        jJM.setHeight(m);
        jJL.showAtLocation(localView, 48, 0, j + i);
        jJM.showAtLocation(localView, 80, 0, 0);
        return;
        if (!paramActivity.getTheme().resolveAttribute(16843499, localTypedValue, true))
          break label282;
        j = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
        break;
        Display localDisplay = ((WindowManager)paramActivity.getSystemService("window")).getDefaultDisplay();
        arrayOfInt2[0] = localDisplay.getWidth();
        arrayOfInt2[1] = localDisplay.getHeight();
      }
      label282: j = 0;
    }
  }

  public static void dismiss()
  {
    if (jJL != null)
    {
      jJL.setAnimationStyle(-1);
      jJL.dismiss();
      jJL = null;
    }
    if (jJM != null)
    {
      jJM.setAnimationStyle(-1);
      jJM.dismiss();
      jJM = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d.a
 * JD-Core Version:    0.6.2
 */