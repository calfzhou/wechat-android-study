package com.tencent.mm.ap.a;

final class r
{
  private final q iAo;
  private final int[] iAp;

  r(q paramq, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length == 0)
      throw new IllegalArgumentException();
    this.iAo = paramq;
    int j = paramArrayOfInt.length;
    if ((j > i) && (paramArrayOfInt[0] == 0))
    {
      while ((i < j) && (paramArrayOfInt[i] == 0))
        i++;
      if (i == j)
      {
        this.iAp = paramq.aLX().iAp;
        return;
      }
      this.iAp = new int[j - i];
      System.arraycopy(paramArrayOfInt, i, this.iAp, 0, this.iAp.length);
      return;
    }
    this.iAp = paramArrayOfInt;
  }

  private r a(r paramr)
  {
    if (!this.iAo.equals(paramr.iAo))
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    if (aMa())
      return paramr;
    if (paramr.aMa())
      return this;
    Object localObject1 = this.iAp;
    Object localObject2 = paramr.iAp;
    if (localObject1.length > localObject2.length);
    while (true)
    {
      int[] arrayOfInt = new int[localObject1.length];
      int i = localObject1.length - localObject2.length;
      System.arraycopy(localObject1, 0, arrayOfInt, 0, i);
      for (int j = i; j < localObject1.length; j++)
        arrayOfInt[j] = q.aR(localObject2[(j - i)], localObject1[j]);
      return new r(this.iAo, arrayOfInt);
      Object localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }

  private boolean aMa()
  {
    int i = this.iAp[0];
    boolean bool = false;
    if (i == 0)
      bool = true;
    return bool;
  }

  private int nR(int paramInt)
  {
    return this.iAp[(-1 + this.iAp.length - paramInt)];
  }

  final int[] aLZ()
  {
    return this.iAp;
  }

  final r aU(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IllegalArgumentException();
    if (paramInt2 == 0)
      return this.iAo.aLX();
    int i = this.iAp.length;
    int[] arrayOfInt = new int[i + paramInt1];
    for (int j = 0; j < i; j++)
      arrayOfInt[j] = this.iAo.aT(this.iAp[j], paramInt2);
    return new r(this.iAo, arrayOfInt);
  }

  final r b(r paramr)
  {
    if (!this.iAo.equals(paramr.iAo))
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    if ((aMa()) || (paramr.aMa()))
      return this.iAo.aLX();
    int[] arrayOfInt1 = this.iAp;
    int i = arrayOfInt1.length;
    int[] arrayOfInt2 = paramr.iAp;
    int j = arrayOfInt2.length;
    int[] arrayOfInt3 = new int[-1 + (i + j)];
    for (int k = 0; k < i; k++)
    {
      int m = arrayOfInt1[k];
      for (int n = 0; n < j; n++)
        arrayOfInt3[(k + n)] = q.aR(arrayOfInt3[(k + n)], this.iAo.aT(m, arrayOfInt2[n]));
    }
    return new r(this.iAo, arrayOfInt3);
  }

  final r[] c(r paramr)
  {
    if (!this.iAo.equals(paramr.iAo))
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    if (paramr.aMa())
      throw new IllegalArgumentException("Divide by 0");
    r localr1 = this.iAo.aLX();
    int i = paramr.nR(-1 + paramr.iAp.length);
    int j = this.iAo.nP(i);
    r localr2 = localr1;
    r localr4;
    for (r localr3 = this; (-1 + localr3.iAp.length >= -1 + paramr.iAp.length) && (!localr3.aMa()); localr3 = localr3.a(localr4))
    {
      int k = -1 + localr3.iAp.length - (-1 + paramr.iAp.length);
      int m = this.iAo.aT(localr3.nR(-1 + localr3.iAp.length), j);
      localr4 = paramr.aU(k, m);
      localr2 = localr2.a(this.iAo.aQ(k, m));
    }
    return new r[] { localr2, localr3 };
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(8 * (-1 + this.iAp.length));
    int i = -1 + this.iAp.length;
    if (i >= 0)
    {
      int j = nR(i);
      label54: int k;
      if (j != 0)
      {
        if (j >= 0)
          break label107;
        localStringBuilder.append(" - ");
        j = -j;
        if ((i == 0) || (j != 1))
        {
          k = this.iAo.nO(j);
          if (k != 0)
            break label124;
          localStringBuilder.append('1');
        }
        label85: if (i != 0)
        {
          if (i != 1)
            break label157;
          localStringBuilder.append('x');
        }
      }
      while (true)
      {
        i--;
        break;
        label107: if (localStringBuilder.length() <= 0)
          break label54;
        localStringBuilder.append(" + ");
        break label54;
        label124: if (k == 1)
        {
          localStringBuilder.append('a');
          break label85;
        }
        localStringBuilder.append("a^");
        localStringBuilder.append(k);
        break label85;
        label157: localStringBuilder.append("x^");
        localStringBuilder.append(i);
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.r
 * JD-Core Version:    0.6.2
 */