package com.tencent.mm.pluginsdk.downloader;

import com.tencent.mm.compatible.loader.p;
import com.tencent.mm.pluginsdk.model.downloader.FileDownloadManger;
import com.tencent.mm.pluginsdk.model.downloader.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.an;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b
  implements n
{
  b(a parama)
  {
  }

  public final void onDownloadError(long paramLong)
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", "[download]onDownloadError %d", arrayOfObject);
      Iterator localIterator = new ArrayList(a.a(this.htA)).iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((n)localWeakReference.get()).onDownloadError(paramLong);
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", localException, "", new Object[0]);
    }
  }

  public final void onDownloadFinished(long paramLong)
  {
    try
    {
      an localan = FileDownloadManger.cx(paramLong);
      com.tencent.mm.pluginsdk.downloader.c.a.b(new File(localan.field_filePath), p.sF(localan.field_md5));
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(paramLong);
      arrayOfObject[1] = localan.field_filePath;
      z.i("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", "[download]onDownloadFinished %d, path:%s", arrayOfObject);
      Iterator localIterator = new ArrayList(a.a(this.htA)).iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((n)localWeakReference.get()).onDownloadFinished(paramLong);
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", localException, "", new Object[0]);
    }
  }

  public final void onRemoveDownloadTaskFailed(long paramLong)
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.e("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", "[download] onRemoveDownloadTaskFailed %d", arrayOfObject);
      Iterator localIterator = new ArrayList(a.a(this.htA)).iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((n)localWeakReference.get()).onRemoveDownloadTaskFailed(paramLong);
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", localException, "", new Object[0]);
    }
  }

  public final void onRemoveDownloadTaskSucceed(long paramLong)
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong);
      z.i("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", "[download] onRemoveDownloadTaskSucceed :%d", arrayOfObject);
      Iterator localIterator = new ArrayList(a.a(this.htA)).iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((n)localWeakReference.get()).onRemoveDownloadTaskSucceed(paramLong);
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", localException, "", new Object[0]);
    }
  }

  public final void onStartFailed(String paramString)
  {
    try
    {
      z.e("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", "[download]onStartFailed: %s", new Object[] { paramString });
      Iterator localIterator = new ArrayList(a.a(this.htA)).iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((n)localWeakReference.get()).onStartFailed(paramString);
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", localException, "", new Object[0]);
    }
  }

  public final void onStartSucceed(long paramLong, String paramString)
  {
    try
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(paramLong);
      arrayOfObject[1] = paramString;
      z.i("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", "[download]onStartSuccess %d, savePath:%s", arrayOfObject);
      Iterator localIterator = new ArrayList(a.a(this.htA)).iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if ((localWeakReference != null) && (localWeakReference.get() != null))
          ((n)localWeakReference.get()).onStartSucceed(paramLong, paramString);
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpKVQlIh1YRBX63KQIoWfPTw", localException, "", new Object[0]);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.b
 * JD-Core Version:    0.6.2
 */