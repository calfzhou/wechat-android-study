package com.tencent.mm.model;

import android.content.Context;
import android.os.Debug;
import android.provider.Settings.Secure;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.Map;

public final class ch
{
  private static bp dlL = null;
  private static boolean dlM = false;

  public static boolean checkMsgLevel()
  {
    return NorMsgSource.checkMsgLevel();
  }

  public static void eq(String paramString)
  {
    z.d("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "parseMsgSource msgSrc: %s", new Object[] { paramString });
    if (com.tencent.mm.sdk.platformtools.ch.jb(paramString))
      return;
    bg.qQ().a(new ci(paramString), 1800000L);
  }

  public static boolean rA()
  {
    Context localContext = ak.getContext();
    if (localContext == null)
      z.w("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "Failed checking mock location: application context not initialized.");
    while (Settings.Secure.getInt(localContext.getContentResolver(), "mock_location", 0) == 0)
      return false;
    return true;
  }

  public static String rx()
  {
    String str = (String)bg.qW().oQ().get(70, null);
    if (!com.tencent.mm.sdk.platformtools.ch.jb(str))
      bg.qW().oQ().set(70, "");
    z.d("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "getMsg ccr[%s]", new Object[] { str });
    return "<msgsource>" + com.tencent.mm.sdk.platformtools.ch.ja(str) + "</msgsource>";
  }

  public static String ry()
  {
    Context localContext = ak.getContext();
    if (localContext == null)
      return null;
    return com.tencent.mm.sdk.platformtools.ch.bK(localContext);
  }

  public static String rz()
  {
    int i = 1;
    Map localMap = v.nt();
    String str1 = (String)localMap.get("model name");
    if (str1 == null);
    for (String str2 = v.nm()[0]; ; str2 = str1)
    {
      String str3 = (String)localMap.get("features");
      if (str3 == null);
      for (String str4 = (String)localMap.get("flags"); ; str4 = str3)
      {
        String str5 = "";
        if (bg.oE())
          str5 = (String)bg.qW().oQ().get(79, "");
        bg.qQ().a(new cj(), 5000L);
        Object[] arrayOfObject = new Object[21];
        int j;
        int k;
        if (rA())
        {
          j = i;
          arrayOfObject[0] = Integer.valueOf(j);
          if (!NorMsgSource.checkMsgLevel())
            break label354;
          k = i;
          label138: arrayOfObject[i] = Integer.valueOf(k);
          if (!Debug.isDebuggerConnected())
            break label360;
        }
        while (true)
        {
          arrayOfObject[2] = Integer.valueOf(i);
          arrayOfObject[3] = str5;
          arrayOfObject[4] = str2;
          arrayOfObject[5] = v.no();
          arrayOfObject[6] = v.np();
          arrayOfObject[7] = v.ng();
          arrayOfObject[8] = v.nq();
          arrayOfObject[9] = v.nr();
          arrayOfObject[10] = v.getAndroidId();
          arrayOfObject[11] = v.ns();
          arrayOfObject[12] = v.nl();
          arrayOfObject[13] = Integer.valueOf(v.nu());
          arrayOfObject[14] = com.tencent.mm.sdk.platformtools.ch.ja((String)localMap.get("hardware"));
          arrayOfObject[15] = com.tencent.mm.sdk.platformtools.ch.ja((String)localMap.get("revision"));
          arrayOfObject[16] = com.tencent.mm.sdk.platformtools.ch.ja((String)localMap.get("serial"));
          arrayOfObject[17] = v.ni();
          arrayOfObject[18] = v.nn();
          arrayOfObject[19] = com.tencent.mm.sdk.platformtools.ch.ja(str4);
          arrayOfObject[20] = Integer.valueOf(v.nx());
          return String.format("<softtype><lctmoc>%d</lctmoc><level>%d</level><k26>%d</k26>%s<k1>%s</k1><k2>%s</k2><k3>%s</k3><k4>%s</k4><k5>%s</k5><k6>%s</k6><k7>%s</k7><k8>%s</k8><k9>%s</k9><k10>%d</k10><k11>%s</k11><k12>%s</k12><k13>%s</k13><k14>%s</k14><k15>%s</k15><k16>%s</k16><k17>%d</k17></softtype>", arrayOfObject);
          j = 0;
          break;
          label354: k = 0;
          break label138;
          label360: i = 0;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ch
 * JD-Core Version:    0.6.2
 */