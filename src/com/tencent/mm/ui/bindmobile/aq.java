package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.MMWizardActivity;

final class aq
  implements DialogInterface.OnClickListener
{
  aq(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent(this.jkD, FindMContactLearmMoreUI.class);
    localIntent.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(this.jkD));
    localIntent.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(this.jkD));
    localIntent.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(this.jkD));
    MMWizardActivity.j(this.jkD, localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.aq
 * JD-Core Version:    0.6.2
 */