package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.f;
import com.tencent.mm.as.g;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.ap;

public final class bj extends ah
  implements g
{
  public static final String[] dmc = arrayOfString;
  private af dtV;
  public ap dtW = new bk(this);

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(bi.dhu, "LinkedInFriend");
  }

  public bj(af paramaf)
  {
    super(paramaf, bi.dhu, "LinkedInFriend", null);
    this.dtV = paramaf;
  }

  public final int a(f paramf)
  {
    if (paramf != null)
      this.dtV = paramf;
    return 0;
  }

  public final boolean a(bi parambi)
  {
    if (parambi == null);
    ContentValues localContentValues;
    do
    {
      return false;
      localContentValues = parambi.ir();
    }
    while ((int)this.dtV.insert("LinkedInFriend", "linkedInId", localContentValues) <= 0);
    return true;
  }

  public final void clear()
  {
    this.dtV.bp("LinkedInFriend", " delete from LinkedInFriend");
    this.dtW.b(5, this.dtW, "");
  }

  public final Cursor jm(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" WHERE ( ");
    localStringBuilder.append("LinkedInFriend.wechatId=?");
    localStringBuilder.append(") ORDER BY status ASC");
    return this.dtV.rawQuery("SELECT LinkedInFriend.linkedInId,LinkedInFriend.name,LinkedInFriend.position,LinkedInFriend.picUrl,LinkedInFriend.wechatUsername,LinkedInFriend.status,LinkedInFriend.wechatId,LinkedInFriend.wechatSmallHead,LinkedInFriend.wechatBigHead,LinkedInFriend.linkedInProfileUrl,LinkedInFriend.userOpStatus,LinkedInFriend.nickname FROM LinkedInFriend  " + localStringBuilder.toString(), new String[] { paramString });
  }

  public final boolean jn(String paramString)
  {
    String str = "UPDATE LinkedInFriend SET userOpStatus='1" + "' WHERE linkedInId=" + "'" + paramString + "'";
    return this.dtV.bp("LinkedInFriend", str);
  }

  public final String wj()
  {
    return "LinkedInFriend";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.bj
 * JD-Core Version:    0.6.2
 */