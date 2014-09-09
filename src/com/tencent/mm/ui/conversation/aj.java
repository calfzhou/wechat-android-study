package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.c.a.lc;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bc;
import com.tencent.mm.model.y;
import com.tencent.mm.n.p;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.b.q;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.dm;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.voicesearch.VoiceSearchResultUI;
import java.util.HashMap;

public class aj extends com.tencent.mm.ui.a
  implements bc, p, com.tencent.mm.o.m, com.tencent.mm.o.n, com.tencent.mm.pluginsdk.ae, com.tencent.mm.sdk.f.as
{
  public static int jGV = -1;
  private static boolean jGX = false;
  private String cEh = "";
  private ProgressDialog dWT = null;
  private ei eQt;
  private boolean ekQ = false;
  com.tencent.mm.pluginsdk.ui.e eue = new com.tencent.mm.pluginsdk.ui.e(new ce(this));
  private com.tencent.mm.network.ag fWA = new ak(this);
  private com.tencent.mm.model.ao fXP = null;
  private com.tencent.mm.ui.base.cm fqj = new bd(this);
  private boolean fsF = false;
  private com.tencent.mm.sdk.c.g hzB = null;
  private com.tencent.mm.sdk.platformtools.cm hzC = new bw(this);
  private MessageQueue.IdleHandler iJS;
  private TextView iOn;
  private com.tencent.mm.ui.b.ag jGA = null;
  private com.tencent.mm.pluginsdk.ui.a.b jGB = null;
  private com.tencent.mm.ui.b.ae jGC = null;
  private q jGD = null;
  private com.tencent.mm.pluginsdk.ui.a.a jGE = null;
  private LinearLayout jGF = null;
  private boolean jGG = false;
  private boolean jGH = false;
  private boolean jGI = false;
  private int jGJ = 0;
  private com.tencent.mm.ui.b.a jGK = null;
  private com.tencent.mm.ab.a jGL = null;
  private l jGM = new l();
  private com.tencent.mm.sdk.c.g jGN = new az(this);
  private com.tencent.mm.sdk.platformtools.cm jGO = new cd(this);
  private int jGP = -1;
  private boolean jGQ = false;
  private com.tencent.mm.sdk.platformtools.am jGR;
  private Runnable jGS;
  private HashMap jGT = new HashMap();
  private int jGU = -1;
  com.tencent.mm.sdk.c.g jGW = new bg(this);
  private aa jGw = null;
  private ListView jGx;
  private TextView jGy;
  private ab jGz;
  private boolean jxG = false;
  private Runnable jxV = new bv(this);
  private TextView jxz;
  private com.tencent.mm.storage.r jyv = null;
  private PowerManager.WakeLock wakeLock = null;

  private com.tencent.mm.storage.r CV(String paramString)
  {
    if (this.jGz != null)
      return (com.tencent.mm.storage.r)this.jGz.K(paramString);
    return null;
  }

  private void Mg()
  {
    long l = System.currentTimeMillis();
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "KEVIN setShowTitle: " + (System.currentTimeMillis() - l));
    aYs();
  }

  private void aYp()
  {
    if ((com.tencent.mm.model.bg.ii() != null) && (this.fXP == null))
    {
      aYt();
      this.fXP = new cc(this);
    }
    com.tencent.mm.model.bg.ii().a(this.fXP);
  }

  private void aYq()
  {
    if (!this.jGQ)
    {
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "Jacks cancel PreLoad.");
      this.jGQ = true;
    }
    if ((this.jGR != null) && (this.jGS != null))
      this.jGR.bcy().removeCallbacks(this.jGS);
  }

  private boolean aYr()
  {
    if (!com.tencent.mm.ab.n.yy())
      return false;
    if (!this.wakeLock.isHeld())
    {
      z.w("!24@/B4Tb64lLpIDYaNtcQaIEA==", "tryDoInit wakelock.acquire!");
      this.wakeLock.acquire();
    }
    if (this.jGL == null)
    {
      this.jGL = new com.tencent.mm.ab.a(this);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(this.jGM.nM());
      arrayOfObject[1] = Integer.valueOf(this.jGL.hashCode());
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "dkinit doInit t:%d initScene:%d", arrayOfObject);
      this.jGM.reset();
      com.tencent.mm.model.bg.qX().d(this.jGL);
    }
    if (this.jGz != null)
      this.jGz.fK(true);
    com.tencent.mm.sdk.platformtools.am.h(new bp(this));
    return true;
  }

  private void aYs()
  {
    if ((!com.tencent.mm.model.bg.oE()) || (this.jGK == null) || (this.jGK.aRq() == null));
    com.tencent.mm.ae.b localb;
    do
    {
      return;
      if ((com.tencent.mm.model.bg.oE()) && (this.jGL == null) && (this.jGD != null))
        this.jGD.HA();
      if ((com.tencent.mm.model.bg.oE()) && (this.jGA != null) && (this.jGA.du()) && (this.jGK != null))
      {
        this.jGK.setVisibility(8);
        return;
      }
      if ((this.fsF) && (!this.jGH) && (this.jGA != null))
        this.jGA.aRs();
      localb = com.tencent.mm.ae.b.C(agh());
    }
    while ((this.jGK == null) || (this.jGK.aRq() == null));
    if (localb != null)
    {
      this.jGK.aRq().a(localb);
      this.jGK.aRq().DW();
      if (this.jGK.du())
      {
        this.jGK.setVisibility(0);
        return;
      }
    }
    this.jGK.setVisibility(8);
  }

  private void aYt()
  {
    if (this.jGC != null)
    {
      if (com.tencent.mm.model.bg.ii().kQ() != null)
      {
        this.jGC.BJ(getString(com.tencent.mm.n.bTn) + getString(com.tencent.mm.n.bTo) + com.tencent.mm.model.bg.ii().getTitle());
        this.jGC.setVisibility(0);
      }
    }
    else
      return;
    this.jGC.setVisibility(8);
  }

  private boolean q(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      arrayOfObject[1] = Integer.valueOf(paramInt3);
      z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "trigger check update: errCode:%d, sceneType:%d", arrayOfObject);
      if (com.tencent.mm.platformtools.ao.dVL)
        com.tencent.mm.sdk.platformtools.ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.tencent.mm.platformtools.ap.CL() - 86400L - 1L).commit();
      if (dm.a(agh(), paramInt1, paramInt2))
        return true;
    }
    return false;
  }

  public final void DR()
  {
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onQuitSearch");
    this.jGI = true;
    jH("");
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.ew(true);
    if (this.jxz != null)
      this.jxz.setVisibility(8);
    if (this.jGA != null)
      this.jGA.du();
    aYt();
  }

  public final void DS()
  {
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onEnterSearch");
    com.tencent.mm.plugin.f.c.n.fTF.q(10919, "2");
    if (this.jGA != null)
      this.jGA.aRs();
    if (this.jGC != null)
      this.jGC.setVisibility(8);
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.ew(false);
    if (this.jxz != null)
      this.jxz.setVisibility(0);
  }

  public final void Jf()
  {
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onVoiceSearchStart");
    XF();
  }

  public final void Jg()
  {
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onVoiceSearchCancel");
  }

  public final void a(int paramInt1, int paramInt2, com.tencent.mm.o.x paramx)
  {
    if ((paramx == null) || (paramx.getType() != 37))
      return;
    if (paramInt2 != 0);
    for (int i = paramInt1 * 100 / paramInt2; ; i = 0)
    {
      com.tencent.mm.sdk.platformtools.am.h(new bs(this, i));
      return;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if ((paramx.getType() != 38) && (paramx.getType() != 37))
      q(paramInt1, paramInt2, paramx.getType());
    do
    {
      do
      {
        return;
        Object[] arrayOfObject1 = new Object[6];
        arrayOfObject1[0] = Integer.valueOf(paramInt1);
        arrayOfObject1[1] = Integer.valueOf(paramInt2);
        arrayOfObject1[2] = paramString;
        arrayOfObject1[3] = Integer.valueOf(paramx.getType());
        arrayOfObject1[4] = Integer.valueOf(hashCode());
        if (this.jGL == null);
        for (int i = -2; ; i = this.jGL.hashCode())
        {
          arrayOfObject1[5] = Integer.valueOf(i);
          z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "dkinit onSceneEnd:[%d,%d,%s] type:%d hash:%d init:%d ", arrayOfObject1);
          if ((this.jGL != null) && (paramx.getType() == 37))
          {
            this.jGL = null;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Long.valueOf(this.jGM.nM());
            z.w("!24@/B4Tb64lLpIDYaNtcQaIEA==", "dkinit Kevin init FINISH : %d ", arrayOfObject2);
            com.tencent.mm.model.at.qx().a(null, null);
            if (this.jGz != null)
            {
              this.jGz.fK(false);
              this.jGz.aYh();
              if (h() != null)
                jGV = ((LauncherUI)h()).aPu();
            }
            if (this.wakeLock.isHeld())
            {
              z.w("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onSceneEnd wakelock.release!");
              this.wakeLock.release();
            }
            com.tencent.mm.model.bg.qQ().aHq();
            if (this.dWT != null)
            {
              this.dWT.dismiss();
              this.dWT = null;
            }
          }
          if (this.jGw != null)
          {
            this.jGw.dismiss();
            this.jGw = null;
          }
          if ((this.iHN) || (paramInt1 != 4) || (paramInt2 != -6))
            break;
          z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "not show verify dialog on background");
          return;
        }
        agh();
      }
      while (dm.ba(paramInt1, paramInt2));
      this.jGw = dm.a(h(), paramInt1, paramInt2, new Intent().setClass(agh(), LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864), paramString);
    }
    while (this.jGw != null);
    if (!com.tencent.mm.model.bg.oE())
    {
      z.w("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onSceneEnd not set uin");
      return;
    }
    String str;
    if (!this.jGG)
    {
      this.jGG = true;
      str = (String)com.tencent.mm.model.bg.qW().oQ().get(5);
      if (((Integer)com.tencent.mm.model.bg.qW().oQ().get(57, Integer.valueOf(0))).intValue() == 0)
        break label768;
    }
    label768: for (int k = 1; ; k = 0)
    {
      if ((k != 0) && (str != null))
        com.tencent.mm.ui.base.e.a(agh(), getString(com.tencent.mm.n.bYx, new Object[] { str }), getString(com.tencent.mm.n.buo), getString(com.tencent.mm.n.bYz), getString(com.tencent.mm.n.bYy), new bi(this), new bj(this));
      if ((paramInt1 == 4) && (paramInt2 == -17) && (!jGX))
      {
        com.tencent.mm.model.bg.qX().d(new com.tencent.mm.ab.k(5));
        jGX = true;
      }
      if ((q(paramInt1, paramInt2, paramx.getType())) || (dy.a(agh(), paramInt1, paramInt2, paramString, 4)))
        break;
      if (paramx.getType() == 37)
      {
        new com.tencent.mm.sdk.platformtools.cm().post(new br(this));
        if (((0x80 & com.tencent.mm.model.x.pL()) != 0) && (com.tencent.mm.model.bg.qW().oW().yE("masssendapp") == null))
        {
          com.tencent.mm.storage.r localr = new com.tencent.mm.storage.r();
          localr.setUsername("masssendapp");
          localr.setContent(com.tencent.mm.sdk.platformtools.ak.getContext().getResources().getString(com.tencent.mm.n.bCa));
          localr.k(2000L + com.tencent.mm.platformtools.ap.CM());
          localr.bv(0);
          localr.bt(0);
          com.tencent.mm.model.bg.qW().oW().d(localr);
          int j = 0xFFFFFF7F & com.tencent.mm.model.x.pL();
          com.tencent.mm.model.bg.qW().oQ().set(40, Integer.valueOf(j));
        }
      }
      if ((paramx.getType() != 38) && (paramx.getType() != 37))
        break;
      aYs();
      return;
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.f.ap paramap, Object paramObject)
  {
    if ((com.tencent.mm.model.bg.oE()) && (paramap == com.tencent.mm.model.bg.qW().oQ()))
    {
      int i = com.tencent.mm.platformtools.ap.R(paramObject);
      if (8193 == i)
        aYs();
      if (42 == i)
        aYs();
    }
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onVoiceReturn");
    if (paramBoolean)
    {
      Intent localIntent1 = new Intent(agh(), VoiceSearchResultUI.class);
      localIntent1.putExtra("VoiceSearchResultUI_Resultlist", paramArrayOfString);
      localIntent1.putExtra("VoiceSearchResultUI_VoiceId", paramLong);
      localIntent1.putExtra("VoiceSearchResultUI_ShowType", paramInt);
      agh().startActivity(localIntent1);
      return;
    }
    Intent localIntent2 = new Intent(agh(), VoiceSearchResultUI.class);
    localIntent2.putExtra("VoiceSearchResultUI_Resultlist", new String[0]);
    localIntent2.putExtra("VoiceSearchResultUI_Error", agh().getString(com.tencent.mm.n.bKk));
    localIntent2.putExtra("VoiceSearchResultUI_VoiceId", paramLong);
    localIntent2.putExtra("VoiceSearchResultUI_ShowType", paramInt);
    agh().startActivity(localIntent2);
  }

  public final void aOY()
  {
    Object[] arrayOfObject = new Object[2];
    int i;
    if (this.dWT == null)
    {
      i = -1;
      arrayOfObject[0] = Integer.valueOf(i);
      if (this.jGL != null)
        break label80;
    }
    label80: for (int j = -2; ; j = this.jGL.hashCode())
    {
      arrayOfObject[1] = Integer.valueOf(j);
      z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "dkinit onTabSwitchIn tip:%d initscene:%d", arrayOfObject);
      if (this.wakeLock != null)
        aYr();
      return;
      if (this.dWT.isShowing())
      {
        i = 1;
        break;
      }
      i = 0;
      break;
    }
  }

  protected final void aOc()
  {
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "on tab create");
    long l = System.currentTimeMillis();
    setMenuVisibility(true);
    com.tencent.mm.model.bg.qQ().aHq();
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "main ui init view");
    if (this.jGx != null)
    {
      this.jGx.setAdapter(null);
      if ((this.jGB != null) && (this.jGB.getView() != null))
        this.jGx.removeHeaderView(this.jGB.getView());
      if ((this.jGA != null) && (this.jGA.getView() != null))
        this.jGx.removeHeaderView(this.jGA.getView());
      if ((this.jGC != null) && (this.jGC.getView() != null))
        this.jGx.removeHeaderView(this.jGC.getView());
      if ((this.jGK != null) && (this.jGK.getView() != null))
        this.jGx.removeHeaderView(this.jGK.getView());
      if ((this.jGE != null) && (this.jGE.getView() != null))
        this.jGx.removeFooterView(this.jGE.getView());
      if (this.jGF != null)
        this.jGx.removeHeaderView(this.jGF);
      if ((this.jGD != null) && (this.jGD.getView() != null))
        this.jGx.removeHeaderView(this.jGD.getView());
    }
    this.jGy = ((TextView)findViewById(com.tencent.mm.i.ars));
    this.jxz = ((TextView)findViewById(com.tencent.mm.i.arL));
    this.jxz.setOnClickListener(new am(this));
    this.jGx = ((ListView)findViewById(com.tencent.mm.i.aBm));
    this.jGx.setDrawingCacheEnabled(false);
    this.jGx.setScrollingCacheEnabled(false);
    this.jGx.post(new an(this));
    this.iOn = ((TextView)findViewById(com.tencent.mm.i.arA));
    this.jGz = new ab(agh(), new ap(this));
    this.jGz.a(new ar(this));
    this.jGz.a(new as(this));
    this.jGz.a(new at(this));
    this.jGB = ((com.tencent.mm.pluginsdk.ui.a.b)com.tencent.mm.ui.b.g.I(agh(), com.tencent.mm.ui.b.i.iWB));
    this.jGA = ((com.tencent.mm.ui.b.ag)com.tencent.mm.ui.b.g.I(agh(), com.tencent.mm.ui.b.i.iWA));
    this.jGC = ((com.tencent.mm.ui.b.ae)com.tencent.mm.ui.b.g.I(agh(), com.tencent.mm.ui.b.i.iWz));
    this.jGD = ((q)com.tencent.mm.ui.b.g.I(agh(), com.tencent.mm.ui.b.i.iWy));
    this.jGK = ((com.tencent.mm.ui.b.a)com.tencent.mm.ui.b.g.I(agh(), com.tencent.mm.ui.b.i.iWD));
    if ((this.jGB != null) && (this.jGB.getView() != null))
      this.jGx.addHeaderView(this.jGB.getView());
    if ((this.jGA != null) && (this.jGA.getView() != null))
      this.jGx.addHeaderView(this.jGA.getView());
    if ((this.jGC != null) && (this.jGC.getView() != null))
      this.jGx.addHeaderView(this.jGC.getView());
    if ((this.jGK != null) && (this.jGK.getView() != null))
      this.jGx.addHeaderView(this.jGK.getView());
    if ((this.jGD != null) && (this.jGD.getView() != null))
      this.jGx.addHeaderView(this.jGD.getView());
    this.jGF = new LinearLayout(agh());
    this.jGx.addHeaderView(this.jGF);
    this.jGF.setVisibility(8);
    aYp();
    com.tencent.mm.model.bt.rn().dlt = new au(this);
    com.tencent.mm.model.bt.rn().dlt.rq();
    this.jGx.setOnScrollListener(this.eue);
    this.jGz.b(this.eue);
    if (jGV < 0)
      jGV = ((LauncherUI)h()).aPu();
    this.jGx.setAdapter(this.jGz);
    com.tencent.mm.sdk.platformtools.am.h(new aw(this));
    this.eQt = new ei(agh());
    this.jGx.setOnItemClickListener(new ax(this));
    this.jGx.setOnItemLongClickListener(new ay(this));
    this.jGx.setOnTouchListener(new bb(this));
    this.jGG = false;
    this.jxG = false;
    this.fsF = false;
    this.jGH = false;
    this.jGJ = 0;
    this.iJS = new by(this);
    this.fWA = new ca(this);
    this.jGx.setSelection(0);
    this.wakeLock = ((PowerManager)agh().getSystemService("power")).newWakeLock(26, "NetSceneInit Lock");
    com.tencent.mm.model.bg.qX().a(-1, this);
    com.tencent.mm.n.af.sh().d(this);
    com.tencent.mm.model.bg.qW().a(this);
    com.tencent.mm.model.bg.a(this.fWA);
    Looper.myQueue().addIdleHandler(this.iJS);
    com.tencent.mm.sdk.c.a.aGB().a("MainUITabDoubleClick", this.jGW);
    com.tencent.mm.model.bg.S(false);
    com.tencent.mm.sdk.c.a.aGB().a("PCManagerBak", this.jGN);
    com.tencent.mm.model.bg.qW().oW().a(this.jGz);
    com.tencent.mm.model.bg.qW().oT().a(this.jGz);
    this.jGz.aYf();
    this.jGz.a(new bm(this));
    if (this.hzB == null)
      this.hzB = new bx(this);
    com.tencent.mm.sdk.c.a.aGB().a("RePullEmojiInfoDesc", this.hzB);
    com.tencent.mm.y.ap.yi().dO(com.tencent.mm.h.Tg);
    com.tencent.mm.y.ap.yi().start();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Long.valueOf(com.tencent.mm.platformtools.ap.ac(l));
    arrayOfObject[1] = Long.valueOf(this.jGM.nM());
    arrayOfObject[2] = Integer.valueOf(com.tencent.mm.model.bg.qW().oD());
    arrayOfObject[3] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "kevin mainUIOnCreate time:%d diff:%d uin:%d ver:%x", arrayOfObject);
    this.jGx.postDelayed(new bt(this), 200L);
  }

  protected final void aOd()
  {
    long l1 = com.tencent.mm.platformtools.ap.CM();
    if (jGV < 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(jGV);
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onTabResume totalUnReadCount %d", arrayOfObject2);
      if (this.jGz != null)
        this.jGz.aYh();
    }
    agh();
    aYu();
    long l2 = System.currentTimeMillis();
    if (this.jGK != null)
      this.jGK.aRn();
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "KEVIN initTips: " + (System.currentTimeMillis() - l2));
    long l3 = System.currentTimeMillis();
    aYp();
    this.jxG = com.tencent.mm.platformtools.ap.b((Boolean)com.tencent.mm.model.bg.qW().oQ().get(12296));
    if (this.jGB != null)
    {
      this.jGB.He();
      if ((this.jGB.refresh()) && (this.jGx.getVisibility() != 0))
      {
        this.jGx.setVisibility(0);
        this.jGy.setVisibility(8);
      }
    }
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "KEVIN bakBannerView : " + (System.currentTimeMillis() - l3) + ", show slide tips (" + this.jxG + ")");
    Mg();
    com.tencent.mm.model.bg.qW().oQ().a(this);
    if (com.tencent.mm.pluginsdk.g.axT() != null)
      com.tencent.mm.pluginsdk.g.axT().a(this);
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Long.valueOf(com.tencent.mm.platformtools.ap.ac(l1));
    int i;
    if (this.dWT == null)
    {
      i = -1;
      arrayOfObject1[1] = Integer.valueOf(i);
      if (this.jGL != null)
        break label460;
    }
    label460: for (int j = -2; ; j = this.jGL.hashCode())
    {
      arrayOfObject1[2] = Integer.valueOf(j);
      z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "start time check dkinit KEVIN mainui TestTimeLayoutTime onTabResume:%d tip:%d initscene:%d", arrayOfObject1);
      aYr();
      com.tencent.mm.sdk.platformtools.am.b(new bu(this), 100L);
      if ((com.tencent.mm.model.bg.oE()) && (this.jGL == null))
      {
        lc locallc = new lc();
        com.tencent.mm.sdk.c.a.aGB().a(locallc, Looper.getMainLooper());
      }
      cg.cv(agh());
      FragmentActivity localFragmentActivity = h();
      if ((localFragmentActivity != null) && (!localFragmentActivity.isFinishing()))
        ((LauncherUI)localFragmentActivity).p(localFragmentActivity);
      LauncherUI localLauncherUI = LauncherUI.aPm();
      if (localLauncherUI != null)
        localLauncherUI.s(this.jxV);
      return;
      if (this.dWT.isShowing())
      {
        i = 1;
        break;
      }
      i = 0;
      break;
    }
  }

  protected final void aOe()
  {
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "on tab start");
    Mg();
  }

  protected final void aOf()
  {
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "on tab pause");
    if (this.jGB != null)
      this.jGB.Hf();
    if (this.wakeLock.isHeld())
    {
      z.w("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onTabPause wakelock.release!");
      this.wakeLock.release();
    }
    if (com.tencent.mm.model.bg.oE())
    {
      com.tencent.mm.model.bg.qW().oQ().b(this);
      z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "on pause");
    }
    XF();
    if (com.tencent.mm.pluginsdk.g.axT() != null)
      com.tencent.mm.pluginsdk.g.axT().b(this);
    aYv();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN mainui onTabPause  ");
    cg.aYx();
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.t(this.jxV);
  }

  protected final void aOg()
  {
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "on tab stop");
  }

  protected final void aOh()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(com.tencent.mm.model.bg.oE());
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onTabDestroy  acc:%b", arrayOfObject);
    if (this.jGB != null)
    {
      this.jGB.Hf();
      this.jGB = null;
    }
    com.tencent.mm.model.bg.qX().b(-1, this);
    if (com.tencent.mm.model.bg.oE())
    {
      com.tencent.mm.model.bg.qW().b(this);
      if (this.jGz != null)
      {
        com.tencent.mm.model.bg.qW().oW().b(this.jGz);
        com.tencent.mm.model.bg.qW().oT().b(this.jGz);
      }
    }
    if (this.jGz != null)
    {
      this.jGz.aYg();
      this.jGz.aYe();
      this.jGz.onDestroy();
    }
    if (this.hzB != null)
    {
      com.tencent.mm.sdk.c.a.aGB().b("RePullEmojiInfoDesc", this.hzB);
      this.hzB = null;
    }
    if (com.tencent.mm.model.bg.oE())
    {
      com.tencent.mm.n.af.sh().e(this);
      com.tencent.mm.platformtools.ap.DG();
    }
    com.tencent.mm.model.bg.b(this.fWA);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (this.jGw != null)
    {
      this.jGw.dismiss();
      this.jGw = null;
    }
    if (com.tencent.mm.model.bg.ii() != null)
      com.tencent.mm.model.bg.ii().b(this.fXP);
    com.tencent.mm.sdk.c.a.aGB().b("MainUITabDoubleClick", this.jGW);
    com.tencent.mm.sdk.c.a.aGB().b("PCManagerBak", this.jGN);
    if ((this.jGw != null) && (this.jGw.isShowing()))
      this.jGw.dismiss();
    if (this.jGO != null)
    {
      this.jGO.removeCallbacksAndMessages(null);
      this.jGO = null;
    }
  }

  public final void aOi()
  {
    com.tencent.mm.sdk.platformtools.h.a(this.jGx);
  }

  public final void aOj()
  {
    if (this.jGK != null)
      this.jGK.aRp();
    if (this.jGA != null)
      this.jGA.aAB();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN mainui turnTobg");
  }

  public final void aOk()
  {
    z.i("!24@/B4Tb64lLpIDYaNtcQaIEA==", "turn to fg");
    if (this.jGK != null)
      this.jGK.aRo();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN mainui turnToFg");
  }

  public final void aWO()
  {
    if (this.jGz != null)
      this.jGz.aWO();
  }

  public final void aYu()
  {
    if (this.jGz != null)
      this.jGz.onResume();
  }

  public final void aYv()
  {
    if (this.jGz != null)
      this.jGz.onPause();
  }

  public final void dj(boolean paramBoolean)
  {
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "visible " + paramBoolean);
    if (paramBoolean)
    {
      int i = this.jGx.getFirstVisiblePosition();
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "getFirstVisiblePosition  " + i);
      if (i > 0)
        this.jGx.post(new bz(this));
    }
  }

  public final void eX(String paramString)
  {
    if ((com.tencent.mm.model.bg.oE()) && (!com.tencent.mm.model.bg.rd()) && (com.tencent.mm.platformtools.ap.ja(paramString).length() > 0) && (paramString.equals(com.tencent.mm.model.x.pG())))
      aYs();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.aBl;
  }

  public final boolean jG(String paramString)
  {
    return false;
  }

  public final void jH(String paramString)
  {
    z.v("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onSearchChange");
    String str = com.tencent.mm.platformtools.ap.iV(paramString);
    this.fsF = true;
    if (paramString.compareTo("") == 0)
      this.jGH = true;
    this.jGO.removeMessages(4660);
    if (this.jGH)
    {
      this.jGz.jI("");
      return;
    }
    Message localMessage = this.jGO.obtainMessage(4660, str);
    this.jGO.sendMessageDelayed(localMessage, 300L);
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    this.jGz.notifyDataSetChanged();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    aYs();
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    int i = 1;
    com.tencent.mm.storage.i locali = com.tencent.mm.model.bg.qW().oT().ys(this.cEh);
    if (locali == null)
    {
      z.e("!24@/B4Tb64lLpIDYaNtcQaIEA==", "onCreateContextMenu, contact is null, talker = " + this.cEh);
      return;
    }
    String str1 = locali.od();
    if ((str1.toLowerCase().endsWith("@chatroom")) && (com.tencent.mm.platformtools.ap.jb(locali.iV())))
      str1 = getString(com.tencent.mm.n.bAg);
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(agh(), str1, -1));
    int j;
    if (this.jyv != null)
    {
      j = i;
      label124: if ((j & y.b(this.jyv)) != 0)
      {
        String str2 = this.cEh;
        com.tencent.mm.storage.r localr = com.tencent.mm.model.bg.qW().oW().yE(str2);
        if (localr == null)
          break label386;
        if ((localr.jI() > 0) || (localr.cw(1048576)))
          break label380;
        if (i == 0)
          break label392;
        paramContextMenu.add(localAdapterContextMenuInfo.position, 8, 0, com.tencent.mm.n.bQP);
      }
      label180: label203: if ((this.jyv != null) && (y.a(this.jyv)))
      {
        if (!com.tencent.mm.model.bg.qW().oW().yK(this.cEh))
          break label413;
        paramContextMenu.add(localAdapterContextMenuInfo.position, 6, 0, com.tencent.mm.n.bQQ);
      }
    }
    while (true)
    {
      if ((locali.aIg()) && (!y.dQ(locali.getUsername())) && (!y.du(locali.getUsername())))
      {
        com.tencent.mm.q.a locala = com.tencent.mm.q.r.fE(locali.getUsername());
        if ((locala != null) && (locala.uf()))
          paramContextMenu.add(localAdapterContextMenuInfo.position, 10, 0, com.tencent.mm.n.bQM);
      }
      if ((this.jyv == null) || (this.jyv.jM() == -1L))
        break;
      if (!y.dp(this.cEh))
        break label433;
      paramContextMenu.add(localAdapterContextMenuInfo.position, 4, 0, com.tencent.mm.n.bQW);
      return;
      j = 0;
      break label124;
      label380: i = 0;
      break label180;
      label386: i = 0;
      break label180;
      label392: paramContextMenu.add(localAdapterContextMenuInfo.position, 7, 0, com.tencent.mm.n.bQN);
      break label203;
      label413: paramContextMenu.add(localAdapterContextMenuInfo.position, 5, 0, com.tencent.mm.n.bQO);
    }
    label433: if (y.dn(this.cEh))
    {
      paramContextMenu.add(localAdapterContextMenuInfo.position, 4, 0, com.tencent.mm.n.bQX);
      return;
    }
    if (y.jdMethod_do(this.cEh))
    {
      paramContextMenu.add(localAdapterContextMenuInfo.position, 4, 0, com.tencent.mm.n.bQV);
      return;
    }
    paramContextMenu.add(localAdapterContextMenuInfo.position, 4, 0, com.tencent.mm.n.bQU);
  }

  public final void onDestroy()
  {
    aYq();
    super.onDestroy();
  }

  public final void onResume()
  {
    super.onResume();
  }

  public final void onStart()
  {
    super.onStart();
  }

  public final void qD()
  {
    aYs();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.aj
 * JD-Core Version:    0.6.2
 */