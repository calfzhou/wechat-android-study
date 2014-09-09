package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.AlphabetScrollBar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.fy;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.voicesearch.VoiceSearchResultUI;
import java.util.LinkedList;
import java.util.List;

public class e extends com.tencent.mm.ui.a
  implements com.tencent.mm.o.m
{
  private ProgressDialog dWT = null;
  private ei eQt;
  List edM = new LinkedList();
  com.tencent.mm.pluginsdk.ui.e eue = new com.tencent.mm.pluginsdk.ui.e(new k(this));
  private ListView feW;
  private fy fqC = new j(this);
  private AlphabetScrollBar fqz;
  private boolean fsF = false;
  private TextView iOn;
  private String jwY;
  private a jxA;
  private com.tencent.mm.ui.voicesearch.j jxB;
  private String jxC;
  private String jxD = "";
  private int jxE;
  private LinearLayout jxF = null;
  private boolean jxG = false;
  private boolean jxH = false;
  private com.tencent.mm.ui.friend.f jxI;
  private BizContactEntranceView jxJ;
  private aa jxK;
  private aa jxL;
  private ContactCountView jxM;
  private cl jxN;
  private boolean jxO;
  private boolean jxP = true;
  private LinearLayout jxQ;
  private Animation jxR;
  private Animation jxS;
  private cm jxT = new i(this);
  List jxU = new LinkedList();
  private Runnable jxV = new p(this);
  private String jxa;
  private TextView jxy;
  private TextView jxz;

  private void Mr()
  {
    try
    {
      long l1 = System.currentTimeMillis();
      aWO();
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "KEVIN updateBlockList() LAST" + (System.currentTimeMillis() - l1));
      long l2 = System.currentTimeMillis();
      if (this.jxA != null)
      {
        com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "post to do refresh");
        this.jxA.aWN();
      }
      if (this.jxB != null)
        am.h(new l(this));
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "KEVIN doRefresh() LAST" + (System.currentTimeMillis() - l2));
      return;
    }
    finally
    {
    }
  }

  private void aWO()
  {
    this.edM = new LinkedList();
    this.jxU = new LinkedList();
    com.tencent.mm.am.a.aCl();
    this.jxU.addAll(this.edM);
    if (!this.edM.contains("officialaccounts"))
      this.edM.add("officialaccounts");
    this.edM.add("helper_entry");
    if (this.jxA != null)
      this.jxA.bc(this.edM);
    if (this.jxB != null)
      this.jxB.bc(this.jxU);
  }

  public final void DR()
  {
    jH("");
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.ew(true);
    if (this.jxz != null)
      this.jxz.setVisibility(8);
    if (this.jxI != null)
      this.jxI.setVisible(true);
    if (this.jxJ != null)
      this.jxJ.setVisible(true);
    if (this.jxK != null)
      this.jxK.setVisible(true);
    if (this.jxL != null)
      this.jxL.setVisible(true);
    if (this.jxM != null)
      this.jxM.setVisible(true);
  }

  public final void DS()
  {
    com.tencent.mm.plugin.f.c.n.fTF.q(10919, "3");
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.ew(false);
    if (this.jxz != null)
      this.jxz.setVisibility(0);
    if (this.jxI != null)
      this.jxI.setVisible(false);
    if (this.jxJ != null)
      this.jxJ.setVisible(false);
    if (this.jxK != null)
      this.jxK.setVisible(false);
    if (this.jxL != null)
      this.jxL.setVisible(false);
    if (this.jxM != null)
      this.jxM.setVisible(false);
  }

  public final void Jf()
  {
    XF();
  }

  public final void Jg()
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (!ap.S(agh()));
    while ((dy.a(agh(), paramInt1, paramInt2, paramString, 4)) || (paramInt1 != 0) || (paramInt2 == 0))
      return;
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onVoiceReturn");
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
  }

  protected final void aOc()
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "address ui on create");
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "on address ui create");
    this.jxG = false;
    this.fsF = false;
    this.jxH = false;
    this.jwY = null;
    this.jxa = null;
    this.jxC = null;
    bg.qX().a(38, this);
    this.jwY = "@all.contact.without.chatroom";
    this.jxa = getStringExtra("Contact_GroupFilter_Str");
    this.jxC = getString(com.tencent.mm.n.bNg);
    this.jxE = getIntExtra("List_Type", 2);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = getResources().getDisplayMetrics();
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "on address ui init view, %s", arrayOfObject);
    if (this.feW != null)
    {
      if (this.jxI != null)
        this.feW.removeHeaderView(this.jxI);
      if (this.jxJ != null)
        this.feW.removeHeaderView(this.jxJ);
      if (this.jxK != null)
        this.feW.removeHeaderView(this.jxK);
      if (this.jxL != null)
        this.feW.removeHeaderView(this.jxL);
    }
    this.feW = ((ListView)findViewById(com.tencent.mm.i.aeA));
    this.feW.setScrollingCacheEnabled(false);
    this.jxy = ((TextView)findViewById(com.tencent.mm.i.arq));
    this.jxy.setText(com.tencent.mm.n.bsd);
    this.iOn = ((TextView)findViewById(com.tencent.mm.i.arK));
    this.iOn.setText(com.tencent.mm.n.bsf);
    this.jxz = ((TextView)findViewById(com.tencent.mm.i.arL));
    this.jxz.setOnClickListener(new f(this));
    this.jxA = new a(agh(), this.jwY, this.jxa, this.jxE);
    this.feW.setAdapter(null);
    this.jxA.a(new q(this));
    this.jxA.aWI();
    this.jxA.k(this);
    this.jxA.a(new t(this));
    this.jxA.a(new u(this));
    this.jxA.a(new v(this));
    this.jxB = new com.tencent.mm.ui.voicesearch.j(agh(), 1);
    this.jxB.gn(true);
    this.jxQ = new LinearLayout(agh());
    this.jxQ.setOrientation(1);
    this.feW.addHeaderView(this.jxQ);
    this.jxI = new com.tencent.mm.ui.friend.f(agh());
    this.jxQ.addView(this.jxI);
    this.jxK = new aa(agh(), ae.jyb);
    this.jxQ.addView(this.jxK);
    this.jxK.setVisible(true);
    this.jxL = new aa(agh(), ae.jyc);
    this.jxQ.addView(this.jxL);
    this.jxL.setVisible(true);
    ListView localListView = this.feW;
    ContactCountView localContactCountView = new ContactCountView(agh());
    this.jxM = localContactCountView;
    localListView.addFooterView(localContactCountView, null, false);
    if (com.tencent.mm.am.a.to("brandservice"))
    {
      this.jxJ = new BizContactEntranceView(agh());
      this.jxQ.addView(this.jxJ);
      this.jxJ.setVisible(true);
      this.jxN = new cl(agh(), new w(this));
      if (this.jxN.aXb() <= 0)
        this.jxN.setVisibility(8);
      this.jxQ.addView(this.jxN);
    }
    this.eQt = new ei(agh());
    this.jxA.a(new x(this));
    this.feW.setOnItemClickListener(new y(this));
    this.feW.setOnItemLongClickListener(new z(this));
    this.feW.setOnTouchListener(new g(this));
    this.feW.setOnScrollListener(this.eue);
    this.feW.setDrawingCacheEnabled(false);
    this.fqz = ((AlphabetScrollBar)findViewById(com.tencent.mm.i.aeL));
    this.fqz.a(this.fqC);
    bg.qW().oT().a(this.jxA);
    if (this.jxN != null)
      com.tencent.mm.q.aa.uY().a(this.jxN);
  }

  protected final void aOd()
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "address ui on resume");
    if (this.jxP)
    {
      this.jxP = false;
      this.jxO = false;
      aWO();
      this.feW.setAdapter(this.jxA);
      this.feW.post(new m(this));
      this.jxB.gm(false);
      if (this.jxJ != null)
        this.jxJ.UW();
      if (this.jxN != null)
      {
        if (this.jxN.aXb() > 0)
          break label335;
        this.jxN.setVisibility(8);
      }
    }
    while (true)
    {
      this.jxG = ((Boolean)bg.qW().oQ().get(12296, Boolean.valueOf(false))).booleanValue();
      if (this.jxE == 2)
      {
        com.tencent.mm.storage.i locali = bg.qW().oT().ys(com.tencent.mm.model.x.pG());
        if ((locali != null) && ((!com.tencent.mm.g.a.cv(locali.getType())) || (!ap.jb(locali.ja())) || (!ap.jb(locali.jg())) || (!ap.jb(locali.jh()))))
        {
          locali.oz();
          locali.aT("");
          locali.aZ("");
          locali.ba("");
          bg.qW().oT().a(com.tencent.mm.model.x.pG(), locali);
        }
      }
      if (this.jxB != null)
        this.jxB.onResume();
      this.jxA.aOM();
      am.h(new o(this));
      if (this.jxI != null)
        this.jxI.fL(true);
      LauncherUI localLauncherUI = LauncherUI.aPm();
      if (localLauncherUI != null)
        localLauncherUI.s(this.jxV);
      return;
      if (!this.jxO)
        break;
      this.jxO = false;
      new Thread(new n(this)).start();
      this.jxM.aWR();
      break;
      label335: this.jxN.setVisibility(0);
    }
  }

  protected final void aOe()
  {
  }

  protected final void aOf()
  {
    bg.qW().oQ().set(12296, Boolean.valueOf(this.jxG));
    if (this.jxB != null)
      this.jxB.onPause();
    this.jxA.aWM();
    am.h(new r(this));
    if (this.jxI != null)
      this.jxI.fL(false);
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if (localLauncherUI != null)
      localLauncherUI.t(this.jxV);
  }

  protected final void aOg()
  {
  }

  protected final void aOh()
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onDestory");
    if (this.fqz != null)
      this.fqz.aTw();
    bg.qX().b(38, this);
    if (this.jxA != null)
    {
      this.jxA.closeCursor();
      this.jxA.detach();
      this.jxA.aOD();
    }
    if (this.jxB != null)
    {
      this.jxB.detach();
      this.jxB.closeCursor();
    }
    if ((bg.oE()) && (this.jxA != null))
      bg.qW().oT().b(this.jxA);
    if ((bg.oE()) && (this.jxN != null))
      com.tencent.mm.q.aa.uY().b(this.jxN);
    if (this.jxI != null)
    {
      this.jxI.detach();
      this.jxI = null;
    }
    if (this.jxJ != null)
      this.jxJ = null;
    if (this.jxK != null)
      this.jxK = null;
    if (this.jxL != null)
      this.jxL = null;
  }

  public final void aOi()
  {
    com.tencent.mm.sdk.platformtools.z.v("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "request to top");
    if (this.feW != null)
      h.a(this.feW);
  }

  public final void aOj()
  {
    if (this.jxA != null)
      this.jxA.clearCache();
    com.tencent.mm.sdk.platformtools.z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN Address turnTobg");
    if (this.jxJ != null)
      this.jxJ.destroyDrawingCache();
    if (this.jxK != null)
      this.jxK.destroyDrawingCache();
    if (this.jxL != null)
      this.jxL.destroyDrawingCache();
    if (this.jxM != null)
      this.jxM.destroyDrawingCache();
    if (this.jxI != null)
      this.jxI.destroyDrawingCache();
  }

  public final void aOk()
  {
    com.tencent.mm.sdk.platformtools.z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN Address turnTofg");
  }

  public final void dj(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "visible " + paramBoolean);
    if (paramBoolean)
    {
      int i = this.feW.getFirstVisiblePosition();
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "getFirstVisiblePosition  " + i);
      if (i > 0)
        this.feW.post(new s(this));
    }
  }

  public final void fw(boolean paramBoolean)
  {
    if (this.fqz != null)
    {
      if (this.jxR == null)
      {
        this.jxR = AnimationUtils.loadAnimation(agh(), com.tencent.mm.b.Mt);
        this.jxR.setDuration(200L);
      }
      if (this.jxS == null)
      {
        this.jxS = AnimationUtils.loadAnimation(agh(), com.tencent.mm.b.Mt);
        this.jxS.setDuration(200L);
      }
      if (!paramBoolean)
        break label103;
      if (this.fqz.getVisibility() != 0)
      {
        this.fqz.setVisibility(0);
        this.fqz.startAnimation(this.jxR);
      }
    }
    label103: 
    while (4 == this.fqz.getVisibility())
      return;
    this.fqz.setVisibility(8);
    this.fqz.startAnimation(this.jxS);
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.aez;
  }

  public final boolean jG(String paramString)
  {
    return false;
  }

  public final void jH(String paramString)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onSearchBarChange %s", new Object[] { paramString });
    String str = ap.iV(paramString);
    this.fsF = true;
    a locala = this.jxA;
    boolean bool;
    if (!ap.jb(paramString))
    {
      bool = true;
      locala.fv(bool);
      if (!this.jxH)
        break label100;
      this.jxB.gm(false);
      if ((str != null) && (str.trim().length() == 0))
        this.jxA.fv(false);
      this.jxA.d(str, null);
    }
    label100: 
    do
    {
      do
      {
        return;
        bool = false;
        break;
        if ((str != null) && (str.length() != 0))
          break label177;
        if (this.fqz != null)
          this.fqz.setVisibility(0);
        this.feW.setAdapter(this.jxA);
        this.jxA.notifyDataSetChanged();
        this.jxB.gm(false);
        this.jxA.d(str, null);
      }
      while (this.jxz == null);
      this.jxz.setVisibility(0);
      return;
      if (this.fqz != null)
      {
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "do query");
        this.fqz.setVisibility(8);
      }
      this.jxA.clearCache();
      this.feW.setAdapter(this.jxB);
      this.jxB.gm(true);
      this.jxB.jI(str);
      this.jxB.notifyDataSetChanged();
    }
    while (this.jxz == null);
    label177: this.jxz.setVisibility(8);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onAcvityResult requestCode: %d", arrayOfObject);
    if ((paramInt1 == 6) && (paramInt2 == -1))
    {
      aOX();
      finish();
    }
    while (paramInt2 != -1)
      return;
    switch (paramInt1)
    {
    default:
      return;
    case 4:
    }
    if (this.iJh)
      h().setResult(-1);
    while (true)
    {
      finish();
      return;
      h().setResult(-1, paramIntent);
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(this.jxD);
    if (locali == null)
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onCreateContextMenu, contact is null, username = " + this.jxD);
    do
    {
      do
      {
        do
          return;
        while (com.tencent.mm.model.x.pG().equals(locali.getUsername()));
        if (com.tencent.mm.model.y.de(this.jxD))
        {
          paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(paramView.getContext(), locali.od(), -1));
          paramContextMenu.add(localAdapterContextMenuInfo.position, 2, 0, com.tencent.mm.n.bsc);
          return;
        }
      }
      while (com.tencent.mm.model.y.du(this.jxD));
      paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.e(paramView.getContext(), locali.od(), -1));
    }
    while (!com.tencent.mm.g.a.cv(locali.getType()));
    paramContextMenu.add(localAdapterContextMenuInfo.position, 7, 0, com.tencent.mm.n.bCf);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.e
 * JD-Core Version:    0.6.2
 */