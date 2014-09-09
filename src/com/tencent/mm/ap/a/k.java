package com.tencent.mm.ap.a;

import java.util.Map;

public final class k extends af
{
  public final boolean[] Ax(String paramString)
  {
    if (paramString.length() != 13)
      throw new IllegalArgumentException("Requested contents should be 13 digits long, but got " + paramString.length());
    try
    {
      if (!ae.t(paramString))
        throw new IllegalArgumentException("Contents do not pass checksum");
    }
    catch (p localp)
    {
      throw new IllegalArgumentException("Illegal contents");
    }
    int i = Integer.parseInt(paramString.substring(0, 1));
    int j = j.izF[i];
    boolean[] arrayOfBoolean = new boolean[95];
    int k = 0 + a(arrayOfBoolean, 0, ae.iAN, true);
    int m = 1;
    int n = k;
    while (m <= 6)
    {
      int i4 = Integer.parseInt(paramString.substring(m, m + 1));
      if ((0x1 & j >> 6 - m) == 1)
        i4 += 10;
      n += a(arrayOfBoolean, n, ae.iAQ[i4], false);
      m++;
    }
    int i1 = n + a(arrayOfBoolean, n, ae.iAO, false);
    for (int i2 = 7; i2 <= 12; i2++)
    {
      int i3 = Integer.parseInt(paramString.substring(i2, i2 + 1));
      i1 += a(arrayOfBoolean, i1, ae.iAP[i3], true);
    }
    a(arrayOfBoolean, i1, ae.iAN, true);
    return arrayOfBoolean;
  }

  public final d a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama != a.iyI)
      throw new IllegalArgumentException("Can only encode EAN_13, but got " + parama);
    return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.k
 * JD-Core Version:    0.6.2
 */