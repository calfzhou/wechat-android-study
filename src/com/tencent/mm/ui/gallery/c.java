package com.tencent.mm.ui.gallery;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.base.e;

final class c
  implements MenuItem.OnMenuItemClickListener
{
  c(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String[] arrayOfString = this.jJI.aPI().getResources().getStringArray(com.tencent.mm.c.Nv);
    e.a(this.jJI, null, arrayOfString, "", false, new d(this));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.c
 * JD-Core Version:    0.6.2
 */