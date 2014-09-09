package com.tencent.mm.r;

import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.ch;

public final class a
{
  private static int dri = 0;
  private static int drj = 0;

  public static String a(b paramb)
  {
    if (paramb == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder("");
    localStringBuilder.append(ch.ja(paramb.drs));
    localStringBuilder.append("\n-------------------\n");
    localStringBuilder.append(ch.ja(paramb.drq));
    localStringBuilder.append("\n-------------------\n");
    localStringBuilder.append(ch.ja(paramb.drn));
    return localStringBuilder.toString();
  }

  public static String b(b paramb)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (!x.cY(paramb.diG))
    {
      localStringBuilder.append(paramb.drk);
      localStringBuilder.append(": ");
    }
    String str;
    if (ch.jb(paramb.drs))
      if (ch.jb(paramb.drq))
        str = paramb.drn;
    while (true)
    {
      localStringBuilder.append(str);
      return localStringBuilder.toString();
      str = paramb.drq;
      continue;
      str = paramb.drs;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.r.a
 * JD-Core Version:    0.6.2
 */