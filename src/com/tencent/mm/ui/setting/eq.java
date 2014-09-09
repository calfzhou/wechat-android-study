package com.tencent.mm.ui.setting;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class eq
  implements MenuItem.OnMenuItemClickListener
{
  eq(SettingsRingtoneUI paramSettingsRingtoneUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SharedPreferences.Editor localEditor = this.jNZ.getSharedPreferences(ak.aHi(), 0).edit();
    if (SettingsRingtoneUI.a(this.jNZ) != 0)
    {
      Uri localUri = SettingsRingtoneUI.a(this.jNZ, SettingsRingtoneUI.a(this.jNZ));
      z.d("!32@gYUvCHi91do+WRaEASHU65WymiD826j/", "set ringtone to " + localUri);
      if (localUri != null)
      {
        localEditor.putString("settings.ringtone", localUri.toString());
        String str = SettingsRingtoneUI.a(this.jNZ, localUri);
        localEditor.putString("settings.ringtone.name", str);
        z.d("!32@gYUvCHi91do+WRaEASHU65WymiD826j/", "ringtone name: " + str);
      }
    }
    while (true)
    {
      localEditor.commit();
      this.jNZ.finish();
      return true;
      localEditor.putString("settings.ringtone", SettingsRingtoneUI.jNT);
      localEditor.putString("settings.ringtone.name", this.jNZ.getString(n.cge));
      z.d("!32@gYUvCHi91do+WRaEASHU65WymiD826j/", "set ringtone follow system");
      continue;
      localEditor.putString("settings.ringtone", SettingsRingtoneUI.jNT);
      localEditor.putString("settings.ringtone.name", this.jNZ.getString(n.cge));
      z.d("!32@gYUvCHi91do+WRaEASHU65WymiD826j/", "set ringtone follow system");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.eq
 * JD-Core Version:    0.6.2
 */