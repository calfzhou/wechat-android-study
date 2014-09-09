package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.ImageView;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.HashMap;

final class aq
  implements Runnable
{
  private int eSi;
  private int fkq;
  private String[] hLN;
  private String hLO;
  private String url;

  private aq(ag paramag)
  {
  }

  private Bitmap wi(String paramString)
  {
    Bitmap localBitmap1;
    if (paramString == null)
      localBitmap1 = null;
    while (true)
    {
      return localBitmap1;
      if ((this.eSi <= 0) || (this.fkq <= 0))
        return s.jA(paramString);
      String str = paramString + "_" + this.fkq + "_" + this.eSi;
      localBitmap1 = s.h(str, this.fkq, this.eSi);
      if (localBitmap1 == null)
      {
        int i = f.iM(paramString);
        if ((90 == i) || (270 == i));
        for (localBitmap1 = i.a(paramString, this.fkq, this.eSi, true); localBitmap1 != null; localBitmap1 = i.a(paramString, this.eSi, this.fkq, true))
        {
          Bitmap localBitmap2 = i.a(localBitmap1, i);
          try
          {
            i.a(localBitmap2, 100, Bitmap.CompressFormat.PNG, str, false);
            return localBitmap2;
          }
          catch (IOException localIOException)
          {
            return localBitmap2;
          }
        }
      }
    }
  }

  public final void run()
  {
    if (ag.f(this.hLE))
    {
      z.w("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "on load image jog, isQuit, return");
      return;
    }
    synchronized (ag.g(this.hLE))
    {
      if (ag.c(this.hLE).get(this.hLO) == null)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.hLO;
        z.w("!32@/B4Tb64lLpI8lfBMGe0Uu+gqtVk/eA4D", "check before decode, no match wait to render view, renderKey is %s, return", arrayOfObject);
        return;
      }
    }
    String[] arrayOfString = this.hLN;
    Bitmap localBitmap1 = null;
    int i;
    if (arrayOfString != null)
      i = 0;
    while (true)
    {
      label142: Bitmap localBitmap2;
      if (i < this.hLN.length)
      {
        if (i == 0)
        {
          localBitmap1 = wi(this.hLN[0]);
          if (localBitmap1 == null)
            break label421;
          ag.b(this.hLE).put(this.hLO, localBitmap1);
        }
      }
      else
      {
        if ((localBitmap1 == null) && (!ch.jb(this.url)))
        {
          localBitmap1 = s.a(this.hLE.b(this.hLO, this.url, this.fkq, this.eSi));
          if (localBitmap1 != null)
            ag.b(this.hLE).put(this.hLO, localBitmap1);
        }
        localBitmap2 = localBitmap1;
        if (localBitmap2 == null);
      }
      synchronized (ag.g(this.hLE))
      {
        ImageView localImageView = (ImageView)ag.c(this.hLE).get(this.hLO);
        if (localImageView != null)
        {
          ag.d(this.hLE).remove(localImageView);
          au localau = (au)ag.a(this.hLE).aFa();
          au.a(localau, localImageView);
          au.a(localau, localBitmap2);
          ag.e(this.hLE).post(localau);
        }
        ag.c(this.hLE).remove(this.hLO);
        ag.h(this.hLE).s(this);
        return;
        String str = ag.e(this.hLN[i], this.url, this.fkq, this.eSi);
        localBitmap1 = (Bitmap)ag.b(this.hLE).get(str);
        if (localBitmap1 == null)
          localBitmap1 = wi(this.hLN[i]);
        if (localBitmap1 != null)
        {
          ag.b(this.hLE).put(str, localBitmap1);
          break label142;
        }
        label421: i++;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.aq
 * JD-Core Version:    0.6.2
 */