package android.support.v7.internal.view.menu;

import android.view.View;

final class d
  implements Runnable
{
  private f ki;

  public d(ActionMenuPresenter paramActionMenuPresenter, f paramf)
  {
    this.ki = paramf;
  }

  public final void run()
  {
    this.kh.hM.bK();
    View localView = (View)this.kh.kB;
    if ((localView != null) && (localView.getWindowToken() != null) && (this.ki.ck()))
      ActionMenuPresenter.a(this.kh, this.ki);
    ActionMenuPresenter.b(this.kh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.d
 * JD-Core Version:    0.6.2
 */