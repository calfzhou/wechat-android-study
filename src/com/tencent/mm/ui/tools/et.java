package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;

final class et
  implements MenuItem.OnMenuItemClickListener
{
  et(MMTextInputUI paramMMTextInputUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jUa.r(MMTextInputUI.b(this.jUa).getText());
    Intent localIntent = new Intent();
    localIntent.putExtra("key_result", MMTextInputUI.b(this.jUa).getText());
    this.jUa.setResult(-1, localIntent);
    this.jUa.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.et
 * JD-Core Version:    0.6.2
 */