package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.List;

public final class q
{
  public static boolean wc(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpI2WocNsy9sFoT3u3tMXqXe", "markNew fail, appId is empty");
      return false;
    }
    e locale = bg.qW().oQ();
    if (locale == null)
    {
      z.e("!32@/B4Tb64lLpI2WocNsy9sFoT3u3tMXqXe", "markNew fail, cfgStg is null");
      return false;
    }
    r localr = new r((byte)0);
    localr.qp((String)locale.get(69121));
    if (!localr.hKR.contains(paramString))
      localr.hKR.add(paramString);
    locale.set(69121, localr.aES());
    return true;
  }

  public static boolean wd(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpI2WocNsy9sFoT3u3tMXqXe", "unmarkNew fail, appId is empty");
      return false;
    }
    e locale = bg.qW().oQ();
    if (locale == null)
    {
      z.e("!32@/B4Tb64lLpI2WocNsy9sFoT3u3tMXqXe", "unmarkNew fail, cfgStg is null");
      return false;
    }
    r localr = new r((byte)0);
    localr.qp((String)locale.get(69121));
    if (localr.hKR.contains(paramString))
      localr.hKR.remove(paramString);
    locale.set(69121, localr.aES());
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.q
 * JD-Core Version:    0.6.2
 */