package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class bo
  implements AdapterView.OnItemClickListener
{
  bo(MMGridPaperGridView paramMMGridPaperGridView)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
    {
      z.w("!44@/B4Tb64lLpJ3ysDJ3BtNKWRcjd4fCZrJmrjyp4tQ6Cg=", "on item click, but main adapter is null");
      return;
    }
    MMGridPaperGridView.a(this.iZT);
    MMGridPaperGridView.b(this.iZT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bo
 * JD-Core Version:    0.6.2
 */