package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ed
  implements MenuItem.OnMenuItemClickListener
{
  ed(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent();
    localIntent.putStringArrayListExtra("Select_Contact", SelectContactUI.g(this.jBX).fF(true));
    this.jBX.setResult(-1, localIntent);
    this.jBX.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ed
 * JD-Core Version:    0.6.2
 */