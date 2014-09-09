package com.tencent.mm.ui.setting;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.LauncherUI;

final class bc
  implements View.OnClickListener
{
  bc(SettingsAboutSystemUI paramSettingsAboutSystemUI, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    for (int i = 0; i < this.iXK.getChildCount(); i++)
    {
      TextView localTextView = (TextView)this.iXK.getChildAt(i);
      if (i.aSX != localTextView.getId())
        localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZM, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(0, 0, h.ZL, 0);
    SharedPreferences localSharedPreferences = this.jMk.getSharedPreferences(ak.aHi(), 0);
    boolean bool1 = localSharedPreferences.getBoolean("settings_nav_tab_pos", true);
    int j = ((Integer)paramView.getTag()).intValue();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(j);
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT+BSAsOwccJqRYDj4eEZzt8=", "settings_silence_update_mode choice: %d", arrayOfObject);
    int k;
    if (j == 0)
    {
      k = 1;
      if (bool1)
        break label156;
    }
    label156: for (int m = 1; ; m = 0)
    {
      if (k != m)
        break label162;
      return;
      k = 0;
      break;
    }
    label162: SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    boolean bool2 = false;
    if (j == 1)
      bool2 = true;
    localEditor.putBoolean("settings_nav_tab_pos", bool2).commit();
    if (LauncherUI.aPm() != null)
      LauncherUI.aPm().aPr();
    paramView.post(new bd(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bc
 * JD-Core Version:    0.6.2
 */