package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;

public class ay extends cm
{
  private static int iEl;
  private final boolean iED;
  private long iEE = 0L;
  private final az iEF;
  private final int iEm;

  public ay(Looper paramLooper, az paramaz, boolean paramBoolean)
  {
    super(paramLooper);
    this.iEF = paramaz;
    this.iEm = aNw();
    this.iED = paramBoolean;
    if (paramLooper.getThread().getName().equals("initThread"))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpJ3oymw8esUtPFfOasFF0r7", "MTimerHandler can not init handler with initThread looper, stack %s", arrayOfObject);
    }
  }

  public ay(az paramaz, boolean paramBoolean)
  {
    this.iEF = paramaz;
    this.iEm = aNw();
    this.iED = paramBoolean;
    if (getLooper().getThread().getName().equals("initThread"))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.aHN();
      z.e("!32@/B4Tb64lLpJ3oymw8esUtPFfOasFF0r7", "MTimerHandler can not init handler with initThread looper, stack %s", arrayOfObject);
    }
  }

  private static int aNw()
  {
    if (iEl >= 8192)
      iEl = 0;
    int i = 1 + iEl;
    iEl = i;
    return i;
  }

  public final void aNu()
  {
    removeMessages(this.iEm);
  }

  public final boolean aNx()
  {
    return !hasMessages(this.iEm);
  }

  public final void cP(long paramLong)
  {
    this.iEE = paramLong;
    aNu();
    sendEmptyMessageDelayed(this.iEm, paramLong);
  }

  protected void finalize()
  {
    aNu();
    super.finalize();
  }

  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what != this.iEm) || (this.iEF == null));
    while ((!this.iEF.kJ()) || (!this.iED))
      return;
    sendEmptyMessageDelayed(this.iEm, this.iEE);
  }

  public String toString()
  {
    if (this.iEF == null)
      return "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
    return "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.iEF.getClass().getName() + "}";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ay
 * JD-Core Version:    0.6.2
 */