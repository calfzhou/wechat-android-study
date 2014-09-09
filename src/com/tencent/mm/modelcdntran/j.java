package com.tencent.mm.modelcdntran;

import android.net.wifi.WifiInfo;
import com.tencent.mm.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.protocal.a.cx;
import com.tencent.mm.protocal.a.kl;
import com.tencent.mm.protocal.a.km;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.nio.ByteBuffer;

public final class j extends x
  implements ab
{
  public static long dsm = 0L;
  public static long dsn = 0L;
  public static long dso = 0L;
  public static long dsp = 0L;
  private int cCn = 0;
  private m dlH;
  private final a dmI;
  public long startTime = 0L;

  public j()
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new kl());
    localb.b(new km());
    localb.fi("/cgi-bin/micromsg-bin/getcdndns");
    localb.de(379);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((kl)this.dmI.sO()).ibe = "";
  }

  public j(byte paramByte)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new kl());
    localb.b(new km());
    localb.fi("/cgi-bin/micromsg-bin/getcdndns");
    localb.de(379);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    this.cCn = 1;
    ((kl)this.dmI.sO()).ibe = "";
  }

  private static void s(byte[] paramArrayOfByte)
  {
    if (ch.B(paramArrayOfByte))
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "saveToCache failed infoBuf is null");
    String str;
    do
    {
      return;
      str = vh();
    }
    while (ch.jb(str));
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(8 + paramArrayOfByte.length);
      localByteBuffer.putLong(ch.CL());
      localByteBuffer.put(paramArrayOfByte);
      c.a(str, localByteBuffer.array(), localByteBuffer.array().length);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = localException.getMessage();
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "saveToCache failed path:%s e:%s", arrayOfObject);
    }
  }

  private static String vh()
  {
    if (!bc.by(ak.getContext()))
      return null;
    WifiInfo localWifiInfo;
    if (bc.bP(ak.getContext()))
    {
      localWifiInfo = bc.bQ(ak.getContext());
      if (localWifiInfo == null)
        return null;
    }
    for (String str1 = "wifi_" + localWifiInfo.getSSID(); ; str1 = "mobile_" + bc.bz(ak.getContext()) + "_" + bc.bB(ak.getContext()))
    {
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "cdntra getCurCacheFullPath file:%s", new Object[] { str1 });
      if ((str1 != null) && (str1.length() >= 2))
        break;
      return null;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(str1.hashCode());
    String str2 = String.format("%x", arrayOfObject);
    StringBuilder localStringBuilder = new StringBuilder();
    k.vj();
    return k.vk() + str2;
  }

  private static cx vi()
  {
    String str = vh();
    if (ch.jb(str))
      return null;
    byte[] arrayOfByte1 = c.b(str, 0, -1);
    if (ch.B(arrayOfByte1))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "cdntra getFromCache  read file failed:%s", new Object[] { str });
      return null;
    }
    ByteBuffer localByteBuffer;
    try
    {
      localByteBuffer = ByteBuffer.wrap(arrayOfByte1);
      long l = localByteBuffer.getLong();
      if (ch.CL() - l > 3600L)
      {
        z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "cdntra getFromCache  file is timeout remove it :%s", new Object[] { str });
        c.deleteFile(str);
        return null;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = localException.getMessage();
      z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "parse from file failed :%s  e:%s", arrayOfObject);
      return null;
    }
    byte[] arrayOfByte2 = new byte[-8 + arrayOfByte1.length];
    localByteBuffer.get(arrayOfByte2);
    cx localcx = new cx().be(arrayOfByte2);
    return localcx;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    int i = bg.qW().oD();
    if (i == 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "has not set uin.");
      return -1;
    }
    if (dsm != i)
    {
      dsm = i;
      dsn = 0L;
      dso = 0L;
      dsp = 0L;
    }
    long l = ch.CL();
    if (this.cCn == 0)
    {
      cx localcx1 = vi();
      cx localcx2 = vi();
      cx localcx3 = vi();
      if (localcx1 != null)
      {
        boolean bool = k.vm().a(localcx1, localcx2, localcx3);
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Boolean.valueOf(bool);
        z.i("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "cdntra getfromcache succ , setCDNDnsInfo :%b ", arrayOfObject4);
        if (bool)
          return -1;
      }
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Long.valueOf(l - dsn);
      arrayOfObject1[1] = Long.valueOf(l - dso);
      arrayOfObject1[2] = Long.valueOf(dsp);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "cdntra doscene Sec:%d Hour[%d,%d]", arrayOfObject1);
      if ((l > dsn) && (l - dsn < 10L))
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Long.valueOf(l - dsn);
        z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "Last get dns at %d ago . ignore!", arrayOfObject3);
        return -1;
      }
      if ((l > dso) && (l - dso < 3600L) && (dsp >= 90L))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(l - dso);
        z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "in 1 hour , get dns more than 90  (%d). ignore!", arrayOfObject2);
        return -1;
      }
    }
    dsn = l;
    if ((l < dso) || (l - dsp > 3600L))
      dso = l;
    for (dsp = 0L; ; dsp = 1L + dsp)
    {
      this.startTime = l;
      return a(paramr, this.dmI, this);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    km localkm = (km)((a)paramaj).sP();
    if ((paramInt2 != 0) || (paramInt3 != 0) || (localkm.ibf == null))
    {
      n localn = n.fTF;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(i.dsl);
      arrayOfObject1[1] = Integer.valueOf(0);
      arrayOfObject1[2] = Long.valueOf(this.startTime);
      localn.d(10769, arrayOfObject1);
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(paramInt2);
      arrayOfObject2[1] = Integer.valueOf(paramInt3);
      if (localkm.ibf == null);
      for (boolean bool = true; ; bool = false)
      {
        arrayOfObject2[2] = Boolean.valueOf(bool);
        z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "onGYNetEnd: [%d ,%d]  info is null :%b", arrayOfObject2);
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    if (!k.vm().a(localkm.ibf, localkm.ibg, localkm.ibh))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "onGYNetEnd setCDNDnsInfo failed ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    try
    {
      byte[] arrayOfByte6 = localkm.ibf.toByteArray();
      arrayOfByte1 = arrayOfByte6;
      s(arrayOfByte1);
    }
    catch (Exception localException2)
    {
      try
      {
        byte[] arrayOfByte5 = localkm.ibg.toByteArray();
        arrayOfByte2 = arrayOfByte5;
        s(arrayOfByte2);
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            byte[] arrayOfByte4 = localkm.ibh.toByteArray();
            arrayOfByte3 = arrayOfByte4;
            s(arrayOfByte3);
            this.dlH.a(paramInt2, paramInt3, paramString, this);
            return;
            localException1 = localException1;
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = localException1.getMessage();
            z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "onGYNetEnd getDnsInfo toByteArray failed: %s", arrayOfObject3);
            byte[] arrayOfByte1 = null;
          }
          localException2 = localException2;
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = localException2.getMessage();
          z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "onGYNetEnd getsnsDnsInfo toByteArray failed: %s", arrayOfObject4);
          byte[] arrayOfByte2 = null;
        }
        catch (Exception localException3)
        {
          while (true)
          {
            Object[] arrayOfObject5 = new Object[1];
            arrayOfObject5[0] = localException3.getMessage();
            z.w("!44@/B4Tb64lLpK+IBX8XDgnvmdjjgBobk8WZojthYJcY1s=", "onGYNetEnd getappDnsInfo toByteArray failed: %s", arrayOfObject5);
            byte[] arrayOfByte3 = null;
          }
        }
      }
    }
  }

  public final int getType()
  {
    return 379;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.j
 * JD-Core Version:    0.6.2
 */