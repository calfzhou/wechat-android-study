package android.support.v4.view;

import android.content.Context;
import android.view.View;

public abstract class n
{
  private o dA;
  private p dB;
  private final Context mContext;

  public final void a(o paramo)
  {
    this.dA = paramo;
  }

  public final void a(p paramp)
  {
    if ((this.dB != null) && (paramp != null))
      new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
    this.dB = paramp;
  }

  public final void c(boolean paramBoolean)
  {
    if (this.dA != null)
      this.dA.d(paramBoolean);
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public abstract View onCreateActionView();

  public final void refreshVisibility()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.n
 * JD-Core Version:    0.6.2
 */