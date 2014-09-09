package com.tencent.mm.ui.contact.profile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindqq.BindQQUI;

final class bi
  implements DialogInterface.OnClickListener
{
  bi(bh parambh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MMWizardActivity.j(bh.a(this.jDU), new Intent(bh.a(this.jDU), BindQQUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bi
 * JD-Core Version:    0.6.2
 */