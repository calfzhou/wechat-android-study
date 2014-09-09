package com.tencent.mm.at;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class h
{
  int cOR;
  String className;
  int iHG;
  int iHH;
  String iHI;

  public h(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.className = paramString;
    this.cOR = paramInt1;
    this.iHG = paramInt2;
    this.iHH = paramInt3;
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (ch.jb(paramString))
    {
      localStringBuilder1.append(d.iHA).append("WEIXIN_").append(System.currentTimeMillis()).append(".trace");
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localStringBuilder1.toString();
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE startMethod path %s traceSize : %d", arrayOfObject);
      this.iHI = localStringBuilder1.toString();
      return;
    }
    StringBuilder localStringBuilder2 = localStringBuilder1.append(d.iHA).append(paramString).append("_");
    String str = "";
    switch (paramInt1)
    {
    default:
    case 1:
    case 3:
    case 2:
    case 4:
    case 5:
    }
    while (true)
    {
      localStringBuilder2.append(str).append(".trace");
      break;
      str = "onResume";
      continue;
      str = "onCreate";
      continue;
      str = "onPause";
      continue;
      str = "onScrool";
      continue;
      str = "all";
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.h
 * JD-Core Version:    0.6.2
 */