package android.support.v7.app;

import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.aj;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import com.tencent.mm.i;

final class m extends k
  implements aj
{
  final NativeActionModeAwareLayout iB;
  private ActionMode iC;

  public m(ActionBarActivity paramActionBarActivity, a parama)
  {
    super(paramActionBarActivity, parama);
    this.iB = ((NativeActionModeAwareLayout)paramActionBarActivity.findViewById(i.aei));
    if (this.iB != null)
      this.iB.a(this);
  }

  public final ActionMode.Callback a(ActionMode.Callback paramCallback)
  {
    return new n(this, paramCallback);
  }

  final boolean aZ()
  {
    return (this.iC == null) && (super.aZ());
  }

  public final void hide()
  {
    super.hide();
    if (this.iC != null)
      this.iC.finish();
  }

  public final void show()
  {
    super.show();
    if (this.iC != null)
      this.iC.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.m
 * JD-Core Version:    0.6.2
 */