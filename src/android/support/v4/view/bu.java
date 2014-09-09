package android.support.v4.view;

final class bu
  implements Runnable
{
  bu(ViewPager paramViewPager)
  {
  }

  public final void run()
  {
    ViewPager.a(this.fC);
    this.fC.populate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bu
 * JD-Core Version:    0.6.2
 */