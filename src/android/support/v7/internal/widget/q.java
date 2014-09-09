package android.support.v7.internal.widget;

import android.support.v4.view.n;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class q
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  q(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onGlobalLayout()
  {
    if (this.of.cJ())
    {
      if (this.of.isShown())
        break label31;
      ActivityChooserView.b(this.of).dismiss();
    }
    label31: 
    do
    {
      return;
      ActivityChooserView.b(this.of).show();
    }
    while (this.of.nW == null);
    this.of.nW.c(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.q
 * JD-Core Version:    0.6.2
 */