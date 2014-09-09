package com.tencent.mm.booter;

import com.tencent.mm.sdk.platformtools.z;

public final class h
{
  public static Object c(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
      try
      {
        z.e("!44@/B4Tb64lLpKDiUa1siRPtpv9pAip3uJwDid7q+sGdMU=", "unknown type");
        break label78;
        return Integer.valueOf(paramString);
        return Long.valueOf(paramString);
        return Boolean.valueOf(paramString);
        return Float.valueOf(paramString);
        Double localDouble = Double.valueOf(paramString);
        return localDouble;
      }
      catch (Exception localException)
      {
        label78: paramString = null;
      }
    case 3:
    }
    return paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.h
 * JD-Core Version:    0.6.2
 */