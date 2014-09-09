package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.cf;

@Deprecated
public abstract interface d
{
  public abstract aa a(Runnable paramRunnable, MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent);

  public abstract void a(Activity paramActivity, Intent paramIntent, int paramInt);

  public abstract void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt);

  public abstract void a(Context paramContext, Intent paramIntent1, Intent paramIntent2);

  public abstract void a(Intent paramIntent, int paramInt, Activity paramActivity);

  public abstract void a(Intent paramIntent, int paramInt, MMActivity paramMMActivity);

  public abstract void a(Intent paramIntent1, int paramInt, MMActivity paramMMActivity, Intent paramIntent2);

  public abstract void a(Intent paramIntent, int paramInt, cf paramcf, MMActivity paramMMActivity);

  public abstract void a(Intent paramIntent, Activity paramActivity);

  public abstract void a(Intent paramIntent, Activity paramActivity, int paramInt);

  public abstract void a(Intent paramIntent, Context paramContext);

  public abstract void a(MMActivity paramMMActivity, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3);

  public abstract void a(MMWizardActivity paramMMWizardActivity, Intent paramIntent);

  public abstract void a(boolean paramBoolean1, boolean paramBoolean2, Context paramContext, String paramString, int paramInt1, int paramInt2);

  public abstract void b(Context paramContext, Intent paramIntent);

  public abstract void b(Intent paramIntent, Activity paramActivity);

  public abstract void b(Intent paramIntent, Activity paramActivity, int paramInt);

  public abstract void b(Intent paramIntent, Context paramContext);

  public abstract void b(Intent paramIntent, cf paramcf, MMActivity paramMMActivity);

  public abstract void b(MMWizardActivity paramMMWizardActivity, Intent paramIntent);

  public abstract void b(String paramString, Context paramContext);

  public abstract void b(String paramString1, String paramString2, String paramString3);

  public abstract void c(Context paramContext, Intent paramIntent);

  public abstract void c(Intent paramIntent, Context paramContext);

  public abstract void cb(String paramString);

  public abstract void d(Context paramContext, Intent paramIntent);

  public abstract void d(Intent paramIntent, Context paramContext);

  public abstract void e(Context paramContext, Intent paramIntent);

  public abstract void e(Intent paramIntent, Context paramContext);

  public abstract void f(Context paramContext, Intent paramIntent);

  public abstract void f(Intent paramIntent, Context paramContext);

  public abstract boolean f(Context paramContext, String paramString);

  public abstract void g(Context paramContext, Intent paramIntent);

  public abstract void g(Intent paramIntent, Context paramContext);

  public abstract boolean g(Context paramContext, String paramString);

  public abstract void h(Intent paramIntent, Context paramContext);

  public abstract void hY();

  public abstract void i(Intent paramIntent, Context paramContext);

  public abstract aa j(Context paramContext);

  public abstract void j(Intent paramIntent, Context paramContext);

  public abstract Intent k(Context paramContext);

  public abstract void k(Intent paramIntent, Context paramContext);

  public abstract void l(Context paramContext);

  public abstract void l(Intent paramIntent, Context paramContext);

  public abstract void m(Context paramContext);

  public abstract void m(Intent paramIntent, Context paramContext);

  public abstract void n(Intent paramIntent, Context paramContext);

  public abstract void o(Intent paramIntent, Context paramContext);

  public abstract void p(Intent paramIntent, Context paramContext);

  public abstract void q(Intent paramIntent, Context paramContext);

  public abstract void r(Intent paramIntent, Context paramContext);

  public abstract void s(Intent paramIntent, Context paramContext);

  public abstract void t(Intent paramIntent, Context paramContext);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.d
 * JD-Core Version:    0.6.2
 */