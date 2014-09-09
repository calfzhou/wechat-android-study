package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.mm.modelsimple.f;

final class ds
  implements DialogInterface.OnCancelListener
{
  ds(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.iMS != null)
    {
      if (!(this.dVg instanceof LauncherUI))
        this.dVg.finish();
      this.dVg.startActivity(this.iMS);
      f.H(this.dVg);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ds
 * JD-Core Version:    0.6.2
 */