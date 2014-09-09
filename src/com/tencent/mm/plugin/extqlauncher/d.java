package com.tencent.mm.plugin.extqlauncher;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class d
  implements Runnable
{
  d(b paramb)
  {
  }

  public final void run()
  {
    while (true)
    {
      int k;
      try
      {
        b.a(this.eNa, System.currentTimeMillis());
        List localList = ak.getContext().getPackageManager().getInstalledApplications(128);
        if (localList != null)
          break label362;
        z.e("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "getInstalledApplications return null");
        b.a(this.eNa, false);
        return;
        if (i >= localList.size())
          break label328;
        ApplicationInfo localApplicationInfo = (ApplicationInfo)localList.get(i);
        if ((localApplicationInfo == null) || ((!ch.ja(localApplicationInfo.packageName).startsWith("com.tencent.qlauncher")) && (!ch.ja(localApplicationInfo.packageName).startsWith("com.tencent.qqlauncher"))) || (localApplicationInfo.metaData == null))
          break label368;
        String str = localApplicationInfo.metaData.getString("qlauncher_wx_coop");
        if ((str == null) || (str.length() <= 0))
        {
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = localApplicationInfo.packageName;
          arrayOfObject3[1] = Long.valueOf(System.currentTimeMillis() - b.c(this.eNa));
          z.w("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "qlauncher_wx_coop not found, %s, costTime = %s", arrayOfObject3);
          b.a(this.eNa, false);
          break label368;
        }
        String[] arrayOfString = str.split(",");
        if (arrayOfString == null)
          break label316;
        int j = arrayOfString.length;
        k = 0;
        if (k >= j)
          break label316;
        if (ch.ja(arrayOfString[k]).trim().equalsIgnoreCase("fun1"))
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = localApplicationInfo.packageName;
          z.d("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "founded qlauncher, %s", arrayOfObject4);
          b.a(this.eNa, true);
          return;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "exception in getApplicationInfo, %s", arrayOfObject1);
        b.a(this.eNa, false);
        return;
      }
      k++;
      continue;
      label316: b.a(this.eNa, false);
      break label368;
      label328: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - b.c(this.eNa));
      z.d("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "qlauncher not founded, costTime = %s", arrayOfObject2);
      return;
      label362: int i = 0;
      continue;
      label368: i++;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.d
 * JD-Core Version:    0.6.2
 */