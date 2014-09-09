package c.a.g;

import java.util.regex.Pattern;

public final class d
{
  private static final Pattern kmG = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+");

  public static void b(Object paramObject, String paramString)
  {
    if (paramObject != null);
    for (boolean bool = true; ; bool = false)
    {
      f(bool, paramString);
      return;
    }
  }

  public static void bX(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.trim().equals("")));
    for (boolean bool = true; ; bool = false)
    {
      f(bool, paramString2);
      return;
    }
  }

  private static void f(boolean paramBoolean, String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() <= 0))
      paramString = "Received an invalid parameter";
    if (!paramBoolean)
      throw new IllegalArgumentException(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.g.d
 * JD-Core Version:    0.6.2
 */