package com.tencent.mm.pluginsdk.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;
import java.io.File;

final class u
  implements MenuItem.OnMenuItemClickListener
{
  u(FileExplorerUI paramFileExplorerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (y.a(FileExplorerUI.a(this.hLd)) != null)
    {
      if (1 == FileExplorerUI.b(this.hLd))
        FileExplorerUI.a(this.hLd, y.a(FileExplorerUI.a(this.hLd)));
      while (true)
      {
        FileExplorerUI.a(this.hLd).c(y.a(FileExplorerUI.a(this.hLd)).getParentFile(), y.a(FileExplorerUI.a(this.hLd)));
        FileExplorerUI.a(this.hLd).notifyDataSetChanged();
        FileExplorerUI.c(this.hLd).setSelection(0);
        return true;
        if (FileExplorerUI.b(this.hLd) == 0)
          FileExplorerUI.b(this.hLd, y.a(FileExplorerUI.a(this.hLd)));
      }
    }
    bg.qW().oQ().set(131074, FileExplorerUI.d(this.hLd).getAbsolutePath());
    bg.qW().oQ().set(131073, FileExplorerUI.e(this.hLd).getAbsolutePath());
    this.hLd.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.u
 * JD-Core Version:    0.6.2
 */