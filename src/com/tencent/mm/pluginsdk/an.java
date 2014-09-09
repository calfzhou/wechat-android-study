package com.tencent.mm.pluginsdk;

public final class an
{
  public static double d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d1 = 3.141592653589793D * paramDouble1 / 180.0D;
    double d2 = 3.141592653589793D * paramDouble3 / 180.0D;
    double d3 = d1 - d2;
    double d4 = 3.141592653589793D * (paramDouble2 - paramDouble4) / 180.0D;
    return Math.round(10000.0D * (6378137.0D * (2.0D * Math.asin(Math.sqrt(Math.pow(Math.sin(d3 / 2.0D), 2.0D) + Math.cos(d1) * Math.cos(d2) * Math.pow(Math.sin(d4 / 2.0D), 2.0D)))))) / 10000L;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.an
 * JD-Core Version:    0.6.2
 */