package com.tencent.mm.ui.friend;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.mm.a.k;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.f;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.tools.ei;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class bi
  implements View.OnClickListener
{
  bi(InviteFriendUI paramInviteFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    switch (InviteFriendUI.a(this.jIS))
    {
    default:
    case 1:
      String str3;
      Uri localUri;
      PackageManager localPackageManager;
      HashMap localHashMap;
      Iterator localIterator2;
      do
      {
        return;
        String str2 = (String)f.c(42, null);
        if ((str2 == null) || (str2.length() == 0))
          str2 = (String)f.c(2, null);
        str3 = this.jIS.getString(n.bPe, new Object[] { str2 });
        localUri = Uri.parse("smsto:" + InviteFriendUI.b(this.jIS));
        Intent localIntent2 = new Intent("android.intent.action.SENDTO", localUri);
        localIntent2.putExtra("sms_body", str3);
        localPackageManager = this.jIS.getPackageManager();
        List localList = localPackageManager.queryIntentActivities(localIntent2, 65536);
        localHashMap = new HashMap();
        Iterator localIterator1 = localList.iterator();
        while (localIterator1.hasNext())
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localIterator1.next();
          if (!localResolveInfo.activityInfo.packageName.equals("com.whatsapp"))
            localHashMap.put(localResolveInfo.activityInfo.name, localResolveInfo);
        }
        if (localHashMap.size() != 1)
          break;
        localIterator2 = localHashMap.keySet().iterator();
      }
      while (!localIterator2.hasNext());
      String str4 = (String)localIterator2.next();
      Intent localIntent3 = new Intent();
      localIntent3.setComponent(new ComponentName(((ResolveInfo)localHashMap.get(str4)).activityInfo.packageName, ((ResolveInfo)localHashMap.get(str4)).activityInfo.name));
      localIntent3.setAction("android.intent.action.SENDTO");
      localIntent3.setData(localUri);
      localIntent3.putExtra("sms_body", str3);
      this.jIS.startActivity(localIntent3);
      InviteFriendUI.c(this.jIS);
      return;
      if (localHashMap.size() > 1)
      {
        ei localei = new ei(this.jIS);
        localei.a(new bj(this, localHashMap, localPackageManager));
        localei.a(new bk(this, localHashMap, localPackageManager));
        localei.a(new bl(this, localHashMap));
        localei.b(new bm(this, localHashMap, localUri, str3));
        localei.baG();
        InviteFriendUI.c(this.jIS);
        return;
      }
      Toast.makeText(this.jIS, n.cdI, 1).show();
      return;
    case 0:
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = k.ai(InviteFriendUI.b(this.jIS));
      new ck(this.jIS, new bn(this)).f(arrayOfInt);
      return;
    case 2:
      new co(this.jIS, new bo(this)).bK(InviteFriendUI.e(this.jIS), InviteFriendUI.b(this.jIS));
      return;
    case 3:
    }
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("intent.key.linkedin.id", InviteFriendUI.f(this.jIS));
    Object localObject = bg.qW().oQ().get(286722);
    String str1 = x.pI();
    if (localObject != null)
      str1 = localObject.toString();
    localIntent1.putExtra("intent.key.linkedin.from.name", str1);
    a.b(this.jIS, "accountsync", "com.tencent.mm.ui.bindlinkedin.InviteLinkedInFriendUI", localIntent1);
    this.jIS.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.bi
 * JD-Core Version:    0.6.2
 */