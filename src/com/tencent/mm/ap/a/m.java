package com.tencent.mm.ap.a;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class m
{
  private static final int[] izQ = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1 };

  private static boolean Ay(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("Shift_JIS");
      int i = arrayOfByte.length;
      if (i % 2 != 0)
        return false;
      for (int j = 0; ; j += 2)
      {
        if (j >= i)
          break label75;
        int k = 0xFF & arrayOfByte[j];
        if (((k < 129) || (k > 159)) && ((k < 224) || (k > 235)))
          break;
      }
      label75: return true;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return false;
  }

  private static int a(c paramc, o paramo, ag paramag, f paramf)
  {
    int i = 2147483647;
    int j = -1;
    int k = 0;
    int i17;
    int i16;
    if (k < 8)
    {
      t.a(paramc, paramo, paramag, k, paramf);
      int m = s.a(paramf);
      int n = 0;
      byte[][] arrayOfByte1 = paramf.aLT();
      int i1 = paramf.getWidth();
      int i2 = paramf.getHeight();
      int i3 = 0;
      while (i3 < i2 - 1)
      {
        int i22 = n;
        for (int i23 = 0; i23 < i1 - 1; i23++)
        {
          int i24 = arrayOfByte1[i3][i23];
          if ((i24 == arrayOfByte1[i3][(i23 + 1)]) && (i24 == arrayOfByte1[(i3 + 1)][i23]) && (i24 == arrayOfByte1[(i3 + 1)][(i23 + 1)]))
            i22++;
        }
        i3++;
        n = i22;
      }
      int i4 = m + n * 3;
      int i5 = 0;
      byte[][] arrayOfByte2 = paramf.aLT();
      int i6 = paramf.getWidth();
      int i7 = paramf.getHeight();
      int i8 = 0;
      while (i8 < i7)
      {
        int i20 = i5;
        for (int i21 = 0; i21 < i6; i21++)
        {
          if ((i21 + 6 < i6) && (arrayOfByte2[i8][i21] == 1) && (arrayOfByte2[i8][(i21 + 1)] == 0) && (arrayOfByte2[i8][(i21 + 2)] == 1) && (arrayOfByte2[i8][(i21 + 3)] == 1) && (arrayOfByte2[i8][(i21 + 4)] == 1) && (arrayOfByte2[i8][(i21 + 5)] == 0) && (arrayOfByte2[i8][(i21 + 6)] == 1) && (((i21 + 10 < i6) && (arrayOfByte2[i8][(i21 + 7)] == 0) && (arrayOfByte2[i8][(i21 + 8)] == 0) && (arrayOfByte2[i8][(i21 + 9)] == 0) && (arrayOfByte2[i8][(i21 + 10)] == 0)) || ((i21 - 4 >= 0) && (arrayOfByte2[i8][(i21 - 1)] == 0) && (arrayOfByte2[i8][(i21 - 2)] == 0) && (arrayOfByte2[i8][(i21 - 3)] == 0) && (arrayOfByte2[i8][(i21 - 4)] == 0))))
            i20 += 40;
          if ((i8 + 6 < i7) && (arrayOfByte2[i8][i21] == 1) && (arrayOfByte2[(i8 + 1)][i21] == 0) && (arrayOfByte2[(i8 + 2)][i21] == 1) && (arrayOfByte2[(i8 + 3)][i21] == 1) && (arrayOfByte2[(i8 + 4)][i21] == 1) && (arrayOfByte2[(i8 + 5)][i21] == 0) && (arrayOfByte2[(i8 + 6)][i21] == 1) && (((i8 + 10 < i7) && (arrayOfByte2[(i8 + 7)][i21] == 0) && (arrayOfByte2[(i8 + 8)][i21] == 0) && (arrayOfByte2[(i8 + 9)][i21] == 0) && (arrayOfByte2[(i8 + 10)][i21] == 0)) || ((i8 - 4 >= 0) && (arrayOfByte2[(i8 - 1)][i21] == 0) && (arrayOfByte2[(i8 - 2)][i21] == 0) && (arrayOfByte2[(i8 - 3)][i21] == 0) && (arrayOfByte2[(i8 - 4)][i21] == 0))))
            i20 += 40;
        }
        i8++;
        i5 = i20;
      }
      int i9 = i4 + i5;
      int i10 = 0;
      byte[][] arrayOfByte3 = paramf.aLT();
      int i11 = paramf.getWidth();
      int i12 = paramf.getHeight();
      int i13 = 0;
      while (i13 < i12)
      {
        byte[] arrayOfByte = arrayOfByte3[i13];
        int i18 = i10;
        for (int i19 = 0; i19 < i11; i19++)
          if (arrayOfByte[i19] == 1)
            i18++;
        i13++;
        i10 = i18;
      }
      int i14 = paramf.getHeight() * paramf.getWidth();
      int i15 = i9 + 10 * (int)(20.0D * Math.abs(i10 / i14 - 0.5D));
      if (i15 >= i)
        break label850;
      i17 = i15;
      i16 = k;
    }
    while (true)
    {
      k++;
      i = i17;
      j = i16;
      break;
      return j;
      label850: i16 = j;
      i17 = i;
    }
  }

  private static ag a(int paramInt, o paramo)
  {
    for (int i = 1; i <= 40; i++)
    {
      ag localag = ag.on(i);
      if (localag.aMe() - localag.b(paramo).aMk() >= (paramInt + 7) / 8)
        return localag;
    }
    throw new ak("Data too big");
  }

  private static c a(c paramc, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramc.aLQ() != paramInt2)
      throw new ak("Number of bits and data bytes does not match");
    ArrayList localArrayList = new ArrayList(paramInt3);
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (i < paramInt3)
    {
      int[] arrayOfInt1 = new int[1];
      int[] arrayOfInt2 = new int[1];
      if (i >= paramInt3)
        throw new ak("Block ID too large");
      int i2 = paramInt1 % paramInt3;
      int i3 = paramInt3 - i2;
      int i4 = paramInt1 / paramInt3;
      int i5 = i4 + 1;
      int i6 = paramInt2 / paramInt3;
      int i7 = i6 + 1;
      int i8 = i4 - i6;
      int i9 = i5 - i7;
      if (i8 != i9)
        throw new ak("EC bytes mismatch");
      if (paramInt3 != i3 + i2)
        throw new ak("RS blocks mismatch");
      if (paramInt1 != i3 * (i6 + i8) + i2 * (i7 + i9))
        throw new ak("Total bytes mismatch");
      if (i < i3)
      {
        arrayOfInt1[0] = i6;
        arrayOfInt2[0] = i8;
      }
      while (true)
      {
        int i10 = arrayOfInt1[0];
        byte[] arrayOfByte3 = new byte[i10];
        paramc.b(j * 8, arrayOfByte3, i10);
        byte[] arrayOfByte4 = p(arrayOfByte3, arrayOfInt2[0]);
        localArrayList.add(new e(arrayOfByte3, arrayOfByte4));
        k = Math.max(k, i10);
        int i11 = Math.max(m, arrayOfByte4.length);
        int i12 = j + arrayOfInt1[0];
        i++;
        j = i12;
        m = i11;
        break;
        arrayOfInt1[0] = i7;
        arrayOfInt2[0] = i9;
      }
    }
    if (paramInt2 != j)
      throw new ak("Data bytes does not match offset");
    c localc = new c();
    for (int n = 0; n < k; n++)
    {
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        byte[] arrayOfByte2 = ((e)localIterator2.next()).aLR();
        if (n < arrayOfByte2.length)
          localc.aN(arrayOfByte2[n], 8);
      }
    }
    for (int i1 = 0; i1 < m; i1++)
    {
      Iterator localIterator1 = localArrayList.iterator();
      while (localIterator1.hasNext())
      {
        byte[] arrayOfByte1 = ((e)localIterator1.next()).aLS();
        if (i1 < arrayOfByte1.length)
          localc.aN(arrayOfByte1[i1], 8);
      }
    }
    if (paramInt1 != localc.aLQ())
      throw new ak("Interleaving error: " + paramInt1 + " and " + localc.aLQ() + " differ.");
    return localc;
  }

  public static z a(String paramString, o paramo, Map paramMap)
  {
    int i = 0;
    String str;
    label9: u localu;
    if (paramMap == null)
    {
      str = null;
      if (str == null)
        str = "ISO-8859-1";
      if (!"Shift_JIS".equals(str))
        break label214;
      if (!Ay(paramString))
        break label206;
      localu = u.iAA;
    }
    c localc1;
    c localc2;
    while (true)
    {
      localc1 = new c();
      if ((localu == u.iAy) && (!"ISO-8859-1".equals(str)))
      {
        g localg = g.Aw(str);
        if (localg != null)
        {
          localc1.aN(u.iAz.aLV(), 4);
          localc1.aN(localg.getValue(), 8);
        }
      }
      localc1.aN(localu.aLV(), 4);
      localc2 = new c();
      switch (n.izR[localu.ordinal()])
      {
      default:
        throw new ak("Invalid mode: " + localu);
        str = (String)paramMap.get(l.izH);
        break label9;
        label206: localu = u.iAy;
        continue;
        label214: int j = 0;
        int k = 0;
        int m = 0;
        if (j < paramString.length())
        {
          int i16 = paramString.charAt(j);
          if ((i16 >= 48) && (i16 <= 57))
            m = 1;
          while (true)
          {
            j++;
            break;
            if (nM(i16) == -1)
              break label278;
            k = 1;
          }
          label278: localu = u.iAy;
        }
        else if (k != 0)
        {
          localu = u.iAw;
        }
        else if (m != 0)
        {
          localu = u.iAv;
        }
        else
        {
          localu = u.iAy;
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    int i13 = paramString.length();
    while (i < i13)
    {
      int i14 = '\0*0' + paramString.charAt(i);
      if (i + 2 < i13)
      {
        int i15 = '\0*0' + paramString.charAt(i + 1);
        localc2.aN('\0*0' + paramString.charAt(i + 2) + (i14 * 100 + i15 * 10), 10);
        i += 3;
      }
      else if (i + 1 < i13)
      {
        localc2.aN('\0*0' + paramString.charAt(i + 1) + i14 * 10, 7);
        i += 2;
      }
      else
      {
        localc2.aN(i14, 4);
        i++;
        continue;
        int i10 = paramString.length();
        while (i < i10)
        {
          int i11 = nM(paramString.charAt(i));
          if (i11 == -1)
            throw new ak();
          if (i + 1 < i10)
          {
            int i12 = nM(paramString.charAt(i + 1));
            if (i12 == -1)
              throw new ak();
            localc2.aN(i12 + i11 * 45, 11);
            i += 2;
          }
          else
          {
            localc2.aN(i11, 6);
            i++;
            continue;
            try
            {
              byte[] arrayOfByte2 = paramString.getBytes(str);
              int i9 = arrayOfByte2.length;
              while (i < i9)
              {
                localc2.aN(arrayOfByte2[i], 8);
                i++;
              }
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException2)
            {
              throw new ak(localUnsupportedEncodingException2);
            }
          }
        }
      }
    }
    while (true)
    {
      int i7;
      int i8;
      try
      {
        byte[] arrayOfByte1 = paramString.getBytes("Shift_JIS");
        int n = arrayOfByte1.length;
        if (i >= n)
          break label774;
        int i6 = 0xFF & arrayOfByte1[i];
        i7 = 0xFF & arrayOfByte1[(i + 1)] | i6 << 8;
        if ((i7 >= 33088) && (i7 <= 40956))
        {
          i8 = i7 - 33088;
          if (i8 != -1)
            break label745;
          throw new ak("Invalid byte sequence");
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        throw new ak(localUnsupportedEncodingException1);
      }
      if ((i7 >= 57408) && (i7 <= 60351))
      {
        i8 = i7 - 49472;
        continue;
        label745: localc2.aN(192 * (i8 >> 8) + (i8 & 0xFF), 13);
        i += 2;
        continue;
        label774: ag localag1 = a(localc1.getSize() + localu.a(ag.on(1)) + localc2.getSize(), paramo);
        ag localag2 = a(localc1.getSize() + localu.a(localag1) + localc2.getSize(), paramo);
        c localc3 = new c();
        localc3.a(localc1);
        if (localu == u.iAy);
        int i2;
        for (int i1 = localc2.aLQ(); ; i1 = paramString.length())
        {
          i2 = localu.a(localag2);
          if (i1 < 1 << i2)
            break;
          throw new ak(i1 + " is bigger than " + (-1 + (1 << i2)));
        }
        localc3.aN(i1, i2);
        localc3.a(localc2);
        ai localai = localag2.b(paramo);
        int i3 = localag2.aMe() - localai.aMk();
        a(i3, localc3);
        c localc4 = a(localc3, localag2.aMe(), i3, localai.aMj());
        z localz = new z();
        localz.a(paramo);
        localz.a(localu);
        localz.b(localag2);
        int i4 = localag2.aMf();
        f localf = new f(i4, i4);
        int i5 = a(localc4, paramo, localag2, localf);
        localz.nU(i5);
        t.a(localc4, paramo, localag2, i5, localf);
        localz.b(localf);
        return localz;
      }
      else
      {
        i8 = -1;
      }
    }
  }

  private static void a(int paramInt, c paramc)
  {
    int i = paramInt << 3;
    if (paramc.getSize() > i)
      throw new ak("data bits cannot fit in the QR Code" + paramc.getSize() + " > " + i);
    for (int j = 0; (j < 4) && (paramc.getSize() < i); j++)
      paramc.ec(false);
    int k = 0x7 & paramc.getSize();
    if (k > 0)
      while (k < 8)
      {
        paramc.ec(false);
        k++;
      }
    int m = paramInt - paramc.aLQ();
    int n = 0;
    if (n < m)
    {
      if ((n & 0x1) == 0);
      for (int i1 = 236; ; i1 = 17)
      {
        paramc.aN(i1, 8);
        n++;
        break;
      }
    }
    if (paramc.getSize() != i)
      throw new ak("Bits size does not equal capacity");
  }

  private static int nM(int paramInt)
  {
    if (paramInt < izQ.length)
      return izQ[paramInt];
    return -1;
  }

  private static byte[] p(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    int[] arrayOfInt = new int[j + paramInt];
    for (int k = 0; k < j; k++)
      arrayOfInt[k] = (0xFF & paramArrayOfByte[k]);
    new ad(q.iAe).c(arrayOfInt, paramInt);
    byte[] arrayOfByte = new byte[paramInt];
    while (i < paramInt)
    {
      arrayOfByte[i] = ((byte)arrayOfInt[(j + i)]);
      i++;
    }
    return arrayOfByte;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.m
 * JD-Core Version:    0.6.2
 */