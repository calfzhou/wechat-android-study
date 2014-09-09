package com.tencent.mm.am;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.tencent.mm.sdk.platformtools.ak;

final class j
  implements b
{
  j(Intent paramIntent, String paramString1, String paramString2, Fragment paramFragment, int paramInt)
  {
  }

  public final void onDone()
  {
    Intent localIntent;
    String str1;
    if (this.exR == null)
    {
      localIntent = new Intent();
      str1 = ak.aHh() + ".plugin." + this.jSJ;
      if (!this.jSK.startsWith("."))
        break label108;
    }
    label108: for (String str2 = str1 + this.jSK; ; str2 = this.jSK)
    {
      localIntent.setClassName(ak.getPackageName(), str2);
      this.bK.startActivityForResult(localIntent, this.goC);
      return;
      localIntent = this.exR;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.j
 * JD-Core Version:    0.6.2
 */