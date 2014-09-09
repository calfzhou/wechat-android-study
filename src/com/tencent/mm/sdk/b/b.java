package com.tencent.mm.sdk.b;

public final class b
{
  public static boolean foreground = false;
  public static String iDb = "unknow";
  private static c iDc = null;
  private static boolean iDd = false;

  public static void AG(String paramString)
  {
    iDb = paramString;
  }

  public static void X(boolean paramBoolean)
  {
    foreground = paramBoolean;
  }

  public static void a(a parama)
  {
    if (iDc != null)
      iDc.a(parama);
  }

  public static void a(c paramc)
  {
    iDc = paramc;
  }

  public static void aMY()
  {
    if (iDc != null);
  }

  public static void aMZ()
  {
    iDd = true;
  }

  public static boolean aNa()
  {
    return iDd;
  }

  public static void b(int paramInt, String paramString)
  {
    if (iDc != null)
      iDc.b(paramInt, paramString);
  }

  public static void m(String paramString1, String paramString2)
  {
    if (iDc != null)
      iDc.m(paramString1, paramString2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.b.b
 * JD-Core Version:    0.6.2
 */