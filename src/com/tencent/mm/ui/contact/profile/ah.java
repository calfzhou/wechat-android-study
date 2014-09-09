package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cr;
import java.util.TimerTask;

final class ah extends TimerTask
{
  ah(cr paramcr, cm paramcm)
  {
  }

  public final void run()
  {
    if (this.elE != null)
    {
      this.elE.dismiss();
      this.elF.sendEmptyMessage(0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ah
 * JD-Core Version:    0.6.2
 */