package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

 enum u
{
  private static DisplayMetrics dLA = null;
  private Map dUQ = new HashMap();
  private Map dUS = new HashMap();
  private bp dUT = null;
  private bp dUU = null;

  static
  {
    u[] arrayOfu = new u[1];
    arrayOfu[0] = dUP;
    dUV = arrayOfu;
  }

  private u()
  {
  }

  private void b(q paramq, Bitmap paramBitmap)
  {
    Assert.assertTrue("picture strategy here must be validity", s.c(paramq));
    String str = paramq.DB();
    if (this.dUS.containsKey(str));
    for (Bitmap localBitmap = (Bitmap)((WeakReference)this.dUS.get(str)).get(); ; localBitmap = null)
    {
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        this.dUS.remove(str);
        this.dUS.put(str, new WeakReference(paramBitmap));
      }
      return;
    }
  }

  private Bitmap d(q paramq)
  {
    Assert.assertTrue("picture strategy here must be validity", s.c(paramq));
    String str = paramq.Dz();
    x localx = (x)this.dUQ.get(str);
    if (localx == null)
      localx = new x();
    if (localx.dUY)
      if (localx.dUZ >= 3)
      {
        if (ch.ab(localx.dVa) < 120L)
        {
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(120);
          arrayOfObject2[1] = str;
          z.w("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "download fail interval less than %d s for %s", arrayOfObject2);
          return null;
        }
        localx.dUZ = 0;
        localx.dUY = false;
        localx.dVa = ((int)ch.CL());
        this.dUQ.put(str, localx);
      }
    while (true)
      if (paramq.DC())
      {
        Bitmap localBitmap1 = jA(paramq.Dy());
        if (localBitmap1 != null)
        {
          Bitmap localBitmap2 = a(paramq, localBitmap1);
          this.dUQ.remove(str);
          return localBitmap2;
          localx.dUZ = (1 + localx.dUZ);
          break;
          if (ch.ab(localx.dVa) < 120L)
          {
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = Integer.valueOf(120);
            arrayOfObject1[1] = str;
            z.d("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "downloading interval less than %d s for %s", arrayOfObject1);
            return null;
          }
          localx.dUZ = (1 + localx.dUZ);
          localx.dVa = ((int)ch.CL());
          this.dUQ.put(str, localx);
          continue;
        }
        if ((this.dUT == null) || (this.dUT.aNy()))
          this.dUT = new bp(1, "readerapp-pic-logic-download", 3);
        this.dUT.c(new v(paramq));
        return null;
      }
    if ((this.dUU == null) || (this.dUU.aNy()))
      this.dUU = new bp(1, "readerapp-pic-logic-reader", 1);
    this.dUU.c(new w(paramq));
    return null;
  }

  public static Bitmap h(String paramString, int paramInt1, int paramInt2)
  {
    if (ch.jb(paramString))
    {
      z.w("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "error input, path is null");
      return null;
    }
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      z.w("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "error input, targetWidth %d, targetHeight %d", arrayOfObject);
      return null;
    }
    return i.o(paramString, paramInt1, paramInt2);
  }

  public static Bitmap jA(String paramString)
  {
    if (dLA == null)
      dLA = ak.getContext().getResources().getDisplayMetrics();
    DisplayMetrics localDisplayMetrics = dLA;
    return h(paramString, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
  }

  protected final Bitmap a(q paramq, Bitmap paramBitmap)
  {
    Assert.assertTrue("picture strategy here must be validity", s.c(paramq));
    if (paramBitmap != null)
    {
      Bitmap localBitmap = paramq.a(paramBitmap, r.dUM);
      if ((localBitmap != paramBitmap) && (!paramBitmap.isRecycled()))
        paramBitmap.recycle();
      b(paramq, localBitmap);
      paramBitmap = localBitmap;
    }
    return paramBitmap;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.u
 * JD-Core Version:    0.6.2
 */