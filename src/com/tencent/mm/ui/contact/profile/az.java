package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.base.cr;
import java.util.TimerTask;

final class az extends TimerTask
{
  az(cr paramcr, cm paramcm)
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
 * Qualified Name:     com.tencent.mm.ui.contact.profile.az
 * JD-Core Version:    0.6.2
 */