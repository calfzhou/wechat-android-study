package com.tencent.mm.plugin.ext.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public class ExtContentProviderBase extends ContentProvider
{
  private static boolean eMb = false;
  protected static boolean ehQ = false;
  private long eLW = ch.CN();
  private String eLX;
  private String eLY = "";
  private String[] eLZ;
  private int eMa = 0;
  protected MatrixCursor ehO = new MatrixCursor(new String[0]);

  private int Qf()
  {
    return (int)ch.ad(this.eLW);
  }

  private void at(Context paramContext)
  {
    if (paramContext == null)
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "in initCallerPkgName(), context == null");
    do
    {
      return;
      z.i("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "Binder.getCallingUid() = " + Binder.getCallingUid());
      this.eLZ = paramContext.getPackageManager().getPackagesForUid(Binder.getCallingUid());
    }
    while (this.eLZ != null);
    z.w("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "m_pkgs == null");
  }

  private static String d(Uri paramUri)
  {
    if (paramUri == null)
      return "";
    return ch.ja(paramUri.getQueryParameter("appid"));
  }

  protected final boolean HL()
  {
    try
    {
      z.i("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "checkIsLogin()");
      if (!ehQ)
      {
        com.tencent.mm.pluginsdk.d.a.a locala = new com.tencent.mm.pluginsdk.d.a.a();
        locala.a(4000L, new a(this, locala));
      }
      if ((bg.oE()) && (bg.ra()) && (!bg.rd()));
      for (ehQ = true; ; ehQ = false)
      {
        z.i("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "hasLogin = " + ehQ);
        return ehQ;
      }
    }
    catch (Exception localException)
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", localException.getMessage());
    }
    return false;
  }

  protected final String Qg()
  {
    return this.eLY;
  }

  protected final String Qh()
  {
    if (!ch.jb(this.eLX))
      return this.eLX;
    if ((this.eLZ == null) || (this.eLZ.length <= 0))
      return "";
    return this.eLZ[0];
  }

  protected final void a(Uri paramUri, Context paramContext, int paramInt)
  {
    this.eLY = d(paramUri);
    at(paramContext);
    this.eMa = paramInt;
    this.eLW = ch.CN();
  }

  protected final void a(Uri paramUri, Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    this.eLY = d(paramUri);
    if (paramArrayOfString == null)
      at(paramContext);
    while (true)
    {
      this.eMa = paramInt;
      this.eLW = ch.CN();
      return;
      this.eLZ = paramArrayOfString;
    }
  }

  protected final void a(Uri paramUri, Context paramContext, UriMatcher paramUriMatcher)
  {
    this.eLY = d(paramUri);
    at(paramContext);
    if (paramUriMatcher != null)
    {
      this.eMa = paramUriMatcher.match(paramUri);
      if (this.eMa < 0)
        this.eMa = 0;
    }
    this.eLW = ch.CN();
  }

  protected final boolean as(Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "in checkAppId(), context == null");
      return false;
    }
    if (ch.jb(this.eLY))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "invalid appid, ignore");
      return false;
    }
    if ((this.eLZ == null) || (this.eLZ.length <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "packageList is null");
      return false;
    }
    k localk = l.F(this.eLY, true);
    if (localk == null)
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "app not reg, do nothing");
      eMb = false;
    }
    label176: 
    while (true)
    {
      return eMb;
      if (localk.field_status == 3)
      {
        z.e("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "app is in blacklist");
        eMb = false;
      }
      else
      {
        String[] arrayOfString = this.eLZ;
        int i = arrayOfString.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label176;
          String str = arrayOfString[j];
          if (u.b(ak.getContext(), localk, str))
          {
            z.d("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "check app success, calling package name = %s", new Object[] { str });
            eMb = true;
            this.eLX = str;
            break;
          }
        }
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  protected final void hg(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Qh();
    arrayOfObject1[1] = this.eLY;
    arrayOfObject1[2] = Integer.valueOf(this.eMa);
    arrayOfObject1[3] = Integer.valueOf(paramInt);
    arrayOfObject1[4] = Integer.valueOf(Qf());
    z.i("!44@/B4Tb64lLpKAQbqlkU5I8mZxJJ4JsPX28ihhHV6igVo=", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", arrayOfObject1);
    n localn = n.fTF;
    Object[] arrayOfObject2 = new Object[5];
    arrayOfObject2[0] = Qh();
    arrayOfObject2[1] = this.eLY;
    arrayOfObject2[2] = Integer.valueOf(this.eMa);
    arrayOfObject2[3] = Integer.valueOf(paramInt);
    arrayOfObject2[4] = Integer.valueOf(Qf());
    localn.d(10505, arrayOfObject2);
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtContentProviderBase
 * JD-Core Version:    0.6.2
 */