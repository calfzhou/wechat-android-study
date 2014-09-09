package com.tencent.mm.ap.a;

import java.util.Map;

public final class ab
  implements aj
{
  private static d a(z paramz, int paramInt1, int paramInt2, int paramInt3)
  {
    f localf = paramz.aMc();
    if (localf == null)
      throw new IllegalStateException();
    int i = localf.getWidth();
    int j = localf.getHeight();
    int k = i + (paramInt3 << 1);
    int m = j + (paramInt3 << 1);
    int n = Math.max(paramInt1, k);
    int i1 = Math.max(paramInt2, m);
    int i2 = Math.min(n / k, i1 / m);
    int i3 = (n - i * i2) / 2;
    int i4 = (i1 - j * i2) / 2;
    d locald = new d(n, i1);
    int i5 = i4;
    int i9;
    for (int i6 = 0; i6 < j; i6 = i9)
    {
      int i7 = 0;
      int i8 = i3;
      while (i7 < i)
      {
        if (localf.aP(i7, i6) == 1)
          locald.d(i8, i5, i2, i2);
        i7++;
        i8 += i2;
      }
      i9 = i6 + 1;
      i5 += i2;
    }
    return locald;
  }

  public final d a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (paramString.length() == 0)
      throw new IllegalArgumentException("Found empty contents");
    if (parama != a.iyM)
      throw new IllegalArgumentException("Can only encode QR_CODE, but got " + parama);
    if ((paramInt1 < 0) || (paramInt2 < 0))
      throw new IllegalArgumentException("Requested dimensions are too small: " + paramInt1 + 'x' + paramInt2);
    Object localObject = o.izV;
    Integer localInteger;
    if (paramMap != null)
    {
      o localo = (o)paramMap.get(l.izG);
      if (localo != null)
        localObject = localo;
      localInteger = (Integer)paramMap.get(l.izL);
      if (localInteger == null);
    }
    for (int i = localInteger.intValue(); ; i = 4)
      return a(m.a(paramString, (o)localObject, paramMap), paramInt1, paramInt2, i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.ab
 * JD-Core Version:    0.6.2
 */