package com.tencent.map.location;

import android.location.Location;

public final class c
{
  private static c Ln;
  private double Lo = 0.0D;
  private double Lp = 0.0D;
  private double Lq = 0.0D;
  private double Lr = 0.0D;
  private double Ls = 0.0D;
  private double Lt = 0.0D;
  private d Lu;
  private e Lv = null;
  private boolean Lw = false;
  public String Lx = "";

  public static ah a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    if (af.hi() != null);
    for (int i = 1; i == 0; i = 0)
      throw new ai();
    try
    {
      ah localah = ak.b(paramString1, paramString2, paramArrayOfByte);
      return localah;
    }
    catch (Exception localException)
    {
      throw localException;
    }
  }

  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.trim().length() == 0);
  }

  public static c gW()
  {
    if (Ln == null)
      Ln = new c();
    return Ln;
  }

  public final void a(double paramDouble1, double paramDouble2, d paramd)
  {
    this.Lu = paramd;
    if ((this.Ls != 0.0D) && (this.Lt != 0.0D))
    {
      float[] arrayOfFloat = new float[10];
      Location.distanceBetween(paramDouble1, paramDouble2, this.Lo, this.Lp, arrayOfFloat);
      if (arrayOfFloat[0] < 1500.0F)
        this.Lu.a(paramDouble1 + this.Ls, paramDouble2 + this.Lt);
    }
    while (this.Lw)
      return;
    this.Lx = ("{\"source\":101,\"access_token\":\"160e7bd42dec9428721034e0146fc6dd\",\"location\":{\"latitude\":" + paramDouble1 + ",\"longitude\":" + paramDouble2 + "}\t}");
    this.Lq = paramDouble1;
    this.Lr = paramDouble2;
    this.Lv = new e(this);
    this.Lv.start();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.c
 * JD-Core Version:    0.6.2
 */