package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.modelsimple.f;

final class dt
  implements DialogInterface.OnClickListener
{
  dt(Intent paramIntent, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.iMS != null)
    {
      this.dVg.finish();
      this.dVg.startActivity(this.iMS);
      f.H(this.dVg);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dt
 * JD-Core Version:    0.6.2
 */