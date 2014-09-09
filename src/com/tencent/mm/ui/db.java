package com.tencent.mm.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

final class db
  implements DialogInterface.OnClickListener
{
  db(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      Intent localIntent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
      this.dLL.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", localException, "showLbsTipsAlert", new Object[0]);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.db
 * JD-Core Version:    0.6.2
 */