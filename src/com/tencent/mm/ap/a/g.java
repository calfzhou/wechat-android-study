package com.tencent.mm.ap.a;

import java.util.HashMap;
import java.util.Map;

public enum g
{
  private static final Map izA;
  private static final Map izz;
  private final int[] izB;
  private final String[] izC;

  static
  {
    g[] arrayOfg1 = new g[27];
    arrayOfg1[0] = iyY;
    arrayOfg1[1] = iyZ;
    arrayOfg1[2] = iza;
    arrayOfg1[3] = izb;
    arrayOfg1[4] = izc;
    arrayOfg1[5] = izd;
    arrayOfg1[6] = ize;
    arrayOfg1[7] = izf;
    arrayOfg1[8] = izg;
    arrayOfg1[9] = izh;
    arrayOfg1[10] = izi;
    arrayOfg1[11] = izj;
    arrayOfg1[12] = izk;
    arrayOfg1[13] = izl;
    arrayOfg1[14] = izm;
    arrayOfg1[15] = izn;
    arrayOfg1[16] = izo;
    arrayOfg1[17] = izp;
    arrayOfg1[18] = izq;
    arrayOfg1[19] = izr;
    arrayOfg1[20] = izs;
    arrayOfg1[21] = izt;
    arrayOfg1[22] = izu;
    arrayOfg1[23] = izv;
    arrayOfg1[24] = izw;
    arrayOfg1[25] = izx;
    arrayOfg1[26] = izy;
    izD = arrayOfg1;
    izz = new HashMap();
    izA = new HashMap();
    for (g localg : values())
    {
      for (int i2 : localg.izB)
        izz.put(Integer.valueOf(i2), localg);
      izA.put(localg.name(), localg);
      for (String str : localg.izC)
        izA.put(str, localg);
    }
  }

  private g()
  {
    this(new int[] { 28 }, new String[0]);
  }

  private g(int arg3, String[] arg4)
  {
    int i;
    this.izB = new int[] { i };
    Object localObject;
    this.izC = localObject;
  }

  private g(int[] arg3, String[] arg4)
  {
    Object localObject1;
    this.izB = localObject1;
    Object localObject2;
    this.izC = localObject2;
  }

  public static g Aw(String paramString)
  {
    return (g)izA.get(paramString);
  }

  public final int getValue()
  {
    return this.izB[0];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.g
 * JD-Core Version:    0.6.2
 */