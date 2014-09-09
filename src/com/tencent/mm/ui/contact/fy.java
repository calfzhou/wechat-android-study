package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.List;

final class fy
  implements MenuItem.OnMenuItemClickListener
{
  fy(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent();
    List localList = SnsAddressUI.b(this.jCy).aXy();
    if (localList.size() == 0)
      localIntent.putExtra("Select_Contact", "");
    while (true)
    {
      this.jCy.setResult(-1, localIntent);
      this.jCy.finish();
      am.b(new fz(this), 100L);
      return true;
      localIntent.putExtra("Select_Contact", ch.a(localList, ","));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fy
 * JD-Core Version:    0.6.2
 */