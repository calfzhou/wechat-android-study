package com.tencent.mm.b;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private String cFD;
  private Map cFE = new HashMap();

  private g(String paramString)
  {
    if (paramString == null)
    {
      this.cFD = "http://dldir1.qq.com/foxmail/";
      return;
    }
    this.cFD = paramString;
  }

  public static g an(String paramString)
  {
    Map localMap = x.bB(paramString, "patchupdate");
    if (localMap == null)
      return null;
    g localg = new g((String)localMap.get(".patchupdate.$base"));
    int i = ch.getInt((String)localMap.get(".patchupdate.$count"), 0);
    int j = 0;
    if (j >= i)
      return localg;
    StringBuilder localStringBuilder = new StringBuilder(".patchupdate.item");
    Object localObject;
    label82: h localh;
    if (j > 0)
    {
      localObject = Integer.valueOf(j);
      String str = localObject;
      localh = new h((String)localMap.get(str + ".$old"), (String)localMap.get(str + ".$new"), (String)localMap.get(str + ".$patch"), (String)localMap.get(str + ".$url"), ch.getInt((String)localMap.get(str + ".$size"), 0));
      if ((localh.cFF == null) || (localh.cFG == null) || (localh.cFH == null) || (localh.url == null))
        break label322;
    }
    label322: for (int k = 1; ; k = 0)
    {
      if (k != 0)
        localg.cFE.put(localh.cFF, localh);
      j++;
      break;
      localObject = "";
      break label82;
    }
  }

  public final h am(String paramString)
  {
    return (h)this.cFE.get(paramString);
  }

  public final String hH()
  {
    return this.cFD;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.g
 * JD-Core Version:    0.6.2
 */