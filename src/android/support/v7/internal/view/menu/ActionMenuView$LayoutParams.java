package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.widget.LinearLayout.LayoutParams;

public class ActionMenuView$LayoutParams extends LinearLayout.LayoutParams
{

  @ViewDebug.ExportedProperty
  public boolean kq;

  @ViewDebug.ExportedProperty
  public int kr;

  @ViewDebug.ExportedProperty
  public int ks;

  @ViewDebug.ExportedProperty
  public boolean kt;

  @ViewDebug.ExportedProperty
  public boolean ku;
  public boolean kv;

  public ActionMenuView$LayoutParams()
  {
    super(-2, -2);
    this.kq = false;
  }

  public ActionMenuView$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ActionMenuView$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.kq = paramLayoutParams.kq;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuView.LayoutParams
 * JD-Core Version:    0.6.2
 */