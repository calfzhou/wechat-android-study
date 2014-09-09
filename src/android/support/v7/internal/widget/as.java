package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

final class as extends ListPopupWindow
  implements au
{
  private ListAdapter oU;
  private CharSequence ql;

  public as(ap paramap, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setAnchorView(paramap);
    cT();
    cS();
    setOnItemClickListener(new x(paramap, new at(this, paramap)));
  }

  public final void h(CharSequence paramCharSequence)
  {
    this.ql = paramCharSequence;
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    this.oU = paramListAdapter;
  }

  public final void show()
  {
    int i = this.qk.getPaddingLeft();
    if (this.qk.oX == -2)
    {
      int n = this.qk.getWidth();
      int i1 = this.qk.getPaddingRight();
      setContentWidth(Math.max(this.qk.a((SpinnerAdapter)this.oU, getBackground()), n - i - i1));
    }
    while (true)
    {
      Drawable localDrawable = getBackground();
      int j = 0;
      if (localDrawable != null)
      {
        localDrawable.getPadding(ap.a(this.qk));
        j = -ap.a(this.qk).left;
      }
      setHorizontalOffset(j + i);
      cU();
      super.show();
      getListView().setChoiceMode(1);
      setSelection(this.qk.oz);
      return;
      if (this.qk.oX == -1)
      {
        int k = this.qk.getWidth();
        int m = this.qk.getPaddingRight();
        setContentWidth(k - i - m);
      }
      else
      {
        setContentWidth(this.qk.oX);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.as
 * JD-Core Version:    0.6.2
 */