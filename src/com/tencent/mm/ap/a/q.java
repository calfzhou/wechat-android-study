package com.tencent.mm.ap.a;

public final class q
{
  public static final q iAa = new q(4201, 4096, 1);
  public static final q iAb = new q(1033, 1024, 1);
  public static final q iAc = new q(67, 64, 1);
  public static final q iAd = new q(19, 16, 1);
  public static final q iAe = new q(285, 256, 0);
  public static final q iAf = localq;
  public static final q iAg = localq;
  public static final q iAh = iAc;
  private boolean dQd = false;
  private int[] iAi;
  private int[] iAj;
  private r iAk;
  private r iAl;
  private final int iAm;
  private final int iAn;
  private final int size;

  static
  {
    q localq = new q(301, 256, 1);
  }

  private q(int paramInt1, int paramInt2, int paramInt3)
  {
    this.iAm = paramInt1;
    this.size = paramInt2;
    this.iAn = paramInt3;
    if (paramInt2 <= 0)
      Tb();
  }

  private void Tb()
  {
    this.iAi = new int[this.size];
    this.iAj = new int[this.size];
    int i = 0;
    int j = 1;
    while (i < this.size)
    {
      this.iAi[i] = j;
      j <<= 1;
      if (j >= this.size)
        j = (j ^ this.iAm) & -1 + this.size;
      i++;
    }
    for (int k = 0; k < -1 + this.size; k++)
      this.iAj[this.iAi[k]] = k;
    this.iAk = new r(this, new int[] { 0 });
    this.iAl = new r(this, new int[] { 1 });
    this.dQd = true;
  }

  static int aR(int paramInt1, int paramInt2)
  {
    return paramInt1 ^ paramInt2;
  }

  private void checkInit()
  {
    if (!this.dQd)
      Tb();
  }

  final r aLX()
  {
    checkInit();
    return this.iAk;
  }

  public final int aLY()
  {
    return this.iAn;
  }

  final r aQ(int paramInt1, int paramInt2)
  {
    checkInit();
    if (paramInt1 < 0)
      throw new IllegalArgumentException();
    if (paramInt2 == 0)
      return this.iAk;
    int[] arrayOfInt = new int[paramInt1 + 1];
    arrayOfInt[0] = paramInt2;
    return new r(this, arrayOfInt);
  }

  final int aT(int paramInt1, int paramInt2)
  {
    checkInit();
    if ((paramInt1 == 0) || (paramInt2 == 0))
      return 0;
    return this.iAi[((this.iAj[paramInt1] + this.iAj[paramInt2]) % (-1 + this.size))];
  }

  final int nN(int paramInt)
  {
    checkInit();
    return this.iAi[paramInt];
  }

  final int nO(int paramInt)
  {
    checkInit();
    if (paramInt == 0)
      throw new IllegalArgumentException();
    return this.iAj[paramInt];
  }

  final int nP(int paramInt)
  {
    checkInit();
    if (paramInt == 0)
      throw new ArithmeticException();
    return this.iAi[(-1 + (this.size - this.iAj[paramInt]))];
  }

  public final String toString()
  {
    return "GF(0x" + Integer.toHexString(this.iAm) + ',' + this.size + ')';
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.q
 * JD-Core Version:    0.6.2
 */