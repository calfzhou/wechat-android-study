package android.support.v7.app;

import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.view.View;

public final class l extends c
{
  private d iv;
  private Drawable iw;
  private CharSequence ix;
  private int iy = -1;
  private View iz;
  private CharSequence mText;

  public l(k paramk)
  {
  }

  public final c a(d paramd)
  {
    this.iv = paramd;
    return this;
  }

  public final d ba()
  {
    return this.iv;
  }

  public final c c(CharSequence paramCharSequence)
  {
    this.mText = paramCharSequence;
    if (this.iy >= 0)
      k.a(this.iA).N(this.iy);
    return this;
  }

  public final CharSequence getContentDescription()
  {
    return this.ix;
  }

  public final View getCustomView()
  {
    return this.iz;
  }

  public final Drawable getIcon()
  {
    return this.iw;
  }

  public final int getPosition()
  {
    return this.iy;
  }

  public final CharSequence getText()
  {
    return this.mText;
  }

  public final void select()
  {
    this.iA.b(this);
  }

  public final void w(int paramInt)
  {
    this.iy = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.l
 * JD-Core Version:    0.6.2
 */