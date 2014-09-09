package com.tencent.mm.ui;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;

final class y extends cm
{
  y(DataTransferUI paramDataTransferUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((DataTransferUI.a(this.iIP) != null) && (DataTransferUI.a(this.iIP).isShowing()))
    {
      z.e("!32@/B4Tb64lLpJAUoyR9+C90Nd9wv/xRLUz", "dialog has shown for a long time, auto dismiss it...");
      DataTransferUI.a(this.iIP).dismiss();
      this.iIP.finish();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.y
 * JD-Core Version:    0.6.2
 */