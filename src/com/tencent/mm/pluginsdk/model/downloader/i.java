package com.tencent.mm.pluginsdk.model.downloader;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.os.Environment;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.Iterator;
import java.util.Vector;

@TargetApi(9)
public final class i
  implements l
{
  private static n hwl;
  private DownloadManager hvW = (DownloadManager)this.mContext.getSystemService("download");
  private Vector hwj = new Vector();
  private k hwk;
  private Context mContext = ak.getContext();

  private void cy(long paramLong)
  {
    if (this.hwj != null)
    {
      Iterator localIterator = this.hwj.iterator();
      while (localIterator.hasNext())
      {
        n localn = (n)localIterator.next();
        if (this.hwk != null)
          localn.onStartSucceed(paramLong, this.hwk.azh());
      }
    }
    if (hwl != null)
      hwl.onStartSucceed(paramLong, this.hwk.azh());
  }

  private void vl(String paramString)
  {
    if (this.hwj != null)
    {
      Iterator localIterator = this.hwj.iterator();
      while (localIterator.hasNext())
        ((n)localIterator.next()).onStartFailed(paramString);
    }
    if (hwl != null)
      hwl.onStartFailed(paramString);
  }

  public final long a(k paramk)
  {
    if ((paramk instanceof g))
      try
      {
        String str = m.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        if (!ch.jb(str))
        {
          File localFile = new File(str);
          if (!localFile.exists())
          {
            boolean bool = localFile.mkdir();
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Boolean.valueOf(bool);
            z.i("!44@/B4Tb64lLpKVQlIh1YRBX2BuTPU2oEXM+TN3Gf0zADQ=", "download folder not exist, make new one : [%b]", arrayOfObject);
          }
        }
        this.hwk = paramk;
        long l = this.hvW.enqueue((g)paramk);
        z.d("!44@/B4Tb64lLpKVQlIh1YRBX2BuTPU2oEXM+TN3Gf0zADQ=", "add task : " + l);
        if (l >= 0L)
        {
          FileDownloadManger.a(paramk, l);
          cy(l);
          return l;
        }
        vl("start failed");
        return l;
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX2BuTPU2oEXM+TN3Gf0zADQ=", "add download task by downloadmanager failed: " + localException.toString());
        return -4L;
      }
    z.f("!44@/B4Tb64lLpKVQlIh1YRBX2BuTPU2oEXM+TN3Gf0zADQ=", "err request type" + paramk.toString());
    return -2L;
  }

  public final void azo()
  {
    hwl = null;
  }

  public final int cv(long paramLong)
  {
    if (paramLong <= 0L)
    {
      z.e("!44@/B4Tb64lLpKVQlIh1YRBX2BuTPU2oEXM+TN3Gf0zADQ=", "no remove task is");
      return 0;
    }
    int i;
    try
    {
      int j = this.hvW.remove(new long[] { paramLong });
      i = j;
      FileDownloadManger.cu(paramLong);
      if (i > 0)
        if (this.hwj != null)
        {
          Iterator localIterator2 = this.hwj.iterator();
          while (localIterator2.hasNext())
            ((n)localIterator2.next()).onRemoveDownloadTaskSucceed(paramLong);
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Long.valueOf(paramLong);
        arrayOfObject[1] = localException.toString();
        z.e("!44@/B4Tb64lLpKVQlIh1YRBX2BuTPU2oEXM+TN3Gf0zADQ=", "remove task error:[%d], [%s]", arrayOfObject);
        i = 0;
      }
      if (hwl != null)
        hwl.onRemoveDownloadTaskSucceed(paramLong);
    }
    while (true)
    {
      return i;
      if (this.hwj != null)
      {
        Iterator localIterator1 = this.hwj.iterator();
        while (localIterator1.hasNext())
          ((n)localIterator1.next()).onRemoveDownloadTaskFailed(paramLong);
      }
      if (hwl != null)
        hwl.onRemoveDownloadTaskFailed(paramLong);
    }
  }

  public final void d(n paramn)
  {
    if ((this.hwj != null) && (paramn != null))
      this.hwj.remove(paramn);
  }

  public final void e(n paramn)
  {
    if ((paramn != null) && (!this.hwj.contains(paramn)))
      this.hwj.add(paramn);
  }

  public final void f(n paramn)
  {
    hwl = paramn;
  }

  public final void onDownloadError(long paramLong)
  {
    if (this.hwj != null)
    {
      Iterator localIterator = this.hwj.iterator();
      while (localIterator.hasNext())
        ((n)localIterator.next()).onDownloadError(paramLong);
    }
    if (hwl != null)
      hwl.onDownloadError(paramLong);
  }

  public final void onDownloadFinished(long paramLong)
  {
    if (this.hwj != null)
    {
      Iterator localIterator = this.hwj.iterator();
      while (localIterator.hasNext())
        ((n)localIterator.next()).onDownloadFinished(paramLong);
    }
    if (hwl != null)
      hwl.onDownloadFinished(paramLong);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.i
 * JD-Core Version:    0.6.2
 */