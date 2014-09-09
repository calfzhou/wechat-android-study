package com.tencent.kingkong.support;

import android.os.RemoteException;

public final class CancellationSignal
{
  private boolean mCancelInProgress;
  private boolean mIsCanceled;
  private CancellationSignal.OnCancelListener mOnCancelListener;
  private ICancellationSignal mRemote;

  public static ICancellationSignal createTransport()
  {
    return new CancellationSignal.Transport(null);
  }

  public static CancellationSignal fromTransport(ICancellationSignal paramICancellationSignal)
  {
    if ((paramICancellationSignal instanceof CancellationSignal.Transport))
      return ((CancellationSignal.Transport)paramICancellationSignal).mCancellationSignal;
    return null;
  }

  private void waitForCancelFinishedLocked()
  {
    while (true)
    {
      if (!this.mCancelInProgress)
        return;
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }

  // ERROR //
  public final void cancel()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/tencent/kingkong/support/CancellationSignal:mIsCanceled	Z
    //   6: ifeq +6 -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 41	com/tencent/kingkong/support/CancellationSignal:mIsCanceled	Z
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 33	com/tencent/kingkong/support/CancellationSignal:mCancelInProgress	Z
    //   22: aload_0
    //   23: getfield 43	com/tencent/kingkong/support/CancellationSignal:mOnCancelListener	Lcom/tencent/kingkong/support/CancellationSignal$OnCancelListener;
    //   26: astore_2
    //   27: aload_0
    //   28: getfield 45	com/tencent/kingkong/support/CancellationSignal:mRemote	Lcom/tencent/kingkong/support/ICancellationSignal;
    //   31: astore_3
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_2
    //   35: ifnull +9 -> 44
    //   38: aload_2
    //   39: invokeinterface 50 1 0
    //   44: aload_3
    //   45: ifnull +9 -> 54
    //   48: aload_3
    //   49: invokeinterface 54 1 0
    //   54: aload_0
    //   55: monitorenter
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 33	com/tencent/kingkong/support/CancellationSignal:mCancelInProgress	Z
    //   61: aload_0
    //   62: invokevirtual 57	java/lang/Object:notifyAll	()V
    //   65: aload_0
    //   66: monitorexit
    //   67: return
    //   68: astore 4
    //   70: aload_0
    //   71: monitorexit
    //   72: aload 4
    //   74: athrow
    //   75: astore_1
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    //   80: astore 6
    //   82: aload_0
    //   83: monitorenter
    //   84: aload_0
    //   85: iconst_0
    //   86: putfield 33	com/tencent/kingkong/support/CancellationSignal:mCancelInProgress	Z
    //   89: aload_0
    //   90: invokevirtual 57	java/lang/Object:notifyAll	()V
    //   93: aload_0
    //   94: monitorexit
    //   95: aload 6
    //   97: athrow
    //   98: astore 7
    //   100: aload_0
    //   101: monitorexit
    //   102: aload 7
    //   104: athrow
    //   105: astore 5
    //   107: goto -53 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   56	67	68	finally
    //   2	11	75	finally
    //   12	34	75	finally
    //   38	44	80	finally
    //   48	54	80	finally
    //   84	95	98	finally
    //   48	54	105	android/os/RemoteException
  }

  public final boolean isCanceled()
  {
    try
    {
      boolean bool = this.mIsCanceled;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void setOnCancelListener(CancellationSignal.OnCancelListener paramOnCancelListener)
  {
    try
    {
      waitForCancelFinishedLocked();
      if (this.mOnCancelListener == paramOnCancelListener)
        return;
      this.mOnCancelListener = paramOnCancelListener;
      if ((!this.mIsCanceled) || (paramOnCancelListener == null))
        return;
    }
    finally
    {
    }
    paramOnCancelListener.onCancel();
  }

  public final void setRemote(ICancellationSignal paramICancellationSignal)
  {
    try
    {
      waitForCancelFinishedLocked();
      if (this.mRemote == paramICancellationSignal)
        return;
      this.mRemote = paramICancellationSignal;
      if ((!this.mIsCanceled) || (paramICancellationSignal == null))
        return;
    }
    finally
    {
    }
    try
    {
      paramICancellationSignal.cancel();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void throwIfCanceled()
  {
    if (isCanceled())
      throw new OperationCanceledException();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.support.CancellationSignal
 * JD-Core Version:    0.6.2
 */