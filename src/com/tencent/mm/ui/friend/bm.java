package com.tencent.mm.ui.friend;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.MenuItem;
import com.tencent.mm.ui.base.cm;
import java.util.HashMap;

final class bm
  implements cm
{
  bm(bi parambi, HashMap paramHashMap, Uri paramUri, String paramString)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str = paramMenuItem.getTitle();
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(((ResolveInfo)this.jIT.get(str)).activityInfo.packageName, ((ResolveInfo)this.jIT.get(str)).activityInfo.name));
    localIntent.setAction("android.intent.action.SENDTO");
    localIntent.setData(this.jIW);
    localIntent.putExtra("sms_body", this.jIX);
    this.jIV.jIS.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bm
 * JD-Core Version:    0.6.2
 */