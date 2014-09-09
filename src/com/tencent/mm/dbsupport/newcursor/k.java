package com.tencent.mm.dbsupport.newcursor;

public final class k
{
  private static l dPP;

  public static void a(l paraml)
  {
    dPP = paraml;
  }

  public static void a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    if (dPP != null)
      dPP.b(paramString1, paramString2, paramInt, paramLong);
  }

  public static void iN(String paramString)
  {
    if (dPP != null)
      dPP.iO(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.k
 * JD-Core Version:    0.6.2
 */