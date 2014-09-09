package com.tencent.mm.booter.notification.a;

import android.os.Build.VERSION;
import com.tencent.mm.h;

public final class d
{
  private int djh = -1;

  public static int lK()
  {
    if (Build.VERSION.SDK_INT < 19)
      return h.Xx;
    return h.Xy;
  }

  public final int lJ()
  {
    return this.djh;
  }

  public final int s(String paramString, int paramInt)
  {
    this.djh = lK();
    if ((!l.bR(paramInt)) || (l.cj(paramString)));
    try
    {
      this.djh = h.adn;
      while (true)
      {
        label28: if (this.djh < 0)
          this.djh = lK();
        return this.djh;
        if (l.ck(paramString))
          try
          {
            this.djh = h.adn;
          }
          catch (Exception localException1)
          {
          }
      }
    }
    catch (Exception localException2)
    {
      break label28;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.d
 * JD-Core Version:    0.6.2
 */