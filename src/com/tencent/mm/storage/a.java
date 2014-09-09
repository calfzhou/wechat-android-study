package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.a.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ch;

public final class a
  implements com.tencent.mm.dbsupport.newcursor.a
{
  public long dhv;
  private String field_alias;
  public String field_conRemark;
  public int field_deleteFlag;
  public byte[] field_lvbuff;
  private String field_nickname;
  public String field_remarkDesc;
  public int field_showHead;
  public String field_signature;
  private String field_username;
  private int field_verifyFlag;
  public int field_weiboFlag;
  private CharSequence ihQ;

  private void aHX()
  {
    if (this.field_lvbuff == null);
    while (true)
    {
      return;
      try
      {
        if ((this.field_lvbuff != null) && (this.field_lvbuff.length != 0))
        {
          ad localad = new ad();
          if (localad.cQ(this.field_lvbuff) == 0)
          {
            localad.or(4);
            localad.or(4);
            localad.aNo();
            localad.or(8);
            localad.or(4);
            localad.aNo();
            localad.aNo();
            localad.or(4);
            localad.or(4);
            localad.aNo();
            localad.aNo();
            localad.or(4);
            localad.or(4);
            this.field_signature = localad.getString();
            localad.aNo();
            localad.aNo();
            localad.aNo();
            localad.or(4);
            localad.or(4);
            localad.aNo();
            localad.or(4);
            localad.aNo();
            localad.aNo();
            localad.or(4);
            localad.or(4);
            if (!localad.aNp())
              this.field_remarkDesc = localad.getString();
            this.field_lvbuff = null;
            return;
          }
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  private void g(int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default:
      return;
    case 4:
      this.field_verifyFlag = ((int)paramLong);
      return;
    case 5:
      this.field_showHead = ((int)paramLong);
      return;
    case 6:
      this.field_weiboFlag = ((int)paramLong);
      return;
    case 7:
      this.dhv = paramLong;
      return;
    case 8:
    }
    this.field_deleteFlag = ((int)paramLong);
  }

  public final void a(int paramInt, long paramLong)
  {
    g(paramInt, paramLong);
  }

  public final CharSequence aHW()
  {
    return this.ihQ;
  }

  public final void b(int paramInt, long paramLong)
  {
    g(paramInt, paramLong);
  }

  public final void b(Cursor paramCursor)
  {
    this.field_username = paramCursor.getString(0);
    this.field_nickname = paramCursor.getString(1);
    this.field_alias = paramCursor.getString(2);
    this.field_conRemark = paramCursor.getString(3);
    this.field_verifyFlag = paramCursor.getInt(4);
    this.field_showHead = paramCursor.getInt(5);
    this.field_weiboFlag = paramCursor.getInt(6);
    this.dhv = paramCursor.getLong(7);
    this.field_deleteFlag = paramCursor.getInt(8);
    this.field_lvbuff = paramCursor.getBlob(9);
    aHX();
  }

  public final void c(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramInt == 9)
      this.field_lvbuff = paramArrayOfByte;
  }

  public final void f(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
      this.field_username = paramString;
      return;
    case 1:
      this.field_nickname = paramString;
      return;
    case 2:
      this.field_alias = paramString;
      return;
    case 3:
    }
    this.field_conRemark = paramString;
  }

  public final String getUsername()
  {
    return this.field_username;
  }

  public final int jd()
  {
    return this.field_verifyFlag;
  }

  public final String od()
  {
    String str;
    if ((this.field_conRemark != null) && (!this.field_conRemark.trim().equals("")))
      str = this.field_conRemark;
    while (true)
    {
      return str;
      str = com.tencent.mm.g.a.iI(this.field_username);
      if (str == null)
      {
        if ((this.field_nickname != null) && (this.field_nickname.length() > 0))
          break;
        str = this.field_alias;
        if (ch.jb(str))
        {
          str = this.field_username;
          if (str == null)
            str = null;
          while ((str == null) || (str.length() == 0))
          {
            return this.field_username;
            if (str.toLowerCase().endsWith("@t.qq.com"))
            {
              str = "@" + str.replace("@t.qq.com", "");
            }
            else if (str.toLowerCase().endsWith("@qqim"))
            {
              str = str.replace("@qqim", "");
              long l = Long.valueOf(str).longValue();
              if (l < 0L)
                str = new k(l).toString();
            }
          }
        }
      }
    }
    return this.field_nickname;
  }

  public final void og()
  {
    aHX();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.a
 * JD-Core Version:    0.6.2
 */