package oicq.wlogin_sdk.a;

import android.content.Context;
import java.security.SecureRandom;
import oicq.wlogin_sdk.b.g;
import oicq.wlogin_sdk.c.b;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;

public final class k
{
  public static byte[] kjS = new byte[0];
  public SecureRandom kjH = new SecureRandom();
  public byte[] kjI = oicq.wlogin_sdk.c.f.bfp();
  public byte[] kjJ = null;
  public byte[] kjK = new byte[16];
  public oicq.wlogin_sdk.b.f kjL = new oicq.wlogin_sdk.b.f();
  public g kjM = new g();
  public long kjN = 0L;
  public int kjO = 0;
  public long kjP = -1L;
  public int kjQ = 0;
  byte[] kjR = new byte[0];
  byte[] kjT = new byte[0];
  int kjU = 0;
  byte[] kjV = new byte[0];
  byte[] kjW = new byte[0];
  byte[] kjX = new byte[0];
  byte[] kjY = new byte[0];
  byte[] kjZ = new byte[0];
  public long kja = 0L;
  public Context kjp = null;
  byte[] kka = new byte[0];
  int kkb = 0;
  int kkc = 0;
  int kkd = 0;
  byte[] kke = new byte[0];
  b kkf = new b();
  byte[] kkg = new byte[0];
  byte[] kkh = new byte[4];
  f kki = null;

  public static long beP()
  {
    return System.currentTimeMillis() / 1000L;
  }

  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[] paramArrayOfByte13, byte[] paramArrayOfByte14, byte[] paramArrayOfByte15, byte[] paramArrayOfByte16, byte[][] paramArrayOfByte)
  {
    try
    {
      oicq.wlogin_sdk.c.f.DS("put siginfo:" + paramLong1 + "," + paramLong2 + "," + paramLong3 + "," + paramLong4 + "," + paramLong5 + "," + paramLong6 + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte1) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte2) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte3) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte4) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte5) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte6) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte7) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte8) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte9) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte10) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte11) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte12) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte13) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte14) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte15) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte16));
      Object localObject2 = "";
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte.length)
        {
          oicq.wlogin_sdk.c.f.DS("reserve:" + (String)localObject2);
          int j = this.kki.a(paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3, paramArrayOfByte4, paramArrayOfByte5, paramArrayOfByte6, paramArrayOfByte7, paramArrayOfByte8, paramArrayOfByte9, paramArrayOfByte10, paramArrayOfByte11, paramArrayOfByte12, paramArrayOfByte13, paramArrayOfByte14, paramArrayOfByte15, paramArrayOfByte16, paramArrayOfByte);
          return j;
        }
        String str = localObject2 + "reserve[i]:" + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte[i]);
        localObject2 = str;
      }
    }
    finally
    {
    }
  }

  public final int a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      oicq.wlogin_sdk.c.f.AY("put st sig:" + paramLong1 + "," + paramLong2 + "," + paramLong3 + "," + paramLong4 + ",," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte1) + "," + oicq.wlogin_sdk.c.f.dq(paramArrayOfByte2));
      int i = this.kki.a(paramLong1, paramLong2, paramLong3, paramLong4, paramArrayOfByte1, paramArrayOfByte2);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void c(Long paramLong)
  {
    try
    {
      this.kki.c(paramLong);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final WloginSigInfo k(long paramLong1, long paramLong2)
  {
    try
    {
      oicq.wlogin_sdk.c.f.bS("get_siginfo", "uin=" + paramLong1 + "appid=522017402");
      WloginSigInfo localWloginSigInfo = this.kki.k(paramLong1, 522017402L);
      if (localWloginSigInfo != null);
      return localWloginSigInfo;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.k
 * JD-Core Version:    0.6.2
 */