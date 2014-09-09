package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.sdk.platformtools.ak;

final class o
  implements DialogInterface.OnClickListener
{
  o(n paramn)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(AppUpdaterUI.e(this.iBD.iBB).iBP[0]));
    localIntent.addFlags(268435456);
    ak.getContext().startActivity(localIntent);
    AppUpdaterUI.f(this.iBD.iBB);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.o
 * JD-Core Version:    0.6.2
 */