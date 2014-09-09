package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.model.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.HashMap;

public final class a
{
  private static final HashMap hJP;

  static
  {
    HashMap localHashMap = new HashMap();
    hJP = localHashMap;
    localHashMap.put("wps", "application/wps");
    hJP.put("ett", "application/ett");
    hJP.put("log", "application/log");
    hJP.put("wpt", "application/wpt");
    hJP.put("et", "application/et");
    hJP.put("ksdps", "application/ksdps");
    hJP.put("kset", "application/kset");
    hJP.put("kswps", "application/kswps");
  }

  public static void a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5)
  {
    String str1;
    Intent localIntent1;
    if (paramInt1 == 2)
    {
      if ((-1 != paramInt2) || (paramIntent == null))
        break label261;
      str1 = paramIntent.getStringExtra("selectpkg");
      Bundle localBundle = paramIntent.getBundleExtra("transferback");
      localIntent1 = (Intent)localBundle.getParcelable("targetintent");
      String str2 = localBundle.getString("filepath");
      String str3 = localBundle.getString("fileext");
      if (localIntent1 == null)
        break label239;
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "AppChooserUI select package name %s and target intent is not null", new Object[] { str1 });
      if ((!"com.tencent.mtt".equals(str1)) || (str2 == null))
        break label174;
      Intent localIntent3 = bm(str2, str3);
      localIntent3.addFlags(524288);
      if (!ch.i(paramActivity, localIntent3))
        break label174;
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "user has installed new version of QQbrowser");
      paramActivity.startActivity(localIntent3);
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(5);
      arrayOfObject[1] = Integer.valueOf(paramInt5);
      localn.d(11168, arrayOfObject);
    }
    label174: label239: 
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            Intent localIntent2 = new Intent(localIntent1);
            localIntent2.setPackage(str1);
            localIntent2.addFlags(524288);
            if (ch.i(paramActivity, localIntent2))
            {
              paramActivity.startActivity(localIntent2);
              return;
            }
            z.e("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Always Intent is not support mimetype");
          }
          while (!paramBoolean);
          com.tencent.mm.ui.base.e.b(paramActivity, paramInt3, paramInt4);
          return;
          z.e("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "AppChooserUI target intent is null in handlerResultOfAppChooserUI");
        }
        while (!paramBoolean);
        com.tencent.mm.ui.base.e.b(paramActivity, paramInt3, paramInt4);
        return;
        if (4098 != paramInt2)
          break;
        z.e("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Not Found App Support media type");
      }
      while (!paramBoolean);
      com.tencent.mm.ui.base.e.b(paramActivity, paramInt3, paramInt4);
      return;
      if (4097 != paramInt2)
        break;
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "AppChooserUI result code is no choice");
    }
    while (!paramBoolean);
    label261: com.tencent.mm.ui.base.e.b(paramActivity, paramInt3, paramInt4);
    return;
    z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "AppChooserUI result code is not ok or data is null");
  }

  public static boolean a(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    String str1 = wb(paramString2);
    String str2 = wa(str1);
    if (!str2.equals(""))
    {
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "User exist always config, package is %s", new Object[] { str2 });
      Intent localIntent3 = bk(str1, paramString1);
      localIntent3.setPackage(str2);
      if (ch.i(paramActivity, localIntent3))
      {
        z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Always package support mimeType");
        paramActivity.startActivity(localIntent3);
        return false;
      }
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Always package do not support mimeType");
    }
    c localc = k(paramActivity, str1, paramString1);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = localc.name();
    z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "QQBrowser status is %s", arrayOfObject1);
    switch (b.hJQ[localc.ordinal()])
    {
    default:
      return true;
    case 1:
    case 2:
    case 3:
      return true;
    case 4:
    }
    Intent localIntent1 = bm(paramString1, paramString2);
    if (ch.i(paramActivity, localIntent1))
    {
      localIntent1.setFlags(268435456);
      paramActivity.startActivity(localIntent1);
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(5);
      arrayOfObject3[1] = Integer.valueOf(paramInt);
      localn2.d(11168, arrayOfObject3);
      return false;
    }
    localIntent1.setFlags(268435456);
    Intent localIntent2 = bl(str1, paramString1);
    if (ch.i(paramActivity, localIntent2))
    {
      paramActivity.startActivity(localIntent2);
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(5);
      arrayOfObject2[1] = Integer.valueOf(paramInt);
      localn1.d(11168, arrayOfObject2);
      return false;
    }
    z.e("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Occur error, has bugs, status is install and support but not found support activity");
    return true;
  }

  public static void b(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    boolean bool = true;
    String str1 = wb(paramString2);
    File localFile = new File(paramString1);
    if (!localFile.exists())
    {
      Object[] arrayOfObject3 = new Object[bool];
      arrayOfObject3[0] = localFile.getAbsolutePath();
      z.e("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "file not exist: %s", arrayOfObject3);
      return;
    }
    String str2 = wa(str1);
    Object localObject;
    if (!str2.equals(""))
    {
      Object[] arrayOfObject2 = new Object[bool];
      arrayOfObject2[0] = str2;
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "User exist always config, package is %s", arrayOfObject2);
      Intent localIntent3 = bk(str1, paramString1);
      localIntent3.setPackage(str2);
      if (ch.i(paramActivity, localIntent3))
      {
        z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Always package support mimeType");
        paramActivity.startActivity(localIntent3);
      }
    }
    else
    {
      c localc = k(paramActivity, str1, paramString1);
      Object[] arrayOfObject1 = new Object[bool];
      arrayOfObject1[0] = localc.name();
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "QQBrowser status is %s", arrayOfObject1);
      switch (b.hJQ[localc.ordinal()])
      {
      default:
        localObject = bk(str1, paramString1);
        bool = false;
      case 1:
      case 3:
      case 2:
      case 4:
      }
    }
    while (true)
    {
      String str3 = wb(paramString2);
      Uri localUri = Uri.fromFile(new File(paramString1));
      Bundle localBundle = new Bundle();
      localBundle.putString("targeturl", localUri.toString());
      localBundle.putString("filepath", paramString1);
      localBundle.putString("fileext", paramString2);
      localBundle.putParcelable("targetintent", (Parcelable)localObject);
      Intent localIntent2 = new Intent(paramActivity, AppChooserUI.class);
      localIntent2.putExtra("type", 0);
      localIntent2.putExtra("title", paramActivity.getResources().getString(com.tencent.mm.n.bAu));
      localIntent2.putExtra("needupate", bool);
      localIntent2.putExtra("mimetype", str3);
      localIntent2.putExtra("targetintent", (Parcelable)localObject);
      localIntent2.putExtra("transferback", localBundle);
      localIntent2.putExtra("scene", paramInt);
      paramActivity.startActivityForResult(localIntent2, 2);
      return;
      z.i("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "Always package do not support mimeType");
      break;
      localObject = bk(str1, paramString1);
      bool = false;
      continue;
      localObject = bk(str1, paramString1);
      continue;
      Intent localIntent1 = bm(paramString1, paramString2);
      if (ch.i(paramActivity, localIntent1))
      {
        localObject = localIntent1;
        bool = false;
      }
      else
      {
        localObject = bk(str1, paramString1);
        bool = false;
      }
    }
  }

  private static Intent bk(String paramString1, String paramString2)
  {
    Uri localUri = Uri.fromFile(new File(paramString2));
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(localUri, paramString1);
    return localIntent;
  }

  private static Intent bl(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    localIntent.setPackage("com.tencent.mtt");
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(paramString2)), paramString1);
    return localIntent;
  }

  private static Intent bm(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent("com.tencent.QQBrowser.action.sdk.document");
    File localFile = new File(paramString1);
    localIntent.putExtra("key_reader_sdk_id", 1);
    localIntent.putExtra("key_reader_sdk_type", 0);
    localIntent.putExtra("key_reader_sdk_format", paramString2);
    localIntent.putExtra("key_reader_sdk_path", paramString1);
    localIntent.setData(Uri.fromFile(localFile));
    return localIntent;
  }

  private static c k(Context paramContext, String paramString1, String paramString2)
  {
    if (s.bc(paramContext))
    {
      if (ch.i(paramContext, bl(paramString1, paramString2)))
        return c.hJU;
      if (s.uR(paramString1))
        return c.hJS;
      return c.hJT;
    }
    return c.hJR;
  }

  private static String wa(String paramString)
  {
    int i = 274528;
    com.tencent.mm.storage.e locale = bg.qW().oQ();
    if (paramString != null)
      i += paramString.hashCode();
    return (String)locale.get(i, "");
  }

  private static String wb(String paramString)
  {
    String str = null;
    if (paramString != null)
    {
      int i = paramString.length();
      str = null;
      if (i > 0)
        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
    }
    if ((str == null) || (str.length() == 0))
      str = (String)hJP.get(paramString);
    if ((str == null) || (str.length() == 0))
    {
      z.w("!44@/B4Tb64lLpIg3+3oVdUfy3+SsBu+B+ajN5eXUJlcQFY=", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
      str = "*/" + paramString;
    }
    return str;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.a
 * JD-Core Version:    0.6.2
 */