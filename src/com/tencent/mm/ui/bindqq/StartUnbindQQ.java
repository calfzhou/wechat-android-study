package com.tencent.mm.ui.bindqq;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.c.a.q;
import com.tencent.mm.i;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.as;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.cr;

public class StartUnbindQQ extends MMWizardActivity
  implements com.tencent.mm.o.m
{
  private cr dWq;
  private byte[] dna = null;
  private View fKA;
  private TextView fKC;
  private EditText fKD;
  private String hjv;
  private SecurityImage iMR = null;
  private View jkR;
  private aa jlh;
  private String jli = "";
  private String jlj;

  protected final void DP()
  {
    oP(n.cmM);
    this.jkR = findViewById(i.aPc);
    this.fKA = View.inflate(this, com.tencent.mm.k.bmO, null);
    this.fKC = ((TextView)this.fKA.findViewById(i.aOv));
    this.fKC.setText(getString(n.chx));
    this.fKD = ((EditText)this.fKA.findViewById(i.aOu));
    this.fKD.setInputType(129);
    a(new y(this));
    this.jkR.setOnClickListener(new z(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKu4h15rHD1g0K7k5MDokBS", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    if (paramx.getType() == 384)
    {
      this.dna = ((as)paramx).tW();
      this.jli = ((as)paramx).tX();
      if (this.dna != null)
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKu4h15rHD1g0K7k5MDokBS", "imgSid:" + this.jli + " img len" + this.dna.length + " " + com.tencent.mm.compatible.g.k.nL());
      String str3 = ((as)paramx).wm();
      if ((paramInt1 == 0) && (paramInt2 == 0) && (!ch.jb(str3)))
      {
        com.tencent.mm.p.b localb = new com.tencent.mm.p.b(str3);
        bg.qX().d(localb);
      }
    }
    while (true)
    {
      return;
      if (this.dWq != null)
      {
        this.dWq.dismiss();
        this.dWq = null;
      }
      if (paramInt1 == 4);
      switch (paramInt2)
      {
      case -5:
      default:
        com.tencent.mm.d.a locala2 = com.tencent.mm.d.a.ct(paramString);
        if (locala2 != null)
        {
          locala2.a(this, null, null);
          return;
        }
        break;
      case -4:
      case -3:
        com.tencent.mm.ui.base.e.a(this, n.chw, n.buo, null);
        return;
      case -6:
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKu4h15rHD1g0K7k5MDokBS", "imgSid:" + this.jli + " img len" + this.dna.length + " " + com.tencent.mm.compatible.g.k.nL());
        if (!bg.oE())
          continue;
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), n.bZc, false, this.dna, this.jli, this.jlj, new ac(this), null, new ae(this), new af(this));
          return;
        }
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKu4h15rHD1g0K7k5MDokBS", "imgSid:" + this.jli + " img len" + this.dna.length + " " + com.tencent.mm.compatible.g.k.nL());
        this.iMR.b(false, this.dna, this.jli, this.jlj);
        return;
      }
      com.tencent.mm.ui.base.e.a(this, n.chw, n.buo, null);
      return;
      if (paramx.getType() != 253)
        continue;
      if (this.dWq != null)
      {
        this.dWq.dismiss();
        this.dWq = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        int i = ch.a((Integer)bg.qW().oQ().get(9), 0);
        com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpKu4h15rHD1g0K7k5MDokBS", "iBindUin " + i);
        if (i != 0)
          bg.qW().oY().fA(new com.tencent.mm.a.k(i) + "@qqim");
        Object localObject = bg.qW().oQ().get(102407, null);
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          bg.qW().oQ().set(3, localObject);
          bg.qW().oQ().set(102407, null);
        }
      }
      try
      {
        com.tencent.mm.sdk.c.a.aGB().g(new q());
        int j = ch.a((Integer)bg.qW().oQ().get(9), 0);
        String str1 = new com.tencent.mm.a.k(j) + "@qqim";
        bg.qW().oY().fA(str1);
        bg.qW().oT().yz(str1);
        com.tencent.mm.n.af.sJ().fh(str1);
        String str2 = com.tencent.mm.model.x.pG() + "@qqim";
        com.tencent.mm.n.af.sJ().fh(str2);
        com.tencent.mm.n.af.sh().h(str1, false);
        com.tencent.mm.n.af.sh().h(str1, true);
        com.tencent.mm.n.af.sh().h(str2, false);
        com.tencent.mm.n.af.sh().h(str2, true);
        com.tencent.mm.plugin.a.a.dWp.hT();
        label830: bg.qW().oQ().set(9, Integer.valueOf(0));
        mk localmk = new mk();
        localmk.cPe.cPf = false;
        localmk.cPe.cPg = true;
        com.tencent.mm.sdk.c.a.aGB().g(localmk);
        finish();
        com.tencent.mm.d.a locala1 = com.tencent.mm.d.a.ct(paramString);
        if (locala1 == null)
          continue;
        locala1.a(this, null, null);
        return;
      }
      catch (Exception localException)
      {
        break label830;
      }
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.boy;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(384, this);
    bg.qX().a(253, this);
  }

  public void onDestroy()
  {
    bg.qX().b(384, this);
    bg.qX().b(253, this);
    super.onDestroy();
  }

  protected void onResume()
  {
    super.onResume();
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.StartUnbindQQ
 * JD-Core Version:    0.6.2
 */