package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class gn extends cm
{
  gn(ShareImgUI paramShareImgUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    ShareImgUI.b(this.jUU);
    if (ch.jb(this.jUU.filePath))
    {
      z.e("!32@/B4Tb64lLpIPG1BmaCV8IuAAyJSH37tY", "launch : fail, filePath is null");
      ShareImgUI.c(this.jUU);
      this.jUU.finish();
      return;
    }
    ShareImgUI.d(this.jUU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gn
 * JD-Core Version:    0.6.2
 */