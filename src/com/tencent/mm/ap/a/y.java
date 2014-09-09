package com.tencent.mm.ap.a;

import com.tencent.mm.sdk.platformtools.ch;
import java.util.Map;

public abstract class y
  implements aj
{
  protected static int a(boolean[] paramArrayOfBoolean, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int k = 0;
    int m = paramInt;
    if (j < i)
    {
      int n = paramArrayOfInt[j];
      int i1 = m;
      int i2 = 0;
      while (i2 < n)
      {
        int i3 = i1 + 1;
        paramArrayOfBoolean[i1] = paramBoolean;
        i2++;
        i1 = i3;
      }
      k += n;
      if (!paramBoolean);
      for (boolean bool = true; ; bool = false)
      {
        j++;
        paramBoolean = bool;
        m = i1;
        break;
      }
    }
    return k;
  }

  private static d a(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramArrayOfBoolean.length;
    int j = i + paramInt3;
    int k = Math.max(paramInt1, j);
    int m = Math.max(1, paramInt2);
    int n = k / j;
    int i1 = (k - i * n) / 2;
    d locald = new d(k, m);
    int i2 = 0;
    while (i2 < i)
    {
      if (paramArrayOfBoolean[i2] != 0)
        locald.d(i1, 0, n, m);
      i2++;
      i1 += n;
    }
    return locald;
  }

  public abstract boolean[] Ax(String paramString);

  public d a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (ch.jb(paramString))
      throw new IllegalArgumentException("Found empty contents");
    if ((paramInt1 < 0) || (paramInt2 < 0))
      throw new IllegalArgumentException("Negative size is not allowed. Input: " + paramInt1 + 'x' + paramInt2);
    int i = aMb();
    Integer localInteger;
    if (paramMap != null)
    {
      localInteger = (Integer)paramMap.get(l.izL);
      if (localInteger == null);
    }
    for (int j = localInteger.intValue(); ; j = i)
      return a(Ax(paramString), paramInt1, paramInt2, j);
  }

  public int aMb()
  {
    return 10;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.y
 * JD-Core Version:    0.6.2
 */