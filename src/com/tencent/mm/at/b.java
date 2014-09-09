package com.tencent.mm.at;

import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b
{
  private static boolean iHs = false;

  public static void oy(int paramInt)
  {
    boolean bool1;
    boolean bool3;
    boolean bool2;
    boolean bool4;
    switch (paramInt)
    {
    default:
      bool1 = false;
      bool3 = false;
      bool2 = false;
      bool4 = false;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Boolean.valueOf(bool4);
      arrayOfObject[1] = Boolean.valueOf(bool2);
      arrayOfObject[2] = Boolean.valueOf(bool3);
      arrayOfObject[3] = Boolean.valueOf(bool1);
      z.d("!44@/B4Tb64lLpI67oPDTT86rE/rkKVKjyGP17sNLUXP5EY=", "hprof operate: dump:%b, checkWifi:%b, uploadSingal:%b,uploadAll:%b,", arrayOfObject);
      Executors.newSingleThreadExecutor().execute(new c(bool4, bool2, bool3, bool1));
      return;
      bool3 = true;
      bool4 = true;
      bool1 = false;
      bool2 = false;
      continue;
      bool3 = true;
      bool2 = true;
      bool4 = true;
      bool1 = false;
      continue;
      bool4 = true;
      bool1 = false;
      bool3 = false;
      bool2 = false;
      continue;
      bool1 = true;
      bool3 = false;
      bool2 = false;
      bool4 = false;
      continue;
      bool1 = true;
      bool2 = true;
      bool3 = false;
      bool4 = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.b
 * JD-Core Version:    0.6.2
 */