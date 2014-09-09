package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;

final class n
  implements ActionMode.Callback
{
  private final ActionMode.Callback iD;

  n(m paramm, ActionMode.Callback paramCallback)
  {
    this.iD = paramCallback;
  }

  public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.iD.onActionItemClicked(paramActionMode, paramMenuItem);
  }

  public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    boolean bool = this.iD.onCreateActionMode(paramActionMode, paramMenu);
    if (bool)
    {
      m.a(this.iE, paramActionMode);
      this.iE.aW();
    }
    return bool;
  }

  public final void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.iD.onDestroyActionMode(paramActionMode);
    this.iE.aX();
    m.a(this.iE, null);
  }

  public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.iD.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.n
 * JD-Core Version:    0.6.2
 */