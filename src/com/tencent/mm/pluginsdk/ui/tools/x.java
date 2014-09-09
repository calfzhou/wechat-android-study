package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import java.io.File;

final class x
  implements View.OnClickListener
{
  x(FileExplorerUI paramFileExplorerUI, File paramFile)
  {
  }

  public final void onClick(View paramView)
  {
    FileExplorerUI.a(this.hLd, 1);
    FileExplorerUI.a(this.hLd).wh(this.hLf.getPath());
    FileExplorerUI.a(this.hLd).c(FileExplorerUI.d(this.hLd).getParentFile(), FileExplorerUI.d(this.hLd));
    FileExplorerUI.a(this.hLd).notifyDataSetInvalidated();
    FileExplorerUI.a(this.hLd).notifyDataSetChanged();
    FileExplorerUI.c(this.hLd).setSelection(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.x
 * JD-Core Version:    0.6.2
 */