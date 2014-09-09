package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.mm.c.a.ci;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public class ExtControlProviderAccountSync extends ExtContentProviderBase
{
  private static final UriMatcher eMf;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    eMf = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.AccountSync", "accountSync", 1);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
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
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8g2Hz7jQ3a3mNolTgwNhfsh5cEwcQwk2+A==", "query()");
    a(paramUri, getContext(), eMf);
    if (paramUri == null)
    {
      hg(3);
      return null;
    }
    if ((ch.jb(Qg())) || (ch.jb(Qh())))
    {
      hg(3);
      return null;
    }
    if (!HL())
    {
      hg(1);
      return this.ehO;
    }
    if (!as(getContext()))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8g2Hz7jQ3a3mNolTgwNhfsh5cEwcQwk2+A==", "invalid appid ! return null");
      hg(2);
      return null;
    }
    switch (eMf.match(paramUri))
    {
    default:
      hg(3);
      return null;
    case 1:
    }
    z.i("!56@/B4Tb64lLpKAQbqlkU5I8g2Hz7jQ3a3mNolTgwNhfsh5cEwcQwk2+A==", "startContactSync()");
    ci localci = new ci();
    if (a.aGB().g(localci))
    {
      hg(0);
      return null;
    }
    z.e("!56@/B4Tb64lLpKAQbqlkU5I8g2Hz7jQ3a3mNolTgwNhfsh5cEwcQwk2+A==", "AccountHelper == null");
    hg(4);
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderAccountSync
 * JD-Core Version:    0.6.2
 */