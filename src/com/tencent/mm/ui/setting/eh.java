package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.ui.v;
import com.tencent.mm.pluginsdk.ui.y;

final class eh
  implements View.OnClickListener
{
  eh(SettingsPersonalInfoUI paramSettingsPersonalInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    String str = x.pG();
    new v(this.jNM.aPI(), str, null, y.hyI).aAf();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.eh
 * JD-Core Version:    0.6.2
 */