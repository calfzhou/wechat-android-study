package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.af.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;

final class o
  implements DialogInterface.OnCancelListener
{
  o(SelfQRCodeUI paramSelfQRCodeUI, a parama, String paramString)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jLh);
    if (y.dc(this.iIl))
      this.jLL.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.o
 * JD-Core Version:    0.6.2
 */