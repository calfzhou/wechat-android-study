package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class ag extends a
{
  public int klf = 0;

  public ag()
  {
    this.kjD = 312;
  }

  public final Boolean beS()
  {
    if (this.kkC < 4)
      return Boolean.valueOf(false);
    this.klf = f.A(this.kjx, this.kkB);
    if (this.kkC < 4 + 10 * this.klf)
      return Boolean.valueOf(false);
    return Boolean.valueOf(true);
  }

  public final int bfh()
  {
    for (int i = 0; ; i++)
    {
      if (i >= this.klf)
        return 0;
      if (f.z(this.kjx, 4 + this.kkB + i * 10) == 266)
        return f.A(this.kjx, 2 + (4 + this.kkB + i * 10));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.ag
 * JD-Core Version:    0.6.2
 */