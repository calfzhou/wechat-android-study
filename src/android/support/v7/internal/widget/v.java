package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

final class v extends DataSetObserver
{
  private Parcelable oL = null;

  v(u paramu)
  {
  }

  public final void onChanged()
  {
    this.oM.oy = true;
    this.oM.oF = this.oM.oE;
    this.oM.oE = this.oM.getAdapter().getCount();
    if ((this.oM.getAdapter().hasStableIds()) && (this.oL != null) && (this.oM.oF == 0) && (this.oM.oE > 0))
    {
      u.a(this.oM, this.oL);
      this.oL = null;
    }
    while (true)
    {
      this.oM.cO();
      this.oM.requestLayout();
      return;
      this.oM.cR();
    }
  }

  public final void onInvalidated()
  {
    this.oM.oy = true;
    if (this.oM.getAdapter().hasStableIds())
      this.oL = u.a(this.oM);
    this.oM.oF = this.oM.oE;
    this.oM.oE = 0;
    this.oM.oB = -1;
    this.oM.oC = -9223372036854775808L;
    this.oM.oz = -1;
    this.oM.oA = -9223372036854775808L;
    this.oM.ot = false;
    this.oM.cO();
    this.oM.requestLayout();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.v
 * JD-Core Version:    0.6.2
 */