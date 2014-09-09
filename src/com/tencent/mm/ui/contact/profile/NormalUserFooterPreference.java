package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import junit.framework.Assert;

public class NormalUserFooterPreference extends Preference
  implements al
{
  private MMActivity cHh;
  public ProgressDialog dWT = null;
  protected com.tencent.mm.sdk.f.am dnh = new cd(this);
  private com.tencent.mm.storage.i elz;
  private boolean fDb;
  private Button gGv;
  private boolean hHI;
  private boolean hHS = false;
  private boolean hHV = false;
  private String hfH = "";
  private long ijA = 0L;
  private String jDG = "";
  private int jDj = 0;
  private int jDy;
  private boolean jEd = false;
  private boolean jEe;
  private boolean jEf;
  private cf jEg;
  private View jEh;
  private Button jEi;
  private Button jEj;
  private Button jEk;
  private View jEl;
  private Button jEm;
  private View jEn;
  private Button jEo;
  private Button jEp;
  private Button jEq;
  private Button jEr;
  private Button jEs;
  private Button jEt;
  private TextView jEu;
  public boolean jEv = false;
  private int jza;

  public NormalUserFooterPreference(Context paramContext)
  {
    super(paramContext);
    this.cHh = ((MMActivity)paramContext);
    init();
  }

  public NormalUserFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.cHh = ((MMActivity)paramContext);
    init();
  }

  public NormalUserFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.cHh = ((MMActivity)paramContext);
    init();
  }

  private void DP()
  {
    if ((!this.hHI) || (this.elz == null))
    {
      z.w("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "iniView : bindView = " + this.hHI + " contact = " + this.elz);
      return;
    }
    if (this.jEg != null)
      this.jEg.ank();
    aXS();
  }

  private void init()
  {
    this.hHI = false;
    this.jEg = null;
  }

  public final boolean ID()
  {
    if (this.jEg != null)
      this.jEg.onDetach();
    this.dnh.removeAll();
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    return true;
  }

  public final void a(String paramString, ao paramao)
  {
    if (ap.ja(paramString).length() <= 0);
    while ((this.elz == null) || ((!paramString.equals(this.elz.getUsername())) && (!paramString.equals(this.elz.jk()))))
      return;
    this.elz = bg.qW().oT().ys(this.elz.getUsername());
    com.tencent.mm.sdk.platformtools.am.h(new ce(this));
  }

  public final boolean a(com.tencent.mm.storage.i parami, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2, boolean paramBoolean4, boolean paramBoolean5, long paramLong, String paramString2)
  {
    ID();
    boolean bool1;
    if (parami != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (ap.ja(parami.getUsername()).length() <= 0)
        break label62;
    }
    label62: for (boolean bool2 = true; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      if (!com.tencent.mm.storage.i.ye(x.pG()).equals(parami.getUsername()))
        break label68;
      return false;
      bool1 = false;
      break;
    }
    label68: this.elz = parami;
    this.hfH = paramString1;
    this.fDb = paramBoolean1;
    this.jza = paramInt1;
    this.jDy = paramInt2;
    this.jEf = ap.a(Boolean.valueOf(y.de(parami.getUsername())), false);
    this.jEd = paramBoolean4;
    this.jEe = paramBoolean5;
    this.ijA = paramLong;
    this.jDG = paramString2;
    this.jEv = false;
    boolean bool3;
    if (parami.jm() == 1)
    {
      bool3 = true;
      this.hHV = bool3;
      this.hHS = this.cHh.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
      this.jDj = this.cHh.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      if ((!x.cY(parami.getUsername())) && (!bg.qW().oY().has(parami.getUsername())))
        break label250;
      this.jEg = new dd(this);
      this.jEv = true;
    }
    while (true)
    {
      DP();
      return true;
      bool3 = false;
      break;
      label250: if (com.tencent.mm.storage.i.xY(parami.getUsername()))
      {
        this.jEg = new dn(this);
      }
      else if (y.du(parami.getUsername()))
      {
        this.jEg = new di(this);
      }
      else if (y.de(parami.getUsername()))
      {
        this.jEg = new dm(this);
      }
      else if (com.tencent.mm.storage.i.xZ(parami.getUsername()))
      {
        this.jEg = new dk(this);
      }
      else if ((a.cv(parami.getType())) && (!com.tencent.mm.storage.i.yc(parami.getUsername())))
      {
        this.jEg = new dd(this);
        this.jEv = true;
      }
      else if (paramBoolean2)
      {
        this.jEg = new dt(this);
        this.jEv = true;
      }
      else if ((paramBoolean3) || (com.tencent.mm.storage.i.yc(parami.getUsername())))
      {
        this.jEg = new db(this);
      }
      else
      {
        this.jEg = new dd(this);
        this.jEv = true;
      }
    }
  }

  public final boolean aXS()
  {
    if ((this.hHS) && (a.cv(this.elz.getType())))
    {
      this.jEt.setVisibility(0);
      return true;
    }
    this.jEt.setVisibility(8);
    return false;
  }

  public final void onBindView(View paramView)
  {
    z.d("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "on bindView " + paramView.toString());
    this.jEh = paramView.findViewById(com.tencent.mm.i.anV);
    this.jEi = ((Button)paramView.findViewById(com.tencent.mm.i.aol));
    this.jEj = ((Button)paramView.findViewById(com.tencent.mm.i.anE));
    this.jEm = ((Button)paramView.findViewById(com.tencent.mm.i.aon));
    this.jEl = paramView.findViewById(com.tencent.mm.i.aoo);
    this.jEk = ((Button)paramView.findViewById(com.tencent.mm.i.aom));
    this.jEq = ((Button)paramView.findViewById(com.tencent.mm.i.anz));
    this.jEn = paramView.findViewById(com.tencent.mm.i.aob);
    this.jEo = ((Button)paramView.findViewById(com.tencent.mm.i.aoa));
    this.jEp = ((Button)paramView.findViewById(com.tencent.mm.i.aoc));
    this.gGv = ((Button)paramView.findViewById(com.tencent.mm.i.aod));
    this.jEt = ((Button)paramView.findViewById(com.tencent.mm.i.anR));
    this.jEr = ((Button)paramView.findViewById(com.tencent.mm.i.aop));
    this.jEs = ((Button)paramView.findViewById(com.tencent.mm.i.anC));
    this.jEu = ((TextView)paramView.findViewById(com.tencent.mm.i.anS));
    this.hHI = true;
    DP();
    super.onBindView(paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.NormalUserFooterPreference
 * JD-Core Version:    0.6.2
 */