package com.tencent.mm.pluginsdk.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import java.io.File;

final class w
  implements View.OnClickListener
{
  w(FileExplorerUI paramFileExplorerUI, File paramFile)
  {
  }

  public final void onClick(View paramView)
  {
    FileExplorerUI.a(this.hLd, 0);
    FileExplorerUI.a(this.hLd).wh(this.hLe.getPath());
    FileExplorerUI.a(this.hLd).c(FileExplorerUI.e(this.hLd).getParentFile(), FileExplorerUI.e(this.hLd));
    FileExplorerUI.a(this.hLd).notifyDataSetInvalidated();
    FileExplorerUI.a(this.hLd).notifyDataSetChanged();
    FileExplorerUI.c(this.hLd).setSelection(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.w
 * JD-Core Version:    0.6.2
 */