package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.model.x;
import com.tencent.mm.plugin.exdevice.c.g;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.CRC32;

public final class f extends e
{
  public f(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JCgyvT4pRY/AQS9JBtUrIQ==", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
  }

  protected final com.tencent.mm.ao.a T(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JCgyvT4pRY/AQS9JBtUrIQ==", "data is null");
      return null;
    }
    com.tencent.mm.plugin.exdevice.c.f localf = new com.tencent.mm.plugin.exdevice.c.f();
    try
    {
      localf.V(paramArrayOfByte);
      z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JCgyvT4pRY/AQS9JBtUrIQ==", "------Init Request parse is ok------ ");
      this.eIl = localf;
      return localf;
    }
    catch (IOException localIOException)
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JCgyvT4pRY/AQS9JBtUrIQ==", "pase error : " + localIOException.getMessage());
    }
    return null;
  }

  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject1 = new Object[6];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = paramString;
    arrayOfObject1[2] = com.tencent.mm.plugin.exdevice.g.a.Z(paramArrayOfByte1);
    arrayOfObject1[3] = com.tencent.mm.plugin.exdevice.g.a.Z(paramArrayOfByte2);
    arrayOfObject1[4] = Integer.valueOf(paramInt2);
    arrayOfObject1[5] = Integer.valueOf(paramInt3);
    z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX6JCgyvT4pRY/AQS9JBtUrIQ==", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", arrayOfObject1);
    g localg = new g();
    localg.eJQ = k(0, "ok");
    String str1 = x.pG();
    String str2;
    long l2;
    int[] arrayOfInt1;
    label176: int m;
    label216: int i;
    if (!ch.jb(str1))
    {
      str2 = aj.AN(str1).toLowerCase();
      z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "user md5 : [%s]", new Object[] { str2 });
      if (ch.jb(str2))
      {
        z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "get hash code failed, value is null or nill");
        l2 = 0L;
        int[] arrayOfInt2 = new int[2];
        arrayOfInt2[0] = ((int)(0xFFFFFFFF & l2 >> 32));
        arrayOfInt2[1] = ((int)(l2 & 0xFFFFFFFF));
        arrayOfInt1 = arrayOfInt2;
        localg.eJD = arrayOfInt1[0];
        localg.eJE = arrayOfInt1[1];
        if (!ch.B(paramArrayOfByte2))
        {
          if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0))
            break label575;
          m = 0;
          localg.eJF = m;
        }
        if (!ch.B(paramArrayOfByte1))
        {
          if ((0x4 & paramArrayOfByte1[0]) != 0)
            localg.dZp = com.tencent.mm.protocal.a.hri;
          if ((0x8 & paramArrayOfByte1[0]) != 0)
            localg.eJK = com.tencent.mm.protocal.a.hrl;
          if ((0x2 & paramArrayOfByte1[0]) != 0)
            localg.eJJ = 2;
          if ((0x10 & paramArrayOfByte1[0]) != 0)
            localg.eJL = ((int)ch.CL());
          if ((0x20 & paramArrayOfByte1[0]) != 0)
          {
            TimeZone localTimeZone = TimeZone.getDefault();
            i = localTimeZone.getRawOffset() / 1000;
            if ((!localTimeZone.useDaylightTime()) || (!localTimeZone.inDaylightTime(new Date(System.currentTimeMillis()))))
              break label602;
          }
        }
      }
    }
    label575: label602: for (int j = 1; ; j = 0)
    {
      int k = j + i / 3600;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = Integer.valueOf(j);
      arrayOfObject2[2] = Integer.valueOf(k);
      z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "getTimeZone, rawSecond = %d, dt = %d, re = %d", arrayOfObject2);
      localg.eJM = k;
      if ((0x40 & paramArrayOfByte1[0]) != 0)
        localg.eJN = com.tencent.mm.plugin.exdevice.g.a.PW();
      if ((0x1 & paramArrayOfByte1[0]) != 0)
        localg.eJI = x.pI();
      localg.eJG = paramInt2;
      localg.eJH = paramInt3;
      this.eIk = localg;
      a((short)20003);
      return;
      char[] arrayOfChar = str2.toCharArray();
      int n = arrayOfChar.length;
      int i1 = 0;
      if (n > 0)
        for (int i2 = 0; i2 < arrayOfChar.length; i2++)
          i1 = i1 * 31 + arrayOfChar[i2];
      long l1 = 0xFFFFFFFF & i1;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(i1);
      arrayOfObject3[1] = Long.valueOf(l1);
      z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "get int hashcode value = %d, long hashcode = %d", arrayOfObject3);
      l2 = l1;
      break;
      arrayOfInt1 = null;
      break label176;
      CRC32 localCRC32 = new CRC32();
      localCRC32.update(paramArrayOfByte2);
      m = (int)localCRC32.getValue();
      break label216;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.f
 * JD-Core Version:    0.6.2
 */