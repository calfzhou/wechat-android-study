package com.tencent.mm.booter.notification;

import android.content.Intent;
import android.text.format.Time;
import com.tencent.mm.c.a.fd;
import com.tencent.mm.c.a.ff;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

public final class c
{
  private a djd = new a();

  public static c lE()
  {
    return d.lF();
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, int paramInt, String paramString2, String paramString3, Intent paramIntent, boolean paramBoolean3)
  {
    this.djd.a(paramBoolean1, paramBoolean2, paramString1, paramInt, paramString2, paramString3, paramIntent, paramBoolean3);
  }

  public final boolean a(String paramString, ar paramar, int paramInt)
  {
    if (ch.jb(paramString))
      return false;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "preNotificationCheck, talker: %s, tipsFlag: %s ", arrayOfObject1);
    if (!bg.oE())
    {
      Object[] arrayOfObject7 = new Object[2];
      arrayOfObject7[0] = paramString;
      arrayOfObject7[1] = Integer.valueOf(paramInt);
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[FALSE](MMCore.accHasReady())preNotificationCheck, talker: %s, tipsFlag: %s ", arrayOfObject7);
      return false;
    }
    if ((paramInt & 0x1) == 0)
    {
      Object[] arrayOfObject6 = new Object[2];
      arrayOfObject6[0] = paramString;
      arrayOfObject6[1] = Integer.valueOf(paramInt);
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[FALSE](tipsFlag & ConstantsProtocal.TEXT_NOTIFY_SVR_FLAG) == 0)preNotificationCheck, talker: %s, tipsFlag: %s ", arrayOfObject6);
      return false;
    }
    Time localTime = new Time();
    boolean bool = x.pX();
    int i = x.qf();
    int j = x.qg();
    localTime.setToNow();
    if ((y.dQ(paramString)) && (bool) && (ch.o(localTime.hour, i, j)))
    {
      Object[] arrayOfObject5 = new Object[5];
      arrayOfObject5[0] = paramString;
      arrayOfObject5[1] = Integer.valueOf(paramInt);
      arrayOfObject5[2] = Integer.valueOf(localTime.hour);
      arrayOfObject5[3] = Integer.valueOf(i);
      arrayOfObject5[4] = Integer.valueOf(j);
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[NO NOTIFICATION](ContactStorageLogic.isPlugs(talker) && plugDisturbNotify && Util.isNightTime(time.hour, startTime, endTime))preNotificationCheck, talker: %s, tipsFlag: %s time.hour: %d, startTime: %d, endTime: %d", arrayOfObject5);
      return false;
    }
    if ((bg.qW().oJ()) && (!x.CE()))
    {
      Object[] arrayOfObject4 = new Object[4];
      arrayOfObject4[0] = paramString;
      arrayOfObject4[1] = Integer.valueOf(paramInt);
      arrayOfObject4[2] = Boolean.valueOf(bg.qW().oJ());
      arrayOfObject4[3] = Boolean.valueOf(x.CE());
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck, talker: %s, tipsFlag: %s isWebWXOnline: %B,isWebWXNotificationOpen: %B ", arrayOfObject4);
      return false;
    }
    if (y.dd(paramString))
    {
      fd localfd1 = new fd();
      localfd1.cKu.cKw = 3;
      com.tencent.mm.sdk.c.a.aGB().g(localfd1);
      if (!localfd1.cKv.cCM)
      {
        fd localfd2 = new fd();
        localfd2.cKu.cKw = 1;
        localfd2.cKu.cKx = paramString;
        localfd2.cKu.cKy = 3;
        com.tencent.mm.sdk.c.a.aGB().g(localfd2);
      }
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramString;
      arrayOfObject2[1] = Integer.valueOf(paramInt);
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[NO NOTIFICATION](ContactStorageLogic.isLbsRoom(talker))preNotificationCheck, talker: %s, tipsFlag: %s ", arrayOfObject2);
      return false;
    }
    if ((y.dU(paramString)) || ((y.dc(paramString)) && (!y.dT(paramString)) && (!paramar.zk(x.pG()))))
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = paramString;
      arrayOfObject3[1] = Integer.valueOf(paramInt);
      z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "[NO NOTIFICATION](ContactStorageLogic.isMuteContact(talker) || (ContactStorageLogic.isChatRoom(talker) && !ContactStorageLogic.isChatRoomNotify(talker) && !msgInfo.isAtSomeone(ConfigStorageLogic.getUsernameFromUserInfo())))preNotificationCheck, talker: %s, tipsFlag: %s ", arrayOfObject3);
      return false;
    }
    return true;
  }

  public final boolean b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    return this.djd.a(paramString1, paramString2, paramBoolean1, paramBoolean2);
  }

  public final void cancel()
  {
    this.djd.cancel();
  }

  public final void ci(String paramString)
  {
    if (paramString != null)
    {
      b localb = com.tencent.mm.booter.notification.a.f.lL().cn(paramString);
      if (localb != null)
      {
        z.d("!44@/B4Tb64lLpKR3MWtFvfaIO9VjdH9q7JYDEFwdMnORTc=", "cancel : %s", new Object[] { paramString });
        localb.cancel();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.c
 * JD-Core Version:    0.6.2
 */