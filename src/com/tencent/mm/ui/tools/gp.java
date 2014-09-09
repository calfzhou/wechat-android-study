package com.tencent.mm.ui.tools;

import android.net.Uri;
import android.os.Looper;

final class gp extends Thread
{
  private gq jUV;
  private Uri mUri;

  public gp(ShareImgUI paramShareImgUI, Uri paramUri, gq paramgq)
  {
    this.mUri = paramUri;
    this.jUV = paramgq;
  }

  public final void run()
  {
    Looper.prepare();
    this.jUU.filePath = ShareImgUI.a(this.jUU, this.mUri);
    if (this.jUV != null)
      this.jUV.baV();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gp
 * JD-Core Version:    0.6.2
 */