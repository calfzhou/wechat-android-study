package android.support.v7.internal.widget;

final class z
  implements Runnable
{
  private z(u paramu)
  {
  }

  public final void run()
  {
    if (this.oM.oy)
    {
      if (this.oM.getAdapter() != null)
        this.oM.post(this);
      return;
    }
    u.b(this.oM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.z
 * JD-Core Version:    0.6.2
 */