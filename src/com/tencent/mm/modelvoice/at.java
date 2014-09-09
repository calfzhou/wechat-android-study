package com.tencent.mm.modelvoice;

import android.content.Context;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.compatible.audio.j;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.o.r;
import com.tencent.mm.o.s;
import com.tencent.mm.o.t;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class at
  implements j, r
{
  private static int ddM = 100;
  private boolean dHA = false;
  private long dHC;
  private long dHD = 0L;
  private int dHE = 0;
  private int dHG = 0;
  private t dHH;
  private s dHI = null;
  private ay dHK = new ay(new au(this), true);
  private boolean dHL = false;
  private bj dHQ = null;
  private ax dHR = null;
  private a ddJ;
  private String rI = "";

  public at(Context paramContext)
  {
    this.ddJ = new a(paramContext);
  }

  public final void a(s params)
  {
    this.dHI = params;
  }

  public final void a(t paramt)
  {
    this.dHH = paramt;
  }

  public final void bY(int paramInt)
  {
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "dkbt Recorder onAudioStatChange :" + paramInt);
    if (this.dHL)
      return;
    this.dHL = true;
    bg.qY().b(this);
    this.dHQ = new bj();
    new aw(this);
    if (this.dHQ != null);
    this.dHR = new ax(this);
    this.dHR.start();
    this.dHG = 1;
    this.dHK.cP(3000L);
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "start end time:" + ch.ad(this.dHC));
  }

  public final boolean cancel()
  {
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "cancel Record :" + this.rI);
    try
    {
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "stop synchronized Record :" + this.rI);
      if (this.dHQ != null)
      {
        this.dHQ.lZ();
        this.ddJ.nH();
      }
      bs.iz(this.rI);
      bm.BF().run();
      this.rI = "";
      return true;
    }
    finally
    {
    }
  }

  public final boolean fj(String paramString)
  {
    reset();
    this.dHC = ch.CN();
    if (paramString == null)
    {
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Start Record toUser null");
      return false;
    }
    this.dHA = paramString.equals("_USER_FOR_THROWBOTTLE_");
    if (paramString.equals("medianote"))
      x.pK();
    this.rI = bs.ix(paramString);
    if ((this.rI == null) || (this.rI.length() <= 0))
    {
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Start Record DBError ");
      return false;
    }
    bg.qY().a(this);
    int i = bg.qY().mq();
    this.dHL = false;
    if (i != 0)
      bY(100);
    while (true)
    {
      return true;
      new av(this).sendEmptyMessageDelayed(0, 50L);
    }
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
      z.d("getMaxAmplitude", " map: " + i + " max:" + ddM + " per:" + i * 100 / ddM);
      return i * 100 / ddM;
    }
    return 0;
  }

  public final boolean md()
  {
    boolean bool = false;
    bg.qY().mr();
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "stop Record :" + this.rI);
    try
    {
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "stop synchronized Record :" + this.rI);
      if (this.dHQ != null)
      {
        this.dHQ.lZ();
        this.ddJ.nH();
      }
      if (this.dHG != 2)
      {
        ab.in(this.rI);
        this.rI = null;
        z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop " + this.rI + " by not onPart: " + ch.ad(this.dHC));
        this.dHG = -1;
        return bool;
      }
    }
    finally
    {
    }
    this.dHE = ((int)tg());
    if ((this.dHE < 800L) || ((this.dHA) && (this.dHE < 1000L)))
    {
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop " + this.rI + " by voiceLen: " + this.dHE);
      ab.in(this.rI);
      this.rI = "";
    }
    while (true)
    {
      this.rI = "";
      break;
      bs.f(this.rI, this.dHE, 0);
      bm.BF().run();
      bool = true;
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop file success: " + this.rI);
    }
  }

  public final void reset()
  {
    if (this.dHQ != null)
    {
      this.dHQ.lZ();
      this.ddJ.nH();
      z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Reset recorder.stopReocrd");
    }
    this.rI = "";
    this.dHC = 0L;
    this.dHR = null;
    this.dHG = 0;
    this.dHD = 0L;
    this.dHH = null;
    this.dHI = null;
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
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "recordStartTime " + this.dHD);
    if (this.dHD == 0L)
      return 0L;
    return ch.ad(this.dHD);
  }

  public final int th()
  {
    return this.dHE;
  }

  public final int ti()
  {
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.at
 * JD-Core Version:    0.6.2
 */