package com.tencent.mm.ap.a;

public abstract class ae extends x
{
  static final int[] iAN = { 1, 1, 1 };
  static final int[] iAO = { 1, 1, 1, 1, 1 };
  static final int[][] iAP = { { 3, 2, 1, 1 }, { 2, 2, 2, 1 }, { 2, 1, 2, 2 }, { 1, 4, 1, 1 }, { 1, 1, 3, 2 }, { 1, 2, 3, 1 }, { 1, 1, 1, 4 }, { 1, 3, 1, 2 }, { 1, 2, 1, 3 }, { 3, 1, 1, 2 } };
  static final int[][] iAQ = new int[20][];

  static
  {
    System.arraycopy(iAP, 0, iAQ, 0, 10);
    for (int i = 10; i < 20; i++)
    {
      int[] arrayOfInt1 = iAP[(i - 10)];
      int[] arrayOfInt2 = new int[arrayOfInt1.length];
      for (int j = 0; j < arrayOfInt1.length; j++)
        arrayOfInt2[j] = arrayOfInt1[(-1 + (arrayOfInt1.length - j))];
      iAQ[i] = arrayOfInt2;
    }
  }

  static boolean t(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    if (i == 0);
    int m;
    do
    {
      return false;
      int j = i - 2;
      int k = 0;
      while (j >= 0)
      {
        int i2 = '\0*0' + paramCharSequence.charAt(j);
        if ((i2 < 0) || (i2 > 9))
          throw p.aLW();
        k += i2;
        j -= 2;
      }
      m = k * 3;
      for (int n = i - 1; n >= 0; n -= 2)
      {
        int i1 = '\0*0' + paramCharSequence.charAt(n);
        if ((i1 < 0) || (i1 > 9))
          throw p.aLW();
        m += i1;
      }
    }
    while (m % 10 != 0);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.ae
 * JD-Core Version:    0.6.2
 */