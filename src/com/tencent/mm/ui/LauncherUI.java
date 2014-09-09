package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.d;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.app.MMApplication;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.app.ah;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.c.a.mz;
import com.tencent.mm.c.a.p;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.k;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ce;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.protocal.a.pz;
import com.tencent.mm.sandbox.updater.Updater;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.account.LoginHistoryUI;
import com.tencent.mm.ui.account.WelcomeSelectView;
import com.tencent.mm.ui.account.WelcomeView;
import com.tencent.mm.ui.account.bind.BindMobileUI;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.base.fn;
import com.tencent.mm.ui.chatting.hd;
import com.tencent.mm.ui.contact.VoipAddressUI;
import com.tencent.mm.ui.pluginapp.t;
import com.tencent.mm.ui.tools.TestTimeForChatting;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@TargetApi(11)
public class LauncherUI extends MMFragmentActivity
  implements ah, com.tencent.mm.sdk.f.as
{
  public static long iJC;
  private static ArrayList iJn = new ArrayList();
  private static boolean iJo = true;
  private static HashMap iKh;
  private boolean cGC;
  private final HashMap dhJ = new HashMap();
  private Intent ehJ = null;
  private View epk;
  private LayoutInflater fpT;
  private final long gLm = 300L;
  private long gLn = SystemClock.elapsedRealtime();
  private String grh = null;
  private ActionBar hF;
  private ed iJA;
  private boolean iJB = true;
  private Runnable iJD = new bh(this);
  private Runnable iJE = new bi(this);
  private View iJF;
  private ImageView iJG;
  private View iJH;
  private bp iJI = new bp(this, (byte)0);
  private int iJJ = 0;
  private int iJK = -1;
  private com.tencent.mm.o.m iJL = null;
  private VoiceSearchLayout iJM;
  private com.tencent.mm.sdk.c.g iJN = new bn(this);
  private com.tencent.mm.k.c iJO = new am(this);
  private com.tencent.mm.sdk.f.as iJP = new ao(this);
  private com.tencent.mm.sdk.c.g iJQ = new ap(this);
  private String iJR;
  MessageQueue.IdleHandler iJS = new aq(this);
  com.tencent.mm.sdk.c.g iJT = new au(this);
  private int iJU = -1;
  private int iJV = -1;
  private hd iJW;
  private TestTimeForChatting iJX;
  private OnLayoutChangedLinearLayout iJY;
  private fn iJZ = new av(this);
  private boolean iJk;
  private boolean iJl;
  private boolean iJm = true;
  private boolean iJp;
  private boolean iJq;
  private boolean iJr;
  private boolean iJs;
  private HashSet iJt = new HashSet();
  private WelcomeView iJu = null;
  private boolean iJv = false;
  private boolean iJw = false;
  private e iJx;
  private CustomViewPager iJy;
  private br iJz;
  String iKa;
  Bundle iKb;
  Runnable iKc = new ay(this);
  private Animation iKd;
  private Animation iKe;
  private LinkedList iKf = new LinkedList();
  private d iKg = new bc(this);
  private HashMap iKi = new HashMap();

  static
  {
    HashMap localHashMap = new HashMap();
    iKh = localHashMap;
    localHashMap.put("tab_main", Integer.valueOf(0));
    iKh.put("tab_address", Integer.valueOf(1));
    iKh.put("tab_find_friend", Integer.valueOf(2));
    iKh.put("tab_settings", Integer.valueOf(3));
  }

  private void KS()
  {
    String str1 = getString(com.tencent.mm.n.age);
    if (com.tencent.mm.protocal.a.hrq)
    {
      String str3 = com.tencent.mm.sdk.platformtools.y.aGW();
      if ((str3.equalsIgnoreCase("zh_CN")) || (str3.equalsIgnoreCase("zh_TW")))
        str1 = str1 + getString(com.tencent.mm.n.bsA);
    }
    else
    {
      if ((this.iJx == null) || (this.iJx.aOq() <= 0))
        break label185;
    }
    label185: for (String str2 = str1 + "(" + this.iJx.aOq() + ")"; ; str2 = str1)
    {
      TextView localTextView = (TextView)this.hF.getCustomView().findViewById(16908308);
      if (localTextView != null)
        localTextView.setText(str2);
      return;
      str1 = str1 + " " + getString(com.tencent.mm.n.bsA);
      break;
    }
  }

  private void aOj()
  {
    moveTaskToBack(true);
    com.tencent.mm.app.l.id().start();
  }

  private void aPa()
  {
    if (this.iJq)
    {
      this.iJq = false;
      Bs("tab_main");
    }
  }

  private void aPc()
  {
    if (this.cGC)
      return;
    NotifyReceiver.lw();
    this.ehJ = getIntent();
    this.cGC = true;
  }

  private boolean aPf()
  {
    if ((this.ehJ != null) && (this.ehJ.getBooleanExtra("absolutely_exit", false)))
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launcherOnResume exit absolutely!!!");
      finish();
      com.tencent.mm.plugin.f.c.n.fTF.jw(8);
      MMAppMgr.aQc();
      return true;
    }
    if ((this.ehJ != null) && (this.ehJ.getBooleanExtra("can_finish", false)))
    {
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "exit obviously");
      com.tencent.mm.model.bg.qX().W(true);
      if (getApplicationContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.g.m.nN()).getBoolean("settings_fully_exit", true))
      {
        Context localContext = getApplicationContext();
        localContext.stopService(new Intent(localContext, CoreService.class));
      }
      com.tencent.mm.plugin.f.c.n.fTF.jw(8);
      sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_FORCE_DEACTIVE"), "com.tencent.mm.permission.MM_MESSAGE");
      finish();
      return true;
    }
    return false;
  }

  private void aPi()
  {
    int i = iJn.indexOf(this);
    if (i >= 0)
      iJn.remove(i);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask delteInstance index %d", arrayOfObject);
  }

  private void aPj()
  {
    if ((this.iJA == null) || (!com.tencent.mm.model.bg.oE()))
      return;
    if (this.iJA.isShowing())
    {
      this.iJA.dismiss();
      return;
    }
    this.iJA.ck();
  }

  private void aPk()
  {
    if (!com.tencent.mm.model.bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "want update more menu new tips, but mmcore not ready");
      return;
    }
    boolean bool1 = com.tencent.mm.k.i.Ck().t(262148, 266241);
    boolean bool2 = com.tencent.mm.k.i.Ck().u(262148, 266241);
    boolean bool3 = com.tencent.mm.k.i.Ck().t(262145, 266241);
    boolean bool4 = com.tencent.mm.k.i.Ck().t(262147, 266241);
    boolean bool5 = com.tencent.mm.k.i.Ck().t(262149, 266241);
    boolean bool6 = com.tencent.mm.k.i.Ck().u(262152, 266256);
    boolean bool7 = com.tencent.mm.k.i.Ck().t(262152, 266256);
    Integer localInteger = (Integer)com.tencent.mm.model.bg.qW().oQ().get(282883);
    int i;
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      i = 1;
      if ((i == 0) || ((!bool6) && (!bool7)))
        break label207;
    }
    label207: for (int j = 1; ; j = 0)
    {
      if ((!bool2) && (!bool1) && (!bool3) && (!bool4) && (!bool5) && (j == 0))
        break label213;
      this.iJx.es(true);
      return;
      i = 0;
      break;
    }
    label213: this.iJx.es(false);
  }

  private void aPl()
  {
    this.iJk = true;
    long l1 = System.currentTimeMillis();
    com.tencent.mm.n.ac.sD();
    if (aPf())
      return;
    System.currentTimeMillis();
    String str1 = com.tencent.mm.model.bf.dkH.z("login_user_name", "");
    if (((com.tencent.mm.model.bg.ra()) || (!str1.equals(""))) && (!com.tencent.mm.model.bg.oE()))
      com.tencent.mm.model.bg.rb();
    long l2 = System.currentTimeMillis();
    this.iJw = getIntent().getBooleanExtra("LauncherUI.enter_from_reg", false);
    SharedPreferences localSharedPreferences = getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.g.m.nN());
    String str3;
    boolean bool2;
    label393: long l3;
    long l4;
    if ((this.ehJ != null) && (!this.ehJ.getBooleanExtra("Intro_Switch", false)) && (com.tencent.mm.model.bg.ra()) && (!com.tencent.mm.model.bg.rd()))
    {
      if (("pushcontent_notification".equals(getIntent().getStringExtra("nofification_type"))) && (!com.tencent.mm.platformtools.ap.jb(getIntent().getStringExtra("Main_FromUserName"))))
      {
        String str4 = getIntent().getStringExtra("Main_FromUserName");
        int j = getIntent().getIntExtra("MainUI_User_Last_Msg_Type", 0);
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launch report, fromUserName = %s, msgType = %d" + str4 + j);
        com.tencent.mm.plugin.f.c.n localn3 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject5 = new Object[3];
        arrayOfObject5[0] = Integer.valueOf(j);
        arrayOfObject5[1] = str4;
        arrayOfObject5[2] = Integer.valueOf(0);
        localn3.d(10856, arrayOfObject5);
      }
      str3 = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
      if (str3 != null)
      {
        if (str3.equals("launch_type_voip"))
        {
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launch, LaunchTypeVOIP");
          startActivity(new Intent(this, VoipAddressUI.class).putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip"));
          com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = Integer.valueOf(2);
          arrayOfObject4[1] = Integer.valueOf(0);
          localn2.d(11034, arrayOfObject4);
        }
      }
      else
      {
        bool2 = getIntent().getBooleanExtra("LauncherUI.From.Biz.Shortcut", false);
        if (!bool2)
          break label956;
        this.grh = getIntent().getStringExtra("LauncherUI.Shortcut.Username");
        if (bool2)
        {
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launch, fromBizShortcut, bizUsername = " + this.grh);
          if (!com.tencent.mm.platformtools.ap.jb(this.grh))
          {
            this.grh = com.tencent.mm.plugin.base.a.a.ko(this.grh);
            if (!com.tencent.mm.platformtools.ap.jb(this.grh))
            {
              if (com.tencent.mm.model.y.di(this.grh))
              {
                com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launch, username is contact, go to chattingui");
                LauncherUI localLauncherUI = aPm();
                if (localLauncherUI != null)
                  localLauncherUI.b(this.grh, null);
              }
              getIntent().putExtra("LauncherUI_From_Biz_Shortcut", false);
              getIntent().putExtra("LauncherUI.From.Biz.Shortcut", false);
              this.grh = null;
            }
          }
        }
        com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "[Launching Application]");
        localSharedPreferences.edit().putBoolean("settings_fully_exit", false).commit();
        l3 = System.currentTimeMillis();
        this.iJm = true;
        if (this.iJp)
          break label2094;
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on main tab create");
        if (!com.tencent.mm.sdk.platformtools.as.AR("show_whatsnew"))
        {
          Intent localIntent2 = new Intent();
          localIntent2.setComponent(new ComponentName(j.ims, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
          localIntent2.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
          sendBroadcast(localIntent2);
        }
        l4 = System.currentTimeMillis();
        if (com.tencent.mm.model.bg.oE())
          break label983;
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "mmcore has not ready, finish launcherui");
        finish();
      }
    }
    while (true)
    {
      aPa();
      aPn();
      this.iJp = true;
      label672: aj localaj = (aj)oI(this.iJJ);
      if (localaj != null)
        localaj.aOn();
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN dispatch resume " + (System.currentTimeMillis() - l3));
      com.tencent.mm.n.c.a(x.pG(), false, -1);
      this.iJq = false;
      label739: com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN LaucherUI lauch last : " + (System.currentTimeMillis() - l2));
      int i = getIntent().getIntExtra("preferred_tab", 0);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN onNewIntent, tabIdx = %d", arrayOfObject2);
      if (i != 0)
      {
        oH(i);
        getIntent().putExtra("preferred_tab", 0);
      }
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN onresume " + (System.currentTimeMillis() - l1) + "instance : " + iJn.size());
      return;
      if (!str3.equals("launch_type_voip_audio"))
        break;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launch, LaunchTypeVOIPAudio");
      startActivity(new Intent(this, VoipAddressUI.class).putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio"));
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(2);
      arrayOfObject3[1] = Integer.valueOf(1);
      localn1.d(11034, arrayOfObject3);
      break;
      label956: bool2 = getIntent().getBooleanExtra("LauncherUI_From_Biz_Shortcut", false);
      this.grh = getIntent().getAction();
      break label393;
      label983: if (com.tencent.mm.platformtools.ap.DH())
        en.cq(this);
      long l5 = System.currentTimeMillis();
      MMActivity.cg(this);
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("qqmail", getString(com.tencent.mm.n.bOk));
      localHashMap1.put("fmessage", getString(com.tencent.mm.n.bNE));
      localHashMap1.put("qmessage", getString(com.tencent.mm.n.bOg));
      localHashMap1.put("qqsync", getString(com.tencent.mm.n.bOp));
      localHashMap1.put("floatbottle", getString(com.tencent.mm.n.bNs));
      localHashMap1.put("lbsapp", getString(com.tencent.mm.n.bNN));
      localHashMap1.put("shakeapp", getString(com.tencent.mm.n.bOy));
      localHashMap1.put("medianote", getString(com.tencent.mm.n.bNW));
      localHashMap1.put("qqfriend", getString(com.tencent.mm.n.bOh));
      localHashMap1.put("newsapp", getString(com.tencent.mm.n.bOs));
      localHashMap1.put("facebookapp", getString(com.tencent.mm.n.bNy));
      localHashMap1.put("masssendapp", getString(com.tencent.mm.n.bNT));
      localHashMap1.put("meishiapp", getString(com.tencent.mm.n.bNZ));
      localHashMap1.put("feedsapp", getString(com.tencent.mm.n.bNB));
      localHashMap1.put("voipapp", getString(com.tencent.mm.n.bOH));
      localHashMap1.put("weixin", getString(com.tencent.mm.n.bUE));
      localHashMap1.put("filehelper", getString(com.tencent.mm.n.bNr));
      localHashMap1.put("cardpackage", getString(com.tencent.mm.n.bNv));
      localHashMap1.put("officialaccounts", getString(com.tencent.mm.n.bOd));
      localHashMap1.put("voicevoipapp", getString(com.tencent.mm.n.bOK));
      localHashMap1.put("helper_entry", getString(com.tencent.mm.n.bNK));
      localHashMap1.put("voiceinputapp", getString(com.tencent.mm.n.bOE));
      localHashMap1.put("linkedinplugin", getString(com.tencent.mm.n.bNQ));
      localHashMap1.put("googlecontact", getString(com.tencent.mm.n.bNH));
      com.tencent.mm.g.a.b(localHashMap1);
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put("weixin", getString(com.tencent.mm.n.bUD));
      com.tencent.mm.g.a.c(localHashMap2);
      try
      {
        HashSet localHashSet = new HashSet();
        String[] arrayOfString = getString(com.tencent.mm.n.bDK).split(";");
        localHashSet.add(arrayOfString[0]);
        localHashSet.add(arrayOfString[1]);
        com.tencent.mm.model.y.a(localHashSet);
        label1534: com.tencent.mm.pluginsdk.g.axR().MF();
        com.tencent.mm.sdk.c.a.aGB().g(new com.tencent.mm.c.a.ac());
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN MainTabUI onCreate initLanguage: " + (System.currentTimeMillis() - l5));
        this.fpT = ((LayoutInflater)getSystemService("layout_inflater"));
        if (this.iJu != null)
          this.iJu = null;
        long l6 = System.currentTimeMillis();
        this.epk = this.fpT.inflate(k.bhv, null);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN MainTabUI onCreate inflater.inflate(R.layout.main_tab, null);" + (System.currentTimeMillis() - l6));
        setContentView(this.epk);
        Looper.myQueue().addIdleHandler(this.iJS);
        this.iJs = true;
        this.iJM = ((VoiceSearchLayout)findViewById(com.tencent.mm.i.aWe));
        this.iJM.mw(com.tencent.mm.sdk.platformtools.e.a(this, 100.0F));
        this.iJy = ((CustomViewPager)findViewById(com.tencent.mm.i.aHB));
        this.iJy.l(4);
        if (this.iJx != null)
        {
          this.iJx.a(null);
          ((View)this.iJx).setVisibility(8);
        }
        this.iJy.ew(true);
        this.iJz = new br(this, this, this.iJy);
        aPr();
        this.hF.a(this.hF.aL().c("main").a(this.iKg));
        this.hF.a(this.hF.aL().c("add").a(this.iKg));
        this.hF.a(this.hF.aL().c("find").a(this.iKg));
        this.hF.a(this.hF.aL().c("settings").a(this.iKg));
        oH(0);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN MainTabUI onCreate initView(); " + (System.currentTimeMillis() - l6));
        long l7 = System.currentTimeMillis();
        t(getIntent());
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN handleJump(getIntent()); " + (System.currentTimeMillis() - l7));
        long l8 = System.currentTimeMillis();
        if (!this.iJw)
          MMAppMgr.f(this, 1);
        com.tencent.mm.plugin.a.eS(3);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN syncAddrBookAndUpload checkLastLbsroomAndQuitIt " + (System.currentTimeMillis() - l8));
        aPt();
        this.hF.show();
        this.epk.post(new as(this));
        com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN MainTabUI onCreate : " + (System.currentTimeMillis() - l4));
        com.tencent.mm.sdk.platformtools.am.b(new at(this), 2000L);
        continue;
        label2094: aPa();
        aPn();
        break label672;
        String str2 = com.tencent.mm.model.bf.dkH.z("login_user_name", "");
        if ((!com.tencent.mm.model.bg.ra()) && (str2.equals("")))
          break label739;
        com.tencent.mm.plugin.f.c.n.fTF.jw(8);
        com.tencent.mm.model.bg.qX().d(new ce(new bl(this), "reset accinfo"));
        boolean bool1 = com.tencent.mm.model.bg.rd();
        Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = Boolean.valueOf(this.iJp);
        arrayOfObject1[1] = Boolean.valueOf(this.iJq);
        arrayOfObject1[2] = Boolean.valueOf(this.iJr);
        arrayOfObject1[3] = Boolean.valueOf(bool1);
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launch mainTabHasCreate:%b needResetLaunchUI:%b formNotification:%b, ishold:%b", arrayOfObject1);
        if ((this.iJp) && ((!this.iJq) || (this.iJr)))
          break label739;
        com.tencent.mm.model.bg.re();
        com.tencent.mm.c.a.l locall = new com.tencent.mm.c.a.l();
        com.tencent.mm.sdk.c.a.aGB().g(locall);
        if (com.tencent.mm.model.bg.oE())
          com.tencent.mm.model.bg.eh("[" + this.iJp + " " + this.iJq + " " + this.iJr + "]");
        if ((this.ehJ.getBooleanExtra("Intro_Switch", false)) || ((bool1) && (this.iJp)))
        {
          finish();
          Intent localIntent1 = new Intent(this, LauncherUI.class);
          localIntent1.addFlags(67108864);
          startActivity(localIntent1);
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask ConstantsUI.Intro.KSwitch kill myself");
          com.tencent.mm.sdk.platformtools.z.appenderFlush();
          Process.killProcess(Process.myPid());
        }
        while (true)
        {
          com.tencent.mm.model.bg.rf();
          if (!this.iJr)
            break;
          this.iJr = false;
          break;
          if (!com.tencent.mm.model.bf.dkH.z("login_user_name", "").equals(""))
            startActivity(new Intent().setClass(this, LoginHistoryUI.class));
          this.iJq = false;
          this.iJr = false;
          com.tencent.mm.plugin.f.c.n.fTF.jw(8);
        }
      }
      catch (Exception localException)
      {
        break label1534;
      }
    }
  }

  public static LauncherUI aPm()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(iJn.size());
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "LauncherUIgetInstance instancesize %d", arrayOfObject);
    if (iJn.isEmpty())
      return null;
    return (LauncherUI)iJn.get(0);
  }

  private void aPn()
  {
    if (getSharedPreferences(ak.aHi(), 0).getBoolean("settings_landscape_mode", false))
      setRequestedOrientation(-1);
    long l;
    while (true)
    {
      l = System.currentTimeMillis();
      if (aPm() != null)
        break;
      return;
      setRequestedOrientation(1);
    }
    com.tencent.mm.model.bg.qW().oW().a(this);
    com.tencent.mm.model.bg.qW().oQ().a(this.iJP);
    com.tencent.mm.k.i.Ck().a(this.iJO);
    com.tencent.mm.sdk.c.a.aGB().a("DynamicConfigUpdated", this.iJN);
    com.tencent.mm.sdk.c.a.aGB().a("UnreadChange", this.iJQ);
    com.tencent.mm.sdk.c.a.aGB().a("JDSysMsgNotify", this.iJT);
    aPo();
    aPv();
    aPd();
    aPk();
    ev(false);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN MainTabUI onResume:" + (System.currentTimeMillis() - l));
  }

  private void aPo()
  {
    com.tencent.mm.ui.conversation.aj localaj = (com.tencent.mm.ui.conversation.aj)this.iKi.get(Integer.valueOf(0));
    if (localaj != null)
    {
      localaj.aWO();
      localaj.aYu();
    }
  }

  private void aPt()
  {
    this.hF.setLogo(new ColorDrawable(getResources().getColor(17170445)));
    this.hF.aJ();
    this.hF.setDisplayHomeAsUpEnabled(false);
    this.hF.aI();
    this.hF.aK();
    this.hF.setCustomView(k.cAN);
    KS();
    this.hF.getCustomView().setOnClickListener(new bb(this));
  }

  private void aPv()
  {
    com.tencent.mm.sdk.platformtools.am.h(new bd(this));
  }

  private void b(String paramString, Bundle paramBundle)
  {
    Object[] arrayOfObject = new Object[1];
    if (this.iJX == null);
    for (boolean bool = false; ; bool = this.iJX.isShown())
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "try startChatting, ishow:%b", arrayOfObject);
      this.iKb = paramBundle;
      this.iKa = paramString;
      com.tencent.mm.model.bg.qQ().aHn();
      if (this.iJl)
      {
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "remove setTagRunnable");
        com.tencent.mm.sdk.platformtools.am.o(this.iJD);
      }
      com.tencent.mm.sdk.platformtools.am.h(this.iKc);
      return;
    }
  }

  public static void cf(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, LauncherUI.class);
    localIntent.addFlags(67108864);
    paramContext.startActivity(localIntent);
  }

  private void ev(boolean paramBoolean)
  {
    if ((this.iJA == null) || (this.iJF == null))
      return;
    if (!com.tencent.mm.model.bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "want update more menu new tips, but mmcore not ready");
      return;
    }
    this.iJA.eH(paramBoolean);
    if (this.iJA.aQn())
    {
      this.iJH.setVisibility(0);
      return;
    }
    this.iJH.setVisibility(8);
  }

  private void ex(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    if (this.iJX == null);
    for (boolean bool = false; ; bool = this.iJX.isShown())
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "try closeChatting, ishow:%b", arrayOfObject);
      if ((this.iJX != null) && (this.iJX.getVisibility() != 8) && (this.iJW != null))
        break;
      return;
    }
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "closeChatting");
    aPo();
    this.iJX.setVisibility(8);
    if (this.iKd == null)
    {
      this.iKd = AnimationUtils.loadAnimation(this, com.tencent.mm.b.MA);
      this.iKd.setAnimationListener(new az(this));
    }
    this.iJW.onPause();
    this.iJW.aVu();
    this.iJW.fq(false);
    if (paramBoolean)
      this.iJX.startAnimation(this.iKd);
    aPt();
    n();
  }

  private void oH(int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Integer.valueOf(this.iJJ);
    arrayOfObject[2] = Boolean.valueOf(this.iJs);
    arrayOfObject[3] = Integer.valueOf(this.iKi.size());
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "change tab to %d, cur tab %d, has init tab %B, tab cache size %d", arrayOfObject);
    if ((!this.iJs) || (paramInt < 0) || ((this.iJz != null) && (paramInt > -1 + this.iJz.getCount())));
    do
    {
      do
      {
        return;
        if ((paramInt == 1) || (this.iJJ == 1))
          com.tencent.mm.model.bg.qW().oQ().set(143618, Integer.valueOf(0));
      }
      while ((this.iJJ == paramInt) && (this.iKi.size() != 0));
      this.iJJ = paramInt;
      if (this.iJx != null)
        this.iJx.oD(this.iJJ);
    }
    while (this.iJy == null);
    this.iJy.a(this.iJJ, false);
    oG(this.iJJ);
  }

  private void t(Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "handleJump");
    if (!com.tencent.mm.model.bg.oE())
    {
      startActivity(new Intent(this, LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864));
      finish();
    }
    String str2;
    do
    {
      mx localmx;
      do
      {
        return;
        localmx = new mx();
        localmx.cPr.cEg = 4;
        com.tencent.mm.sdk.c.a.aGB().g(localmx);
      }
      while (localmx.cPs.cPw);
      if (!"talkroom_notification".equals(paramIntent.getStringExtra("nofification_type")))
        break;
      str2 = paramIntent.getStringExtra("enter_chat_usrname");
    }
    while (com.tencent.mm.platformtools.ap.jb(str2));
    Intent localIntent6 = new Intent();
    localIntent6.putExtra("enter_room_username", str2);
    localIntent6.setFlags(268435456);
    com.tencent.mm.am.a.b(this, "talkroom", ".ui.TalkRoomUI", localIntent6);
    return;
    if ("back_to_pcmgr_notification".equals(paramIntent.getStringExtra("nofification_type")))
    {
      Intent localIntent5 = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.topcui.BakToPcUI");
      localIntent5.setFlags(268435456);
      MMWizardActivity.j(this, localIntent5);
      return;
    }
    if ("back_to_pcmgr_error_notification".equals(paramIntent.getStringExtra("nofification_type")))
    {
      Intent localIntent4 = new Intent().setClassName(this, "com.tencent.mm.plugin.backup.topcui.BakConnErrorUI");
      localIntent4.setFlags(268435456);
      MMWizardActivity.j(this, localIntent4);
      return;
    }
    int k;
    String str1;
    r localr;
    if (paramIntent.getBooleanExtra("show_update_dialog", false))
    {
      k = paramIntent.getIntExtra("update_type", -1);
      if (k == -1)
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "showUpdateDialog is true, but updateType is -1");
    }
    else
    {
      str1 = paramIntent.getStringExtra("Main_User");
      if ((str1 == null) || (str1.equals("")))
        break label661;
      localr = com.tencent.mm.model.bg.qW().oW().yE(str1);
      if (localr == null)
        break label661;
    }
    label401: label661: for (int i = localr.jI(); ; i = 0)
    {
      MMAppMgr.hY();
      com.tencent.mm.sdk.c.a.aGB().g(new p());
      oH(0);
      if ((!paramIntent.getBooleanExtra("Intro_Is_Muti_Talker", true)) && (i > 0))
      {
        if (paramIntent.getIntExtra("Intro_Bottle_unread_count", 0) > 0)
          com.tencent.mm.am.a.l(this, "bottle", ".ui.BottleConversationUI");
        while (true)
          if (paramIntent.getIntExtra("kstyle_show_bind_mobile_afterauth", 0) > 0)
          {
            Intent localIntent1 = new Intent(this, BindMobileUI.class);
            paramIntent.putExtra("kstyle_bind_recommend_show", paramIntent.getIntExtra("kstyle_bind_recommend_show", 0));
            paramIntent.putExtra("kstyle_bind_wording", paramIntent.getParcelableExtra("kstyle_bind_wording"));
            MMWizardActivity.j(this, localIntent1);
            return;
            Updater.a(this, null).update(k);
            break;
            if (com.tencent.mm.model.y.dy(str1))
            {
              Intent localIntent2 = new Intent();
              localIntent2.addFlags(67108864);
              localIntent2.putExtra("type", 20);
              com.tencent.mm.am.a.b(this, "readerapp", ".ui.ReaderAppUI", localIntent2);
            }
            else if (com.tencent.mm.model.y.dF(str1))
            {
              Intent localIntent3 = new Intent();
              localIntent3.addFlags(67108864);
              localIntent3.putExtra("type", 11);
              com.tencent.mm.am.a.b(this, "readerapp", ".ui.ReaderAppUI", localIntent3);
            }
            else
            {
              if (paramIntent.getIntExtra("MainUI_User_Last_Msg_Type", 34) != 34)
                break label655;
            }
          }
      }
      for (int j = 2; ; j = 1)
      {
        this.iJB = false;
        Bundle localBundle = new Bundle();
        localBundle.putInt("Chat_Mode", j);
        LauncherUI localLauncherUI = aPm();
        if (localLauncherUI == null)
          break label401;
        localLauncherUI.b(str1, localBundle);
        break label401;
        oH(0);
        break label401;
        break;
      }
    }
  }

  public final void Br(String paramString)
  {
    b(paramString, null);
  }

  public final void Bs(String paramString)
  {
    if (paramString.equals(""))
      return;
    oH(((Integer)iKh.get(paramString)).intValue());
  }

  public final int W()
  {
    return this.iJJ;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    if (paramap == com.tencent.mm.model.bg.qW().oW())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = paramObject;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "Launcherui onNotifyChange event type %d, username %s", arrayOfObject);
      if (com.tencent.mm.storage.i.yc((String)paramObject))
        aPe();
    }
  }

  public final boolean aOZ()
  {
    return this.iJp;
  }

  public final boolean aPb()
  {
    return this.iJm;
  }

  protected final void aPd()
  {
    this.iJl = true;
    com.tencent.mm.sdk.platformtools.am.o(this.iJD);
    com.tencent.mm.sdk.platformtools.am.h(this.iJD);
  }

  protected final void aPe()
  {
    this.iJl = true;
    com.tencent.mm.sdk.platformtools.am.o(this.iJD);
    com.tencent.mm.sdk.platformtools.am.b(this.iJD, 300L);
  }

  public final void aPg()
  {
    Iterator localIterator = this.iKi.values().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (!(localFragment instanceof com.tencent.mm.ui.conversation.aj))
        ((aj)localFragment).aOl();
    }
  }

  public final void aPh()
  {
    if (this.iKi.containsKey(Integer.valueOf(0)))
      ((aj)this.iKi.get(Integer.valueOf(0))).aOl();
  }

  public final void aPp()
  {
    com.tencent.mm.ui.conversation.aj localaj = (com.tencent.mm.ui.conversation.aj)this.iKi.get(Integer.valueOf(0));
    if (localaj != null)
      localaj.aYv();
  }

  public final void aPq()
  {
    if (this.iJW != null)
      this.iJW.aRo();
  }

  public final void aPr()
  {
    boolean bool = getSharedPreferences(ak.aHi(), 0).getBoolean("settings_nav_tab_pos", true);
    e locale = this.iJx;
    if (this.iJx != null)
    {
      this.iJx.a(null);
      ((View)this.iJx).setVisibility(8);
      ((ViewGroup)this.iJy.getParent()).removeView((View)this.iJx);
    }
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    LauncherUIBottomTabView localLauncherUIBottomTabView;
    if (bool)
    {
      localLauncherUIBottomTabView = new LauncherUIBottomTabView(getBaseContext());
      ((ViewGroup)this.iJy.getParent()).addView(localLauncherUIBottomTabView, localLayoutParams);
    }
    LauncherUITabView localLauncherUITabView;
    for (this.iJx = localLauncherUIBottomTabView; ; this.iJx = localLauncherUITabView)
    {
      ((View)this.iJx).setVisibility(0);
      this.iJx.a(this.iJz);
      if ((locale != null) && (locale != this.iJx))
      {
        this.iJx.er(locale.aOu());
        this.iJx.es(locale.aOv());
        this.iJx.oz(locale.aOq());
        this.iJx.oA(locale.aOr());
        this.iJx.oB(locale.aOs());
        this.iJx.oC(locale.aOt());
        this.iJx.oD(locale.aOw());
      }
      return;
      localLauncherUITabView = new LauncherUITabView(getBaseContext());
      ((ViewGroup)this.iJy.getParent()).addView(localLauncherUITabView, 0, localLayoutParams);
    }
  }

  public final void aPs()
  {
    ex(true);
  }

  public final int aPu()
  {
    long l = System.currentTimeMillis();
    int i;
    if (!com.tencent.mm.model.bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+AkWszK7UvIu5cpERJB7d1VkLoGBmsjY=", "getMainTabUnreadCount, but mmcore not ready");
      i = 0;
    }
    while (true)
    {
      oJ(i);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l);
      arrayOfObject2[1] = Integer.valueOf(i);
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "unreadcheck setConversationTagUnread  last time %d, unread %d", arrayOfObject2);
      return i;
      if ((0x8000 & x.pK()) == 0)
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add("floatbottle");
        i = com.tencent.mm.model.z.a(com.tencent.mm.model.y.dkj, localArrayList);
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "unRead no bottole getMainTabUnreadCount  unread %d ", arrayOfObject1);
      }
      else
      {
        i = com.tencent.mm.model.z.dY(com.tencent.mm.model.y.dkj);
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "unRead with bottole getMainTabUnreadCount  unread %d ", arrayOfObject3);
      }
    }
  }

  public final void aPw()
  {
    if (!this.iJp)
      return;
    this.iJv = true;
    this.iJM.setBackgroundDrawable(null);
    this.iJM.aAB();
  }

  public final void aW(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2);
    dz localdz;
    do
    {
      do
        return;
      while ((this.iJU == paramInt2) && (this.iJV == paramInt1));
      this.iJU = paramInt2;
      this.iJV = paramInt1;
      oI(paramInt1);
      localdz = oI(paramInt2);
    }
    while ((localdz == null) || (!(localdz instanceof aj)));
    ((aj)localdz).aOY();
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = 3;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramKeyEvent.getKeyCode());
    arrayOfObject1[1] = Integer.valueOf(paramKeyEvent.getAction());
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "ui group onKeyDown, code:%d action:%d", arrayOfObject1);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      com.tencent.mm.sdk.platformtools.am.o(this.iKc);
    if ((this.iJW != null) && (this.iJW.tv()))
      if (!this.iJW.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent));
    do
    {
      do
      {
        return true;
        try
        {
          boolean bool2 = super.dispatchKeyEvent(paramKeyEvent);
          return bool2;
        }
        catch (Exception localException2)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = localException2.getMessage();
          com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "dispatch key event catch exception %s", arrayOfObject3);
          return false;
        }
        if ((paramKeyEvent.getKeyCode() == 25) && (paramKeyEvent.getAction() == 0) && (com.tencent.mm.model.bg.oE()))
        {
          AudioManager localAudioManager2 = (AudioManager)getSystemService("audio");
          if (com.tencent.mm.model.bg.ii().kT());
          while (true)
          {
            int i3 = localAudioManager2.getStreamMaxVolume(i);
            int i4 = localAudioManager2.getStreamVolume(i);
            int i5 = i3 / 7;
            if (i5 == 0)
              i5 = 1;
            localAudioManager2.setStreamVolume(i, i4 - i5, 5);
            return true;
            i = 5;
          }
        }
        if ((paramKeyEvent.getKeyCode() == 24) && (paramKeyEvent.getAction() == 0) && (com.tencent.mm.model.bg.oE()))
        {
          AudioManager localAudioManager1 = (AudioManager)getSystemService("audio");
          if (com.tencent.mm.model.bg.ii().kT());
          int n;
          int i1;
          while (true)
          {
            n = localAudioManager1.getStreamMaxVolume(i);
            i1 = localAudioManager1.getStreamVolume(i);
            if (i1 < n)
              break;
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "has set the max volume");
            return true;
            i = 5;
          }
          int i2 = n / 7;
          if (i2 == 0)
            i2 = 1;
          localAudioManager1.setStreamVolume(i, i2 + i1, 5);
          return true;
        }
        if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1) && (this.iJA != null) && (this.iJA.isShowing()))
        {
          this.iJA.dismiss();
          return true;
        }
        if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1))
        {
          aPj();
          return true;
        }
      }
      while ((this.iJz != null) && (paramKeyEvent.getAction() == 0) && (((dz)this.iJz.e(this.iJy.W())).onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent)));
      if ((paramKeyEvent.getKeyCode() != 4) || (paramKeyEvent.getAction() != 0))
        break;
    }
    while (com.tencent.mm.app.e.hN().hO());
    if ((this.iJM != null) && (this.iJM.getVisibility() == 0))
    {
      this.iJM.aAw();
      return true;
    }
    be localbe;
    int k;
    if (com.tencent.mm.sdk.platformtools.bc.bN(this))
    {
      localbe = new be(this);
      if (com.tencent.mm.model.bg.oE())
        break label611;
      k = 0;
    }
    while (k == 0)
    {
      int m = com.tencent.mm.sdk.platformtools.bc.bV(this);
      if ((com.tencent.mm.model.bg.oE()) && (com.tencent.mm.sdk.platformtools.bc.ow(m)) && (com.tencent.mm.platformtools.ap.a((Boolean)com.tencent.mm.model.bg.qW().oQ().get(16385))) && (MMAppMgr.b(this, m, new bf(this, m), new bg(this))))
        break;
      aOj();
      try
      {
        boolean bool1 = super.dispatchKeyEvent(paramKeyEvent);
        return bool1;
        label611: int j = ((Integer)com.tencent.mm.model.bg.qW().oQ().get(65, Integer.valueOf(0))).intValue();
        if (j >= 5)
        {
          k = 0;
        }
        else if (!com.tencent.mm.sdk.platformtools.as.AO("show_wap_adviser"))
        {
          k = 0;
        }
        else
        {
          View localView = View.inflate(this, k.bkp, null);
          ((TextView)localView.findViewById(com.tencent.mm.i.aFY)).setText(com.tencent.mm.n.bUl);
          ad localad = new ad(this);
          localad.pn(com.tencent.mm.n.buo);
          localad.ao(localView);
          localad.d(com.tencent.mm.n.btQ, new de(j));
          localad.eN(false);
          localad.e(com.tencent.mm.n.bUi, new df());
          localad.a(new dg(localbe));
          localad.aRB().show();
          k = 1;
        }
      }
      catch (Exception localException1)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException1.getMessage();
        com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "dispatch key event catch exception %s", arrayOfObject2);
      }
    }
    return false;
  }

  public final void ew(boolean paramBoolean)
  {
    if (this.iJy != null)
      this.iJy.ew(paramBoolean);
    View localView;
    if (this.iJx != null)
    {
      localView = (View)this.iJx;
      if (!paramBoolean)
        break label42;
    }
    label42: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }

  public void finish()
  {
    super.finish();
    aPi();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = Integer.valueOf(iJn.size());
    arrayOfObject[2] = ch.aHN();
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask Launcherui onfinish 0x%x,instance size %d, stack: %s", arrayOfObject);
  }

  public final void iv()
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN onInit");
    com.tencent.mm.sdk.platformtools.am.h(new bm(this));
  }

  public final void oG(int paramInt)
  {
    dz localdz = oI(paramInt);
    if (localdz == null);
    do
    {
      do
        return;
      while (!(localdz instanceof aj));
      ((aj)localdz).aOo();
    }
    while (this.iJM == null);
    this.iJM.reset();
  }

  public final dz oI(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "get tab %d", arrayOfObject1);
    if (paramInt < 0)
      return null;
    if (this.iKi.containsKey(Integer.valueOf(paramInt)))
      return (dz)this.iKi.get(Integer.valueOf(paramInt));
    Object localObject = null;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "createFragment index:%d", arrayOfObject2);
      if (localObject != null)
        ((dz)localObject).b(this);
      this.iKi.put(Integer.valueOf(paramInt), localObject);
      return localObject;
      localObject = (dz)Fragment.a(this, com.tencent.mm.ui.conversation.aj.class.getName(), null);
      continue;
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("Need_Voice_Search", true);
      localBundle.putBoolean("favour_include_biz", true);
      localObject = (dz)Fragment.a(this, com.tencent.mm.ui.contact.e.class.getName(), localBundle);
      continue;
      localObject = (dz)Fragment.a(this, t.class.getName(), null);
      continue;
      com.tencent.mm.am.a.aCl();
      localObject = (dz)Fragment.a(this, com.tencent.mm.ui.setting.h.class.getName(), null);
    }
  }

  public final void oJ(int paramInt)
  {
    if (this.iJx != null)
    {
      this.iJx.oz(paramInt);
      KS();
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "edw on activity result");
    int i = 0xFFFF & paramInt1;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(i);
    com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "check request code %d", arrayOfObject);
    int j;
    switch (i)
    {
    default:
      j = 0;
      if ((j != 0) && (this.iJW == null))
      {
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "on select image ActivityResult. the chattingUI maybe kill in the background.");
        com.tencent.mm.sdk.platformtools.am.o(this.iJI);
        this.iJI.iKo = 0;
        this.iJI.cKo = paramInt1;
        this.iJI.cKp = paramInt2;
        this.iJI.cKq = paramIntent;
        com.tencent.mm.sdk.platformtools.am.h(this.iJI);
      }
      break;
    case 217:
    case 218:
    }
    label189: 
    do
    {
      do
      {
        do
        {
          return;
          j = 1;
          break;
        }
        while (!this.iJp);
        if (paramInt1 != 1)
          break label189;
      }
      while (com.tencent.mm.platformtools.ap.b((Boolean)com.tencent.mm.model.bg.qW().oQ().get(12323)));
      com.tencent.mm.platformtools.ac.a(this, null, false);
      return;
    }
    while ((paramInt1 != 65534) || (paramInt2 != -1));
    com.tencent.mm.sdk.platformtools.as.AP("welcome_page_show");
    getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.g.m.nN()).edit().putBoolean("settings_fully_exit", true).commit();
    MMAppMgr.hY();
    MMAppMgr.o(this);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    long l1 = System.currentTimeMillis();
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(hashCode());
    arrayOfObject1[1] = Integer.valueOf(getTaskId());
    arrayOfObject1[2] = ch.bL(this);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check checktask onCreate 0x%x, taskid %d, task:%s", arrayOfObject1);
    long l2 = System.currentTimeMillis();
    int i = getTaskId();
    String str1 = getPackageName();
    Intent localIntent1 = getIntent();
    boolean bool1 = false;
    if (localIntent1 != null)
    {
      boolean bool3 = localIntent1.getBooleanExtra("absolutely_exit", false);
      bool1 = false;
      if (bool3)
      {
        bool1 = true;
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask checkInstance isWantToRestart");
      }
    }
    boolean bool2 = bool1;
    ActivityManager.RunningTaskInfo localRunningTaskInfo = null;
    LauncherUI localLauncherUI;
    int j;
    if (!bool2)
    {
      Iterator localIterator = iJn.iterator();
      if (localIterator.hasNext())
      {
        localLauncherUI = (LauncherUI)localIterator.next();
        if (localLauncherUI.getTaskId() != i)
        {
          Object[] arrayOfObject7 = new Object[3];
          arrayOfObject7[0] = Integer.valueOf(localLauncherUI.hashCode());
          arrayOfObject7[1] = Integer.valueOf(localLauncherUI.getTaskId());
          arrayOfObject7[2] = Integer.valueOf(i);
          com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask checkInstance 0x%x diff taskid taskid %d, nowtaskid:%d", arrayOfObject7);
          localRunningTaskInfo = ch.x(this, i);
          if (localRunningTaskInfo != null)
          {
            Object[] arrayOfObject9 = new Object[5];
            arrayOfObject9[0] = Integer.valueOf(localRunningTaskInfo.id);
            arrayOfObject9[1] = localRunningTaskInfo.topActivity.getClassName();
            arrayOfObject9[2] = localRunningTaskInfo.baseActivity.getClassName();
            arrayOfObject9[3] = Integer.valueOf(localRunningTaskInfo.numActivities);
            arrayOfObject9[4] = Integer.valueOf(localRunningTaskInfo.numRunning);
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask task diff id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d", arrayOfObject9);
            if (localRunningTaskInfo.baseActivity.getPackageName().equals(str1))
              break label453;
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask base activity is not mm, finish! info.baseActivity.getPackageName()  " + localRunningTaskInfo.baseActivity.getPackageName());
            finish();
            if (ch.x(this, localLauncherUI.getTaskId()) != null)
            {
              com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask startLauncherUI with FLAG_ACTIVITY_NEW_TASK");
              Intent localIntent2 = new Intent(this, LauncherUI.class);
              localIntent2.addFlags(268435456);
              startActivity(localIntent2);
            }
            j = 0;
          }
        }
      }
    }
    while (true)
      if (j == 0)
      {
        super.onCreate(paramBundle);
        return;
        Object[] arrayOfObject8 = new Object[1];
        arrayOfObject8[0] = Integer.valueOf(i);
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask cannot found curren taskinfo %d", arrayOfObject8);
        finish();
        j = 0;
        continue;
        label453: localLauncherUI.finish();
        iJn.remove(localLauncherUI);
        break;
        if (!iJn.isEmpty())
        {
          if (localRunningTaskInfo == null)
            localRunningTaskInfo = ch.x(this, i);
          if (localRunningTaskInfo != null)
          {
            String str3 = localRunningTaskInfo.baseActivity.getClassName();
            String str4 = localRunningTaskInfo.baseActivity.getClassName();
            Object[] arrayOfObject4 = new Object[5];
            arrayOfObject4[0] = Integer.valueOf(localRunningTaskInfo.id);
            arrayOfObject4[1] = str4;
            arrayOfObject4[2] = str3;
            arrayOfObject4[3] = Integer.valueOf(localRunningTaskInfo.numActivities);
            arrayOfObject4[4] = Integer.valueOf(localRunningTaskInfo.numRunning);
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask now info id %d, topactivity %s, baseactivity %s, numtotal %d, numrunning %d", arrayOfObject4);
            String str5 = getComponentName().getClassName();
            if ((localRunningTaskInfo.numActivities > 1) && (str5.equals(str3)) && (str5.equals(str4)))
            {
              finish();
              cf(this);
              Object[] arrayOfObject6 = new Object[1];
              arrayOfObject6[0] = Integer.valueOf(iJn.size());
              com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask finish this mainTabUI, and use the last LauncherUI instanceCount: %d", arrayOfObject6);
              j = 0;
              continue;
            }
            Object[] arrayOfObject5 = new Object[2];
            arrayOfObject5[0] = Integer.valueOf(iJn.size());
            arrayOfObject5[1] = Boolean.valueOf(bool2);
            com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask should not here without isWantToRestart is true launcherUIInstances.clear LauncherUI instanceCount: %d, isWantToRestart %b", arrayOfObject5);
            iJn.clear();
          }
        }
        else
        {
          while (true)
          {
            iJn.add(this);
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(iJn.size());
            arrayOfObject2[1] = Long.valueOf(System.currentTimeMillis() - l2);
            com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask Launcherui oncreate checkInstance size %d, use time %d", arrayOfObject2);
            j = 1;
            break;
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = Integer.valueOf(i);
            arrayOfObject3[1] = Integer.valueOf(iJn.size());
            com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask can not found taskid %d,  LauncherUI instanceCount: %d", arrayOfObject3);
            iJn.clear();
          }
        }
      }
    super.onCreate(paramBundle);
    SharedPreferences localSharedPreferences = getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.g.m.nN());
    if (localSharedPreferences.getBoolean("first_launch_weixin", true))
    {
      localSharedPreferences.edit().putBoolean("first_launch_weixin", false).commit();
      XLogSetup.realSetupXlog();
    }
    WorkerProfile.jdMethod_if().a(this);
    this.hF = aM();
    aPt();
    if (this.hF != null)
    {
      if (Build.VERSION.SDK_INT < 11)
        this.hF.setBackgroundDrawable(new ColorDrawable(getResources().getColor(com.tencent.mm.f.NQ)));
      this.hF.hide();
    }
    this.iJA = new ed(this);
    ak.s(this);
    String str2 = com.tencent.mm.model.bf.dkH.z("login_user_name", "");
    if (((!iJo) || (!WorkerProfile.jdMethod_if().it())) && ((com.tencent.mm.model.bg.ra()) || (!str2.equals(""))))
    {
      iJC = l1;
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check not isLauncherUIOnTop no welcomeearth create time from mmapplication==" + (System.currentTimeMillis() - MMApplication.cGd));
      aPc();
      iJo = false;
      if (!ch.al(this, "android.accessibilityservice.AccessibilityService"))
        break label1228;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "jacks android.accessibilityservice.AccessibilityService is running!");
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check Launcerui oncreate end ==" + (System.currentTimeMillis() - iJC));
      return;
      if ((WorkerProfile.jdMethod_if().is()) && (!WorkerProfile.jdMethod_if().in()))
      {
        iJC = MMApplication.cGd;
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check isLauncherUIOnTop create time from mmapplication==" + (System.currentTimeMillis() - MMApplication.cGd));
      }
      while (true)
      {
        aPt();
        KS();
        setRequestedOrientation(1);
        com.tencent.mm.app.e.hN().d(this);
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check after initwindow time from launcherui==" + (System.currentTimeMillis() - iJC));
        break;
        iJC = l1;
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check not isLauncherUIOnTop create time from mmapplication==" + (System.currentTimeMillis() - MMApplication.cGd));
      }
      label1228: if (ch.al(this, "AccessibilityService"))
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "jacks AccessibilityService is running!");
      else
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "jacks android.accessibilityservice.AccessibilityService/AccessibilityService is not run!");
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if ((this.iJW != null) && (this.iJW.tv()))
      return false;
    int i = aM().getHeight();
    int j;
    if (i == 0)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
        j = getResources().getDimensionPixelSize(com.tencent.mm.g.Pr);
    }
    while (true)
    {
      MenuItem localMenuItem1 = paramMenu.add(0, 1, 0, com.tencent.mm.n.cms);
      localMenuItem1.setIcon(com.tencent.mm.h.QO);
      android.support.v4.view.z.a(localMenuItem1, 2);
      int k = com.tencent.mm.aq.a.fromDPToPix(this, 56);
      MenuItem localMenuItem2 = paramMenu.add(0, 2, 0, com.tencent.mm.n.cmq);
      if (this.iJF == null)
      {
        ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(k, j);
        this.iJF = View.inflate(this, k.baB, null);
        this.iJG = ((ImageView)this.iJF.findViewById(com.tencent.mm.i.icon));
        this.iJH = this.iJF.findViewById(com.tencent.mm.i.aSU);
        this.iJF.setLayoutParams(localLayoutParams);
        this.iJF.setBackgroundResource(com.tencent.mm.h.QK);
        this.iJF.setMinimumHeight(j);
        this.iJF.setMinimumWidth(k);
        this.iJG.setImageResource(com.tencent.mm.h.QB);
        this.iJF.setContentDescription(getString(com.tencent.mm.n.cmq));
        this.iJF.setOnClickListener(new bj(this));
        this.iJF.post(new bk(this));
      }
      ev(false);
      android.support.v4.view.z.a(localMenuItem2, this.iJF);
      android.support.v4.view.z.a(localMenuItem2, 2);
      this.iJF.getLayoutParams().width = k;
      this.iJF.getLayoutParams().height = j;
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onCreateOptionsMenu");
      return true;
      j = getResources().getDimensionPixelSize(com.tencent.mm.g.Ps);
      continue;
      j = i;
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    aPi();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = Integer.valueOf(getTaskId());
    arrayOfObject[2] = ch.bL(this);
    arrayOfObject[3] = Integer.valueOf(iJn.size());
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask onDestroy 0x%x, taskid %d, task:%s, instancesize %d", arrayOfObject);
    WorkerProfile.jdMethod_if().b(this);
    if (iJn.isEmpty())
      ak.s(null);
    if (this.iJp)
    {
      if (this.iJL != null)
        com.tencent.mm.model.bg.qX().b(255, this.iJL);
      Looper.myQueue().removeIdleHandler(this.iJS);
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onMainTabDestroy");
    }
    if (this.iJM != null)
      this.iJM.a(null);
    this.iKi.clear();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(hashCode());
    arrayOfObject[1] = ch.bL(this);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checktask onNewIntent 0x%x task:%s", arrayOfObject);
    this.ehJ = paramIntent;
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (!WorkerProfile.jdMethod_if().in());
    while (aPf())
      return;
    if ((this.ehJ != null) && (this.ehJ.getBooleanExtra("Intro_Need_Clear_Top ", false)))
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN KNeedClearTop");
      finish();
      cf(this);
      return;
    }
    if ((0x4000000 & paramIntent.getFlags()) == 67108864)
    {
      ex(false);
      this.iJq = true;
      this.iJr = paramIntent.getBooleanExtra("Intro_Notify", false);
    }
    if (this.iJp)
    {
      com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onMainTabNewIntent on new intent");
      if (WorkerProfile.jdMethod_if().in())
        t(paramIntent);
    }
    oH(0);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool2;
    if ((aQi() != null) && (aQi().isShowing()))
      bool2 = super.onOptionsItemSelected(paramMenuItem);
    boolean bool1;
    do
    {
      return bool2;
      if (this.iJW == null)
        break;
      bool1 = this.iJW.tv();
      bool2 = false;
    }
    while (bool1);
    if (paramMenuItem.getItemId() == 2)
    {
      com.tencent.mm.plugin.f.c.n.fTF.q(10919, "0");
      aPj();
      return true;
    }
    int i;
    if (paramMenuItem.getItemId() == 1)
    {
      com.tencent.mm.am.a.b(this, "search", ".ui.SearchUI", new Intent().putExtra("from_tab_index", this.iJJ).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0));
      if (this.iJJ == 0)
        i = 1;
    }
    while (true)
    {
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(i);
      arrayOfObject[1] = Integer.valueOf(1);
      arrayOfObject[2] = Integer.valueOf(0);
      localn.d(10991, arrayOfObject);
      break;
      if (this.iJJ == 1)
      {
        i = 2;
      }
      else if (this.iJJ == 2)
      {
        i = 3;
      }
      else if (this.iJJ == 3)
      {
        i = 4;
        continue;
        return super.onOptionsItemSelected(paramMenuItem);
      }
      else
      {
        i = 0;
      }
    }
  }

  protected void onPause()
  {
    if (this.iJX != null);
    for (boolean bool = this.iJX.isShown(); ; bool = false)
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "edw onPause, chatting is show " + bool);
      super.onPause();
      dz localdz = aQi();
      if ((this.cGC) && (WorkerProfile.jdMethod_if().in()) && (localdz == null))
        break;
      return;
    }
    this.iJm = false;
    if (this.iJp)
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN MainTabUI onMainTabPause");
      if (WorkerProfile.jdMethod_if().in())
      {
        aPp();
        if (com.tencent.mm.model.bg.oE())
        {
          com.tencent.mm.model.bg.qW().oQ().b(this.iJP);
          com.tencent.mm.model.bg.qW().oW().b(this);
          com.tencent.mm.k.i.Ck().b(this.iJO);
          com.tencent.mm.sdk.c.a.aGB().b("DynamicConfigUpdated", this.iJN);
          com.tencent.mm.sdk.c.a.aGB().b("UnreadChange", this.iJQ);
          com.tencent.mm.sdk.c.a.aGB().b("JDSysMsgNotify", this.iJT);
        }
      }
    }
    if ((this.iJA != null) && (this.iJA.isShowing()))
      this.iJA.dismiss();
    if (this.iJu != null)
      this.iJu.onPause();
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "KEVIN Launcher onPause ");
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    this.iJR = paramBundle.getString("last_restore_talker");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.iJR;
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onRestoreInstantceState:%s", arrayOfObject);
  }

  public void onResume()
  {
    boolean bool;
    long l;
    if (this.iJX != null)
    {
      bool = this.iJX.isShown();
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "edw onResume, chatting is show " + bool);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onResume start");
      l = System.currentTimeMillis();
      if ((this.cGC) && (WorkerProfile.jdMethod_if().in()))
        break label104;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "LauncherUI onResume : " + (System.currentTimeMillis() - l));
      super.onResume();
    }
    label104: 
    do
    {
      return;
      bool = false;
      break;
      if (this.iKi.size() != 0)
        ((aj)this.iKi.get(Integer.valueOf(this.iJJ))).aOm();
      if ((this.iJB) && ((this.iJW == null) || (!this.iJW.tv())) && (com.tencent.mm.pluginsdk.g.axZ() != null) && (!com.tencent.mm.platformtools.ap.jb(com.tencent.mm.pluginsdk.g.aya().Wo())))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = com.tencent.mm.pluginsdk.g.axZ().We();
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "launcher onResume end track %s", arrayOfObject);
        com.tencent.mm.c.a.bh localbh = new com.tencent.mm.c.a.bh();
        localbh.cIk.username = com.tencent.mm.pluginsdk.g.axZ().We();
        com.tencent.mm.sdk.c.a.aGB().g(localbh);
      }
      if (this.iJu != null)
        this.iJu.onResume();
      aPl();
      if (this.iJv)
      {
        this.iJv = false;
        this.iJv = false;
        this.iJM.reset();
      }
      com.tencent.mm.app.l.id().resume();
      super.onResume();
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "start time check LauncherUI Launcher onResume end: " + (System.currentTimeMillis() - l));
      this.iJB = true;
    }
    while (this.iJx == null);
    this.iJx.aOp();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if ((this.iJW != null) && (!com.tencent.mm.platformtools.ap.jb(this.iJW.aUL())))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.iJW.aUL();
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "onSaveInstanceState:%s", arrayOfObject);
      paramBundle.putString("last_restore_talker", this.iJW.aUL());
    }
  }

  public final void p(Activity paramActivity)
  {
    int i = com.tencent.mm.j.a.Ac();
    if (i == 1)
    {
      l = PreferenceManager.getDefaultSharedPreferences(paramActivity).getLong("db_check_tip_time", 0L);
      if ((System.currentTimeMillis() - l > 86400000L) || (l > System.currentTimeMillis()))
      {
        bool = true;
        arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(bool);
        com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "checkDBSize isTimeOut %b ", arrayOfObject);
        if (bool)
        {
          localad2 = new ad(paramActivity);
          localad2.pn(com.tencent.mm.n.cCS);
          localad2.BL(paramActivity.getString(com.tencent.mm.n.cCR));
          localad2.eN(false);
          localad2.d(com.tencent.mm.n.cCO, new al(this));
          localad2.aRB().show();
        }
        com.tencent.mm.j.a.a(paramActivity, System.currentTimeMillis());
      }
    }
    while (i != 2)
      while (true)
      {
        long l;
        Object[] arrayOfObject;
        ad localad2;
        return;
        boolean bool = false;
      }
    com.tencent.mm.model.bg.re();
    ad localad1 = new ad(paramActivity);
    localad1.pn(com.tencent.mm.n.cCQ);
    localad1.BL(paramActivity.getString(com.tencent.mm.n.cCP));
    localad1.eN(false);
    localad1.d(com.tencent.mm.n.cCN, new ba(this));
    localad1.aRB().show();
    com.tencent.mm.j.a.a(paramActivity, System.currentTimeMillis());
  }

  public final boolean q(Activity paramActivity)
  {
    boolean bool = com.tencent.mm.model.bg.ra();
    String str1 = com.tencent.mm.model.bf.dkH.z("login_user_name", "");
    if ((!bool) && (str1.equals("")));
    for (int i = 1; i == 0; i = 0)
    {
      com.tencent.mm.sdk.platformtools.l.iDt = false;
      return false;
    }
    String str2 = String.format("%s,%s,%s,%s,%s", new Object[] { "", v.O(ak.getContext()), v.getAndroidId(), v.ni(), "" });
    LinkedList localLinkedList = new LinkedList();
    pz localpz = new pz();
    localpz.huF = 1;
    localpz.ifI = 11238;
    localpz.hUn = ((int)com.tencent.mm.platformtools.ap.CL());
    localpz.hUm = ((int)com.tencent.mm.platformtools.ap.CL());
    localpz.ifH = str2;
    localLinkedList.add(localpz);
    com.tencent.mm.plugin.b.a.b localb = new com.tencent.mm.plugin.b.a.b(localLinkedList);
    com.tencent.mm.model.bg.qX().d(localb);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(11238);
    arrayOfObject[1] = localpz.ifH;
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "Advertisement MAT  rsakv logID:%d val:%s", arrayOfObject);
    com.tencent.mm.plugin.f.c.e.a(11238, localpz.hUm, localpz.hUn, localpz.ifH, true, true);
    this.iJu = new WelcomeSelectView(paramActivity);
    paramActivity.setContentView(this.iJu);
    this.iJu.aQX();
    if (com.tencent.mm.sdk.platformtools.l.iDu)
    {
      MMAppMgr.f(paramActivity);
      return true;
    }
    MMAppMgr.i(paramActivity);
    return true;
  }

  public final void s(Runnable paramRunnable)
  {
    if (!this.iKf.contains(paramRunnable))
      this.iKf.add(paramRunnable);
  }

  public final void t(Runnable paramRunnable)
  {
    this.iKf.remove(paramRunnable);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUI
 * JD-Core Version:    0.6.2
 */