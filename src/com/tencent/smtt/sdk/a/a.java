package com.tencent.smtt.sdk.a;

import java.lang.reflect.Array;

public final class a
{
  public static final byte[] KEY = { -25, -101, -115, 1, 47, 7, -27, -59, 18, -128, 123, 79, -44, 37, 46, 115 };
  private static final int[] keZ = { 58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7 };
  private static final int[] kfa = { 40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25 };
  private static final int[] kfb = { 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4 };
  private static final int[] kfc = { 14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32 };
  private static final int[] kfd = { 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1 };
  private static final int[] kfe = { 16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25 };
  private static final int[][][] kff = { { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 }, { 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 }, { 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 }, { 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } }, { { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10 }, { 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 }, { 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 }, { 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 } }, { { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 }, { 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 }, { 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 }, { 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 } }, { { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 }, { 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 }, { 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 }, { 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 } }, { { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 }, { 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 }, { 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 }, { 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3 } }, { { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 }, { 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 }, { 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 }, { 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } }, { { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 }, { 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 }, { 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 }, { 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 } }, { { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 }, { 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 }, { 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 }, { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 } } };
  private static final int[] kfg = { 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1 };
  public static final byte[] kfh = { 98, -24, 57, -84, -115, 117, 55, 121 };
  public static final byte[] kfi = { 37, -110, 60, 127, 42, -27, -17, -110 };
  public static final byte[] kfj = { -122, -8, -23, -84, -125, 113, 84, 99 };
  public static final byte[] kfk = "AL!#$AC9Ahg@KLJ1".getBytes();

  private static int[] cU(byte[] paramArrayOfByte)
  {
    int[] arrayOfInt1 = new int[8];
    for (int i = 0; i < 8; i++)
    {
      arrayOfInt1[i] = paramArrayOfByte[i];
      if (arrayOfInt1[i] < 0)
      {
        arrayOfInt1[i] = (256 + arrayOfInt1[i]);
        arrayOfInt1[i] %= 256;
      }
    }
    int[] arrayOfInt2 = new int[64];
    for (int j = 0; j < 8; j++)
      for (int k = 0; k < 8; k++)
      {
        arrayOfInt2[(7 + j * 8 - k)] = (arrayOfInt1[j] % 2);
        arrayOfInt1[j] /= 2;
      }
    return arrayOfInt2;
  }

  public static byte[] h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte1 == null))
      return paramArrayOfByte2;
    label1139: label1271: 
    while (true)
    {
      int i4;
      int i6;
      int i7;
      int i9;
      int i8;
      int i11;
      int i13;
      int i15;
      int i14;
      int i17;
      int i18;
      int i20;
      int i19;
      try
      {
        byte[] arrayOfByte1 = new byte[8];
        int i = 0;
        if (i < 8)
        {
          arrayOfByte1[i] = 0;
          i++;
          continue;
        }
        int m;
        byte[] arrayOfByte2;
        if (paramArrayOfByte1.length > 8)
        {
          System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 0, 8);
          int j = paramArrayOfByte2.length;
          int k = 8 - j % 8;
          m = j + k;
          arrayOfByte2 = new byte[m];
          System.arraycopy(paramArrayOfByte2, 0, arrayOfByte2, 0, j);
          if (j < m)
          {
            arrayOfByte2[j] = ((byte)k);
            j++;
            continue;
          }
        }
        else
        {
          System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 0, paramArrayOfByte1.length);
          continue;
        }
        int n = m / 8;
        byte[] arrayOfByte3 = new byte[m];
        int i1 = 0;
        if (i1 < n)
        {
          byte[] arrayOfByte4 = new byte[8];
          byte[] arrayOfByte5 = new byte[8];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte4, 0, 8);
          System.arraycopy(arrayOfByte2, i1 * 8, arrayOfByte5, 0, 8);
          int[] arrayOfInt1 = { 16, 48 };
          int[][] arrayOfInt2 = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt1);
          int[] arrayOfInt3 = cU(arrayOfByte4);
          int[] arrayOfInt4 = cU(arrayOfByte5);
          int[] arrayOfInt5 = new int[56];
          int i2 = 0;
          if (i2 >= 56)
            break label1139;
          arrayOfInt5[i2] = arrayOfInt3[(-1 + kfb[i2])];
          i2++;
          continue;
          if (i3 < 16)
          {
            i4 = kfg[i3];
            int[] arrayOfInt6 = new int[28];
            int[] arrayOfInt7 = new int[28];
            int[] arrayOfInt8 = new int[28];
            int[] arrayOfInt9 = new int[28];
            int i5 = 0;
            if (i5 >= 28)
              break label1145;
            arrayOfInt6[i5] = arrayOfInt5[i5];
            arrayOfInt7[i5] = arrayOfInt5[(i5 + 28)];
            i5++;
            continue;
            if (i6 < 27)
            {
              arrayOfInt8[i6] = arrayOfInt6[(i6 + 1)];
              arrayOfInt9[i6] = arrayOfInt7[(i6 + 1)];
              i6++;
              continue;
            }
            arrayOfInt8[27] = arrayOfInt6[0];
            arrayOfInt9[27] = arrayOfInt7[0];
            break label1157;
            if (i7 >= 28)
              break label1175;
            arrayOfInt5[i7] = arrayOfInt8[i7];
            arrayOfInt5[(i7 + 28)] = arrayOfInt9[i7];
            i7++;
            continue;
            if (i9 < 26)
            {
              arrayOfInt8[i9] = arrayOfInt6[(i9 + 2)];
              arrayOfInt9[i9] = arrayOfInt7[(i9 + 2)];
              i9++;
              continue;
            }
            arrayOfInt8[26] = arrayOfInt6[0];
            arrayOfInt9[26] = arrayOfInt7[0];
            arrayOfInt8[27] = arrayOfInt6[1];
            arrayOfInt9[27] = arrayOfInt7[1];
            break label1157;
            if (i8 >= 48)
              break label1181;
            arrayOfInt2[i3][i8] = arrayOfInt5[(-1 + kfc[i8])];
            i8++;
            continue;
          }
          byte[] arrayOfByte6 = new byte[8];
          int[] arrayOfInt10 = new int[64];
          int[] arrayOfInt11 = new int[64];
          int i10 = 0;
          if (i10 >= 64)
            break label1187;
          arrayOfInt10[i10] = arrayOfInt4[(-1 + keZ[i10])];
          i10++;
          continue;
          if (i11 >= 16)
            break label1245;
          int[] arrayOfInt12 = new int[32];
          int[] arrayOfInt13 = new int[32];
          int[] arrayOfInt14 = new int[32];
          int[] arrayOfInt15 = new int[32];
          int[] arrayOfInt16 = new int[48];
          int[] arrayOfInt17 = { 8, 6 };
          int[][] arrayOfInt18 = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt17);
          int[] arrayOfInt19 = new int[8];
          int[] arrayOfInt20 = new int[32];
          int[] arrayOfInt21 = new int[32];
          int i12 = 0;
          if (i12 >= 32)
            break label1193;
          arrayOfInt12[i12] = arrayOfInt10[i12];
          arrayOfInt13[i12] = arrayOfInt10[(i12 + 32)];
          i12++;
          continue;
          if (i13 >= 48)
            break label1205;
          arrayOfInt16[i13] = arrayOfInt13[(-1 + kfd[i13])];
          arrayOfInt16[i13] += arrayOfInt2[i11][i13];
          if (arrayOfInt16[i13] != 2)
            break label1199;
          arrayOfInt16[i13] = 0;
          break label1199;
          if (i15 < 6)
          {
            arrayOfInt18[i14][i15] = arrayOfInt16[(i15 + i14 * 6)];
            i15++;
            continue;
          }
          arrayOfInt19[i14] = kff[i14][((arrayOfInt18[i14][0] << 1) + arrayOfInt18[i14][5])][((arrayOfInt18[i14][1] << 3) + (arrayOfInt18[i14][2] << 2) + (arrayOfInt18[i14][3] << 1) + arrayOfInt18[i14][4])];
          int i16 = 0;
          if (i16 >= 4)
            break label1221;
          arrayOfInt20[(3 + i14 * 4 - i16)] = (arrayOfInt19[i14] % 2);
          arrayOfInt19[i14] /= 2;
          i16++;
          continue;
          if (i17 >= 32)
            break label1239;
          arrayOfInt21[i17] = arrayOfInt20[(-1 + kfe[i17])];
          arrayOfInt14[i17] = arrayOfInt13[i17];
          arrayOfInt12[i17] += arrayOfInt21[i17];
          if (arrayOfInt15[i17] == 2)
            arrayOfInt15[i17] = 0;
          if (i11 == 15)
          {
            arrayOfInt10[i17] = arrayOfInt15[i17];
            arrayOfInt10[(i17 + 32)] = arrayOfInt14[i17];
            break label1233;
          }
          arrayOfInt10[i17] = arrayOfInt14[i17];
          arrayOfInt10[(i17 + 32)] = arrayOfInt15[i17];
          break label1233;
          if (i18 >= 64)
            break label1251;
          arrayOfInt11[i18] = arrayOfInt10[(-1 + kfa[i18])];
          i18++;
          continue;
          if (i20 >= 8)
            break label1267;
          arrayOfByte6[i19] = ((byte)(arrayOfByte6[i19] + (arrayOfInt11[(i20 + (i19 << 3))] << 7 - i20)));
          i20++;
          continue;
          System.arraycopy(arrayOfByte6, 0, arrayOfByte3, i1 * 8, 8);
          i1++;
          continue;
        }
        return arrayOfByte3;
      }
      catch (Exception localException)
      {
        return paramArrayOfByte2;
      }
      int i3 = 0;
      continue;
      label1145: if (i4 == 1)
      {
        i6 = 0;
      }
      else
      {
        while (i4 != 2)
        {
          i7 = 0;
          break;
        }
        i9 = 0;
        continue;
        i8 = 0;
        continue;
        i3++;
        continue;
        i11 = 0;
        continue;
        i13 = 0;
        continue;
        i13++;
        continue;
        for (i14 = 0; ; i14++)
        {
          if (i14 >= 8)
            break label1227;
          i15 = 0;
          break;
        }
        i17 = 0;
        continue;
        i17++;
        continue;
        i11++;
        continue;
        i18 = 0;
        continue;
        for (i19 = 0; ; i19++)
        {
          if (i19 >= 8)
            break label1271;
          i20 = 0;
          break;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a.a
 * JD-Core Version:    0.6.2
 */