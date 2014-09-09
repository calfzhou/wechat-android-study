package com.tencent.mm.plugin.accountsync.model;

import android.accounts.Account;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.jg.JgClassChecked;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.an;
import com.tencent.mm.modelfriend.au;
import com.tencent.mm.modelsimple.c;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class ContactsSyncService extends Service
  implements m
{
  private static Account dCa;
  private f dWG = null;
  private Looper dWH;

  public ContactsSyncService()
  {
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "ContactsSyncService construction");
  }

  private void DO()
  {
    if (this.dWH != null)
      this.dWH.quit();
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramx.getType());
    if (paramx.getType() == 133)
    {
      bg.qX().b(133, this);
      z.i("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "uploadcontact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      l1 = ((Long)bg.qW().oQ().get(327728, Long.valueOf(0L))).longValue();
      l2 = System.currentTimeMillis();
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "getMFriend : curTime=" + l2 + ", lastTime=" + l1);
      if ((paramInt2 != 0) && (l2 - l1 < 86400000L))
      {
        DO();
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "uploadmcontact list null, do not do getmfriend.");
      }
    }
    while (paramx.getType() != 32)
    {
      long l1;
      long l2;
      return;
      bg.qW().oQ().set(327728, Long.valueOf(l2));
      bg.qX().a(32, this);
      au localau = (au)paramx;
      an localan = new an(localau.wE(), localau.wF());
      bg.qX().d(localan);
    }
    bg.qX().b(32, this);
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "getmfriend onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      new c(this, dCa).start();
    DO();
  }

  public IBinder onBind(Intent paramIntent)
  {
    if (this.dWG == null)
      this.dWG = new f(this, getApplicationContext());
    return this.dWG.getSyncAdapterBinder();
  }

  public void onDestroy()
  {
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "contacts sync service destory");
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.model.ContactsSyncService
 * JD-Core Version:    0.6.2
 */