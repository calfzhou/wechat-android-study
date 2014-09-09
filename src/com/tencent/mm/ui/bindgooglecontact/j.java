package com.tencent.mm.ui.bindgooglecontact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;

final class j
  implements DialogInterface.OnClickListener
{
  j(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qW().oQ().set(208905, Boolean.valueOf(true));
    this.jiq.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.j
 * JD-Core Version:    0.6.2
 */