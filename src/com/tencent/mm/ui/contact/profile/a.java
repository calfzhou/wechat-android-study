package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.pluginsdk.ui.v;
import com.tencent.mm.storage.i;

final class a
  implements View.OnClickListener
{
  a(BizInfoHeaderPreference paramBizInfoHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    String str = BizInfoHeaderPreference.a(this.jCL).getUsername();
    new v(BizInfoHeaderPreference.b(this.jCL), str, BizInfoHeaderPreference.c(this.jCL)).aAf();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.a
 * JD-Core Version:    0.6.2
 */