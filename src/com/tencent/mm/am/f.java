package com.tencent.mm.am;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class f
  implements b
{
  f(String paramString1, Intent paramIntent, String paramString2, Context paramContext)
  {
  }

  public final void onDone()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.jSJ;
    z.d("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "[DEBUG] onDone Load %s", arrayOfObject);
    try
    {
      Intent localIntent;
      String str1;
      if (this.exR == null)
      {
        localIntent = new Intent();
        str1 = ak.aHh() + ".plugin." + this.jSJ;
        if (!this.jSK.startsWith("."))
          break label152;
      }
      label152: for (String str2 = str1 + this.jSK; ; str2 = this.jSK)
      {
        localIntent.setClassName(ak.getPackageName(), str2);
        Class.forName(str2, false, this.dLL.getClassLoader());
        if (!(this.dLL instanceof Activity))
          break label161;
        this.dLL.startActivity(localIntent);
        return;
        localIntent = this.exR;
        break;
      }
      label161: localIntent.addFlags(268435456);
      this.dLL.startActivity(localIntent);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      z.e("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "Class Not Found when startActivity %s", new Object[] { localClassNotFoundException });
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.f
 * JD-Core Version:    0.6.2
 */