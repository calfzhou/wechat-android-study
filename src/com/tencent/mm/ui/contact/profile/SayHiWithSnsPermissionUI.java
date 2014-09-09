package com.tencent.mm.ui.contact.profile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.ui.tools.av;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class SayHiWithSnsPermissionUI extends MMActivity
  implements m
{
  private ProgressDialog dWT = null;
  private EditText jAU;
  private MMSwitchBtn jEL;
  private CharSequence jEM = null;

  protected final void DP()
  {
    this.jAU = ((EditText)findViewById(i.aMJ));
    this.jEL = ((MMSwitchBtn)findViewById(i.aGu).findViewById(i.checkbox));
    this.jEL.gp(false);
    this.jAU.setFilters(av.hLZ);
    String str1 = (String)bg.qW().oQ().get(294913);
    String str2 = com.tencent.mm.model.x.pI();
    if (str2 == null)
      str2 = "";
    String str3 = getString(n.cem);
    if (str3.length() + str2.length() > 50)
      str2 = str2.substring(0, 50 - str3.length());
    int i = str3.indexOf("%s");
    this.jEM = com.tencent.mm.ar.b.b(aPI(), String.format(str3, new Object[] { str2 }), (int)this.jAU.getTextSize(), false);
    if (ch.jb(str1))
    {
      this.jAU.append(this.jEM);
      if ((i != -1) && (i < this.jEM.length()) && (i + str2.length() <= this.jEM.length()))
        Selection.setSelection(this.jAU.getEditableText(), i, i + str2.length());
    }
    while (true)
    {
      this.jAU.requestFocus();
      aep();
      String str4 = getIntent().getStringExtra("Contact_User");
      int j = getIntent().getIntExtra("Contact_Scene", 9);
      a(0, getString(n.buh), new dx(this, str4, j), cu.iMA);
      a(new dz(this));
      return;
      SpannableString localSpannableString = com.tencent.mm.ar.b.b(aPI(), str1, (int)this.jAU.getTextSize(), false);
      this.jAU.append(localSpannableString);
      Selection.setSelection(this.jAU.getEditableText(), 0, localSpannableString.length());
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    int i = 1;
    z.i("!56@/B4Tb64lLpJYfIea4uyJ4DxeQ3x/nuZkVAwnV8Ld0w53NEDaSOmORQ==", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    try
    {
      if (this.dWT != null)
      {
        this.dWT.dismiss();
        this.dWT = null;
      }
      String str = this.jAU.getText().toString().trim();
      if ((ch.jb(str)) || (str.equals(this.jEM)))
        bg.qW().oQ().set(294913, "");
      else
        bg.qW().oQ().set(294913, str);
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpJYfIea4uyJ4DxeQ3x/nuZkVAwnV8Ld0w53NEDaSOmORQ==", "exception in onSceneEnd : " + localException.getMessage());
      return;
    }
    Toast.makeText(this, n.ceo, 0).show();
    break label259;
    Toast.makeText(this, n.bJR, 0).show();
    label259: 
    while (i == 0)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.ui.base.e.aw(this, getString(n.cep));
        finish();
        return;
      }
      Toast.makeText(this, n.ceo, 0).show();
      return;
      switch (paramInt2)
      {
      case -22:
      case -34:
      case -24:
      }
      i = 0;
    }
  }

  protected final int getLayoutId()
  {
    return k.blR;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(30, this);
    DP();
  }

  public void onDestroy()
  {
    bg.qX().b(30, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.SayHiWithSnsPermissionUI
 * JD-Core Version:    0.6.2
 */