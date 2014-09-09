package c.a.g;

import java.util.Arrays;

public final class a
{
  private static final char[] kmD = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
  private static final int[] kmE;

  static
  {
    int[] arrayOfInt = new int[256];
    kmE = arrayOfInt;
    Arrays.fill(arrayOfInt, -1);
    int i = kmD.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        kmE[61] = 0;
        return;
      }
      kmE[kmD[j]] = j;
    }
  }

  public static final char[] dr(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null);
    for (int i = paramArrayOfByte.length; i == 0; i = 0)
      return new char[0];
    int j = 3 * (i / 3);
    int k = 1 + (i - 1) / 3 << 2;
    int m = k + ((k - 1) / 76 << 1);
    char[] arrayOfChar = new char[m];
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i16;
    int i17;
    if (i2 >= j)
    {
      int i13 = i - j;
      if (i13 > 0)
      {
        int i14 = (0xFF & paramArrayOfByte[j]) << 10;
        int i15 = 0;
        if (i13 == 2)
          i15 = (0xFF & paramArrayOfByte[(i - 1)]) << 2;
        i16 = i15 | i14;
        arrayOfChar[(m - 4)] = kmD[(i16 >> 12)];
        arrayOfChar[(m - 3)] = kmD[(0x3F & i16 >>> 6)];
        i17 = m - 2;
        if (i13 != 2)
          break label401;
      }
    }
    label401: for (int i18 = kmD[(i16 & 0x3F)]; ; i18 = 61)
    {
      arrayOfChar[i17] = i18;
      arrayOfChar[(m - 1)] = '=';
      return arrayOfChar;
      int i3 = i2 + 1;
      int i4 = (0xFF & paramArrayOfByte[i2]) << 16;
      int i5 = i3 + 1;
      int i6 = i4 | (0xFF & paramArrayOfByte[i3]) << 8;
      i2 = i5 + 1;
      int i7 = i6 | 0xFF & paramArrayOfByte[i5];
      int i8 = i1 + 1;
      arrayOfChar[i1] = kmD[(0x3F & i7 >>> 18)];
      int i9 = i8 + 1;
      arrayOfChar[i8] = kmD[(0x3F & i7 >>> 12)];
      int i10 = i9 + 1;
      arrayOfChar[i9] = kmD[(0x3F & i7 >>> 6)];
      i1 = i10 + 1;
      arrayOfChar[i10] = kmD[(i7 & 0x3F)];
      n++;
      if ((n != 19) || (i1 >= m - 2))
        break;
      int i11 = i1 + 1;
      arrayOfChar[i1] = '\r';
      int i12 = i11 + 1;
      arrayOfChar[i11] = '\n';
      i1 = i12;
      n = 0;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.g.a
 * JD-Core Version:    0.6.2
 */