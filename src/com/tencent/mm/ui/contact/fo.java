package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.platformtools.ap;

final class fo
  implements MenuItem.OnMenuItemClickListener
{
  fo(SelectLabelContactUI paramSelectLabelContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Contact", ap.a(SelectLabelContactUI.b(this.jCo).aXz(), ","));
    this.jCo.setResult(-1, localIntent);
    this.jCo.finish();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fo
 * JD-Core Version:    0.6.2
 */