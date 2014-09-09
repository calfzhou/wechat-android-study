package com.tencent.mm.ui.friend;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.mm.ui.base.ck;
import java.util.HashMap;

final class bk
  implements ck
{
  bk(bi parambi, HashMap paramHashMap, PackageManager paramPackageManager)
  {
  }

  public final void a(TextView paramTextView, MenuItem paramMenuItem)
  {
    String str = paramMenuItem.getTitle();
    paramTextView.setText(((ResolveInfo)this.jIT.get(str)).loadLabel(this.jIU).toString());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bk
 * JD-Core Version:    0.6.2
 */