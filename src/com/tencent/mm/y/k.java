package com.tencent.mm.y;

final class k
{
  private i dxg;
  private Object dxh;

  public k(i parami, Object paramObject)
  {
    this.dxg = parami;
    this.dxh = paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof k)));
    k localk;
    do
    {
      return false;
      localk = (k)paramObject;
    }
    while (this.dxg != localk.dxg);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.k
 * JD-Core Version:    0.6.2
 */