package android.support.v7.internal.view.menu;

import android.content.Context;
import android.widget.ImageButton;
import com.tencent.mm.d;

final class e extends ImageButton
  implements i
{
  public e(ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, d.actionOverflowButtonStyle);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
  }

  public final boolean bs()
  {
    return false;
  }

  public final boolean bt()
  {
    return false;
  }

  public final boolean performClick()
  {
    if (super.performClick())
      return true;
    playSoundEffect(0);
    this.kh.bv();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.e
 * JD-Core Version:    0.6.2
 */