package com.tencent.mm.o;

import com.tencent.mm.ao.b;
import com.tencent.mm.plugin.f.b.j;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.a.by;
import com.tencent.mm.protocal.a.gb;
import com.tencent.mm.protocal.a.ks;
import com.tencent.mm.protocal.a.nk;
import com.tencent.mm.protocal.a.nn;
import com.tencent.mm.protocal.a.of;
import com.tencent.mm.protocal.a.qa;
import com.tencent.mm.protocal.a.td;
import com.tencent.mm.protocal.a.tl;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.aa;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.ag;
import com.tencent.mm.protocal.ai;
import com.tencent.mm.protocal.al;
import com.tencent.mm.protocal.aw;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.n;
import com.tencent.mm.protocal.p;
import com.tencent.mm.protocal.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;

public final class aq extends d
{
  private p dov;
  private byte[] dpr;
  private int type;

  public aq(p paramp, int paramInt)
  {
    this.dov = paramp;
    this.type = paramInt;
  }

  public static boolean a(String paramString, byte[] paramArrayOfByte, p paramp, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (paramString.length() <= 0)
      return false;
    PByteArray localPByteArray = new PByteArray();
    try
    {
      n localn = (n)paramp;
      byte[] arrayOfByte = localn.sW();
      if (arrayOfByte == null)
        return false;
      if (localn.aDH())
      {
        paramByteArrayOutputStream.write(arrayOfByte);
        return true;
      }
      bh localbh = bh.aHr();
      if (MMProtocalJni.pack(arrayOfByte, localPByteArray, paramString, paramArrayOfByte, paramp.tI(), paramp.oD(), localn.sV(), localbh.aHy(), localbh.aHw().getBytes(), localbh.aHx().getBytes()))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(localPByteArray.value.length);
        z.d("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "reqToBuf using protobuf ok, len:%d", arrayOfObject);
        paramByteArrayOutputStream.write(localPByteArray.value);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "protobuf build exception, check now! :" + localException.getMessage());
    }
    return false;
  }

  public final boolean a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2)
  {
    PByteArray localPByteArray = new PByteArray();
    switch (paramInt1)
    {
    default:
      if (!(this.dov instanceof n))
      {
        z.f("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "all protocal should implemented with protobuf");
        return false;
      }
      break;
    case 268369922:
      try
      {
        this.dpr = ((n)this.dov).sW();
        this.dov.cI(this.dpr.length);
        return true;
      }
      catch (Exception localException1)
      {
        return false;
      }
    }
    while (true)
    {
      try
      {
        n localn = (n)this.dov;
        byte[] arrayOfByte = localn.sW();
        if (arrayOfByte == null)
          return false;
        if (localn.aDH())
        {
          this.dpr = arrayOfByte;
          this.dov.cI(this.dpr.length);
          return true;
        }
        bh localbh = this.dov.aDI();
        if (!localbh.aHv())
        {
          str = "";
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(paramInt1);
          arrayOfObject1[1] = Integer.valueOf(localbh.aHy());
          z.d("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "dkcert type:%d rsaInfo ver:%d", arrayOfObject1);
          if (MMProtocalJni.pack(arrayOfByte, localPByteArray, str, paramArrayOfByte, this.dov.tI(), this.dov.oD(), localn.sV(), localbh.aHy(), localbh.aHw().getBytes(), localbh.aHx().getBytes()))
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(localPByteArray.value.length);
            z.d("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "reqToBuf using protobuf ok, len:%d", arrayOfObject2);
            this.dpr = localPByteArray.value;
          }
          this.dov.cI(this.dpr.length);
          return true;
        }
        if (ch.jb(paramString))
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(paramInt1);
          z.e("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "dksession jType %d session should not null", arrayOfObject3);
          return false;
        }
      }
      catch (Exception localException2)
      {
        z.e("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "protobuf build exception, check now! :" + localException2.getMessage());
        return false;
      }
      String str = paramString;
    }
  }

  public final void bk(int paramInt)
  {
    this.dov.bk(paramInt);
  }

  public final void dh(int paramInt)
  {
    this.dov.dh(paramInt);
  }

  public final void di(int paramInt)
  {
    this.dov.di(paramInt);
  }

  public final void fm(String paramString)
  {
    this.dov.fm(paramString);
  }

  public final void fn(String paramString)
  {
    this.dov.fn(paramString);
  }

  public final void fo(String paramString)
  {
    this.dov.fo(paramString);
  }

  public final int getClientVersion()
  {
    return this.dov.getClientVersion();
  }

  public final int getCmdId()
  {
    return this.dov.getCmdId();
  }

  public final String getDeviceType()
  {
    return this.dov.getDeviceType();
  }

  public final String getPassword()
  {
    switch (this.type)
    {
    default:
      return "";
    case 380:
      return ((k)this.dov).hNq.iem.getString();
    case 126:
    }
    return ((aw)this.dov).hNO.hRj;
  }

  public final String getUserName()
  {
    switch (this.type)
    {
    default:
      return "";
    case 380:
      return ((k)this.dov).hNq.hVf.getString();
    case 126:
    }
    return ((aw)this.dov).hNO.gnq;
  }

  public final int oD()
  {
    return this.dov.oD();
  }

  public final String qL()
  {
    return this.dov.qL();
  }

  public final byte[] tH()
  {
    return this.dpr;
  }

  public final String tI()
  {
    return this.dov.tI();
  }

  public final int tJ()
  {
    return this.dov.tJ();
  }

  public final byte[] tK()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.type);
    z.d("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "dkrsa getpass type:%d", arrayOfObject1);
    switch (this.type)
    {
    default:
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.type);
      z.d("!32@/B4Tb64lLpLuAV0nhTaszfj8r0geDEUt", "dkrsa getpass usesession type:%d", arrayOfObject2);
      return qL().getBytes();
    case 381:
      return ((ad)this.dov).hND.hRd.aLL().toByteArray();
    case 380:
      return ((k)this.dov).hNq.hRd.aLL().toByteArray();
    case 126:
      return ((aw)this.dov).hNO.hRd.aLL().toByteArray();
    case 145:
      return ((s)this.dov).hNs.hRd.aLL().toByteArray();
    case 107:
      return ((al)this.dov).hNI.hRd.aLL().toByteArray();
    case 429:
      return ((ai)this.dov).hNG.hRd.aLL().toByteArray();
    case 443:
      return ((j)this.dov).fTh.hRd.aLL().toByteArray();
    case 481:
      return ((aa)this.dov).hNB.hRd.aLL().toByteArray();
    case 572:
    }
    return ((ag)this.dov).hNF.hRd.aLL().toByteArray();
  }

  public final String tL()
  {
    switch (this.type)
    {
    default:
      return "";
    case 380:
    }
    return ((k)this.dov).hNq.hRw;
  }

  public final boolean tM()
  {
    return this.dov.tM();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.aq
 * JD-Core Version:    0.6.2
 */