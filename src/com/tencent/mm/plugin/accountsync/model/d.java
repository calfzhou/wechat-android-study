package com.tencent.mm.plugin.accountsync.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.widget.Toast;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.o;

public final class d
  implements c
{
  private String dWF;
  private int toScene;
  private Uri uri;

  public d(int paramInt, String paramString, Uri paramUri)
  {
    this.toScene = paramInt;
    this.dWF = paramString;
    this.uri = paramUri;
  }

  private int a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    i locali = az.wZ().gn(paramString1);
    if (paramContext == null)
      z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "null context");
    do
    {
      return 1;
      if (locali == null)
      {
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "this user is not my friend");
        return 1;
      }
      String str = locali.getUsername();
      if (ch.jb(str))
      {
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "get username failed, phonenum md5 is " + paramString1);
        return 1;
      }
      if (bg.qW().oT().yo(str))
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(this.toScene);
        localn.d(11157, arrayOfObject);
        switch (this.toScene)
        {
        default:
          return 1;
        case 1:
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("Chat_User", str);
          localIntent2.putExtra("finish_direct", true);
          localIntent2.addFlags(67108864);
          com.tencent.mm.plugin.a.a.dWo.d(localIntent2, paramContext);
          return 0;
        case 3:
          mx localmx2 = new mx();
          localmx2.cPr.cEg = 5;
          localmx2.cPr.cEh = str;
          localmx2.cPr.context = paramContext;
          localmx2.cPr.cPu = 3;
          com.tencent.mm.sdk.c.a.aGB().g(localmx2);
          return 0;
        case 4:
          mx localmx1 = new mx();
          localmx1.cPr.cEg = 5;
          localmx1.cPr.cEh = str;
          localmx1.cPr.context = paramContext;
          localmx1.cPr.cPu = 2;
          com.tencent.mm.sdk.c.a.aGB().g(localmx1);
          return 0;
        case 2:
        }
        Intent localIntent1 = new Intent();
        localIntent1.putExtra("sns_userName", str);
        localIntent1.addFlags(67108864);
        com.tencent.mm.am.a.b(paramContext, "sns", ".ui.SnsUserUI", localIntent1);
        return 0;
      }
    }
    while ((ch.jb(paramString3)) || (ch.jb(paramString2)));
    Toast.makeText(paramContext, paramContext.getString(com.tencent.mm.n.bDH), 1).show();
    paramContext.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[] { paramString2 });
    paramContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[] { paramString3, "com.tencent.mm.account" });
    return 1;
  }

  public final int ah(Context paramContext)
  {
    if (paramContext == null)
    {
      z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "null context");
      return 1;
    }
    if ((!bg.ra()) || (bg.rd()))
    {
      z.d("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "not login, start bind login");
      return 3;
    }
    if (ch.jb((String)bg.qW().oQ().get(6, "")))
    {
      z.d("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "not bind mobile, start bind mobie");
      return 2;
    }
    if (this.uri != null)
    {
      Cursor localCursor = paramContext.getContentResolver().query(this.uri, new String[] { "contact_id", "_id", "data4" }, null, null, null);
      if (localCursor == null)
      {
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "query database err");
        return 1;
      }
      if (!localCursor.moveToFirst())
      {
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "query database err, move to first fail");
        return 1;
      }
      int i = localCursor.getColumnIndex("data4");
      if (i == -1)
      {
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "no data4 segment exist");
        localCursor.close();
        return 1;
      }
      String str1 = "";
      String str2 = "";
      String str4;
      try
      {
        str1 = localCursor.getString(i);
        int j = localCursor.getColumnIndex("contact_id");
        String str3;
        if (j >= 0)
        {
          str2 = localCursor.getString(j);
          int k = localCursor.getColumnIndex("_id");
          if (k < 0)
            break label278;
          str3 = localCursor.getString(k);
        }
        label278: for (str4 = str3; ; str4 = "")
        {
          localCursor.close();
          if (!ch.jb(str1))
            break label367;
          z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "null friendmobile");
          return 1;
          str2 = "";
          break;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localException.getMessage();
        arrayOfObject[1] = ch.b(localException);
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "match error, %s\n%s", arrayOfObject);
        z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "result friendMobileMd5 %s contact_id %s data_id %s", new Object[] { str1, str2, "" });
        return 1;
      }
      finally
      {
        localCursor.close();
      }
      label367: return a(paramContext, str1, str4, str2);
    }
    if (!ch.jb(this.dWF))
      return a(paramContext, com.tencent.mm.a.f.d(com.tencent.mm.pluginsdk.a.pR(this.dWF).getBytes()), null, null);
    z.e("!64@/B4Tb64lLpIUGQfqwvb6VnC6ESYOsyj28eXjLbW6Avu1q/if1Lf7B5YA4ciTVu+t", "uri is null and the phone num is null");
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.model.d
 * JD-Core Version:    0.6.2
 */