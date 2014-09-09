package com.tencent.mm.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class di
  implements DialogInterface.OnClickListener
{
  di(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      this.dLL.startActivity(new Intent("android.settings.APN_SETTINGS"));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.di
 * JD-Core Version:    0.6.2
 */