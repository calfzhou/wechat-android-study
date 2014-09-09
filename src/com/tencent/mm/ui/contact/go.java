package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.LauncherUI;

final class go
  implements MenuItem.OnMenuItemClickListener
{
  go(VoipAddressUI paramVoipAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (VoipAddressUI.c(this.jCH))
    {
      Intent localIntent = new Intent(this.jCH, LauncherUI.class);
      localIntent.addFlags(67108864);
      this.jCH.startActivity(localIntent);
    }
    this.jCH.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.go
 * JD-Core Version:    0.6.2
 */