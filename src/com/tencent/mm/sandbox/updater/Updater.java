package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sandbox.a.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.cf;
import com.tencent.mm.ui.base.cr;

public class Updater extends LinearLayout
  implements m
{
  private com.tencent.mm.pluginsdk.z emb;
  private boolean gSZ;
  private int iBm;
  private cr iCo = null;
  private boolean iCp = false;
  private boolean iCq = false;
  private boolean iCr = false;

  public Updater(Context paramContext)
  {
    super(paramContext);
  }

  public Updater(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static Updater a(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if (paramContext == null)
      return null;
    if (((paramContext instanceof Activity)) && ((((Activity)paramContext).isFinishing()) || (((Activity)paramContext).getWindow() == null)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "showWithProgress, context isFinishing");
      return null;
    }
    ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", ch.CL()).commit();
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(34);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "showWithProgress");
    Updater localUpdater = (Updater)View.inflate(paramContext, k.boR, null);
    localUpdater.onStart();
    cr localcr = cr.a(paramContext, paramContext.getString(n.cmU), true, 0, null);
    localcr.setCancelable(true);
    localcr.setOnCancelListener(new ao(paramContext, localUpdater, paramOnCancelListener));
    try
    {
      localUpdater.iCo = localcr;
      localUpdater.iCo.show();
      localUpdater.gSZ = true;
      return localUpdater;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "exception in showWithProgress, ", arrayOfObject);
    }
    return null;
  }

  public static Updater b(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", ch.CL()).commit();
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(34);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "show update dialog");
    Updater localUpdater = (Updater)View.inflate(paramContext, k.boR, null);
    localUpdater.onStart();
    cr localcr = cr.a(paramContext, "", true, 0, null);
    localcr.setCancelable(true);
    localcr.setOnCancelListener(new ap(paramContext, localUpdater, paramOnCancelListener));
    localUpdater.iCo = localcr;
    localUpdater.gSZ = false;
    return localUpdater;
  }

  public static Updater bt(Context paramContext)
  {
    ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", ch.CL()).commit();
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(34);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "updater silence");
    Updater localUpdater = new Updater(paramContext);
    localUpdater.onStart();
    localUpdater.iCq = true;
    return localUpdater;
  }

  public static void bu(Context paramContext)
  {
    paramContext.startActivity(new Intent(paramContext, AppInstallerUI.class));
  }

  private void onStart()
  {
    bg.qX().a(11, this);
    this.emb = g.b(getContext(), null);
  }

  public static void oo(int paramInt)
  {
    if (!bg.oE())
      return;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "reportUpdateStat : opCode = " + paramInt);
    bg.qW().oS().a(new cf(paramInt));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "isShow " + this.gSZ);
      if ((!this.gSZ) && (this.iCo != null))
        this.iCo.show();
      this.iCp = true;
      if (this.iCo != null)
        this.iCo.cancel();
      a locala = (a)paramx;
      bg.qX().d(new ce(new aq(this, locala)));
      return;
    }
    TextView localTextView;
    if (this.iCo != null)
    {
      this.iCo.aSm();
      localTextView = (TextView)this.iCo.findViewById(i.aEu);
      if ((paramInt1 != 4) || (paramInt2 != -18))
        break label166;
      if (localTextView != null)
        localTextView.setText(n.cmY);
    }
    while (true)
    {
      an.aMP();
      cancel();
      return;
      label166: if (localTextView != null)
      {
        localTextView.setText(n.cmP);
        this.emb.c(localTextView);
      }
    }
  }

  public final void cancel()
  {
    bg.qX().b(11, this);
  }

  public final void r(int paramInt, boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJ7QNEsxPPC97dw8tpB2lT1", "begin update routine, type=" + paramInt);
    this.iBm = paramInt;
    this.iCr = paramBoolean;
    a locala = new a(paramInt);
    bg.qX().d(locala);
  }

  public final void update(int paramInt)
  {
    r(paramInt, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.Updater
 * JD-Core Version:    0.6.2
 */