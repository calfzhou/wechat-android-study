package com.tencent.mm.ui.setting;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public class SettingsModifyPasswordUI extends MMActivity
  implements m
{
  private ProgressDialog dWT;
  private TextView iRc;
  private TextView iRd;
  private EditText jNB;
  private EditText jNC;
  private String jND;
  private String jNF;

  protected final void DP()
  {
    oP(n.cfZ);
    this.iRd = ((TextView)findViewById(com.tencent.mm.i.aUt));
    this.iRc = ((TextView)findViewById(com.tencent.mm.i.aOA));
    if (bg.qW().oD() == 0)
      this.iRd.setVisibility(8);
    String str1;
    String str2;
    String str3;
    do
    {
      this.jNB = ((EditText)findViewById(com.tencent.mm.i.aPm));
      this.jNC = ((EditText)findViewById(com.tencent.mm.i.aPn));
      a(0, getString(n.btB), new dv(this));
      a(new dx(this));
      return;
      this.iRd.setVisibility(0);
      str1 = com.tencent.mm.model.x.pH();
      if (ap.jb(str1))
      {
        str1 = com.tencent.mm.model.x.pG();
        if (com.tencent.mm.storage.i.yd(str1))
          str1 = null;
      }
      if (!ap.jb(str1))
        break label301;
      str2 = (String)bg.qW().oQ().get(6);
      str3 = (String)bg.qW().oQ().get(5);
      if (ap.jb(str2))
        break;
    }
    while (!ap.ji(str2).booleanValue());
    new be();
    String str4;
    String str5;
    if (str2.startsWith("+"))
    {
      str4 = str2.replace("+", "");
      str5 = be.AT(str4);
      if (str5 != null)
        str4 = str4.substring(str5.length());
    }
    while (true)
    {
      String str6 = be.bC(str5, str4);
      this.iRd.setText(str6);
      break;
      if (!ap.jb(str3))
      {
        this.iRd.setText(str3);
        break;
      }
      this.iRd.setVisibility(8);
      break;
      label301: this.iRd.setText(getString(n.bsF, new Object[] { str1 }));
      break;
      str4 = str2;
      str5 = "86";
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.d("!56@9DU/RFsdGl9EDFTBLJS809y5ryQ3oeBZaKi94/dgaHUeNVGe7WkmKg==", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    if (paramx.getType() == 383)
    {
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bg.qW().oQ().set(3, ap.je(this.jNF));
        bg.qW().oQ().set(19, ap.jf(this.jNF));
        com.tencent.mm.ui.base.e.a(this, n.cfX, n.buo, new dy(this));
      }
    }
    while (true)
    {
      return;
      if (com.tencent.mm.ui.dy.a(aPI(), paramInt1, paramInt2, paramString, 4));
      for (int i = 1; i != 0; i = 0)
        return;
    }
  }

  protected final int getLayoutId()
  {
    return k.bmX;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
    bg.qX().a(383, this);
  }

  public void onDestroy()
  {
    bg.qX().b(383, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsModifyPasswordUI
 * JD-Core Version:    0.6.2
 */