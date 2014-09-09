package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

final class b
  implements TransformationMethod
{
  private Locale eu;

  public b(ActionMenuItemView paramActionMenuItemView)
  {
    this.eu = paramActionMenuItemView.getContext().getResources().getConfiguration().locale;
  }

  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence != null)
      return paramCharSequence.toString().toUpperCase(this.eu);
    return null;
  }

  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.b
 * JD-Core Version:    0.6.2
 */