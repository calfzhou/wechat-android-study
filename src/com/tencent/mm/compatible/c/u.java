package com.tencent.mm.compatible.c;

import com.tencent.mm.sdk.platformtools.z;

public final class u
{
  private int dNw = 0;
  private long dNx = 0L;
  private long dNy = 0L;

  public u(t paramt)
  {
  }

  public final void c(String[] paramArrayOfString)
  {
    long l1 = Long.parseLong(paramArrayOfString[4], 10);
    long l2 = 0L;
    int i = 1;
    int j = paramArrayOfString.length;
    int k = 0;
    if (k < j)
    {
      String str = paramArrayOfString[k];
      if (i != 0)
        i = 0;
      while (true)
      {
        k++;
        break;
        l2 += Long.parseLong(str, 10);
      }
    }
    long l3 = l1 - this.dNy;
    long l4 = l2 - this.dNx;
    this.dNw = ((int)(100.0F * ((float)(l4 - l3) / (float)l4)));
    this.dNx = l2;
    this.dNy = l1;
    z.i("!32@l31zBa06gKv3g5PVsxQDw6xSkq6dzCWS", "CPU total=" + l2 + "; idle=" + l1 + "; usage=" + this.dNw);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.u
 * JD-Core Version:    0.6.2
 */