package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class fm
  implements AdapterView.OnItemClickListener
{
  fm(SelectLabelContactUI paramSelectLabelContactUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SelectLabelContactUI.a(this.jCo, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fm
 * JD-Core Version:    0.6.2
 */