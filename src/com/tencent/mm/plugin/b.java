package com.tencent.mm.plugin;

import com.tencent.mm.am.a;
import com.tencent.mm.f.c;
import com.tencent.mm.f.e;
import com.tencent.mm.sdk.platformtools.ch;

public final class b
{
  public static boolean DK()
  {
    if (!a.to("translate"));
    String str;
    do
    {
      return false;
      str = e.or().getValue("TranslateMsgOff");
      if (ch.jb(str))
        return true;
    }
    while (ch.xy(str) != 0);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.b
 * JD-Core Version:    0.6.2
 */