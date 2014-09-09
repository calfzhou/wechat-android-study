package c.a.d;

import c.a.g.d;
import java.io.Serializable;

public final class i
  implements Serializable
{
  private final String ilO;
  private final String kmp;
  private final String token;

  public i(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }

  public i(String paramString1, String paramString2, String paramString3)
  {
    d.b(paramString1, "Token can't be null");
    d.b(paramString2, "Secret can't be null");
    this.token = paramString1;
    this.ilO = paramString2;
    this.kmp = paramString3;
  }

  public final String atX()
  {
    return this.token;
  }

  public final String bfP()
  {
    return this.ilO;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    i locali;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      locali = (i)paramObject;
    }
    while ((this.token.equals(locali.token)) && (this.ilO.equals(locali.ilO)));
    return false;
  }

  public final int hashCode()
  {
    return 31 * this.token.hashCode() + this.ilO.hashCode();
  }

  public final boolean isEmpty()
  {
    return ("".equals(this.token)) && ("".equals(this.ilO));
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.token;
    arrayOfObject[1] = this.ilO;
    return String.format("Token[%s , %s]", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.d.i
 * JD-Core Version:    0.6.2
 */