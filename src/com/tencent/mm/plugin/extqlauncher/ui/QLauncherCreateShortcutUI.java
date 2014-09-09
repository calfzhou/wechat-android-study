package com.tencent.mm.plugin.extqlauncher.ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.n.m;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.List;

public class QLauncherCreateShortcutUI extends Activity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt2);
    z.d("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "onActivityResult resultCode = %s", arrayOfObject1);
    if (paramInt2 != -1)
    {
      finish();
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      finish();
      return;
      if (paramIntent != null)
      {
        if (!bg.oE())
        {
          z.e("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "account not ready");
          Toast.makeText(this, n.bGC, 0).show();
          finish();
          return;
        }
        ArrayList localArrayList = paramIntent.getStringArrayListExtra("Select_Contact");
        if ((localArrayList == null) || (localArrayList.size() <= 0))
        {
          z.e("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "userNames empty");
        }
        else
        {
          z.d("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "userNames count " + localArrayList.size());
          String str1 = x.pG();
          ContentValues[] arrayOfContentValues;
          while (true)
          {
            int i;
            i locali;
            try
            {
              arrayOfContentValues = new ContentValues[localArrayList.size()];
              i = 0;
              if (i >= localArrayList.size())
                break label496;
              locali = bg.qW().oT().ys((String)localArrayList.get(i));
              if ((locali != null) && ((int)locali.dhv > 0))
                break label279;
              z.e("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "no such user");
              finish();
              return;
            }
            catch (Exception localException)
            {
              Object[] arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = localException.getMessage();
              z.d("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "bulkInsert shortcut failed, %s", arrayOfObject2);
              Toast.makeText(this, n.bGC, 0).show();
            }
            break;
            label279: String str2 = com.tencent.mm.plugin.base.a.a.kp((String)localArrayList.get(i));
            if (ch.jb(str2))
            {
              z.e("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "null encryptShortcutUser");
              finish();
              return;
            }
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("source_key", com.tencent.mm.plugin.base.a.a.ehu);
            localContentValues.put("owner_id", com.tencent.mm.plugin.base.a.a.kp(str1));
            localContentValues.put("unique_id", str2);
            localContentValues.put("container", Integer.valueOf(1));
            localContentValues.put("item_type", Integer.valueOf(com.tencent.mm.plugin.base.a.a.s(locali)));
            localContentValues.put("name", y.a(locali, (String)localArrayList.get(i)));
            localContentValues.put("icon_path", af.sh().g((String)localArrayList.get(i), false));
            Intent localIntent = new Intent("com.tencent.mm.action.BIZSHORTCUT");
            localIntent.putExtra("LauncherUI.Shortcut.Username", str2);
            localIntent.putExtra("LauncherUI.From.Biz.Shortcut", true);
            localIntent.addFlags(67108864);
            localContentValues.put("intent", localIntent.toUri(0));
            arrayOfContentValues[i] = localContentValues;
            i++;
          }
          label496: getContentResolver().bulkInsert(a.eNd, arrayOfContentValues);
          Toast.makeText(this, n.bGD, 0).show();
          com.tencent.mm.plugin.extqlauncher.b.Qn().Qp();
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.d("!64@/B4Tb64lLpJDdPNWGvN8drS2dJ4haxZKzb5xwrBXrS9h6Br3OTt1bohJb6FlnEMD", "onCreate");
    requestWindowFeature(1);
    setContentView(k.bdY);
    Intent localIntent = new Intent();
    String str = x.pG();
    localIntent.putExtra("Contact_Compose", true);
    localIntent.putExtra("List_Type", 12);
    localIntent.putExtra("stay_in_wechat", false);
    localIntent.putExtra("Add_address_titile", getString(n.bsw));
    localIntent.putExtra("Contact_GroupFilter_Type", "@micromsg.with.all.biz.qq.com");
    localIntent.putExtra("Block_list", str);
    com.tencent.mm.plugin.extqlauncher.a.Qm().a(localIntent, this, 1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.ui.QLauncherCreateShortcutUI
 * JD-Core Version:    0.6.2
 */