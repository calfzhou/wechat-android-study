package com.tencent.mm.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.LocationManager;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.booter.cache.CacheService;
import com.tencent.mm.c.a.d;
import com.tencent.mm.c.a.fj;
import com.tencent.mm.c.a.ik;
import com.tencent.mm.c.a.ix;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import java.util.Locale;

public final class MMAppMgr
{
  private static StringBuffer iMD;
  private static long iME;
  private long dDe;
  private String iMF;
  private MMAppMgr.Receiver iMG;
  private boolean iMH = false;
  private boolean iMI = false;
  private final ay iMJ = new ay(new cv(this), true);
  private final ay iMK = new ay(Looper.getMainLooper(), new dc(this), false);

  private static String Bw(String paramString)
  {
    int i = 0;
    for (int j = -1 + paramString.length(); j >= 0; j--)
    {
      if (paramString.charAt(j) == '|')
        i++;
      if (i == 3)
        break;
    }
    return paramString.substring(j + 1);
  }

  public static boolean aCx()
  {
    return (com.tencent.mm.protocal.a.aCx()) && (!ch.ys()) && (Locale.getDefault().equals(Locale.CHINA)) && (x.pN());
  }

  public static void aQb()
  {
    eE(true);
    z.appenderClose();
  }

  public static void aQc()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Thread.currentThread().getName();
    arrayOfObject[1] = Integer.valueOf(Process.myPid());
    arrayOfObject[2] = ap.DJ();
    z.w("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "killProcess thread:%s proc:%d stack:%s", arrayOfObject);
    Context localContext = com.tencent.mm.sdk.platformtools.ak.getContext();
    if (localContext != null)
    {
      localContext.stopService(new Intent(localContext, CoreService.class));
      localContext.stopService(new Intent(localContext, NotifyReceiver.NotifyService.class));
      localContext.stopService(new Intent(localContext, CacheService.class));
      localContext.stopService(new Intent().setClassName(localContext, "com.tencent.mm.plugin.exdevice.service.ExDeviceService"));
    }
    com.tencent.mm.c.a.l locall = new com.tencent.mm.c.a.l();
    com.tencent.mm.sdk.c.a.aGB().g(locall);
    fj localfj = new fj();
    localfj.cKH.status = 0;
    localfj.cKH.cKI = 2;
    com.tencent.mm.sdk.c.a.aGB().g(localfj);
    eE(true);
    bg.ef(ap.DJ().toString());
    bg.release();
    z.appenderClose();
    Process.killProcess(Process.myPid());
  }

  public static boolean b(Context paramContext, int paramInt, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    View localView = View.inflate(paramContext, k.bkp, null);
    CheckBox localCheckBox = (CheckBox)localView.findViewById(i.aFX);
    localCheckBox.setText(paramContext.getString(com.tencent.mm.n.bUh));
    localCheckBox.setOnCheckedChangeListener(new cz());
    localView.findViewById(i.aFZ).setVisibility(8);
    TextView localTextView = (TextView)localView.findViewById(i.aFY);
    int i;
    switch (paramInt)
    {
    case 2:
    default:
      localTextView.setText(com.tencent.mm.n.bUn);
      i = 1;
    case 3:
    case 1:
    }
    while (i != 0)
    {
      ad localad = new ad(paramContext);
      localad.pn(com.tencent.mm.n.buo);
      localad.eN(false);
      localad.ao(localView);
      localad.d(com.tencent.mm.n.bUk, paramOnClickListener1);
      localad.e(com.tencent.mm.n.bUh, paramOnClickListener2);
      localad.aRB().show();
      return true;
      localTextView.setText(com.tencent.mm.n.bUn);
      i = 0;
      continue;
      localTextView.setText(com.tencent.mm.n.bUg);
      i = 1;
    }
    return false;
  }

  public static void cb(String paramString)
  {
    bg.ig().cb(paramString);
  }

  private static void eE(boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new StringBuffer(800);
    if (iMD == null)
    {
      iMD = localStringBuffer;
      iME = ap.CL();
      return;
    }
    String str = iMD.toString();
    localStringBuffer.append(Bw(str));
    iMD = localStringBuffer;
    z.i("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "oreh report clickstream %s", new Object[] { str });
    com.tencent.mm.plugin.f.c.n.fTF.a(paramBoolean, 10508, "1," + iME + "," + str);
    iME = ap.CL();
  }

  public static void f(Activity paramActivity)
  {
    SharedPreferences localSharedPreferences = paramActivity.getSharedPreferences(com.tencent.mm.sdk.platformtools.ak.aHi(), 0);
    boolean bool = localSharedPreferences.getBoolean("gprs_alert", true);
    com.tencent.mm.sdk.platformtools.l.iDt = bool & com.tencent.mm.sdk.platformtools.l.iDt;
    aa localaa;
    if (bool)
    {
      View localView = View.inflate(paramActivity, k.bgx, null);
      CheckBox localCheckBox = (CheckBox)localView.findViewById(i.awO);
      localaa = com.tencent.mm.ui.base.e.a(paramActivity, false, null, localView, paramActivity.getString(com.tencent.mm.n.bAQ), paramActivity.getString(com.tencent.mm.n.bRb), new cw(localCheckBox, localSharedPreferences), new cx(paramActivity));
      if (localaa != null);
    }
    else
    {
      return;
    }
    localaa.setOnCancelListener(new cy(paramActivity));
  }

  public static void f(Activity paramActivity, int paramInt)
  {
    if (!aCx());
    while (!as.AO("show_whatsnew"))
      return;
    try
    {
      if (!bg.oE())
      {
        z.e("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "showWhatsNewForResult, hasSetUin fail");
        return;
      }
    }
    catch (Exception localException)
    {
      z.w("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", localException.toString());
      return;
    }
    Intent localIntent = new Intent();
    if (paramInt != 57005)
    {
      com.tencent.mm.am.a.a(paramActivity, "whatsnew", ".ui.WhatsNewUI", localIntent, paramInt);
      return;
    }
    com.tencent.mm.am.a.b(paramActivity, "whatsnew", ".ui.WhatsNewUI", localIntent);
  }

  public static void hY()
  {
    bg.ig().hY();
  }

  public static void i(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ak.aHi(), 0);
    if (!localSharedPreferences.getBoolean("Main_ShortCut", false))
    {
      com.tencent.mm.ui.base.e.a(paramContext, com.tencent.mm.n.bQT, com.tencent.mm.n.buo, new dk(paramContext), null);
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putBoolean("Main_ShortCut", true);
      localEditor.commit();
    }
  }

  public static aa j(Context paramContext)
  {
    if ((((LocationManager)paramContext.getSystemService("location")).isProviderEnabled("gps")) && (bc.bP(paramContext)))
      return null;
    Boolean localBoolean = (Boolean)bg.qW().oQ().get(4105, Boolean.valueOf(false));
    if ((localBoolean != null) && (localBoolean.booleanValue()))
      return null;
    View localView = View.inflate(paramContext, k.bgY, null);
    ((CheckBox)localView.findViewById(i.azR)).setOnCheckedChangeListener(new da());
    db localdb = new db(paramContext);
    ad localad = new ad(paramContext);
    localad.pn(com.tencent.mm.n.bTT);
    localad.ao(localView);
    localad.d(com.tencent.mm.n.buj, localdb);
    localad.e(com.tencent.mm.n.btE, null);
    aa localaa = localad.aRB();
    localaa.show();
    return localaa;
  }

  public static void o(Context paramContext)
  {
    z.appenderFlush();
    MMNativeJpeg.Destroy();
    com.tencent.mm.booter.ak.lA();
    Intent localIntent = new Intent().setClass(paramContext, LauncherUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("absolutely_exit", true);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public final void Y(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ac.sD();
      ik localik = new ik();
      localik.cMR.state = 1;
      com.tencent.mm.sdk.c.a.aGB().g(localik);
      d locald = new d();
      locald.cHi.cHj = true;
      com.tencent.mm.sdk.c.a.aGB().g(locald);
      ix localix = new ix();
      localix.cNj.Db = true;
      com.tencent.mm.sdk.c.a.aGB().g(localix);
    }
    this.iMH = paramBoolean;
    this.iMK.cP(800L);
  }

  public final void ch(Context paramContext)
  {
    if (this.iMG == null)
      this.iMG = new MMAppMgr.Receiver(this);
    MMActivity.aPJ();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.ui.ACTION_ACTIVE");
    localIntentFilter.addAction("com.tencent.mm.ui.ACTION_DEACTIVE");
    localIntentFilter.addAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
    localIntentFilter.addAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
    paramContext.registerReceiver(this.iMG, localIntentFilter, "com.tencent.mm.permission.MM_MESSAGE", null);
  }

  public final void ci(Context paramContext)
  {
    if (this.iMG != null)
      paramContext.unregisterReceiver(this.iMG);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr
 * JD-Core Version:    0.6.2
 */