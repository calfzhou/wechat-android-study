package com.tencent.mm.sdk.platformtools;

import android.os.SystemClock;
import java.util.ArrayList;

public final class cs
{
  private String aB;
  private String iGa;
  private boolean iGb;
  ArrayList iGc;
  ArrayList iGd;

  public cs(String paramString1, String paramString2)
  {
    this.aB = paramString1;
    this.iGa = paramString2;
    this.iGb = false;
    if (!this.iGb)
    {
      if (this.iGc != null)
        break label61;
      this.iGc = new ArrayList();
      this.iGd = new ArrayList();
    }
    while (true)
    {
      addSplit(null);
      return;
      label61: this.iGc.clear();
      this.iGd.clear();
    }
  }

  public final void addSplit(String paramString)
  {
    if (this.iGb)
      return;
    long l = SystemClock.elapsedRealtime();
    this.iGc.add(Long.valueOf(l));
    this.iGd.add(paramString);
  }

  public final void dumpToLog()
  {
    if (this.iGb)
      return;
    z.d(this.aB, this.iGa + ": begin");
    long l1 = ((Long)this.iGc.get(0)).longValue();
    int i = 1;
    long l3;
    for (long l2 = l1; i < this.iGc.size(); l2 = l3)
    {
      l3 = ((Long)this.iGc.get(i)).longValue();
      String str = (String)this.iGd.get(i);
      long l4 = ((Long)this.iGc.get(i - 1)).longValue();
      z.d(this.aB, this.iGa + ":      " + (l3 - l4) + " ms, " + str);
      i++;
    }
    z.d(this.aB, this.iGa + ": end, " + (l2 - l1) + " ms");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.cs
 * JD-Core Version:    0.6.2
 */