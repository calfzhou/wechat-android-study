package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.c.a.fx;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;

final class eu
  implements DialogInterface.OnCancelListener
{
  eu(SelectContactUI paramSelectContactUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    SelectContactUI.a(this.jBX, false);
    SelectContactUI.b(this.jBX).cKW.cKV = true;
    a.aGB().g(SelectContactUI.b(this.jBX));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.eu
 * JD-Core Version:    0.6.2
 */