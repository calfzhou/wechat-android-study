package com.tencent.map.a.a;

import java.util.ArrayList;
import java.util.Iterator;

public final class d
{
  public boolean KG = false;
  public String KH = null;
  public double KL = 0.0D;
  public double KM = 0.0D;
  public int KN = 1;
  public double KO = -1.0D;
  public double KP = 0.0D;
  public double KQ = 0.0D;
  public double KR = 0.0D;
  public int KS = 0;
  public String KT = null;
  public String KU = null;
  public String KV = null;
  public String KW = null;
  public String KX = null;
  public String KY = null;
  public String Ks = null;
  public String Kt = null;
  public String Lb = null;
  public String Lc = null;
  public String Ld = null;
  public String Le = null;
  public String Lf = null;
  public String Lg = null;
  public String Lh = null;
  public ArrayList Li = null;
  public int Lj = 0;
  public int Lk = -1;
  private long Ll = -1L;

  public d()
  {
    this.KP = 0.0D;
    this.KO = 0.0D;
    this.KM = 0.0D;
    this.KL = 0.0D;
    this.Lb = null;
    this.KY = null;
    this.KX = null;
    this.KW = null;
    this.KG = false;
    this.Ll = System.currentTimeMillis();
    this.Lj = 0;
    this.Lk = -1;
    this.Li = null;
  }

  public d(d paramd)
  {
    this.KN = paramd.KN;
    this.KL = paramd.KL;
    this.KM = paramd.KM;
    this.KO = paramd.KO;
    this.KP = paramd.KP;
    this.KG = paramd.KG;
    this.KH = paramd.KH;
    this.KT = paramd.KT;
    this.KU = paramd.KU;
    this.KS = 0;
    this.Ks = paramd.Ks;
    this.Kt = paramd.Kt;
    this.KV = paramd.KV;
    this.KW = paramd.KW;
    this.KX = paramd.KX;
    this.KY = paramd.KY;
    this.Lb = paramd.Lb;
    this.Lc = paramd.Lc;
    this.Ld = paramd.Ld;
    this.Le = paramd.Le;
    this.Lf = paramd.Lf;
    this.Lg = paramd.Lg;
    this.Lh = paramd.Lh;
    this.Ll = paramd.Ll;
    this.Lj = paramd.Lj;
    this.Lk = paramd.Lk;
    this.Li = null;
    if (paramd.Li != null)
    {
      this.Li = new ArrayList();
      Iterator localIterator = paramd.Li.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        this.Li.add(localc);
      }
    }
  }

  public final void T(String paramString)
  {
    this.KV = "Unknown";
    this.Kt = "Unknown";
    this.Ks = "Unknown";
    this.KU = "Unknown";
    if (paramString == null);
    String[] arrayOfString;
    int i;
    do
    {
      do
      {
        return;
        arrayOfString = paramString.split(",");
      }
      while (arrayOfString == null);
      i = arrayOfString.length;
      if (i > 0)
        this.KU = arrayOfString[0];
      if (i > 1)
        this.Ks = arrayOfString[1];
      if (i == 3)
        this.Kt = arrayOfString[1];
      while (i == 3)
      {
        this.KV = arrayOfString[2];
        return;
        if (i > 3)
          this.Kt = arrayOfString[2];
      }
    }
    while (i <= 3);
    this.KV = arrayOfString[3];
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append(this.Lk).append(" ").append(this.Lj).append(" ");
    String str1;
    StringBuilder localStringBuilder3;
    if (this.KG)
    {
      str1 = "Mars";
      localStringBuilder3 = localStringBuilder2.append(str1).append(" ");
      if (this.KN != 0)
        break label458;
    }
    label458: for (String str2 = "GPS"; ; str2 = "Network")
    {
      localStringBuilder3.append(str2).append("\n");
      localStringBuilder1.append(this.KL).append(" ").append(this.KM).append("\n");
      localStringBuilder1.append(this.KO).append(" ").append(this.KP).append("\n");
      localStringBuilder1.append(this.KQ).append(" ").append(this.KR).append("\n");
      if (this.Lk == 1)
        localStringBuilder1.append(this.KH).append(" ").append(this.KT).append("\n");
      if ((this.Lk == 3) || (this.Lk == 4))
        localStringBuilder1.append(this.KU).append(" ").append(this.Ks).append(" ").append(this.Kt).append(" ").append(this.KV).append(" ").append(this.KW).append(" ").append(this.KX).append(" ").append(this.KY).append(" ").append(this.Lb).append("\n");
      if ((this.Lk != 4) || (this.Li == null))
        break label465;
      localStringBuilder1.append(this.Li.size()).append("\n");
      Iterator localIterator = this.Li.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        localStringBuilder1.append(localc.KH).append(",").append(localc.KI).append(",").append(localc.KJ).append(",").append(localc.KK).append(",").append(localc.KL).append(",").append(localc.KM).append("\n");
      }
      str1 = "WGS84";
      break;
    }
    label465: if (this.Lk == 7)
    {
      if (this.KS != 0)
        break label584;
      localStringBuilder1.append(this.KU).append(" ").append(this.Ks).append(" ").append(this.Kt).append(" ").append(this.KV).append(" ").append(this.KW).append(" ").append(this.KX).append(" ").append(this.KY).append(" ").append(this.Lb).append("\n");
    }
    while (true)
    {
      return localStringBuilder1.toString();
      label584: if (this.KS == 1)
        localStringBuilder1.append(this.KU).append(" ").append(this.Lc).append(" ").append(this.Ld).append(" ").append(this.Le).append(" ").append(this.Lf).append(" ").append(this.Lg).append(" ").append(this.Lh).append("\n");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.a.a.d
 * JD-Core Version:    0.6.2
 */