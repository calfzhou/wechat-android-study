package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.ui.base.aa;

final class i
  implements AdapterView.OnItemClickListener
{
  i(DialogPreference paramDialogPreference)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (DialogPreference.a(this.jgC) != null)
      DialogPreference.a(this.jgC).dismiss();
    this.jgC.setValue((String)DialogPreference.b(this.jgC).jgx[paramInt]);
    if (DialogPreference.c(this.jgC) != null)
      DialogPreference.c(this.jgC).aTE();
    if (DialogPreference.d(this.jgC) != null)
      DialogPreference.d(this.jgC).a(this.jgC, this.jgC.getValue());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.i
 * JD-Core Version:    0.6.2
 */