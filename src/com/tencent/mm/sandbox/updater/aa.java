package com.tencent.mm.sandbox.updater;

import com.tencent.mm.compatible.g.j;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class aa extends g
{
  private String cFH;
  private boolean dzc = false;
  private int gSp = 0;
  private com.tencent.mm.sandbox.c iBJ;
  private String[] iBP;
  private ae iBQ = null;
  private boolean iBR = false;
  private String iBS;
  private cm iBT = new ab(this);
  private com.tencent.mm.sandbox.c iBU = new ad(this);

  public aa(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    super(paramInt1, paramString1, paramInt2, paramBoolean);
    this.iBP = new String[] { paramString2 };
    this.iBR = true;
    this.cFH = paramString3;
    this.iBS = paramString4;
  }

  public aa(int paramInt1, String paramString, int paramInt2, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramInt1, paramString, paramInt2, paramBoolean);
    this.iBP = paramArrayOfString;
  }

  private int aME()
  {
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "requestCount=" + this.gSp + ", curLinkIdx = " + this.gSp / 5);
    return this.gSp / 5;
  }

  public final void a(com.tencent.mm.sandbox.c paramc)
  {
    this.iBJ = paramc;
    if (!m.getExternalStorageState().equals("mounted"))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "SDCard not available.");
      paramc.a(-1, -1, null);
      return;
    }
    if (this.dzc)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "netscene had been canceled.");
      paramc.a(-1, -1, null);
      return;
    }
    if ((aMw()) || (aME() >= this.iBP.length))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "exceed max download url. url count = " + this.iBP.length);
      if (this.iBR)
      {
        paramc.a(1, -1, null);
        return;
      }
      paramc.a(-1, -1, null);
      return;
    }
    if (!j.u(this.iBn))
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "SDCard full");
      if (this.iBR)
      {
        paramc.a(13, -1, null);
        return;
      }
      paramc.a(-1, -1, null);
      return;
    }
    this.iBQ = new ae(this, this.iBn, com.tencent.mm.a.c.ab(aMt()), this.iBU);
    ae localae = this.iBQ;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.iBP[aME()];
    localae.execute(arrayOfString);
  }

  protected final String aMt()
  {
    if (this.iBR)
      return iBl + this.cFH + ".temp";
    return super.aMt();
  }

  public final String aMu()
  {
    if (this.iBR)
      return iBl + this.iBS + ".apk";
    return iBl + this.iBp + ".apk";
  }

  public final void cancel()
  {
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkWxWU3EihDr6zrocW4g7iOg==", "cancle netscene");
    this.dzc = true;
    if ((this.iBQ != null) && (!this.iBQ.isCancelled()))
      this.iBQ.cancel(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.aa
 * JD-Core Version:    0.6.2
 */