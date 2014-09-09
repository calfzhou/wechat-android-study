package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.LauncherUI;

final class b
  implements MenuItem.OnMenuItemClickListener
{
  b(ContactInfoUI paramContactInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (!ContactInfoUI.a(this.jCT))
    {
      this.jCT.finish();
      return true;
    }
    if (((y.dx(ContactInfoUI.b(this.jCT).getUsername())) && (!x.pV())) || ((y.dp(ContactInfoUI.b(this.jCT).getUsername())) && (!x.pR())) || ((y.dr(ContactInfoUI.b(this.jCT).getUsername())) && (!x.qb())) || ((y.dl(ContactInfoUI.b(this.jCT).getUsername())) && (!x.qd())))
    {
      Intent localIntent = new Intent(this.jCT, LauncherUI.class);
      localIntent.addFlags(67108864);
      this.jCT.startActivity(localIntent);
    }
    this.jCT.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.b
 * JD-Core Version:    0.6.2
 */