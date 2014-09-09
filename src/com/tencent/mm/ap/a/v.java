package com.tencent.mm.ap.a;

import java.util.Map;

public final class v
  implements aj
{
  public final d a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    Object localObject;
    switch (w.iAG[parama.ordinal()])
    {
    default:
      throw new IllegalArgumentException("No encoder available for format " + parama);
    case 1:
      localObject = new k();
    case 2:
    case 3:
    }
    while (true)
    {
      return ((aj)localObject).a(paramString, parama, paramInt1, paramInt2, paramMap);
      localObject = new ab();
      continue;
      localObject = new i();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.v
 * JD-Core Version:    0.6.2
 */