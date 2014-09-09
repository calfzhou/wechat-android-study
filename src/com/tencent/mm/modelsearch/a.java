package com.tencent.mm.modelsearch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class a
{
  public static final int[] dBA;
  public static final int[] dBB;
  public static final int[] dBC;
  public static final int[] dBD;
  public static final int[] dBE;
  public static final int[] dBF;
  public static final int[] dBG;
  public static final Pattern dBH;
  public static final int[] dBp;
  public static final int[] dBq;
  public static final int[] dBr;
  public static final int[] dBs;
  public static final int[] dBt;
  public static final int[] dBu;
  public static final int[] dBv;
  public static final int[] dBw;
  public static final int[] dBx;
  public static final Map dBy;
  public static final int[] dBz;

  static
  {
    int i = 0;
    dBp = new int[] { 65536 };
    dBq = new int[] { 196608 };
    dBr = new int[] { 262144 };
    dBs = new int[] { 131072, 131073, 131074, 131075, 131076 };
    dBt = new int[] { 131072, 131073, 131074 };
    dBu = new int[] { 131072 };
    dBv = new int[] { 131075, 131076 };
    dBw = new int[] { 131077, 131078 };
    dBx = new int[] { 131079, 131080 };
    dBz = new int[] { 4, 5, 6, 11, 12, 13, 14, 19 };
    dBA = new int[] { 1, 3, 9, 10, 2, 7, 8 };
    dBB = new int[] { 4, 6, 13, 14, 5, 11, 12, 19, 24 };
    dBC = new int[] { 15, 16, 17, 18, 5, 11, 12 };
    int[] arrayOfInt1 = { 25, 26, 27 };
    dBD = arrayOfInt1;
    dBE = arrayOfInt1;
    dBH = Pattern.compile(";");
    int[] arrayOfInt2 = { 131072, 131075, 131076, 131073, 131074, 131077, 131078, 131079, 131080 };
    int[] arrayOfInt3 = { 3, 9, 10, 23, 2, 7, 8, 25, 26, 27, 28, 16, 17, 18, 1, 15, 30, 29, 34, 35, 36, 31, 32, 33, 30, 37, 38, 39, 30, 29, 6, 13, 14, 24, 19, 5, 11, 12, 4, 21, 20, 22, 0 };
    int[] arrayOfInt4 = { 1, 2, 3, 4, 5, 6, 8, 19, 20, 21, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 7, 0 };
    HashMap localHashMap = new HashMap();
    for (int j = 0; j < 9; j++)
      localHashMap.put(Integer.valueOf(arrayOfInt2[j]), Integer.valueOf(j));
    dBy = Collections.unmodifiableMap(localHashMap);
    dBF = new int[43];
    for (int k = 0; k < 43; k++)
      dBF[arrayOfInt3[k]] = k;
    dBG = new int[27];
    while (i < 27)
    {
      dBG[arrayOfInt4[i]] = i;
      i++;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsearch.a
 * JD-Core Version:    0.6.2
 */