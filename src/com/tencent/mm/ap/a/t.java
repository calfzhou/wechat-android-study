package com.tencent.mm.ap.a;

final class t
{
  private static final int[][] iAq = { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
  private static final int[][] iAr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
  private static final int[][] iAs = { { -1, -1, -1, -1, -1, -1, -1 }, { 6, 18, -1, -1, -1, -1, -1 }, { 6, 22, -1, -1, -1, -1, -1 }, { 6, 26, -1, -1, -1, -1, -1 }, { 6, 30, -1, -1, -1, -1, -1 }, { 6, 34, -1, -1, -1, -1, -1 }, { 6, 22, 38, -1, -1, -1, -1 }, { 6, 24, 42, -1, -1, -1, -1 }, { 6, 26, 46, -1, -1, -1, -1 }, { 6, 28, 50, -1, -1, -1, -1 }, { 6, 30, 54, -1, -1, -1, -1 }, { 6, 32, 58, -1, -1, -1, -1 }, { 6, 34, 62, -1, -1, -1, -1 }, { 6, 26, 46, 66, -1, -1, -1 }, { 6, 26, 48, 70, -1, -1, -1 }, { 6, 26, 50, 74, -1, -1, -1 }, { 6, 30, 54, 78, -1, -1, -1 }, { 6, 30, 56, 82, -1, -1, -1 }, { 6, 30, 58, 86, -1, -1, -1 }, { 6, 34, 62, 90, -1, -1, -1 }, { 6, 28, 50, 72, 94, -1, -1 }, { 6, 26, 50, 74, 98, -1, -1 }, { 6, 30, 54, 78, 102, -1, -1 }, { 6, 28, 54, 80, 106, -1, -1 }, { 6, 32, 58, 84, 110, -1, -1 }, { 6, 30, 58, 86, 114, -1, -1 }, { 6, 34, 62, 90, 118, -1, -1 }, { 6, 26, 50, 74, 98, 122, -1 }, { 6, 30, 54, 78, 102, 126, -1 }, { 6, 26, 52, 78, 104, 130, -1 }, { 6, 30, 56, 82, 108, 134, -1 }, { 6, 34, 60, 86, 112, 138, -1 }, { 6, 30, 58, 86, 114, 142, -1 }, { 6, 34, 62, 90, 118, 146, -1 }, { 6, 30, 54, 78, 102, 126, 150 }, { 6, 24, 50, 76, 102, 128, 154 }, { 6, 28, 54, 80, 106, 132, 158 }, { 6, 32, 58, 84, 110, 136, 162 }, { 6, 26, 54, 82, 110, 138, 166 }, { 6, 30, 58, 86, 114, 142, 170 } };
  private static final int[][] iAt = { { 8, 0 }, { 8, 1 }, { 8, 2 }, { 8, 3 }, { 8, 4 }, { 8, 5 }, { 8, 7 }, { 8, 8 }, { 7, 8 }, { 5, 8 }, { 4, 8 }, { 3, 8 }, { 2, 8 }, { 1, 8 }, { 0, 8 } };

  private static void a(int paramInt1, int paramInt2, f paramf)
  {
    for (int i = 0; i < 8; i++)
    {
      if (!nT(paramf.aP(paramInt1 + i, paramInt2)))
        throw new ak();
      paramf.set(paramInt1 + i, paramInt2, 0);
    }
  }

  private static void a(ag paramag, f paramf)
  {
    if (paramag.aMd() < 7);
    while (true)
    {
      return;
      c localc = new c();
      localc.aN(paramag.aMd(), 6);
      localc.aN(aV(paramag.aMd(), 7973), 12);
      if (localc.getSize() != 18)
        throw new ak("should not happen but we got: " + localc.getSize());
      int i = 17;
      int j = 0;
      while (j < 6)
      {
        int k = i;
        for (int m = 0; m < 3; m++)
        {
          boolean bool = localc.get(k);
          k--;
          paramf.set(j, m + (-11 + paramf.getHeight()), bool);
          paramf.set(m + (-11 + paramf.getHeight()), j, bool);
        }
        j++;
        i = k;
      }
    }
  }

  private static void a(c paramc, int paramInt, f paramf)
  {
    int i = -1 + paramf.getWidth();
    int j = -1 + paramf.getHeight();
    int k = -1;
    int m = 0;
    int n;
    int i1;
    int i2;
    if (i > 0)
    {
      if (i != 6)
        break label473;
      int i13 = i - 1;
      n = j;
      i1 = i13;
      i2 = m;
    }
    while (true)
      if ((n >= 0) && (n < paramf.getHeight()))
      {
        int i6 = 0;
        if (i6 < 2)
        {
          int i7 = i1 - i6;
          int i8;
          int i9;
          label215: int i10;
          if (nT(paramf.aP(i7, n)))
          {
            if (i2 < paramc.getSize())
            {
              boolean bool2 = paramc.get(i2);
              i8 = i2 + 1;
              bool1 = bool2;
            }
            while (paramInt != -1)
              switch (paramInt)
              {
              default:
                throw new IllegalArgumentException("Invalid mask pattern: " + paramInt);
                i8 = i2;
                bool1 = false;
                break;
              case 0:
                i9 = 0x1 & n + i7;
                if (i9 != 0)
                  break label368;
                i10 = 1;
                label223: if (i10 != 0)
                  if (bool1)
                    break label374;
                break;
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              }
          }
          label368: label374: for (boolean bool1 = true; ; bool1 = false)
          {
            paramf.set(i7, n, bool1);
            i2 = i8;
            i6++;
            break;
            i9 = n & 0x1;
            break label215;
            i9 = i7 % 3;
            break label215;
            i9 = (n + i7) % 3;
            break label215;
            i9 = 0x1 & (n >>> 1) + i7 / 3;
            break label215;
            int i12 = n * i7;
            i9 = (i12 & 0x1) + i12 % 3;
            break label215;
            int i11 = n * i7;
            i9 = 0x1 & (i11 & 0x1) + i11 % 3;
            break label215;
            i9 = 0x1 & n * i7 % 3 + (0x1 & n + i7);
            break label215;
            i10 = 0;
            break label223;
          }
        }
        n += k;
      }
      else
      {
        int i3 = -k;
        int i4 = n + i3;
        int i5 = i1 - 2;
        k = i3;
        m = i2;
        j = i4;
        i = i5;
        break;
        if (m != paramc.getSize())
          throw new ak("Not all bits consumed: " + m + '/' + paramc.getSize());
        return;
        label473: n = j;
        i1 = i;
        i2 = m;
      }
  }

  static void a(c paramc, o paramo, ag paramag, int paramInt, f paramf)
  {
    paramf.aLU();
    int i = iAq[0].length;
    c(0, 0, paramf);
    c(paramf.getWidth() - i, 0, paramf);
    c(0, paramf.getWidth() - i, paramf);
    a(0, 7, paramf);
    a(-8 + paramf.getWidth(), 7, paramf);
    a(0, -8 + paramf.getWidth(), paramf);
    b(7, 0, paramf);
    b(-1 + (-7 + paramf.getHeight()), 0, paramf);
    b(7, -7 + paramf.getHeight(), paramf);
    if (paramf.aP(8, -8 + paramf.getHeight()) == 0)
      throw new ak();
    paramf.set(8, -8 + paramf.getHeight(), 1);
    if (paramag.aMd() >= 2)
    {
      int i2 = -1 + paramag.aMd();
      int[] arrayOfInt = iAs[i2];
      int i3 = iAs[i2].length;
      for (int i4 = 0; i4 < i3; i4++)
        for (int i5 = 0; i5 < i3; i5++)
        {
          int i6 = arrayOfInt[i4];
          int i7 = arrayOfInt[i5];
          if ((i7 != -1) && (i6 != -1) && (nT(paramf.aP(i7, i6))))
          {
            int i8 = i7 - 2;
            int i9 = i6 - 2;
            for (int i10 = 0; i10 < 5; i10++)
              for (int i11 = 0; i11 < 5; i11++)
                paramf.set(i8 + i11, i9 + i10, iAr[i10][i11]);
          }
        }
    }
    for (int j = 8; j < -8 + paramf.getWidth(); j++)
    {
      int i1 = (j + 1) % 2;
      if (nT(paramf.aP(j, 6)))
        paramf.set(j, 6, i1);
      if (nT(paramf.aP(6, j)))
        paramf.set(6, j, i1);
    }
    c localc1 = new c();
    if ((paramInt >= 0) && (paramInt < 8));
    for (int k = 1; k == 0; k = 0)
      throw new ak("Invalid mask pattern");
    int m = paramInt | paramo.aLV() << 3;
    localc1.aN(m, 5);
    localc1.aN(aV(m, 1335), 10);
    c localc2 = new c();
    localc2.aN(21522, 15);
    localc1.b(localc2);
    if (localc1.getSize() != 15)
      throw new ak("should not happen but we got: " + localc1.getSize());
    int n = 0;
    if (n < localc1.getSize())
    {
      boolean bool = localc1.get(-1 + localc1.getSize() - n);
      paramf.set(iAt[n][0], iAt[n][1], bool);
      if (n < 8)
        paramf.set(-1 + (paramf.getWidth() - n), 8, bool);
      while (true)
      {
        n++;
        break;
        paramf.set(8, -7 + paramf.getHeight() + (n - 8), bool);
      }
    }
    a(paramag, paramf);
    a(paramc, paramInt, paramf);
  }

  private static int aV(int paramInt1, int paramInt2)
  {
    int i = nS(paramInt2);
    int j = paramInt1 << i - 1;
    while (nS(j) >= i)
      j ^= paramInt2 << nS(j) - i;
    return j;
  }

  private static void b(int paramInt1, int paramInt2, f paramf)
  {
    for (int i = 0; i < 7; i++)
    {
      if (!nT(paramf.aP(paramInt1, paramInt2 + i)))
        throw new ak();
      paramf.set(paramInt1, paramInt2 + i, 0);
    }
  }

  private static void c(int paramInt1, int paramInt2, f paramf)
  {
    for (int i = 0; i < 7; i++)
      for (int j = 0; j < 7; j++)
        paramf.set(paramInt1 + j, paramInt2 + i, iAq[i][j]);
  }

  private static int nS(int paramInt)
  {
    for (int i = 0; paramInt != 0; i++)
      paramInt >>>= 1;
    return i;
  }

  private static boolean nT(int paramInt)
  {
    return paramInt == -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.t
 * JD-Core Version:    0.6.2
 */