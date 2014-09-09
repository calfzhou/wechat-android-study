package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import com.tencent.mm.ui.MMActivity;

final class dh
  implements com.tencent.mm.pluginsdk.ui.applet.i
{
  dh(dd paramdd)
  {
  }

  public final boolean aAJ()
  {
    Intent localIntent = new Intent(NormalUserFooterPreference.b(this.jEG.jEw), SayHiWithSnsPermissionUI.class);
    localIntent.putExtra("Contact_User", NormalUserFooterPreference.a(this.jEG.jEw).getUsername());
    localIntent.putExtra("Contact_Scene", NormalUserFooterPreference.k(this.jEG.jEw));
    NormalUserFooterPreference.b(this.jEG.jEw).startActivity(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dh
 * JD-Core Version:    0.6.2
 */