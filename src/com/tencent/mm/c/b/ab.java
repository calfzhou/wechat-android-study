package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.z;

public abstract class ab extends com.tencent.mm.sdk.f.ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int dbN = "deviceID".hashCode();
  private static final int dbO = "brandName".hashCode();
  private static final int dbP = "mac".hashCode();
  private static final int dbQ = "deviceType".hashCode();
  private static final int dbR = "connProto".hashCode();
  private static final int dbS = "connStrategy".hashCode();
  private static final int dbT = "closeStrategy".hashCode();
  private static final int dbU = "md5Str".hashCode();
  private static final int dbV = "authKey".hashCode();
  private static final int dbW = "sessionKey".hashCode();
  private static final int dbX = "sessionBuf".hashCode();
  private static final int dbY = "authBuf".hashCode();
  private static final int dbZ = "lvbuffer".hashCode();
  private boolean dbA = true;
  private boolean dbB = true;
  private boolean dbC = true;
  private boolean dbD = true;
  private boolean dbE = true;
  private boolean dbF = true;
  private boolean dbH = true;
  private boolean dbI = true;
  private boolean dbJ = true;
  private boolean dbK = true;
  private boolean dbL = true;
  private boolean dbM = true;
  private boolean dbz = true;
  private int dca;
  private int dcb;
  private long dcc;
  private long dcd;
  public byte[] field_authBuf;
  public String field_authKey;
  public String field_brandName;
  public int field_closeStrategy;
  public String field_connProto;
  public int field_connStrategy;
  public String field_deviceID;
  public String field_deviceType;
  public byte[] field_lvbuffer;
  public long field_mac;
  public String field_md5Str;
  public byte[] field_sessionBuf;
  public byte[] field_sessionKey;

  public final void b(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null);
    com.tencent.mm.sdk.platformtools.ad localad;
    do
    {
      while (true)
      {
        return;
        int i = 0;
        int j = arrayOfString.length;
        if (i < j)
        {
          int m = arrayOfString[i].hashCode();
          if (dbN == m)
            this.field_deviceID = paramCursor.getString(i);
          while (true)
          {
            i++;
            break;
            if (dbO == m)
            {
              this.field_brandName = paramCursor.getString(i);
            }
            else if (dbP == m)
            {
              this.field_mac = paramCursor.getLong(i);
              this.dbB = true;
            }
            else if (dbQ == m)
            {
              this.field_deviceType = paramCursor.getString(i);
            }
            else if (dbR == m)
            {
              this.field_connProto = paramCursor.getString(i);
            }
            else if (dbS == m)
            {
              this.field_connStrategy = paramCursor.getInt(i);
            }
            else if (dbT == m)
            {
              this.field_closeStrategy = paramCursor.getInt(i);
            }
            else if (dbU == m)
            {
              this.field_md5Str = paramCursor.getString(i);
            }
            else if (dbV == m)
            {
              this.field_authKey = paramCursor.getString(i);
            }
            else if (dbW == m)
            {
              this.field_sessionKey = paramCursor.getBlob(i);
            }
            else if (dbX == m)
            {
              this.field_sessionBuf = paramCursor.getBlob(i);
            }
            else if (dbY == m)
            {
              this.field_authBuf = paramCursor.getBlob(i);
            }
            else if (dbZ == m)
            {
              this.field_lvbuffer = paramCursor.getBlob(i);
            }
            else if (cQA == m)
            {
              this.iGx = paramCursor.getLong(i);
            }
          }
        }
        try
        {
          if ((this.field_lvbuffer != null) && (this.field_lvbuffer.length != 0))
          {
            localad = new com.tencent.mm.sdk.platformtools.ad();
            int k = localad.cQ(this.field_lvbuffer);
            if (k != 0)
            {
              z.e("!44@/B4Tb64lLpKSJu7YhIl8zC7eJ6OrZUBJvZVfJu+fm7g=", "parse LVBuffer error:" + k);
              return;
            }
          }
        }
        catch (Exception localException)
        {
          z.e("!44@/B4Tb64lLpKSJu7YhIl8zC7eJ6OrZUBJvZVfJu+fm7g=", "get value failed");
          return;
        }
      }
      if (!localad.aNp())
        this.dca = localad.getInt();
      if (!localad.aNp())
        this.dcb = localad.getInt();
      if (!localad.aNp())
        this.dcc = localad.getLong();
    }
    while (localad.aNp());
    this.dcd = localad.getLong();
  }

  public final void bF(int paramInt)
  {
    this.dca = paramInt;
    this.dbM = true;
  }

  public final void bG(int paramInt)
  {
    this.dcb = paramInt;
    this.dbM = true;
  }

  public final ContentValues ir()
  {
    try
    {
      if (this.dbM)
      {
        com.tencent.mm.sdk.platformtools.ad localad = new com.tencent.mm.sdk.platformtools.ad();
        localad.aNq();
        localad.ot(this.dca);
        localad.ot(this.dcb);
        localad.cO(this.dcc);
        localad.cO(this.dcd);
        this.field_lvbuffer = localad.aNr();
      }
      ContentValues localContentValues = new ContentValues();
      if (this.dbz)
        localContentValues.put("deviceID", this.field_deviceID);
      if (this.dbA)
        localContentValues.put("brandName", this.field_brandName);
      if (this.dbB)
        localContentValues.put("mac", Long.valueOf(this.field_mac));
      if (this.dbC)
        localContentValues.put("deviceType", this.field_deviceType);
      if (this.dbD)
        localContentValues.put("connProto", this.field_connProto);
      if (this.dbE)
        localContentValues.put("connStrategy", Integer.valueOf(this.field_connStrategy));
      if (this.dbF)
        localContentValues.put("closeStrategy", Integer.valueOf(this.field_closeStrategy));
      if (this.dbH)
        localContentValues.put("md5Str", this.field_md5Str);
      if (this.dbI)
        localContentValues.put("authKey", this.field_authKey);
      if (this.dbJ)
        localContentValues.put("sessionKey", this.field_sessionKey);
      if (this.dbK)
        localContentValues.put("sessionBuf", this.field_sessionBuf);
      if (this.dbL)
        localContentValues.put("authBuf", this.field_authBuf);
      if (this.dbM)
        localContentValues.put("lvbuffer", this.field_lvbuffer);
      if (this.iGx > 0L)
        localContentValues.put("rowid", Long.valueOf(this.iGx));
      return localContentValues;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!44@/B4Tb64lLpKSJu7YhIl8zC7eJ6OrZUBJvZVfJu+fm7g=", "get value failed, %s", arrayOfObject);
      }
    }
  }

  public final int ko()
  {
    return this.dca;
  }

  public final int kq()
  {
    return this.dcb;
  }

  public final long kr()
  {
    return this.dcc;
  }

  public final void n(long paramLong)
  {
    this.dcc = paramLong;
    this.dbM = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.ab
 * JD-Core Version:    0.6.2
 */