package com.tencent.mm.plugin.base.stub;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class MMPluginProvider extends ContentProvider
{
  private static final UriMatcher ehC;
  private d ehB = new d();

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    ehC = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.sdk.plugin.provider", "sharedpref", 2);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    z.v("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "plugin delete" + paramUri);
    switch (ehC.match(paramUri))
    {
    default:
      z.e("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "Unknown URI " + paramUri);
      return 0;
    case 2:
    }
    return d.HH();
  }

  public String getType(Uri paramUri)
  {
    switch (ehC.match(paramUri))
    {
    case 2:
    }
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    z.v("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "plugin insert" + paramUri);
    switch (ehC.match(paramUri))
    {
    default:
      z.e("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "Unknown URI " + paramUri);
      return null;
    case 2:
    }
    return d.HG();
  }

  public boolean onCreate()
  {
    this.ehB.aj(getContext());
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    z.v("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "plugin query" + paramUri);
    switch (ehC.match(paramUri))
    {
    default:
      z.e("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "Unknown URI " + paramUri);
      return null;
    case 2:
    }
    return d.a(paramArrayOfString1, paramArrayOfString2);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    z.d("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "plugin update" + paramUri);
    switch (ehC.match(paramUri))
    {
    default:
      z.e("!44@/B4Tb64lLpJVwK899MjSHnGus/LYixbxZMJrvdleiVA=", "Unknown URI " + paramUri);
      return 0;
    case 2:
    }
    return d.HI();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.MMPluginProvider
 * JD-Core Version:    0.6.2
 */