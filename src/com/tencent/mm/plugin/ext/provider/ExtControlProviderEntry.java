package com.tencent.mm.plugin.ext.provider;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cr;
import com.tencent.mm.storage.cs;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

public class ExtControlProviderEntry extends ExtContentProviderBase
{
  private static final String[] eLQ = { "retCode" };
  private static final UriMatcher eMf;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    eMf = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.entry", "view_profile", 2);
    eMf.addURI("com.tencent.mm.plugin.ext.entry", "to_chatting", 3);
    eMf.addURI("com.tencent.mm.plugin.ext.entry", "to_nearby", 4);
    eMf.addURI("com.tencent.mm.plugin.ext.entry", "sns_comment_detail", 5);
    eMf.addURI("com.tencent.mm.plugin.ext.entry", "share_time_line", 6);
  }

  private Cursor a(String[] paramArrayOfString, String paramString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "wrong args");
      hg(3);
      return null;
    }
    String str = paramArrayOfString[0];
    if ((str == null) || (str.length() <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "contactId == null");
      hg(3);
      return null;
    }
    if ((paramString != null) && (paramString.equalsIgnoreCase("openapi")));
    for (int i = 1; ; i = 0)
    {
      if (i != 0);
      Object localObject;
      try
      {
        cr localcr = com.tencent.mm.plugin.ext.b.Qb().Ad(str);
        if ((localcr == null) || (ch.jb(localcr.field_openId)) || (ch.jb(localcr.field_username)))
        {
          z.e("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "openidInApp is null");
          hg(4);
          return null;
        }
        i locali2 = bg.qW().oT().ys(localcr.field_username);
        i locali1;
        for (localObject = locali2; (localObject == null) || ((int)((com.tencent.mm.g.a)localObject).dhv <= 0) || (getContext() == null); localObject = locali1)
        {
          hg(3);
          return null;
          locali1 = bg.qW().oT().cT(com.tencent.mm.plugin.ext.a.a.lX(str));
        }
      }
      catch (Exception localException)
      {
        z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", localException.getMessage());
        hg(3);
        return null;
      }
      Intent localIntent = new Intent();
      localIntent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.chatting.ChattingUI"));
      localIntent.putExtra("Chat_User", ((i)localObject).getUsername());
      localIntent.putExtra("finish_direct", true);
      localIntent.addFlags(268435456);
      localIntent.addFlags(67108864);
      getContext().startActivity(localIntent);
      MatrixCursor localMatrixCursor = new MatrixCursor(eLQ);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      localMatrixCursor.addRow(arrayOfObject);
      hg(0);
      return localMatrixCursor;
    }
  }

  private Cursor h(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "wrong args");
      hg(3);
      return null;
    }
    String str = paramArrayOfString[0];
    if ((str == null) || (str.length() <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "contactId == null");
      hg(3);
      return null;
    }
    i locali;
    try
    {
      locali = bg.qW().oT().cT(com.tencent.mm.plugin.ext.a.a.lX(str));
      if ((locali == null) || ((int)locali.dhv <= 0) || (getContext() == null))
      {
        hg(3);
        return null;
      }
    }
    catch (Exception localException)
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", localException.getMessage());
      hg(3);
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.contact.profile.ContactInfoUI"));
    localIntent.addFlags(268435456);
    localIntent.putExtra("Contact_User", locali.getUsername());
    getContext().startActivity(localIntent);
    MatrixCursor localMatrixCursor = new MatrixCursor(eLQ);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(1);
    localMatrixCursor.addRow(arrayOfObject);
    hg(0);
    return localMatrixCursor;
  }

  private Cursor i(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "wrong args");
      hg(3);
      return null;
    }
    String str = paramArrayOfString[0];
    if ((str == null) || (str.length() <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "wrong args");
      hg(3);
      return null;
    }
    long l;
    try
    {
      l = com.tencent.mm.plugin.ext.a.a.lX(str);
      if (l <= 0L)
      {
        hg(3);
        return null;
      }
    }
    catch (Exception localException)
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", localException.getMessage());
      hg(3);
      return null;
    }
    if (getContext() == null)
    {
      hg(4);
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"));
    localIntent.putExtra("INTENT_SNS_LOCAL_ID", (int)l);
    localIntent.addCategory("android.intent.category.DEFAULT");
    localIntent.addFlags(268435456);
    getContext().startActivity(localIntent);
    hg(0);
    MatrixCursor localMatrixCursor = new MatrixCursor(eLQ);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(1);
    localMatrixCursor.addRow(arrayOfObject);
    return localMatrixCursor;
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
    z.d("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "query()");
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
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "invalid appid ! return null");
      hg(2);
      return null;
    }
    String str1 = ch.ja(paramUri.getQueryParameter("source"));
    switch (eMf.match(paramUri))
    {
    default:
      hg(3);
      return null;
    case 2:
      return h(paramArrayOfString2);
    case 3:
      return a(paramArrayOfString2, str1);
    case 4:
      if (getContext() == null)
      {
        hg(4);
        return null;
      }
      Intent localIntent2 = new Intent();
      localIntent2.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI"));
      localIntent2.addFlags(268435456);
      getContext().startActivity(localIntent2);
      MatrixCursor localMatrixCursor2 = new MatrixCursor(eLQ);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      localMatrixCursor2.addRow(arrayOfObject2);
      hg(0);
      return localMatrixCursor2;
    case 5:
      return i(paramArrayOfString2);
    case 6:
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
    {
      z.w("!56@/B4Tb64lLpKAQbqlkU5I8spTWKXAC4eP9VBikFHaEUyYz0LzCAxhfQ==", "wrong args");
      hg(3);
      return null;
    }
    if (getContext() == null)
    {
      hg(4);
      return null;
    }
    Intent localIntent1 = new Intent();
    localIntent1.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
    localIntent1.setAction("android.intent.action.SEND");
    localIntent1.addCategory("android.intent.category.DEFAULT");
    localIntent1.addFlags(268435456);
    if (paramArrayOfString2[1] == null);
    for (String str2 = ""; ; str2 = paramArrayOfString2[1])
    {
      localIntent1.putExtra("android.intent.extra.TEXT", str2);
      if ((paramArrayOfString2[0] != null) && (paramArrayOfString2[0].trim().length() > 0))
        localIntent1.putExtra("android.intent.extra.STREAM", Uri.parse(paramArrayOfString2[0]));
      localIntent1.putExtra("Ksnsupload_empty_img", true);
      localIntent1.setType("image/*");
      getContext().startActivity(localIntent1);
      hg(0);
      MatrixCursor localMatrixCursor1 = new MatrixCursor(eLQ);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(1);
      localMatrixCursor1.addRow(arrayOfObject1);
      return localMatrixCursor1;
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderEntry
 * JD-Core Version:    0.6.2
 */