package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.mm.sdk.platformtools.z;

final class bp
  implements AdapterView.OnItemLongClickListener
{
  bp(MMGridPaperGridView paramMMGridPaperGridView)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
    {
      z.w("!44@/B4Tb64lLpJ3ysDJ3BtNKWRcjd4fCZrJmrjyp4tQ6Cg=", "on item long click, but main adapter is null");
      return false;
    }
    MMGridPaperGridView.a(this.iZT);
    MMGridPaperGridView.b(this.iZT);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bp
 * JD-Core Version:    0.6.2
 */