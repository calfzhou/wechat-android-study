package com.tencent.mm.pluginsdk.model.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class aa
  implements DialogInterface.OnCancelListener
{
  aa(z paramz)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpIw1vCoUyRMKQjZ1dpQIMvamblCzn1RUg4=", "do init canceled");
    bg.qX().c(z.a(this.huV));
    bf.Uq().b(7, this.huV);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.aa
 * JD-Core Version:    0.6.2
 */