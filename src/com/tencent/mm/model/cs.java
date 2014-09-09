package com.tencent.mm.model;

import com.tencent.mm.a.c;
import com.tencent.mm.protocal.a.sy;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.e;

public final class cs
{
  private String cOD = "";
  private int cOn = 0;
  private int cOx = 0;
  private String cOy = "";
  private String dmh = "";
  private String dmi = "";
  private String dmj = "";
  private String dmk = "";
  private String dml = "";

  public static sy a(cs paramcs)
  {
    bg.qW().oQ().set(12289, Integer.valueOf(paramcs.cOx));
    bg.qW().oQ().set(12290, Integer.valueOf(paramcs.cOn));
    if (ct.B((String)bg.qW().oQ().get(12293), paramcs.jp()))
      bg.qW().oQ().set(12293, paramcs.jp());
    if (ct.B((String)bg.qW().oQ().get(12292), paramcs.jq()))
      bg.qW().oQ().set(12292, paramcs.jq());
    if (ct.B((String)bg.qW().oQ().get(12291), paramcs.cOy))
      bg.qW().oQ().set(12291, paramcs.cOy);
    if (ct.B((String)bg.qW().oQ().get(12307), paramcs.cOD))
      bg.qW().oQ().set(12307, paramcs.cOD);
    if (ct.B((String)bg.qW().oQ().get(12324), paramcs.dmj))
      bg.qW().oQ().set(12324, paramcs.dmj);
    if (ct.B((String)bg.qW().oQ().get(12325), paramcs.dml))
      bg.qW().oQ().set(12325, paramcs.dml);
    if (ct.B((String)bg.qW().oQ().get(12326), paramcs.dmk))
      bg.qW().oQ().set(12326, paramcs.dmk);
    sy localsy = new sy();
    localsy.imK = 128;
    localsy.hVf = new vt().wF("");
    localsy.ifj = new vt().wF("");
    localsy.imL = 0;
    localsy.imM = new vt().wF("");
    localsy.imN = new vt().wF("");
    localsy.dZy = 0;
    byte[] arrayOfByte1 = c.a("", 0, -1);
    byte[] arrayOfByte2;
    if (arrayOfByte1 == null)
    {
      arrayOfByte2 = new byte[0];
      localsy.imI = new com.tencent.mm.ao.b(arrayOfByte2);
      if (arrayOfByte1 != null)
        break label560;
    }
    label560: for (int i = 0; ; i = arrayOfByte1.length)
    {
      localsy.imH = i;
      localsy.dtf = paramcs.cOn;
      localsy.dth = paramcs.cOx;
      localsy.dtg = ch.ja(paramcs.cOy);
      localsy.Kt = ch.ja(paramcs.dmk);
      localsy.Ks = ch.ja(paramcs.dml);
      localsy.imO = 0;
      localsy.ifQ = ch.ja(paramcs.cOD);
      localsy.imT = 0;
      localsy.dti = "";
      localsy.ifS = 0;
      localsy.ifR = "";
      localsy.dtm = ch.ja(paramcs.dmj);
      return localsy;
      arrayOfByte2 = arrayOfByte1;
      break;
    }
  }

  public static cs rQ()
  {
    cs localcs = new cs();
    localcs.cOx = 1;
    localcs.cOn = ch.a((Integer)bg.qW().oQ().get(12290), 0);
    localcs.dmh = ((String)bg.qW().oQ().get(12293));
    localcs.dmi = ((String)bg.qW().oQ().get(12292));
    localcs.cOy = ((String)bg.qW().oQ().get(12291));
    localcs.cOD = ((String)bg.qW().oQ().get(12307));
    localcs.dmj = ((String)bg.qW().oQ().get(12324));
    localcs.dml = ((String)bg.qW().oQ().get(12325));
    localcs.dmk = ((String)bg.qW().oQ().get(12326));
    return localcs;
  }

  public static cs rR()
  {
    if (ch.a((Integer)bg.qW().oQ().get(12289), 0) == 0)
      return null;
    return rQ();
  }

  public final void bh(String paramString)
  {
    this.cOy = paramString;
  }

  public final void bj(int paramInt)
  {
    this.cOn = paramInt;
  }

  public final void bl(String paramString)
  {
    this.cOD = paramString;
  }

  public final void ey(String paramString)
  {
    this.dmk = paramString;
  }

  public final void ez(String paramString)
  {
    this.dml = paramString;
  }

  public final String getCountryCode()
  {
    return this.dmj;
  }

  public final int jj()
  {
    return this.cOn;
  }

  public final String jo()
  {
    return this.cOy;
  }

  public final String jp()
  {
    if (!ch.jb(this.dmj))
      if ((ch.jb(this.dml)) || (ch.jb(this.dmk)) || (!RegionCodeDecoder.zS(this.dmj)))
        break label76;
    label76: for (this.dmh = RegionCodeDecoder.aKA().bv(this.dmj, this.dml); ch.jb(this.dmh); this.dmh = RegionCodeDecoder.aKA().zU(this.dmj))
      return ch.ja(this.dml);
    return this.dmh;
  }

  public final String jq()
  {
    if (!ch.jb(this.dmj))
    {
      if (ch.jb(this.dml))
        break label91;
      if (!ch.jb(this.dmk))
        break label66;
      this.dmi = RegionCodeDecoder.aKA().bv(this.dmj, this.dml);
    }
    while (ch.jb(this.dmi))
    {
      return ch.ja(this.dmk);
      label66: this.dmi = RegionCodeDecoder.aKA().w(this.dmj, this.dml, this.dmk);
      continue;
      label91: this.dmi = "";
    }
    return this.dmi;
  }

  public final String jt()
  {
    return this.cOD;
  }

  public final void rS()
  {
    this.cOx = 1;
  }

  public final String rT()
  {
    return this.dmk;
  }

  public final String rU()
  {
    return this.dml;
  }

  public final void setCountryCode(String paramString)
  {
    this.dmj = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cs
 * JD-Core Version:    0.6.2
 */