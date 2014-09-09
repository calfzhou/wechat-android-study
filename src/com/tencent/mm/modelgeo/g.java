package com.tencent.mm.modelgeo;

final class g
{
  double cGO;
  double cGP;
  Object dvh = "";

  public g(d paramd, double paramDouble1, double paramDouble2, Object paramObject)
  {
    this.cGO = paramDouble1;
    this.cGP = paramDouble2;
    this.dvh = paramObject;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof g)))
      return false;
    return ((g)paramObject).toString().equals(toString());
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append((int)(1000000.0D * this.cGO)).append((int)(1000000.0D * this.cGP));
    String str;
    if (this.dvh == null)
      str = "";
    while (true)
    {
      return str;
      if (((this.dvh instanceof Integer)) || ((this.dvh instanceof Long)) || ((this.dvh instanceof Double)) || ((this.dvh instanceof Float)) || ((this.dvh instanceof String)))
        str = this.dvh;
      else
        str = this.dvh.toString();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.g
 * JD-Core Version:    0.6.2
 */