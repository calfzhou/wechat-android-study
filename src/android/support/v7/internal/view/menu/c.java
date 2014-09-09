package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

final class c extends r
{
  public c(ActionMenuPresenter paramActionMenuPresenter, ak paramak)
  {
    super(paramak);
    paramActionMenuPresenter.a(paramActionMenuPresenter.kf);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    ActionMenuPresenter.a(this.kh);
    this.kh.kg = 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.c
 * JD-Core Version:    0.6.2
 */