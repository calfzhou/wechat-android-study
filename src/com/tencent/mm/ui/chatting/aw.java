package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.tencent.mm.aq.a;
import com.tencent.mm.q.h;
import java.util.Iterator;
import java.util.List;

public final class aw
{
  private static DisplayMetrics jnw = null;

  public static ax a(Context paramContext, TextPaint paramTextPaint, List paramList, int paramInt)
  {
    ax localax = new ax();
    if (jnw == null)
      jnw = paramContext.getResources().getDisplayMetrics();
    DisplayMetrics localDisplayMetrics = jnw;
    Iterator localIterator = paramList.iterator();
    float f1 = 0.0F;
    float f2;
    if (localIterator.hasNext())
    {
      f2 = paramTextPaint.measureText(((h)localIterator.next()).name);
      if (f1 >= f2)
        break label224;
    }
    while (true)
    {
      f1 = f2;
      break;
      int i = (int)f1 + 2 * a.fromDPToPix(paramContext, 30);
      int j = a.fromDPToPix(paramContext, 95);
      if (i < j);
      while (true)
      {
        if (paramInt - j / 2 < 0)
        {
          localax.jnx = 0;
          localax.jny = (localDisplayMetrics.widthPixels - (j + 0));
          return localax;
        }
        if (localDisplayMetrics.widthPixels - (paramInt + j / 2) < 0)
        {
          localax.jnx = (localDisplayMetrics.widthPixels - (j + 0));
          localax.jny = 0;
          return localax;
        }
        localax.jnx = (paramInt - j / 2);
        localax.jny = (localDisplayMetrics.widthPixels - (paramInt + j / 2));
        return localax;
        j = i;
      }
      label224: f2 = f1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.aw
 * JD-Core Version:    0.6.2
 */