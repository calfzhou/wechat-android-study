package com.tencent.mm.plugin.accountsync.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class c
  implements DialogInterface.OnCancelListener
{
  c(b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    z.w("!24@/B4Tb64lLpIfnJwgZ47LaQ==", "do init canceled");
    bg.qX().c(b.a(this.dWs));
    bg.qX().b(37, this.dWs);
    bg.qX().b(38, this.dWs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.a.c
 * JD-Core Version:    0.6.2
 */