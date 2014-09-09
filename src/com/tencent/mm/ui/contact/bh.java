package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class bh
  implements AdapterView.OnItemClickListener
{
  bh(ContactRemarkImagePreviewUI paramContactRemarkImagePreviewUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (!this.jyK.aPR())
    {
      this.jyK.aPQ();
      return;
    }
    this.jyK.aPP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bh
 * JD-Core Version:    0.6.2
 */