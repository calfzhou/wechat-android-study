package android.support.v4.view;

import android.database.DataSetObserver;

final class aq extends DataSetObserver
  implements by, bz
{
  private int es;

  private aq(PagerTitleStrip paramPagerTitleStrip)
  {
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (paramFloat > 0.5F)
      paramInt1++;
    this.et.a(paramInt1, paramFloat, false);
  }

  public final void b(an paraman1, an paraman2)
  {
    this.et.a(paraman1, paraman2);
  }

  public final void h(int paramInt)
  {
    if (this.es == 0)
    {
      this.et.a(this.et.eb.W(), this.et.eb.U());
      boolean bool = PagerTitleStrip.a(this.et) < 0.0F;
      float f = 0.0F;
      if (!bool)
        f = PagerTitleStrip.a(this.et);
      this.et.a(this.et.eb.W(), f, true);
    }
  }

  public final void i(int paramInt)
  {
    this.es = paramInt;
  }

  public final void onChanged()
  {
    this.et.a(this.et.eb.W(), this.et.eb.U());
    boolean bool = PagerTitleStrip.a(this.et) < 0.0F;
    float f = 0.0F;
    if (!bool)
      f = PagerTitleStrip.a(this.et);
    this.et.a(this.et.eb.W(), f, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.aq
 * JD-Core Version:    0.6.2
 */