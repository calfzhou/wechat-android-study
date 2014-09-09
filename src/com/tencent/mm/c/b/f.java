package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class f extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int cTf = "chatroomname".hashCode();
  private static final int cTg = "addtime".hashCode();
  private static final int cTh = "memberlist".hashCode();
  private static final int cTi = "displayname".hashCode();
  private static final int cTj = "chatroomnick".hashCode();
  private static final int cTk = "roomflag".hashCode();
  private static final int cTl = "roomowner".hashCode();
  private static final int cTm = "roomdata".hashCode();
  private static final int cTn = "isShowname".hashCode();
  private static final int cTo = "selfDisplayName".hashCode();
  private static final int cTp = "style".hashCode();
  private static final int cTq = "chatroomdataflag".hashCode();
  private static final int cTr = "modifytime".hashCode();
  private boolean cSS = true;
  private boolean cST = true;
  private boolean cSU = true;
  private boolean cSV = true;
  private boolean cSW = true;
  private boolean cSX = true;
  private boolean cSY = true;
  private boolean cSZ = true;
  private boolean cTa = true;
  private boolean cTb = true;
  private boolean cTc = true;
  private boolean cTd = true;
  private boolean cTe = true;
  public long field_addtime;
  public int field_chatroomdataflag;
  public String field_chatroomname;
  public String field_chatroomnick;
  public String field_displayname;
  public int field_isShowname;
  public String field_memberlist;
  public long field_modifytime;
  public byte[] field_roomdata;
  public int field_roomflag;
  public String field_roomowner;
  public String field_selfDisplayName;
  public int field_style;

  public final void b(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = 0;
    int j = arrayOfString.length;
    label18: int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cTf != k)
        break label62;
      this.field_chatroomname = paramCursor.getString(i);
      this.cSS = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (cTg == k)
        this.field_addtime = paramCursor.getLong(i);
      else if (cTh == k)
        this.field_memberlist = paramCursor.getString(i);
      else if (cTi == k)
        this.field_displayname = paramCursor.getString(i);
      else if (cTj == k)
        this.field_chatroomnick = paramCursor.getString(i);
      else if (cTk == k)
        this.field_roomflag = paramCursor.getInt(i);
      else if (cTl == k)
        this.field_roomowner = paramCursor.getString(i);
      else if (cTm == k)
        this.field_roomdata = paramCursor.getBlob(i);
      else if (cTn == k)
        this.field_isShowname = paramCursor.getInt(i);
      else if (cTo == k)
        this.field_selfDisplayName = paramCursor.getString(i);
      else if (cTp == k)
        this.field_style = paramCursor.getInt(i);
      else if (cTq == k)
        this.field_chatroomdataflag = paramCursor.getInt(i);
      else if (cTr == k)
        this.field_modifytime = paramCursor.getLong(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_chatroomname == null)
      this.field_chatroomname = "";
    if (this.cSS)
      localContentValues.put("chatroomname", this.field_chatroomname);
    if (this.cST)
      localContentValues.put("addtime", Long.valueOf(this.field_addtime));
    if (this.cSU)
      localContentValues.put("memberlist", this.field_memberlist);
    if (this.cSV)
      localContentValues.put("displayname", this.field_displayname);
    if (this.cSW)
      localContentValues.put("chatroomnick", this.field_chatroomnick);
    if (this.cSX)
      localContentValues.put("roomflag", Integer.valueOf(this.field_roomflag));
    if (this.cSY)
      localContentValues.put("roomowner", this.field_roomowner);
    if (this.cSZ)
      localContentValues.put("roomdata", this.field_roomdata);
    if (this.cTa)
      localContentValues.put("isShowname", Integer.valueOf(this.field_isShowname));
    if (this.cTb)
      localContentValues.put("selfDisplayName", this.field_selfDisplayName);
    if (this.cTc)
      localContentValues.put("style", Integer.valueOf(this.field_style));
    if (this.cTd)
      localContentValues.put("chatroomdataflag", Integer.valueOf(this.field_chatroomdataflag));
    if (this.cTe)
      localContentValues.put("modifytime", Long.valueOf(this.field_modifytime));
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.f
 * JD-Core Version:    0.6.2
 */