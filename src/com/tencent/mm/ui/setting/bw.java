package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;

final class bw
  implements View.OnClickListener
{
  bw(SettingsAliasResultUI paramSettingsAliasResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.jMZ.aPI(), RegByMobileSetPwdUI.class);
    localIntent.putExtra("kintent_hint", this.jMZ.getString(n.bYL));
    this.jMZ.startActivityForResult(localIntent, 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bw
 * JD-Core Version:    0.6.2
 */