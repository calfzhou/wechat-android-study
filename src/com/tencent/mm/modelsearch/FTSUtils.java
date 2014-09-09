package com.tencent.mm.modelsearch;

import com.tencent.kingkong.database.SQLiteDatabase;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FTSUtils
{
  public static int a(Map paramMap, int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    if (paramInt1 == paramInt2)
      return 0;
    Integer localInteger1 = (Integer)paramMap.get(Integer.valueOf(paramInt1));
    int j;
    Integer localInteger2;
    if (localInteger1 == null)
    {
      j = i;
      localInteger2 = (Integer)paramMap.get(Integer.valueOf(paramInt2));
      if (localInteger2 != null)
        break label68;
    }
    while (true)
    {
      return j - i;
      j = localInteger1.intValue();
      break;
      label68: i = localInteger2.intValue();
    }
  }

  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    if (paramInt1 == paramInt2)
      return 0;
    int j;
    if (paramInt1 >= paramArrayOfInt.length)
    {
      j = i;
      if (paramInt2 < paramArrayOfInt.length)
        break label38;
    }
    while (true)
    {
      return j - i;
      j = paramArrayOfInt[paramInt1];
      break;
      label38: i = paramArrayOfInt[paramInt2];
    }
  }

  public static List a(List paramList, Map paramMap, int paramInt1, int paramInt2)
  {
    b localb = new b(paramMap);
    h localh = new h();
    localh.type = paramInt1;
    int i = Collections.binarySearch(paramList, localh, localb);
    int j;
    int m;
    if (paramInt2 == paramInt1)
    {
      j = i;
      if (i >= 0)
        break label102;
      m = -1 + -i;
      label56: if (j >= 0)
        break label140;
    }
    label102: int i1;
    for (int i2 = -1 + -j; ; i2 = i1)
    {
      return paramList.subList(m, i2);
      localh.type = paramInt2;
      j = Collections.binarySearch(paramList, localh, localb);
      break;
      int k;
      do
      {
        i = k;
        k = i - 1;
      }
      while ((k >= 0) && (((h)paramList.get(k)).type == paramInt1));
      m = k + 1;
      break label56;
      label140: int n = paramList.size();
      for (i1 = j + 1; (i1 < n) && (((h)paramList.get(i1)).type == paramInt2); i1++);
    }
  }

  static native int countTokens(String paramString);

  public static int[] d(String[] paramArrayOfString)
  {
    int[] arrayOfInt = new int[paramArrayOfString.length];
    if (paramArrayOfString.length > 0)
    {
      arrayOfInt[0] = 0;
      for (int i = 1; i < paramArrayOfString.length; i++)
        arrayOfInt[i] = (arrayOfInt[(i - 1)] + countTokens(paramArrayOfString[(i - 1)]));
    }
    return arrayOfInt;
  }

  public static native int initFts(SQLiteDatabase paramSQLiteDatabase, byte[] paramArrayOfByte);

  public static String jo(String paramString)
  {
    if (paramString != null)
      return paramString.replace('*', ' ').trim();
    return null;
  }

  public static native int stringCompareUtfBinary(String paramString1, String paramString2);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsearch.FTSUtils
 * JD-Core Version:    0.6.2
 */