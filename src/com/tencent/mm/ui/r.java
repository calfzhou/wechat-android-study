package com.tencent.mm.ui;

public final class r
{
  public Object fa;
  public int iIA;
  public Object iIB;

  public r(Object paramObject1, int paramInt, Object paramObject2)
  {
    this.fa = paramObject1;
    this.iIA = paramInt;
    this.iIB = null;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    r localr;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localr = (r)paramObject;
        if (this.iIA != localr.iIA)
          return false;
        if (this.fa != null)
          break;
      }
      while (localr.fa == null);
      return false;
    }
    while (this.fa.equals(localr.fa));
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (31 + this.iIA);
    if (this.fa == null);
    for (int j = 0; ; j = this.fa.hashCode())
      return j + i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.r
 * JD-Core Version:    0.6.2
 */