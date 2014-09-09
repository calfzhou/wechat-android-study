package com.tencent.mm.pluginsdk.ui.tools;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;

final class e
  implements View.OnClickListener
{
  e(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onClick(View paramView)
  {
    if ((AppChooserUI.c(this.hKu) != null) && (AppChooserUI.c(this.hKu).hKB != null))
    {
      bg.qW().oQ().set(AppChooserUI.a(this.hKu, 274528), AppChooserUI.c(this.hKu).hKB.activityInfo.packageName);
      AppChooserUI.a(this.hKu, AppChooserUI.c(this.hKu).hKB.activityInfo.packageName, true);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.e
 * JD-Core Version:    0.6.2
 */