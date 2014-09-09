package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.account.RegByFacebookSetPwdUI;

final class bi
  implements DialogInterface.OnClickListener
{
  bi(aj paramaj)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jGZ.startActivity(new Intent(this.jGZ.agh(), RegByFacebookSetPwdUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bi
 * JD-Core Version:    0.6.2
 */