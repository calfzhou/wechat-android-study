package com.tencent.mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import junit.framework.Assert;

final class au extends Handler
  implements bb
{
  private Looper iEw = getLooper();
  private Handler.Callback iEx;
  av iEy;

  au(Handler.Callback paramCallback, av paramav)
  {
    super(paramCallback);
    this.iEx = paramCallback;
    this.iEy = paramav;
  }

  au(Looper paramLooper, Handler.Callback paramCallback, av paramav)
  {
    super(paramLooper, paramCallback);
    this.iEx = paramCallback;
    this.iEy = paramav;
  }

  au(Looper paramLooper, av paramav)
  {
    super(paramLooper);
    this.iEy = paramav;
  }

  au(av paramav)
  {
    this.iEy = paramav;
  }

  public final void a(Runnable paramRunnable, ba paramba)
  {
    if (this.iEy != null)
      this.iEy.onTaskRunEnd(paramRunnable, paramba);
  }

  public final boolean a(Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2)
  {
    if (this.iEy != null)
      return this.iEy.onLog(null, paramRunnable, paramThread, paramLong1, paramLong2);
    return false;
  }

  public final void dispatchMessage(Message paramMessage)
  {
    if ((paramMessage.getCallback() != null) || (this.iEx != null))
      super.dispatchMessage(paramMessage);
    long l1;
    long l2;
    do
    {
      return;
      l1 = System.currentTimeMillis();
      l2 = Debug.threadCpuTimeNanos();
      handleMessage(paramMessage);
    }
    while (this.iEy == null);
    this.iEy.onLog(paramMessage, null, this.iEw.getThread(), System.currentTimeMillis() - l1, Debug.threadCpuTimeNanos() - l2);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (this.iEy != null)
      this.iEy.handleMessage(paramMessage);
  }

  public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    if (paramMessage != null);
    Runnable localRunnable;
    for (boolean bool1 = true; ; bool1 = false)
    {
      Assert.assertTrue("msg is null", bool1);
      localRunnable = paramMessage.getCallback();
      if (localRunnable != null)
        break;
      return super.sendMessageAtTime(paramMessage, paramLong);
    }
    long l = paramLong - SystemClock.uptimeMillis();
    Object localObject1 = paramMessage.obj;
    if (paramMessage.getTarget() == null);
    for (Object localObject2 = this; ; localObject2 = paramMessage.getTarget())
    {
      ba localba = new ba(localRunnable, localObject1, (Handler)localObject2, this.iEw.getThread(), this);
      if (l > 0L)
        localba.iEM = l;
      Message localMessage = Message.obtain(paramMessage.getTarget(), localba);
      localMessage.what = paramMessage.what;
      localMessage.arg1 = paramMessage.arg1;
      localMessage.arg2 = paramMessage.arg2;
      localMessage.obj = paramMessage.obj;
      localMessage.replyTo = paramMessage.replyTo;
      localMessage.setData(paramMessage.getData());
      paramMessage.recycle();
      if (this.iEy != null)
        this.iEy.onTaskAdded(localRunnable, localba);
      boolean bool2 = super.sendMessageAtTime(localMessage, paramLong);
      if ((!bool2) && (this.iEy != null))
        this.iEy.onTaskRunEnd(localRunnable, localba);
      return bool2;
    }
  }

  public final String toString()
  {
    return "MMInnerHandler{listener = " + this.iEy + "}";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.au
 * JD-Core Version:    0.6.2
 */