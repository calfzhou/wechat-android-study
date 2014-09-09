package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class ac
  implements AdapterView.OnItemSelectedListener
{
  ac(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      ad localad = ListPopupWindow.a(this.pr);
      if (localad != null)
        ad.a(localad, false);
    }
  }

  public final void onNothingSelected(AdapterView paramAdapterView)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ac
 * JD-Core Version:    0.6.2
 */