package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.sdk.platformtools.z;

final class dl
  implements DialogInterface.OnCancelListener
{
  dl(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    z.d("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "cancel menu");
    ImageGalleryUI.g(this.jSA);
    ImageGalleryUI.c(this.jSA);
    ImageGalleryUI.a(this.jSA, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dl
 * JD-Core Version:    0.6.2
 */