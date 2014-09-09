package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;

final class do
  implements DialogInterface.OnCancelListener
{
  do(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.iMS != null)
    {
      this.dVg.finish();
      this.dVg.startActivity(this.iMS);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.do
 * JD-Core Version:    0.6.2
 */