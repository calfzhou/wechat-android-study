package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sandbox.monitor.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;

final class s
  implements DialogInterface.OnClickListener
{
  s(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "getBtn (ok button) is click");
    if (AppUpdaterUI.e(this.iBB).eZP == 1)
      an.u(this.iBB, 6);
    if (!m.getExternalStorageState().equals("mounted"))
    {
      z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "no sdcard.");
      AppUpdaterUI.b(this.iBB).dismiss();
      AppUpdaterUI.c(this.iBB);
      return;
    }
    if ((0x1 & AppUpdaterUI.e(this.iBB).cFr) != 0)
    {
      z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "package has set external update mode");
      Uri localUri = Uri.parse(AppUpdaterUI.e(this.iBB).cFv);
      Intent localIntent2 = new Intent("android.intent.action.VIEW", localUri).addFlags(268435456);
      if ((localUri == null) || (localIntent2 == null) || (!ch.i(this.iBB, localIntent2)))
      {
        z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "parse market uri failed, jump to weixin.qq.com");
        Intent localIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456);
        this.iBB.startActivity(localIntent3);
      }
      while (true)
      {
        AppUpdaterUI.f(this.iBB);
        return;
        z.i("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "parse market uri ok");
        this.iBB.startActivity(localIntent2);
      }
    }
    String str = g.AB(AppUpdaterUI.e(this.iBB).cHL);
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", str);
    if (str != null)
    {
      z.i("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "update package already exist.");
      AppUpdaterUI.a(this.iBB, 8);
      if (AppUpdaterUI.e(this.iBB).iCC)
        AppUpdaterUI.a(this.iBB, 0);
      while (true)
      {
        AppUpdaterUI.e(this.iBB).s(1, true);
        AppUpdaterUI.h(this.iBB).AC(str);
        return;
        AppUpdaterUI.a(this.iBB, 9);
      }
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(AppUpdaterUI.e(this.iBB).eZP);
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "current downloadMode : %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(AppUpdaterUI.e(this.iBB).iBm);
    z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "current updateType : %s", arrayOfObject2);
    if (AppUpdaterUI.e(this.iBB).eZP == 0)
    {
      AppUpdaterUI.e(this.iBB).Oj();
      return;
    }
    if (AppUpdaterUI.e(this.iBB).eZP == 1)
    {
      z.d("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "gonna start UpdaterService");
      AppUpdaterUI.f(this.iBB);
      Intent localIntent1 = new Intent(this.iBB.getIntent());
      localIntent1.setClass(this.iBB, UpdaterService.class);
      localIntent1.putExtra("intent_extra_run_in_foreground", true);
      this.iBB.startService(localIntent1);
      return;
    }
    z.e("!32@/B4Tb64lLpIxb8wjt/YBovT6oqBe5bV/", "silence download never go here!");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.s
 * JD-Core Version:    0.6.2
 */