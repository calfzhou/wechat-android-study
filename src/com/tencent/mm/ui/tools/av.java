package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class av
  implements DialogInterface.OnClickListener
{
  av(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    CropImageNewUI.a(this.jPx, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.av
 * JD-Core Version:    0.6.2
 */