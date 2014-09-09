package com.tencent.mm.modelvoice;

import com.tencent.mm.ah.k;
import com.tencent.mm.compatible.audio.c;
import com.tencent.mm.compatible.audio.q;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class h
  implements q
{
  h(MediaRecorder paramMediaRecorder)
  {
  }

  private static byte[] g(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt % 4;
    if (i != 0)
      paramInt -= i;
    if (paramInt <= 0)
      return null;
    byte[] arrayOfByte = new byte[paramInt / 2];
    for (int j = 0; j < paramInt / 2; j += 2)
    {
      arrayOfByte[j] = paramArrayOfByte[(j * 2)];
      arrayOfByte[(j + 1)] = paramArrayOfByte[(1 + j * 2)];
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
      if (m > MediaRecorder.r(this.dGG))
        MediaRecorder.b(this.dGG, m);
    }
  }

  public final void e(byte[] paramArrayOfByte, int paramInt)
  {
    if (MediaRecorder.c(this.dGG) == s.dGW)
    {
      z.w("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "recorder has been stopped");
      return;
    }
    long l = ch.ac(MediaRecorder.d(this.dGG));
    if ((MediaRecorder.e(this.dGG) > 0L) && (l > MediaRecorder.e(this.dGG)))
    {
      z.w("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Stop now ! expire duration ms:" + l);
      this.dGG.md();
      MediaRecorder.a(this.dGG).mj();
      return;
    }
    z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "read :" + paramInt + " time: " + MediaRecorder.f(this.dGG).nM() + " inPer:" + MediaRecorder.g(this.dGG));
    if (paramInt < 0)
    {
      if (MediaRecorder.c(this.dGG) == s.dGW)
      {
        z.w("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "recorder has been stopped");
        return;
      }
      this.dGG.md();
      MediaRecorder.a(this.dGG).mj();
      return;
    }
    MediaRecorder.a(this.dGG, paramInt);
    if ((MediaRecorder.h(this.dGG) == null) && ((this.dGG.Bh()) || (MediaRecorder.i(this.dGG) == c.dJJ)) && (MediaRecorder.j(this.dGG) != null) && (MediaRecorder.k(this.dGG)))
    {
      MediaRecorder.a(this.dGG, new k());
      MediaRecorder.h(this.dGG).hy(ch.CM());
    }
    if (MediaRecorder.h(this.dGG) != null)
      MediaRecorder.h(this.dGG).w(paramArrayOfByte);
    if (MediaRecorder.i(this.dGG) == c.dJJ)
    {
      h(paramArrayOfByte, paramInt);
      if (MediaRecorder.l(this.dGG) == null)
      {
        MediaRecorder localMediaRecorder = this.dGG;
        int i = MediaRecorder.m(this.dGG);
        MediaRecorder.n(this.dGG);
        MediaRecorder.a(localMediaRecorder, new o(i));
        MediaRecorder.l(this.dGG).im(MediaRecorder.o(this.dGG));
      }
      MediaRecorder.l(this.dGG).i(paramArrayOfByte, paramInt);
      return;
    }
    if (MediaRecorder.m(this.dGG) == 16000)
    {
      paramArrayOfByte = g(paramArrayOfByte, paramInt);
      paramInt = paramArrayOfByte.length;
    }
    h(paramArrayOfByte, paramInt);
    if (MediaRecorder.p(this.dGG) == null)
    {
      MediaRecorder.a(this.dGG, new j());
      MediaRecorder.p(this.dGG).d(MediaRecorder.q(this.dGG), MediaRecorder.o(this.dGG));
    }
    MediaRecorder.p(this.dGG).i(paramArrayOfByte, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.h
 * JD-Core Version:    0.6.2
 */