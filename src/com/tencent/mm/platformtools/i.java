package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;

public final class i
{
  public static String Dv()
  {
    return h.dOL.replace(h.dOH, "/sdcard");
  }

  public static boolean d(String paramString, Context paramContext)
  {
    if ((paramString != null) && (!paramString.equals("")))
    {
      String str = jz("jpg");
      p.bA(paramString, str);
      e(str, paramContext);
      int i = n.bDP;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Dv();
      Toast.makeText(paramContext, paramContext.getString(i, arrayOfObject), 1).show();
      return true;
    }
    return false;
  }

  public static void e(String paramString, Context paramContext)
  {
    paramContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + paramString)));
    z.i("!32@mGXR/vVzLfPkSX4UeBFGNYxbm5SDeDid", "refreshing media scanner on path=%s", new Object[] { paramString });
  }

  public static String jz(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(h.dOL);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "mmexport";
    arrayOfObject[1] = Long.valueOf(System.currentTimeMillis());
    arrayOfObject[2] = paramString;
    return String.format("%s%d.%s", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.i
 * JD-Core Version:    0.6.2
 */