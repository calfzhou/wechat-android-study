package c.a.c;

import c.a.b.b;
import c.a.d.i;
import c.a.g.c;
import c.a.g.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
  implements a, f
{
  private static final Pattern klV = Pattern.compile("oauth_token=([^&]+)");
  private static final Pattern klW = Pattern.compile("oauth_token_secret=([^&]*)");

  private static String a(String paramString, Pattern paramPattern)
  {
    Matcher localMatcher = paramPattern.matcher(paramString);
    if ((localMatcher.find()) && (localMatcher.groupCount() > 0))
      return c.decode(localMatcher.group(1));
    throw new b("Response body is incorrect. Can't extract token and secret from this: '" + paramString + "'", null);
  }

  public final i DW(String paramString)
  {
    d.bX(paramString, "Response body is incorrect. Can't extract a token from an empty string");
    return new i(a(paramString, klV), a(paramString, klW), paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.c.g
 * JD-Core Version:    0.6.2
 */