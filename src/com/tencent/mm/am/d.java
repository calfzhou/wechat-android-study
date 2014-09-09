package com.tencent.mm.am;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMWizardActivity;

final class d
  implements b
{
  d(Intent paramIntent, String paramString1, String paramString2, Context paramContext)
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
        break label104;
    }
    label104: for (String str2 = str1 + this.jSK; ; str2 = this.jSK)
    {
      localIntent.setClassName(ak.getPackageName(), str2);
      MMWizardActivity.j(this.dLL, localIntent);
      return;
      localIntent = this.exR;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.d
 * JD-Core Version:    0.6.2
 */