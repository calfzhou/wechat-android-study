package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class bp
{
  private LinkedBlockingQueue iFk = new LinkedBlockingQueue();
  private int iFl = 1;
  private Vector iFm = new Vector();
  private cm iFn;
  private Object lock = new byte[0];
  private String name = "";
  private int priority = 1;
  private boolean tn = false;

  public bp(int paramInt, String paramString)
  {
    this(paramInt, paramString, 1);
  }

  public bp(int paramInt1, String paramString, int paramInt2)
  {
    this(paramInt1, paramString, paramInt2, Looper.myLooper());
  }

  public bp(int paramInt1, String paramString, int paramInt2, Looper paramLooper)
  {
    this.iFl = paramInt2;
    this.name = paramString;
    this.priority = paramInt1;
    this.iFn = new bq(this, paramLooper);
  }

  @Deprecated
  public final boolean aNy()
  {
    return (this.iFm == null) || (this.iFm.size() == 0);
  }

  public final int c(br parambr)
  {
    int j;
    if (parambr == null)
    {
      z.e("!56@1vpV4H6/Dg9+MyOLQz8RMq550HsmviC6Zq3QPW/02X323tNqmpb/gQ==", "add empty thread object");
      j = -1;
    }
    int k;
    int m;
    do
    {
      int i;
      do
      {
        return j;
        try
        {
          if (!this.iFk.offer(parambr, 1L, TimeUnit.MILLISECONDS))
          {
            z.e("!56@1vpV4H6/Dg9+MyOLQz8RMq550HsmviC6Zq3QPW/02X323tNqmpb/gQ==", "add To Queue failed");
            return -2;
          }
        }
        catch (Exception localException)
        {
          z.e("!56@1vpV4H6/Dg9+MyOLQz8RMq550HsmviC6Zq3QPW/02X323tNqmpb/gQ==", "add To Queue failed :" + localException.getMessage());
          return -3;
        }
        if (this.iFm.size() == 0)
          break;
        i = this.iFk.size();
        j = 0;
      }
      while (i <= 0);
      k = this.iFl;
      m = this.iFm.size();
      j = 0;
    }
    while (k <= m);
    new bs(this, (byte)0).start();
    return 0;
  }

  public final void em(boolean paramBoolean)
  {
    synchronized (this.lock)
    {
      this.tn = paramBoolean;
      if (!paramBoolean);
      synchronized (this.lock)
      {
        this.lock.notifyAll();
        return;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bp
 * JD-Core Version:    0.6.2
 */