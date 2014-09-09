package android.support.v7.internal.widget;

final class ak
  implements Runnable
{
  private int cK;
  private int cg;
  private boolean pR;

  ak(ProgressBarICS paramProgressBarICS, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.cg = paramInt1;
    this.cK = paramInt2;
    this.pR = paramBoolean;
  }

  public final void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.cg = paramInt1;
    this.cK = paramInt2;
    this.pR = paramBoolean;
  }

  public final void run()
  {
    ProgressBarICS localProgressBarICS = this.pS;
    int i = this.cg;
    int j = this.cK;
    ProgressBarICS.a(localProgressBarICS, i, j);
    ProgressBarICS.a(this.pS, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ak
 * JD-Core Version:    0.6.2
 */