package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.mm.o.x;

final class cd
  implements Runnable
{
  cd(cc paramcc, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    if (SettingsAliasUI.h(this.jNf.jNd) != null)
    {
      SettingsAliasUI.h(this.jNf.jNd).dismiss();
      SettingsAliasUI.i(this.jNf.jNd);
    }
    SettingsAliasUI.j(this.jNf.jNd);
    if (this.dpb.getType() == 255)
      if ((this.dpe == -3) && (this.dpd == 4))
        break label127;
    label127: for (boolean bool = true; ; bool = false)
    {
      Intent localIntent = new Intent(this.jNf.jNd, SettingsAliasResultUI.class);
      localIntent.putExtra("has_pwd", bool);
      this.jNf.jNd.startActivity(localIntent);
      this.jNf.jNd.finish();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cd
 * JD-Core Version:    0.6.2
 */