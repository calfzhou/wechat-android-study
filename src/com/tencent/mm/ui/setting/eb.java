package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.platformtools.ap;

final class eb
  implements DialogInterface.OnClickListener
{
  eb(SettingsNetStatUI paramSettingsNetStatUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    r.Ap().ey((int)(ap.CO() / 86400000L));
    SettingsNetStatUI.b(this.jNJ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.eb
 * JD-Core Version:    0.6.2
 */