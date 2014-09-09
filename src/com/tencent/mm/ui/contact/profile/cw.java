package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.storage.i;

final class cw
  implements View.OnClickListener
{
  cw(cf paramcf)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_permission_userName", NormalUserFooterPreference.a(this.jEy.jEw).getUsername());
    localIntent.putExtra("sns_permission_anim", true);
    a.b(NormalUserFooterPreference.b(this.jEy.jEw), "sns", ".ui.SnsPermissionUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cw
 * JD-Core Version:    0.6.2
 */