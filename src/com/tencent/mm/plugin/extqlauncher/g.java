package com.tencent.mm.plugin.extqlauncher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.c.a.he;
import com.tencent.mm.c.a.hf;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class g extends com.tencent.mm.sdk.c.g
{
  public g(b paramb)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!b.a(this.eNa))
      z.e("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "!isPluginInstall");
    while (true)
    {
      return false;
      if (ak.getContext() == null)
      {
        z.e("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "MMApplicationContext null");
        return false;
      }
      he localhe = (he)parame;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(localhe.cLT.cGN);
      arrayOfObject1[1] = localhe.cLT.cLW;
      z.d("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "GetScanCodeEvent callback flag = %s, url = %s", arrayOfObject1);
      try
      {
        switch (localhe.cLT.cGN)
        {
        case 0:
          if ((!ch.jb(localhe.cLT.cLW)) && (localhe.cLT.cLW.startsWith("qlauncher://")))
          {
            Intent localIntent = new Intent("android.intent.action.VIEW");
            localIntent.setComponent(new ComponentName("com.tencent.qlauncher", "com.tencent.qlauncher.thirdpartycoop.DispatchActivity"));
            localIntent.setData(Uri.parse(localhe.cLT.cLW));
            localIntent.setFlags(268435456);
            ak.getContext().startActivity(localIntent);
            localhe.cLU.ret = 1;
            return true;
          }
          break;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpIAhUt0Bg2QTqyk2VFFNI8farTpuVFOhY8=", "Exception in ScanCodeResultEvent, %s", arrayOfObject2);
        return false;
      }
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.g
 * JD-Core Version:    0.6.2
 */