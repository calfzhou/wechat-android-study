package com.tencent.mm.ui.contact.profile;

import android.app.ProgressDialog;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.TimerTask;

final class bx extends TimerTask
{
  bx(ProgressDialog paramProgressDialog, cm paramcm)
  {
  }

  public final void run()
  {
    if (this.fDe != null)
    {
      this.fDe.dismiss();
      this.elF.sendEmptyMessage(0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bx
 * JD-Core Version:    0.6.2
 */