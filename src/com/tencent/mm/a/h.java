package com.tencent.mm.a;

public final class h
{
  public static char a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong, int paramInt1, byte[] paramArrayOfByte3, int paramInt2)
  {
    g localg1 = new g(paramArrayOfByte1);
    g localg2 = new g(paramArrayOfByte2);
    g[] arrayOfg = new g[16];
    for (int i = 0; i < 16; i++)
      arrayOfg[i] = new g(new byte[48]);
    g localg3 = new g(new byte[256]);
    g localg4 = new g(new byte[24]);
    g localg5 = new g(new byte[64]);
    g localg6 = new g();
    g localg7 = new g();
    g localg8 = new g();
    g localg9 = new g();
    g localg10 = new g(new byte[64]);
    g localg11 = new g(new byte[48]);
    g localg12 = new g(new byte[32]);
    g localg13 = new g(new byte[9]);
    g localg14 = new g(new byte[8]);
    long l1;
    if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length > 0))
    {
      l1 = 0xFFFFFFF8 & 7L + paramLong;
      if (l1 != 0L);
    }
    else
    {
      return '\000';
    }
    localg6.cFg = 0;
    localg6.cFe = localg5.cFe;
    localg7.cFg = 28;
    localg7.cFe = localg5.cFe;
    localg8.cFg = 0;
    localg8.cFe = localg10.cFe;
    localg9.cFg = 32;
    localg9.cFe = localg10.cFe;
    a(localg4, 24);
    g localg15 = new g(paramArrayOfByte3);
    if (paramInt1 > 24)
      paramInt1 = 24;
    d(localg4, localg15, paramInt1);
    byte[] arrayOfByte1 = { 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4 };
    byte[] arrayOfByte2 = { 14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32 };
    byte[] arrayOfByte3 = { 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1 };
    b(localg5, localg4, 64);
    a(localg5, localg5, arrayOfByte1, 56, localg3);
    for (int j = 0; j < 16; j++)
    {
      c(localg6, localg3, arrayOfByte3[j]);
      c(localg7, localg3, arrayOfByte3[j]);
      a(arrayOfg[j], localg5, arrayOfByte2, 48, localg3);
    }
    int k = localg2.cFg;
    int m = localg1.cFg;
    if (paramInt2 == 0)
    {
      a(localg1, localg13, arrayOfg, paramInt2, localg10, localg11, localg12, localg8, localg9, localg3);
      d(localg14, localg1, 8);
      localg1.cFg = (8 + localg1.cFg);
      long l5 = 0L;
      long l6 = l1 >> 3;
      while (l5 < l6)
      {
        a(localg14, localg14, localg2);
        a(localg1, localg14, arrayOfg, paramInt2, localg10, localg11, localg12, localg8, localg9, localg3);
        d(localg14, localg1, 8);
        l5 += 1L;
        localg1.cFg = (8 + localg1.cFg);
        localg2.cFg = (8 + localg2.cFg);
      }
    }
    d(localg13, localg2, 8);
    localg2.cFg = (8 + localg2.cFg);
    long l2 = l1 >> 3;
    long l4;
    for (long l3 = 1L; l3 < l2; l3 = l4)
    {
      a(localg14, localg2, arrayOfg, paramInt2, localg10, localg11, localg12, localg8, localg9, localg3);
      a(localg1, localg14, localg13);
      d(localg13, localg2, 8);
      l4 = 1L + l3;
      localg1.cFg = (8 + localg1.cFg);
      localg2.cFg = (8 + localg2.cFg);
    }
    localg2.cFg = k;
    localg1.cFg = m;
    return '\001';
  }

  private static void a(g paramg, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramg.cFe[(i + paramg.cFg)] = 0;
  }

  private static void a(g paramg1, g paramg2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
    {
      byte[] arrayOfByte = paramg1.cFe;
      int j = i + paramg1.cFg;
      arrayOfByte[j] = ((byte)(arrayOfByte[j] ^ paramg2.cFe[(i + paramg2.cFg)]));
    }
  }

  private static void a(g paramg1, g paramg2, g paramg3)
  {
    for (int i = 0; i < 8; i++)
      paramg1.cFe[(i + paramg1.cFg)] = ((byte)(paramg2.cFe[(i + paramg2.cFg)] ^ paramg3.cFe[(i + paramg3.cFg)]));
  }

  private static void a(g paramg1, g paramg2, g paramg3, g paramg4)
  {
    int i = 0;
    byte[] arrayOfByte1 = { 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1 };
    byte[] arrayOfByte2 = { 16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25 };
    a(paramg3, paramg1, arrayOfByte1, 48, paramg4);
    a(paramg3, paramg2, 48);
    byte[][][] arrayOfByte = { { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 }, { 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 }, { 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 }, { 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } }, { { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10 }, { 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 }, { 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 }, { 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 } }, { { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 }, { 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 }, { 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 }, { 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 } }, { { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 }, { 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 }, { 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 }, { 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 } }, { { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 }, { 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 }, { 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 }, { 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 } }, { { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 }, { 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 }, { 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 }, { 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } }, { { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 }, { 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 }, { 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 }, { 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 } }, { { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 }, { 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 }, { 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 }, { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 } } };
    int j = paramg3.cFg;
    int k = paramg1.cFg;
    while (i < 8)
    {
      int m = (byte)((paramg3.cFe[(0 + paramg3.cFg)] << 1) + paramg3.cFe[(5 + paramg3.cFg)]);
      int n = (byte)((paramg3.cFe[(1 + paramg3.cFg)] << 3) + (paramg3.cFe[(2 + paramg3.cFg)] << 2) + (paramg3.cFe[(3 + paramg3.cFg)] << 1) + paramg3.cFe[(4 + paramg3.cFg)]);
      b(paramg1, new g(arrayOfByte[i][m][n]), 4);
      i = (byte)(i + 1);
      paramg3.cFg = (6 + paramg3.cFg);
      paramg1.cFg = (4 + paramg1.cFg);
    }
    paramg3.cFg = j;
    paramg1.cFg = k;
    a(paramg1, paramg1, arrayOfByte2, 32, paramg4);
  }

  private static void a(g paramg1, g paramg2, byte[] paramArrayOfByte, int paramInt, g paramg3)
  {
    for (int i = 0; i < paramInt; i++)
      paramg3.cFe[(i + paramg3.cFg)] = paramg2.cFe[(-1 + (paramg2.cFg + paramArrayOfByte[i]))];
    d(paramg1, paramg3, paramInt);
  }

  private static void a(g paramg1, g paramg2, g[] paramArrayOfg, int paramInt, g paramg3, g paramg4, g paramg5, g paramg6, g paramg7, g paramg8)
  {
    byte[] arrayOfByte1 = { 58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7 };
    byte[] arrayOfByte2 = { 40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25 };
    b(paramg3, paramg2, 64);
    a(paramg3, paramg3, arrayOfByte1, 64, paramg8);
    if (paramInt == 0)
      for (int m = 0; m < 16; m++)
      {
        d(paramg5, paramg7, 32);
        a(paramg7, paramArrayOfg[m], paramg4, paramg8);
        a(paramg7, paramg6, 32);
        d(paramg6, paramg5, 32);
      }
    for (int i = 15; i >= 0; i--)
    {
      d(paramg5, paramg6, 32);
      a(paramg6, paramArrayOfg[i], paramg4, paramg8);
      a(paramg6, paramg7, 32);
      d(paramg7, paramg5, 32);
    }
    a(paramg3, paramg3, arrayOfByte2, 64, paramg8);
    a(paramg1, 8);
    for (int j = 0; j < 64; j++)
    {
      byte[] arrayOfByte3 = paramg1.cFe;
      int k = paramg1.cFg + (j >> 3);
      arrayOfByte3[k] = ((byte)(arrayOfByte3[k] | paramg3.cFe[(j + paramg3.cFg)] << (j & 0x7)));
    }
  }

  private static void b(g paramg1, g paramg2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramg1.cFe[(i + paramg1.cFg)] = ((byte)(0x1 & paramg2.cFe[((i >> 3) + paramg2.cFg)] >> (i & 0x7)));
  }

  private static void c(g paramg1, g paramg2, int paramInt)
  {
    d(paramg2, paramg1, paramInt);
    int k;
    for (int i = 0; ; i++)
    {
      int j = 28 - paramInt;
      k = 0;
      if (i >= j)
        break;
      paramg1.cFe[(i + paramg1.cFg)] = paramg1.cFe[(paramInt + (i + paramg1.cFg))];
    }
    while (k < paramInt)
    {
      paramg1.cFe[(28 + (k + paramg1.cFg) - paramInt)] = paramg2.cFe[(k + paramg2.cFg)];
      k++;
    }
  }

  private static void d(g paramg1, g paramg2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      paramg1.cFe[(i + paramg1.cFg)] = paramg2.cFe[(i + paramg2.cFg)];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.h
 * JD-Core Version:    0.6.2
 */