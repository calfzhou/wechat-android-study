package com.tencent.mm.q;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.f;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class w
{
  private List dqW = new ArrayList();
  private Map dqX = new HashMap();
  private Map dqY = new HashMap();
  private bp dqZ = null;

  private Bitmap N(String paramString1, String paramString2)
  {
    if (this.dqY.containsKey(paramString1))
    {
      Bitmap localBitmap2 = (Bitmap)((WeakReference)this.dqY.get(paramString1)).get();
      if ((localBitmap2 == null) || (localBitmap2.isRecycled()))
      {
        String str2 = v.L(paramString1, paramString2);
        Bitmap localBitmap3 = i.wU(fK(paramString1 + str2));
        if (localBitmap3 == null)
        {
          z.d("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "not found brand icon local");
          return null;
        }
        f(paramString1, localBitmap3);
      }
    }
    while (true)
    {
      WeakReference localWeakReference = (WeakReference)this.dqY.get(paramString1);
      if (localWeakReference == null)
        break;
      return (Bitmap)localWeakReference.get();
      String str1 = v.L(paramString1, paramString2);
      Bitmap localBitmap1 = i.wU(fK(paramString1 + str1));
      if (localBitmap1 == null)
      {
        z.d("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "not found brand icon local");
        return null;
      }
      f(paramString1, localBitmap1);
    }
    return null;
  }

  private void f(String paramString, Bitmap paramBitmap)
  {
    Object localObject;
    if (this.dqY.containsKey(paramString))
      localObject = (Bitmap)((WeakReference)this.dqY.get(paramString)).get();
    while (true)
    {
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()));
      try
      {
        Bitmap localBitmap1 = Bitmap.createScaledBitmap(paramBitmap, 128, 128, true);
        Bitmap localBitmap2 = i.a(localBitmap1, true, localBitmap1.getWidth() >> 1);
        localObject = localBitmap2;
        this.dqY.remove(paramString);
        this.dqY.put(paramString, new WeakReference(localObject));
        if (localObject == paramBitmap)
        {
          return;
          localObject = null;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        while (true)
          localObject = paramBitmap;
        paramBitmap.recycle();
      }
    }
  }

  private static String fK(String paramString)
  {
    if (bg.oE())
      return bg.qW().pp() + "/brand_" + f.d(paramString.getBytes());
    return "";
  }

  public final int M(String paramString1, String paramString2)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
    {
      z.e("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "pushing for brand " + paramString1 + ", url " + paramString2);
      return -1;
    }
    if (ch.ab(ch.a((Integer)this.dqX.get(paramString1))) < 300L)
    {
      z.d("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "downloading interval less than 5 mins for " + paramString1);
      return -1;
    }
    this.dqX.put(paramString1, Integer.valueOf((int)ch.CL()));
    if ((this.dqZ == null) || (this.dqZ.aNy()))
      this.dqZ = new bp(1, "brand-logic");
    String str = v.L(paramString1, paramString2);
    return this.dqZ.c(new y(paramString1, str));
  }

  public final void a(x paramx)
  {
    this.dqW.add(paramx);
  }

  public final void b(x paramx)
  {
    this.dqW.remove(paramx);
  }

  protected final void d(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    try
    {
      String str = paramString1 + paramString2;
      Bitmap localBitmap = i.cB(paramArrayOfByte);
      i.a(localBitmap, 100, Bitmap.CompressFormat.PNG, fK(str), false);
      f(paramString1, localBitmap);
      z.d("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "update brand icon for  " + paramString1 + ", done");
      this.dqX.remove(paramString1);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final void fL(String paramString)
  {
    int i = 0;
    try
    {
      while (i < this.dqW.size())
      {
        ((x)this.dqW.get(i)).fM(paramString);
        i++;
      }
    }
    catch (Exception localException)
    {
    }
  }

  public final void uW()
  {
    this.dqW.clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.w
 * JD-Core Version:    0.6.2
 */