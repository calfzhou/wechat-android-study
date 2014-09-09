package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class aa extends z
{
  private Method hh;
  private Field hi;

  aa()
  {
    try
    {
      this.hh = View.class.getDeclaredMethod("getDisplayList", null);
      try
      {
        label16: this.hi = View.class.getDeclaredField("mRecreateDisplayList");
        this.hi.setAccessible(true);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label16;
    }
  }

  public final void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    if ((this.hh != null) && (this.hi != null));
    try
    {
      this.hi.setBoolean(paramView, true);
      this.hh.invoke(paramView, null);
      label33: super.b(paramSlidingPaneLayout, paramView);
      return;
      paramView.invalidate();
      return;
    }
    catch (Exception localException)
    {
      break label33;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.aa
 * JD-Core Version:    0.6.2
 */