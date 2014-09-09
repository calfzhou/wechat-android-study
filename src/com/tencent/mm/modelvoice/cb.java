package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.w;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class cb extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS voiceinfo ( FileName TEXT PRIMARY KEY, User TEXT, MsgId INT, NetOffset INT, FileNowSize INT, TotalLen INT, Status INT, CreateTime INT, LastModifyTime INT, ClientId TEXT, VoiceLength INT, MsgLocalId INT, Human TEXT, reserved1 INT, reserved2 TEXT )", "CREATE INDEX IF NOT EXISTS voiceinfomsgidindex ON voiceinfo ( MsgId ) ", "CREATE UNIQUE INDEX IF NOT EXISTS voiceinfouniqueindex ON voiceinfo ( FileName )", "DELETE FROM voiceinfo WHERE Status = 99" };
  private Map dIU = new HashMap();
  private Map dIV = new HashMap();
  private Map dIW = new HashMap();
  private h dmb;

  public cb(h paramh)
  {
    this.dmb = paramh;
  }

  public static String iC(String paramString)
  {
    return w.a(paramString, ch.CM());
  }

  public final List Ba()
  {
    String str1 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2" + " FROM voiceinfo";
    String str2 = str1 + " WHERE Status<97 and User!=\"_USER_FOR_THROWBOTTLE_\"   order by CreateTime";
    Cursor localCursor = this.dmb.rawQuery(str2, null);
    int i = localCursor.getCount();
    z.d("!32@/B4Tb64lLpIv/qzEF4E8ss0xfK7O4cQt", "getUnfinishInfo resCount:" + i);
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      br localbr = new br();
      localbr.b(localCursor);
      localArrayList.add(localbr);
    }
    localCursor.close();
    return localArrayList;
  }

  public final br Y(long paramLong)
  {
    String str = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2" + " FROM voiceinfo WHERE MsgId=" + paramLong;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToFirst();
    br localbr = null;
    if (bool)
    {
      localbr = new br();
      localbr.b(localCursor);
    }
    localCursor.close();
    return localbr;
  }

  public final boolean a(String paramString, br parambr)
  {
    boolean bool1;
    boolean bool2;
    label20: ContentValues localContentValues;
    if (paramString.length() > 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (parambr == null)
        break label53;
      bool2 = true;
      Assert.assertTrue(bool2);
      localContentValues = parambr.ir();
      if (localContentValues.size() > 0)
        break label59;
      z.e("!32@/B4Tb64lLpIv/qzEF4E8ss0xfK7O4cQt", "update failed, no values set");
    }
    label53: label59: 
    while (this.dmb.update("voiceinfo", localContentValues, "FileName= ?", new String[] { paramString }) <= 0)
    {
      return false;
      bool1 = false;
      break;
      bool2 = false;
      break label20;
    }
    Bo();
    return true;
  }

  public final b c(String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = bs.gP(paramString2);
    if (paramBoolean)
    {
      if (ch.getInt(paramString1, -1) == 4)
      {
        if (this.dIW.get(str) == null)
          this.dIW.put(str, new ba(str));
        return (b)this.dIW.get(str);
      }
      if (this.dIU.get(str) == null)
        this.dIU.put(str, new a(str));
      return (b)this.dIU.get(str);
    }
    switch (bq.ir(paramString2))
    {
    default:
      if (this.dIU.get(str) == null)
        this.dIU.put(str, new a(str));
      return (b)this.dIU.get(str);
    case 0:
      if (this.dIU.get(str) == null)
        this.dIU.put(str, new a(str));
      return (b)this.dIU.get(str);
    case 1:
      if (this.dIV.get(str) == null)
        this.dIV.put(str, new bl(str));
      return (b)this.dIV.get(str);
    case 2:
    }
    if (this.dIW.get(str) == null)
      this.dIW.put(str, new ba(str));
    return (b)this.dIW.get(str);
  }

  public final boolean c(br parambr)
  {
    boolean bool;
    ContentValues localContentValues;
    if (parambr != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      localContentValues = parambr.ir();
      if (localContentValues.size() > 0)
        break label36;
      z.e("!32@/B4Tb64lLpIv/qzEF4E8ss0xfK7O4cQt", "insert falied, no values set");
    }
    label36: 
    while (this.dmb.insert("voiceinfo", "FileName", localContentValues) == -1L)
    {
      return false;
      bool = false;
      break;
    }
    Bo();
    return true;
  }

  public final br eR(int paramInt)
  {
    String str = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2" + " FROM voiceinfo WHERE MsgLocalId=" + paramInt;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToFirst();
    br localbr = null;
    if (bool)
    {
      localbr = new br();
      localbr.b(localCursor);
    }
    localCursor.close();
    return localbr;
  }

  public final void iD(String paramString)
  {
    String str = bs.gP(paramString);
    switch (bq.ir(paramString))
    {
    default:
      a locala2 = (a)this.dIU.get(str);
      if (locala2 != null)
      {
        locala2.Bf();
        this.dIU.remove(str);
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    ba localba;
    do
    {
      bl localbl;
      do
      {
        a locala1;
        do
        {
          return;
          locala1 = (a)this.dIU.get(str);
        }
        while (locala1 == null);
        locala1.Bf();
        this.dIU.remove(str);
        return;
        localbl = (bl)this.dIV.get(str);
      }
      while (localbl == null);
      localbl.Bf();
      this.dIV.remove(str);
      return;
      localba = (ba)this.dIW.get(str);
    }
    while (localba == null);
    localba.Bf();
    this.dIW.remove(str);
  }

  public final boolean iE(String paramString)
  {
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.dmb.delete("voiceinfo", "FileName= ?", new String[] { paramString }) <= 0)
        z.w("!32@/B4Tb64lLpIv/qzEF4E8ss0xfK7O4cQt", "delete failed, no such file:" + paramString);
      return true;
    }
  }

  public final br iF(String paramString)
  {
    if (paramString == null)
      return null;
    String str = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2" + " FROM voiceinfo WHERE FileName= ?";
    Cursor localCursor = this.dmb.rawQuery(str, new String[] { paramString });
    z.d("!32@/B4Tb64lLpIv/qzEF4E8ss0xfK7O4cQt", "getInfoByFilename fileName[" + paramString + "] ResCount:" + localCursor.getCount());
    boolean bool = localCursor.moveToFirst();
    br localbr = null;
    if (bool)
    {
      localbr = new br();
      localbr.b(localCursor);
    }
    localCursor.close();
    return localbr;
  }

  public final br iG(String paramString)
  {
    String str = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2" + " FROM voiceinfo WHERE FileName= ?";
    Cursor localCursor = this.dmb.rawQuery(str, new String[] { paramString });
    boolean bool = localCursor.moveToFirst();
    br localbr = null;
    if (bool)
    {
      localbr = new br();
      localbr.b(localCursor);
    }
    localCursor.close();
    return localbr;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.cb
 * JD-Core Version:    0.6.2
 */