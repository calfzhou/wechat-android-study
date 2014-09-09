package com.tencent.mm.plugin.base.stub;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.a.c;
import com.tencent.mm.am.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ac;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.ui.tools.q;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class WXEntryActivity$EntryReceiver extends BroadcastReceiver
{
  private String appId;
  private String appName;
  private Context context;
  private String ehH;
  private int ehI;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null))
      return;
    a.aCl();
    this.context = paramContext;
    String str1 = paramIntent.getStringExtra("_mmessage_content");
    this.ehI = paramIntent.getIntExtra("_mmessage_sdkVersion", 0);
    if (!WXEntryActivity.fx(this.ehI))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "sdk version is not supported, sdkVersion = " + this.ehI);
      return;
    }
    this.ehH = paramIntent.getStringExtra("_mmessage_appPackage");
    if ((this.ehH == null) || (this.ehH.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "unknown package, ignore");
      return;
    }
    if (!WXEntryActivity.e(paramIntent.getByteArrayExtra("_mmessage_checksum"), WXEntryActivity.d(str1, this.ehI, this.ehH)))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "checksum fail");
      return;
    }
    if (str1 == null)
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "check appid failed, null content");
      return;
    }
    Uri localUri = Uri.parse(str1);
    String str2 = localUri.getAuthority();
    this.appId = localUri.getQueryParameter("appid");
    z.i("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "onReceive, appId = " + this.appId);
    if ((this.appId == null) || (this.appId.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "invalid appid, ignore");
      return;
    }
    if ((!bg.oE()) || (bg.rd()))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.appId;
      z.w("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "not login, just save the appid : %s", arrayOfObject1);
      u.vg(this.appId);
      return;
    }
    if (bg.CD())
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.appId;
      z.w("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "not login accInitializing, just save the appid : %s", arrayOfObject2);
      u.vg(this.appId);
      return;
    }
    k localk2;
    if ("registerapp".equals(str2))
    {
      z.i("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "handle app registeration: " + this.ehH + ", sdkver=" + this.ehI);
      if (!bg.oE())
      {
        z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "no available account");
        return;
      }
      localk2 = l.F(this.appId, true);
      if (!u.b(this.context, localk2, this.ehH))
      {
        z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "reg fail, check app fail");
        bf.aza().uX(this.appId);
        return;
      }
      if ((localk2 != null) && (localk2.avN()))
      {
        ac localac = g.axX();
        if (localac != null)
          localac.f(this.context, this.appId, this.ehH);
      }
    }
    while (true)
    {
      try
      {
        localPackageManager = this.context.getPackageManager();
        localApplicationInfo = localPackageManager.getApplicationInfo(this.ehH, 0);
        if (localApplicationInfo == null)
        {
          z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "package not installed");
          return;
        }
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        PackageManager localPackageManager;
        ApplicationInfo localApplicationInfo;
        z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
        this.appName = localApplicationInfo.loadLabel(localPackageManager).toString();
        Drawable localDrawable = localApplicationInfo.loadIcon(localPackageManager);
        if (!(localDrawable instanceof BitmapDrawable))
          break label1088;
        Bitmap localBitmap3 = ((BitmapDrawable)localDrawable).getBitmap();
        localBitmap2 = localBitmap3;
        localBitmap1 = localBitmap2;
        if (localk2 != null)
        {
          localo = bf.GO();
          str4 = this.appId;
          if ((str4 != null) && (str4.length() != 0))
            continue;
          z.e("!32@/B4Tb64lLpIuLnUbSWxToau2iFFgrLBl", "hasIcon, appId is null");
          bool3 = false;
          if (bool3);
        }
        else
        {
          bf.GO().p(this.appId, localBitmap1);
        }
        if (localk2 == null)
        {
          k localk3 = new k();
          localk3.field_appId = this.appId;
          localk3.field_appName = "";
          localk3.field_packageName = this.ehH;
          localk3.field_status = 0;
          String str3 = u.aj(this.context, this.ehH);
          if (str3 != null)
            localk3.field_signature = str3;
          localk3.field_modifyTime = System.currentTimeMillis();
          boolean bool1 = bf.GO().b(localk3);
          q.wc(this.appId);
          if ((!bool1) || (!ap.jb(localk3.field_openId)))
            break;
          z.d("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "handleAppRegisteration, trigger getAppSetting, appId = " + this.appId);
          bf.azc().vd(this.appId);
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        o localo;
        String str4;
        z.printErrStackTrace("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", localThrowable, "package not installed", new Object[0]);
        Bitmap localBitmap1 = null;
        continue;
        boolean bool3 = c.ac(localo.ac(str4, 1));
        continue;
        if ((localk2.field_status == 2) || (localk2.field_status == 3) || (localk2.field_status == 4))
        {
          if (!localk2.avN())
            q.wc(this.appId);
          localk2.field_status = 0;
          boolean bool2 = bf.GO().a(localk2, new String[0]);
          z.d("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "handleAppRegisteration, updateRet = " + bool2);
        }
      }
      if (!ap.jb(localk2.field_openId))
        break;
      z.d("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "handleAppRegisteration, trigger getAppSetting, appId = " + this.appId);
      bf.azc().vd(this.appId);
      return;
      if (!"unregisterapp".equals(str2))
        break;
      z.d("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "handle app unregisteration: " + this.ehH + ", sdkver=" + this.ehI);
      if (!bg.oE())
      {
        z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "no available account");
        return;
      }
      k localk1 = l.F(this.appId, false);
      if (!u.b(this.context, localk1, this.ehH))
      {
        z.e("!44@/B4Tb64lLpJdjEu5xDey9UG2pFkOWxegY/Q68uMN0RY=", "unreg fail, check app fail");
        return;
      }
      if ((localk1 == null) || (localk1.field_status == 5))
        break;
      localk1.field_status = 4;
      bf.GO().a(localk1, new String[0]);
      q.wd(this.appId);
      return;
      label1088: Bitmap localBitmap2 = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver
 * JD-Core Version:    0.6.2
 */