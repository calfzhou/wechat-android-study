package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.compatible.audio.j;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelvoice.bj;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;

public final class p
  implements j, com.tencent.mm.o.r
{
  private static int ddM = 100;
  private long dHC = 0L;
  private long dHD = 0L;
  private int dHE = 0;
  private int dHG = 0;
  protected com.tencent.mm.o.t dHH;
  protected com.tencent.mm.o.s dHI = null;
  private ay dHK = new ay(new q(this), true);
  private boolean dHL = false;
  private bj dHQ = null;
  private t gSR;
  private String rI = "";

  public final void a(com.tencent.mm.o.s params)
  {
    this.dHI = params;
  }

  public final void a(com.tencent.mm.o.t paramt)
  {
    this.dHH = paramt;
  }

  public final void bY(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", " Recorder onAudioStatChange :" + paramInt);
    if (this.dHL)
      return;
    this.dHL = true;
    bg.qY().b(this);
    this.dHQ = new bj();
    new r(this);
    if (this.dHQ != null);
    this.gSR = new t(this);
    this.gSR.start();
    this.dHG = 1;
    this.dHK.cP(3000L);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "start end time:" + ap.ad(this.dHC));
  }

  public final boolean cancel()
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "cancel Record :" + this.rI);
    try
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "stop synchronized Record :" + this.rI);
      if (this.dHQ != null)
        this.dHQ.lZ();
      o.iz(this.rI);
      f.arH().run();
      this.rI = "";
      return true;
    }
    finally
    {
    }
  }

  public final boolean fj(String paramString)
  {
    String str = z.ia(x.pG());
    n localn = new n();
    localn.field_filename = str;
    localn.field_user = paramString;
    localn.field_createtime = (System.currentTimeMillis() / 1000L);
    localn.field_clientid = str;
    localn.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localn.field_status = 1;
    localn.field_human = x.pG();
    localn.db(-1);
    if (f.arG().b(localn) == -1)
      str = null;
    this.rI = str;
    bg.qY().a(this);
    int i = bg.qY().mq();
    this.dHL = false;
    if (i != 0)
    {
      bY(100);
      return false;
    }
    new s(this).sendEmptyMessageDelayed(0, 50L);
    return false;
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getMaxAmplitude()
  {
    if (this.dHQ != null)
    {
      int i = this.dHQ.getMaxAmplitude();
      if (i > ddM)
        ddM = i;
      com.tencent.mm.sdk.platformtools.z.d("getMaxAmplitude", " map: " + i + " max:" + ddM + " per:" + i * 100 / ddM);
      return i * 100 / ddM;
    }
    return 0;
  }

  public final boolean md()
  {
    boolean bool = false;
    bg.qY().mr();
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "stop Record :" + this.rI);
    try
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "stop synchronized Record :" + this.rI);
      if (this.dHQ != null)
        this.dHQ.lZ();
      if (this.dHG != 2)
      {
        o.in(this.rI);
        this.rI = null;
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Stop " + this.rI + " by not onPart: " + ap.ad(this.dHC));
        this.dHG = -1;
        return bool;
      }
    }
    finally
    {
    }
    this.dHE = ((int)tg());
    if ((this.dHE < 800L) || (this.dHE < 1000L))
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Stop " + this.rI + " by voiceLen: " + this.dHE);
      o.in(this.rI);
      this.rI = "";
    }
    while (true)
    {
      this.rI = "";
      break;
      o.X(this.rI, this.dHE);
      f.arH().run();
      bool = true;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Stop file success: " + this.rI);
    }
  }

  public final void reset()
  {
    if (this.dHQ != null)
    {
      this.dHQ.lZ();
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", "Reset recorder.stopReocrd");
    }
    this.rI = "";
    this.dHC = 0L;
    this.gSR = null;
    this.dHG = 0;
    this.dHD = 0L;
  }

  public final boolean tf()
  {
    if (this.dHQ == null);
    while (this.dHQ.getStatus() != 1)
      return false;
    return true;
  }

  public final long tg()
  {
    if (this.dHD <= 0L)
      return 0L;
    return ap.ad(this.dHD);
  }

  public final int th()
  {
    return this.dHE;
  }

  public final int ti()
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.p
 * JD-Core Version:    0.6.2
 */