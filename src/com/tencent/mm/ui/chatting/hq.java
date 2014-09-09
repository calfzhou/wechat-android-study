package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ah;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class hq
  implements DialogInterface.OnCancelListener
{
  hq(hd paramhd, ar paramar, ah paramah)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(this.fRF.kk());
    z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "cancel revoke msg:%d", arrayOfObject);
    bg.qX().c(this.jtE);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hq
 * JD-Core Version:    0.6.2
 */