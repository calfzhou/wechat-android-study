package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.d;

public class ActionBarOverlayLayout extends FrameLayout
{
  static final int[] mK = arrayOfInt;
  private ActionBar hF;
  private int mI;
  private final Rect mJ = new Rect(0, 0, 0, 0);

  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = d.actionBarSize;
  }

  public ActionBarOverlayLayout(Context paramContext)
  {
    super(paramContext);
    cp();
  }

  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    cp();
  }

  private void cp()
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(mK);
    this.mI = localTypedArray.getDimensionPixelSize(0, 0);
    localTypedArray.recycle();
  }

  public final void a(ActionBar paramActionBar)
  {
    this.hF = paramActionBar;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ActionBarOverlayLayout
 * JD-Core Version:    0.6.2
 */