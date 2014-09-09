package com.tencent.mm.ap.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class i extends y
{
  private static boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    int j = paramCharSequence.length();
    while ((paramInt1 < i) && (paramInt1 < j))
    {
      int k = paramCharSequence.charAt(paramInt1);
      if ((k < 48) || (k > 57))
      {
        if (k != 241)
          return false;
        i++;
      }
      paramInt1++;
    }
    return i <= j;
  }

  public final boolean[] Ax(String paramString)
  {
    int i = 0;
    int j = paramString.length();
    if ((j <= 0) || (j > 80))
      throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + j);
    for (int k = 0; k < j; k++)
    {
      char c = paramString.charAt(k);
      if ((c < ' ') || (c > '~'))
        switch (c)
        {
        default:
          throw new IllegalArgumentException("Bad character in input: " + c);
        case 'ñ':
        case 'ò':
        case 'ó':
        case 'ô':
        }
    }
    ArrayList localArrayList = new ArrayList();
    int m = 0;
    int n = 0;
    int i1 = 1;
    int i2 = 0;
    int i8;
    label172: int i9;
    label187: int i10;
    int i13;
    int i12;
    int i14;
    if (m < j)
      if (n == 99)
      {
        i8 = 2;
        if (!b(paramString, m, i8))
          break label282;
        i9 = 99;
        if (i9 != n)
          break label420;
        if (n != 100)
          break label289;
        i10 = '\0,0' + paramString.charAt(m);
        i13 = m + 1;
        i12 = n;
        localArrayList.add(h.izE[i10]);
        i14 = i2 + i10 * i1;
        if (i13 == 0)
          break label620;
      }
    label282: label289: label420: label620: for (int i15 = i1 + 1; ; i15 = i1)
    {
      i1 = i15;
      i2 = i14;
      n = i12;
      m = i13;
      break;
      i8 = 4;
      break label172;
      i9 = 100;
      break label187;
      switch (paramString.charAt(m))
      {
      default:
        i10 = Integer.parseInt(paramString.substring(m, m + 2));
        i13 = m + 2;
        i12 = n;
        break;
      case 'ñ':
        i10 = 102;
        i13 = m + 1;
        i12 = n;
        break;
      case 'ò':
        i10 = 97;
        i13 = m + 1;
        i12 = n;
        break;
      case 'ó':
        i10 = 96;
        i13 = m + 1;
        i12 = n;
        break;
      case 'ô':
        i13 = m + 1;
        i12 = n;
        i10 = 100;
        break;
        if (n == 0)
          if (i9 == 100)
            i10 = 104;
        while (true)
        {
          int i11 = m;
          i12 = i9;
          i13 = i11;
          break;
          i10 = 105;
          continue;
          i10 = i9;
        }
        int i3 = i2 % 103;
        localArrayList.add(h.izE[i3]);
        localArrayList.add(h.izE[106]);
        Iterator localIterator1 = localArrayList.iterator();
        int i4 = 0;
        while (localIterator1.hasNext())
        {
          int[] arrayOfInt = (int[])localIterator1.next();
          int i5 = arrayOfInt.length;
          int i6 = 0;
          while (i6 < i5)
          {
            int i7 = i4 + arrayOfInt[i6];
            i6++;
            i4 = i7;
          }
        }
        boolean[] arrayOfBoolean = new boolean[i4];
        Iterator localIterator2 = localArrayList.iterator();
        while (localIterator2.hasNext())
          i += a(arrayOfBoolean, i, (int[])localIterator2.next(), true);
        return arrayOfBoolean;
      }
    }
  }

  public final d a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama != a.iyF)
      throw new IllegalArgumentException("Can only encode CODE_128, but got " + parama);
    return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.i
 * JD-Core Version:    0.6.2
 */