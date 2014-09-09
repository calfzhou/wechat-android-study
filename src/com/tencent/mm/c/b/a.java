package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class a extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int cQk = "appId".hashCode();
  private static final int cQl = "sdkVer".hashCode();
  private static final int cQm = "mediaSvrId".hashCode();
  private static final int cQn = "mediaId".hashCode();
  private static final int cQo = "clientAppDataId".hashCode();
  private static final int cQp = "type".hashCode();
  private static final int cQq = "totalLen".hashCode();
  private static final int cQr = "offset".hashCode();
  private static final int cQs = "status".hashCode();
  private static final int cQt = "isUpload".hashCode();
  private static final int cQu = "createTime".hashCode();
  private static final int cQv = "lastModifyTime".hashCode();
  private static final int cQw = "fileFullPath".hashCode();
  private static final int cQx = "msgInfoId".hashCode();
  private static final int cQy = "netTimes".hashCode();
  private static final int cQz = "isUseCdn".hashCode();
  private boolean cPU = true;
  private boolean cPV = true;
  private boolean cPW = true;
  private boolean cPX = true;
  private boolean cPY = true;
  private boolean cPZ = true;
  private boolean cQa = true;
  private boolean cQb = true;
  private boolean cQc = true;
  private boolean cQd = true;
  private boolean cQe = true;
  private boolean cQf = true;
  private boolean cQg = true;
  private boolean cQh = true;
  private boolean cQi = true;
  private boolean cQj = true;
  public String field_appId;
  public String field_clientAppDataId;
  public long field_createTime;
  public String field_fileFullPath;
  public boolean field_isUpload;
  public int field_isUseCdn;
  public long field_lastModifyTime;
  public String field_mediaId;
  public String field_mediaSvrId;
  public long field_msgInfoId;
  public long field_netTimes;
  public long field_offset;
  public long field_sdkVer;
  public long field_status;
  public long field_totalLen;
  public long field_type;

  public final void b(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = arrayOfString.length;
    int j = 0;
    label18: int k;
    if (j < i)
    {
      k = arrayOfString[j].hashCode();
      if (cQk != k)
        break label59;
      this.field_appId = paramCursor.getString(j);
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label59: if (cQl == k)
      {
        this.field_sdkVer = paramCursor.getLong(j);
      }
      else if (cQm == k)
      {
        this.field_mediaSvrId = paramCursor.getString(j);
      }
      else if (cQn == k)
      {
        this.field_mediaId = paramCursor.getString(j);
      }
      else if (cQo == k)
      {
        this.field_clientAppDataId = paramCursor.getString(j);
      }
      else if (cQp == k)
      {
        this.field_type = paramCursor.getLong(j);
      }
      else if (cQq == k)
      {
        this.field_totalLen = paramCursor.getLong(j);
      }
      else if (cQr == k)
      {
        this.field_offset = paramCursor.getLong(j);
      }
      else if (cQs == k)
      {
        this.field_status = paramCursor.getLong(j);
      }
      else
      {
        if (cQt == k)
        {
          if (paramCursor.getInt(j) != 0);
          for (boolean bool = true; ; bool = false)
          {
            this.field_isUpload = bool;
            break;
          }
        }
        if (cQu == k)
          this.field_createTime = paramCursor.getLong(j);
        else if (cQv == k)
          this.field_lastModifyTime = paramCursor.getLong(j);
        else if (cQw == k)
          this.field_fileFullPath = paramCursor.getString(j);
        else if (cQx == k)
          this.field_msgInfoId = paramCursor.getLong(j);
        else if (cQy == k)
          this.field_netTimes = paramCursor.getLong(j);
        else if (cQz == k)
          this.field_isUseCdn = paramCursor.getInt(j);
        else if (cQA == k)
          this.iGx = paramCursor.getLong(j);
      }
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cPU)
      localContentValues.put("appId", this.field_appId);
    if (this.cPV)
      localContentValues.put("sdkVer", Long.valueOf(this.field_sdkVer));
    if (this.cPW)
      localContentValues.put("mediaSvrId", this.field_mediaSvrId);
    if (this.cPX)
      localContentValues.put("mediaId", this.field_mediaId);
    if (this.cPY)
      localContentValues.put("clientAppDataId", this.field_clientAppDataId);
    if (this.cPZ)
      localContentValues.put("type", Long.valueOf(this.field_type));
    if (this.cQa)
      localContentValues.put("totalLen", Long.valueOf(this.field_totalLen));
    if (this.cQb)
      localContentValues.put("offset", Long.valueOf(this.field_offset));
    if (this.cQc)
      localContentValues.put("status", Long.valueOf(this.field_status));
    if (this.cQd)
      localContentValues.put("isUpload", Boolean.valueOf(this.field_isUpload));
    if (this.cQe)
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    if (this.cQf)
      localContentValues.put("lastModifyTime", Long.valueOf(this.field_lastModifyTime));
    if (this.cQg)
      localContentValues.put("fileFullPath", this.field_fileFullPath);
    if (this.cQh)
      localContentValues.put("msgInfoId", Long.valueOf(this.field_msgInfoId));
    if (this.cQi)
      localContentValues.put("netTimes", Long.valueOf(this.field_netTimes));
    if (this.cQj)
      localContentValues.put("isUseCdn", Integer.valueOf(this.field_isUseCdn));
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.a
 * JD-Core Version:    0.6.2
 */