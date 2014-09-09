package com.tencent.mm.modelstat;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class c
{
  long beginTime;
  long dDP;
  long dDQ;
  long dDR;
  boolean dsv;
  long endTime;
  int rtType;

  public c()
  {
  }

  public c(int paramInt, boolean paramBoolean, long paramLong)
  {
    this.rtType = paramInt;
    this.dsv = paramBoolean;
    this.dDP = paramLong;
    this.dDQ = 0L;
  }

  public final void U(long paramLong)
  {
    if (this.dDP == 0L)
      this.dDP = paramLong;
    this.dDR = (ch.CN() - this.dDR);
    this.endTime = ch.CM();
    z.d("!32@/B4Tb64lLpIxKaXa+FvJsGW0qfmRAifD", "FIN: TIME:" + (this.endTime - this.beginTime) + " datalen:" + this.dDP + " Count:" + this.dDQ + " type:" + this.rtType);
    WatchDogPushReceiver.a(this);
  }

  public final void zS()
  {
    if (this.dDQ == 0L)
    {
      this.beginTime = ch.CM();
      this.dDR = ch.CN();
    }
    this.dDQ = (1L + this.dDQ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c
 * JD-Core Version:    0.6.2
 */