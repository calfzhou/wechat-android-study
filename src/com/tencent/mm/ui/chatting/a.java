package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class a
  implements MenuItem.OnMenuItemClickListener
{
  a(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (AppAttachDownloadUI.a(this.jlF) != null)
      bg.qX().c(AppAttachDownloadUI.a(this.jlF));
    this.jlF.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a
 * JD-Core Version:    0.6.2
 */