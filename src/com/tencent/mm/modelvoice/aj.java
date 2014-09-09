package com.tencent.mm.modelvoice;

import android.content.Context;
import com.tencent.mm.compatible.audio.b;
import com.tencent.mm.compatible.audio.j;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.o.r;
import com.tencent.mm.o.s;
import com.tencent.mm.o.t;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public class aj
  implements j, r
{
  private String cIA;
  private boolean dHA = false;
  private boolean dHB = false;
  private long dHC;
  private long dHD = 0L;
  private int dHE = 0;
  private an dHF = null;
  private int dHG = 0;
  protected t dHH;
  protected s dHI = null;
  com.tencent.mm.compatible.audio.c dHJ = com.tencent.mm.compatible.audio.c.dJK;
  private ay dHK = new ay(new ak(this), true);
  private boolean dHL = false;
  private by dHz = null;
  private com.tencent.mm.compatible.g.a ddJ;
  private String rI = "";

  public aj(Context paramContext)
  {
    this.ddJ = new com.tencent.mm.compatible.g.a(paramContext);
  }

  public final boolean Bs()
  {
    return fj("_USER_FOR_THROWBOTTLE_");
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
    this.dHJ = b.ml();
    String str1 = com.tencent.mm.f.e.or().getValue("VoiceFormat");
    String str2 = com.tencent.mm.f.e.or().getValue("VoiceFormatToQQ");
    if (this.dHJ == com.tencent.mm.compatible.audio.c.dJH)
    {
      if ((4 == ch.getInt(str1, 0)) && (!az.Bw()))
        this.dHJ = com.tencent.mm.compatible.audio.c.dJJ;
      if ((this.cIA != null) && (this.cIA.endsWith("@qqim")))
      {
        if (4 != ch.getInt(str2, 0))
          break label285;
        if (az.Bw());
      }
    }
    label285: for (this.dHJ = com.tencent.mm.compatible.audio.c.dJJ; ; this.dHJ = com.tencent.mm.compatible.audio.c.dJH)
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = str1;
      arrayOfObject[1] = str2;
      arrayOfObject[2] = this.dHJ;
      arrayOfObject[3] = Boolean.valueOf(az.Bw());
      z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "onAudioStatChange dynamicFormat:%s dynamicFormatQQ:%s recdMode:%s loadSilkFailed:%b", arrayOfObject);
      this.dHz = new by(this.dHJ);
      am localam = new am(this);
      if (this.dHz != null)
        this.dHz.a(localam);
      this.dHF = new an(this);
      this.dHF.start();
      this.dHG = 1;
      this.dHK.cP(3000L);
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "start end time:" + ch.ad(this.dHC));
      return;
    }
  }

  public final boolean cancel()
  {
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "cancel Record :" + this.rI);
    try
    {
      z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "stop synchronized Record :" + this.rI);
      if (this.dHz != null)
      {
        this.dHz.lZ();
        this.ddJ.nH();
      }
      bs.iz(this.rI);
      bm.BF().run();
      if ((this.dHz != null) && (!ch.jb(this.rI)))
      {
        com.tencent.mm.compatible.e.a locala = new com.tencent.mm.compatible.e.a();
        locala.cF(this.rI);
        locala.t(tg());
        locala.ck(1);
        locala.cm(this.dHz.Bg());
        n.fTF.a(false, 10513, locala.nG());
      }
      this.rI = "";
      return true;
    }
    finally
    {
    }
  }

  public final boolean fj(String paramString)
  {
    z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Start Record to  " + paramString);
    this.cIA = paramString;
    reset();
    this.dHC = ch.CN();
    if (paramString == null)
    {
      z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Start Record toUser null");
      return false;
    }
    this.dHA = paramString.equals("_USER_FOR_THROWBOTTLE_");
    if (paramString.equals("medianote"))
    {
      if ((0x4000 & x.pK()) == 0)
        this.dHB = true;
    }
    else
    {
      if (!this.dHA)
        break label152;
      this.rI = cb.iC(x.pG());
    }
    while (true)
    {
      if ((this.rI != null) && (this.rI.length() > 0))
        break label183;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.rI;
      z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Start Record DBError fileName:%s", arrayOfObject);
      return false;
      this.dHB = false;
      break;
      label152: if (this.dHB)
        this.rI = cb.iC("medianote");
      else
        this.rI = bs.ix(paramString);
    }
    label183: bg.qY().a(this);
    int i = bg.qY().mq();
    this.dHL = false;
    if (i != 0)
      bY(100);
    while (true)
    {
      return true;
      new al(this).sendEmptyMessageDelayed(0, 50L);
    }
  }

  public String getFileName()
  {
    return this.rI;
  }

  public final int getMaxAmplitude()
  {
    if (this.dHz == null)
      return 0;
    return this.dHz.getMaxAmplitude();
  }

  public boolean md()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    bg.qY().mr();
    z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "stop Record :" + this.rI);
    if ((this.dHz != null) && (!ch.jb(this.rI)))
    {
      com.tencent.mm.compatible.e.a locala = new com.tencent.mm.compatible.e.a();
      locala.cF(this.rI);
      locala.t(tg());
      locala.ck(2);
      locala.cm(this.dHz.Bg());
      n.fTF.a(false, 10513, locala.nG());
    }
    try
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.rI;
      arrayOfObject[1] = this.dHz;
      z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "stop synchronized Record:%s, recorder:%s", arrayOfObject);
      if (this.dHz != null)
      {
        this.dHz.lZ();
        this.ddJ.nH();
      }
      if (this.dHG != 2)
      {
        ab.in(this.rI);
        this.rI = null;
        z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop " + this.rI + " by not onPart: " + ch.ad(this.dHC));
        this.dHG = -1;
        return bool2;
      }
    }
    finally
    {
    }
    this.dHE = ((int)tg());
    if ((this.dHE < 800L) || ((this.dHA) && (this.dHE < 1000L)))
    {
      z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop " + this.rI + " by voiceLen: " + this.dHE);
      ab.in(this.rI);
      this.rI = "";
      bool1 = false;
    }
    while (true)
    {
      this.rI = "";
      bool2 = bool1;
      break;
      bs.f(this.rI, this.dHE, 0);
      bm.BF().run();
      z.i("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Stop file success: " + this.rI);
    }
  }

  public final void reset()
  {
    if (this.dHz != null)
    {
      this.dHz.lZ();
      this.ddJ.nH();
      z.e("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "Reset recorder.stopReocrd");
    }
    this.rI = "";
    this.dHC = 0L;
    this.dHF = null;
    this.dHJ = com.tencent.mm.compatible.audio.c.dJK;
    this.dHG = 0;
    this.dHD = 0L;
  }

  public final boolean tf()
  {
    if (this.dHz == null);
    while (this.dHz.getStatus() != 1)
      return false;
    return true;
  }

  public final long tg()
  {
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
    if ((this.dHJ == com.tencent.mm.compatible.audio.c.dJH) || (this.dHJ == com.tencent.mm.compatible.audio.c.dJI))
      return 0;
    if (this.dHJ == com.tencent.mm.compatible.audio.c.dJJ)
      return 2;
    return -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.aj
 * JD-Core Version:    0.6.2
 */