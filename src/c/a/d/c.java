package c.a.d;

import java.util.HashMap;
import java.util.Map;

public final class c extends f
{
  private Map klY = new HashMap();

  public c(j paramj, String paramString)
  {
    super(paramj, paramString);
  }

  public final void bU(String paramString1, String paramString2)
  {
    Map localMap = this.klY;
    if ((paramString1.startsWith("oauth_")) || (paramString1.equals("scope")))
    {
      localMap.put(paramString1, paramString2);
      return;
    }
    throw new IllegalArgumentException(String.format("OAuth parameters must either be '%s' or start with '%s'", new Object[] { "scope", "oauth_" }));
  }

  public final Map bfD()
  {
    return this.klY;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = super.bfF();
    arrayOfObject[1] = super.getUrl();
    return String.format("@OAuthRequest(%s, %s)", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.d.c
 * JD-Core Version:    0.6.2
 */