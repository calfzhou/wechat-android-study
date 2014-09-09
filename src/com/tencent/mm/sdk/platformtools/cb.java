package com.tencent.mm.sdk.platformtools;

import android.os.Looper;

public abstract class cb
{
  private long dlJ;
  private final long dpg;
  private long igF;
  private boolean igG = false;
  private Runnable igH = new cc(this);
  private Object lock = new Object();
  private Object result;

  public cb(long paramLong, Object paramObject)
  {
    this.dpg = paramLong;
    this.result = paramObject;
  }

  public cb(long paramLong, Object paramObject, boolean paramBoolean)
  {
    this.dpg = 2000L;
    this.result = paramObject;
    this.igG = true;
  }

  public final void Z(Object paramObject)
  {
    this.result = paramObject;
    synchronized (this.lock)
    {
      this.lock.notify();
      return;
    }
  }

  public final Object b(cm paramcm)
  {
    if (paramcm == null)
    {
      z.d("!32@/B4Tb64lLpLfTALxhnwQ9fCWq3TEM4dl", "null handler, task in exec thread, return now");
      return run();
    }
    z.i("!32@/B4Tb64lLpLfTALxhnwQ9fCWq3TEM4dl", "sync task exec...");
    if (Thread.currentThread().getId() == paramcm.getLooper().getThread().getId())
    {
      z.d("!32@/B4Tb64lLpLfTALxhnwQ9fCWq3TEM4dl", "same tid, task in exec thread, return now");
      return run();
    }
    this.dlJ = ch.CN();
    try
    {
      synchronized (this.lock)
      {
        paramcm.post(this.igH);
        this.lock.wait(this.dpg);
        label94: long l = ch.ad(this.dlJ);
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = this.result;
        arrayOfObject[1] = Long.valueOf(l);
        arrayOfObject[2] = Long.valueOf(this.igF);
        arrayOfObject[3] = Long.valueOf(l - this.igF);
        z.i("!32@/B4Tb64lLpLfTALxhnwQ9fCWq3TEM4dl", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", arrayOfObject);
        return this.result;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      break label94;
    }
  }

  protected abstract Object run();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cb
 * JD-Core Version:    0.6.2
 */