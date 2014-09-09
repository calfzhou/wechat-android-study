package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

public final class ar
{
  public static boolean bl(Context paramContext)
  {
    if (!com.tencent.mm.sdk.platformtools.as.AO("network_doctor_shown"))
      return false;
    e.a(paramContext, n.bUj, n.buo, new at(paramContext), null);
    return true;
  }

  public static boolean j(Context paramContext, String paramString1, String paramString2)
  {
    if (!com.tencent.mm.sdk.platformtools.as.AO("wap_reporter_shown"))
      return false;
    e.a(paramContext, n.caf, n.buo, n.fgI, n.bsK, new as(paramContext, paramString1, paramString2), null);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ar
 * JD-Core Version:    0.6.2
 */