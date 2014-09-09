package com.tencent.mm.ui.friend;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.mm.ui.base.cj;
import java.util.HashMap;

final class bj
  implements cj
{
  bj(bi parambi, HashMap paramHashMap, PackageManager paramPackageManager)
  {
  }

  public final void a(ImageView paramImageView, MenuItem paramMenuItem)
  {
    String str = paramMenuItem.getTitle();
    paramImageView.setImageDrawable(((ResolveInfo)this.jIT.get(str)).loadIcon(this.jIU));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bj
 * JD-Core Version:    0.6.2
 */