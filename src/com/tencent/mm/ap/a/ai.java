package com.tencent.mm.ap.a;

public final class ai
{
  private final int iAY;
  private final ah[] iAZ;

  ai(int paramInt, ah[] paramArrayOfah)
  {
    this.iAY = paramInt;
    this.iAZ = paramArrayOfah;
  }

  public final int aMi()
  {
    return this.iAY;
  }

  public final int aMj()
  {
    int i = 0;
    ah[] arrayOfah = this.iAZ;
    int j = arrayOfah.length;
    int k = 0;
    while (i < j)
    {
      k += arrayOfah[i].getCount();
      i++;
    }
    return k;
  }

  public final int aMk()
  {
    return this.iAY * aMj();
  }

  public final ah[] aMl()
  {
    return this.iAZ;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.ai
 * JD-Core Version:    0.6.2
 */