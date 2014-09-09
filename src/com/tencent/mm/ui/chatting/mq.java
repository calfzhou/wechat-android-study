package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class mq
  implements MenuItem.OnMenuItemClickListener
{
  mq(ImageDownloadUI paramImageDownloadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    bg.qX().c(ImageDownloadUI.a(this.juS));
    this.juS.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mq
 * JD-Core Version:    0.6.2
 */