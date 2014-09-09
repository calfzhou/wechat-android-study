package com.tencent.mm.ui.friend;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.MMWizardActivity;

final class ap
  implements DialogInterface.OnClickListener
{
  ap(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((FindMContactAddUI.k(this.jIz) != null) && (FindMContactAddUI.k(this.jIz).contains("2")))
    {
      Intent localIntent = new Intent(this.jIz, FindMContactInviteUI.class);
      localIntent.putExtra("regsetinfo_ticket", FindMContactAddUI.l(this.jIz));
      localIntent.putExtra("login_type", FindMContactAddUI.m(this.jIz));
      localIntent.putExtra("regsetinfo_NextStyle", FindMContactAddUI.e(this.jIz));
      MMWizardActivity.j(this.jIz, localIntent);
      return;
    }
    FindMContactAddUI.n(this.jIz);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ap
 * JD-Core Version:    0.6.2
 */