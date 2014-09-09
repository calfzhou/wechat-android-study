package com.tencent.mm.compatible.audio;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ch;

final class z
  implements q
{
  z(SimpleMediaRecorder paramSimpleMediaRecorder)
  {
  }

  private static byte[] g(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt % 2 != 0)
      paramInt--;
    if (paramInt <= 0)
      return null;
    byte[] arrayOfByte = new byte[paramInt / 2];
    for (int i = 0; i < paramInt / 2; i += 2)
    {
      arrayOfByte[i] = paramArrayOfByte[(i * 2)];
      arrayOfByte[(i + 1)] = paramArrayOfByte[(1 + i * 2)];
    }
    return arrayOfByte;
  }

  private void h(byte[] paramArrayOfByte, int paramInt)
  {
    for (int i = 0; i < paramInt / 2; i++)
    {
      int j = paramArrayOfByte[(i * 2)];
      int k = paramArrayOfByte[(1 + i * 2)];
      int m = (short)(j & 0xFF | k << 8);
      if (m > SimpleMediaRecorder.l(this.dKP))
        SimpleMediaRecorder.b(this.dKP, m);
    }
  }

  public final void e(byte[] paramArrayOfByte, int paramInt)
  {
    if (SimpleMediaRecorder.c(this.dKP) == af.dKX)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "recorder has been stopped");
      return;
    }
    long l = ch.ac(SimpleMediaRecorder.d(this.dKP));
    if ((SimpleMediaRecorder.e(this.dKP) > 0L) && (l > SimpleMediaRecorder.e(this.dKP)))
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "Stop now ! expire duration ms:" + l);
      this.dKP.md();
      SimpleMediaRecorder.a(this.dKP).mj();
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "read :" + paramInt + " time: " + SimpleMediaRecorder.f(this.dKP).nM() + " inPer:" + SimpleMediaRecorder.g(this.dKP));
    if (paramInt < 0)
    {
      if (SimpleMediaRecorder.c(this.dKP) == af.dKX)
      {
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", "recorder has been stopped");
        return;
      }
      this.dKP.md();
      SimpleMediaRecorder.a(this.dKP).mj();
      return;
    }
    SimpleMediaRecorder.a(this.dKP, paramInt);
    if (SimpleMediaRecorder.h(this.dKP) == 16000)
    {
      paramArrayOfByte = g(paramArrayOfByte, paramInt);
      paramInt = paramArrayOfByte.length;
    }
    h(paramArrayOfByte, paramInt);
    if (SimpleMediaRecorder.i(this.dKP) == null)
    {
      SimpleMediaRecorder.a(this.dKP, new aa());
      aa.a(SimpleMediaRecorder.i(this.dKP), SimpleMediaRecorder.j(this.dKP), SimpleMediaRecorder.k(this.dKP));
    }
    SimpleMediaRecorder.i(this.dKP).i(paramArrayOfByte, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.z
 * JD-Core Version:    0.6.2
 */