package com.tencent.mm.y;

public final class m
{
  public static l a(l paraml)
  {
    if (paraml == null)
      paraml = null;
    while (!paraml.xR())
      return paraml;
    return ap.yg().dT(paraml.xP());
  }

  public static boolean b(l paraml)
  {
    if (paraml == null);
    int i;
    int j;
    long l;
    do
    {
      return false;
      i = paraml.getOffset();
      j = paraml.sp();
      l = paraml.kl();
      if (paraml.xR())
      {
        l locall = ap.yg().dT(paraml.xP());
        i = locall.getOffset();
        j = locall.sp();
        l = locall.kl();
      }
      if (j == 0)
        return true;
    }
    while (((i != j) || (j == 0)) && (l == 0L));
    return true;
  }

  public static String c(l paraml)
  {
    if (paraml == null)
      return "";
    if (paraml.xR())
      return ap.yg().dT(paraml.xP()).xN();
    return paraml.xN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.m
 * JD-Core Version:    0.6.2
 */