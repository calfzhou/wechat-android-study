package com.tencent.mm.plugin.voicereminder.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.a.f;
import com.tencent.mm.c.b.au;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class z extends ah
{
  private static long dGl = 0L;
  public static final String[] dmc;
  private af dtV;
  private Map gSW = new HashMap();

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(n.dhu, "VoiceRemindInfo");
    dmc = arrayOfString;
  }

  public z(af paramaf)
  {
    super(paramaf, n.dhu, "VoiceRemindInfo", au.cKz);
    this.dtV = paramaf;
  }

  public static String ia(String paramString)
  {
    long l1 = System.currentTimeMillis();
    String str1 = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(l1));
    if ((paramString != null) && (paramString.length() > 1))
      str1 = str1 + f.d(paramString.getBytes()).substring(0, 7);
    String str2 = str1 + l1 % 10000L;
    StringBuilder localStringBuilder = new StringBuilder().append(str2);
    long l2 = dGl;
    dGl = 1L + l2;
    return l2;
  }

  public final List Ba()
  {
    String str1 = "SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2" + " FROM VoiceRemindInfo";
    String str2 = str1 + " WHERE status<97  order by createtime";
    Cursor localCursor = this.dtV.rawQuery(str2, null);
    int i = localCursor.getCount();
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JQyXo4WsPXM8QEvnYyPx268=", "getUnfinishInfo resCount:" + i);
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      n localn = new n();
      localn.b(localCursor);
      localArrayList.add(localn);
    }
    localCursor.close();
    return localArrayList;
  }

  public final boolean a(String paramString, n paramn)
  {
    boolean bool1;
    boolean bool2;
    label20: ContentValues localContentValues;
    if (paramString.length() > 0)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramn == null)
        break label53;
      bool2 = true;
      Assert.assertTrue(bool2);
      localContentValues = paramn.ir();
      if (localContentValues.size() > 0)
        break label59;
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpLcQwGQMRj/JQyXo4WsPXM8QEvnYyPx268=", "update failed, no values set");
    }
    label53: label59: 
    while (this.dtV.update("VoiceRemindInfo", localContentValues, "filename= ?", new String[] { paramString }) <= 0)
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

  public final int b(n paramn)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JQyXo4WsPXM8QEvnYyPx268=", "VoiceRemindStorage Insert");
    ContentValues localContentValues = paramn.ir();
    int i = (int)this.dtV.insert("VoiceRemindInfo", "", localContentValues);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLcQwGQMRj/JQyXo4WsPXM8QEvnYyPx268=", "VoiceRemindStorage Insert result" + i);
    return i;
  }

  public final void iD(String paramString)
  {
    d locald = (d)this.gSW.get(paramString);
    if (locald != null)
    {
      locald.Bf();
      this.gSW.remove(paramString);
    }
  }

  public final boolean iE(String paramString)
  {
    if (paramString.length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.dtV.delete("VoiceRemindInfo", "filename= ?", new String[] { paramString }) <= 0)
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpLcQwGQMRj/JQyXo4WsPXM8QEvnYyPx268=", "delete failed, no such file:" + paramString);
      return true;
    }
  }

  public final d tj(String paramString)
  {
    if (this.gSW.get(paramString) == null)
      this.gSW.put(paramString, new d(paramString));
    return (d)this.gSW.get(paramString);
  }

  public final n tk(String paramString)
  {
    String str = "SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2" + " FROM VoiceRemindInfo WHERE filename= ?";
    Cursor localCursor = this.dtV.rawQuery(str, new String[] { paramString });
    boolean bool = localCursor.moveToFirst();
    n localn = null;
    if (bool)
    {
      localn = new n();
      localn.b(localCursor);
    }
    localCursor.close();
    return localn;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.z
 * JD-Core Version:    0.6.2
 */