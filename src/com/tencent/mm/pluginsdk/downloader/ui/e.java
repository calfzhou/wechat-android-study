package com.tencent.mm.pluginsdk.downloader.ui;

import android.widget.ProgressBar;
import com.tencent.mm.sdk.platformtools.az;

final class e
  implements az
{
  e(ProgressDialogUI paramProgressDialogUI)
  {
  }

  public final boolean kJ()
  {
    if ((this.htR.eBw != null) && (this.htR.eBw.getProgress() < 90))
      this.htR.eBw.incrementProgressBy(5);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.ui.e
 * JD-Core Version:    0.6.2
 */