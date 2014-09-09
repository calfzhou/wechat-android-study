package com.tencent.mm.ui.account.mobile;

import android.graphics.Bitmap;
import android.os.Message;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.cm;

final class bb extends cm
{
  bb(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null)
    {
      Bitmap localBitmap = (Bitmap)paramMessage.obj;
      MobileLoginOrForceReg.a(this.iUG).setImageBitmap(localBitmap);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.bb
 * JD-Core Version:    0.6.2
 */