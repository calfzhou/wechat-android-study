package com.tencent.mm.o;

import com.tencent.mm.ao.b;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.a.kt;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.tm;
import com.tencent.mm.protocal.a.vj;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.ae;
import com.tencent.mm.protocal.ax;
import com.tencent.mm.protocal.bh;
import com.tencent.mm.protocal.g;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.o;
import com.tencent.mm.protocal.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class av extends g
{
  private byte[] dpA;
  private q dpz;
  private int type;

  public av(q paramq, int paramInt)
  {
    this.dpz = paramq;
    this.type = paramInt;
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PInt paramPInt, vo paramvo)
  {
    PByteArray localPByteArray1 = new PByteArray();
    paramPInt.value = -1;
    PByteArray localPByteArray2 = new PByteArray();
    try
    {
      if (MMProtocalJni.unpack(localPByteArray2, paramArrayOfByte1, paramArrayOfByte2, localPByteArray1, paramPInt))
      {
        if ((paramPInt.value == -13) || (paramPInt.value == -102) || (paramPInt.value == -3001))
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(paramPInt.value);
          z.e("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "unpack failed. error:%d", arrayOfObject);
          return null;
        }
        paramvo.l(localPByteArray2.value);
        z.d("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "bufToRespNoRSA using protobuf ok");
        return localPByteArray2.value;
      }
      z.e("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "unpack failed.");
      return null;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "protobuf unbuild exception, check now!");
    }
    return null;
  }

  public final boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    PByteArray localPByteArray1 = new PByteArray();
    if (!(this.dpz instanceof o))
    {
      z.f("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "all protocal should implemented with protobuf");
      return false;
    }
    PByteArray localPByteArray2 = new PByteArray();
    PInt localPInt = new PInt(0);
    o localo = (o)this.dpz;
    try
    {
      if (localo.aDH())
      {
        int j = localo.r(paramArrayOfByte1);
        z.d("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "rawData using protobuf ok");
        this.dpz.dj(j);
        if (ch.jb(ao.dWa))
          break label311;
        this.dpz.fq(ao.dWa);
        break label311;
      }
      if (MMProtocalJni.unpack(localPByteArray2, paramArrayOfByte1, paramArrayOfByte2, localPByteArray1, localPInt))
      {
        if ((paramInt != 380) && (10001 == ao.dVY) && (ao.dVZ > 0))
        {
          if (ao.dVZ == 2)
            bh.l("", "", 0);
          ao.dVZ = 0;
          localPInt.value = -13;
          z.w("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "dkcert dktest set session timeout once !");
        }
        if ((localPInt.value == -13) || (localPInt.value == -102) || (localPInt.value == -3001))
          this.dpz.dj(localPInt.value);
        while (true)
        {
          this.dpz.cI(paramArrayOfByte1.length);
          this.dpA = localPByteArray1.value;
          if (ch.jb(ao.dWa))
            break;
          this.dpz.fq(ao.dWa);
          break;
          int i = localo.r(localPByteArray2.value);
          z.d("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "bufToResp using protobuf ok");
          this.dpz.dj(i);
        }
      }
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLuAV0nhTasza8qQPQ5loKc", "protobuf unbuild exception, check now!");
    }
    return false;
    label311: return true;
    return true;
  }

  public final void dj(int paramInt)
  {
    this.dpz.dj(paramInt);
  }

  public final void fq(String paramString)
  {
    this.dpz.fq(paramString);
  }

  public final int getCmdId()
  {
    return this.dpz.getCmdId();
  }

  public final int oD()
  {
    switch (this.type)
    {
    default:
      return 0;
    case 380:
      return ((l)this.dpz).hNr.hQv;
    case 126:
    }
    return ((ax)this.dpz).hNP.hQv;
  }

  public final String qL()
  {
    switch (this.type)
    {
    default:
      return "";
    case 380:
      return ((l)this.dpz).hNr.hQu.aFt();
    case 126:
    }
    return ((ax)this.dpz).hNP.iot;
  }

  public final byte[] tC()
  {
    return this.dpA;
  }

  public final String tP()
  {
    return this.dpz.tP();
  }

  public final int tQ()
  {
    return this.dpz.tQ();
  }

  public final String tR()
  {
    switch (this.type)
    {
    default:
      return "";
    case 380:
      return ((l)this.dpz).hNr.inC;
    case 126:
    }
    return ((ax)this.dpz).hNP.inC;
  }

  public final String tS()
  {
    if (this.type == 381)
    {
      vj localvj = ((ae)this.dpz).hNE.ibk;
      if (localvj != null)
        return ch.ja(localvj.iqi);
    }
    return "";
  }

  public final String tT()
  {
    if (this.type == 381)
    {
      vj localvj = ((ae)this.dpz).hNE.ibk;
      if (localvj != null)
        return ch.ja(localvj.iqh);
    }
    return "";
  }

  public final int tU()
  {
    if (this.type == 381)
      return ((ae)this.dpz).hNE.iaW;
    return 0;
  }

  public final String tV()
  {
    switch (this.type)
    {
    default:
      return "";
    case 380:
      return ((l)this.dpz).hNr.hVf.getString();
    case 126:
    }
    return ((ax)this.dpz).hNP.gnq;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.av
 * JD-Core Version:    0.6.2
 */