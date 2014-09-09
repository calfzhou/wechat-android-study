package com.tencent.mm.ui.bindlinkedin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.bj;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class BindLinkedInUI extends MMActivity
  implements m
{
  private String cUl;
  private String cUm;
  private ProgressDialog esI;
  private boolean jiT = false;
  private String jiU;
  private boolean jiV = false;
  private boolean jiW = false;
  private boolean jiX = false;
  private Bundle jiY;
  private boolean jiZ = false;
  private boolean jja = false;
  private TextView jjb;
  private TextView jjc;
  private View jjd;
  private MMSwitchBtn jje;
  private TextView jjf;
  private TextView jjg;
  private TextView jjh;
  private String jji;
  private String jjj;
  private String jjk;
  private String jjl;
  private String name;
  private int status;

  private void Cb(String paramString)
  {
    int i = getString(com.tencent.mm.n.bBL).indexOf("%s");
    String str = getString(com.tencent.mm.n.bBL, new Object[] { paramString });
    Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(str);
    localSpannable.setSpan(new q(this), i, i + paramString.length(), 33);
    this.jjb.setText(localSpannable);
  }

  private void Mg()
  {
    boolean bool1 = true;
    if ((this.jiW) && (this.jiY == null))
    {
      z.e("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "bindBundle is null");
      return;
    }
    if (this.jiX)
    {
      b(this.jiT, false, this.name, this.jiV);
      return;
    }
    if (this.jiW)
    {
      if ((this.jiT) && (this.jiU.equals(this.cUl)));
      boolean bool2;
      while (true)
      {
        String str = this.cUm;
        bool2 = this.jiV;
        this.jjb.setVisibility(0);
        Cb(str);
        this.jjd.setVisibility(0);
        this.jjg.setVisibility(8);
        if (!bool1)
          break;
        this.jjc.setVisibility(8);
        this.jjf.setVisibility(8);
        this.jjh.setVisibility(8);
        this.jje.gp(bool2);
        this.jje.a(new r(this));
        return;
        bool1 = false;
      }
      this.jjc.setVisibility(0);
      this.jjf.setVisibility(0);
      this.jjh.setVisibility(0);
      this.jje.gp(bool2);
      this.jje.a(new b(this));
      return;
    }
    b(this.jiT, bool1, this.name, this.jiV);
  }

  private void b(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    this.jjh.setVisibility(8);
    if (paramBoolean1)
    {
      this.jjc.setVisibility(8);
      this.jjb.setVisibility(0);
      Cb(paramString);
      this.jjd.setVisibility(0);
      this.jjf.setVisibility(8);
      if (paramBoolean2)
        this.jjg.setVisibility(0);
      this.jje.gp(paramBoolean3);
      this.jje.a(new c(this));
      return;
    }
    this.jjb.setVisibility(8);
    this.jjb.setText(getString(com.tencent.mm.n.bBM));
    this.jjc.setVisibility(0);
    this.jjd.setVisibility(8);
    this.jjf.setVisibility(0);
    this.jjg.setVisibility(8);
  }

  private void fe(boolean paramBoolean)
  {
    if (this.jiY == null)
    {
      z.e("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "bindBundle is null !!");
      return;
    }
    if (this.jje.bcq());
    for (int i = 1; ; i = 2)
    {
      com.tencent.mm.aa.a locala = new com.tencent.mm.aa.a(i, this.cUl, this.cUm, "", this.jji, this.jjj, this.jjk, this.jjl);
      if (!paramBoolean)
        this.esI = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.aAy), false, new p(this, locala));
      com.tencent.mm.model.bg.qX().d(locala);
      return;
    }
  }

  private void goBack()
  {
    if (this.jiW)
    {
      if (this.jja)
      {
        Intent localIntent = com.tencent.mm.plugin.a.a.dWo.k(this);
        localIntent.addFlags(603979776);
        localIntent.putExtra("preferred_tab", 2);
        startActivity(localIntent);
        return;
      }
      setResult(-1);
      finish();
      return;
    }
    setResult(-1);
    finish();
  }

  private void initData()
  {
    boolean bool1 = true;
    this.jiU = ((String)com.tencent.mm.model.bg.qW().oQ().get(286721));
    boolean bool2;
    if (!ch.jb(this.jiU))
    {
      bool2 = bool1;
      this.jiT = bool2;
      this.name = ((String)com.tencent.mm.model.bg.qW().oQ().get(286722));
      this.status = com.tencent.mm.model.x.pK();
      if ((0x400000 & this.status) == 0)
        break label86;
    }
    while (true)
    {
      this.jiV = bool1;
      return;
      bool2 = false;
      break;
      label86: bool1 = false;
    }
  }

  private void x(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.status = (0x400000 | this.status);
      if (!paramBoolean1)
        break label110;
    }
    label110: for (int i = 1; ; i = 2)
    {
      com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(this.status));
      if (paramBoolean2)
      {
        je localje = new je();
        localje.iad = 33;
        localje.iae = i;
        com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
        com.tencent.mm.plugin.a.a.dWp.hT();
      }
      return;
      this.status = (0xFFBFFFFF & this.status);
      break;
    }
  }

  protected final void DP()
  {
    if (this.jiW)
      oP(com.tencent.mm.n.bBW);
    while (true)
    {
      this.jjb = ((TextView)findViewById(i.aOM));
      this.jjc = ((TextView)findViewById(i.aON));
      this.jjd = findViewById(i.aQj);
      this.jje = ((MMSwitchBtn)findViewById(i.aQi));
      this.jjf = ((TextView)findViewById(i.aiH));
      this.jjg = ((TextView)findViewById(i.aTT));
      this.jjh = ((TextView)findViewById(i.akx));
      this.jjb.setOnClickListener(new f(this));
      this.jjf.setOnClickListener(new g(this));
      this.jjg.setOnClickListener(new j(this));
      this.jjh.setOnClickListener(new n(this));
      a(new o(this));
      Mg();
      return;
      if (this.jiX)
        oP(com.tencent.mm.n.bBY);
      else
        oP(com.tencent.mm.n.bBQ);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (this.esI != null)
    {
      this.esI.dismiss();
      this.esI = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      int i;
      if (paramx.getType() == 549)
        if (paramInt2 == 1)
          i = com.tencent.mm.n.bBU;
      while (true)
      {
        com.tencent.mm.ui.base.e.o(this, getString(i), null);
        do
        {
          return;
          i = com.tencent.mm.n.bBT;
          break;
        }
        while (paramx.getType() != 550);
        i = com.tencent.mm.n.bBV;
      }
    }
    int j;
    if (paramx.getType() == 549)
    {
      this.jja = true;
      if (!this.jiZ)
        j = com.tencent.mm.n.bBR;
    }
    while (true)
    {
      String str = getString(j);
      new e(this);
      com.tencent.mm.ui.base.e.aw(this, str);
      initData();
      this.jiV = this.jje.bcq();
      Mg();
      return;
      j = com.tencent.mm.n.bBS;
      continue;
      if (paramx.getType() != 550)
        break;
      j = com.tencent.mm.n.bBZ;
      az.CG().clear();
    }
  }

  protected final int getLayoutId()
  {
    return k.bbF;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    z.d("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if (paramIntent == null)
      return;
    switch (paramInt1)
    {
    default:
      z.e("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "onActivityResult unknow request");
      return;
    case 100:
    }
    Bundle localBundle = paramIntent.getBundleExtra("result_data");
    String str1 = localBundle.getString("ret");
    String str2 = localBundle.getString("limid");
    String str3 = localBundle.getString("liname");
    String str4 = localBundle.getString("liurl");
    String str5 = localBundle.getString("liswitch");
    if (ch.jb(str1))
    {
      z.e("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "linkedin oauth ret is null, maybe canceled");
      return;
    }
    int k = ch.xy(str1);
    if (k != 0)
    {
      Object[] arrayOfObject2 = new Object[i];
      arrayOfObject2[0] = Integer.valueOf(k);
      z.e("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "linkedin oauth bind failed ret %s ", arrayOfObject2);
      if (k == i);
      for (int m = com.tencent.mm.n.bBU; ; m = com.tencent.mm.n.bBT)
      {
        com.tencent.mm.ui.base.e.o(this, getString(m), null);
        return;
      }
    }
    if (ch.jb(str2))
    {
      z.e("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "linkedin member id is null");
      return;
    }
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = str2;
    arrayOfObject1[i] = str3;
    arrayOfObject1[2] = str4;
    arrayOfObject1[3] = str5;
    z.d("!32@/B4Tb64lLpKzHIkXYjmfXc63BE0upClU", "%s, %s, %s, %s", arrayOfObject1);
    com.tencent.mm.model.bg.qW().oQ().set(286722, str3);
    com.tencent.mm.model.bg.qW().oQ().set(286721, str2);
    com.tencent.mm.model.bg.qW().oQ().set(286723, str4);
    if (!ch.jb(str5))
      if (ch.xy(str5) != i)
        break label375;
    while (true)
    {
      x(i, false);
      initData();
      Mg();
      String str6 = getString(com.tencent.mm.n.bBR);
      new d(this);
      com.tencent.mm.ui.base.e.aw(this, str6);
      return;
      label375: int j = 0;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.model.bg.qX().a(549, this);
    com.tencent.mm.model.bg.qX().a(550, this);
    this.jiY = getIntent().getBundleExtra("qrcode_bundle");
    if (this.jiY != null);
    for (boolean bool = true; ; bool = false)
    {
      this.jiW = bool;
      if (this.jiY != null)
      {
        this.cUl = this.jiY.getString("i");
        this.cUm = this.jiY.getString("n");
        this.jji = this.jiY.getString("t");
        this.jjj = this.jiY.getString("o");
        this.jjk = this.jiY.getString("s");
        this.jjl = this.jiY.getString("r");
        if ((this.cUl == null) || (this.cUm == null) || (this.jji == null) || (this.jji == null) || (this.jjk == null) || (this.jjl == null))
          com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.bBO), null, false, new a(this));
      }
      this.jiX = getIntent().getBooleanExtra("oversea_entry", false);
      initData();
      if (this.jiW)
        this.jiV = true;
      DP();
      if ((this.jiY != null) && (this.jiT) && (this.jiU.equals(this.cUl)))
      {
        this.jiZ = true;
        fe(true);
      }
      return;
    }
  }

  protected void onDestroy()
  {
    com.tencent.mm.model.bg.qX().b(550, this);
    com.tencent.mm.model.bg.qX().b(549, this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.BindLinkedInUI
 * JD-Core Version:    0.6.2
 */