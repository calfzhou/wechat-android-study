package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class ag
  implements View.OnClickListener
{
  ag(BindMContactUI paramBindMContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", BindMContactUI.g(this.jkl));
    localIntent.putExtra("couttry_code", BindMContactUI.c(this.jkl));
    a.dWo.b(localIntent, this.jkl);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ag
 * JD-Core Version:    0.6.2
 */