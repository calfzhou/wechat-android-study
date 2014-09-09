package com.tencent.mm.pluginsdk.ui.tools;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.View.OnClickListener;

final class f
  implements View.OnClickListener
{
  f(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onClick(View paramView)
  {
    if ((AppChooserUI.c(this.hKu) != null) && (AppChooserUI.c(this.hKu).hKB != null))
      AppChooserUI.a(this.hKu, AppChooserUI.c(this.hKu).hKB.activityInfo.packageName, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.f
 * JD-Core Version:    0.6.2
 */