package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;
import java.io.File;

final class v
  implements AdapterView.OnItemClickListener
{
  v(FileExplorerUI paramFileExplorerUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    File localFile = (File)FileExplorerUI.a(this.hLd).getItem(paramInt);
    if (1 == FileExplorerUI.b(this.hLd))
      if (localFile.isFile())
      {
        bg.qW().oQ().set(131074, y.b(FileExplorerUI.a(this.hLd)).getAbsolutePath());
        bg.qW().oQ().set(131073, FileExplorerUI.e(this.hLd).getAbsolutePath());
        if (localFile != y.a(FileExplorerUI.a(this.hLd)))
          break label247;
        FileExplorerUI.a(this.hLd).c(y.a(FileExplorerUI.a(this.hLd)).getParentFile(), y.a(FileExplorerUI.a(this.hLd)));
      }
    while (true)
    {
      FileExplorerUI.a(this.hLd).notifyDataSetChanged();
      FileExplorerUI.c(this.hLd).setSelection(0);
      return;
      FileExplorerUI.a(this.hLd, localFile);
      break;
      if (FileExplorerUI.b(this.hLd) != 0)
        break;
      if (localFile.isFile())
      {
        bg.qW().oQ().set(131073, y.b(FileExplorerUI.a(this.hLd)).getAbsolutePath());
        bg.qW().oQ().set(131074, FileExplorerUI.d(this.hLd).getAbsolutePath());
        break;
      }
      FileExplorerUI.b(this.hLd, localFile);
      break;
      label247: if (localFile.isDirectory())
      {
        FileExplorerUI.a(this.hLd).c(y.b(FileExplorerUI.a(this.hLd)), localFile);
      }
      else if (localFile.isFile())
      {
        this.hLd.setResult(-1, new Intent().putExtra("choosed_file_path", localFile.getAbsolutePath()));
        this.hLd.finish();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.v
 * JD-Core Version:    0.6.2
 */