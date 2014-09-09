package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.LauncherUI;

final class dq
  implements DialogInterface.OnClickListener
{
  dq(do paramdo)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    do.a(this.jEI);
    Intent localIntent = new Intent(this.jEI.jEw.getContext(), LauncherUI.class);
    localIntent.putExtra("Intro_Switch", true).addFlags(67108864);
    this.jEI.jEw.getContext().startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dq
 * JD-Core Version:    0.6.2
 */