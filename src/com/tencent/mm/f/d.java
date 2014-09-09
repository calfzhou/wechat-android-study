package com.tencent.mm.f;

import com.tencent.mm.sdk.platformtools.ch;

public final class d
{
  public static boolean on()
  {
    int i = 1;
    String str = e.or().getValue("LinkedinAddContactClose");
    if ((!ch.jb(str)) && (Integer.valueOf(str).intValue() == i))
      i = 0;
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.f.d
 * JD-Core Version:    0.6.2
 */