package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ax
  implements MenuItem.OnMenuItemClickListener
{
  ax(CropImageNewUI paramCropImageNewUI, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if ((this.jPA) && (this.jPB))
    {
      CropImageNewUI.a(this.jPx, true);
      return true;
    }
    switch (CropImageNewUI.f(this.jPx))
    {
    default:
      return true;
    case 1:
      if (CropImageNewUI.e(this.jPx) != null)
      {
        CropImageNewUI.a(this.jPx, CropImageNewUI.e(this.jPx).baa(), CropImageNewUI.i(this.jPx));
        return true;
      }
      CropImageNewUI.a(this.jPx, CropImageNewUI.j(this.jPx), CropImageNewUI.i(this.jPx));
      return true;
    case 2:
      CropImageNewUI.k(this.jPx);
      return true;
    case 3:
      CropImageNewUI.l(this.jPx);
      return true;
    case 4:
      CropImageNewUI.m(this.jPx);
      return true;
    case 5:
    }
    CropImageNewUI.n(this.jPx);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ax
 * JD-Core Version:    0.6.2
 */