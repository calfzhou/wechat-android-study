package com.tencent.mm.modelstat;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.sdk.platformtools.ch;
import java.io.RandomAccessFile;

final class q
{
  long[] dFf = new long[20];

  public q()
  {
    for (int i = 0; i < 20; i++)
      this.dFf[i] = 0L;
    long l = ch.CL();
    this.dFf[0] = l;
  }

  public final void H(int paramInt1, int paramInt2)
  {
    this.dFf[paramInt1] += paramInt2;
  }

  public final int a(RandomAccessFile paramRandomAccessFile)
  {
    int i;
    try
    {
      if (paramRandomAccessFile.length() < 160L)
        return 0 - k.nJ();
      paramRandomAccessFile.seek(0L);
      for (int j = 0; ; j++)
      {
        i = 0;
        if (j >= 20)
          break;
        this.dFf[j] = paramRandomAccessFile.readLong();
      }
    }
    catch (Exception localException)
    {
      i = 0 - k.nJ();
    }
    return i;
  }

  public final int b(RandomAccessFile paramRandomAccessFile)
  {
    int i;
    try
    {
      paramRandomAccessFile.seek(0L);
      for (int j = 0; ; j++)
      {
        i = 0;
        if (j >= 20)
          break;
        paramRandomAccessFile.writeLong(this.dFf[j]);
      }
    }
    catch (Exception localException)
    {
      i = 0 - k.nJ();
    }
    return i;
  }

  public final void eC(int paramInt)
  {
    this.dFf[paramInt] = (1L + this.dFf[paramInt]);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.q
 * JD-Core Version:    0.6.2
 */