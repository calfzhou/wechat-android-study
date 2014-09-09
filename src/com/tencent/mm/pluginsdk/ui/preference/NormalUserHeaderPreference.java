package com.tencent.mm.pluginsdk.ui.preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.j;
import com.tencent.mm.aj.k;
import com.tencent.mm.aj.l;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.cq;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import junit.framework.Assert;

public class NormalUserHeaderPreference extends Preference
  implements p, as, cq
{
  private MMActivity cHh;
  private com.tencent.mm.storage.i elz;
  private ImageView grG;
  private int gsc;
  private TextView hHA;
  private ImageView hHB;
  private CheckBox hHC;
  private ImageView hHD;
  private ImageView hHE;
  private LinearLayout hHF;
  private Button hHG;
  private FMessageListView hHH;
  private boolean hHI = false;
  private boolean hHJ;
  private int hHK = 0;
  private boolean hHL = false;
  private boolean hHM = false;
  private boolean hHN = false;
  private boolean hHO = false;
  private boolean hHP = false;
  private boolean hHQ = false;
  private boolean hHR = false;
  private boolean hHS = false;
  private boolean hHT = false;
  private String hHU;
  private boolean hHV = false;
  private ImageView hHs;
  private TextView hHt;
  private TextView hHu;
  private TextView hHv;
  private TextView hHw;
  private TextView hHx;
  private Button hHy;
  private Button hHz;
  private String hfH;

  public NormalUserHeaderPreference(Context paramContext)
  {
    super(paramContext);
    this.cHh = ((MMActivity)paramContext);
    this.hHI = false;
  }

  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cHh = ((MMActivity)paramContext);
    this.hHI = false;
  }

  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.cHh = ((MMActivity)paramContext);
    this.hHI = false;
  }

  private void DP()
  {
    if (!aDe())
    {
      z.w("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initView : bindView = " + this.hHI + "contact = " + this.elz);
      return;
    }
    if (this.hHV)
    {
      this.hHA.setVisibility(0);
      this.hHt.setText(com.tencent.mm.ar.b.e(this.cHh, ch.ja(this.elz.oc()) + " ", (int)this.hHt.getTextSize()));
      aDf();
      this.hHG.setVisibility(8);
      this.hHu.setVisibility(8);
      this.hHH.setVisibility(8);
      this.hHy.setVisibility(8);
      this.hHz.setVisibility(8);
      this.hHC.setVisibility(8);
      return;
    }
    boolean bool1 = com.tencent.mm.storage.i.yc(this.elz.getUsername());
    label292: Bitmap localBitmap;
    int m;
    if (bool1)
    {
      this.hHt.setText("");
      if (com.tencent.mm.storage.i.ye(com.tencent.mm.model.x.pG()).equals(this.elz.getUsername()))
      {
        this.hHG.setVisibility(0);
        this.hHG.setOnClickListener(new q(this));
      }
      this.grG.setVisibility(0);
      this.hHN = true;
      if (this.elz.jj() != 1)
        break label707;
      this.grG.setImageDrawable(com.tencent.mm.aq.a.n(this.cHh, com.tencent.mm.h.VQ));
      this.grG.setContentDescription(getContext().getString(com.tencent.mm.n.bVO));
      if (this.elz.jd() != 0)
      {
        this.hHB.setVisibility(0);
        localBitmap = e.c(at.qz().cI(this.elz.jd()), 2.0F);
        this.hHB.setImageBitmap(localBitmap);
        if (localBitmap != null)
          break label782;
        m = 0;
        label348: this.hHK = m;
      }
      aDf();
      this.hHs.setOnClickListener(new r(this));
      if (!com.tencent.mm.storage.i.ya(this.elz.getUsername()))
        break label792;
      this.hHu.setText(getContext().getString(com.tencent.mm.n.btr) + this.elz.Aa());
      label426: if (!y.dK(this.elz.getUsername()))
        break label1104;
      this.hHx.setVisibility(0);
      label447: aDj();
      aDi();
      aDk();
      if (!ch.jb(this.hHU))
        break label1116;
      this.hHv.setVisibility(8);
    }
    while (true)
    {
      this.hHy.setOnClickListener(new s(this));
      this.hHz.setOnClickListener(new t(this));
      boolean bool2 = this.hHN;
      int i = 0;
      if (bool2)
        i = 0 + com.tencent.mm.aq.a.fromDPToPix(this.cHh, 17);
      int j = i + this.hHK;
      if (this.hHL)
        j += com.tencent.mm.aq.a.fromDPToPix(this.cHh, 27);
      if (this.hHM)
        j += com.tencent.mm.aq.a.fromDPToPix(this.cHh, 27);
      if (this.hHO)
        j += com.tencent.mm.aq.a.fromDPToPix(this.cHh, 30);
      int k = j + com.tencent.mm.aq.a.fromDPToPix(this.cHh, 65) + com.tencent.mm.aq.a.fromDPToPix(this.cHh, 50);
      DisplayMetrics localDisplayMetrics = this.cHh.getResources().getDisplayMetrics();
      this.hHt.setMaxWidth(localDisplayMetrics.widthPixels - k);
      return;
      this.hHt.setText(com.tencent.mm.ar.b.e(this.cHh, ch.ja(this.elz.oc()) + " ", (int)this.hHt.getTextSize()));
      break;
      label707: if (this.elz.jj() == 2)
      {
        this.grG.setImageDrawable(com.tencent.mm.aq.a.n(this.cHh, com.tencent.mm.h.VP));
        this.grG.setContentDescription(getContext().getString(com.tencent.mm.n.bVN));
        break label292;
      }
      if (this.elz.jj() != 0)
        break label292;
      this.grG.setVisibility(8);
      this.hHN = false;
      break label292;
      label782: m = localBitmap.getWidth();
      break label348;
      label792: if (com.tencent.mm.storage.i.xY(this.elz.getUsername()))
      {
        this.hHu.setText(getContext().getString(com.tencent.mm.n.bty) + this.elz.Aa());
        break label426;
      }
      if (this.hHJ)
      {
        if (com.tencent.mm.g.a.cv(this.elz.getType()))
        {
          aDg();
          break label426;
        }
        if ((this.elz.jx() == null) || (this.elz.jx().equals("")))
        {
          this.hHu.setText(com.tencent.mm.n.btf);
          break label426;
        }
        this.hHu.setText(this.elz.jx());
        break label426;
      }
      if (bool1)
      {
        this.hHu.setText((ch.ja(y.dX(this.elz.jp())) + " " + ch.ja(this.elz.jq())).trim());
        break label426;
      }
      if ((!com.tencent.mm.storage.i.xZ(this.elz.getUsername())) && (this.cHh.getIntent().getBooleanExtra("Contact_ShowUserName", true)))
      {
        if ((ch.jb(this.elz.iS())) && ((com.tencent.mm.storage.i.yd(this.elz.getUsername())) || (y.df(this.elz.getUsername()))))
        {
          this.hHu.setVisibility(8);
          break label426;
        }
        if (com.tencent.mm.g.a.cv(this.elz.getType()))
        {
          aDg();
          break label426;
        }
      }
      this.hHu.setVisibility(8);
      break label426;
      label1104: this.hHx.setVisibility(8);
      break label447;
      label1116: if ((!com.tencent.mm.model.x.cY(this.elz.getUsername())) && (ch.ja(this.elz.ja()).length() > 0))
        this.hHu.setVisibility(8);
      this.hHv.setVisibility(0);
      this.hHv.setText(this.cHh.getString(com.tencent.mm.n.bBn) + this.hHU);
    }
  }

  private boolean aDe()
  {
    return (this.hHI) && (this.elz != null);
  }

  private void aDf()
  {
    Bitmap localBitmap = c.a(this.elz.getUsername(), false, -1);
    if (localBitmap == null)
    {
      this.hHs.setImageResource(com.tencent.mm.h.Ut);
      return;
    }
    this.hHs.setImageBitmap(localBitmap);
  }

  private void aDg()
  {
    this.hHu.setVisibility(0);
    if (!ch.jb(this.elz.iS()))
    {
      this.hHu.setText(getContext().getString(com.tencent.mm.n.btu) + this.elz.iS());
      return;
    }
    if ((!com.tencent.mm.storage.i.yd(this.elz.getUsername())) && (!y.df(this.elz.getUsername())))
    {
      String str = ch.ja(this.elz.Aa());
      this.hHu.setText(getContext().getString(com.tencent.mm.n.btu) + str);
      return;
    }
    this.hHu.setVisibility(8);
  }

  private void aDi()
  {
    boolean bool1 = true;
    boolean bool4;
    int j;
    label80: boolean bool2;
    label147: label161: ImageView localImageView1;
    int i;
    if ((this.hHD != null) && (com.tencent.mm.g.a.cv(this.elz.getType())) && (y.db(this.elz.getUsername())))
    {
      if ((this.elz.zY()) && ((0x8000 & com.tencent.mm.model.x.pO()) == 0))
      {
        bool4 = bool1;
        this.hHM = bool4;
        ImageView localImageView2 = this.hHD;
        if (!this.hHM)
          break label200;
        j = 0;
        localImageView2.setVisibility(j);
      }
    }
    else if ((this.hHE != null) && (com.tencent.mm.g.a.cv(this.elz.getType())) && (y.db(this.elz.getUsername())))
    {
      String str = this.elz.getUsername();
      if (com.tencent.mm.pluginsdk.am.ayj() == null)
        break label207;
      bool2 = com.tencent.mm.pluginsdk.am.ayj().l(str, 5L);
      if ((!bool2) || ((0x8000 & com.tencent.mm.model.x.pO()) != 0))
        break label212;
      this.hHL = bool1;
      localImageView1 = this.hHE;
      boolean bool3 = this.hHL;
      i = 0;
      if (!bool3)
        break label217;
    }
    while (true)
    {
      localImageView1.setVisibility(i);
      return;
      bool4 = false;
      break;
      label200: j = 8;
      break label80;
      label207: bool2 = false;
      break label147;
      label212: bool1 = false;
      break label161;
      label217: i = 8;
    }
  }

  private void aDj()
  {
    if ((com.tencent.mm.model.x.cY(this.elz.getUsername())) || (ch.ja(this.elz.ja()).length() <= 0))
    {
      this.hHw.setVisibility(8);
      this.hHt.setText(com.tencent.mm.ar.b.e(this.cHh, ch.ja(this.elz.oc()) + " ", (int)this.hHt.getTextSize()));
      if (this.hHR)
      {
        this.hHy.setVisibility(0);
        if (!this.hHQ)
          break label388;
        this.hHz.setVisibility(0);
      }
    }
    while (true)
    {
      if (com.tencent.mm.storage.i.yc(this.elz.getUsername()))
        this.hHt.setText("");
      if ((this.gsc == 76) && (this.elz.getUsername() != null) && (this.elz.getUsername().endsWith("@stranger")))
        this.hHt.setText(com.tencent.mm.ar.b.e(this.cHh, ch.ja(this.elz.iV()) + " ", (int)this.hHt.getTextSize()));
      return;
      if (this.hHP)
      {
        this.hHy.setVisibility(0);
        break;
      }
      this.hHy.setVisibility(8);
      break;
      this.hHt.setText(com.tencent.mm.ar.b.e(this.cHh, ch.ja(this.elz.ja()) + " ", (int)this.hHt.getTextSize()));
      this.hHw.setVisibility(0);
      TextView localTextView = this.hHw;
      localTextView.setText(com.tencent.mm.ar.b.e(this.cHh, getContext().getString(com.tencent.mm.n.bCl) + this.elz.oc(), (int)this.hHw.getTextSize()));
      this.hHy.setVisibility(8);
      break;
      label388: this.hHz.setVisibility(8);
    }
  }

  private void aDk()
  {
    this.hHC.setClickable(false);
    if ((y.db(this.elz.getUsername())) && (com.tencent.mm.g.a.cv(this.elz.getType())) && (!com.tencent.mm.model.x.cY(this.elz.getUsername())))
    {
      this.hHC.setVisibility(0);
      if (this.elz.zV())
      {
        this.hHC.setChecked(true);
        this.hHO = true;
        return;
      }
      this.hHC.setChecked(false);
      this.hHC.setVisibility(8);
      this.hHO = false;
      return;
    }
    this.hHO = false;
    this.hHC.setVisibility(8);
  }

  public final void H(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (paramString.equals(this.elz.getUsername())))
      this.hHP = paramBoolean;
  }

  public final void I(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (paramString.equals(this.elz.getUsername())))
      this.hHQ = paramBoolean;
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = paramap;
    arrayOfObject1[2] = paramObject;
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "onNotifyChange event:%d stg:%s obj:%s", arrayOfObject1);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = paramap;
      arrayOfObject2[2] = paramObject;
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "onNotifyChange obj not String event:%d stg:%s obj:%s", arrayOfObject2);
    }
    String str;
    do
    {
      return;
      str = (String)paramObject;
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "onNotifyChange username = " + str + ", contact = " + this.elz);
      if (!aDe())
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initView : bindView = " + this.hHI + "contact = " + this.elz);
        return;
      }
    }
    while ((ch.ja(str).length() <= 0) || (this.elz == null) || (!this.elz.getUsername().equals(str)));
    this.elz = bg.qW().oT().ys(str);
    com.tencent.mm.sdk.platformtools.am.h(new u(this));
  }

  public final void a(cn paramcn)
  {
    com.tencent.mm.sdk.platformtools.am.h(new v(this, paramcn));
  }

  public final void a(com.tencent.mm.storage.i parami, int paramInt, String paramString)
  {
    int i = 1;
    onDetach();
    bg.qW().oT().a(this);
    bg.qW().oU().a(this);
    af.sh().d(this);
    this.elz = parami;
    this.gsc = paramInt;
    this.hfH = paramString;
    this.hHJ = this.cHh.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
    this.hHT = this.cHh.getIntent().getBooleanExtra("Contact_ShowFMessageList", false);
    this.hHP = this.cHh.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
    this.hHQ = this.cHh.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
    this.hHR = this.cHh.getIntent().getBooleanExtra("Contact_AlwaysShowRemarkBtn", false);
    this.hHS = this.cHh.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
    this.hHU = this.cHh.getIntent().getStringExtra("Contact_RoomNickname");
    if (parami.jm() == i)
    {
      int k = i;
      this.hHV = k;
      if (ch.ja(parami.getUsername()).length() <= 0)
        break label225;
    }
    while (true)
    {
      Assert.assertTrue("initView: contact username is null", i);
      DP();
      return;
      int m = 0;
      break;
      label225: int j = 0;
    }
  }

  public final void aDh()
  {
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(this.elz.getUsername());
    if ((locali != null) && ((int)locali.dhv != 0) && (locali.getUsername().equals(this.elz.getUsername())))
      this.elz = locali;
    if (!com.tencent.mm.g.a.cv(this.elz.getType()))
    {
      Intent localIntent1 = new Intent();
      localIntent1.setClassName(getContext(), "com.tencent.mm.ui.contact.ModRemarkNameUI");
      localIntent1.putExtra("Contact_Scene", this.gsc);
      localIntent1.putExtra("Contact_mode_name_type", 0);
      localIntent1.putExtra("Contact_ModStrangerRemark", true);
      localIntent1.putExtra("Contact_User", this.elz.getUsername());
      localIntent1.putExtra("Contact_Nick", this.elz.iV());
      localIntent1.putExtra("Contact_RemarkName", this.elz.ja());
      ((Activity)getContext()).startActivity(localIntent1);
      return;
    }
    Intent localIntent2 = new Intent();
    localIntent2.setClassName(getContext(), "com.tencent.mm.ui.contact.ContactRemarkInfoModUI");
    localIntent2.putExtra("Contact_Scene", this.gsc);
    localIntent2.putExtra("Contact_User", this.elz.getUsername());
    localIntent2.putExtra("Contact_RoomNickname", this.cHh.getIntent().getStringExtra("Contact_RoomNickname"));
    ((Activity)getContext()).startActivity(localIntent2);
  }

  public final void eX(String paramString)
  {
    if (!aDe())
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initView : bindView = " + this.hHI + "contact = " + this.elz);
    do
    {
      return;
      if (ch.ja(paramString).length() <= 0)
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "notifyChanged: user = " + paramString);
        return;
      }
    }
    while (!paramString.equals(this.elz.getUsername()));
    DP();
  }

  public final void onBindView(View paramView)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "onBindView");
    this.hHt = ((TextView)paramView.findViewById(com.tencent.mm.i.anT));
    this.hHu = ((TextView)paramView.findViewById(com.tencent.mm.i.aok));
    this.hHA = ((TextView)paramView.findViewById(com.tencent.mm.i.any));
    this.hHv = ((TextView)paramView.findViewById(com.tencent.mm.i.anD));
    this.hHw = ((TextView)paramView.findViewById(com.tencent.mm.i.anU));
    this.hHy = ((Button)paramView.findViewById(com.tencent.mm.i.anZ));
    this.hHz = ((Button)paramView.findViewById(com.tencent.mm.i.aoh));
    this.hHx = ((TextView)paramView.findViewById(com.tencent.mm.i.anI));
    this.hHG = ((Button)paramView.findViewById(com.tencent.mm.i.anF));
    this.hHH = ((FMessageListView)paramView.findViewById(com.tencent.mm.i.anG));
    g localg = new g();
    localg.cEh = this.elz.getUsername();
    localg.cCn = this.gsc;
    localg.hfH = this.hfH;
    localg.type = 0;
    if (this.gsc == 18)
    {
      localg.type = 1;
      this.hHH.a(localg);
      this.hHF = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.axn));
      this.hHs = ((ImageView)paramView.findViewById(com.tencent.mm.i.anA));
      this.grG = ((ImageView)paramView.findViewById(com.tencent.mm.i.aoe));
      this.hHB = ((ImageView)paramView.findViewById(com.tencent.mm.i.aoq));
      this.hHC = ((CheckBox)paramView.findViewById(com.tencent.mm.i.aoi));
      this.hHD = ((ImageView)paramView.findViewById(com.tencent.mm.i.aog));
      this.hHE = ((ImageView)paramView.findViewById(com.tencent.mm.i.aof));
      this.hHI = true;
      DP();
      if (this.hHT)
        break label365;
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, showFMessageList false");
      this.hHH.setVisibility(8);
    }
    label613: 
    while (true)
    {
      super.onBindView(paramView);
      return;
      if (!bw.cM(this.gsc))
        break;
      localg.type = 2;
      break;
      label365: if ((this.hfH == null) || (this.hfH.length() == 0))
      {
        z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, FMessageListView gone, addScene = " + this.gsc + ", verifyTicket = " + this.hfH);
        this.hHH.setVisibility(8);
      }
      else
      {
        z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, scene = " + this.gsc);
        n[] arrayOfn;
        if (this.gsc == 18)
        {
          z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, scene is lbs");
          com.tencent.mm.aj.h[] arrayOfh = l.AG().hN(this.elz.getUsername());
          arrayOfn = n.a(this.cHh, arrayOfh);
        }
        while (true)
        {
          if ((arrayOfn != null) && (arrayOfn.length != 0))
            break label613;
          z.e("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, providerList is null");
          this.hHH.setVisibility(8);
          break;
          if (bw.cM(this.gsc))
          {
            z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, scene is shake");
            j[] arrayOfj = l.AH().hR(this.elz.getUsername());
            arrayOfn = n.a(this.cHh, arrayOfj);
          }
          else
          {
            z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, scene is other");
            f[] arrayOff = l.AE().hI(this.elz.getUsername());
            arrayOfn = n.a(this.cHh, arrayOff);
          }
        }
        z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, providerList size = " + arrayOfn.length);
        int i = arrayOfn.length;
        for (int j = 0; j < i; j++)
        {
          n localn2 = arrayOfn[j];
          if (localn2 != null)
            z.d("!44@/B4Tb64lLpLSOpQlr7qYXcVBnXDUVF3vgYB+xEVv4/8=", "initAddContent, username = " + localn2.username + ", nickname = " + localn2.duA + ", digest = " + localn2.djA + ", addScene = " + localn2.gsc);
        }
        this.hHH.setVisibility(0);
        int k = arrayOfn.length;
        for (int m = 0; m < k; m++)
        {
          n localn1 = arrayOfn[m];
          this.hHH.a(localn1);
        }
      }
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    if (this.hHH != null)
      this.hHH.detach();
    return super.onCreateView(paramViewGroup);
  }

  public final void onDetach()
  {
    if (this.hHH != null)
      this.hHH.detach();
    if (this.hHT)
      l.AF().hC(this.elz.getUsername());
    this.cHh.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.hHP);
    this.cHh.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.hHQ);
    bg.qW().oT().b(this);
    af.sh().e(this);
    bg.qW().oU().b(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference
 * JD-Core Version:    0.6.2
 */