package com.tencent.mm.aj;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;
import java.util.ArrayList;
import java.util.List;

public final class b extends ah
  implements al
{
  private static final String[] dFn = { "CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )" };
  public static final String[] dmc;
  private Runnable dFo = new c(this);
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(a.dhu, "fmessage_conversation");
    dmc = arrayOfString;
  }

  public b(af paramaf)
  {
    super(paramaf, a.dhu, "fmessage_conversation", dFn);
    this.dtV = paramaf;
  }

  public final List Au()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(4);
    z.v("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "getNewLimit, limit = %d", arrayOfObject1);
    ArrayList localArrayList = new ArrayList();
    String str = "select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4";
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i);
    z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "getNewLimit, count = %d", arrayOfObject2);
    if (i <= 0)
    {
      z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "getNewLimit, cursor count is zero");
      localCursor.close();
      return localArrayList;
    }
    if (localCursor.moveToFirst())
      while (!localCursor.isAfterLast())
      {
        a locala = new a();
        locala.b(localCursor);
        localCursor.moveToNext();
        localArrayList.add(locala);
      }
    localCursor.close();
    return localArrayList;
  }

  public final boolean Av()
  {
    if (this.dtV.bp("fmessage_conversation", "update fmessage_conversation set isNew = 0"))
    {
      z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "clearAllNew success");
      Bo();
      return true;
    }
    z.e("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "clearAllNew fail");
    return false;
  }

  public final int Aw()
  {
    Cursor localCursor = this.dtV.rawQuery("select count(*) from fmessage_conversation where isNew = 1", null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "getNewCount = " + i);
    return i;
  }

  public final void a(String paramString, ao paramao)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, id is null");
      return;
    }
    long l1;
    f localf;
    a locala1;
    try
    {
      long l2 = Long.parseLong(paramString);
      l1 = l2;
      if (l1 == 0L)
      {
        z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange fail, sysRowId is invalid");
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, id = " + paramString + ", ex = " + localException.getMessage());
        l1 = 0L;
      }
      if (bg.qW().oD() == 0)
      {
        z.e("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, account not ready, can not insert fmessageconversation");
        return;
      }
      localf = new f();
      if (!l.AE().b(l1, localf))
      {
        z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, get fail, id = " + l1);
        return;
      }
      z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange succ, sysRowId = " + l1);
      locala1 = l.AF().hD(localf.field_talker);
      if (locala1 != null)
        break label535;
    }
    z.i("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, fmessage conversation does not exist, insert a new one, talker = " + localf.field_talker);
    a locala2 = new a();
    if (localf.field_type == 0)
    {
      as localas2 = as.zl(localf.field_msgContent);
      locala2.field_displayName = localas2.getDisplayName();
      if ((localas2.Ew() == 4) && (localas2.aJU() != null))
        locala2.field_displayName = localas2.aJU();
      locala2.field_addScene = localas2.Ew();
      locala2.field_isNew = 1;
      locala2.field_contentFromUsername = localas2.aJQ();
      locala2.field_contentNickname = localas2.iV();
      locala2.field_contentPhoneNumMD5 = localas2.aJS();
      locala2.field_contentFullPhoneNumMD5 = localas2.aJV();
    }
    while (true)
    {
      locala2.field_lastModifiedTime = System.currentTimeMillis();
      locala2.field_state = 0;
      locala2.field_talker = localf.field_talker;
      locala2.field_encryptTalker = localf.field_encryptTalker;
      locala2.field_fmsgSysRowId = l1;
      locala2.field_fmsgIsSend = localf.field_isSend;
      locala2.field_fmsgType = localf.field_type;
      locala2.field_fmsgContent = localf.field_msgContent;
      int i = localf.field_isSend;
      int j = 0;
      if (i == 0)
        j = localf.field_type;
      locala2.field_recvFmsgType = j;
      l.AF().b(locala2);
      am.o(this.dFo);
      am.b(this.dFo, 500L);
      return;
      if (localf.field_isSend == 0)
      {
        av localav = av.zp(localf.field_msgContent);
        locala2.field_displayName = localav.getDisplayName();
        locala2.field_addScene = localav.Ew();
        locala2.field_isNew = 1;
        locala2.field_contentFromUsername = localav.aJQ();
        locala2.field_contentNickname = localav.iV();
        locala2.field_contentVerifyContent = localav.getContent();
      }
    }
    label535: z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "onNotifyChange, fmessage conversation has existed, talker = " + localf.field_talker);
    if (localf.field_isSend == 0)
      locala1.field_isNew = 1;
    locala1.field_lastModifiedTime = System.currentTimeMillis();
    locala1.field_encryptTalker = localf.field_encryptTalker;
    locala1.field_fmsgSysRowId = l1;
    locala1.field_fmsgIsSend = localf.field_isSend;
    locala1.field_fmsgType = localf.field_type;
    locala1.field_fmsgContent = localf.field_msgContent;
    if (localf.field_isSend == 0)
      locala1.field_recvFmsgType = localf.field_type;
    if (localf.field_type == 0)
    {
      as localas1 = as.zl(localf.field_msgContent);
      locala1.field_contentFromUsername = localas1.aJQ();
      locala1.field_contentNickname = localas1.iV();
      locala1.field_contentPhoneNumMD5 = localas1.aJS();
      locala1.field_contentFullPhoneNumMD5 = localas1.aJV();
    }
    while (true)
    {
      l.AF().a(locala1, new String[0]);
      break;
      if (localf.field_isSend == 0)
        locala1.field_contentVerifyContent = av.zp(localf.field_msgContent).getContent();
    }
  }

  public final int getCount()
  {
    Cursor localCursor = this.dtV.rawQuery("select count(*) from fmessage_conversation", null);
    boolean bool = localCursor.moveToLast();
    int i = 0;
    if (bool)
      i = localCursor.getInt(0);
    localCursor.close();
    z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "getCount = " + i);
    return i;
  }

  public final boolean hC(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "unsetNew fail, talker is null");
      return false;
    }
    a locala = hD(paramString);
    if ((locala == null) || (!paramString.equals(locala.field_talker)))
    {
      z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "unsetNew fail, conversation does not exist, talker = " + paramString);
      return false;
    }
    locala.field_isNew = 0;
    return super.a(locala, new String[0]);
  }

  public final a hD(String paramString)
  {
    a locala;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "get fail, talker is null");
      locala = null;
    }
    do
    {
      return locala;
      locala = new a();
      locala.field_talker = paramString;
    }
    while (super.c(locala, new String[0]));
    z.i("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "get fail, maybe not exist, talker = " + paramString);
    return null;
  }

  public final int hE(String paramString)
  {
    a locala = new a();
    locala.field_state = -1;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "state";
    arrayOfObject[1] = "fmessage_conversation";
    arrayOfObject[2] = "talker";
    arrayOfObject[3] = h.cG(paramString);
    String str = String.format("select %s from %s where %s = %s", arrayOfObject);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locala.b(localCursor);
    }
    localCursor.close();
    return locala.field_state;
  }

  public final a hF(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "get fail, encryptTalker is null");
      return null;
    }
    String str = "select * from fmessage_conversation  where encryptTalker=" + h.cG(paramString);
    Cursor localCursor = this.dtV.rawQuery(str, null);
    int i = localCursor.getCount();
    a locala = null;
    if (i != 0)
    {
      locala = new a();
      localCursor.moveToFirst();
      locala.b(localCursor);
    }
    localCursor.close();
    return locala;
  }

  public final boolean hG(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "deleteByTalker fail, talker is null");
    String str;
    do
    {
      return false;
      str = "delete from fmessage_conversation where talker = '" + ch.iV(paramString) + "'";
    }
    while (!this.dtV.bp("fmessage_conversation", str));
    z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "deleteByTalker success, talker = " + paramString);
    Ba(paramString);
    return true;
  }

  public final boolean q(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
      z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "updateState fail, talker is null");
    a locala;
    do
    {
      return false;
      locala = hD(paramString);
      if (locala == null)
      {
        z.w("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "updateState fail, get fail, talker = " + paramString);
        return false;
      }
      if (paramInt == locala.field_state)
      {
        z.d("!56@/B4Tb64lLpISOYcLaKm7W1MgEqPseCy9QPmiDx7GliPzP4+iO8J0Gw==", "updateState, no need to update");
        return true;
      }
      locala.field_state = paramInt;
      locala.field_lastModifiedTime = System.currentTimeMillis();
    }
    while (!super.a(locala, new String[0]));
    Ba(paramString);
    return true;
  }

  public final Cursor yF()
  {
    return this.dtV.rawQuery("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.b
 * JD-Core Version:    0.6.2
 */