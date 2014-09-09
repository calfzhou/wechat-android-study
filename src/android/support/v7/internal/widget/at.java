package android.support.v7.internal.widget;

import android.view.View;
import android.widget.ListAdapter;

final class at
  implements w
{
  at(as paramas, ap paramap)
  {
  }

  public final void i(View paramView, int paramInt)
  {
    this.qn.qk.setSelection(paramInt);
    if (this.qn.qk.ox != null)
    {
      ap localap = this.qn.qk;
      as.a(this.qn).getItemId(paramInt);
      localap.h(paramView, paramInt);
    }
    this.qn.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.at
 * JD-Core Version:    0.6.2
 */