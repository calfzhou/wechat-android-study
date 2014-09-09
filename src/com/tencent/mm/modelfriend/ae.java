package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

public final class ae extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private com.tencent.mm.sdk.f.af dtV;
  public ap dtW = new af(this);

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(ad.dhu, "GoogleFriend");
  }

  public ae(com.tencent.mm.sdk.f.af paramaf)
  {
    super(paramaf, ad.dhu, "GoogleFriend", null);
    this.dtV = paramaf;
  }

  private boolean a(ad paramad)
  {
    if (paramad == null);
    ContentValues localContentValues;
    do
    {
      return false;
      localContentValues = paramad.ir();
    }
    while ((int)this.dtV.insert("GoogleFriend", "googleitemid", localContentValues) <= 0);
    return true;
  }

  public final Cursor P(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString1))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googlegmail!='" + paramString2 + "' AND ");
      localStringBuilder.append("GoogleFriend.googlename LIKE '%" + paramString1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.googlenamepy LIKE '%" + paramString1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.googlegmail LIKE '%" + paramString1 + "%' OR ");
      localStringBuilder.append("GoogleFriend.nickname LIKE '%" + paramString1 + "%' ) ");
    }
    while (true)
    {
      localStringBuilder.append(" GROUP BY googleid,contecttype");
      localStringBuilder.append(" ORDER BY status , googlenamepy ASC , usernamepy ASC");
      return this.dtV.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + localStringBuilder.toString(), null);
      localStringBuilder.append(" WHERE ( GoogleFriend.googlegmail!='" + paramString2 + "' )");
    }
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean b(ad paramad)
  {
    boolean bool1 = true;
    String str1 = paramad.field_googleitemid;
    String str2 = "SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"" + ch.iV(str1) + "\"";
    Cursor localCursor = this.dtV.rawQuery(str2, null);
    boolean bool2;
    if (localCursor.getCount() > 0)
    {
      bool2 = bool1;
      localCursor.close();
      if (bool2)
        break label86;
      bool1 = a(paramad);
    }
    label86: int i;
    do
    {
      return bool1;
      bool2 = false;
      break;
      ContentValues localContentValues = paramad.ir();
      com.tencent.mm.sdk.f.af localaf = this.dtV;
      String str3 = "googleitemid=?";
      String[] arrayOfString = new String[bool1];
      arrayOfString[0] = paramad.field_googleitemid;
      i = localaf.update("GoogleFriend", localContentValues, str3, arrayOfString);
      if (i > 0)
        Bo();
    }
    while (i > 0);
    return false;
  }

  public final void clear()
  {
    this.dtV.bp("GoogleFriend", " delete from GoogleFriend");
    this.dtW.b(5, this.dtW, "");
  }

  public final boolean e(ArrayList paramArrayList)
  {
    int i = 0;
    if (paramArrayList.size() <= 0)
    {
      z.d("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "insertList . list is null.");
      return false;
    }
    long l;
    h localh1;
    if ((this.dtV instanceof h))
    {
      h localh2 = (h)this.dtV;
      l = localh2.dc(Thread.currentThread().getId());
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l);
      z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "surround insertList in a transaction, ticket = %d", arrayOfObject);
      localh1 = localh2;
    }
    while (true)
      if (i < paramArrayList.size())
      {
        a((ad)paramArrayList.get(i));
        i++;
      }
      else
      {
        if (localh1 != null)
        {
          localh1.dd(l);
          z.i("!56@/B4Tb64lLpKHrGLZvbPyiIVQZqGB7lNLR9cEovBG92K66fy5loyLJw==", "end updateList transaction");
        }
        this.dtW.b(2, this.dtW, "");
        return true;
        l = -1L;
        localh1 = null;
        i = 0;
      }
  }

  public final Cursor gx(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append(" WHERE ( ");
      localStringBuilder.append("GoogleFriend.googleid='" + paramString + "'");
      localStringBuilder.append(" ) ");
    }
    return this.dtV.rawQuery("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + localStringBuilder, null);
  }

  public final boolean n(String paramString, int paramInt)
  {
    String str = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' WHERE googleitemid=" + "'" + paramString + "'";
    return this.dtV.bp("GoogleFriend", str);
  }

  public final boolean o(String paramString, int paramInt)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      String str = "UPDATE GoogleFriend SET googlecgistatus='" + paramInt + "' , status=" + "'0' WHERE " + "username='" + paramString + "'";
      return this.dtV.bp("GoogleFriend", str);
    }
    return false;
  }

  public final String wj()
  {
    return "GoogleFriend";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ae
 * JD-Core Version:    0.6.2
 */