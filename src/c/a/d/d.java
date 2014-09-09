package c.a.d;

import c.a.g.c;

public final class d
  implements Comparable
{
  private final String dqq;
  private final String value;

  public d(String paramString1, String paramString2)
  {
    this.dqq = paramString1;
    this.value = paramString2;
  }

  public final String bfL()
  {
    return c.encode(this.dqq).concat("=").concat(c.encode(this.value));
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    d locald;
    do
    {
      do
      {
        return false;
        if (paramObject == this)
          return true;
      }
      while (!(paramObject instanceof d));
      locald = (d)paramObject;
    }
    while ((!locald.dqq.equals(this.dqq)) || (!locald.value.equals(this.value)));
    return true;
  }

  public final int hashCode()
  {
    return this.dqq.hashCode() + this.value.hashCode();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.d.d
 * JD-Core Version:    0.6.2
 */