package com.tencent.qqpinyin.voicerecoapi;

public final class c
{
  private TRVADNative kdx = new TRVADNative();
  private int kdy;
  private int kdz;

  public c()
  {
    this.kdy = 500000;
    this.kdz = 10000000;
  }

  public c(int paramInt)
  {
    this.kdy = paramInt;
    this.kdz = 5000000;
  }

  public final void a(short[] paramArrayOfShort, int paramInt, d paramd)
  {
    double d1 = 26.0D;
    int i = 0;
    if (paramInt <= 0)
      label14: return;
    while (true)
    {
      try
      {
        switch (this.kdx.mfeSendData(paramArrayOfShort, paramInt))
        {
        default:
          paramd.kdA = 0;
          break label182;
          label59: paramd.dJi = ((int)d1);
          new StringBuilder("volumn��").append(paramd.dJi);
          break label14;
        case 1:
        case 2:
        case 3:
        }
      }
      finally
      {
      }
      paramd.kdA = 1;
      break label182;
      paramd.kdA = 2;
      break label182;
      paramd.kdA = 3;
      int j;
      label182: 
      do
      {
        double d2 = j;
        double d3 = Math.sqrt(paramArrayOfShort[i] * paramArrayOfShort[i]);
        j = (int)(d2 + d3 / paramInt);
        i++;
        continue;
        if (j > 16383)
          break;
        d1 *= (j - 100.0D) / 32667.0D;
        break;
        j = 0;
      }
      while (i < paramInt);
      if (j >= 100)
        break label59;
      d1 = 0.0D;
    }
  }

  public final int bdp()
  {
    int i = this.kdx.mfeInit(this.kdy, this.kdz);
    if (i == 0)
    {
      i = this.kdx.mfeOpen();
      if (i == 0)
      {
        i = this.kdx.mfeEnableNoiseDetection(true);
        if (i == 0)
          i = this.kdx.mfeStart();
      }
    }
    if (i == 0)
      return 0;
    return -1;
  }

  public final int stop()
  {
    int i = this.kdx.mfeStop();
    if (i == 0)
    {
      i = this.kdx.mfeClose();
      if (i == 0)
        i = this.kdx.mfeExit();
    }
    if (i == 0)
      return 0;
    return -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.c
 * JD-Core Version:    0.6.2
 */