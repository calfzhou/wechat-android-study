package com.tencent.mm.compatible.g;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
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
import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class n
{
  private static int dOU = -1;
  private static int dOV = -1;
  private static int dOW = -1;
  private static int dOX = -1;

  public static final int Q(Context paramContext)
  {
    if (!V(paramContext))
      return ak.aHj().getInt("com.tencent.mm.compatible.util.keybord.height", 690);
    int i = ak.aHj().getInt("com.tencent.mm.compatible.util.keybord.height", a.fromDPToPix(paramContext, 230));
    dOU = i;
    return i;
  }

  public static final int R(Context paramContext)
  {
    if (dOU > 0)
      return dOU;
    return Q(paramContext);
  }

  public static final int U(Context paramContext)
  {
    return c(paramContext, -1);
  }

  private static final boolean V(Context paramContext)
  {
    if (paramContext == null)
      paramContext = ak.getContext();
    return paramContext != null;
  }

  public static boolean W(Context paramContext)
  {
    int[] arrayOfInt = X(paramContext);
    if (arrayOfInt[0] < arrayOfInt[1]);
    for (int i = 1; i == 1; i = 2)
      return true;
    return false;
  }

  private static int[] X(Context paramContext)
  {
    if (paramContext == null);
    for (Context localContext = ak.getContext(); ; localContext = paramContext)
    {
      int[] arrayOfInt = new int[2];
      if ((localContext instanceof Activity))
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((Activity)localContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        arrayOfInt[0] = localDisplayMetrics.widthPixels;
        arrayOfInt[1] = localDisplayMetrics.heightPixels;
        return arrayOfInt;
      }
      Display localDisplay = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = localDisplay.getWidth();
      arrayOfInt[1] = localDisplay.getHeight();
      return arrayOfInt;
    }
  }

  public static final boolean b(Context paramContext, int paramInt)
  {
    if (dOU == paramInt)
      return true;
    if (!V(paramContext))
      return false;
    if (paramInt < 0)
      return false;
    dOU = paramInt;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!32@/B4Tb64lLpKpI+tgWEEQMW53kLRAnwLT", "save keybord: %d", arrayOfObject);
    return ak.aHj().edit().putInt("com.tencent.mm.compatible.util.keybord.height", paramInt).commit();
  }

  public static final int c(Context paramContext, int paramInt)
  {
    int i;
    if (dOX > 0)
    {
      i = dOX;
      if (W(paramContext))
        break label79;
      i = (int)(i / 1.5D);
      int k = X(paramContext)[0];
      if (i > k / 2)
        i = k / 2;
    }
    label79: 
    do
    {
      return i;
      if (!V(paramContext))
      {
        i = 3 * dOX;
        break;
      }
      i = a.fromDPToPix(paramContext, 230);
      dOX = i;
      break;
      if (paramInt <= 0)
        paramInt = R(paramContext);
      int j;
      if (dOW > 0)
        j = dOW;
      while (paramInt > j)
      {
        return j;
        if (!V(paramContext))
        {
          j = 1140;
        }
        else
        {
          j = a.fromDPToPix(paramContext, 380);
          dOW = j;
        }
      }
    }
    while (paramInt < i);
    return paramInt;
  }

  @TargetApi(11)
  public static final void g(Activity paramActivity)
  {
    if (paramActivity == null);
    int i;
    TypedValue localTypedValue;
    do
    {
      return;
      Rect localRect = new Rect();
      paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      i = localRect.top;
      localTypedValue = new TypedValue();
      if (Build.VERSION.SDK_INT < 11)
        break;
    }
    while (paramActivity.getActionBar() == null);
    int j = paramActivity.getActionBar().getHeight();
    while (true)
    {
      dOV = paramActivity.getResources().getDisplayMetrics().heightPixels - j - i;
      return;
      boolean bool = paramActivity.getTheme().resolveAttribute(16843499, localTypedValue, true);
      j = 0;
      if (bool)
        j = TypedValue.complexToDimensionPixelSize(localTypedValue.data, paramActivity.getResources().getDisplayMetrics());
    }
  }

  public static final int nO()
  {
    return dOV;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.n
 * JD-Core Version:    0.6.2
 */