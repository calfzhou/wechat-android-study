package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class bh extends cm
{
  bh(CropImageView paramCropImageView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 4653)
      if ((CropImageView.a(this.jQc) != null) && (CropImageView.m(this.jQc) != null))
      {
        CropImageView.m(this.jQc).cancel();
        CropImageView.n(this.jQc);
      }
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      CropImageView.o(this.jQc);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bh
 * JD-Core Version:    0.6.2
 */