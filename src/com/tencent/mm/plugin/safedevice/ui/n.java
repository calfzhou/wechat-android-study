package com.tencent.mm.plugin.safedevice.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;

final class n
  implements DialogInterface.OnClickListener
{
  n(MySafeDeviceListUI paramMySafeDeviceListUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = (String)bg.qW().oQ().get(6);
    if (ch.jb(str))
    {
      z.d("!44@/B4Tb64lLpK17Cy+IK1HH08djXQCkIZFwr3WucVnP+g=", "not bind mobile");
      return;
    }
    Intent localIntent = new Intent(this.fUe, SecurityAccountIntroUI.class);
    localIntent.putExtra("binded_mobile", str);
    localIntent.putExtra("re_open_verify", true);
    MMWizardActivity.j(this.fUe, localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.n
 * JD-Core Version:    0.6.2
 */