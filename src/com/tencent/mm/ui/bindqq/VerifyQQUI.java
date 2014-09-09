package com.tencent.mm.ui.bindqq;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.c.a.ej;
import com.tencent.mm.c.a.el;
import com.tencent.mm.c.a.em;
import com.tencent.mm.c.a.en;
import com.tencent.mm.i;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public class VerifyQQUI extends MMWizardActivity
  implements com.tencent.mm.o.m
{
  private String cFd;
  private String cFf;
  private cr dWq = null;
  private byte[] dna = null;
  private String hjv = "";
  private SecurityImage iMR = null;
  private String jli = "";
  private String jlj;
  private long jlp = 0L;

  protected final void DP()
  {
    ej localej = new ej();
    localej.cJY.context = this;
    com.tencent.mm.sdk.c.a.aGB().g(localej);
    this.cFd = localej.cJZ.cFd;
    em localem = new em();
    com.tencent.mm.sdk.c.a.aGB().g(localem);
    this.cFf = localem.cKa.cFf;
    oP(n.bxr);
    a(new ah(this));
    EditText localEditText1 = (EditText)findViewById(i.ajk);
    EditText localEditText2 = (EditText)findViewById(i.ajj);
    a(0, getString(n.btB), new ai(this, localEditText1, localEditText2));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpIHRU4Da45B3AN7rAOr54wF", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWq != null)
    {
      this.dWq.dismiss();
      this.dWq = null;
    }
    this.dna = ((com.tencent.mm.p.a)paramx).tW();
    this.jli = ((com.tencent.mm.p.a)paramx).tX();
    if (this.dna != null)
      z.d("!32@/B4Tb64lLpIHRU4Da45B3AN7rAOr54wF", "imgSid:" + this.jli + " img len" + this.dna.length + " " + com.tencent.mm.compatible.g.k.nL());
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.a.a.dWp.hT();
      e.a(aPI(), n.bxo, n.bxp, new ak(this));
      return;
    }
    int i;
    if (paramInt1 == 4)
      switch (paramInt2)
      {
      default:
        com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
        if (locala != null)
        {
          locala.a(this, null, null);
          i = 1;
        }
        break;
      case -4:
      case -3:
      case -12:
      case -72:
      case -5:
      case -6:
      }
    while (i == 0)
    {
      int j = n.bJW;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      Toast.makeText(this, getString(j, arrayOfObject), 0).show();
      return;
      e.b(aPI(), n.bxq, n.bxl);
      i = 1;
      continue;
      e.b(aPI(), n.bxi, n.bxl);
      i = 1;
      continue;
      e.b(aPI(), n.bxk, n.buo);
      i = 1;
      continue;
      e.b(aPI(), n.bxj, n.buo);
      i = 1;
      continue;
      z.d("!32@/B4Tb64lLpIHRU4Da45B3AN7rAOr54wF", "imgSid:" + this.jli + " img len" + this.dna.length + " " + com.tencent.mm.compatible.g.k.nL());
      if (!bg.oE())
      {
        i = 1;
      }
      else
      {
        if (this.iMR == null)
          this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), n.bZc, false, this.dna, this.jli, this.jlj, new al(this), null, new an(this), new ao(this));
        while (true)
        {
          i = 1;
          break;
          z.d("!32@/B4Tb64lLpIHRU4Da45B3AN7rAOr54wF", "imgSid:" + this.jli + " img len" + this.dna.length + " " + com.tencent.mm.compatible.g.k.nL());
          this.iMR.b(false, this.dna, this.jli, this.jlj);
        }
        i = 0;
      }
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bbN;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(144, this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    bg.qX().b(144, this);
  }

  protected void onResume()
  {
    super.onResume();
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.VerifyQQUI
 * JD-Core Version:    0.6.2
 */