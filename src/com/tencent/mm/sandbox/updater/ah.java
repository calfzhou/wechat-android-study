package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class ah
{
  private static long iCe = 125829120L;
  private static long iCf = 314572800L;
  private ay dHm = new ay(new ai(this), true);
  private boolean dQd = false;
  private boolean eOu = false;
  private long iCg = 0L;
  private long iCh = 0L;
  private String iCi = null;
  private ar iCj;

  public ah(ar paramar)
  {
    this.iCj = paramar;
  }

  public static boolean AD(String paramString)
  {
    if (an.AF(paramString) > iCe)
    {
      z.e("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "overTrafficAlertLine reach traffic alert line!");
      return true;
    }
    return false;
  }

  private void ef(boolean paramBoolean)
  {
    long l1 = 0L;
    if ((paramBoolean) || (this.iCg + this.iCh >= 524288L))
    {
      if (this.iCg + this.iCh > l1)
      {
        Intent localIntent = new Intent();
        localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        localIntent.putExtra("intent_extra_flow_stat_upstream", this.iCg);
        localIntent.putExtra("intent_extra_flow_stat_downstream", this.iCh);
        if (this.iCj.mContext != null)
          this.eOu = bc.bP(this.iCj.mContext);
        localIntent.putExtra("intent_extra_flow_stat_is_wifi", this.eOu);
        if (this.iCj.mContext != null)
          this.iCj.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      }
      if (!ch.jb(this.iCi))
        break label188;
      z.e("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "traffic is null!");
    }
    while (true)
    {
      if ((l1 >= iCe) && (this.iCj.eZP == 2))
      {
        z.e("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "checkIfTrafficAlert reach traffic alert line!");
        this.iCj.cancel();
      }
      return;
      label188: long l2 = an.c(this.iCi, this.iCg, this.iCh);
      this.iCg = l1;
      this.iCh = l1;
      l1 = l2;
    }
  }

  public final void af(String paramString, int paramInt)
  {
    if (ch.jb(paramString));
    do
    {
      return;
      if (!paramString.equals(this.iCi))
        stop();
      z.i("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "pack size: " + paramInt);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(iCe);
      z.i("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "TRAFFIC_ALERT_LINE before : %s", arrayOfObject1);
      iCe = Math.max(paramInt * 4, iCe);
      iCe = Math.min(iCf, iCe);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(iCe);
      z.i("!44@/B4Tb64lLpIoz7uBiEqQZS70cVT/Q61Ax49vraaHmec=", "TRAFFIC_ALERT_LINE after : %s", arrayOfObject2);
    }
    while (this.dQd);
    if (this.iCj.mContext != null)
      this.eOu = bc.bP(this.iCj.mContext);
    this.dHm.cP(30000L);
    this.dQd = true;
    this.iCi = paramString;
  }

  public final void cM(long paramLong)
  {
    this.dHm.post(new aj(this, paramLong));
  }

  public final void cN(long paramLong)
  {
    this.dHm.post(new ak(this, paramLong));
  }

  public final void ee(boolean paramBoolean)
  {
    if (this.eOu == paramBoolean)
      return;
    ef(true);
    this.eOu = paramBoolean;
  }

  public final void stop()
  {
    ef(true);
    this.dHm.aNu();
    this.dQd = false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.ah
 * JD-Core Version:    0.6.2
 */