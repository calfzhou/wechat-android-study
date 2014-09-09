package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.storage.i;

final class t
  implements View.OnClickListener
{
  t(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_permission_userName", NormalUserHeaderPreference.b(this.hHW).getUsername());
    localIntent.putExtra("sns_permission_anim", true);
    a.b(NormalUserHeaderPreference.a(this.hHW), "sns", ".ui.SnsPermissionUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.t
 * JD-Core Version:    0.6.2
 */