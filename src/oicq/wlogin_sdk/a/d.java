package oicq.wlogin_sdk.a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.security.SecureRandom;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;

public final class d
{
  private k kjb = new k();
  private l kjc = new l(this.kjb);
  private h kjd = new h(this.kjb);
  private i kje = new i(this.kjb);
  private j kjf = new j(this.kjb);
  private g kjg = null;
  private int kjh = 66560;
  private int kji = 124;
  private int kjj = 116;
  private Context mContext = null;

  public d(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    k localk = this.kjb;
    localk.kjp = paramContext;
    localk.kjQ = paramInt;
    localk.kki = new f(paramContext);
    byte[] arrayOfByte = new byte[16];
    localk.kjH.nextBytes(arrayOfByte);
    System.arraycopy(arrayOfByte, 0, localk.kjK, 0, 16);
    beL();
  }

  private int beL()
  {
    while (true)
    {
      String str1;
      try
      {
        byte[] arrayOfByte1 = oicq.wlogin_sdk.c.f.dg(this.mContext);
        if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0))
        {
          arrayOfByte1 = oicq.wlogin_sdk.c.f.cZ(this.mContext);
          if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0))
          {
            arrayOfByte1 = new String("%4;7t>;28<fc.5*6").getBytes();
            this.kjb.kkc = 0;
            oicq.wlogin_sdk.c.f.b(this.mContext, arrayOfByte1);
            this.kjb.kkb = 1;
            this.kjb.kkd = 1;
            this.kjb.kjR = new byte[arrayOfByte1.length];
            System.arraycopy(arrayOfByte1, 0, this.kjb.kjR, 0, arrayOfByte1.length);
            byte[] arrayOfByte2 = new byte[1 + arrayOfByte1.length];
            arrayOfByte2[0] = 35;
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
            k localk1 = this.kjb;
            localk1.kjI = oicq.wlogin_sdk.c.f.jdMethod_do(arrayOfByte2);
            k.kjS = (byte[])this.kjb.kjR.clone();
            this.kjb.kjT = oicq.wlogin_sdk.c.f.da(this.mContext);
            int i = oicq.wlogin_sdk.c.f.dc(this.mContext);
            this.kjb.kjU = oicq.wlogin_sdk.c.f.db(this.mContext);
            if (i != this.kjb.kjU)
            {
              oicq.wlogin_sdk.c.f.dd(this.mContext);
              oicq.wlogin_sdk.c.f.J(this.mContext, this.kjb.kjU);
            }
            this.kjb.kjW = oicq.wlogin_sdk.c.f.de(this.mContext).getBytes();
            this.kjb.kke = oicq.wlogin_sdk.c.f.df(this.mContext);
            this.kjb.kjV = oicq.wlogin_sdk.c.f.dh(this.mContext);
            this.kjb.kjY = oicq.wlogin_sdk.c.f.aL(this.mContext, new String(this.kjb.kjV));
            k localk2 = this.kjb;
            new String(this.kjb.kjV);
            localk2.kjZ = oicq.wlogin_sdk.c.f.bfr();
            str1 = Build.MODEL;
            if (str1 != null)
              break label456;
            this.kjb.kka = new byte[0];
            String str2 = Build.VERSION.RELEASE;
            if (str2 == null)
              str2 = "";
            oicq.wlogin_sdk.c.f.DS("WtloginHelper init ok: android version:" + str2 + " release time:" + oicq.wlogin_sdk.c.f.bft());
            return 0;
          }
          this.kjb.kkc = 1;
          continue;
        }
      }
      finally
      {
      }
      this.kjb.kkc = 1;
      this.kjb.kkb = 0;
      this.kjb.kkd = 0;
      continue;
      label456: this.kjb.kka = str1.getBytes();
    }
  }

  public final byte[] a(long paramLong, e parame, String paramString)
  {
    oicq.wlogin_sdk.c.f.DS("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256" + " ...");
    if (paramString.length() > 16)
      paramString = paramString.substring(0, 16);
    while (true)
    {
      try
      {
        int i = beM()[parame.ordinal()];
        Object localObject2;
        Object localObject3;
        switch (i)
        {
        default:
          return null;
        case 1:
          if ((paramString == null) || (paramString.length() == 0))
          {
            oicq.wlogin_sdk.c.f.DS("USER_WITH_PWD userPasswd null");
            return null;
          }
          localObject2 = oicq.wlogin_sdk.c.d.DQ(paramString);
          j = 0;
          this.kjb.kjU = oicq.wlogin_sdk.c.f.db(this.mContext);
          this.kjb.kjW = oicq.wlogin_sdk.c.f.de(this.mContext).getBytes();
          this.kjb.kja = paramLong;
          this.kjb.kjN = 522017402L;
          this.kjb.kjO = 8256;
          this.kjb.kjL = new oicq.wlogin_sdk.b.f();
          this.kjg = this.kjc;
          if (j == 0)
            continue;
          localObject3 = this.kjc.a(522017402L, paramLong, this.kjb.kkh, (byte[])localObject2, this.kji, this.kjh, 8256, this.kjb.kke);
          oicq.wlogin_sdk.c.f.DS("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256" + " end");
          return localObject3;
        case 2:
          if ((paramString == null) || (paramString.length() == 0))
          {
            oicq.wlogin_sdk.c.f.DS("USER_WITH_MD5 userPasswd null");
            return null;
          }
          try
          {
            byte[] arrayOfByte5 = (byte[])paramString.getBytes("ISO-8859-1").clone();
            localObject2 = arrayOfByte5;
            j = 0;
          }
          catch (Exception localException)
          {
            return null;
          }
        case 3:
        }
        WloginSigInfo localWloginSigInfo = this.kjb.k(paramLong, 522017402L);
        if ((localWloginSigInfo == null) || (localWloginSigInfo.kkp == null) || (localWloginSigInfo.kkp.length <= 0))
        {
          oicq.wlogin_sdk.c.f.DS("userAccount:" + paramLong + " appid:522017402" + " GetA1ByAccount return: null");
          localObject2 = null;
          if ((localObject2 == null) || (localObject2.length < 16))
          {
            oicq.wlogin_sdk.c.f.DS("USER_WITH_A1 tmp_pwd null");
            return null;
          }
        }
        else
        {
          oicq.wlogin_sdk.c.f.DS("userAccount:" + paramLong + " appid:522017402" + " GetA1ByAccount return: not null");
          localObject2 = (byte[])localWloginSigInfo.kkp.clone();
          continue;
          byte[] arrayOfByte1 = new byte[4];
          oicq.wlogin_sdk.c.f.c(arrayOfByte1, 0, k.beP());
          l locall = this.kjc;
          byte[] arrayOfByte2 = this.kjb.kkh;
          int k = this.kji;
          int m = this.kjh;
          byte[] arrayOfByte3 = this.kjb.kke;
          byte[] arrayOfByte4 = locall.a(522017402L, paramLong, arrayOfByte2, arrayOfByte1, (byte[])localObject2, k, m, 8256, arrayOfByte3);
          localObject3 = arrayOfByte4;
          continue;
        }
      }
      finally
      {
      }
      int j = 1;
    }
  }

  public final int dd(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0) || (this.kjg == null))
      return -1017;
    oicq.wlogin_sdk.c.f.DS("user:" + this.kjb.kja + " ResolveSvrData ...");
    int i = this.kjg.s(paramArrayOfByte, paramArrayOfByte.length);
    if (i == 1)
      ds(this.kjb.kja);
    oicq.wlogin_sdk.c.f.DS("user:" + this.kjb.kja + " ResolveSvrData ret=" + i);
    return i;
  }

  public final byte[] dq(long paramLong)
  {
    try
    {
      byte[] arrayOfByte = this.kjb.kjM.beT();
      oicq.wlogin_sdk.c.f.DS("user:" + paramLong + " GetPicture data len:" + arrayOfByte.length);
      return arrayOfByte;
    }
    finally
    {
    }
  }

  public final b dr(long paramLong)
  {
    WloginSigInfo localWloginSigInfo = this.kjb.k(paramLong, 522017402L);
    if (localWloginSigInfo == null)
      return null;
    b localb = new b();
    localb.a(localWloginSigInfo);
    return localb;
  }

  public final void ds(long paramLong)
  {
    oicq.wlogin_sdk.c.f.DS("user:" + paramLong + " ClearUserSigInfo");
    this.kjb.c(Long.valueOf(paramLong));
  }

  public final byte[] h(long paramLong, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return null;
    oicq.wlogin_sdk.c.f.DS("user:" + paramLong + " CheckPicture ...");
    try
    {
      this.kjg = this.kje;
      byte[] arrayOfByte = this.kje.dg(paramArrayOfByte);
      oicq.wlogin_sdk.c.f.DS("user:" + paramLong + " CheckPicture end");
      return arrayOfByte;
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.d
 * JD-Core Version:    0.6.2
 */