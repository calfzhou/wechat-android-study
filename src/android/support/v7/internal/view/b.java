package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.a.a;
import android.view.ActionMode;
import android.view.MenuInflater;

public final class b extends a
{
  final MenuInflater iN;
  final ActionMode iO;

  public b(Context paramContext, ActionMode paramActionMode)
  {
    this.iO = paramActionMode;
    this.iN = new c(paramContext);
  }

  public final void finish()
  {
    this.iO.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.b
 * JD-Core Version:    0.6.2
 */