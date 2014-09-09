package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class bp
  implements DialogInterface.OnCancelListener
{
  bp(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (MobileFriendUI.a(this.jkQ) != null)
      bg.qX().c(MobileFriendUI.a(this.jkQ));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bp
 * JD-Core Version:    0.6.2
 */