package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.tencent.mm.sdk.platformtools.cm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract class d
  implements Runnable
{
  private static final Lock jWy = new ReentrantLock();
  protected static final int jWz = 22;
  final String dqq;
  Bitmap dwV;
  final n jWA;
  final e jWB;
  final List jWC;
  Future jWD;
  s jWE;
  Exception jWF;
  int jWG;
  final ab jWq;

  d(n paramn, e parame, a parama)
  {
    this.jWA = paramn;
    this.jWB = parame;
    this.dqq = parama.dqq;
    this.jWq = parama.jWq;
    this.jWC = new ArrayList(4);
    a(parama);
  }

  static d a(Context paramContext, n paramn, e parame, a parama)
  {
    if (parama.jWq.resourceId != 0)
      return new ae(paramContext, paramn, parame, parama);
    if (parama.jWq.jXl != null)
      return new k(paramContext, paramn, parame, parama);
    Uri localUri = parama.jWq.uri;
    String str = localUri.getScheme();
    if ("content".equals(str))
    {
      if ((ContactsContract.Contacts.CONTENT_URI.getHost().equals(localUri.getHost())) && (!localUri.getPathSegments().contains("photo")))
        return new h(paramContext, paramn, parame, parama);
      return new i(paramContext, paramn, parame, parama);
    }
    if ("file".equals(str))
    {
      if ("android_asset".equals(localUri.getPathSegments().get(0)))
        return new c(paramContext, paramn, parame, parama);
      return new q(paramContext, paramn, parame, parama);
    }
    if ("android.resource".equals(str))
      return new ae(paramContext, paramn, parame, parama);
    throw new UnsupportedOperationException("[for request] not supported type");
  }

  static void a(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions)
  {
    int i = paramOptions.outHeight;
    int j = paramOptions.outWidth;
    int k = 1;
    int m;
    if ((i > paramInt2) || (j > paramInt1))
    {
      k = Math.round(i / paramInt2);
      m = Math.round(j / paramInt1);
      if (k >= m)
        break label65;
    }
    while (true)
    {
      paramOptions.inSampleSize = k;
      paramOptions.inJustDecodeBounds = false;
      return;
      label65: k = m;
    }
  }

  private Bitmap bbs()
  {
    Bitmap localBitmap1 = this.jWB.gK(this.dqq);
    Iterator localIterator = this.jWC.iterator();
    int i;
    int k;
    int m;
    Matrix localMatrix;
    int i2;
    int i3;
    int n;
    int i1;
    label291: label373: float f2;
    label412: float f3;
    while (localIterator.hasNext())
      if (((a)localIterator.next()).jWv)
      {
        i = 1;
        Object localObject1;
        if ((localBitmap1 != null) && (i == 0))
        {
          this.jWE = s.jWT;
          localObject1 = localBitmap1;
        }
        do
        {
          return localObject1;
          localObject1 = a(this.jWq);
        }
        while (localObject1 == null);
        jWy.lock();
        while (true)
        {
          ab localab;
          float f4;
          float f5;
          try
          {
            float f1;
            if ((this.jWq.bbz()) || (this.jWG != 0))
            {
              localab = this.jWq;
              int j = this.jWG;
              k = ((Bitmap)localObject1).getWidth();
              m = ((Bitmap)localObject1).getHeight();
              localMatrix = new Matrix();
              if (!localab.bbz())
                break;
              i2 = localab.fkq;
              i3 = localab.eSi;
              f1 = localab.jXo;
              if (f1 != 0.0F)
              {
                if (!localab.jXr)
                  continue;
                localMatrix.setRotate(f1, localab.jXp, localab.jXq);
              }
              if (!localab.jXm)
                break label412;
              f4 = i2 / k;
              f5 = i3 / m;
              if (f4 <= f5)
                break label373;
              int i4 = (int)Math.ceil(m * (f5 / f4));
              int i5 = (m - i4) / 2;
              n = 0;
              i1 = i5;
              m = i4;
              f5 = f4;
              localMatrix.preScale(f5, f5);
              if (j != 0)
                localMatrix.preRotate(j);
              Bitmap localBitmap2 = Bitmap.createBitmap((Bitmap)localObject1, n, i1, k, m, localMatrix, true);
              if (localBitmap2 != localObject1)
              {
                ((Bitmap)localObject1).recycle();
                localObject1 = localBitmap2;
              }
            }
            return localObject1;
            localMatrix.setRotate(f1);
            continue;
          }
          finally
          {
            jWy.unlock();
          }
          double d = k * (f4 / f5);
          int i6 = (int)Math.ceil(d);
          n = (k - i6) / 2;
          k = i6;
          i1 = 0;
          continue;
          if (!localab.jXn)
            break label506;
          f2 = i2 / k;
          f3 = i3 / m;
          if (f2 >= f3)
            break label499;
          label446: localMatrix.preScale(f2, f2);
          n = 0;
          i1 = 0;
        }
      }
    while (true)
    {
      label465: localMatrix.preScale(i2 / k, i3 / m);
      label499: label506: 
      do
      {
        do
        {
          n = 0;
          i1 = 0;
          break label291;
          i = 0;
          break;
          f2 = f3;
          break label446;
        }
        while ((i2 == 0) || (i3 == 0));
        if (i2 != k)
          break label465;
      }
      while (i3 == m);
    }
  }

  abstract Bitmap a(ab paramab);

  final void a(a parama)
  {
    this.jWC.add(parama);
  }

  s bbr()
  {
    return this.jWE;
  }

  public void run()
  {
    try
    {
      Thread localThread = Thread.currentThread();
      StringBuilder localStringBuilder = new StringBuilder("Monet-");
      ab localab = this.jWq;
      String str;
      if (localab.uri != null)
      {
        str = localab.uri.getPath();
        localThread.setName(str);
        this.dwV = bbs();
        if (this.dwV != null)
          break label139;
        n localn2 = this.jWA;
        localn2.gQj.sendMessage(localn2.gQj.obtainMessage(6, this));
      }
      while (true)
      {
        return;
        if (localab.jXl != null)
        {
          str = localab.jXl.getKey();
          break;
        }
        str = Integer.toHexString(localab.resourceId);
        break;
        label139: n localn1 = this.jWA;
        localn1.gQj.sendMessage(localn1.gQj.obtainMessage(4, this));
      }
    }
    catch (IOException localIOException)
    {
      this.jWF = localIOException;
      return;
    }
    finally
    {
      Thread.currentThread().setName("Monet-Idle");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.d
 * JD-Core Version:    0.6.2
 */